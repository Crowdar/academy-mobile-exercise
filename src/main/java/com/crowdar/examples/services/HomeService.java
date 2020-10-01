package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.driver.DriverManager;
import com.crowdar.examples.constants.HomeConstants;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class HomeService {
    public static void verificarPantalla(String momento) {

    }

    public static void empezarJornada() throws InterruptedException {
        //MobileActionManager.click(HomeConstants.COMENZAR_JORNADA_BTN);
        TimeUnit.SECONDS.sleep(8);

        DriverManager.getDriverInstance().findElement(By.xpath
                        ("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")).
                click();
        TimeUnit.SECONDS.sleep(8);
    }

    public static void finalizarJornada() {
        MobileActionManager.click(HomeConstants.FINALIZAR_JORNADA_BTN);
    }

    public static void empezarJornadaPopUpReporte() {
        MobileActionManager.click(HomeConstants.COMENZAR_JORNADA_POPUP_REPORTE_BTN);
    }

    public static void aceptarFinalizarJornada() {
        MobileActionManager.click(HomeConstants.FINALIZAR_JORNADA_ACEPTAR_POP_UP_BTN);
    }

    public static void terminar() {
        MobileActionManager.click(HomeConstants.TERMINAR_BTN);
    }

    public static void abrirMenu() {
        MobileActionManager.click(HomeConstants.MENU_BTN);
    }
}
