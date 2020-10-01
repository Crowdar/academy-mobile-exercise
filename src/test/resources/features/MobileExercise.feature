Feature: Como cliente de la aplicacion quiero interactuar con la misma.

  @Mobile
  Scenario Outline: Inicio sesion para realizar una jornada
    When El cliente ingresa <email> y <password> para loguearse
    Then Se accede a la pantalla principal

    When El cliente inicia su jornada
    Then Accede a la pantalla de recorrido

    When El cliente cierra su jornada
    Then Vuelve a la pantalla principal

    When Cierra Sesion
    Then Vuelve a la pantalla login


    Examples:
    | email                | password |
    | dminguez33@gmail.com | GkhncC   |

