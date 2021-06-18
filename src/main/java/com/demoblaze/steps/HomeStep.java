package com.demoblaze.steps;

import com.demoblaze.pageobjects.HomePage;
import net.thucydides.core.annotations.Step;

public class HomeStep {
    HomePage homePage = new HomePage();

    @Step
    public void openBrowser(){
        homePage.open();
    }
    @Step
    public void selectLogin (){
        homePage.clickButtonLogin();
    }
}
