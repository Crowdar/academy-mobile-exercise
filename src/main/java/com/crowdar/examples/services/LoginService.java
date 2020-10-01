package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.FichapHomeConstans;
import com.crowdar.examples.constants.FichapLoginConstans;
import com.crowdar.examples.constants.HomeConstants;
import io.appium.java_client.MobileBy;
import org.testng.Assert;

public class LoginService {
    public static void isViewLoaded(){
        MobileActionManager.waitVisibility(FichapLoginConstans.LOG_IN_BUTTON_LOCATOR);
        Assert.assertTrue(MobileActionManager.isVisible(FichapLoginConstans.EMAIL_INPUT_LOCATOR),FichapLoginConstans.VIEW_NOT_DISPLAYED_MESSAGE);
    }

    public static void logIn(String email,String pass){
        MobileActionManager.setInput(FichapLoginConstans.EMAIL_INPUT_LOCATOR,email);
        MobileActionManager.setInput(FichapLoginConstans.PASSWORD_INPUT_LOCATOR,pass);
        MobileActionManager.click(FichapLoginConstans.LOG_IN_BUTTON_LOCATOR);
        MobileActionManager.click(FichapLoginConstans.ACCEPT_TAKE_SELFIE_TO_START_BUTTON_LOCATOR);
        MobileActionManager.waitVisibility(FichapLoginConstans.CAMERA_BUTTON_LOCATOR);
        MobileActionManager.click(FichapLoginConstans.CAMERA_BUTTON_LOCATOR);
    }
}
