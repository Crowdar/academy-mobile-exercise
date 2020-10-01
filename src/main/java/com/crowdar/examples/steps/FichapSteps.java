package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;

import com.crowdar.examples.services.LoginService;
import com.crowdar.examples.services.HomeService;
import com.crowdar.examples.services.MenuService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FichapSteps extends PageSteps {

    @Given("The app is loaded correctly.")
    @And("Login page is displayed.")
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

    @When("The user change your name: (.*)")
    public void theUserChangesThePasswordNew_password(String NewPass) {
        MenuService.changeName(NewPass);
    }


    @When("The user ends the day")
    public void theUserEndsTheDay() {
        HomeService.endDay();
    }


    @And("The user log out of the app.")
    public void theUserLogOutOfTheApp() {
        MenuService.logOut();
    }
}



