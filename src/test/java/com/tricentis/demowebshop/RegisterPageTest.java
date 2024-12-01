package com.tricentis.demowebshop;

import org.junit.jupiter.api.*;

public class RegisterPageTest extends TestMethods{

    @Test
    @DisplayName("Valid Male User Creation Test")
    @Tag("Valid_User_Account_Creation")
    void validMaleUserCreationTest(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        userNavigationToRegisterPageTest(homePage);
        //valid user account creation test (male gender button)
        validMaleUserCreationTest(registerPage);
    }
}
