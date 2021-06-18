package com.demoblaze.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class VerifyUserPage extends PageObject {

    public By userLogin = By.xpath("//a[@id='nameofuser'] ");

    public String userNameLogin(){
        return getDriver().findElement(userLogin).getText();
    }
}
