package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.SolicitudConstants;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SolicitudService {
    public static void accedoSolicitud() {
        MobileActionManager.click(SolicitudConstants.CLICK_SOLICITUD_INPUT_LOCATOR);
    }

    public static void seleccionoFechas(String day, String month, String year) {
        String mes_año = month+" " + year;
        List<WebElement> listaDias;

        listaDias = MobileActionManager.getElements(SolicitudConstants.LISTA_DIAS);

        do {
            MobileActionManager.click(SolicitudConstants.SIGUIENTE_MES_BUTTON);
        } while (!MobileActionManager.getText(SolicitudConstants.MES_AÑO_TEXT).equals(mes_año));

        MobileActionManager.waitPresence(SolicitudConstants.LISTA_DIAS);

        for (WebElement dias: listaDias) {
            if (dias.getText().equals(day)) {
                dias.click();
                break;
            }
        }
    }

    public static void envioMotivo(String motivo) {
        MobileActionManager.setInput(SolicitudConstants.CLICK_MOTIVO_INPUT_LOCATOR, motivo);
        MobileActionManager.click(SolicitudConstants.CLICK_ENVIAR_INPUT_LOCATOR);
        MobileActionManager.click(SolicitudConstants.CLICK_VERIFENVIO_INPUT_LOCATOR);
    }
}

