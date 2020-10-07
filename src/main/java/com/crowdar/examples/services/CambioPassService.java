package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.ChangePasswordConstants;

public class CambioPassService {
    public static void accedoPassword(){
        MobileActionManager.click(ChangePasswordConstants.PASSWORDMENU_BTN_LOCATOR);
    }

    public static void changePass(String newPassword, String repeatPassword) {
        MobileActionManager.setInput(ChangePasswordConstants.NEWPASSWORD_INPUT_LOCATOR, newPassword);
        MobileActionManager.setInput(ChangePasswordConstants.REPEATPASSWORD_INPUT_LOCATOR, repeatPassword);
        MobileActionManager.click(ChangePasswordConstants.SAVE_BUTTON_LOCATOR);
        MobileActionManager.click(ChangePasswordConstants.OK_BUTTON_LOCATOR);

    }
}
