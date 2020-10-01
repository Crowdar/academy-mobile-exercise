package com.crowdar.examples.steps;

import com.crowdar.examples.services.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class PopUpSteps {

    @Given("La app es cargada correctamente")
    public void laAppEsCargadaCorrectamente() {
        PermisosService.aceptarPermisos();
    }

    @And("Acepta el Error")
    public void aceptaElError() {
        CamaraService.aceptarError();
    }

    @And("Comienza la Jornada de la ventana de reporte")
    public void comienzaLaJornadaDeLaVentanaDeReporte() {
        HomeService.empezarJornadaPopUpReporte();
    }

    @And("Acepta el aviso")
    public void aceptaElAviso() {
        CamaraService.aceptarAviso();
    }

    @And("Acepta finalizar la jornada")
    public void aceptaFinalizarLaJornada() {
        HomeService.aceptarFinalizarJornada();
    }

    @And("Acepta Cerrar Sesión")
    public void aceptaCerrarSesión() {
        MenuService.destino("Aceptar cerrar sesion");
    }

    @And("Hace click en Fichar")
    public void haceClickEnFichar() {
        MenuService.destino("Fichar");
    }

    @And("Acepta Enviar la Solicitud")
    public void aceptaEnviarLaSolicitud() {
        SolicitudesServices.AceptarEnviarSolicitud();
    }
}
