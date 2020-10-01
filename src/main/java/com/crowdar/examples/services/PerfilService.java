package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.driver.DriverManager;
import com.crowdar.examples.constants.PerfilConstants;
import org.openqa.selenium.By;

public class PerfilService {
    public static void cambiarDireccion(String direccion) {
        MobileActionManager.setInput(PerfilConstants.DIRECCION_INPUT, direccion, true);
        DriverManager.getDriverInstance().navigate().back();
        guardarCambio();
    }

    private static void guardarCambio() {
        DriverManager.getDriverInstance().findElement(By.xpath
                ("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[8]")).
                click();
        MobileActionManager.click(PerfilConstants.GUARDAR_BTN);
        MobileActionManager.click(PerfilConstants.ACEPTAR_AVISO_BTN);
    }
}
