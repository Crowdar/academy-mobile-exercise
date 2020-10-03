package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.SesionCloseConstants;

public class SesionClose {
    public static void btnCloseSesion(){
        MobileActionManager.click(SesionCloseConstants.CLOSE_SESION_BUTTON_LOCATOR);

    }
    public static void validateCloseSesion(){
        MobileActionManager.click(SesionCloseConstants.OK_CLOSE_BUTTON_LOCATOR);
    }
}
