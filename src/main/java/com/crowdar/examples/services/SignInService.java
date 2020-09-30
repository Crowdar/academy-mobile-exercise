package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.SignInConstants;
import org.testng.Assert;

public class SignInService {

    public static void isViewLoaded(){
        MobileActionManager.waitVisibility(SignInConstants.SIGN_IN_BUTTON_LOCATOR);
        Assert.assertTrue(MobileActionManager.isPresent(SignInConstants.SIGN_IN_BUTTON_LOCATOR),"El elemento no esta visible");
    }

    public static void completeLoginFields(String email, String pass){
        MobileActionManager.setInput(SignInConstants.EMAIL_INPUT_LOCATOR, email, true);
        MobileActionManager.setInput(SignInConstants.PASSWORD_INPUT_LOCATOR, pass, true);
    }

    public static void clickButton(){
        MobileActionManager.click(SignInConstants.SIGN_IN_BUTTON_LOCATOR);
    }
}
