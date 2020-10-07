package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.DataModConstants;
import com.crowdar.examples.constants.FichapCamaraContants;
import com.crowdar.examples.constants.FichapLoginConstants;
import org.testng.Assert;

public class ModificacionData {
    public static void accedoSubMenu(){
        MobileActionManager.click(DataModConstants.CLICK_BURGER_INPUT_LOCATOR);
    }
    public static void accedoPerfil(){
        MobileActionManager.click(DataModConstants.CLICK_PERFIL_INPUT_LOCATOR);
    }
    public static void validoMenuPerfil(){
        Assert.assertEquals(MobileActionManager.getText(DataModConstants.MESSAGE1_INPUT_LOCATOR),"Dario Perez");
    }

    public static void guardoData(String nombre,String apellido,String dni,String celular,String correo, String direccion){

        MobileActionManager.setInput(DataModConstants.CLICK_NOMBRE_INPUT_LOCATOR, nombre);
        MobileActionManager.setInput(DataModConstants.CLICK_APELLIDO_INPUT_LOCATOR, apellido);
        MobileActionManager.setInput(DataModConstants.CLICK_DNI_INPUT_LOCATOR, dni);
        MobileActionManager.setInput(DataModConstants.CLICK_TEL_INPUT_LOCATOR, celular);
        MobileActionManager.setInput(DataModConstants.CLICK_EMAIL_INPUT_LOCATOR, correo);
        MobileActionManager.setInput(DataModConstants.CLICK_DIRECCION_INPUT_LOCATOR, direccion);
        MobileActionManager.click(DataModConstants.CLICK_GUARDAR_INPUT_LOCATOR);
    }
}
