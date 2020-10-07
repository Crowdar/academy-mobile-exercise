Feature: Como cliente quiero ingresar a la app, loguearme, modificar datos personales, comenzar la jornada, solicitar fechas y motivos
  cambiar password y cerrar sesion

  Scenario Outline: User Testing
    Given La app se muestra correctamente
    When el user ingresa sus credenciales: '<email>', '<password>'
    Then home page is displayed
    And el user ingresa al submenu
    And el user modifica sus datos: '<nombre>', '<apellido>', '<dni>', '<celular>', '<correo>', '<direccion>'
    And el user comienza la jornada
    And el usuario finaliza el trabajo
    And selecciona '<day>', '<month>', '<year>' y envia el '<motivo>'
    And el user cambia de '<newpassword>' y '<repeatpassword>'
    And el usario cierra sesión

    @Fichap
    Examples:
      | email                        | password   | nombre | apellido | dni     | celular    | correo                       | direccion | newpassword | repeatpassword | day | month     | year | motivo   |
      | gustavo.urielfunes@gmail.com | Bayern2012 | Jose   | Damian   | 4512287 | 2612737892 | gustavo.urielfunes@gmail.com | Italia 87 | Bayern2013  | Bayern2013     | 15  | Diciembre | 2020 | new user |
