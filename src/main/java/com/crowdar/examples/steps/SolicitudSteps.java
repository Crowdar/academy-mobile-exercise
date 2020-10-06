package com.crowdar.examples.steps;

import com.crowdar.examples.services.SolicitudService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SolicitudSteps {

    @And("El cliente selecciona '(.*)', '(.*)', '(.*)'")
    public void elClienteSeleccionaDayMonthYear(String day,String month,String year) {
        SolicitudService.selectDate(day,month,year);
    }

    @And("El cliente ingresa1 '(.*)'")
    public void elClienteIngresaMotivo(String motivo) {
        SolicitudService.writeMotivo(motivo);
    }


    @And("El cliente acepta enviar la solicitud")
    public void elClienteAceptaEnviarLaSolicitud() {
        SolicitudService.clickOkEnviarSolicitud();
    }

    @Then("El cliente realizo correctamente su solicitud")
    public void elClienteRealizoCorrectamenteSuSolicitud() {
        SolicitudService.verifySuccessTransaction();
    }
}
