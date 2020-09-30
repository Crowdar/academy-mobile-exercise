package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.driver.DriverManager;
import com.crowdar.examples.constants.SolicitudesConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.List;

public class SolicitudesService {
    public static void isSolicitudesViewLoaded() {
        MobileActionManager.waitVisibility(SolicitudesConstants.BUTTON_ENVIAR_SOLICITUD_LOCATOR);
       Assert.assertTrue(MobileActionManager.isPresent(SolicitudesConstants.BUTTON_ENVIAR_SOLICITUD_LOCATOR));
    }

    public static void clickButtons(String button){
        switch (button){
            case "Enviar Solicitud": MobileActionManager.click(SolicitudesConstants.BUTTON_ENVIAR_SOLICITUD_LOCATOR); break;
            case "Ok": clickButtonOk(); break;
        }
    }

    public static void confirmationMessage(String message){
        switch (message){
            case "¿Enviar solicitud?": Assert.assertEquals(MobileActionManager.getText(SolicitudesConstants.MESSAGE_CONFIRMATION_ENVIAR_LOCATOR), "¿Enviar solicitud?"); break;
            case "Solicitud Registrada":Assert.assertEquals(MobileActionManager.getText(SolicitudesConstants.MESSAGE_SOLICITUD_REGISTRADA_LOCATOR), "¡Solicitud registrada!"); break;
        }
    }

    public static void setMotivo(String motivo) {
       //MobileActionManager.setInput(SolicitudesConstants.INPUT_MOTIVO_LOCATOR, motivo, true);

        WebElement inputMotivo = DriverManager.getDriverInstance().findElementByXPath("//android.widget.EditText[contains(@text, 'Motivo')]");
        inputMotivo.sendKeys(motivo);
    }

    public static void setDate(String diaSolicitado, String mesSolicitado, String anioSolicitado) {

        String mes = mesSolicitado + " " + anioSolicitado;

        if (!MobileActionManager.getElement(SolicitudesConstants.CALENDAR_MONTHS_LOCATOR).getText().equals(mes)) {
            while(!MobileActionManager.getElement(SolicitudesConstants.CALENDAR_MONTHS_LOCATOR).getText().equals(mes)) {
                MobileActionManager.getElement(SolicitudesConstants.BUTTON_NEXTMONTH_CALENDAR_LOCATOR).click();
            }
        }

        List<WebElement> dias = MobileActionManager.getElements(SolicitudesConstants.CALENDAR_DAYS_LOCATOR);
        for (WebElement dia:dias){
            if(Integer.parseInt(dia.getText()) == Integer.parseInt(diaSolicitado)){
                dia.click();
                break;
            }
        }
    }

    private static void clickButtonOk(){
        if(MobileActionManager.isPresent(SolicitudesConstants.BUTTON_OK_CONFIRMATION_LOCATOR)){
            MobileActionManager.click(SolicitudesConstants.BUTTON_OK_CONFIRMATION_LOCATOR);
        } else {
            if(MobileActionManager.isPresent(SolicitudesConstants.BUTTON_OK_SOLICITUD_REGISTRADA_LOCATOR)){
                MobileActionManager.click(SolicitudesConstants.BUTTON_OK_SOLICITUD_REGISTRADA_LOCATOR);
            }
        }
    }
}
