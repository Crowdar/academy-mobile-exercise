package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginConstants;
import com.crowdar.examples.services.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class LoginSteps extends PageSteps {

    @Given("The app is loaded correctly")
    @Then("Login page is displayed")
    public void isLoginPageVisible() {
        LoginService.isViewLoaded();
    }

    @When("The user goes to the Sign Up page")
    public void goToSignUp() {
        MobileActionManager.click(LoginConstants.SIGN_UP_BUTTON_LOCATOR);
    }

    @When("The user logs in the application with: (.*), (.*)")
    public void doLoginProcess(String email, String password) {
        LoginService.doLogin(email, password);
    }


    //-------------Fichap--------------//
    @Given("La app se muestra correctamente")
    public void laAppSeMuestraCorrectamente() {
        FichapLoginService.isViewLoaded();
    }

    @When("el user ingresa sus credenciales: '(.*)', '(.*)'")
    public void elUserIngresaSusCredenciales(String email, String password) {
        FichapLoginService.hacerLogin(email, password);
    }

    @Then("home page is displayed")
    public void homePageIsDisplayed() {
        FichapCamaraService.validarMensaje();
        FichapCamaraService.sacarFoto();
    }

    @And("el user comienza la jornada")
    public void elUserComienzaLaJornada() {
        JornadaStartService.startJob();
    }

    @And("el usuario finaliza el trabajo")
    public void elUsuarioFinalizaElTrabajo() {
        JornadaStartService.finalJob();
    }

    @And("el user ingresa al submenu")
    public void elUserIngresaAlSubmenu() {
        ModificacionData.accedoSubMenu();
        SesionClose.btnCloseSesion();
        //CambioPassService.accedoPassword();
        //SolicitudService.accedoSolicitud();
        //ModificacionData.accedoPerfil();
        //ModificacionData.validoMenuPerfil();
    }


    @And("selecciona '(.*)', '(.*)', '(.*)' y envia el '(.*)'")
    public void seleccionaDayMonthYearYEnviaElMotivo(String day, String month, String year, String motivo) {
        SolicitudService.seleccionoFechas(day,month,year);
        SolicitudService.envioMotivo(motivo);
    }


    @And("el usario cierra sesión")
    public void elUsarioCierraSesión() {
        SesionClose.validateCloseSesion();
    }

    @And("el user cambia de '(.*)' y '(.*)'")
    public void elUserCambiaDeNewpasswordYRepeatpassword(String newPassword, String repeatPassword) {
        CambioPassService.changePass(newPassword,repeatPassword);
    }

    @And("el user modifica sus datos: '(.*)', '(.*)', '(.*)', '(.*)', '(.*)', '(.*)'")
    public void elUserModificaSusDatosNombreApellidoTelFijoCelularCorreoDireccion(String nombre,String apellido,String dni,String celular,String correo, String direccion) {
        ModificacionData.guardoData(nombre,apellido,dni,celular,correo,direccion);
    }

}
