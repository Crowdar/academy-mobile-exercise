package com.crowdar.examples.steps;

import com.crowdar.examples.services.SolicitudesService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class SolicitudSteps {
    @When("selecciona la fecha con el dia (.*), mes (.*) y año (.*)")
    public void seleccionaUnaFecha(String dia, String mes, String anio) {
       SolicitudesService.setDate(dia,mes,anio);
    }

    @And("escribe el motivo de la solicitud (.*)")
    public void motivoDeLaSolicitud(String motivo) {
        SolicitudesService.setMotivo(motivo);
    }

}
