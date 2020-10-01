package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.MenuConstants;

public class MenuService {
    public static void destino(String destino){
        switch (destino.toLowerCase()){
            case "fichar": MobileActionManager.click(MenuConstants.HOME_BTN); break;
            case "historial": MobileActionManager.click(MenuConstants.HISTORIAL_BTN); break;
            case "solicitudes": MobileActionManager.click(MenuConstants.SOLICITUDES_BTN); break;
            case "perfil": MobileActionManager.click(MenuConstants.PERFIL_BTN); break;
            case "password": MobileActionManager.click(MenuConstants.PASSWORD_BTN); break;
            case "cerrar sesion": MobileActionManager.click(MenuConstants.CERRAR_SESION_BTN); break;
            case "aceptar cerrar sesion": MobileActionManager.click(MenuConstants.ACEPTAR_CERRAR_SESION_BTN); break;

        }

    }
}
