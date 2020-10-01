Feature: Como cliente de la aplicacion quiero interactuar con la misma.

  Scenario Outline: Inicio sesion para realizar una jornada
    Given La app esta corectamente cargada
    When El cliente ingresa <email> y <password> para loguearse
    Then Se accede a la pantalla principal

    Examples:
    | email                | password |
    | dminguez33@gmail.com | GkhncC   |

