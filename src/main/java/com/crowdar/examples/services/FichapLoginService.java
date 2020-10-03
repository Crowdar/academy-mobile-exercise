package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.driver.DriverManager;
import com.crowdar.examples.constants.FichapLoginConstants;
import org.testng.Assert;

public class FichapLoginService {
    public static void hacerLogin(String email, String password){

        MobileActionManager.setInput(FichapLoginConstants.EMAIL_INPUT_LOCATOR, email);
        MobileActionManager.setInput(FichapLoginConstants.PASSWORD_INPUT_LOCATOR, password);
        MobileActionManager.click(FichapLoginConstants.SIGN_IN_BUTTON_LOCATOR);
    }

    public static void isViewLoaded(){
        MobileActionManager.waitVisibility(FichapLoginConstants.SIGN_IN_BUTTON_LOCATOR);
        Assert.assertTrue(MobileActionManager.isVisible(FichapLoginConstants.EMAIL_INPUT_LOCATOR));
        Assert.assertTrue(MobileActionManager.isVisible(FichapLoginConstants.PASSWORD_INPUT_LOCATOR));
    }

}
