package com.crowdar.examples.steps;

import com.crowdar.examples.services.HomeService;
import com.crowdar.examples.services.MenuService;
import io.cucumber.java.en.And;

public class ClickSteps {
    @And("Hace click en Comenzar Jornada")
    public void haceClickEnComenzarJornada() throws InterruptedException {
        HomeService.empezarJornada();
    }

    @And("Hace click en Terminar")
    public void haceClickEnTerminar() {
        HomeService.terminar();
    }

    @And("Hace click en Cerrar Sesión")
    public void haceClickEnCerrarSesión() {
        MenuService.destino("Cerrar Sesion");

    }
}
