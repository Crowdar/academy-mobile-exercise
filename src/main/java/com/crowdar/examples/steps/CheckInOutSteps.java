package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.ButtonService;
import com.crowdar.examples.services.HomeService;
import com.crowdar.examples.services.LoginService;
import com.crowdar.examples.services.ProfileService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class CheckInOutSteps extends PageSteps {

    @Then("El cliente ingresa correctamente al HOME")
    public void elClienteIngresaCorrectamenteAlHOME(){
        HomeService.verifyHome();
    }

    @When("El cliente presiona el boton (.*)")
    public void elClientePresionaElBotonCOMENZARJORNADA(String button) {
        ButtonService.clickAnyButton(button);
    }

    @Then("El cliente ingresa correctamente al LOGIN")
    public void elClienteIngresaCorrectamenteAlLOGIN() {
        LoginService.verifyLogin();
    }
}
