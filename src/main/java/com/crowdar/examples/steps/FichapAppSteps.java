package com.crowdar.examples.steps;

import com.crowdar.examples.services.CamaraService;
import com.crowdar.examples.services.HomeService;
import com.crowdar.examples.services.LoginService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FichapAppSteps {

    @When("El user carga su '(.*)' y su '(.*)'")
    public void elUserCargaSuEmailYSuPw(String email, String pw) {
        LoginService.doLogin(email, pw);
    }

    @And("Saca una foto")
    public void elUserReportaNoPoderSacarseUnaFotoLuegoDelLogin(){
        CamaraService.sacarFoto();
    }

    @And("Finaliza la Jornada")
    public void finalizaLaJornada() {
        HomeService.finalizarJornada();
    }

    @And("abre el menu")
    public void abreElMenu() {
        HomeService.abrirMenu();
    }
}
