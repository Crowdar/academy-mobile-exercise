package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.MenuConstans;
import com.crowdar.examples.constants.NavbarConstans;

public class MenuService {
    public static void changePassword(String newPass){
        MobileActionManager.click(NavbarConstans.MENU_BUTTON_LOCATOR);
        MobileActionManager.click(MenuConstans.CHANGE_PASSWORD_BUTTON_LOCATOR);
        MobileActionManager.setInput();
    }
}
