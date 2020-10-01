package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.MenuConstants;

public class MenuService {

    public static void closeSession(){
        MobileActionManager.click(MenuConstants.SING_OFF_BUTTON_LOCATOR);
        MobileActionManager.click(MenuConstants.CONFIRM_SING_OFF_BUTTON_LOCATOR);
    }
}
