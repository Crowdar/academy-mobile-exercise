package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.TravelConstants;
import org.testng.Assert;

public class TravelService {
    public static void isViewLoaded() {
        MobileActionManager.waitVisibility(TravelConstants.MENU_BUTTON_LOCATOR);
        Assert.assertTrue(MobileActionManager.isVisible(TravelConstants.MENU_BUTTON_LOCATOR));
    }
}
