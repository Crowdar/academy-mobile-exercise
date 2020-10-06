package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.CameraConstants;
import com.crowdar.examples.constants.JornadaConstants;

public class JornadaService {

    public static void clickStartJornadaReporte() {
        MobileActionManager.click(JornadaConstants.COMENZAR_JORNADA_BUTTON);
    }

    public static void clickFinJornada(){
        MobileActionManager.waitClickable(JornadaConstants.FIN_JORNADA_BUTTON);
        MobileActionManager.click(JornadaConstants.FIN_JORNADA_BUTTON);
    }

    public static void clickAceptarFinJornada(){
        MobileActionManager.waitClickable(JornadaConstants.ACEPTAR_FIN_JORNADA_BUTTON);
        MobileActionManager.click(JornadaConstants.ACEPTAR_FIN_JORNADA_BUTTON);
    }

    public static void clickTerminarJornada(){
        MobileActionManager.waitClickable(JornadaConstants.TERMINAR_JORNADA_BUTTON);
        MobileActionManager.click(JornadaConstants.TERMINAR_JORNADA_BUTTON);
    }
}
