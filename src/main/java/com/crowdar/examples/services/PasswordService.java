package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.driver.DriverManager;
import com.crowdar.examples.constants.PasswordConstants;

public class PasswordService {
    public static void cambiarPassword(String pw) {
        MobileActionManager.setInput(PasswordConstants.NUEVA_PW_INPUT, pw, true);
        MobileActionManager.setInput(PasswordConstants.REPETIR_PW_INPUT, pw, true);
        DriverManager.getDriverInstance().navigate().back();
        MobileActionManager.click(PasswordConstants.GUARDAR_BTN);
        MobileActionManager.click(PasswordConstants.ACEPTAR_AVISO_BTN);
    }

    public static void abrirMenu() {
        MobileActionManager.click(PasswordConstants.MENU_BTN);
    }
}
