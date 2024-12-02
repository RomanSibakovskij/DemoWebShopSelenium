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

    //invalid user login tests

    //Test 003a ->  invalid user account login test (no email address)
    @Test
    @DisplayName("Invalid User Account Login Test (no email address)")
    @Tag("Invalid_User_Account_Login")
    @Tag("No_Singular_Input")
    void invalidUserLoginNoEmailTest(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to register page
        userNavigationToRegisterPageTest(homePage);
        //valid user account creation test (male gender button)
        validMaleUserCreationTest(registerPage);
        //user account logout
        userLogoutTest(registerPage);
        //invalid user account login (no email address)
        invalidUserAccountNoEmailLoginTest(registerPage);
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
