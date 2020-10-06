package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.SolicitudConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SolicitudService {

    public static void verifySolicitudSection(String titleName){
        Assert.assertEquals(
                MobileActionManager.getElement(SolicitudConstants.SOLICITUD_SECTION_TITLE).getText().trim().toUpperCase(),
                titleName.toUpperCase());
    }

    public static void selectDate(String day,String month,String year){

        String month_year = month+" "+ year;
        List<WebElement> listDays;
        listDays = MobileActionManager.getElements(SolicitudConstants.LIST_DAYS);//cargo lista de dias

        do{
           MobileActionManager.click(SolicitudConstants.NEXT_MONTH_BUTTON);
        }while(!MobileActionManager.getText(SolicitudConstants.MONTH_YEAR_TEXT).equals(month_year));//selecciono el mes y año que quiero

        MobileActionManager.waitPresence(SolicitudConstants.LIST_DAYS);

        for (WebElement dia: listDays) {
            if(dia.getText().equals(day)){
                dia.click();
                break;
            }
        }
    }

    public static void writeMotivo(String motivo){
        MobileActionManager.setInput(SolicitudConstants.INPUT_MOTIVO,motivo,true,false);
    }

    public static void clickEnviarSolicitud(){
        MobileActionManager.click(SolicitudConstants.ENVIAR_SOLICITUD_BUTTON);
        MobileActionManager.click(SolicitudConstants.ENVIAR_SOLICITUD_BUTTON);
    }

    public static void clickOkEnviarSolicitud(){
        MobileActionManager.waitPresence(SolicitudConstants.CONFIRMA_SOLICITUD_BUTTON);
        MobileActionManager.click(SolicitudConstants.CONFIRMA_SOLICITUD_BUTTON);
    }

    public static void verifySuccessTransaction(){
        Assert.assertEquals(MobileActionManager.getText(SolicitudConstants.SUCCESS_TRANSACTION_MENSAJE).trim(),
                "¡Solicitud registrada!");
    }

}
