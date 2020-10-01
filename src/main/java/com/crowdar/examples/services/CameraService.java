package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.CameraConstants;

public class CameraService {
    public static void takeFirstPicture(){
        MobileActionManager.waitVisibility(CameraConstants.ACCEPT_BUTTON_LOCATOR);
        MobileActionManager.click(CameraConstants.ACCEPT_BUTTON_LOCATOR);
        MobileActionManager.click(CameraConstants.TAKE_PHOTO_BUTTON_LOCATOR);
    }

    public static void takePicture(){
        MobileActionManager.click(CameraConstants.TAKE_PHOTO_BUTTON_LOCATOR);
        MobileActionManager.click(CameraConstants.REPORT_BUTTON_LOCATOR);
    }
}
