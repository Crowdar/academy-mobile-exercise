package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.TravelConstants;
import org.testng.Assert;

public class TravelService {
    public static void isViewLoaded() {
        MobileActionManager.waitVisibility(TravelConstants.MENU_BUTTON_LOCATOR);
        Assert.assertTrue(MobileActionManager.isVisible(TravelConstants.MENU_BUTTON_LOCATOR));
    }

    public static void finnishWorkingDay(){
        MobileActionManager.click(TravelConstants.FINISH_BUTTON_SHORT_LOCATOR);
        MobileActionManager.click(TravelConstants.CONFIRM_FINISH_BUTTON_LOCATOR);
        MobileActionManager.click(TravelConstants.FINISH_WORKING_DAY_BUTTON_LOCATOR);
    }

    public static void startWorkingDay(){
        MobileActionManager.click(TravelConstants.START_WORKING_DAY_BUTTON_LOCATOR);
    }

    public static void OpenMenu(){
        MobileActionManager.click(TravelConstants.MENU_BUTTON_LOCATOR);
    }
}
