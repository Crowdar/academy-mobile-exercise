package com.crowdar.examples.steps;

import com.crowdar.examples.services.ProfileService;
import io.cucumber.java.en.When;

public class PerfilSteps {
    @When("ingresa sus datos personales Nombre (.*), Apellido (.*), DNI (.*), Telefono (.*) y Direccion (.*)")
    public void ingresarDatosPersonales(String nombre, String apellido, String dni, String tel, String dir) {
        ProfileService.setPersonalInfo(nombre, apellido, dni, tel, dir);
    }
}
