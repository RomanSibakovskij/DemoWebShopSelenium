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
        userNavigationToRegisterPageTest(homePage);
        //invalid user account creation test (no first name)
        invalidUserCreationNoFirstNameTest(registerPage);
    }
}
