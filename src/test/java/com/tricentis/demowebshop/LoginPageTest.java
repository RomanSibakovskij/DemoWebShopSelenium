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

    //Test 003b ->  invalid user account login test (no password)
    @Test
    @DisplayName("Invalid User Account Login Test (no password)")
    @Tag("Invalid_User_Account_Login")
    @Tag("No_Singular_Input")
    void invalidUserLoginNoPasswordTest(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to register page
        userNavigationToRegisterPageTest(homePage);
        //valid user account creation test (male gender button)
        validMaleUserCreationTest(registerPage);
        //user account logout
        userLogoutTest(registerPage);
        //invalid user account login (no password)
        invalidUserAccountNoPasswordLoginTest(registerPage);
    }

    //Test 003c ->  invalid user account login test (invalid email address)
    @Test
    @DisplayName("Invalid User Account Login Test (invalid email address)")
    @Tag("Invalid_User_Account_Login")
    @Tag("Invalid_Singular_Input")
    void invalidUserLoginInvalidEmailTest(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to register page
        userNavigationToRegisterPageTest(homePage);
        //valid user account creation test (male gender button)
        validMaleUserCreationTest(registerPage);
        //user account logout
        userLogoutTest(registerPage);
        //invalid user account login (invalid email address)
        invalidUserAccountInvalidEmailLoginTest(registerPage);
    }

    //Test 003d ->  invalid user account login test (invalid email address format)
    @Test
    @DisplayName("Invalid User Account Login Test (invalid email address format)")
    @Tag("Invalid_User_Account_Login")
    @Tag("Invalid_Singular_Input")
    void invalidUserLoginInvalidEmailFormatTest(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to register page
        userNavigationToRegisterPageTest(homePage);
        //valid user account creation test (male gender button)
        validMaleUserCreationTest(registerPage);
        //user account logout
        userLogoutTest(registerPage);
        //invalid user account login (invalid email address format)
        invalidUserAccountInvalidEmailFormatLoginTest(registerPage);
    }

    //Test 003e ->  invalid user account login test (invalid password)
    @Test
    @DisplayName("Invalid User Account Login Test (invalid password)")
    @Tag("Invalid_User_Account_Login")
    @Tag("Invalid_Singular_Input")
    void invalidUserLoginInvalidPasswordTest(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to register page
        userNavigationToRegisterPageTest(homePage);
        //valid user account creation test (male gender button)
        validMaleUserCreationTest(registerPage);
        //user account logout
        userLogoutTest(registerPage);
        //invalid user account login (invalid password)
        invalidUserAccountInvalidPasswordLoginTest(registerPage);
    }

    //user logout test

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
