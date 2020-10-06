package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.PermisosService;
import io.cucumber.java.en.Given;

public class PermisosSteps extends PageSteps {

    @Given("El cliente acepta los permisos de la aplicación")
    public void elClienteAceptaLosPermisosDeLaAplicación() {
        PermisosService.aceptarPermisos();
    }
}
