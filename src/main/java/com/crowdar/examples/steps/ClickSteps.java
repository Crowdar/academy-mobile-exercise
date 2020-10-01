package com.crowdar.examples.steps;

import com.crowdar.examples.services.HomeService;
import com.crowdar.examples.services.MenuService;
import com.crowdar.examples.services.SolicitudesServices;
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

    @And("Hace click en Solicitudes")
    public void haceClickEnSolicitud() {
        MenuService.destino("Solicitudes");
    }

    @And("Hace clic en Enviar Solicitud")
    public void haceClicEnEnviarSolicitud() {
        SolicitudesServices.enviarSolicitud();
    }

    @And("Hace click en Perfil")
    public void haceClickEnPerfil() {
        MenuService.destino("Perfil");
    }

    @And("Hace click en Password")
    public void haceClickEnPassword() {
        MenuService.destino("Password");
    }
}
