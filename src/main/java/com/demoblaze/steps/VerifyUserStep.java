package com.demoblaze.steps;

import com.demoblaze.models.Data;
import com.demoblaze.pageobjects.VerifyUserPage;
import net.thucydides.core.annotations.Step;
import org.junit.jupiter.api.Assertions;

public class VerifyUserStep {

    VerifyUserPage verifyUserPage= new VerifyUserPage();

    @Step
    public void shouldVerifyUser(Data data){
        Assertions.assertEquals(data.getUserName(),
                verifyUserPage.userNameLogin());
    }
}
