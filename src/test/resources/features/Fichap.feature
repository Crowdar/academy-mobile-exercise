Feature: Como user quiero usar fichap para entrar, abrir un horario, y agregar un motivo a algún día


  Scenario Outline: El cliente inicia la applicacion Fichap, inicia una jornada, finaliza una jornada y cierra sesión
    #Given El cliente acepta los permisos de la aplicación Reemplazado por capability que acepta los servicios de manera autom
    When  El cliente ingresa '<email>' y '<password>'
    And   El cliente acepta el aviso de camara
    And   El cliente se saca una foto
    Then  El cliente ingresa correctamente al HOME

    When  El cliente presiona el boton COMENZAR JORNADA
    And   El cliente se saca una foto
    And   El cliente reporta el error
    And   El cliente presiona el boton COMENZAR JORNADA
    And   El cliente presiona el boton FIN JORNADA
    And   El cliente presiona el boton ACEPTAR FIN JORNADA
    And   El cliente presiona el boton TERMINAR
    Then  El cliente ingresa correctamente al HOME

    When  El cliente presiona el boton MENU DESPLEGABLE
    And   El cliente presiona el boton CERRAR SESIÓN
    And   El cliente presiona el boton ACEPTAR
    Then  El cliente ingresa correctamente al LOGIN


    @Fichap @CheckInCheckOut @Regresion @Demo
    Examples:
      | email                            | password |
      | cristian_palmero2001@hotmail.com | EHzDKN   |

  Scenario Outline: El cliente inicia la applicacion Fichap, genera una solicitud, desloguea
    #Given El cliente acepta los permisos de la aplicación
    When  El cliente ingresa '<email>' y '<password>'
    And   El cliente acepta el aviso de camara
    And   El cliente se saca una foto
    Then  El cliente ingresa correctamente al HOME

    When  El cliente presiona el boton MENU DESPLEGABLE
    And   El cliente ingresa correctamente a la sección SOLICITUDES
    And   El cliente selecciona '<day>', '<month>', '<year>'
    And   El cliente ingresa1 '<motivo>'
    And   El cliente presiona el boton ENVIAR SOLICITUD
    And   El cliente acepta enviar la solicitud
    Then  El cliente realizo correctamente su solicitud
    And   El cliente presiona el boton OK

    When  El cliente presiona el boton MENU DESPLEGABLE
    And   El cliente presiona el boton CERRAR SESIÓN
    And   El cliente presiona el boton ACEPTAR
    Then  El cliente ingresa correctamente al LOGIN


    @Fichap @Solicitud
    Examples:
      | email                            | password | motivo       | day | month     | year |
      | cristian_palmero2001@hotmail.com | EHzDKN   | Lorem ipsum  | 14  | Noviembre | 2020 |
      #| cristian_palmero2001@hotmail.com | EHzDKN   | Lorem ipsum1 | 25  | Diciembre | 2020 |
      #| cristian_palmero2001@hotmail.com | EHzDKN   | Lorem ipsum2 | 30  | Enero     | 2021 |

  Scenario Outline: El cliente inicia la applicacion Fichap, inicia una jornada, el cliente finaliza una jornada
    #Given El cliente acepta los permisos de la aplicación
    When  El cliente ingresa '<email>' y '<password>'
    And   El cliente acepta el aviso de camara
    And   El cliente se saca una foto
    Then  El cliente ingresa correctamente al HOME

    When  El cliente presiona el boton MENU DESPLEGABLE
    And   El cliente ingresa correctamente a la sección PERFIL
    And   El cliente modifica '<name>', '<lastname>', '<newEmail>', '<domicilio>', '<dni>', '<cellphone>'
    And   El cliente presiona el boton GUARDAR
    Then  Los datos se actualizaron con éxito
    And   El cliente presiona el boton OK

    When  El cliente presiona el boton MENU DESPLEGABLE
    And   El cliente ingresa correctamente a la sección CONTRASEÑA
    And   El cliente ingresa '<newPass>', '<newPassRepeat>'
    And   El cliente presiona el boton GUARDAR
    Then  El cambio de contraseña fue exitoso
    And   El cliente presiona el boton OK

    When  El cliente presiona el boton MENU DESPLEGABLE
    And   El cliente presiona el boton CERRAR SESIÓN
    And   El cliente presiona el boton ACEPTAR
    Then  El cliente ingresa correctamente al LOGIN



    @Fichap @Perfil_Cambio_Pass @Regresion
    Examples:
      | email                            | password | name    | lastname | newEmail         | domicilio                | newPass | newPassRepeat | dni       | cellphone  |
      | cristian_palmero2001@hotmail.com | EHzDKN   | Juanito | Gomez    | prueba@gmail.com | Avenida Siempre Viva 123 | EHzDKN  | EHzDKN        | 123456789 | 2613500289 |



