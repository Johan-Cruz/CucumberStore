package com.demoblaze.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    By userName = By.id("loginusername");
    By password = By.id("loginpassword");
    By buttonLogin = By.xpath("//body/div[@id='logInModal']/div[1]/div[1]/div[3]/button[2]");

    public void setUserName(String name){
        getDriver().findElement(userName).sendKeys(name);
    }
    public void setPassword(String userPassword){
        getDriver().findElement(password).sendKeys(userPassword);
    }
    public void clickButtonLogin(){
        getDriver().findElement(buttonLogin).click();
    }
}
