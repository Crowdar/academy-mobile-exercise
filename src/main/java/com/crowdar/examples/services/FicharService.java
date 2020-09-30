package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.FicharConstants;
import org.testng.Assert;

public class FicharService {

    public static void isFicharViewLoaded(){
        MobileActionManager.waitVisibility(FicharConstants.BUTTON_COMENZAR_JORNADA_LOCATOR);
        Assert.assertEquals(MobileActionManager.getText(FicharConstants.TITLE_FICHAR_VIEW_LOCATOR), "Fichar");
    }

    public static void clickButton(){
            MobileActionManager.click(FicharConstants.BUTTON_COMENZAR_JORNADA_LOCATOR);
    }
}
