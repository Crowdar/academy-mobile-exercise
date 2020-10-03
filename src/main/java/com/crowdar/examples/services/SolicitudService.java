package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.SolicitudConstants;

public class SolicitudService {
    public static void accedoSolicitud(){
        MobileActionManager.click(SolicitudConstants.CLICK_SOLICITUD_INPUT_LOCATOR);
    }

    public static void seleccionoFechas(String texto){
        MobileActionManager.click(SolicitudConstants.CLICK_TRECE_INPUT_LOCATOR);
        MobileActionManager.click(SolicitudConstants.CLICK_QUINCE_INPUT_LOCATOR);
        MobileActionManager.setInput(SolicitudConstants.CLICK_MOTIVO_INPUT_LOCATOR, texto);
        MobileActionManager.click(SolicitudConstants.CLICK_ENVIAR_INPUT_LOCATOR);
        MobileActionManager.click(SolicitudConstants.CLICK_VERIFENVIO_INPUT_LOCATOR);
    }
}
