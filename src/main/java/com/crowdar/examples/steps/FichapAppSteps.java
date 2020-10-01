package com.crowdar.examples.steps;

import com.crowdar.examples.services.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

public class FichapAppSteps {

    @When("El user carga su '(.*)' y su '(.*)'")
    public void elUserCargaSuEmailYSuPw(String email, String pw) {
        LoginService.doLogin(email, pw);
    }

    @And("Saca una foto")
    public void elUserReportaNoPoderSacarseUnaFotoLuegoDelLogin() throws InterruptedException {
        CamaraService.sacarFoto();
    }

    @And("Finaliza la Jornada")
    public void finalizaLaJornada() {
        HomeService.finalizarJornada();
    }

    @And("Abre el menu")
    public void abreElMenu() {
        HomeService.abrirMenu();
    }

    @And("Elige como fecha el '(.*)' del '(.*)' del '(.*)'")
    public void eligeComoFechaElDiaDeMesAño( String dia, String mes, String year) {
        SolicitudesServices.elegirFecha(dia, mes, year);
    }


    @And("Pone un '(.*)'")
    public void poneComoMotivo(String motivo) throws InterruptedException {
        SolicitudesServices.usarMotivo(motivo);
        TimeUnit.SECONDS.sleep(8);
    }

    @And("Cambia su direccion por '(.*)'")
    public void cambiaSuDireccionPorDireccion(String direccion) {
        PerfilService.cambiarDireccion(direccion);

    }

    @And("Cambia su password por '(.*)'")
    public void cambiaSuPasswordPorPw(String pw) {
        PasswordService.cambiarPassword(pw);
    }

    @And("Abre el menu de Password")
    public void abreElMenuDePassword() {

    }
}
