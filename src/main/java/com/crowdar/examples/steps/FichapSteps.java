package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.LoginFichapService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class FichapSteps extends PageSteps {


    @Given("La aplicacion inicia correctamente")
    public void laAplicacionIniciaCorrectamente() {
        LoginFichapService.VerificarPantalla();
    }

    @When("El usuario inicia sesion con sus credenciales: '(.*)', '(.*)'")
    public void elUsuarioIniciaSesionConSusCredencialesEmailPassword(String email, String password) {
        LoginFichapService.Loguearse(email, password);
    }

    @Then("El usuario esta en la pantalla Home")
    public void elUsuarioEstaEnLaPantallaHome() {
        LoginFichapService.tomarFoto();
    }

    @And("el usuario modifica datos de perfil: '(.*)', '(.*)'(.*)'")
    public void elUsuarioModificaDatosDePerfilNombreApellidoDireccion(String nombre, String apellido, String direccion) {
        LoginFichapService.abrirMenu();
        LoginFichapService.modificarPerfil(nombre,apellido,direccion);
    }
}
