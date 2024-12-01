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

    //Test 002b -> valid user account creation test (female)
    @Test
    @DisplayName("Valid Female User Creation Through Login Page Test")
    @Tag("Valid_User_Account_Creation")
    void validFemaleUserCreationThroughLoginPageTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        //valid user account creation through login page test (female gender button)
        validFemaleUserCreationThroughLoginPageTest(registerPage);
    }

    //invalid tests

    //Test 002c -> invalid user account creation test (no first name)
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

    //Test 002d -> invalid user account creation test (no last name)
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

    //Test 002e -> invalid user account creation test (no email address)
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

    //Test 002f -> invalid user account creation test (no password / confirm password)
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

    //Test 002g -> invalid user account creation test (too short first name) (the user account gets created)
    @Test
    @DisplayName("Invalid Male User Creation Test - Too Short First Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void invalidMaleUserCreationTooShortFirstNameTest(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to register page
        userNavigationToRegisterPageTest(homePage);
        //invalid user account creation test (too short first name)
        invalidUserCreationTooShortFirstNameTest(registerPage);
    }

    //Test 002h -> invalid user account creation test (too short last name) (the user account gets created)
    @Test
    @DisplayName("Invalid Male User Creation Test - Too Short Last Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void invalidMaleUserCreationTooShortLastNameTest(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to register page
        userNavigationToRegisterPageTest(homePage);
        //invalid user account creation test (too short last name)
        invalidUserCreationTooShortLastNameTest(registerPage);
    }

    //Test 002i -> invalid user account creation test (too short email address)
    @Test
    @DisplayName("Invalid Male User Creation Test - Too Short Email Address")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void invalidMaleUserCreationTooShortEmailTest(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to register page
        userNavigationToRegisterPageTest(homePage);
        //invalid user account creation test (too short email address name)
        invalidUserCreationTooShortEmailAddressNameTest(registerPage);
    }

    //Test 002k -> invalid user account creation test (too short password / confirm password)
    @Test
    @DisplayName("Invalid Male User Creation Test - Too Short Password / Confirm Password")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void invalidMaleUserCreationTooShortPasswordAndConfirmTest(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to register page
        userNavigationToRegisterPageTest(homePage);
        //invalid user account creation test (too short password / confirm password)
        invalidUserCreationTooShortPasswordAndConfirmTest(registerPage);
    }

    //Test 002l -> invalid user account creation test (too long first name) (the user account gets created)
    @Test
    @DisplayName("Invalid Male User Creation Test - Too Long First Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void invalidMaleUserCreationTooLongFirstNameTest(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to register page
        userNavigationToRegisterPageTest(homePage);
        //invalid user account creation test (too long first name)
        invalidUserCreationTooLongFirstNameTest(registerPage);
    }

    //Test 002m -> invalid user account creation test (too long last name) (the user account gets created)
    @Test
    @DisplayName("Invalid Male User Creation Test - Too Long Last Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void invalidMaleUserCreationTooLongLastNameTest(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to register page
        userNavigationToRegisterPageTest(homePage);
        //invalid user account creation test (too long last name)
        invalidUserCreationTooLongLastNameTest(registerPage);
    }

    //Test 002n -> invalid user account creation test (too long email address)
    @Test
    @DisplayName("Invalid Male User Creation Test - Too Long Email Address")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void invalidMaleUserCreationTooLongEmailTest(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to register page
        userNavigationToRegisterPageTest(homePage);
        //invalid user account creation test (too long email address name)
        invalidUserCreationTooLongEmailAddressNameTest(registerPage);
    }

    //Test 002o -> invalid user account creation test (too long password / confirm password) (the user account gets created)
    @Test
    @DisplayName("Invalid Male User Creation Test - Too Long Password / Confirm Password")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void invalidMaleUserCreationTooLongPasswordAndConfirmTest(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to register page
        userNavigationToRegisterPageTest(homePage);
        //invalid user account creation test (too long password / confirm password)
        invalidUserCreationTooLongPasswordAndConfirmTest(registerPage);
    }

    //Test 002p -> invalid user account creation test (invalid email address (by format))
    @Test
    @DisplayName("Invalid Male User Creation Test - Invalid Email Address")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Invalid_Singular_Input_Format")
    void invalidMaleUserCreationInvalidEmailTest(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to register page
        userNavigationToRegisterPageTest(homePage);
        //invalid user account creation test (invalid email address format)
        invalidUserCreationInvalidEmailAddressFormatTest(registerPage);
    }

    //Test 002q -> invalid user account creation test (already existing email address)
    @Test
    @DisplayName("Invalid Male User Creation Test - Already Existing Email Address")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Existing_Singular_Input_Format")
    void invalidMaleUserCreationExistingEmailTest(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to register page
        userNavigationToRegisterPageTest(homePage);
        //invalid user account creation test (already existing email address)
        invalidUserCreationExistingEmailAddressFormatTest(registerPage);
    }

    //Test 002r -> invalid user account creation test (too long password / confirm password)
    @Test
    @DisplayName("Invalid Male User Creation Test - Mismatching Confirm Password")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Mismatching_Singular_Input")
    void invalidMaleUserCreationMismatchingConfirmPasswordTest(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to register page
        userNavigationToRegisterPageTest(homePage);
        //invalid user account creation test (mismatching confirm password)
        invalidUserCreationMismatchingConfirmPasswordTest(registerPage);
    }
}
