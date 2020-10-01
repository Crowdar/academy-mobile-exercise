package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.CameraConstants;
import com.crowdar.examples.constants.LoginConstants;
import com.crowdar.examples.services.CameraService;
import com.crowdar.examples.services.HomeService;
import com.crowdar.examples.services.LoginService;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends PageSteps {


    @Given("La app esta corectamente cargada")
    public void laAppEstaCorectamenteCargada() {
        LoginService.isViewLoaded();
    }

    @When("El cliente ingresa (.*) y (.*) para loguearse")
    public void elClienteIngresaEmailYPasswordParaLoguearse(String email, String pass) {
        LoginService.doLogin(email, pass);
        CameraService.takeFirstPicture();
    }

    @Then("Se accede a la pantalla principal")
    public void seAccedeALaPantallaPrincipal() {
        HomeService.isViewLoaded();
    }
}
