Feature: Como user quiero usar fichap para entrar, abrir un horario, y agregar un motivo a algún día

  #@Smoke @FichapApk @CheckInCheckOut
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
    And Abre el menu
    And Hace click en Cerrar Sesión
    And Acepta Cerrar Sesión
    Then El cliente verifica que está en la pantalla de inicio de sesión

    Examples:
    | email               | pw      |
    | kd.maurii@gmail.com | D3b8Be  |


  #@FichapApk @CambioDomicilioPasswordConJornada
  Scenario Outline: The client starts the applicacion ApiDemos accesing to Bouncing Balls
    Given La app es cargada correctamente
    When El user carga su '<email>' y su '<pw>'
    And Acepta el aviso
    And Saca una foto
    And Hace click en Comenzar Jornada
    And Saca una foto
    And Acepta el Error
    And Comienza la Jornada de la ventana de reporte

    And Abre el menu
    And Hace click en Perfil
    And Cambia su direccion por '<direccion>'
    And Abre el menu
    And Hace click en Password
    And Cambia su password por '<pw>'

    And Abre el menu desde Password
    And Hace click en Fichar
    And Finaliza la Jornada
    And Acepta finalizar la jornada
    And Hace click en Terminar
    And Abre el menu
    And Hace click en Cerrar Sesión
    And Acepta Cerrar Sesión
    Then El cliente verifica que está en la pantalla de inicio de sesión

    Examples:
    | email               | pw      | direccion       |
    | kd.maurii@gmail.com | D3b8Be  | Calle falsa 123 |


  @FichapApk @CambioDomicilioPassword
  Scenario Outline: The client starts the applicacion ApiDemos accesing to Bouncing Balls
    Given La app es cargada correctamente
    When El user carga su '<email>' y su '<pw>'
    And Acepta el aviso
    And Saca una foto

    And Abre el menu
    And Hace click en Perfil
    And Cambia su direccion por '<direccion>'
    And Abre el menu
    And Hace click en Password
    And Cambia su password por '<pw>'

    And Abre el menu
    And Hace click en Cerrar Sesión
    And Acepta Cerrar Sesión
    Then El cliente verifica que está en la pantalla de inicio de sesión

    Examples:
    | email               | pw      | direccion       |
    | kd.maurii@gmail.com | D3b8Be  | Calle falsa 123 |


  #@FichapApk @SolicitudConFechaMotivo
  Scenario Outline: The client starts the applicacion ApiDemos accesing to Bouncing Balls
    Given La app es cargada correctamente
    When El user carga su '<email>' y su '<pw>'
    And Acepta el aviso
    And Saca una foto

    And Abre el menu
    And Hace click en Solicitudes
    And Elige como fecha el '<dia>' del '<mes>' del '<año>'
    And Pone un '<motivo>'
    And Hace clic en Enviar Solicitud
    And Acepta Enviar la Solicitud

    And Abre el menu
    And Hace click en Cerrar Sesión
    And Acepta Cerrar Sesión
    Then El cliente verifica que está en la pantalla de inicio de sesión

    Examples:
    | email               | pw      | dia | mes   | año   | motivo                |
    | kd.maurii@gmail.com | D3b8Be  | 1   | Enero | 2021  | Turno con el médico   |


  #@FichapApk @SolicitudConFechaMotivoConJornada
  Scenario Outline: The client starts the applicacion ApiDemos accesing to Bouncing Balls
    Given La app es cargada correctamente
    When El user carga su '<email>' y su '<pw>'
    And Acepta el aviso
    And Saca una foto
    And Hace click en Comenzar Jornada
    And Saca una foto
    And Acepta el Error
    And Comienza la Jornada de la ventana de reporte

    And Abre el menu
    And Hace click en Solicitudes
    And Elige como fecha el '<dia>' del '<mes>' del '<año>'
    And Pone un '<motivo>'
    And Hace clic en Enviar Solicitud
    And Acepta Enviar la Solicitud

    And Abre el menu
    And Hace click en Fichar
    And Finaliza la Jornada
    And Acepta finalizar la jornada
    And Hace click en Terminar
    And Abre el menu
    And Hace click en Cerrar Sesión
    And Acepta Cerrar Sesión
    Then El cliente verifica que está en la pantalla de inicio de sesión

    Examples:
    | email               | pw      | dia | mes   | año   | motivo                |
    | kd.maurii@gmail.com | D3b8Be  | 1   | Enero | 2021  | Turno con el médico   |
