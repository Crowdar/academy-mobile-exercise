package com.crowdar.examples.steps;

import com.crowdar.examples.services.CamaraService;
import com.crowdar.examples.services.HomeService;
import com.crowdar.examples.services.MenuService;
import com.crowdar.examples.services.PermisosService;
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
}
