package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.PasswordConstants;
import com.crowdar.examples.constants.ProfileConstants;
import com.crowdar.examples.constants.SolicitudConstants;
import org.testng.Assert;

public class ProfileService {

    public static void verifyProfileSection(){
        MobileActionManager.waitPresence(ProfileConstants.INPUT_NAME);
        Assert.assertTrue(MobileActionManager.isPresent(ProfileConstants.INPUT_NAME));
    }

    public static void modifyInputValues(String name,String surname,String dni,
                                         String cellphone,String email,String address){
        MobileActionManager.setInput(ProfileConstants.INPUT_NAME,name,true);
        MobileActionManager.waitPresence(ProfileConstants.INPUT_SURNAME);
        MobileActionManager.setInput(ProfileConstants.INPUT_SURNAME,surname,true);
        MobileActionManager.waitPresence(ProfileConstants.INPUT_DNI);
        MobileActionManager.setInput(ProfileConstants.INPUT_DNI,dni,true);
        MobileActionManager.waitPresence(ProfileConstants.INPUT_CELLPHONE);
        MobileActionManager.setInput(ProfileConstants.INPUT_CELLPHONE,cellphone,true);
        //MobileActionManager.waitPresence(ProfileConstants.INPUT_EMAIL);
        //MobileActionManager.setInput(ProfileConstants.INPUT_EMAIL,email,true);
        MobileActionManager.waitPresence(ProfileConstants.INPUT_ADDRESS);
        MobileActionManager.setInput(ProfileConstants.INPUT_ADDRESS,address,true);
    }

    public static void clickSave(){
        if(MobileActionManager.isPresent(ProfileConstants.SAVE_BUTTON)) {
            MobileActionManager.waitClickable(ProfileConstants.SAVE_BUTTON);
            MobileActionManager.click(ProfileConstants.SAVE_BUTTON);
            MobileActionManager.click(ProfileConstants.SAVE_BUTTON);
        }else{
            if(MobileActionManager.isPresent(PasswordConstants.SAVE_PASS_CHANGE_BUTTON)){
                PasswordService.clickSavePassButton();
            }
        }

    }

    public static void verifyTransaction(){
        MobileActionManager.waitPresence(ProfileConstants.EXITOUS_TRANSACTION_PROFILE_TEXT);
        Assert.assertEquals(MobileActionManager.getElement(ProfileConstants.EXITOUS_TRANSACTION_PROFILE_TEXT).getText().trim(),
                "Los datos se actualizaron con éxito.");
    }

    public static void clickOkTransaccionExitosa(){
        if(MobileActionManager.isPresent(ProfileConstants.OK_BUTTON)) {
            MobileActionManager.click(ProfileConstants.OK_BUTTON);
        }else{
            if(MobileActionManager.isPresent(PasswordConstants.OK_MODAL_BUTTON)) {
                MobileActionManager.click(PasswordConstants.OK_MODAL_BUTTON);
            }else{
                if(MobileActionManager.isPresent(SolicitudConstants.SUCCESS_TRANSACTION_BUTTON)){
                    MobileActionManager.click(SolicitudConstants.SUCCESS_TRANSACTION_BUTTON);
                }
            }
        }
    }

}
