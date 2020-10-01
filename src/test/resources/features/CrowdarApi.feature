Feature: Como user quiero usar fichap para entrar, abrir un horario, y agregar un motivo a algún día

  @Smoke @FichapApk @CheckInCheckOut
  Scenario Outline: The client starts the applicacion ApiDemos accesing to Bouncing Balls
    Given La app es cargada correctamente
    When El user carga su '<email>' y su '<pw>'
    And Acepta el aviso
    And Saca una foto
    And Hace click en Comenzar Jornada
    And Saca una foto
    And Acepta el Error
    And Comienza la Jornada de la ventana de reporte
    And Finaliza la Jornada
    And Acepta finalizar la jornada
    And Hace click en Terminar
    And abre el menu
    And Hace click en Cerrar Sesión
    And Acepta Cerrar Sesión

    Examples:
    | email               | pw      |
    | kd.maurii@gmail.com | D3b8Be  |


  @Smoke @FichapApk @CheckInCheckOut
  Scenario Outline: The client starts the applicacion ApiDemos accesing to Bouncing Balls
    Given La app es cargada correctamente
    When El user carga su '<email>' y su '<pw>'
    And Acepta el aviso
    And Saca una foto
    And Hace click en Comenzar Jornada
    And Saca una foto
    And Acepta el Error
    And Comienza la Jornada de la ventana de reporte
    And Finaliza la Jornada
    And Acepta finalizar la jornada
    And Hace click en Terminar
    And abre el menu
    And Hace click en Cerrar Sesión
    And Acepta Cerrar Sesión

    Examples:
    | email               | pw      |
    | kd.maurii@gmail.com | D3b8Be  |
