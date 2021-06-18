package com.demoblaze.pageobjects;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.demoblaze.com/")
public class HomePage extends PageObject {
    By buttonLogin = By.id("login2");

    public void clickButtonLogin(){
        getDriver().findElement(buttonLogin).click();
    }

}
