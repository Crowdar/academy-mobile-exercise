package com.crowdar.examples.steps;

import com.crowdar.examples.services.HomeService;
import com.crowdar.examples.services.PasswordService;
import com.crowdar.examples.services.ProfileService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ModifyUserSteps {

    @And("El cliente ingresa correctamente a la sección (.*)")
    public void elClienteIngresaCorrectamenteALaSecciónPERFIL(String sectionName) {
        HomeService.selectNavSection(sectionName);
    }

    @And("El cliente modifica '(.*)', '(.*)', '(.*)', '(.*)', '(.*)', '(.*)'")
    public void elClienteModificaNameLastnameNewEmailDomicilioDniCellphone(String name, String surname,String email,
                                                                           String address,String dni,String cellphone) {
        ProfileService.modifyInputValues(name,surname,dni,cellphone,email,address);

    }

    @Then("Los datos se actualizaron con éxito")
    public void losDatosSeActualizaronConÉxito() {
        ProfileService.verifyTransaction();
    }

    @And("El cliente ingresa '(.*)', '(.*)'")
    public void elClienteIngresaNewPassNewPassRepeat(String newPass,String newPassRepeat) {
        PasswordService.modifyPassword(newPass,newPassRepeat);
    }

    @And("El cambio de contraseña fue exitoso")
    public void elCambioDeContraseñaFueExitoso() {
        PasswordService.verifyTransaction();
    }
}
