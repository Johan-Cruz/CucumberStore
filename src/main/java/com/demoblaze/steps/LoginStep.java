package com.demoblaze.steps;

import com.demoblaze.models.Data;
import net.thucydides.core.annotations.Step;
import com.demoblaze.pageobjects.LoginPage;

public class LoginStep {

    LoginPage loginPage = new LoginPage();

    @Step
    public void loginUser(Data data){
        loginPage.setUserName(data.getUserName());
        loginPage.setPassword(data.getPassword());
        loginPage.clickButtonLogin();
    }
}
