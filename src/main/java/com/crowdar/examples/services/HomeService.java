package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.FichapHomeConstans;
import com.crowdar.examples.constants.FichapLoginConstans;
import com.crowdar.examples.constants.HomeConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class HomeService {

    public static void isViewLoaded() {
        MobileActionManager.waitVisibility(FichapHomeConstans.START_DAY_BUTTON_LOCATOR);
        Assert.assertTrue(MobileActionManager.isVisible(FichapHomeConstans.START_DAY_BUTTON_LOCATOR),HomeConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }

    public static void startDay(){
        MobileActionManager.click(FichapHomeConstans.START_DAY_BUTTON_LOCATOR);
        MobileActionManager.click(FichapHomeConstans.CAMERA_BUTTON_LOCATOR);
        MobileActionManager.click(FichapHomeConstans.REPORT_ERROR_LOCATOR);
        MobileActionManager.click(FichapHomeConstans.START_DAY_BUTTON2_LOCATOR);

    }

    public static void endDay(){
        MobileActionManager.click(FichapHomeConstans.END_DAY_BUTTON_LOCATOR);
        MobileActionManager.click(FichapHomeConstans.ACCEPT_FINISH_DAY_BUTTON_LOCATOR);
        MobileActionManager.waitVisibility(FichapHomeConstans.END_BUTTON_LOCATOR);
        MobileActionManager.click(FichapHomeConstans.END_BUTTON_LOCATOR);

    }

    public static void isTimekeeperLoaded() {
        Assert.assertTrue(MobileActionManager.isVisible(FichapHomeConstans.TIMEKEEPER_LOCATOR),"Timekeeper is not displayed");
    }
}
