package com.crowdar.examples.steps;

import com.crowdar.examples.services.CameraService;
import com.crowdar.examples.services.JornadaService;
import io.cucumber.java.en.And;

public class CameraSteps {

    @And("El cliente acepta el aviso de camara")
    public void elClienteAceptaElAvisoDeCamara() {
        CameraService.aceptarAviso();
    }

    @And("El cliente se saca una foto")
    public void elClienteSeSacaUnaFoto() throws InterruptedException {
        CameraService.takePicture();
    }

    @And("El cliente reporta el error")
    public void elClienteReportaElError() {
        CameraService.clickReportButton();
    }

    @And("El cliente presiona el boton COMENZAR JORNADA desde ventana del reporte")
    public void elClientePresionaElBotonCOMENZARJORNADADesdeVentanaDelReporte() {
        JornadaService.clickStartJornadaReporte();
    }
}
