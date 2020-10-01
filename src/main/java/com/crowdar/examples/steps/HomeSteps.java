package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.services.CameraService;
import com.crowdar.examples.services.HomeService;
import com.crowdar.examples.services.TravelService;
import cucumber.api.java.en.Then;
import io.cucumber.java.en.When;

/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class HomeSteps extends PageSteps {

    @Then("Home page is displayed")
    public void isHomePageVisible() {
        HomeService.isViewLoaded();
    }

    @When("El cliente inicia su jornada")
    public void elClienteIniciaSuJornada() {
        HomeService.startWorkingDay();
        CameraService.takePicture();
        TravelService.startWorkingDay();
    }

    @Then("Accede a la pantalla de recorrido")
    public void accedeALaPantallaDeRecorrido() {
        TravelService.isViewLoaded();
    }

    @When("El cliente cierra su jornada")
    public void elClienteCierraSuJornada() {
        TravelService.finnishWorkingDay();
    }

    @Then("Vuelve a la pantalla principal")
    public void vuelveALaPantallaPrincipal() {
        HomeService.isViewLoaded();
    }
}
