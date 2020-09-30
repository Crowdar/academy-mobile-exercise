package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.ProfileConstants;
import org.testng.Assert;

public class ProfileService {

    public static void isProfileViewLoaded() {
        Assert.assertEquals(MobileActionManager.getText(ProfileConstants.TITLE_PROFILE_VIEW_LOCATOR), "Mi Perfil");
    }

    public static void setPersonalInfo(String nombre, String apellido, String dni, String tel, String dir) {
        MobileActionManager.setInput(ProfileConstants.INPUT_NAME_LOCATOR, nombre, false, true);
        MobileActionManager.setInput(ProfileConstants.INPUT_LASTNAME_LOCATOR, apellido, false, true);
        MobileActionManager.setInput(ProfileConstants.INPUT_DNI_LOCATOR, dni, false, true);
        MobileActionManager.setInput(ProfileConstants.INPUT_PHONE_NUMBER_LOCATOR, tel, false, true);
        MobileActionManager.setInput(ProfileConstants.INPUT_ADDRESS_LOCATOR, dir, false, true);
    }

    public static void verifyMessage() {
        Assert.assertEquals(MobileActionManager.getText(ProfileConstants.MESSAGE_AVISO_LOCATOR), "Los datos se actualizaron con éxito.");
    }

    public static void clickButtons(String button) {
        switch (button) {
            case "Guardar":
                MobileActionManager.click(ProfileConstants.BUTTON_SAVE_LOCATOR);
                break;
            case "Menu":
                MobileActionManager.click(ProfileConstants.BUTTON_MENU_LOCATOR);
                break;
            case "Ok":
                MobileActionManager.click(ProfileConstants.BUTTON_OKAVISO_LOCATOR);
                break;
        }

    }
}
