package com.crowdar.examples.steps;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginConstants;
import com.crowdar.examples.constants.MenuConstants;
import com.crowdar.examples.services.HomeService;
import com.crowdar.examples.services.LoginService;
import com.crowdar.examples.services.MenuService;
import com.crowdar.examples.services.TravelService;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MenuSteps {


    @When("Cierra Sesion")
    public void cierraSesion() {
        TravelService.OpenMenu();
        MenuService.closeSession();
    }

    @Then("Vuelve a la pantalla login")
    public void vuelveALaPantallaLogin() {
        LoginService.isViewLoaded();
    }
}
