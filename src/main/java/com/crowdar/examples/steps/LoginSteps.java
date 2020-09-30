package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.SignInService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginSteps extends PageSteps {
    @Given("la aplicacion carga correctamente")
    public void AplicacionCargaCorrectamente() {
        SignInService.isViewLoaded();
    }

    @When("completa datos de login con email (.*) y password (.*)")
    public void completarDatosDeLogin(String email, String pass) {
        SignInService.completeLoginFields(email, pass);
    }

}
