Feature: Como cliente quiero ingresar a la app, loguearme, modificar datos personales, comenzar la jornada, solicitar fechas y motivos
  cambiar password y cerrar sesion

  Scenario Outline: User Testing
    Given La app se muestra correctamente
    When el user ingresa sus credenciales: '<email>', '<password>'
    Then home page is displayed
    And el user ingresa al submenu
    #And el user modifica sus datos: '<nombre>', '<apellido>', '<dni>', '<celular>', '<correo>', '<direccion>'
    #And el user comienza la jornada
    #And el usuario finaliza el trabajo
    #And selecciona fechas y envia el '<motivo>'
    #And el user cambia de '<newpassword>' y '<repeatpassword>'
    And el usario cierra sesión

    @Fichap
    Examples:
      | email                        | password   | nombre | apellido | dni     | celular    | correo                       | direccion | motivo   | newpassword | repeatpassword |
      | gustavo.urielfunes@gmail.com | Bayern2012 | Dario  | Perez    | 4812287 | 2612737994 | gustavo.urielfunes@gmail.com | Italia 54 | add user | Bayern2012  | Bayern2012     |
