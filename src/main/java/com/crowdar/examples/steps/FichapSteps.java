package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;

import com.crowdar.examples.services.LoginService;
import com.crowdar.examples.services.HomeService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FichapSteps extends PageSteps {

    @Given("The app is loaded correctly.")
    public void theAppIsLoadedCorrectly() {
        LoginService.isViewLoaded();
    }



    @Then("The user logs in the application  with: (.*), (.*)")
    public void theUserLogsInTheApplicationWithEmailPassword(String email,String pass) {
        LoginService.logIn(email,pass);
    }

    @Then("Home page is displayed.")
    public void homePageIsDisplayed() {
        HomeService.isViewLoaded();
    }

    @When("The user starts the day")
    public void theUserStartsTheDay() {
        HomeService.startDay();
    }

    @Then("Timekeeper is displayed")
    public void timekeeperIsDisplayed() {
        HomeService.isTimekeeperLoaded();
    }

    @When("The user changes the password: (.*)")
    public void theUserChangesThePasswordNew_password() {
    }

    @Then("The user accept the notification successful password change")
    public void theUserAcceptTheNotificationSuccessfulPasswordChange() {
    }

    @When("The user log out of the app")
    public void theUserLogOutOfTheApp() {
    }

    @Then("Login page is displayed")
    public void loginPageIsDisplayed() {
    }
}



