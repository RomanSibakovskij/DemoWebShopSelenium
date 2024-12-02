package com.tricentis.demowebshop;

import org.junit.jupiter.api.*;

public class LoginPageTest extends TestMethods{

    //Test 003 ->  user account logout test
    @Test
    @DisplayName("User Account Logout Test")
    @Tag("User_Account_Logout")
    void validUserLogoutTest(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to register page
        userNavigationToRegisterPageTest(homePage);
        //valid user account creation test (male gender button)
        validMaleUserCreationTest(registerPage);
        //user account logout
        userLogoutTest(registerPage);
    }
}
