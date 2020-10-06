package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.CameraConstants;

public class CameraService {
    public static void aceptarAviso() {
        MobileActionManager.waitPresence(CameraConstants.ACEPTAR_BUTTON);
        MobileActionManager.click(CameraConstants.ACEPTAR_BUTTON);
    }

    public static void takePicture() {
        MobileActionManager.waitClickable(CameraConstants.CAMERA_BUTTON);
        MobileActionManager.click(CameraConstants.CAMERA_BUTTON);
    }

    public static void clickReportButton() {
        MobileActionManager.click(CameraConstants.REPORT_BUTTON);
    }

}
