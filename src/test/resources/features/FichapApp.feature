Feature: Como usuario de Fichap, quiero ingresar a la aplicacion para interactuar con las diferentes funcionalidades

  @Fichap
  Scenario Outline: El usuario inicia sesion, se toma una foto, comienza jornada laboral, realiza una solicitud, modifica el perfil, finaliza jornada laboral y cierra sesion
    Given la aplicacion carga correctamente
    When completa datos de login con email <email> y password <pass>
    And clickea el boton Iniciar Sesion
    Then visualiza el mensaje 'Aviso'

    When clickea el boton Aceptar
    And realiza una foto
    Then es redirigido a la pantalla Fichar

    When clickea el boton Comenzar Jornada
    Then es redirigido a la pantalla Camara

    When realiza una foto
    Then visualiza el mensaje 'Ocurrió un error'

    When clickea el boton Reportar
    Then visualiza el mensaje 'Reporte Exitoso'

    When clickea el boton Comenzar Jornada
    Then es redirigido a la pantalla Recorrido

    When clickea el boton Menu
    Then es redirigido a la pantalla Menu

    When clickea el boton Solicitudes
    Then es redirigido a la pantalla Solicitudes

    When selecciona la fecha con el dia <diaSolicitud>, mes <mesSolicitud> y año <añoSolicitud>
    And escribe el motivo de la solicitud <motivoSolicitud>
    And clickea el boton Enviar Solicitud
    And visualiza el mensaje '¿Enviar solicitud?'
    And clickea el boton Ok
    And visualiza el mensaje 'Solicitud Registrada'
    And clickea el boton Ok
    Then es redirigido a la pantalla Recorrido

    When clickea el boton Menu
    And clickea el boton Perfil
    Then es redirigido a la pantalla Mi Perfil

    When ingresa sus datos personales Nombre <nombre>, Apellido <apellido>, DNI <dni>, Telefono <telefono> y Direccion <direccion>
    And clickea el boton Guardar
    And visualiza el mensaje 'Los datos se actualizaron con éxito'
    And clickea el boton Ok
    And clickea el boton Menu
    And clickea el boton Fichar
    Then es redirigido a la pantalla Recorrido

    When clickea el boton Fin
    And visualiza el mensaje 'Finalizar Jornada'
    And clickea el boton Ok
    And clickea el boton Terminar
    Then es redirigido a la pantalla Fichar

    When clickea el boton Menu
    And clickea el boton Cerrar Sesion
    And visualiza el mensaje '¿Está seguro que desea cerrar sesión?'
    And clickea el boton Aceptar
    Then es redirigido a la pantalla Login

    Examples:
      |        email         |  pass  |nombre |apellido|  dni   | telefono |     direccion     |  diaSolicitud  |mesSolicitud|añoSolicitud|   motivoSolicitud   |
      |gonza_2208@hotmail.com| 123456 |Gonzalo|Soriano |39767434|2604586689|Calle Corrientes 92|      17        | Noviembre  |    2020    |      Tramite123456456        |