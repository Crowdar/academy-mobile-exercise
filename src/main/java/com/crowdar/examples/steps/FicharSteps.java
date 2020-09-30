package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.RecorridoService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class FicharSteps extends PageSteps {
    @And("clickea el boton (.*)")
    public void clickearBoton(String button) {
        RecorridoService.clickButtons(button);
    }

    @Then("es redirigido a la pantalla (.*)")
    public void esRedirigidoA(String view) {
        RecorridoService.isViewLoaded(view);
    }

    @Then("visualiza el mensaje '(.*)'")
    public void visualizaElMensaje(String message) {
        RecorridoService.messagesViews(message);
    }
}
