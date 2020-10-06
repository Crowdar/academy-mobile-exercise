package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.*;
import io.cucumber.java.en.And;
import org.testng.Assert;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class HomeService {
    public static void verifyHome() {
        MobileActionManager.waitClickable(HomeConstants.START_WORK_DAY_BUTTON);
        Assert.assertTrue(MobileActionManager.isPresent(HomeConstants.START_WORK_DAY_BUTTON));
    }

    public static void clickComenzarJornada(){
            MobileActionManager.click(HomeConstants.START_WORK_DAY_BUTTON);
    }


    public static void clickMenuDesplegable() {
        if (MobileActionManager.isPresent(HomeConstants.MENU_DESPLEGABLE)) {
            MobileActionManager.click(HomeConstants.MENU_DESPLEGABLE);
        } else {
            if (MobileActionManager.isPresent(PasswordConstants.TOGGLE_NAV)) {
                MobileActionManager.click(PasswordConstants.TOGGLE_NAV);
            }
        }
    }

    public static void clickCerrarSesion() {
        MobileActionManager.click(HomeConstants.CERRAR_SESION_BUTTON);
    }

    public static void clickAceptLogOutButton() {
        MobileActionManager.click(HomeConstants.ACEPT_LOG_OUT_BUTTON);
        MobileActionManager.clean();
    }

    public static void selectNavSection(String navSection) {
        switch (navSection) {
            case "PERFIL":
                clickProfileSection(navSection);
                break;
            case "CONTRASEÑA":
                clickPasswordSection(navSection);
                break;
            case "SOLICITUDES":
                clickSolicitudSection(navSection);
                break;
        }

    }

    public static void clickProfileSection(String navSection) {
        MobileActionManager.waitPresence(HomeConstants.PROFILE_OPTION_NAV);
        MobileActionManager.click(HomeConstants.PROFILE_OPTION_NAV);
        ProfileService.verifyProfileSection();
    }

    public static void clickPasswordSection(String navSection) {
        MobileActionManager.waitPresence(HomeConstants.PASSWORD_OPTION_NAV);
        MobileActionManager.click(HomeConstants.PASSWORD_OPTION_NAV);
        PasswordService.verifyPasswordSection(navSection);
    }

    public static void clickSolicitudSection(String navSection) {
        MobileActionManager.waitPresence(HomeConstants.SOLICITUD_OPTION_NAV);
        MobileActionManager.click(HomeConstants.SOLICITUD_OPTION_NAV);
        //SolicitudService.verifySolicitudSection(navSection);
    }


}
