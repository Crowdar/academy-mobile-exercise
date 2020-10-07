package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.FichapCamaraContants;
import org.testng.Assert;

public class FichapCamaraService {

    public static void validarMensaje(){
        Assert.assertEquals(MobileActionManager.getText(FichapCamaraContants.MESSAGE_INPUT_LOCATOR),"ACEPTAR");
        MobileActionManager.click(FichapCamaraContants.MESSAGE_INPUT_LOCATOR);
    }

    public static void sacarFoto(){
        MobileActionManager.click(FichapCamaraContants.CLICK_CAMARA_INPUT_LOCATOR);
    }
}
