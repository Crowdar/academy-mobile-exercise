package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.MenuConstants;
import org.testng.Assert;

public class MenuService {
    public static void isMenuViewLoaded() {
        MobileActionManager.waitVisibility(MenuConstants.IMAGE_MENU_LOCATOR);
        Assert.assertTrue(MobileActionManager.isPresent(MenuConstants.IMAGE_MENU_LOCATOR),"El elemento no esta visible");
    }

    public static void clickButtons(String button){
        switch (button){
            case "Fichar": MobileActionManager.click(MenuConstants.BUTTON_FICHAR_LOCATOR); break;
            case "Solicitudes": MobileActionManager.click(MenuConstants.BUTTON_SOLICITUDES_LOCATOR); break;
            case "Perfil": MobileActionManager.click(MenuConstants.BUTTON_PERFIL_LOCATOR); break;
            case "Cerrar Sesion": MobileActionManager.click(MenuConstants.BUTTON_CERRAR_SESION_LOCATOR); break;
        }
    }

    public static void verifyMessage() {
        Assert.assertEquals(MobileActionManager.getText(MenuConstants.MESSAGE_CONFIRMATION_CERRARSESION), "¿Está seguro que desea cerrar sesión?");
    }

}
