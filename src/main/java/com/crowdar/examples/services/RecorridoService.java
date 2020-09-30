package com.crowdar.examples.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.driver.DriverManager;
import com.crowdar.examples.constants.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class RecorridoService {

    public static void isRecorridoViewLoaded(){
        MobileActionManager.waitVisibility(RecorridoConstant.TITLE_RECORRIDO_VIEW_LOCATOR);
        Assert.assertEquals(MobileActionManager.getText(RecorridoConstant.TITLE_RECORRIDO_VIEW_LOCATOR), "Recorrido");
    }

    public static void messagesViews(String message){
        switch (message){
            case "Ocurrió un error": CameraService.verifyErrorMessage(message); break;
            case "Reporte Exitoso": ReporteService.verifyReportSuccess(); break;
            case "¿Enviar solicitud?": SolicitudesService.confirmationMessage(message); break;
            case "Solicitud Registrada": SolicitudesService.confirmationMessage(message); break;
            case "Aviso": CameraService.verifyErrorMessage(message); break;
            case "Los datos se actualizaron con éxito": ProfileService.verifyMessage(); break;
            case "Finalizar Jornada": RecorridoService.verifyMessage(); break;
            case "¿Está seguro que desea cerrar sesión?": MenuService.verifyMessage(); break;
        }
    }

    public static void clickButtons(String button) {
        switch (button){
            case "Iniciar Sesion": SignInService.clickButton(); break;
            case "Comenzar Jornada": RecorridoService.clickButtonComenzarJornada(); break;
            case "Reportar": CameraService.clickButtons(button); break;
            case "Menu": RecorridoService.clickButtonMenu(); break;
            case "Solicitudes": MenuService.clickButtons(button); break;
            case "Fichar": MenuService.clickButtons(button); break;
            case "Perfil": MenuService.clickButtons(button); break;
            case "Cerrar Sesion": MenuService.clickButtons(button); break;
            case "Ok": RecorridoService.clickButtonOk(button); break;
            case "Enviar Solicitud": SolicitudesService.clickButtons(button); break;
            case "Aceptar": CameraService.clickButtons(button); break;
            case "Fin": RecorridoService.clickButtonFinalizarJornada(); break;
            case "Terminar": RecorridoService.clickButtonFinish(); break;
            case "Guardar": ProfileService.clickButtons(button); break;
        }
    }

    public static void isViewLoaded(String view) {
        switch (view){
            case "Fichar": FicharService.isFicharViewLoaded(); break;
            case "Camara": CameraService.isCameraViewLoaded(); break;
            case "Recorrido": RecorridoService.isRecorridoViewLoaded(); break;
            case "Menu": MenuService.isMenuViewLoaded(); break;
            case "Login": SignInService.isViewLoaded(); break;
            case "Solicitudes": SolicitudesService.isSolicitudesViewLoaded(); break;
        }
    }

    private static void verifyMessage(){
        Assert.assertEquals(MobileActionManager.getText(RecorridoConstant.MESSAGE_CONFIRMATION_FIN_LOCATOR), "Finalizar jornada");
    }

    private static void clickButtonFinish() {
        MobileActionManager.click(RecorridoConstant.BUTTON_FINISH_LOCATOR);
    }

    private static void clickButtonOk(String button){
        if(MobileActionManager.isPresent(RecorridoConstant.BUTTON_CONFIRMATIO_OK_LOCATOR)){
            MobileActionManager.click(RecorridoConstant.BUTTON_CONFIRMATIO_OK_LOCATOR);
        } else {
            if(MobileActionManager.isPresent(SolicitudesConstants.BUTTON_OK_SOLICITUD_REGISTRADA_LOCATOR)||MobileActionManager.isPresent(SolicitudesConstants.BUTTON_OK_CONFIRMATION_LOCATOR)){
                SolicitudesService.clickButtons(button);
            } else {
                if(MobileActionManager.isPresent(ProfileConstants.BUTTON_OKAVISO_LOCATOR)){
                    ProfileService.clickButtons(button);
                }
            }
        }

    }

    private static void clickButtonComenzarJornada(){
        if(MobileActionManager.isPresent(FicharConstants.BUTTON_COMENZAR_JORNADA_LOCATOR)){
            FicharService.clickButton();
        }else{
            if(MobileActionManager.isPresent(ReporteConstant.BUTTON_COMENZAR_JORNADA_LOCATOR)){
                ReporteService.clickButton();
            }
        }
    }

    private static void clickButtonFinalizarJornada(){
        MobileActionManager.click(RecorridoConstant.BUTTON_FINALIZAR_JORNADA_LOCATOR);
    }

    private static void clickButtonMenu(){
        if(MobileActionManager.isPresent(RecorridoConstant.BUTTON_MENU_LOCATOR)){
            MobileActionManager.click(RecorridoConstant.BUTTON_MENU_LOCATOR);
        }else {
            if(MobileActionManager.isPresent(ProfileConstants.BUTTON_MENU_LOCATOR)){
                MobileActionManager.click(ProfileConstants.BUTTON_MENU_LOCATOR);
            }
        }

    }
}
