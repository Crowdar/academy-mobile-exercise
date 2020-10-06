package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.PasswordConstants;
import org.testng.Assert;

public class PasswordService {
    public static void modifyPassword(String password,String repeatPassword){
        MobileActionManager.setInput(PasswordConstants.INPUT_PASSWORD,password,true);
        MobileActionManager.setInput(PasswordConstants.INPUT_REPEAT_PASSWORD,repeatPassword,true);
    }
    public static void verifyPasswordSection(String titleName){
        Assert.assertEquals(
                MobileActionManager.getElement(PasswordConstants.PASSWORD_SECTION_TITLE).getText().trim().toUpperCase(),
                titleName.toUpperCase());
    }

    public static void clickSavePassButton(){
        MobileActionManager.click(PasswordConstants.SAVE_PASS_CHANGE_BUTTON);
    }

    public static void verifyTransaction(){
        Assert.assertEquals(MobileActionManager.getElement(PasswordConstants.MODAL_TEXT).getText().toUpperCase().trim(),
                "CAMBIO DE CONTRASEÑA EXITOSO!");
    }

}
