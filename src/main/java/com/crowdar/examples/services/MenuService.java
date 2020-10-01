package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.MenuConstans;
import com.crowdar.examples.constants.ProfileViewConstans;


public class MenuService {
    public static void changeName(String newName){
        MobileActionManager.click(MenuConstans.MENU_BUTTON_LOCATOR);
        MobileActionManager.click(MenuConstans.PROFILE_BUTTON_LOCATOR);
        MobileActionManager.setInput(ProfileViewConstans.NAME_INPUT_LOCATOR,newName);
        MobileActionManager.waitClickable(ProfileViewConstans.SAVE_BUTTON_LOCATOR);
        MobileActionManager.click(ProfileViewConstans.ACCEPT_CHANGES_LOCATOR);
    }

    public static void logOut(){
        MobileActionManager.click(MenuConstans.MENU_BUTTON_LOCATOR);
        MobileActionManager.click(MenuConstans.SING_OUT_BUTTON_LOCATOR);
        MobileActionManager.click(MenuConstans.ACCEPT_SING_OUT_BUTTON_LOCATOR);
    }
}
