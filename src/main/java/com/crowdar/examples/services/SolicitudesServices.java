package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.driver.DriverManager;
import com.crowdar.examples.constants.SolicitudesConstants;
import org.openqa.selenium.By;

public class SolicitudesServices {


    public static void usarMotivo(String motivo) {
        MobileActionManager.setInput(SolicitudesConstants.MOTIVO_INPUT, motivo, true);
        DriverManager.getDriverInstance().navigate().back();

    }

    public static void elegirFecha(String dia, String mes, String year) {
        elegirMes(mes, year);
        elegirDia(dia);
    }

    private static void elegirMes(String mes, String year) {
        while (!MobileActionManager.
                getElement(SolicitudesConstants.MES_TXT).
                getText().
                equalsIgnoreCase(String.format("%s %s", mes, year))){

            MobileActionManager.click(SolicitudesConstants.MES_SIGUIENTE_BTN);
        }
    }

    private static void elegirDia(String diaElegido) {
        int indexPrimerDiaDelMes = indiceDeDiaEspecifico(0, "1");
        indexPrimerDiaDelMes -= 1;
        int indexDiaElegido =  indiceDeDiaEspecifico(indexPrimerDiaDelMes, diaElegido);
        DriverManager.
                getDriverInstance().
                findElement(By.xpath(XPATHDiaEspecifico(indexDiaElegido))).
                click();
    }
    private static int indiceDeDiaEspecifico(int indexDiaComienzo, String diaBuscado){
        indexDiaComienzo++;
        if (DriverManager.
                getDriverInstance().
                findElement(By.xpath(XPATHDiaEspecifico(indexDiaComienzo))).
                getText().
                equalsIgnoreCase(diaBuscado)
                ){
            return indexDiaComienzo;
        }else{
            return indiceDeDiaEspecifico(indexDiaComienzo, diaBuscado);
        }
    }

    private static String XPATHDiaEspecifico(int index){
        return String.format(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup[%d]/android.view.ViewGroup/android.widget.TextView",
                index);
    }

    public static void enviarSolicitud() {
        DriverManager.getDriverInstance().findElement(By.xpath
                ("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]")).
                click();

        //MobileActionManager.click(SolicitudesConstants.ENVIAR_SOLICITUD_BTN);
    }

    public static void AceptarEnviarSolicitud() {
        MobileActionManager.click(SolicitudesConstants.ACEPTAR_ENVIAR_SOLICITUD_BTN);
    }
}
