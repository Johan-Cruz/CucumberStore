package com.demoblaze.stepdefinitions;

import com.demoblaze.models.Data;
import com.demoblaze.steps.HomeStep;
import com.demoblaze.steps.LoginStep;
import com.demoblaze.steps.VerifyUserStep;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class LoginStepDefinition {

    @Steps
    HomeStep homeStep;
    @Steps
    LoginStep loginStep;
    @Steps
    VerifyUserStep verifyUserStep;

    @Given("^I enter the page$")
    public void iEnterThePage() {
        homeStep.openBrowser();
        homeStep.selectLogin();

    }

    @When("^I log in$")
    public void iLogIn(List<Data> dataList) {
        loginStep.loginUser(dataList.get(0));

    }

    @Then("^I see my name on the page$")
    public void iSeeMyNameOnThePage(List<Data> dataList) {
        verifyUserStep.shouldVerifyUser(dataList.get(0));
    }
}
