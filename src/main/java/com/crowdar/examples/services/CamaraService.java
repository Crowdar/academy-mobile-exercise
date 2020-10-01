package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.driver.DriverManager;
import com.crowdar.examples.constants.CamaraConstants;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;


public class CamaraService {

    public static void sacarFoto() throws InterruptedException {

        TimeUnit.SECONDS.sleep(4);
        DriverManager.getDriverInstance().findElement(By.xpath
                ("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).
                click();
    }

    public static void aceptarAviso() {
        MobileActionManager.click(CamaraConstants.POPUP_ACEPTAR_BTN);
    }

    public static void aceptarError() {

        MobileActionManager.click(CamaraConstants.POPUP_REPORTAR_BTN);
    }

}
