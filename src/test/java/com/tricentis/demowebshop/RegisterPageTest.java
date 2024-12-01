package com.tricentis.demowebshop;

import org.junit.jupiter.api.*;

public class RegisterPageTest extends TestMethods{

    //valid tests

    //Test 002 -> valid user account creation test (male)
    @Test
    @DisplayName("Valid Male User Creation Test")
    @Tag("Valid_User_Account_Creation")
    void validMaleUserCreationTest(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to register page
        userNavigationToRegisterPageTest(homePage);
        //valid user account creation test (male gender button)
        validMaleUserCreationTest(registerPage);
    }

    //Test 002a -> valid user account creation test (female)
    @Test
    @DisplayName("Valid Female User Creation Test")
    @Tag("Valid_User_Account_Creation")
    void validFemaleUserCreationTest(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to register page
        userNavigationToRegisterPageTest(homePage);
        //valid user account creation test (female gender button)
        validFemaleUserCreationTest(registerPage);
    }

    //invalid tests

    //Test 002b -> invalid user account creation test (no first name)
    @Test
    @DisplayName("Invalid Male User Creation Test - No First Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidMaleUserCreationNoFirstNameTest(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to register page
        userNavigationToRegisterPageTest(homePage);
        //invalid user account creation test (no first name)
        invalidUserCreationNoFirstNameTest(registerPage);
    }

    //Test 002c -> invalid user account creation test (no last name)
    @Test
    @DisplayName("Invalid Male User Creation Test - No Last Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidMaleUserCreationNoLastNameTest(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to register page
        userNavigationToRegisterPageTest(homePage);
        //invalid user account creation test (no last name)
        invalidUserCreationNoLastNameTest(registerPage);
    }

    //Test 002d -> invalid user account creation test (no email address)
    @Test
    @DisplayName("Invalid Male User Creation Test - No Email Address")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidMaleUserCreationNoEmailTest(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to register page
        userNavigationToRegisterPageTest(homePage);
        //invalid user account creation test (no email address)
        invalidUserCreationNoEmailAddressTest(registerPage);
    }

    //Test 002e -> invalid user account creation test (no password / confirm password)
    @Test
    @DisplayName("Invalid Male User Creation Test - No Password / Confirm Password")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidMaleUserCreationNoPasswordAndConfirmTest(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to register page
        userNavigationToRegisterPageTest(homePage);
        //invalid user account creation test (no password / confirm password)
        invalidUserCreationNoPasswordAndConfirmTest(registerPage);
    }
}
