package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.PasswordConstants;

public class ButtonService {
    public static void clickAnyButton(String button) {

        switch(button) {
            case "COMENZAR JORNADA":
                clickComenzarJornada();
                break;
            case "FIN JORNADA":
                JornadaService.clickFinJornada();
                break;
            case "ACEPTAR FIN JORNADA":
                JornadaService.clickAceptarFinJornada();
                break;
            case "TERMINAR":
                JornadaService.clickTerminarJornada();
                break;
            case "MENU DESPLEGABLE":
                HomeService.clickMenuDesplegable();
                break;
            case "CERRAR SESIÓN":
                HomeService.clickCerrarSesion();
                break;
            case "ACEPTAR":
                HomeService.clickAceptLogOutButton();
                break;
            case "ENVIAR SOLICITUD":
                SolicitudService.clickEnviarSolicitud();
                break;
            case "OK":
                ProfileService.clickOkTransaccionExitosa();
                break;
            case "GUARDAR":
                ProfileService.clickSave();
                break;
            default:
                System.out.println("No existe la opción que solicita");
                break;
        }
    }

    public static void clickComenzarJornada(){
        if(MobileActionManager.isPresent(HomeConstants.START_WORK_DAY_BUTTON)){
            HomeService.clickComenzarJornada();
        }else{
            JornadaService.clickStartJornadaReporte();
        }
    }

}
