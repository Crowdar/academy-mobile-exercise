package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.CameraConstants;
import org.testng.Assert;

public class CameraService {

    public static void isCameraViewLoaded(){
        MobileActionManager.waitVisibility(CameraConstants.BUTTON_TAKE_PICTURE_LOCATOR);
        Assert.assertTrue(MobileActionManager.isPresent(CameraConstants.BUTTON_TAKE_PICTURE_LOCATOR), "El elemento no esta visible");
    }

    public static void takePicture() {
        MobileActionManager.click(CameraConstants.BUTTON_TAKE_PICTURE_LOCATOR);
    }

    public static void verifyErrorMessage(String message) {
        switch (message){
            case "Aviso": Assert.assertEquals(MobileActionManager.getText(CameraConstants.MESSAGE_AVISO_ERROR_LOCATOR), message);
            case "Ocurrió un error": Assert.assertEquals(MobileActionManager.getText(CameraConstants.MESSAGE_OCURRIO_ERROR_LOCATOR),message);
        }
    }

    public static void clickButtons(String button){
        switch (button){
            case "Aceptar": clickAcceptButton(); break;
            case "Reportar": clickReportButton(); break;
        }
    }

    private static void clickReportButton() {
        MobileActionManager.click(CameraConstants.BUTTON_REPORT_LOCATOR);
    }
    private static void clickAcceptButton() {
        MobileActionManager.click(CameraConstants.BUTTON_ACCEPT_LOCATOR);
    }

}
