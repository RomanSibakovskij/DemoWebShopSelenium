package com.tricentis.demowebshop;

import org.junit.jupiter.api.*;

public class LoginPageTest extends TestMethods{

    //Test 003 ->  valid user account login test
    @Test
    @DisplayName("Valid User Account Login Test")
    @Tag("Valid_User_Account_Login")
    void validUserLoginTest(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to register page
        userNavigationToRegisterPageTest(homePage);
        //valid user account creation test (male gender button)
        validMaleUserCreationTest(registerPage);
        //user account logout
        userLogoutTest(registerPage);
        //valid user account login
        validUserAccountLoginTest(registerPage);
    }

    //Test 004 ->  user account logout test
    @Test
    @DisplayName("User Account Logout Test")
    @Tag("User_Account_Logout")
    void userLogoutTest(){
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
