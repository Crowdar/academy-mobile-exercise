Feature: Como cliente de Fichap quiero loguearme, modificar los datos de mi perfil, comenzar y finalizar
  jornada, cambiar contraseña y cerrar sesion


  @Login
  Scenario Outline: El usuario se loguea, modifica los datos de perfil, comienza y finaliza jornada, cambia contraseña y cierra sesion
    Given La aplicacion inicia correctamente
    When El usuario inicia sesion con sus credenciales: '<email>', '<password>'
    Then El usuario esta en la pantalla Home
    And el usuario modifica datos de perfil: '<nombre>', '<apellido>', '<direccion>'



    Examples:
      | email               | password | nombre   | apellido   | direccion    |
      | mmaca75@hotmail.com | RfWTKW   | Macarena | Fernnandez | Aconcagua 77 |



     #And el usuario comienza la jornada
    #And el usuario finaliza el trabajo
    #And selecciona fechas y envia el '<motivo>'
    #And el user cambia de '<pass>' y '<pass2>'
    #And el usario cierra sesión