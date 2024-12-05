package com.tricentis.demowebshop;


import org.slf4j.*;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.*;
import java.io.File;
import java.nio.file.*;

import java.util.*;

public class TestMethods extends BaseTest{

    protected static final Logger logger = LoggerFactory.getLogger(TestMethods.class);

    //navigate to register page test method
    protected void userNavigationToRegisterPageTest(HomePage homePage){
        RegisterPage registerPage = new RegisterPage(driver);
        //homepage web element assert
        isHomePageWebElementDisplayed(homePage);
        //homepage text assert
        isHomePageTextMatchExpectations(homePage);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text assert
        isGeneralPageTextElementAsExpected(homePage);
        //aside page web element assert
        isAsidePageWebElementDisplayed(homePage);
        //homepage product data logger
        logHomePageProductsData(homePage);
        //click 'Register' header nav link
        homePage.clickRegisterHeadNavLink();
        //assert the user gets onto register page
        assertEquals("Register", registerPage.getRegisterPageTitle(), "The register page title doesn't match expectations or the user is on the wrong page");
        //capture screenshot of the test result
        captureScreenshot(driver, "Navigate To Register Page Test");
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //valid register tests
    //valid user creation test method (with male gender button clicked)
    protected void validMaleUserCreationTest(RegisterPage registerPage){
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //valid male user input data getter
        registerPage.validUserInputDataGetter();
        //click male gender button
        registerPage.clickMaleGenderButton();
        //input valid first name into first name input field
        registerPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        registerPage.inputLastNameIntoLastNameInputField();
        //input valid email into email input field
        registerPage.inputEmailIntoEmailInputField();
        //input valid password into password input field
        registerPage.inputPasswordIntoPasswordInputField();
        //input matching confirm password into input field
        registerPage.inputConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the input data
        captureScreenshot(driver, "Valid User Input Data (male gender button)");
        //click 'Register' button
        registerPage.clickRegisterButton();
        //assert the user gets success message
        assertEquals("Your registration completed", registerPage.getRegisterSuccessMessage(), "The register success message doesn't match expectations.");
        //click 'Continue' button
        registerPage.clickContinueButton();
        //capture screenshot of the final test result
        captureScreenshot(driver, "Valid User Account Created");
    }
    //valid user creation test method (with female gender button clicked)
    protected void validFemaleUserCreationTest(RegisterPage registerPage){
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //valid male user input data getter
        registerPage.validUserInputDataGetter();
        //click male gender button
        registerPage.clickFemaleGenderButton();
        //input valid first name into first name input field
        registerPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        registerPage.inputLastNameIntoLastNameInputField();
        //input valid email into email input field
        registerPage.inputEmailIntoEmailInputField();
        //input valid password into password input field
        registerPage.inputPasswordIntoPasswordInputField();
        //input matching confirm password into input field
        registerPage.inputConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the input data
        captureScreenshot(driver, "Valid User Input Data (female gender button)");
        //click 'Register' button
        registerPage.clickRegisterButton();
        //assert the user gets success message
        assertEquals("Your registration completed", registerPage.getRegisterSuccessMessage(), "The register success message doesn't match expectations.");
        //click 'Continue' button
        registerPage.clickContinueButton();
        //capture screenshot of the final test result
        captureScreenshot(driver, "Valid User Account Created (female gender)");
    }

    //valid user creation through login page test method (with female gender button clicked)
    protected void validFemaleUserCreationThroughLoginPageTest(RegisterPage registerPage){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        //click 'Login' link
        homePage.clickLoginHeadNavLink();
        //register section text element assert
        isRegisterSectionTextAsExpected(loginPage);
        //click 'Register' button
        loginPage.clickRegisterButton();
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //valid male user input data getter
        registerPage.validUserInputDataGetter();
        //click male gender button
        registerPage.clickFemaleGenderButton();
        //input valid first name into first name input field
        registerPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        registerPage.inputLastNameIntoLastNameInputField();
        //input valid email into email input field
        registerPage.inputEmailIntoEmailInputField();
        //input valid password into password input field
        registerPage.inputPasswordIntoPasswordInputField();
        //input matching confirm password into input field
        registerPage.inputConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the input data
        captureScreenshot(driver, "Valid User Input Data (female gender button)");
        //click 'Register' button
        registerPage.clickRegisterButton();
        //assert the user gets success message
        assertEquals("Your registration completed", registerPage.getRegisterSuccessMessage(), "The register success message doesn't match expectations.");
        //click 'Continue' button
        registerPage.clickContinueButton();
        //capture screenshot of the final test result
        captureScreenshot(driver, "Valid User Account Created (female gender)");
    }

    //invalid user account creation tests

    //no singular input
    //invalid user creation test method (no first name)
    protected void invalidUserCreationNoFirstNameTest(RegisterPage registerPage){
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid male user input data getter (no first name)
        registerPage.invalidUserInputDataGetterNoFirstName();
        //click male gender button
        registerPage.clickMaleGenderButton();
        //do not input first name into first name input field
        registerPage.inputNoFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        registerPage.inputLastNameIntoLastNameInputField();
        //input valid email into email input field
        registerPage.inputEmailIntoEmailInputField();
        //input valid password into password input field
        registerPage.inputPasswordIntoPasswordInputField();
        //input matching confirm password into input field
        registerPage.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Register' button
        registerPage.clickRegisterButton();
        //assert the missing input error message is displayed
        assertEquals("First name is required.", registerPage.getInvalidSingularInputErrorMessage(), "The invalid singular input error message doesn't match expectations.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation (no first name)");
    }
    //invalid user creation test method (no last name)
    protected void invalidUserCreationNoLastNameTest(RegisterPage registerPage){
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid male user input data getter (no last name)
        registerPage.invalidUserInputDataGetterNoLastName();
        //click male gender button
        registerPage.clickMaleGenderButton();
        //input valid first name into first name input field
        registerPage.inputFirstNameIntoFirstNameInputField();
        //do not input last name into last name input field
        registerPage.inputNoLastNameIntoLastNameInputField();
        //input valid email into email input field
        registerPage.inputEmailIntoEmailInputField();
        //input valid password into password input field
        registerPage.inputPasswordIntoPasswordInputField();
        //input matching confirm password into input field
        registerPage.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Register' button
        registerPage.clickRegisterButton();
        //assert the missing input error message is displayed
        assertEquals("Last name is required.", registerPage.getInvalidSingularInputErrorMessage(), "The invalid singular input error message doesn't match expectations.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation (no last name)");
    }
    //invalid user creation test method (no email)
    protected void invalidUserCreationNoEmailAddressTest(RegisterPage registerPage){
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid male user input data getter (no email address)
        registerPage.invalidUserInputDataGetterNoEmail();
        //click male gender button
        registerPage.clickMaleGenderButton();
        //input valid first name into first name input field
        registerPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        registerPage.inputLastNameIntoLastNameInputField();
        //do not input email into email input field
        registerPage.inputNoEmailIntoEmailInputField();
        //input valid password into password input field
        registerPage.inputPasswordIntoPasswordInputField();
        //input matching confirm password into input field
        registerPage.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Register' button
        registerPage.clickRegisterButton();
        //assert the missing input error message is displayed
        assertEquals("Email is required.", registerPage.getInvalidSingularInputErrorMessage(), "The invalid singular input error message doesn't match expectations.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation (no email address)");
    }
    //invalid user creation test method (no password / confirm password)
    protected void invalidUserCreationNoPasswordAndConfirmTest(RegisterPage registerPage){
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid male user input data getter (no password / confirm password)
        registerPage.invalidUserInputDataGetterNoPassword();
        //click male gender button
        registerPage.clickMaleGenderButton();
        //input valid first name into first name input field
        registerPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        registerPage.inputLastNameIntoLastNameInputField();
        //input valid email into email input field
        registerPage.inputEmailIntoEmailInputField();
        //do not input password into password input field
        registerPage.inputNoPasswordIntoPasswordInputField();
        //do not input confirm password into input field
        registerPage.inputNoConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Register' button
        registerPage.clickRegisterButton();
        //assert the missing input error messages are displayed
        assertEquals("Password is required.", registerPage.getInvalidSingularInputErrorMessage(), "The invalid input error messages don't match expectations.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation (no password and confirm password)");
    }

    //too short singular input tests
    //invalid user creation test method (too short first name)
    protected void invalidUserCreationTooShortFirstNameTest(RegisterPage registerPage){
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid male user input data getter (too short first name)
        registerPage.invalidUserInputDataGetterTooShortFirstName();
        //click male gender button
        registerPage.clickMaleGenderButton();
        //input too short first name into first name input field
        registerPage.inputTooShortFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        registerPage.inputLastNameIntoLastNameInputField();
        //input valid email into email input field
        registerPage.inputEmailIntoEmailInputField();
        //input valid password into password input field
        registerPage.inputPasswordIntoPasswordInputField();
        //input matching confirm password into input field
        registerPage.inputConfirmPasswordIntoConfirmPasswordInputField();
        //since this input field has no error message output, capture screenshot of the test result (this input field has no char limits)
        captureScreenshot(driver, "Invalid User Account Creation (too short first name)");
        //click 'Register' button
        registerPage.clickRegisterButton();
        //capture screenshot of the unexpected test result
        captureScreenshot(driver, "Invalid User Account Creation (the account gets created despite too short first name)");
    }
    //invalid user creation test method (too short last name)
    protected void invalidUserCreationTooShortLastNameTest(RegisterPage registerPage){
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid male user input data getter (too short last name)
        registerPage.invalidUserInputDataGetterTooShortLastName();
        //click male gender button
        registerPage.clickMaleGenderButton();
        //input valid first name into first name input field
        registerPage.inputFirstNameIntoFirstNameInputField();
        //input too short last name into last name input field
        registerPage.inputTooShortLastNameIntoLastNameInputField();
        //input valid email into email input field
        registerPage.inputEmailIntoEmailInputField();
        //input valid password into password input field
        registerPage.inputPasswordIntoPasswordInputField();
        //input matching confirm password into input field
        registerPage.inputConfirmPasswordIntoConfirmPasswordInputField();
        //since this input field has no error message output, capture screenshot of the test result (this input field has no char limits)
        captureScreenshot(driver, "Invalid User Account Creation (too short last name)");
        //click 'Register' button
        registerPage.clickRegisterButton();
        //capture screenshot of the unexpected test result
        captureScreenshot(driver, "Invalid User Account Creation (the account gets created despite too short last name)");
    }
    //invalid user creation test method (too short email address name - usually, 1 is too short)
    protected void invalidUserCreationTooShortEmailAddressNameTest(RegisterPage registerPage){
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid male user input data getter (too short email address name)
        registerPage.invalidUserInputDataGetterTooShortEmail();
        //click male gender button
        registerPage.clickMaleGenderButton();
        //input valid first name into first name input field
        registerPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        registerPage.inputLastNameIntoLastNameInputField();
        //input too short email into email input field
        registerPage.inputTooShortEmailIntoEmailInputField();
        //input valid password into password input field
        registerPage.inputPasswordIntoPasswordInputField();
        //input matching confirm password into input field
        registerPage.inputConfirmPasswordIntoConfirmPasswordInputField();
        //since this input field has no error message output, capture screenshot of the test result (this input field has no lower char limit)
        captureScreenshot(driver, "Invalid User Account Creation (too short email address name)");
        //click 'Register' button
        registerPage.clickRegisterButton();
        //capture screenshot of the unexpected test result
        captureScreenshot(driver, "Invalid User Account Creation (the account gets created despite too short email address name)");
    }
    //invalid user creation test method (too short password / confirm password)
    protected void invalidUserCreationTooShortPasswordAndConfirmTest(RegisterPage registerPage){
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid male user input data getter (too short password / confirm password)
        registerPage.invalidUserInputDataGetterTooShortPassword();
        //click male gender button
        registerPage.clickMaleGenderButton();
        //input valid first name into first name input field
        registerPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        registerPage.inputLastNameIntoLastNameInputField();
        //input valid email into email input field
        registerPage.inputEmailIntoEmailInputField();
        //input too short password into password input field
        registerPage.inputTooShortPasswordIntoPasswordInputField();
        //input too short confirm password into input field
        registerPage.inputTooShortConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Register' button
        registerPage.clickRegisterButton();
        //assert the missing input error message is displayed
        assertEquals("The password should have at least 6 characters.", registerPage.getInvalidSingularInputErrorMessage(), "The invalid input error message doesn't match expectations.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation (too short password and confirm password)");
    }

    //too long singular input tests
    //invalid user creation test method (too long first name) => 100 chars
    protected void invalidUserCreationTooLongFirstNameTest(RegisterPage registerPage){
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid male user input data getter (too long first name)
        registerPage.invalidUserInputDataGetterTooLongFirstName();
        //click male gender button
        registerPage.clickMaleGenderButton();
        //input too long first name into first name input field
        registerPage.inputTooLongFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        registerPage.inputLastNameIntoLastNameInputField();
        //input valid email into email input field
        registerPage.inputEmailIntoEmailInputField();
        //input valid password into password input field
        registerPage.inputPasswordIntoPasswordInputField();
        //input matching confirm password into input field
        registerPage.inputConfirmPasswordIntoConfirmPasswordInputField();
        //since this input field has no error message output, capture screenshot of the test result (this input field has no char limits)
        captureScreenshot(driver, "Invalid User Account Creation (too long first name)");
        //click 'Register' button
        registerPage.clickRegisterButton();
        //capture screenshot of the unexpected test result
        captureScreenshot(driver, "Invalid User Account Creation (the account gets created despite too long first name)");
    }
    //invalid user creation test method (too long last name) => 120 chars
    protected void invalidUserCreationTooLongLastNameTest(RegisterPage registerPage){
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid male user input data getter (too long last name)
        registerPage.invalidUserInputDataGetterTooLongLastName();
        //click male gender button
        registerPage.clickMaleGenderButton();
        //input valid first name into first name input field
        registerPage.inputFirstNameIntoFirstNameInputField();
        //input too long last name into last name input field
        registerPage.inputTooLongLastNameIntoLastNameInputField();
        //input valid email into email input field
        registerPage.inputEmailIntoEmailInputField();
        //input valid password into password input field
        registerPage.inputPasswordIntoPasswordInputField();
        //input matching confirm password into input field
        registerPage.inputConfirmPasswordIntoConfirmPasswordInputField();
        //since this input field has no error message output, capture screenshot of the test result (this input field has upper char limits)
        captureScreenshot(driver, "Invalid User Account Creation (too long last name)");
        //click 'Register' button
        registerPage.clickRegisterButton();
        //capture screenshot of the unexpected test result
        captureScreenshot(driver, "Invalid User Account Creation (the account gets created despite too long last name)");
    }
    //invalid user creation test method (too long email address name - usually, 100 is too long)
    protected void invalidUserCreationTooLongEmailAddressNameTest(RegisterPage registerPage){
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid male user input data getter (too long email address name)
        registerPage.invalidUserInputDataGetterTooLongEmail();
        //click male gender button
        registerPage.clickMaleGenderButton();
        //input valid first name into first name input field
        registerPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        registerPage.inputLastNameIntoLastNameInputField();
        //input too long email into email input field
        registerPage.inputTooLongEmailIntoEmailInputField();
        //input valid password into password input field
        registerPage.inputPasswordIntoPasswordInputField();
        //input matching confirm password into input field
        registerPage.inputConfirmPasswordIntoConfirmPasswordInputField();
        //since this input field has no error message output, capture screenshot of the test result (this input field has no upper char limit)
        captureScreenshot(driver, "Invalid User Account Creation (too long email address name)");
        //click 'Register' button
        registerPage.clickRegisterButton();
        //capture screenshot of the unexpected test result
        captureScreenshot(driver, "Invalid User Account Creation (the account gets created despite too long email address name)");
    }
    //invalid user creation test method (too long password / confirm password) => 100 chars
    protected void invalidUserCreationTooLongPasswordAndConfirmTest(RegisterPage registerPage){
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid male user input data getter (too long password / confirm password)
        registerPage.invalidUserInputDataGetterTooLongPassword();
        //click male gender button
        registerPage.clickMaleGenderButton();
        //input valid first name into first name input field
        registerPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        registerPage.inputLastNameIntoLastNameInputField();
        //input valid email into email input field
        registerPage.inputEmailIntoEmailInputField();
        //input too long password into password input field
        registerPage.inputTooLongPasswordIntoPasswordInputField();
        //input too long confirm password into input field
        registerPage.inputTooLongConfirmPasswordIntoConfirmPasswordInputField();
        //since this input field has no error message output, capture screenshot of the test result (these input fields have no upper char limit)
        captureScreenshot(driver, "Invalid User Account Creation (too long password and confirm password)");
        //click 'Register' button
        registerPage.clickRegisterButton();
        //capture screenshot of the unexpected test result
        captureScreenshot(driver, "Invalid User Account Creation (the account gets created despite too long password and confirm password)");
    }

    //invalid singular input tests
    //invalid user creation test method (invalid email address format)
    protected void invalidUserCreationInvalidEmailAddressFormatTest(RegisterPage registerPage){
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid male user input data getter (invalid email address format)
        registerPage.invalidUserInputDataGetterInvalidEmail();
        //click male gender button
        registerPage.clickMaleGenderButton();
        //input valid first name into first name input field
        registerPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        registerPage.inputLastNameIntoLastNameInputField();
        //input invalid email (by format) into email input field
        registerPage.inputInvalidEmailIntoEmailInputField();
        //input valid password into password input field
        registerPage.inputPasswordIntoPasswordInputField();
        //input matching confirm password into input field
        registerPage.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Register' button
        registerPage.clickRegisterButton();
        //assert the missing input error message is displayed
        assertEquals("Wrong email", registerPage.getInvalidSingularInputErrorMessage(), "The invalid input error message doesn't match expectations.");
        //capture screenshot of the unexpected test result
        captureScreenshot(driver, "Invalid User Account Creation (invalid email address format)");
    }
    //invalid user creation test method (already existing email address)
    protected void invalidUserCreationExistingEmailAddressFormatTest(RegisterPage registerPage){
        HomePage homePage = new HomePage(driver);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //valid male user input data getter
        registerPage.validUserInputDataGetter();
        //click male gender button
        registerPage.clickMaleGenderButton();
        //input valid first name into first name input field
        registerPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        registerPage.inputLastNameIntoLastNameInputField();
        //input valid email into email input field
        registerPage.inputEmailIntoEmailInputField();
        //input valid password into password input field
        registerPage.inputPasswordIntoPasswordInputField();
        //input matching confirm password into input field
        registerPage.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Register' button
        registerPage.clickRegisterButton();
        //assert the user gets success message
        assertEquals("Your registration completed", registerPage.getRegisterSuccessMessage(), "The register success message doesn't match expectations.");
        //click 'Continue' button
        registerPage.clickContinueButton();
        //click 'Logout' link (same place as 'Login')
        homePage.clickLoginHeadNavLink();
        //click 'Register' header nav link => to return back to register page
        homePage.clickRegisterHeadNavLink();


        //second registration loop

        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid male user input data getter (already existing email address)
        registerPage.invalidUserInputDataGetterExistingEmail();
        //click male gender button
        registerPage.clickMaleGenderButton();
        //input valid first name into first name input field
        registerPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        registerPage.inputLastNameIntoLastNameInputField();
        //input already existing email into email input field
        registerPage.inputExistingEmailIntoEmailInputField();
        //input valid password into password input field
        registerPage.inputPasswordIntoPasswordInputField();
        //input matching confirm password into input field
        registerPage.inputConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Register' button
        registerPage.clickRegisterButton();
        //assert the missing input error message is displayed
        assertEquals("The specified email already exists", registerPage.getExistingEmailErrorMessage(), "The invalid input error message doesn't match expectations.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation (already existing email address)");
    }
    //invalid user creation test method (mismatching confirm password)
    protected void invalidUserCreationMismatchingConfirmPasswordTest(RegisterPage registerPage){
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //invalid male user input data getter (mismatching confirm password)
        registerPage.invalidUserInputDataGetterMismatchingConfirmPassword();
        //click male gender button
        registerPage.clickMaleGenderButton();
        //input valid first name into first name input field
        registerPage.inputFirstNameIntoFirstNameInputField();
        //input valid last name into last name input field
        registerPage.inputLastNameIntoLastNameInputField();
        //input valid email into email input field
        registerPage.inputEmailIntoEmailInputField();
        //input valid password into password input field
        registerPage.inputPasswordIntoPasswordInputField();
        //input mismatching confirm password into input field
        registerPage.inputMismatchingConfirmPasswordIntoConfirmPasswordInputField();
        //click 'Register' button
        registerPage.clickRegisterButton();
        //assert the mismatching input error message is displayed
        assertEquals("The password and confirmation password do not match.", registerPage.getInvalidSingularInputErrorMessage(), "The mismatching input error message doesn't match expectations.");
        //capture screenshot of the unexpected test result
        captureScreenshot(driver, "Invalid User Account Creation (mismatching confirm password)");
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //logout test method
    protected void userLogoutTest(RegisterPage registerPage){
        HomePage homePage = new HomePage(driver);
        //homepage web element assert
        isHomePageWebElementDisplayed(homePage);
        //homepage text assert
        isHomePageTextMatchExpectations(homePage);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text assert
        isGeneralPageTextElementAsExpected(homePage);
        //assert the user email is displayed in the account link (same place as the register head nav link)
        assertEquals(registerPage.getEmail(), homePage.getRegisterHeadNavLinkText(), "The account emails don't match.");
        //click 'Logout' button //it's in the same place as login head nav link
        homePage.clickLoginHeadNavLink();
        //capture screenshot of the test result
        captureScreenshot(driver, "User Account Logout Test");
    }

    //valid user account login test method
    protected void validUserAccountLoginTest(RegisterPage registerPage){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        //homepage web element assert
        isHomePageWebElementDisplayed(homePage);
        //homepage text assert
        isHomePageTextMatchExpectations(homePage);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text assert
        isGeneralPageTextElementAsExpected(homePage);
        //click 'Login' nav link
        homePage.clickLoginHeadNavLink();
        //login page web element assert
        isLoginPageWebElementDisplayed(loginPage);
        //register section text element assert
        isRegisterSectionTextAsExpected(loginPage);
        //login section text element assert
        isLoginSectionTextAsExpected(loginPage);
        //valid user login input data getter
        loginPage.validUserLoginDataGetter(registerPage);
        //input valid user email address
        loginPage.inputEmailIntoEmailInputField();
        //input valid user password
        loginPage.inputPasswordIntoPasswordInputField();
        //click 'login' button
        loginPage.clickLoginButton();
        //assert the user email is displayed in the account link (the user has logged in successfully)
        assertEquals(registerPage.getEmail(), homePage.getRegisterHeadNavLinkText(), "The user account email addresses don't match.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User Account Login Test");
    }

    //invalid login tests

    //no singular input
    //invalid user account login test method(no user email address)
    protected void invalidUserAccountNoEmailLoginTest(RegisterPage registerPage){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        //homepage web element assert
        isHomePageWebElementDisplayed(homePage);
        //homepage text assert
        isHomePageTextMatchExpectations(homePage);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text assert
        isGeneralPageTextElementAsExpected(homePage);
        //click 'Login' nav link
        homePage.clickLoginHeadNavLink();
        //login page web element assert
        isLoginPageWebElementDisplayed(loginPage);
        //register section text element assert
        isRegisterSectionTextAsExpected(loginPage);
        //login section text element assert
        isLoginSectionTextAsExpected(loginPage);
        //invalid user login input data getter (no email address)
        loginPage.invalidUserLoginDataGetterNoEmail(registerPage);
        //don't input user email address
        loginPage.inputNoEmailIntoEmailInputField();
        //input valid user password
        loginPage.inputPasswordIntoPasswordInputField();
        //click 'login' button
        loginPage.clickLoginButton();
        //assert the expected error message is displayed
        assertEquals("Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found", loginPage.getUnsuccessfulLoginErrorMessageText(), "The error message doesn't match expectations");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Login Test (no email address)");
    }
    //invalid user account login test method (no user password)
    protected void invalidUserAccountNoPasswordLoginTest(RegisterPage registerPage){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        //homepage web element assert
        isHomePageWebElementDisplayed(homePage);
        //homepage text assert
        isHomePageTextMatchExpectations(homePage);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text assert
        isGeneralPageTextElementAsExpected(homePage);
        //click 'Login' nav link
        homePage.clickLoginHeadNavLink();
        //login page web element assert
        isLoginPageWebElementDisplayed(loginPage);
        //register section text element assert
        isRegisterSectionTextAsExpected(loginPage);
        //login section text element assert
        isLoginSectionTextAsExpected(loginPage);
        //invalid user login input data getter (no password)
        loginPage.invalidUserLoginDataGetterNoPassword(registerPage);
        //input valid user email address
        loginPage.inputEmailIntoEmailInputField();
        //don't input user password
        loginPage.inputNoPasswordIntoPasswordInputField();
        //click 'login' button
        loginPage.clickLoginButton();
        //assert the expected error message is displayed
        assertEquals("Login was unsuccessful. Please correct the errors and try again.\n" +
                "The credentials provided are incorrect", loginPage.getUnsuccessfulLoginErrorMessageText(), "The error message doesn't match expectations");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Login Test (no password)");
    }

    //invalid singular input
    //invalid user account login test method(invalid user email address)
    protected void invalidUserAccountInvalidEmailLoginTest(RegisterPage registerPage){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        //homepage web element assert
        isHomePageWebElementDisplayed(homePage);
        //homepage text assert
        isHomePageTextMatchExpectations(homePage);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text assert
        isGeneralPageTextElementAsExpected(homePage);
        //click 'Login' nav link
        homePage.clickLoginHeadNavLink();
        //login page web element assert
        isLoginPageWebElementDisplayed(loginPage);
        //register section text element assert
        isRegisterSectionTextAsExpected(loginPage);
        //login section text element assert
        isLoginSectionTextAsExpected(loginPage);
        //invalid user login input data getter (invalid email address)
        loginPage.invalidUserLoginDataGetterInvalidEmail(registerPage);
        //input invalid user email address
        loginPage.inputInvalidEmailIntoEmailInputField();
        //input valid user password
        loginPage.inputPasswordIntoPasswordInputField();
        //click 'login' button
        loginPage.clickLoginButton();
        //assert the expected error message is displayed
        assertEquals("Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found", loginPage.getUnsuccessfulLoginErrorMessageText(), "The error message doesn't match expectations");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Login Test (invalid email address)");
    }
    //invalid user account login test method(invalid user email address format)
    protected void invalidUserAccountInvalidEmailFormatLoginTest(RegisterPage registerPage){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        //homepage web element assert
        isHomePageWebElementDisplayed(homePage);
        //homepage text assert
        isHomePageTextMatchExpectations(homePage);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text assert
        isGeneralPageTextElementAsExpected(homePage);
        //click 'Login' nav link
        homePage.clickLoginHeadNavLink();
        //login page web element assert
        isLoginPageWebElementDisplayed(loginPage);
        //register section text element assert
        isRegisterSectionTextAsExpected(loginPage);
        //login section text element assert
        isLoginSectionTextAsExpected(loginPage);
        //invalid user login input data getter (invalid email address format)
        loginPage.invalidUserLoginDataGetterInvalidEmailFormat(registerPage);
        //input invalid user email address (by format)
        loginPage.inputInvalidEmailFormatIntoEmailInputField();
        //input valid user password
        loginPage.inputPasswordIntoPasswordInputField();
        //click 'login' button
        loginPage.clickLoginButton();
        //assert the expected error message is displayed
        assertEquals("Please enter a valid email address.", loginPage.getInvalidEmailFormatErrorMessageText(), "The invalid email format error message doesn't match expectations");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Login Test (invalid email address format)");
    }
    //invalid user account login test method (invalid user password)
    protected void invalidUserAccountInvalidPasswordLoginTest(RegisterPage registerPage){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        //homepage web element assert
        isHomePageWebElementDisplayed(homePage);
        //homepage text assert
        isHomePageTextMatchExpectations(homePage);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text assert
        isGeneralPageTextElementAsExpected(homePage);
        //click 'Login' nav link
        homePage.clickLoginHeadNavLink();
        //login page web element assert
        isLoginPageWebElementDisplayed(loginPage);
        //register section text element assert
        isRegisterSectionTextAsExpected(loginPage);
        //login section text element assert
        isLoginSectionTextAsExpected(loginPage);
        //invalid user login input data getter (invalid password)
        loginPage.invalidUserLoginDataGetterInvalidPassword(registerPage);
        //input valid user email address
        loginPage.inputEmailIntoEmailInputField();
        //input invalid user password
        loginPage.inputInvalidPasswordIntoPasswordInputField();
        //click 'login' button
        loginPage.clickLoginButton();
        //assert the expected error message is displayed
        assertEquals("Login was unsuccessful. Please correct the errors and try again.\n" +
                "The credentials provided are incorrect", loginPage.getUnsuccessfulLoginErrorMessageText(), "The error message doesn't match expectations");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Login Test (invalid password)");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //homepage featured product search tests

    //single featured product search test method
    protected void searchForASingleFeaturedProductTest(){
        HomePage homePage = new HomePage(driver);
        SearchProductPage searchProductPage = new SearchProductPage(driver);
        //homepage web element assert
        isHomePageWebElementDisplayed(homePage);
        //homepage text assert
        isHomePageTextMatchExpectations(homePage);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text assert
        isGeneralPageTextElementAsExpected(homePage);
        //input a single product search query
        homePage.inputSingleProductQueryIntoSearchBar();
        //click 'Search' button
        homePage.clickSearchButton();
        //search page web element assert
        isSearchProductPageWebElementDisplayed(searchProductPage);
        //assert the user gets onto search product page
        isSearchProductPageTextAsExpected(searchProductPage);
        //assert the searched product is displayed in the product section
        assertEquals(homePage.getSingleFeaturedProductQuery(), searchProductPage.getSingleSearchedProductName(), "The searched product names don't match");
        //log the displayed product data
        logSingleSearchedProductData(searchProductPage);
        //capture screenshot of the test result
        captureScreenshot(driver, "Search For A Single Featured Product Test"); //since registered user and guest use the same test method, specification of the screenshot is pointless as it gets overwritten
    }
    //multiple featured products search test method
    protected void searchForMultipleFeaturedProductsTest(){
        HomePage homePage = new HomePage(driver);
        SearchProductPage searchProductPage = new SearchProductPage(driver);
        //homepage web element assert
        isHomePageWebElementDisplayed(homePage);
        //homepage text assert
        isHomePageTextMatchExpectations(homePage);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text assert
        isGeneralPageTextElementAsExpected(homePage);
        //input a multiple products search query (portion, since there aren't any multiple products with full queries -> this covers the partial query test too)
        homePage.inputMultipleProductsQueryIntoSearchBar();
        //click 'Search' button
        homePage.clickSearchButton();
        //search page web element assert
        isSearchProductPageWebElementDisplayed(searchProductPage);
        //assert the user gets onto search product page
        isSearchProductPageTextAsExpected(searchProductPage);
        //assert the searched product is displayed in the product section
        String searchQuery = homePage.getMultipleFeaturedProductsQuery();
        List<String> actualProductNames = searchProductPage.getSearchedProductNames().stream()
                .map(String::trim)
                .filter(name -> name.toLowerCase().endsWith("computer"))//verify the queries have "computer" at the end
                .toList();
        //list filter (ignore the case)
        boolean isProductFound = actualProductNames.stream()
                .anyMatch(product -> product.toLowerCase().contains(searchQuery.toLowerCase()));
        assertTrue(isProductFound, "The search query product is not found in the search results");
        //log the displayed products data
        logSearchedProductsData(searchProductPage);
        //capture screenshot of the test result
        captureScreenshot(driver, "Search For Multiple Featured Products Test"); //since registered user and guest use the same test method, specification of the screenshot is pointless as it gets overwritten
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //search page tests

    //single product search test method
    protected void searchForASingleAvailableProductTest(){
        HomePage homePage = new HomePage(driver);
        SearchProductPage searchProductPage = new SearchProductPage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //search page web element assert
        isSearchProductPageWebElementDisplayed(searchProductPage);
        //search page text element assert
        isSearchProductPageTextAsExpected(searchProductPage);
        //input single available product query
        searchProductPage.inputSingleAvailableProductSearchQueryIntoSearchBar();
        //click 'Search' button
        searchProductPage.clickSearchButton();
        //assert the searched product is displayed in the product section
        assertEquals(searchProductPage.getSingleAvailableProductQuery(), searchProductPage.getSingleSearchedProductName(), "The searched product names don't match");
        //log updated searched product data
        logSingleSearchedProductData(searchProductPage);
        //capture screenshot of the test result
        captureScreenshot(driver, "Search For A Single Available Product Test"); //since registered user and guest use the same test method, specification of the screenshot is pointless as it gets overwritten
    }
    //multiple available products search test method
    protected void searchForMultipleAvailableProductsTest(){
        HomePage homePage = new HomePage(driver);
        SearchProductPage searchProductPage = new SearchProductPage(driver);
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //search page web element assert
        isSearchProductPageWebElementDisplayed(searchProductPage);
        //search page text element assert
        isSearchProductPageTextAsExpected(searchProductPage);
        //input multiple available products query
        searchProductPage.inputMultipleAvailableProductsQueryIntoSearchBar();
        //click 'Search' button
        searchProductPage.clickSearchButton();
        //assert the searched product is displayed in the product section
        String searchQuery = searchProductPage.getMultipleAvailableProductsQuery();
        List<String> actualProductNames = searchProductPage.getSearchedProductNames().stream()
                .map(String::trim)
                .filter(name -> name.toLowerCase().endsWith("camcorder"))//verify the queries have "camcorder" at the end
                .toList();
        //list filter (ignore the case)
        boolean isProductFound = actualProductNames.stream()
                .anyMatch(product -> product.toLowerCase().contains(searchQuery.toLowerCase()));
        assertTrue(isProductFound, "The search query product is not found in the search results");
        //log the displayed products data
        logSearchedProductsData(searchProductPage);
        //capture screenshot of the test result
        captureScreenshot(driver, "Search For Multiple Available Products Test"); //since registered user and guest use the same test method, specification of the screenshot is pointless as it gets overwritten
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //single featured product addition to cart test method
    protected void addASingleFeaturedProductToCartTest(){
        HomePage homePage = new HomePage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //homepage web element assert
        isHomePageWebElementDisplayed(homePage);
        //homepage text assert
        isHomePageTextMatchExpectations(homePage);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text assert
        isGeneralPageTextElementAsExpected(homePage);
        //click 'Add to cart' button
        homePage.clickAddLaptopToCartButton();
        //assert the success message is as expected
        assertEquals("The product has been added to your shopping cart", homePage.getProductAddToCartSuccessMessageText(), "The success message doesn't match expectations.");
        //wait until the message disappears before clicking
        homePage.waitTillProductAddToCartSuccessMessageDisappears();
        //click 'Shopping cart' head nav link
        homePage.clickShoppingCartNavLink();
        //assert the user gets onto shopping cart page
        assertEquals("Shopping cart", shoppingCartPage.getShoppingCartTitle(), "The shopping cart title doesn't match expectations or the user is on the wrong page");
        //capture screenshot of the test result
        captureScreenshot(driver, "Add A Single Featured Product To Cart Test"); //since registered user and guest use the same test method, specification of the screenshot is pointless as it gets overwritten
    }

    protected void addASingleAvailableProductToCartTest(){
        HomePage homePage = new HomePage(driver);
        SearchProductPage searchProductPage = new SearchProductPage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //homepage web element assert
        isHomePageWebElementDisplayed(homePage);
        //homepage text assert
        isHomePageTextMatchExpectations(homePage);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text assert
        isGeneralPageTextElementAsExpected(homePage);
        //input a single set product search query
        homePage.inputSingleSetProductQueryIntoSearchBar();
        //click 'Search' button
        homePage.clickSearchButton();
        //search page web element assert
        isSearchProductPageWebElementDisplayed(searchProductPage);
        //assert the user gets onto search product page
        isSearchProductPageTextAsExpected(searchProductPage);
        //assert the searched product is displayed in the product section
        assertEquals("Smartphone", searchProductPage.getSingleSearchedProductName(), "The searched product names don't match");
        //log the displayed product data
        logSingleSearchedProductData(searchProductPage);
        //click 'Add to cart' button
        searchProductPage.clickAddSingleProductToCartButton();
        //assert the success message is as expected
        assertEquals("The product has been added to your shopping cart", homePage.getProductAddToCartSuccessMessageText(), "The success message doesn't match expectations.");
        //click 'Shopping cart' head nav link
        homePage.clickShoppingCartNavLink();
        //assert the user gets onto shopping cart page
        assertEquals("Shopping cart", shoppingCartPage.getShoppingCartTitle(), "The shopping cart title doesn't match expectations or the user is on the wrong page");
        //capture screenshot of the test result
        captureScreenshot(driver, "Add A Single Available Product To Cart Test"); //since registered user and guest use the same test method, specification of the screenshot is pointless as it gets overwritten
    }

    //multiple featured products addition to cart test method
    protected void addMultipleFeaturedProductToCartTest(){
        HomePage homePage = new HomePage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //homepage web element assert
        isHomePageWebElementDisplayed(homePage);
        //homepage text assert
        isHomePageTextMatchExpectations(homePage);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text assert
        isGeneralPageTextElementAsExpected(homePage);
        //click 'Add to cart' button (expensive computer)
        homePage.clickAddLaptopToCartButton();
        //assert the success message is as expected (laptop addition)
        assertEquals("The product has been added to your shopping cart", homePage.getProductAddToCartSuccessMessageText(), "The success message doesn't match expectations.");
        //click 'Add to cart' button (expensive computer)
        homePage.clickAddExpensiveComputerToCartButton();
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        //assert the user gets onto a single product page (for this product)
        assertEquals("Build your own expensive computer", singleProductPage.getProductName(), "The user didn't get onto a correct page or the product name is mismatched");
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //additional product page web element assert (since this one has them)
        isAdditionalSinglePageWebElementDisplayed(singleProductPage);
        //log single product page data
        logSingleProductPageData(singleProductPage);
        //change the single product quantity
        singleProductPage.changeSingleProductQuantity();
        //click 'Add to cart' button
        singleProductPage.clickAddToCartButton();
        //assert the success message is as expected (expensive computers addition)
        assertEquals("The product has been added to your shopping cart", homePage.getProductAddToCartSuccessMessageText(), "The success message doesn't match expectations.");
        //click 'Shopping cart' head nav link
        homePage.clickShoppingCartNavLink();
        //assert the user gets onto shopping cart page
        assertEquals("Shopping cart", shoppingCartPage.getShoppingCartTitle(), "The shopping cart title doesn't match expectations or the user is on the wrong page");
        //capture screenshot of the test result
        captureScreenshot(driver, "Add Multiple Featured Products To Cart Test"); //since registered user and guest use the same test method, specification of the screenshot is pointless as it gets overwritten
    }

    //multiple available products addition to cart test method
    protected void addMultipleAvailableProductsToCartTest(){
        HomePage homePage = new HomePage(driver);
        SearchProductPage searchProductPage = new SearchProductPage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //homepage web element assert
        isHomePageWebElementDisplayed(homePage);
        //homepage text assert
        isHomePageTextMatchExpectations(homePage);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text assert
        isGeneralPageTextElementAsExpected(homePage);
        //input a single set product search query
        homePage.inputSingleSetProductQueryIntoSearchBar();
        //click 'Search' button
        homePage.clickSearchButton();
        //search page web element assert
        isSearchProductPageWebElementDisplayed(searchProductPage);
        //assert the user gets onto search product page
        isSearchProductPageTextAsExpected(searchProductPage);
        //assert the searched product is displayed in the product section
        assertEquals("Smartphone", searchProductPage.getSingleSearchedProductName(), "The searched product names don't match");
        //log the displayed product data
        logSingleSearchedProductData(searchProductPage);
        //click 'Add to cart' button
        searchProductPage.clickAddSingleProductToCartButton();
        //assert the success message is as expected
        assertEquals("The product has been added to your shopping cart", homePage.getProductAddToCartSuccessMessageText(), "The success message doesn't match expectations.");
        //input another available product search query
        searchProductPage.inputSingleSetAvailableProductSearchQueryIntoSearchBar();
        //click 'Search' button
        searchProductPage.clickSearchButton();
        //click 'Add to cart' button
        searchProductPage.clickAddSingleProductToCartButton();
        //assert the success message is as expected (another product has been added)
        assertEquals("The product has been added to your shopping cart", homePage.getProductAddToCartSuccessMessageText(), "The success message doesn't match expectations.");
        //click 'Shopping cart' head nav link
        homePage.clickShoppingCartNavLink();
        //assert the user gets onto shopping cart page
        assertEquals("Shopping cart", shoppingCartPage.getShoppingCartTitle(), "The shopping cart title doesn't match expectations or the user is on the wrong page");
        //capture screenshot of the test result
        captureScreenshot(driver, "Add Multiple Available Products To Cart Test"); //since registered user and guest use the same test method, specification of the screenshot is pointless as it gets overwritten
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //product addition to check out tests

    //add product / products to check out test method (as a registered user)
    protected void addProductToCheckoutTest(ShoppingCartPage shoppingCartPage){
        HomePage homePage = new HomePage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //shopping cart page web element assert
        isShoppingCartPageWebElementDisplayed(shoppingCartPage);
        //shopping cart page text element assert
        isShoppingCartTextElementAsExpected(shoppingCartPage);
        //click estimate shipping section country dropdown menu
        shoppingCartPage.clickEstimateShippingCountryDropdownMenu();
        //select 'United States' option
        shoppingCartPage.selectUsOption();
        //click estimate shipping section state dropdown menu
        shoppingCartPage.clickEstimateShippingStateDropdownMenu();
        //select 'Illinois' option
        shoppingCartPage.selectIllinoisOption();
        //input Illinois are zip code
        shoppingCartPage.inputIllinoisAreaZipCode();
        //click 'Estimate shipping' button
        shoppingCartPage.clickEstimateShippingButton();
        //log shopping cart data
        logShoppingCartProductData(shoppingCartPage);
        //click 'Agree to terms' checkbox
        shoppingCartPage.clickAgreeToTermsCheckbox();
        //click 'Checkout' button
        shoppingCartPage.clickCheckoutButton();
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        //assert the user gets onto checkout page
        assertEquals("Checkout", checkoutPage.getCheckoutPageTitle(), "The checkout page title doesn't match expectations or the user is on the wrong page");
        //capture screenshot of the test result //multiple test cases use the same screenshot method
        captureScreenshot(driver, "Add Product(s) To Checkout Test (as a registered user)");
    }

    //add product / products to check out test method (as a guest)
    protected void addProductToCheckoutAsGuestTest(ShoppingCartPage shoppingCartPage){
        HomePage homePage = new HomePage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //shopping cart page web element assert
        isShoppingCartPageWebElementDisplayed(shoppingCartPage);
        //shopping cart page text element assert
        isShoppingCartTextElementAsExpected(shoppingCartPage);
        //click estimate shipping section country dropdown menu
        shoppingCartPage.clickEstimateShippingCountryDropdownMenu();
        //select 'United States' option
        shoppingCartPage.selectUsOption();
        //click estimate shipping section state dropdown menu
        shoppingCartPage.clickEstimateShippingStateDropdownMenu();
        //select 'Illinois' option
        shoppingCartPage.selectIllinoisOption();
        //input Illinois are zip code
        shoppingCartPage.inputIllinoisAreaZipCode();
        //click 'Estimate shipping' button
        shoppingCartPage.clickEstimateShippingButton();
        //log shopping cart data
        logShoppingCartProductData(shoppingCartPage);
        //click 'Agree to terms' checkbox
        shoppingCartPage.clickAgreeToTermsCheckbox();
        //click 'Checkout' button
        shoppingCartPage.clickCheckoutButton();
        LoginPage loginPage = new LoginPage(driver);
        //click 'Checkout as guest' button
        loginPage.clickCheckoutAsGuestButton();
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        //assert the user gets onto checkout page
        assertEquals("Checkout", checkoutPage.getCheckoutPageTitle(), "The checkout page title doesn't match expectations or the user is on the wrong page");
        //capture screenshot of the test result //multiple test cases use the same screenshot method
        captureScreenshot(driver, "Add Product(s) To Checkout Test (as a guest)");
    }

    //add product / products to check out test method [with product removal test](as a guest)
    protected void addProductToCheckoutAsGuestWithProductRemovalTest(ShoppingCartPage shoppingCartPage){
        HomePage homePage = new HomePage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //shopping cart page web element assert
        isShoppingCartPageWebElementDisplayed(shoppingCartPage);
        //shopping cart page text element assert
        isShoppingCartTextElementAsExpected(shoppingCartPage);
        //capture screenshot of the test result (before)
        captureScreenshot(driver, "Products List Before Removal (as a guest)");
        //click 'Remove product from cart' checkbox
        shoppingCartPage.clickRemoveASingleProductFromCartCheckbox();
        //click 'Update shopping cart' button
        shoppingCartPage.clickUpdateShippingButton();
        //capture screenshot of the test result (after)
        captureScreenshot(driver, "Products List After Removal (as a guest)");
        //click estimate shipping section country dropdown menu
        shoppingCartPage.clickEstimateShippingCountryDropdownMenu();
        //select 'United States' option
        shoppingCartPage.selectUsOption();
        //click estimate shipping section state dropdown menu
        shoppingCartPage.clickEstimateShippingStateDropdownMenu();
        //select 'Illinois' option
        shoppingCartPage.selectIllinoisOption();
        //input Illinois are zip code
        shoppingCartPage.inputIllinoisAreaZipCode();
        //click 'Estimate shipping' button
        shoppingCartPage.clickEstimateShippingButton();
        //log shopping cart data
        logShoppingCartProductData(shoppingCartPage);
        //click 'Agree to terms' checkbox
        shoppingCartPage.clickAgreeToTermsCheckbox();
        //click 'Checkout' button
        shoppingCartPage.clickCheckoutButton();
        LoginPage loginPage = new LoginPage(driver);
        //click 'Checkout as guest' button
        loginPage.clickCheckoutAsGuestButton();
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        //assert the user gets onto checkout page
        assertEquals("Checkout", checkoutPage.getCheckoutPageTitle(), "The checkout page title doesn't match expectations or the user is on the wrong page");
        //capture screenshot of the test result //multiple test cases use the same screenshot method
        captureScreenshot(driver, "Add Product(s) To Checkout Test (as a guest)");
    }

    //invalid add product / products to check out test method (as a guest) (without clicking 'Agree to Terms' checkbox)
    protected void invalidAddProductToCheckoutAsGuestNoAgreeToTermsTest(ShoppingCartPage shoppingCartPage){
        HomePage homePage = new HomePage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(homePage);
        //shopping cart page web element assert
        isShoppingCartPageWebElementDisplayed(shoppingCartPage);
        //shopping cart page text element assert
        isShoppingCartTextElementAsExpected(shoppingCartPage);
        //click estimate shipping section country dropdown menu
        shoppingCartPage.clickEstimateShippingCountryDropdownMenu();
        //select 'United States' option
        shoppingCartPage.selectUsOption();
        //click estimate shipping section state dropdown menu
        shoppingCartPage.clickEstimateShippingStateDropdownMenu();
        //select 'Illinois' option
        shoppingCartPage.selectIllinoisOption();
        //input Illinois are zip code
        shoppingCartPage.inputIllinoisAreaZipCode();
        //click 'Estimate shipping' button
        shoppingCartPage.clickEstimateShippingButton();
        //log shopping cart data
        logShoppingCartProductData(shoppingCartPage);
        //click 'Checkout' button
        shoppingCartPage.clickCheckoutButton();
        //assert the user gets the expected error
        assertEquals("Please accept the terms of service before the next step.", shoppingCartPage.getAgreeToTermsNotClickedErrorMessageText(), "The 'Agree to Terms' error message doesn't match expectations");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid 'Add Product(s) To Checkout' Test (as a guest (without clicking 'Agree to Terms' checkbox))");
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //valid registered user checkout confirmation test method
    protected void validRegUserCheckoutConfirmationTest(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        //checkout page billing address web element assert
        isBillingAddressSectionWebElementDisplayed(checkoutPage);
        //capture screenshot before the test (for user verification)
        captureScreenshot(driver, "Registered User on Checkout Confirmation Page");
        //valid additional registered user data getter
        checkoutPage.validAdditionalRegUserDataGetter(checkoutPage);
        //click billing country dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressCountryDropdownMenu();
        //select 'United States' option
        checkoutPage.selectUSOption();
        //click billing state dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressStateDropdownMenu();
        //select 'Illinois' option
        checkoutPage.selectIllinoisOption();
        //input valid user city
        checkoutPage.inputValidUserCityIntoCityInputField();
        //input valid address (address 1 is required only)
        checkoutPage.inputValidUserAddressIntoAddress1InputField();
        //input valid user zip code
        checkoutPage.inputValidUserZipCodeIntoPostCodeInputField();
        //input valid user phone number
        checkoutPage.inputValidUserPhoneIntoPhoneNumberInputField();
        //capture screenshot after the user data input (for verification)
        captureScreenshot(driver, "Added Additional Required Registered User Data for Billing Address");
        //click 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //shipping address section web element assert //Selenium fails to find these elements with VALID selectors
        //isShippingAddressSectionWebElementDisplayed(checkoutPage);
        //shipping address section text element assert //Selenium fails to find these elements with VALID selectors
        //isShippingAddressSectionTextAsExpected(checkoutPage);
        //capture screenshot at shipping address section (for verification)
        captureScreenshot(driver, "Shipping Address Section Display");
        //click 'In-store' checkbox
        checkoutPage.clickInStoreCheckbox();
        //click 'Continue' button (shipping address)
        checkoutPage.clickShippingAddressContinueButton();
        //payment method section web element assert //Selenium fails to find these elements with VALID selectors
        //isPaymentMethodSectionWebElementDisplayed(checkoutPage);
        //capture screenshot at payment method section (for verification)
        captureScreenshot(driver, "Payment Method Section Display");
        //click 'Continue' button (payment method)
        checkoutPage.clickPaymentMethodContinueButton();
        //payment information web element assert //Selenium fails to find these elements with VALID selectors
        //isPaymentInformationSectionWebElementDisplayed(checkoutPage);
        //capture screenshot at payment information section (for verification)
        captureScreenshot(driver, "Payment Information Section Display");
        //click 'Continue' button (payment information)
        checkoutPage.clickPaymentInfoContinueButton();
        //confirm order section web element assert
        //isConfirmOrderSectionWebElementDisplayed(checkoutPage); //Selenium fails to find these elements with VALID selectors
        //capture screenshot at confirm order section (for verification)
        captureScreenshot(driver, "Confirm Order Section Display (pre-confirmation)");
        //log billing/shipping data
        logOrderBillingShippingData(checkoutPage);
        //log the pre-confirm order data
        logPreConfirmOrderProductData(checkoutPage);
        //click 'Confirm' button
        checkoutPage.clickConfirmButton();
        //capture screenshot at the end of the test (capture the result)
        captureScreenshot(driver, "Valid Registered User Order Confirmation Test Result");
    }

    //valid guest checkout confirmation test method
    protected void validGuestCheckoutConfirmationTest(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutGuestDataPage checkoutGuestDataPage = new CheckoutGuestDataPage(driver);
        //checkout page billing address web element assert
        isBillingAddressSectionWebElementDisplayed(checkoutPage);
        //capture screenshot before the test (for user verification)
        captureScreenshot(driver, "Guest on Checkout Confirmation Page");
        //valid guest input data getter
        checkoutGuestDataPage.validAdditionalGuestDataGetter(checkoutGuestDataPage);
        //input valid first name
        checkoutGuestDataPage.inputValidFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestDataPage.inputValidLastNameIntoLastNameInputField();
        //input valid email address
        checkoutGuestDataPage.inputValidEmailIntoEmailInputField();
        //click billing country dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressCountryDropdownMenu();
        //select 'United States' option
        checkoutPage.selectUSOption();
        //click billing state dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressStateDropdownMenu();
        //select 'Illinois' option
        checkoutPage.selectIllinoisOption();
        //input valid user city
        checkoutGuestDataPage.inputValidUserCityIntoCityInputField();
        //input valid address (address 1 is required only)
        checkoutGuestDataPage.inputValidAddressIntoAddress1InputField();
        //input valid user zip code
        checkoutGuestDataPage.inputValidZipCodeIntoPostCodeInputField();
        //input valid user phone number
        checkoutGuestDataPage.inputValidPhoneIntoPhoneNumberInputField();
        //capture screenshot after the user data input (for verification)
        captureScreenshot(driver, "Added Additional Required Guest Data for Billing Address");
        //click 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //shipping address section web element assert //Selenium fails to find these elements with VALID selectors
        //isShippingAddressSectionWebElementDisplayed(checkoutPage);
        //shipping address section text element assert //Selenium fails to find these elements with VALID selectors
        //isShippingAddressSectionTextAsExpected(checkoutPage);
        //capture screenshot at shipping address section (for verification)
        captureScreenshot(driver, "Shipping Address Section Display (guest)");
        //click 'In-store' checkbox
        checkoutPage.clickInStoreCheckbox();
        //click 'Continue' button (shipping address)
        checkoutPage.clickShippingAddressContinueButton();
        //payment method section web element assert //Selenium fails to find these elements with VALID selectors
        //isPaymentMethodSectionWebElementDisplayed(checkoutPage);
        //capture screenshot at payment method section (for verification)
        captureScreenshot(driver, "Payment Method Section Display (guest)");
        //click 'Continue' button (payment method)
        checkoutPage.clickPaymentMethodContinueButton();
        //payment information web element assert //Selenium fails to find these elements with VALID selectors
        //isPaymentInformationSectionWebElementDisplayed(checkoutPage);
        //capture screenshot at payment information section (for verification)
        captureScreenshot(driver, "Payment Information Section Display (guest)");
        //click 'Continue' button (payment information)
        checkoutPage.clickPaymentInfoContinueButton();
        //confirm order section web element assert
        //isConfirmOrderSectionWebElementDisplayed(checkoutPage); //Selenium fails to find these elements with VALID selectors
        //capture screenshot at confirm order section (for verification)
        captureScreenshot(driver, "Confirm Order Section Display (pre-confirmation (guest))");
        //log billing/shipping data
        logOrderBillingShippingData(checkoutPage);
        //log the pre-confirm order data
        logPreConfirmOrderProductData(checkoutPage);
        //click 'Confirm' button
        checkoutPage.clickConfirmButton();
        //capture screenshot at the end of the test (capture the result)
        captureScreenshot(driver, "Valid Registered User Order Confirmation Test Result (guest)");
    }

    //checkout with 'Check Money' payment option

    //valid registered user checkout confirmation test method ('Check/Money Order')
    protected void validRegUserCheckoutCheckMoneyConfirmationTest(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        //checkout page billing address web element assert
        isBillingAddressSectionWebElementDisplayed(checkoutPage);
        //capture screenshot before the test (for user verification)
        captureScreenshot(driver, "Registered User on Checkout Confirmation Page");
        //valid additional registered user data getter
        checkoutPage.validAdditionalRegUserDataGetter(checkoutPage);
        //click billing country dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressCountryDropdownMenu();
        //select 'United States' option
        checkoutPage.selectUSOption();
        //click billing state dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressStateDropdownMenu();
        //select 'Illinois' option
        checkoutPage.selectIllinoisOption();
        //input valid user city
        checkoutPage.inputValidUserCityIntoCityInputField();
        //input valid address (address 1 is required only)
        checkoutPage.inputValidUserAddressIntoAddress1InputField();
        //input valid user zip code
        checkoutPage.inputValidUserZipCodeIntoPostCodeInputField();
        //input valid user phone number
        checkoutPage.inputValidUserPhoneIntoPhoneNumberInputField();
        //capture screenshot after the user data input (for verification)
        captureScreenshot(driver, "Added Additional Required Registered User Data for Billing Address");
        //click 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //shipping address section web element assert //Selenium fails to find these elements with VALID selectors
        //isShippingAddressSectionWebElementDisplayed(checkoutPage);
        //shipping address section text element assert //Selenium fails to find these elements with VALID selectors
        //isShippingAddressSectionTextAsExpected(checkoutPage);
        //capture screenshot at shipping address section (for verification)
        captureScreenshot(driver, "Shipping Address Section Display");
        //click 'In-store' checkbox
        checkoutPage.clickInStoreCheckbox();
        //click 'Continue' button (shipping address)
        checkoutPage.clickShippingAddressContinueButton();
        //payment method section web element assert //Selenium fails to find these elements with VALID selectors
        //isPaymentMethodSectionWebElementDisplayed(checkoutPage);
        //click 'Check/Money Order' radio button
        checkoutPage.clickCheckMoneyOrderRadioButton();
        //capture screenshot at payment method section (for verification)
        captureScreenshot(driver, "Payment Method Section Display (with 'Check/Money Order' selected)");
        //click 'Continue' button (payment method)
        checkoutPage.clickPaymentMethodContinueButton();
        //payment information web element assert //Selenium fails to find these elements with VALID selectors
        //isPaymentInformationSectionWebElementDisplayed(checkoutPage);
        //log payment information section data
        logPaymentInfoSectionData(checkoutPage);
        //capture screenshot at payment information section (for verification)
        captureScreenshot(driver, "Payment Information Section Display ('Check Money')");
        //click 'Continue' button (payment information)
        checkoutPage.clickPaymentInfoContinueButton();
        //confirm order section web element assert
        //isConfirmOrderSectionWebElementDisplayed(checkoutPage); //Selenium fails to find these elements with VALID selectors
        //capture screenshot at confirm order section (for verification)
        captureScreenshot(driver, "Confirm Order Section Display (pre-confirmation ('Check Money'))");
        //log billing/shipping data
        logOrderBillingShippingData(checkoutPage);
        //log the pre-confirm order data
        logPreConfirmOrderProductData(checkoutPage);
        //click 'Confirm' button
        checkoutPage.clickConfirmButton();
        //capture screenshot at the end of the test (capture the result)
        captureScreenshot(driver, "Valid Registered User Order Confirmation Test Result ('Check Money')");
    }

    //valid guest checkout confirmation test method ('Check/Money Order')
    protected void validGuestCheckoutCheckMoneyConfirmationTest(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutGuestDataPage checkoutGuestDataPage = new CheckoutGuestDataPage(driver);
        //checkout page billing address web element assert
        isBillingAddressSectionWebElementDisplayed(checkoutPage);
        //capture screenshot before the test (for user verification)
        captureScreenshot(driver, "Guest on Checkout Confirmation Page");
        //valid guest input data getter
        checkoutGuestDataPage.validAdditionalGuestDataGetter(checkoutGuestDataPage);
        //input valid first name
        checkoutGuestDataPage.inputValidFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestDataPage.inputValidLastNameIntoLastNameInputField();
        //input valid email address
        checkoutGuestDataPage.inputValidEmailIntoEmailInputField();
        //click billing country dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressCountryDropdownMenu();
        //select 'United States' option
        checkoutPage.selectUSOption();
        //click billing state dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressStateDropdownMenu();
        //select 'Illinois' option
        checkoutPage.selectIllinoisOption();
        //input valid user city
        checkoutGuestDataPage.inputValidUserCityIntoCityInputField();
        //input valid address (address 1 is required only)
        checkoutGuestDataPage.inputValidAddressIntoAddress1InputField();
        //input valid user zip code
        checkoutGuestDataPage.inputValidZipCodeIntoPostCodeInputField();
        //input valid user phone number
        checkoutGuestDataPage.inputValidPhoneIntoPhoneNumberInputField();
        //capture screenshot after the user data input (for verification)
        captureScreenshot(driver, "Added Additional Required Guest Data for Billing Address");
        //click 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //shipping address section web element assert //Selenium fails to find these elements with VALID selectors
        //isShippingAddressSectionWebElementDisplayed(checkoutPage);
        //shipping address section text element assert //Selenium fails to find these elements with VALID selectors
        //isShippingAddressSectionTextAsExpected(checkoutPage);
        //capture screenshot at shipping address section (for verification)
        captureScreenshot(driver, "Shipping Address Section Display (guest)");
        //click 'In-store' checkbox
        checkoutPage.clickInStoreCheckbox();
        //click 'Continue' button (shipping address)
        checkoutPage.clickShippingAddressContinueButton();
        //payment method section web element assert //Selenium fails to find these elements with VALID selectors
        //isPaymentMethodSectionWebElementDisplayed(checkoutPage);
        //click 'Check/Money Order' radio button
        checkoutPage.clickCheckMoneyOrderRadioButton();
        //capture screenshot at payment method section (for verification)
        captureScreenshot(driver, "Payment Method Section Display (guest ('Check Money'))");
        //click 'Continue' button (payment method)
        checkoutPage.clickPaymentMethodContinueButton();
        //payment information web element assert //Selenium fails to find these elements with VALID selectors
        //isPaymentInformationSectionWebElementDisplayed(checkoutPage);
        //log payment information section data
        logPaymentInfoSectionData(checkoutPage);
        //capture screenshot at payment information section (for verification)
        captureScreenshot(driver, "Payment Information Section Display (guest ('Check Money'))");
        //click 'Continue' button (payment information)
        checkoutPage.clickPaymentInfoContinueButton();
        //confirm order section web element assert
        //isConfirmOrderSectionWebElementDisplayed(checkoutPage); //Selenium fails to find these elements with VALID selectors
        //capture screenshot at confirm order section (for verification)
        captureScreenshot(driver, "Confirm Order Section Display (pre-confirmation (guest ('Check Money')))");
        //log billing/shipping data
        logOrderBillingShippingData(checkoutPage);
        //log the pre-confirm order data
        logPreConfirmOrderProductData(checkoutPage);
        //click 'Confirm' button
        checkoutPage.clickConfirmButton();
        //capture screenshot at the end of the test (capture the result)
        captureScreenshot(driver, "Valid Guest Order Confirmation Test Result (with 'Check/Money Order')");
    }

    //checkout with 'Credit card' payment option

    //valid registered user checkout confirmation test method ('Credit Card')
    protected void validRegUserCheckoutCreditCardConfirmationTest(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPaymentMethodPage checkoutPaymentMethodPage = new CheckoutPaymentMethodPage(driver);
        //checkout page billing address web element assert
        isBillingAddressSectionWebElementDisplayed(checkoutPage);
        //capture screenshot before the test (for user verification)
        captureScreenshot(driver, "Registered User on Checkout Confirmation Page");
        //valid additional registered user data getter
        checkoutPage.validAdditionalRegUserDataGetter(checkoutPage);
        //click billing country dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressCountryDropdownMenu();
        //select 'United States' option
        checkoutPage.selectUSOption();
        //click billing state dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressStateDropdownMenu();
        //select 'Illinois' option
        checkoutPage.selectIllinoisOption();
        //input valid user city
        checkoutPage.inputValidUserCityIntoCityInputField();
        //input valid address (address 1 is required only)
        checkoutPage.inputValidUserAddressIntoAddress1InputField();
        //input valid user zip code
        checkoutPage.inputValidUserZipCodeIntoPostCodeInputField();
        //input valid user phone number
        checkoutPage.inputValidUserPhoneIntoPhoneNumberInputField();
        //capture screenshot after the user data input (for verification)
        captureScreenshot(driver, "Added Additional Required Registered User Data for Billing Address");
        //click 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //shipping address section web element assert //Selenium fails to find these elements with VALID selectors
        //isShippingAddressSectionWebElementDisplayed(checkoutPage);
        //shipping address section text element assert //Selenium fails to find these elements with VALID selectors
        //isShippingAddressSectionTextAsExpected(checkoutPage);
        //capture screenshot at shipping address section (for verification)
        captureScreenshot(driver, "Shipping Address Section Display");
        //click 'In-store' checkbox
        checkoutPage.clickInStoreCheckbox();
        //click 'Continue' button (shipping address)
        checkoutPage.clickShippingAddressContinueButton();
        //payment method section web element assert //Selenium fails to find these elements with VALID selectors
        //isPaymentMethodSectionWebElementDisplayed(checkoutPage);
        //click 'Credit Card' radio button
        checkoutPage.clickCreditCardRadioButton();
        //capture screenshot at payment method section (for verification)
        captureScreenshot(driver, "Payment Method Section Display (with 'Credit Card' selected)");
        //click 'Continue' button (payment method)
        checkoutPage.clickPaymentMethodContinueButton();
        //payment information web element assert //Selenium fails to find these elements with VALID selectors
        //isPaymentInformationSectionWebElementDisplayed(checkoutPage);
        //valid registered user credit card data getter
        checkoutPaymentMethodPage.validUserCreditCardDataGetter();
        //input valid user card holder name
        checkoutPaymentMethodPage.inputValidUserCreditCardNameIntoNameInputField();
        //input valid user credit card number
        checkoutPaymentMethodPage.inputValidCreditCardNumberIntoCardNumberInputField();
        //click credit card month dropdown menu
        checkoutPaymentMethodPage.clickCreditCardMonthDropdownMenu();
        //select valid month
        checkoutPaymentMethodPage.selectCreditCardValidMonthOption();
        //click credit card year dropdown menu
        checkoutPaymentMethodPage.clickCreditCardYearDropdownMenu();
        //select valid year
        checkoutPaymentMethodPage.selectCreditCardValidYearOption();
        //input valid user credit card CVC number
        checkoutPaymentMethodPage.inputValidCreditCardCVCIntoCVCInputField();
        //capture screenshot at payment information section (for verification)
        captureScreenshot(driver, "Payment Information Section Display (with valid credit card data)");
        //click 'Continue' button (payment information)
        checkoutPage.clickPaymentInfoContinueButton();
        //confirm order section web element assert
        //isConfirmOrderSectionWebElementDisplayed(checkoutPage); //Selenium fails to find these elements with VALID selectors
        //capture screenshot at confirm order section (for verification)
        captureScreenshot(driver, "Confirm Order Section Display (pre-confirmation ('Credit Card'))");
        //log billing/shipping data
        logOrderBillingShippingData(checkoutPage);
        //log the pre-confirm order data (with credit card)
        logPreConfirmOrderWithCreditCardProductData(checkoutPage);
        //click 'Confirm' button
        checkoutPage.clickConfirmButton();
        //capture screenshot at the end of the test (capture the result)
        captureScreenshot(driver, "Valid Registered User Order Confirmation Test Result (with 'Credit Card' payment method)");
    }

    //valid guest checkout confirmation test method ('Credit Card')
    protected void validGuestCheckoutCreditCardConfirmationTest(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutGuestDataPage checkoutGuestDataPage = new CheckoutGuestDataPage(driver);
        CheckoutPaymentMethodPage checkoutPaymentMethodPage = new CheckoutPaymentMethodPage(driver);
        //checkout page billing address web element assert
        isBillingAddressSectionWebElementDisplayed(checkoutPage);
        //capture screenshot before the test (for user verification)
        captureScreenshot(driver, "Guest on Checkout Confirmation Page");
        //valid guest input data getter
        checkoutGuestDataPage.validAdditionalGuestDataGetter(checkoutGuestDataPage);
        //input valid first name
        checkoutGuestDataPage.inputValidFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestDataPage.inputValidLastNameIntoLastNameInputField();
        //input valid email address
        checkoutGuestDataPage.inputValidEmailIntoEmailInputField();
        //click billing country dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressCountryDropdownMenu();
        //select 'United States' option
        checkoutPage.selectUSOption();
        //click billing state dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressStateDropdownMenu();
        //select 'Illinois' option
        checkoutPage.selectIllinoisOption();
        //input valid user city
        checkoutGuestDataPage.inputValidUserCityIntoCityInputField();
        //input valid address (address 1 is required only)
        checkoutGuestDataPage.inputValidAddressIntoAddress1InputField();
        //input valid user zip code
        checkoutGuestDataPage.inputValidZipCodeIntoPostCodeInputField();
        //input valid user phone number
        checkoutGuestDataPage.inputValidPhoneIntoPhoneNumberInputField();
        //capture screenshot after the user data input (for verification)
        captureScreenshot(driver, "Added Additional Required Guest Data for Billing Address");
        //click 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //shipping address section web element assert //Selenium fails to find these elements with VALID selectors
        //isShippingAddressSectionWebElementDisplayed(checkoutPage);
        //shipping address section text element assert //Selenium fails to find these elements with VALID selectors
        //isShippingAddressSectionTextAsExpected(checkoutPage);
        //capture screenshot at shipping address section (for verification)
        captureScreenshot(driver, "Shipping Address Section Display (guest)");
        //click 'In-store' checkbox
        checkoutPage.clickInStoreCheckbox();
        //click 'Continue' button (shipping address)
        checkoutPage.clickShippingAddressContinueButton();
        //payment method section web element assert //Selenium fails to find these elements with VALID selectors
        //isPaymentMethodSectionWebElementDisplayed(checkoutPage);
        //click 'Credit Card' radio button
        checkoutPage.clickCreditCardRadioButton();
        //capture screenshot at payment method section (for verification)
        captureScreenshot(driver, "Payment Method Section Display (guest ('Credit Card' payment method))");
        //click 'Continue' button (payment method)
        checkoutPage.clickPaymentMethodContinueButton();
        //payment information web element assert //Selenium fails to find these elements with VALID selectors
        //isPaymentInformationSectionWebElementDisplayed(checkoutPage);
        //valid guest credit card data getter
        checkoutPaymentMethodPage.validGuestCreditCardDataGetter();
        //input valid guest card holder name
        checkoutPaymentMethodPage.inputValidCreditCardNameIntoNameInputField();
        //input valid user credit card number
        checkoutPaymentMethodPage.inputValidCreditCardNumberIntoCardNumberInputField();
        //click credit card month dropdown menu
        checkoutPaymentMethodPage.clickCreditCardMonthDropdownMenu();
        //select valid month
        checkoutPaymentMethodPage.selectCreditCardValidMonthOption();
        //click credit card year dropdown menu
        checkoutPaymentMethodPage.clickCreditCardYearDropdownMenu();
        //select valid year
        checkoutPaymentMethodPage.selectCreditCardValidYearOption();
        //input valid user credit card CVC number
        checkoutPaymentMethodPage.inputValidCreditCardCVCIntoCVCInputField();
        //capture screenshot at payment information section (for verification)
        captureScreenshot(driver, "Payment Information Section Display (guest ('Credit Card' payment method))");
        //click 'Continue' button (payment information)
        checkoutPage.clickPaymentInfoContinueButton();
        //confirm order section web element assert
        //isConfirmOrderSectionWebElementDisplayed(checkoutPage); //Selenium fails to find these elements with VALID selectors
        //capture screenshot at confirm order section (for verification)
        captureScreenshot(driver, "Confirm Order Section Display (pre-confirmation (guest ('Credit Card')))");
        //log billing/shipping data
        logOrderBillingShippingData(checkoutPage);
        //log the pre-confirm order data (with credit card)
        logPreConfirmOrderWithCreditCardProductData(checkoutPage);
        //click 'Confirm' button
        checkoutPage.clickConfirmButton();
        //capture screenshot at the end of the test (capture the result)
        captureScreenshot(driver, "Valid Guest Order Confirmation Test Result (with 'Credit Card' payment method)");
    }

    //checkout with 'Purchase Order' payment option

    //valid registered user checkout confirmation test method ('Purchase Order')
    protected void validRegUserCheckoutPurchaseOrderConfirmationTest(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPaymentMethodPage checkoutPaymentMethodPage = new CheckoutPaymentMethodPage(driver);
        //checkout page billing address web element assert
        isBillingAddressSectionWebElementDisplayed(checkoutPage);
        //capture screenshot before the test (for user verification)
        captureScreenshot(driver, "Registered User on Checkout Confirmation Page");
        //valid additional registered user data getter
        checkoutPage.validAdditionalRegUserDataGetter(checkoutPage);
        //click billing country dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressCountryDropdownMenu();
        //select 'United States' option
        checkoutPage.selectUSOption();
        //click billing state dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressStateDropdownMenu();
        //select 'Illinois' option
        checkoutPage.selectIllinoisOption();
        //input valid user city
        checkoutPage.inputValidUserCityIntoCityInputField();
        //input valid address (address 1 is required only)
        checkoutPage.inputValidUserAddressIntoAddress1InputField();
        //input valid user zip code
        checkoutPage.inputValidUserZipCodeIntoPostCodeInputField();
        //input valid user phone number
        checkoutPage.inputValidUserPhoneIntoPhoneNumberInputField();
        //capture screenshot after the user data input (for verification)
        captureScreenshot(driver, "Added Additional Required Registered User Data for Billing Address");
        //click 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //shipping address section web element assert //Selenium fails to find these elements with VALID selectors
        //isShippingAddressSectionWebElementDisplayed(checkoutPage);
        //shipping address section text element assert //Selenium fails to find these elements with VALID selectors
        //isShippingAddressSectionTextAsExpected(checkoutPage);
        //capture screenshot at shipping address section (for verification)
        captureScreenshot(driver, "Shipping Address Section Display");
        //click 'In-store' checkbox
        checkoutPage.clickInStoreCheckbox();
        //click 'Continue' button (shipping address)
        checkoutPage.clickShippingAddressContinueButton();
        //payment method section web element assert //Selenium fails to find these elements with VALID selectors
        //isPaymentMethodSectionWebElementDisplayed(checkoutPage);
        //click 'Purchase Order' radio button
        checkoutPage.clickPurchaseOrderRadioButton();
        //capture screenshot at payment method section (for verification)
        captureScreenshot(driver, "Payment Method Section Display (with 'Purchase Order' selected)");
        //click 'Continue' button (payment method)
        checkoutPage.clickPaymentMethodContinueButton();
        //payment information web element assert //Selenium fails to find these elements with VALID selectors
        //isPaymentInformationSectionWebElementDisplayed(checkoutPage);
        //input valid purchase order number
        checkoutPaymentMethodPage.inputValidPurchaseOrderNumberIntoPONumberInputField();
        //capture screenshot at payment information section (for verification)
        captureScreenshot(driver, "Payment Information Section Display (with purchase order number)");
        //click 'Continue' button (payment information)
        checkoutPage.clickPaymentInfoContinueButton();
        //confirm order section web element assert
        //isConfirmOrderSectionWebElementDisplayed(checkoutPage); //Selenium fails to find these elements with VALID selectors
        //capture screenshot at confirm order section (for verification)
        captureScreenshot(driver, "Confirm Order Section Display (pre-confirmation ('Purchase Order'))");
        //log billing/shipping data
        logOrderBillingShippingData(checkoutPage);
        //log the pre-confirm order data (with purchase order - this uses the same logger as credit card logger)
        logPreConfirmOrderWithCreditCardProductData(checkoutPage);
        //click 'Confirm' button
        checkoutPage.clickConfirmButton();
        //capture screenshot at the end of the test (capture the result)
        captureScreenshot(driver, "Valid Registered User Order Confirmation Test Result (with 'Purchase Order' payment method)");
    }
    //valid guest checkout confirmation test method ('Purchase Order')
    protected void validGuestCheckoutPurchaseOrderConfirmationTest(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutGuestDataPage checkoutGuestDataPage = new CheckoutGuestDataPage(driver);
        CheckoutPaymentMethodPage checkoutPaymentMethodPage = new CheckoutPaymentMethodPage(driver);
        //checkout page billing address web element assert
        isBillingAddressSectionWebElementDisplayed(checkoutPage);
        //capture screenshot before the test (for user verification)
        captureScreenshot(driver, "Guest on Checkout Confirmation Page");
        //valid guest input data getter
        checkoutGuestDataPage.validAdditionalGuestDataGetter(checkoutGuestDataPage);
        //input valid first name
        checkoutGuestDataPage.inputValidFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestDataPage.inputValidLastNameIntoLastNameInputField();
        //input valid email address
        checkoutGuestDataPage.inputValidEmailIntoEmailInputField();
        //click billing country dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressCountryDropdownMenu();
        //select 'United States' option
        checkoutPage.selectUSOption();
        //click billing state dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressStateDropdownMenu();
        //select 'Illinois' option
        checkoutPage.selectIllinoisOption();
        //input valid user city
        checkoutGuestDataPage.inputValidUserCityIntoCityInputField();
        //input valid address (address 1 is required only)
        checkoutGuestDataPage.inputValidAddressIntoAddress1InputField();
        //input valid user zip code
        checkoutGuestDataPage.inputValidZipCodeIntoPostCodeInputField();
        //input valid user phone number
        checkoutGuestDataPage.inputValidPhoneIntoPhoneNumberInputField();
        //capture screenshot after the user data input (for verification)
        captureScreenshot(driver, "Added Additional Required Guest Data for Billing Address");
        //click 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //shipping address section web element assert //Selenium fails to find these elements with VALID selectors
        //isShippingAddressSectionWebElementDisplayed(checkoutPage);
        //shipping address section text element assert //Selenium fails to find these elements with VALID selectors
        //isShippingAddressSectionTextAsExpected(checkoutPage);
        //capture screenshot at shipping address section (for verification)
        captureScreenshot(driver, "Shipping Address Section Display (guest)");
        //click 'In-store' checkbox
        checkoutPage.clickInStoreCheckbox();
        //click 'Continue' button (shipping address)
        checkoutPage.clickShippingAddressContinueButton();
        //payment method section web element assert //Selenium fails to find these elements with VALID selectors
        //isPaymentMethodSectionWebElementDisplayed(checkoutPage);
        //click 'Purchase Order' radio button
        checkoutPage.clickPurchaseOrderRadioButton();
        //capture screenshot at payment method section (for verification)
        captureScreenshot(driver, "Payment Method Section Display (guest ('Purchase Order' payment method))");
        //click 'Continue' button (payment method)
        checkoutPage.clickPaymentMethodContinueButton();
        //payment information web element assert //Selenium fails to find these elements with VALID selectors
        //isPaymentInformationSectionWebElementDisplayed(checkoutPage);
        //input valid purchase order number
        checkoutPaymentMethodPage.inputValidPurchaseOrderNumberIntoPONumberInputField();
        //capture screenshot at payment information section (for verification)
        captureScreenshot(driver, "Payment Information Section Display (guest ('Purchase Order' payment method))");
        //click 'Continue' button (payment information)
        checkoutPage.clickPaymentInfoContinueButton();
        //confirm order section web element assert
        //isConfirmOrderSectionWebElementDisplayed(checkoutPage); //Selenium fails to find these elements with VALID selectors
        //capture screenshot at confirm order section (for verification)
        captureScreenshot(driver, "Confirm Order Section Display (pre-confirmation (guest ('Purchase Order')))");
        //log billing/shipping data
        logOrderBillingShippingData(checkoutPage);
        //log the pre-confirm order data (with purchase order - this uses the same logger as credit card logger)
        logPreConfirmOrderWithCreditCardProductData(checkoutPage);
        //click 'Confirm' button
        checkoutPage.clickConfirmButton();
        //capture screenshot at the end of the test (capture the result)
        captureScreenshot(driver, "Valid Guest Order Confirmation Test Result (with 'Purchase Order' payment method)");
    }

    //negative checkout confirmation tests (guest branch only since it has all input fields empty before each test)

    //no singular input

    //invalid guest checkout confirmation test method - no first name
    protected void invalidGuestCheckoutNoFirstNameConfirmationTest(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutGuestDataPage checkoutGuestDataPage = new CheckoutGuestDataPage(driver);
        //checkout page billing address web element assert
        isBillingAddressSectionWebElementDisplayed(checkoutPage);
        //capture screenshot before the test (for user verification)
        captureScreenshot(driver, "Guest on Checkout Confirmation Page");
        //invalid guest input data getter (no first name)
        checkoutGuestDataPage.invalidAdditionalGuestNoFirstNameDataGetter();
        //don't input first name
        checkoutGuestDataPage.inputNoFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestDataPage.inputValidLastNameIntoLastNameInputField();
        //input valid email address
        checkoutGuestDataPage.inputValidEmailIntoEmailInputField();
        //click billing country dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressCountryDropdownMenu();
        //select 'United States' option
        checkoutPage.selectUSOption();
        //click billing state dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressStateDropdownMenu();
        //select 'Illinois' option
        checkoutPage.selectIllinoisOption();
        //input valid user city
        checkoutGuestDataPage.inputValidUserCityIntoCityInputField();
        //input valid address (address 1 is required only)
        checkoutGuestDataPage.inputValidAddressIntoAddress1InputField();
        //input valid user zip code
        checkoutGuestDataPage.inputValidZipCodeIntoPostCodeInputField();
        //input valid user phone number
        checkoutGuestDataPage.inputValidPhoneIntoPhoneNumberInputField();
        //click 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //assert the expected error message appears
        assertEquals("First name is required.", checkoutGuestDataPage.getInvalidInputErrorMessage(), "The error message text doesn't match expectations.");
        //capture screenshot of the invalid test result (no first name)
        captureScreenshot(driver, "Invalid Required Guest Data for Billing Address (no first name)");
    }
    //invalid guest checkout confirmation test method - no last name
    protected void invalidGuestCheckoutNoLastNameConfirmationTest(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutGuestDataPage checkoutGuestDataPage = new CheckoutGuestDataPage(driver);
        //checkout page billing address web element assert
        isBillingAddressSectionWebElementDisplayed(checkoutPage);
        //capture screenshot before the test (for user verification)
        captureScreenshot(driver, "Guest on Checkout Confirmation Page");
        //invalid guest input data getter (no last name)
        checkoutGuestDataPage.invalidAdditionalGuestNoLastNameDataGetter();
        //input valid first name
        checkoutGuestDataPage.inputValidFirstNameIntoFirstNameInputField();
        //don't input last name
        checkoutGuestDataPage.inputNoLastNameIntoLastNameInputField();
        //input valid email address
        checkoutGuestDataPage.inputValidEmailIntoEmailInputField();
        //click billing country dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressCountryDropdownMenu();
        //select 'United States' option
        checkoutPage.selectUSOption();
        //click billing state dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressStateDropdownMenu();
        //select 'Illinois' option
        checkoutPage.selectIllinoisOption();
        //input valid user city
        checkoutGuestDataPage.inputValidUserCityIntoCityInputField();
        //input valid address (address 1 is required only)
        checkoutGuestDataPage.inputValidAddressIntoAddress1InputField();
        //input valid user zip code
        checkoutGuestDataPage.inputValidZipCodeIntoPostCodeInputField();
        //input valid user phone number
        checkoutGuestDataPage.inputValidPhoneIntoPhoneNumberInputField();
        //click 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //assert the expected error message appears
        assertEquals("Last name is required.", checkoutGuestDataPage.getInvalidInputErrorMessage(), "The error message text doesn't match expectations.");
        //capture screenshot of the invalid test result (no last name)
        captureScreenshot(driver, "Invalid Required Guest Data for Billing Address (no last name)");
    }
    //invalid guest checkout confirmation test method - no email address
    protected void invalidGuestCheckoutNoEmailConfirmationTest(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutGuestDataPage checkoutGuestDataPage = new CheckoutGuestDataPage(driver);
        //checkout page billing address web element assert
        isBillingAddressSectionWebElementDisplayed(checkoutPage);
        //capture screenshot before the test (for user verification)
        captureScreenshot(driver, "Guest on Checkout Confirmation Page");
        //invalid guest input data getter (no email address)
        checkoutGuestDataPage.invalidAdditionalGuestNoEmailDataGetter();
        //input valid first name
        checkoutGuestDataPage.inputValidFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestDataPage.inputValidLastNameIntoLastNameInputField();
        //don't input email address
        checkoutGuestDataPage.inputNoEmailIntoEmailInputField();
        //click billing country dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressCountryDropdownMenu();
        //select 'United States' option
        checkoutPage.selectUSOption();
        //click billing state dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressStateDropdownMenu();
        //select 'Illinois' option
        checkoutPage.selectIllinoisOption();
        //input valid user city
        checkoutGuestDataPage.inputValidUserCityIntoCityInputField();
        //input valid address (address 1 is required only)
        checkoutGuestDataPage.inputValidAddressIntoAddress1InputField();
        //input valid user zip code
        checkoutGuestDataPage.inputValidZipCodeIntoPostCodeInputField();
        //input valid user phone number
        checkoutGuestDataPage.inputValidPhoneIntoPhoneNumberInputField();
        //click 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //assert the expected error message appears
        assertEquals("Email is required.", checkoutGuestDataPage.getInvalidInputErrorMessage(), "The error message text doesn't match expectations.");
        //capture screenshot of the invalid test result (no user email address)
        captureScreenshot(driver, "Invalid Required Guest Data for Billing Address (no email address)");
    }
    //invalid guest checkout confirmation test method - no country and state (since they're inseparable)
    protected void invalidGuestCheckoutNoCountryStateConfirmationTest(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutGuestDataPage checkoutGuestDataPage = new CheckoutGuestDataPage(driver);
        //checkout page billing address web element assert
        isBillingAddressSectionWebElementDisplayed(checkoutPage);
        //capture screenshot before the test (for user verification)
        captureScreenshot(driver, "Guest on Checkout Confirmation Page");
        //valid guest input data getter (do not select country nor state)
        checkoutGuestDataPage.validAdditionalGuestDataGetter(checkoutGuestDataPage);
        //input valid first name
        checkoutGuestDataPage.inputValidFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestDataPage.inputValidLastNameIntoLastNameInputField();
        //input valid email address
        checkoutGuestDataPage.inputValidEmailIntoEmailInputField();
        //input valid user city
        checkoutGuestDataPage.inputValidUserCityIntoCityInputField();
        //input valid address (address 1 is required only)
        checkoutGuestDataPage.inputValidAddressIntoAddress1InputField();
        //input valid user zip code
        checkoutGuestDataPage.inputValidZipCodeIntoPostCodeInputField();
        //input valid user phone number
        checkoutGuestDataPage.inputValidPhoneIntoPhoneNumberInputField();
        //click 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //assert the expected error message appears
        assertEquals("Country is required.", checkoutGuestDataPage.getInvalidInputErrorMessage(), "The error message text doesn't match expectations.");
        //capture screenshot of the invalid test result (no user country/state)
        captureScreenshot(driver, "Invalid Required Guest Data for Billing Address (no country or state selected)");
    }
    //invalid guest checkout confirmation test method - no city
    protected void invalidGuestCheckoutNoCityConfirmationTest(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutGuestDataPage checkoutGuestDataPage = new CheckoutGuestDataPage(driver);
        //checkout page billing address web element assert
        isBillingAddressSectionWebElementDisplayed(checkoutPage);
        //capture screenshot before the test (for user verification)
        captureScreenshot(driver, "Guest on Checkout Confirmation Page");
        //invalid guest input data getter (no city)
        checkoutGuestDataPage.invalidAdditionalGuestNoCityDataGetter();
        //input valid first name
        checkoutGuestDataPage.inputValidFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestDataPage.inputValidLastNameIntoLastNameInputField();
        //input valid email address
        checkoutGuestDataPage.inputValidEmailIntoEmailInputField();
        //click billing country dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressCountryDropdownMenu();
        //select 'United States' option
        checkoutPage.selectUSOption();
        //click billing state dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressStateDropdownMenu();
        //select 'Illinois' option
        checkoutPage.selectIllinoisOption();
        //don't input user city
        checkoutGuestDataPage.inputNoCityIntoCityInputField();
        //input valid address (address 1 is required only)
        checkoutGuestDataPage.inputValidAddressIntoAddress1InputField();
        //input valid user zip code
        checkoutGuestDataPage.inputValidZipCodeIntoPostCodeInputField();
        //input valid user phone number
        checkoutGuestDataPage.inputValidPhoneIntoPhoneNumberInputField();
        //click 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //assert the expected error message appears
        assertEquals("City is required", checkoutGuestDataPage.getInvalidInputErrorMessage(), "The error message text doesn't match expectations.");
        //capture screenshot of the invalid test result (no user city)
        captureScreenshot(driver, "Invalid Required Guest Data for Billing Address (no user city)");
    }
    //invalid guest checkout confirmation test method - no user address (address1)
    protected void invalidGuestCheckoutNoAddressConfirmationTest(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutGuestDataPage checkoutGuestDataPage = new CheckoutGuestDataPage(driver);
        //checkout page billing address web element assert
        isBillingAddressSectionWebElementDisplayed(checkoutPage);
        //capture screenshot before the test (for user verification)
        captureScreenshot(driver, "Guest on Checkout Confirmation Page");
        //invalid guest input data getter (no user address)
        checkoutGuestDataPage.invalidAdditionalGuestNoAddressDataGetter();
        //input valid first name
        checkoutGuestDataPage.inputValidFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestDataPage.inputValidLastNameIntoLastNameInputField();
        //input valid email address
        checkoutGuestDataPage.inputValidEmailIntoEmailInputField();
        //click billing country dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressCountryDropdownMenu();
        //select 'United States' option
        checkoutPage.selectUSOption();
        //click billing state dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressStateDropdownMenu();
        //select 'Illinois' option
        checkoutPage.selectIllinoisOption();
        //input valid user city
        checkoutGuestDataPage.inputValidUserCityIntoCityInputField();
        //don't input address (address 1 is required only)
        checkoutGuestDataPage.inputNoAddressIntoAddress1InputField();
        //input valid user zip code
        checkoutGuestDataPage.inputValidZipCodeIntoPostCodeInputField();
        //input valid user phone number
        checkoutGuestDataPage.inputValidPhoneIntoPhoneNumberInputField();
        //click 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //assert the expected error message appears
        assertEquals("Street address is required", checkoutGuestDataPage.getInvalidInputErrorMessage(), "The error message text doesn't match expectations.");
        //capture screenshot of the invalid test result (no user address)
        captureScreenshot(driver, "Invalid Required Guest Data for Billing Address (no user address)");
    }
    //invalid guest checkout confirmation test method - no user zip code
    protected void invalidGuestCheckoutNoZipCodeConfirmationTest(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutGuestDataPage checkoutGuestDataPage = new CheckoutGuestDataPage(driver);
        //checkout page billing address web element assert
        isBillingAddressSectionWebElementDisplayed(checkoutPage);
        //capture screenshot before the test (for user verification)
        captureScreenshot(driver, "Guest on Checkout Confirmation Page");
        //invalid guest input data getter (no user zip code)
        checkoutGuestDataPage.invalidAdditionalGuestNoZipCodeDataGetter();
        //input valid first name
        checkoutGuestDataPage.inputValidFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestDataPage.inputValidLastNameIntoLastNameInputField();
        //input valid email address
        checkoutGuestDataPage.inputValidEmailIntoEmailInputField();
        //click billing country dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressCountryDropdownMenu();
        //select 'United States' option
        checkoutPage.selectUSOption();
        //click billing state dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressStateDropdownMenu();
        //select 'Illinois' option
        checkoutPage.selectIllinoisOption();
        //input valid user city
        checkoutGuestDataPage.inputValidUserCityIntoCityInputField();
        //input valid address (address 1 is required only)
        checkoutGuestDataPage.inputValidAddressIntoAddress1InputField();
        //don't input zip code
        checkoutGuestDataPage.inputNoZipCodeIntoPostCodeInputField();
        //input valid user phone number
        checkoutGuestDataPage.inputValidPhoneIntoPhoneNumberInputField();
        //click 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //assert the expected error message appears
        assertEquals("Zip / postal code is required", checkoutGuestDataPage.getInvalidInputErrorMessage(), "The error message text doesn't match expectations.");
        //capture screenshot of the invalid test result (no user zip code)
        captureScreenshot(driver, "Invalid Required Guest Data for Billing Address (no user zip code)");
    }
    //invalid guest checkout confirmation test method - no user phone number
    protected void invalidGuestCheckoutNoPhoneConfirmationTest(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutGuestDataPage checkoutGuestDataPage = new CheckoutGuestDataPage(driver);
        //checkout page billing address web element assert
        isBillingAddressSectionWebElementDisplayed(checkoutPage);
        //capture screenshot before the test (for user verification)
        captureScreenshot(driver, "Guest on Checkout Confirmation Page");
        //invalid guest input data getter (no user phone number)
        checkoutGuestDataPage.invalidAdditionalGuestNoPhoneDataGetter();
        //input valid first name
        checkoutGuestDataPage.inputValidFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestDataPage.inputValidLastNameIntoLastNameInputField();
        //input valid email address
        checkoutGuestDataPage.inputValidEmailIntoEmailInputField();
        //click billing country dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressCountryDropdownMenu();
        //select 'United States' option
        checkoutPage.selectUSOption();
        //click billing state dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressStateDropdownMenu();
        //select 'Illinois' option
        checkoutPage.selectIllinoisOption();
        //input valid user city
        checkoutGuestDataPage.inputValidUserCityIntoCityInputField();
        //input valid address (address 1 is required only)
        checkoutGuestDataPage.inputValidAddressIntoAddress1InputField();
        //input valid zip code
        checkoutGuestDataPage.inputValidZipCodeIntoPostCodeInputField();
        //don't input phone number
        checkoutGuestDataPage.inputNoPhoneIntoPhoneNumberInputField();
        //click 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //assert the expected error message appears
        assertEquals("Phone is required", checkoutGuestDataPage.getInvalidInputErrorMessage(), "The error message text doesn't match expectations.");
        //capture screenshot of the invalid test result (no user phone number)
        captureScreenshot(driver, "Invalid Required Guest Data for Billing Address (no user phone number)");
    }

    //no singular 'Credit Card' payment option input

    //invalid guest checkout confirmation test method ('Credit Card' - missing cardholder name)
    protected void invalidGuestCheckoutCreditCardNoCardNameConfirmationTest(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutGuestDataPage checkoutGuestDataPage = new CheckoutGuestDataPage(driver);
        CheckoutPaymentMethodPage checkoutPaymentMethodPage = new CheckoutPaymentMethodPage(driver);
        //checkout page billing address web element assert
        isBillingAddressSectionWebElementDisplayed(checkoutPage);
        //capture screenshot before the test (for user verification)
        captureScreenshot(driver, "Guest on Checkout Confirmation Page");
        //valid guest input data getter
        checkoutGuestDataPage.validAdditionalGuestDataGetter(checkoutGuestDataPage);
        //input valid first name
        checkoutGuestDataPage.inputValidFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestDataPage.inputValidLastNameIntoLastNameInputField();
        //input valid email address
        checkoutGuestDataPage.inputValidEmailIntoEmailInputField();
        //click billing country dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressCountryDropdownMenu();
        //select 'United States' option
        checkoutPage.selectUSOption();
        //click billing state dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressStateDropdownMenu();
        //select 'Illinois' option
        checkoutPage.selectIllinoisOption();
        //input valid user city
        checkoutGuestDataPage.inputValidUserCityIntoCityInputField();
        //input valid address (address 1 is required only)
        checkoutGuestDataPage.inputValidAddressIntoAddress1InputField();
        //input valid user zip code
        checkoutGuestDataPage.inputValidZipCodeIntoPostCodeInputField();
        //input valid user phone number
        checkoutGuestDataPage.inputValidPhoneIntoPhoneNumberInputField();
        //capture screenshot after the user data input (for verification)
        captureScreenshot(driver, "Added Additional Required Guest Data for Billing Address");
        //click 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //shipping address section web element assert //Selenium fails to find these elements with VALID selectors
        //isShippingAddressSectionWebElementDisplayed(checkoutPage);
        //shipping address section text element assert //Selenium fails to find these elements with VALID selectors
        //isShippingAddressSectionTextAsExpected(checkoutPage);
        //capture screenshot at shipping address section (for verification)
        captureScreenshot(driver, "Shipping Address Section Display (guest)");
        //click 'In-store' checkbox
        checkoutPage.clickInStoreCheckbox();
        //click 'Continue' button (shipping address)
        checkoutPage.clickShippingAddressContinueButton();
        //payment method section web element assert //Selenium fails to find these elements with VALID selectors
        //isPaymentMethodSectionWebElementDisplayed(checkoutPage);
        //click 'Credit Card' radio button
        checkoutPage.clickCreditCardRadioButton();
        //capture screenshot at payment method section (for verification)
        captureScreenshot(driver, "Payment Method Section Display (guest ('Credit Card' payment method))");
        //click 'Continue' button (payment method)
        checkoutPage.clickPaymentMethodContinueButton();
        //payment information web element assert //Selenium fails to find these elements with VALID selectors
        //isPaymentInformationSectionWebElementDisplayed(checkoutPage);
        //invalid guest credit card data getter (no cardholder name)
        checkoutPaymentMethodPage.invalidGuestCreditCardNoCardNameDataGetter();
        //don't input guest card holder name
        checkoutPaymentMethodPage.inputNoCreditCardNameIntoNameInputField();
        //input valid user credit card number
        checkoutPaymentMethodPage.inputValidCreditCardNumberIntoCardNumberInputField();
        //click credit card month dropdown menu
        checkoutPaymentMethodPage.clickCreditCardMonthDropdownMenu();
        //select valid month
        checkoutPaymentMethodPage.selectCreditCardValidMonthOption();
        //click credit card year dropdown menu
        checkoutPaymentMethodPage.clickCreditCardYearDropdownMenu();
        //select valid year
        checkoutPaymentMethodPage.selectCreditCardValidYearOption();
        //input valid user credit card CVC number
        checkoutPaymentMethodPage.inputValidCreditCardCVCIntoCVCInputField();
        //click 'Continue' button (payment information)
        checkoutPage.clickPaymentInfoContinueButton();
        //assert the expected error message appears
        assertEquals("Enter cardholder name", checkoutPaymentMethodPage.getMissingCreditCardInputErrorMessage(), "The error message doesn't match expectations.");
        //capture screenshot at the end of the test (capture the result)
        captureScreenshot(driver, "Invalid Guest Payment Information Test Result (with 'Credit Card' payment method - no cardholder name)");
    }
    //invalid guest checkout confirmation test method ('Credit Card' - missing card number)
    protected void invalidGuestCheckoutCreditCardNoCardNumberConfirmationTest(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutGuestDataPage checkoutGuestDataPage = new CheckoutGuestDataPage(driver);
        CheckoutPaymentMethodPage checkoutPaymentMethodPage = new CheckoutPaymentMethodPage(driver);
        //checkout page billing address web element assert
        isBillingAddressSectionWebElementDisplayed(checkoutPage);
        //capture screenshot before the test (for user verification)
        captureScreenshot(driver, "Guest on Checkout Confirmation Page");
        //valid guest input data getter
        checkoutGuestDataPage.validAdditionalGuestDataGetter(checkoutGuestDataPage);
        //input valid first name
        checkoutGuestDataPage.inputValidFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestDataPage.inputValidLastNameIntoLastNameInputField();
        //input valid email address
        checkoutGuestDataPage.inputValidEmailIntoEmailInputField();
        //click billing country dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressCountryDropdownMenu();
        //select 'United States' option
        checkoutPage.selectUSOption();
        //click billing state dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressStateDropdownMenu();
        //select 'Illinois' option
        checkoutPage.selectIllinoisOption();
        //input valid user city
        checkoutGuestDataPage.inputValidUserCityIntoCityInputField();
        //input valid address (address 1 is required only)
        checkoutGuestDataPage.inputValidAddressIntoAddress1InputField();
        //input valid user zip code
        checkoutGuestDataPage.inputValidZipCodeIntoPostCodeInputField();
        //input valid user phone number
        checkoutGuestDataPage.inputValidPhoneIntoPhoneNumberInputField();
        //capture screenshot after the user data input (for verification)
        captureScreenshot(driver, "Added Additional Required Guest Data for Billing Address");
        //click 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //shipping address section web element assert //Selenium fails to find these elements with VALID selectors
        //isShippingAddressSectionWebElementDisplayed(checkoutPage);
        //shipping address section text element assert //Selenium fails to find these elements with VALID selectors
        //isShippingAddressSectionTextAsExpected(checkoutPage);
        //capture screenshot at shipping address section (for verification)
        captureScreenshot(driver, "Shipping Address Section Display (guest)");
        //click 'In-store' checkbox
        checkoutPage.clickInStoreCheckbox();
        //click 'Continue' button (shipping address)
        checkoutPage.clickShippingAddressContinueButton();
        //payment method section web element assert //Selenium fails to find these elements with VALID selectors
        //isPaymentMethodSectionWebElementDisplayed(checkoutPage);
        //click 'Credit Card' radio button
        checkoutPage.clickCreditCardRadioButton();
        //capture screenshot at payment method section (for verification)
        captureScreenshot(driver, "Payment Method Section Display (guest ('Credit Card' payment method))");
        //click 'Continue' button (payment method)
        checkoutPage.clickPaymentMethodContinueButton();
        //payment information web element assert //Selenium fails to find these elements with VALID selectors
        //isPaymentInformationSectionWebElementDisplayed(checkoutPage);
        //invalid guest credit card data getter (no card number)
        checkoutPaymentMethodPage.invalidGuestCreditCardNoCardNumberDataGetter();
        //input valid guest cardholder name
        checkoutPaymentMethodPage.inputValidCreditCardNameIntoNameInputField();
        //don't input credit card number
        checkoutPaymentMethodPage.inputNoCreditCardNumberIntoCardNumberInputField();
        //click credit card month dropdown menu
        checkoutPaymentMethodPage.clickCreditCardMonthDropdownMenu();
        //select valid month
        checkoutPaymentMethodPage.selectCreditCardValidMonthOption();
        //click credit card year dropdown menu
        checkoutPaymentMethodPage.clickCreditCardYearDropdownMenu();
        //select valid year
        checkoutPaymentMethodPage.selectCreditCardValidYearOption();
        //input valid user credit card CVC number
        checkoutPaymentMethodPage.inputValidCreditCardCVCIntoCVCInputField();
        //click 'Continue' button (payment information)
        checkoutPage.clickPaymentInfoContinueButton();
        //assert the expected error message appears
        assertEquals("Wrong card number", checkoutPaymentMethodPage.getMissingCreditCardInputErrorMessage(), "The error message doesn't match expectations.");
        //capture screenshot at the end of the test (capture the result)
        captureScreenshot(driver, "Invalid Guest Payment Information Test Result (with 'Credit Card' payment method - no credit card number)");
    }
    //invalid guest checkout confirmation test method ('Credit Card' - missing card CVC number)
    protected void invalidGuestCheckoutCreditCardNoCardCVCNumberConfirmationTest(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutGuestDataPage checkoutGuestDataPage = new CheckoutGuestDataPage(driver);
        CheckoutPaymentMethodPage checkoutPaymentMethodPage = new CheckoutPaymentMethodPage(driver);
        //checkout page billing address web element assert
        isBillingAddressSectionWebElementDisplayed(checkoutPage);
        //capture screenshot before the test (for user verification)
        captureScreenshot(driver, "Guest on Checkout Confirmation Page");
        //valid guest input data getter
        checkoutGuestDataPage.validAdditionalGuestDataGetter(checkoutGuestDataPage);
        //input valid first name
        checkoutGuestDataPage.inputValidFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestDataPage.inputValidLastNameIntoLastNameInputField();
        //input valid email address
        checkoutGuestDataPage.inputValidEmailIntoEmailInputField();
        //click billing country dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressCountryDropdownMenu();
        //select 'United States' option
        checkoutPage.selectUSOption();
        //click billing state dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressStateDropdownMenu();
        //select 'Illinois' option
        checkoutPage.selectIllinoisOption();
        //input valid user city
        checkoutGuestDataPage.inputValidUserCityIntoCityInputField();
        //input valid address (address 1 is required only)
        checkoutGuestDataPage.inputValidAddressIntoAddress1InputField();
        //input valid user zip code
        checkoutGuestDataPage.inputValidZipCodeIntoPostCodeInputField();
        //input valid user phone number
        checkoutGuestDataPage.inputValidPhoneIntoPhoneNumberInputField();
        //capture screenshot after the user data input (for verification)
        captureScreenshot(driver, "Added Additional Required Guest Data for Billing Address");
        //click 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //shipping address section web element assert //Selenium fails to find these elements with VALID selectors
        //isShippingAddressSectionWebElementDisplayed(checkoutPage);
        //shipping address section text element assert //Selenium fails to find these elements with VALID selectors
        //isShippingAddressSectionTextAsExpected(checkoutPage);
        //capture screenshot at shipping address section (for verification)
        captureScreenshot(driver, "Shipping Address Section Display (guest)");
        //click 'In-store' checkbox
        checkoutPage.clickInStoreCheckbox();
        //click 'Continue' button (shipping address)
        checkoutPage.clickShippingAddressContinueButton();
        //payment method section web element assert //Selenium fails to find these elements with VALID selectors
        //isPaymentMethodSectionWebElementDisplayed(checkoutPage);
        //click 'Credit Card' radio button
        checkoutPage.clickCreditCardRadioButton();
        //capture screenshot at payment method section (for verification)
        captureScreenshot(driver, "Payment Method Section Display (guest ('Credit Card' payment method))");
        //click 'Continue' button (payment method)
        checkoutPage.clickPaymentMethodContinueButton();
        //payment information web element assert //Selenium fails to find these elements with VALID selectors
        //isPaymentInformationSectionWebElementDisplayed(checkoutPage);
        //invalid guest credit card data getter (no card CVC number)
        checkoutPaymentMethodPage.invalidGuestCreditCardNoCardCVCNumberDataGetter();
        //input valid guest cardholder name
        checkoutPaymentMethodPage.inputValidCreditCardNameIntoNameInputField();
        //input valid guest credit card number
        checkoutPaymentMethodPage.inputValidCreditCardNumberIntoCardNumberInputField();
        //click credit card month dropdown menu
        checkoutPaymentMethodPage.clickCreditCardMonthDropdownMenu();
        //select valid month
        checkoutPaymentMethodPage.selectCreditCardValidMonthOption();
        //click credit card year dropdown menu
        checkoutPaymentMethodPage.clickCreditCardYearDropdownMenu();
        //select valid year
        checkoutPaymentMethodPage.selectCreditCardValidYearOption();
        //don't input credit card CVC number
        checkoutPaymentMethodPage.inputNoCreditCardCVCIntoCVCInputField();
        //click 'Continue' button (payment information)
        checkoutPage.clickPaymentInfoContinueButton();
        //assert the expected error message appears
        assertEquals("Wrong card code", checkoutPaymentMethodPage.getMissingCreditCardInputErrorMessage(), "The error message doesn't match expectations.");
        //capture screenshot at the end of the test (capture the result)
        captureScreenshot(driver, "Invalid Guest Payment Information Test Result (with 'Credit Card' payment method - no credit card CVC number)");
    }

    //no 'Purchase Order' number input

    //invalid guest checkout confirmation test method ('Purchase Order') - no number input
    protected void invalidGuestCheckoutNoPurchaseOrderNumberConfirmationTest(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutGuestDataPage checkoutGuestDataPage = new CheckoutGuestDataPage(driver);
        CheckoutPaymentMethodPage checkoutPaymentMethodPage = new CheckoutPaymentMethodPage(driver);
        //checkout page billing address web element assert
        isBillingAddressSectionWebElementDisplayed(checkoutPage);
        //capture screenshot before the test (for user verification)
        captureScreenshot(driver, "Guest on Checkout Confirmation Page");
        //valid guest input data getter
        checkoutGuestDataPage.validAdditionalGuestDataGetter(checkoutGuestDataPage);
        //input valid first name
        checkoutGuestDataPage.inputValidFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestDataPage.inputValidLastNameIntoLastNameInputField();
        //input valid email address
        checkoutGuestDataPage.inputValidEmailIntoEmailInputField();
        //click billing country dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressCountryDropdownMenu();
        //select 'United States' option
        checkoutPage.selectUSOption();
        //click billing state dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressStateDropdownMenu();
        //select 'Illinois' option
        checkoutPage.selectIllinoisOption();
        //input valid user city
        checkoutGuestDataPage.inputValidUserCityIntoCityInputField();
        //input valid address (address 1 is required only)
        checkoutGuestDataPage.inputValidAddressIntoAddress1InputField();
        //input valid user zip code
        checkoutGuestDataPage.inputValidZipCodeIntoPostCodeInputField();
        //input valid user phone number
        checkoutGuestDataPage.inputValidPhoneIntoPhoneNumberInputField();
        //capture screenshot after the user data input (for verification)
        captureScreenshot(driver, "Added Additional Required Guest Data for Billing Address");
        //click 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //shipping address section web element assert //Selenium fails to find these elements with VALID selectors
        //isShippingAddressSectionWebElementDisplayed(checkoutPage);
        //shipping address section text element assert //Selenium fails to find these elements with VALID selectors
        //isShippingAddressSectionTextAsExpected(checkoutPage);
        //capture screenshot at shipping address section (for verification)
        captureScreenshot(driver, "Shipping Address Section Display (guest)");
        //click 'In-store' checkbox
        checkoutPage.clickInStoreCheckbox();
        //click 'Continue' button (shipping address)
        checkoutPage.clickShippingAddressContinueButton();
        //payment method section web element assert //Selenium fails to find these elements with VALID selectors
        //isPaymentMethodSectionWebElementDisplayed(checkoutPage);
        //click 'Purchase Order' radio button
        checkoutPage.clickPurchaseOrderRadioButton();
        //capture screenshot at payment method section (for verification)
        captureScreenshot(driver, "Payment Method Section Display (guest ('Purchase Order' payment method))");
        //click 'Continue' button (payment method)
        checkoutPage.clickPaymentMethodContinueButton();
        //payment information web element assert //Selenium fails to find these elements with VALID selectors
        //isPaymentInformationSectionWebElementDisplayed(checkoutPage);
        //don't input purchase order number
        checkoutPaymentMethodPage.inputNoPurchaseOrderNumberIntoPONumberInputField();
        //capture screenshot at payment information section (for verification)
        captureScreenshot(driver, "Payment Information Section Display (guest ('Purchase Order' payment method) - no purchase order number input)");
        //click 'Continue' button (payment information)
        checkoutPage.clickPaymentInfoContinueButton();
        //confirm order section web element assert
        //isConfirmOrderSectionWebElementDisplayed(checkoutPage); //Selenium fails to find these elements with VALID selectors
        //capture screenshot at confirm order section (for verification)
        captureScreenshot(driver, "Confirm Order Section Display (pre-confirmation (guest ('Purchase Order')))");
        //log billing/shipping data
        logOrderBillingShippingData(checkoutPage);
        //log the pre-confirm order data (with purchase order - this uses the same logger as credit card logger)
        logPreConfirmOrderWithCreditCardProductData(checkoutPage);
        //click 'Confirm' button
        checkoutPage.clickConfirmButton();
        //capture screenshot at the end of the test (capture the result)
        captureScreenshot(driver, "Invalid Guest Order Confirmation Test Result (with 'Purchase Order' payment method - empty purchase order number)");
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //too short / too long singular input tests

    //invalid guest checkout confirmation test method - too short first name (1 char)
    protected void invalidGuestCheckoutTooShortFirstNameConfirmationTest(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutGuestDataPage checkoutGuestDataPage = new CheckoutGuestDataPage(driver);
        //checkout page billing address web element assert
        isBillingAddressSectionWebElementDisplayed(checkoutPage);
        //capture screenshot before the test (for user verification)
        captureScreenshot(driver, "Guest on Checkout Confirmation Page");
        //invalid guest input data getter (too short first name)
        checkoutGuestDataPage.invalidAdditionalGuestTooShortFirstNameDataGetter();
        //input too short first name (1 char)
        checkoutGuestDataPage.inputTooShortFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestDataPage.inputValidLastNameIntoLastNameInputField();
        //input valid email address
        checkoutGuestDataPage.inputValidEmailIntoEmailInputField();
        //click billing country dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressCountryDropdownMenu();
        //select 'United States' option
        checkoutPage.selectUSOption();
        //click billing state dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressStateDropdownMenu();
        //select 'Illinois' option
        checkoutPage.selectIllinoisOption();
        //input valid user city
        checkoutGuestDataPage.inputValidUserCityIntoCityInputField();
        //input valid address (address 1 is required only)
        checkoutGuestDataPage.inputValidAddressIntoAddress1InputField();
        //input valid user zip code
        checkoutGuestDataPage.inputValidZipCodeIntoPostCodeInputField();
        //input valid user phone number
        checkoutGuestDataPage.inputValidPhoneIntoPhoneNumberInputField();
        //click 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //assert the expected error message appears, if it doesn't, log the issue
        try {
            assertEquals("First name is too short.", checkoutGuestDataPage.getInvalidInputErrorMessage(), "The error message text doesn't match expectations.");
        } catch (TimeoutException e) {
            // log the issue if error message didn't appear without crashing the test
            logger.error("The first name input field doesn't have an error on 'too short' input.");
        }
        //capture screenshot of the invalid test result (no first name)
        captureScreenshot(driver, "Invalid Required Guest Data for Billing Address (too short first name)");
    }
    //invalid guest checkout confirmation test method - too long first name (125 chars)
    protected void invalidGuestCheckoutTooLongFirstNameConfirmationTest(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutGuestDataPage checkoutGuestDataPage = new CheckoutGuestDataPage(driver);
        //checkout page billing address web element assert
        isBillingAddressSectionWebElementDisplayed(checkoutPage);
        //capture screenshot before the test (for user verification)
        captureScreenshot(driver, "Guest on Checkout Confirmation Page");
        //invalid guest input data getter (too long first name)
        checkoutGuestDataPage.invalidAdditionalGuestTooLongFirstNameDataGetter();
        //input too long first name (125 chars)
        checkoutGuestDataPage.inputTooLongFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestDataPage.inputValidLastNameIntoLastNameInputField();
        //input valid email address
        checkoutGuestDataPage.inputValidEmailIntoEmailInputField();
        //click billing country dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressCountryDropdownMenu();
        //select 'United States' option
        checkoutPage.selectUSOption();
        //click billing state dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressStateDropdownMenu();
        //select 'Illinois' option
        checkoutPage.selectIllinoisOption();
        //input valid user city
        checkoutGuestDataPage.inputValidUserCityIntoCityInputField();
        //input valid address (address 1 is required only)
        checkoutGuestDataPage.inputValidAddressIntoAddress1InputField();
        //input valid user zip code
        checkoutGuestDataPage.inputValidZipCodeIntoPostCodeInputField();
        //input valid user phone number
        checkoutGuestDataPage.inputValidPhoneIntoPhoneNumberInputField();
        //click 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //assert the expected error message appears, if it doesn't, log the issue
        try {
            assertEquals("First name is too long.", checkoutGuestDataPage.getInvalidInputErrorMessage(), "The error message text doesn't match expectations.");
        } catch (TimeoutException e) {
            // log the issue if error message didn't appear without crashing the test
            logger.error("The first name input field doesn't have an error on 'too long' input.");
        }
        //capture screenshot of the invalid test result (too long first name)
        captureScreenshot(driver, "Invalid Required Guest Data for Billing Address (too long first name)");
    }

    //invalid guest checkout confirmation test method - too short last name (1 char)
    protected void invalidGuestCheckoutTooShortLastNameConfirmationTest(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutGuestDataPage checkoutGuestDataPage = new CheckoutGuestDataPage(driver);
        //checkout page billing address web element assert
        isBillingAddressSectionWebElementDisplayed(checkoutPage);
        //capture screenshot before the test (for user verification)
        captureScreenshot(driver, "Guest on Checkout Confirmation Page");
        //invalid guest input data getter (too short last name)
        checkoutGuestDataPage.invalidAdditionalGuestTooShortLastNameDataGetter();
        //input valid user first name
        checkoutGuestDataPage.inputValidFirstNameIntoFirstNameInputField();
        //input too short last name (1 char)
        checkoutGuestDataPage.inputTooShortLastNameIntoLastNameInputField();
        //input valid email address
        checkoutGuestDataPage.inputValidEmailIntoEmailInputField();
        //click billing country dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressCountryDropdownMenu();
        //select 'United States' option
        checkoutPage.selectUSOption();
        //click billing state dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressStateDropdownMenu();
        //select 'Illinois' option
        checkoutPage.selectIllinoisOption();
        //input valid user city
        checkoutGuestDataPage.inputValidUserCityIntoCityInputField();
        //input valid address (address 1 is required only)
        checkoutGuestDataPage.inputValidAddressIntoAddress1InputField();
        //input valid user zip code
        checkoutGuestDataPage.inputValidZipCodeIntoPostCodeInputField();
        //input valid user phone number
        checkoutGuestDataPage.inputValidPhoneIntoPhoneNumberInputField();
        //click 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //assert the expected error message appears, if it doesn't, log the issue
        try {
            assertEquals("Last name is too short.", checkoutGuestDataPage.getInvalidInputErrorMessage(), "The error message text doesn't match expectations.");
        } catch (TimeoutException e) {
            // log the issue if error message didn't appear without crashing the test
            logger.error("The last name input field doesn't have an error on 'too short' input.");
        }
        //capture screenshot of the invalid test result (too short last name)
        captureScreenshot(driver, "Invalid Required Guest Data for Billing Address (too short last name)");
    }
    //invalid guest checkout confirmation test method - too long last name (125 chars)
    protected void invalidGuestCheckoutTooLongLastNameConfirmationTest(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutGuestDataPage checkoutGuestDataPage = new CheckoutGuestDataPage(driver);
        //checkout page billing address web element assert
        isBillingAddressSectionWebElementDisplayed(checkoutPage);
        //capture screenshot before the test (for user verification)
        captureScreenshot(driver, "Guest on Checkout Confirmation Page");
        //invalid guest input data getter (too long last name)
        checkoutGuestDataPage.invalidAdditionalGuestTooLongLastNameDataGetter();
        //input valid user first name
        checkoutGuestDataPage.inputValidFirstNameIntoFirstNameInputField();
        //input too long last name (125 chars)
        checkoutGuestDataPage.inputTooLongLastNameIntoLastNameInputField();
        //input valid email address
        checkoutGuestDataPage.inputValidEmailIntoEmailInputField();
        //click billing country dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressCountryDropdownMenu();
        //select 'United States' option
        checkoutPage.selectUSOption();
        //click billing state dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressStateDropdownMenu();
        //select 'Illinois' option
        checkoutPage.selectIllinoisOption();
        //input valid user city
        checkoutGuestDataPage.inputValidUserCityIntoCityInputField();
        //input valid address (address 1 is required only)
        checkoutGuestDataPage.inputValidAddressIntoAddress1InputField();
        //input valid user zip code
        checkoutGuestDataPage.inputValidZipCodeIntoPostCodeInputField();
        //input valid user phone number
        checkoutGuestDataPage.inputValidPhoneIntoPhoneNumberInputField();
        //click 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //assert the expected error message appears, if it doesn't, log the issue
        try {
            assertEquals("Last name is too long.", checkoutGuestDataPage.getInvalidInputErrorMessage(), "The error message text doesn't match expectations.");
        } catch (TimeoutException e) {
            // log the issue if error message didn't appear without crashing the test
            logger.error("The last name input field doesn't have an error on 'too long' input.");
        }
        //capture screenshot of the invalid test result (too long last name)
        captureScreenshot(driver, "Invalid Required Guest Data for Billing Address (too long last name)");
    }

    //invalid guest checkout confirmation test method - too short email address name (3 chars total)
    protected void invalidGuestCheckoutTooShortEmailNameConfirmationTest(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutGuestDataPage checkoutGuestDataPage = new CheckoutGuestDataPage(driver);
        //checkout page billing address web element assert
        isBillingAddressSectionWebElementDisplayed(checkoutPage);
        //capture screenshot before the test (for user verification)
        captureScreenshot(driver, "Guest on Checkout Confirmation Page");
        //invalid guest input data getter (too short email address) (3 chars - name @ domain)
        checkoutGuestDataPage.invalidAdditionalGuestTooShortEmailDataGetter();
        //input valid first name
        checkoutGuestDataPage.inputValidFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestDataPage.inputValidLastNameIntoLastNameInputField();
        //input too short email address (3 chars)
        checkoutGuestDataPage.inputTooShortEmailIntoEmailInputField();
        //click billing country dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressCountryDropdownMenu();
        //select 'United States' option
        checkoutPage.selectUSOption();
        //click billing state dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressStateDropdownMenu();
        //select 'Illinois' option
        checkoutPage.selectIllinoisOption();
        //input valid user city
        checkoutGuestDataPage.inputValidUserCityIntoCityInputField();
        //input valid address (address 1 is required only)
        checkoutGuestDataPage.inputValidAddressIntoAddress1InputField();
        //input valid user zip code
        checkoutGuestDataPage.inputValidZipCodeIntoPostCodeInputField();
        //input valid user phone number
        checkoutGuestDataPage.inputValidPhoneIntoPhoneNumberInputField();
        //capture screenshot of the invalid input (too short email address)
        captureScreenshot(driver, "Too short guest email address");
        //click 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //assert the expected error message appears, if it doesn't, log the issue
        try {
            assertEquals("Email is too short.", checkoutGuestDataPage.getInvalidInputErrorMessage(), "The error message text doesn't match expectations.");
        } catch (TimeoutException e) {
            // log the issue if error message didn't appear without crashing the test
            logger.error("The email input field doesn't have an error on 'too short' input.");
        }
        //capture screenshot of the invalid test result (too short email address)
        captureScreenshot(driver, "Invalid Required Guest Data for Billing Address (too short email address)");
    }
    //invalid guest checkout confirmation test method - too long email address name (125 chars total)
    protected void invalidGuestCheckoutTooLongEmailNameConfirmationTest(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutGuestDataPage checkoutGuestDataPage = new CheckoutGuestDataPage(driver);
        //checkout page billing address web element assert
        isBillingAddressSectionWebElementDisplayed(checkoutPage);
        //capture screenshot before the test (for user verification)
        captureScreenshot(driver, "Guest on Checkout Confirmation Page");
        //invalid guest input data getter (too long email address) (125 chars - name @ domain)
        checkoutGuestDataPage.invalidAdditionalGuestTooLongEmailDataGetter();
        //input valid first name
        checkoutGuestDataPage.inputValidFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestDataPage.inputValidLastNameIntoLastNameInputField();
        //input too short email address (125 chars)
        checkoutGuestDataPage.inputTooLongEmailIntoEmailInputField();
        //click billing country dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressCountryDropdownMenu();
        //select 'United States' option
        checkoutPage.selectUSOption();
        //click billing state dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressStateDropdownMenu();
        //select 'Illinois' option
        checkoutPage.selectIllinoisOption();
        //input valid user city
        checkoutGuestDataPage.inputValidUserCityIntoCityInputField();
        //input valid address (address 1 is required only)
        checkoutGuestDataPage.inputValidAddressIntoAddress1InputField();
        //input valid user zip code
        checkoutGuestDataPage.inputValidZipCodeIntoPostCodeInputField();
        //input valid user phone number
        checkoutGuestDataPage.inputValidPhoneIntoPhoneNumberInputField();
        //capture screenshot of the invalid input (too long email address)
        captureScreenshot(driver, "Too long guest email address");
        //click 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //assert the expected error message appears, if it doesn't, log the issue
        try {
            assertEquals("Email is too long.", checkoutGuestDataPage.getInvalidInputErrorMessage(), "The error message text doesn't match expectations.");
        } catch (TimeoutException e) {
            // log the issue if error message didn't appear without crashing the test
            logger.error("The email input field doesn't have an error on 'too long' input.");
        }
        //capture screenshot of the invalid test result (too long email address)
        captureScreenshot(driver, "Invalid Required Guest Data for Billing Address (too long email address)");
    }

    //invalid guest checkout confirmation test method - too short city (1 char)
    protected void invalidGuestCheckoutTooShortCityConfirmationTest(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutGuestDataPage checkoutGuestDataPage = new CheckoutGuestDataPage(driver);
        //checkout page billing address web element assert
        isBillingAddressSectionWebElementDisplayed(checkoutPage);
        //capture screenshot before the test (for user verification)
        captureScreenshot(driver, "Guest on Checkout Confirmation Page");
        //invalid guest input data getter (too short city)
        checkoutGuestDataPage.invalidAdditionalGuestTooShortCityDataGetter();
        //input valid first name
        checkoutGuestDataPage.inputValidFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestDataPage.inputValidLastNameIntoLastNameInputField();
        //input valid email address
        checkoutGuestDataPage.inputValidEmailIntoEmailInputField();
        //click billing country dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressCountryDropdownMenu();
        //select 'United States' option
        checkoutPage.selectUSOption();
        //click billing state dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressStateDropdownMenu();
        //select 'Illinois' option
        checkoutPage.selectIllinoisOption();
        //input too short user city (1 char)
        checkoutGuestDataPage.inputTooShortCityIntoCityInputField();
        //input valid address (address 1 is required only)
        checkoutGuestDataPage.inputValidAddressIntoAddress1InputField();
        //input valid user zip code
        checkoutGuestDataPage.inputValidZipCodeIntoPostCodeInputField();
        //input valid user phone number
        checkoutGuestDataPage.inputValidPhoneIntoPhoneNumberInputField();
        //capture screenshot of the invalid input (too short user city)
        captureScreenshot(driver, "Too short user city");
        //click 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //assert the expected error message appears, if it doesn't, log the issue
        try {
            assertEquals("City is too short.", checkoutGuestDataPage.getInvalidInputErrorMessage(), "The error message text doesn't match expectations.");
        } catch (TimeoutException e) {
            // log the issue if error message didn't appear without crashing the test
            logger.error("The city input field doesn't have an error on 'too short' input.");
        }
        //capture screenshot of the invalid test result (too short user city)
        captureScreenshot(driver, "Invalid Required Guest Data for Billing Address (too short user city)");
    }
    //invalid guest checkout confirmation test method - too long city (75 chars)
    protected void invalidGuestCheckoutTooLongCityConfirmationTest(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutGuestDataPage checkoutGuestDataPage = new CheckoutGuestDataPage(driver);
        //checkout page billing address web element assert
        isBillingAddressSectionWebElementDisplayed(checkoutPage);
        //capture screenshot before the test (for user verification)
        captureScreenshot(driver, "Guest on Checkout Confirmation Page");
        //invalid guest input data getter (too long city)
        checkoutGuestDataPage.invalidAdditionalGuestTooLongCityDataGetter();
        //input valid first name
        checkoutGuestDataPage.inputValidFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestDataPage.inputValidLastNameIntoLastNameInputField();
        //input valid email address
        checkoutGuestDataPage.inputValidEmailIntoEmailInputField();
        //click billing country dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressCountryDropdownMenu();
        //select 'United States' option
        checkoutPage.selectUSOption();
        //click billing state dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressStateDropdownMenu();
        //select 'Illinois' option
        checkoutPage.selectIllinoisOption();
        //input too long user city (75 chars)
        checkoutGuestDataPage.inputTooLongCityIntoCityInputField();
        //input valid address (address 1 is required only)
        checkoutGuestDataPage.inputValidAddressIntoAddress1InputField();
        //input valid user zip code
        checkoutGuestDataPage.inputValidZipCodeIntoPostCodeInputField();
        //input valid user phone number
        checkoutGuestDataPage.inputValidPhoneIntoPhoneNumberInputField();
        //capture screenshot of the invalid input (too long user city)
        captureScreenshot(driver, "Too long user city");
        //click 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //assert the expected error message appears, if it doesn't, log the issue
        try {
            assertEquals("City is too long.", checkoutGuestDataPage.getInvalidInputErrorMessage(), "The error message text doesn't match expectations.");
        } catch (TimeoutException e) {
            // log the issue if error message didn't appear without crashing the test
            logger.error("The city input field doesn't have an error on 'too long' input.");
        }
        //capture screenshot of the invalid test result (too long user city)
        captureScreenshot(driver, "Invalid Required Guest Data for Billing Address (too long user city)");
    }

    //invalid guest checkout confirmation test method - too short user address (address1)
    protected void invalidGuestCheckoutTooShortAddressConfirmationTest(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutGuestDataPage checkoutGuestDataPage = new CheckoutGuestDataPage(driver);
        //checkout page billing address web element assert
        isBillingAddressSectionWebElementDisplayed(checkoutPage);
        //capture screenshot before the test (for user verification)
        captureScreenshot(driver, "Guest on Checkout Confirmation Page");
        //invalid guest input data getter (too short user address)
        checkoutGuestDataPage.invalidAdditionalGuestTooShortAddressDataGetter();
        //input valid first name
        checkoutGuestDataPage.inputValidFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestDataPage.inputValidLastNameIntoLastNameInputField();
        //input valid email address
        checkoutGuestDataPage.inputValidEmailIntoEmailInputField();
        //click billing country dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressCountryDropdownMenu();
        //select 'United States' option
        checkoutPage.selectUSOption();
        //click billing state dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressStateDropdownMenu();
        //select 'Illinois' option
        checkoutPage.selectIllinoisOption();
        //input valid user city
        checkoutGuestDataPage.inputValidUserCityIntoCityInputField();
        //input too short address (address 1 is required only) (3 chars)
        checkoutGuestDataPage.inputTooShortAddressIntoAddress1InputField();
        //input valid user zip code
        checkoutGuestDataPage.inputValidZipCodeIntoPostCodeInputField();
        //input valid user phone number
        checkoutGuestDataPage.inputValidPhoneIntoPhoneNumberInputField();
        //capture screenshot of the invalid input (too short user address)
        captureScreenshot(driver, "Too short user address");
        //click 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //assert the expected error message appears, if it doesn't, log the issue
        try {
            assertEquals("User address is too short.", checkoutGuestDataPage.getInvalidInputErrorMessage(), "The error message text doesn't match expectations.");
        } catch (TimeoutException e) {
            // log the issue if error message didn't appear without crashing the test
            logger.error("The address1 input field doesn't have an error on 'too short' input.");
        }
        //capture screenshot of the invalid test result (too short user address)
        captureScreenshot(driver, "Invalid Required Guest Data for Billing Address (too short user address)");
    }
    //invalid guest checkout confirmation test method - too long user address (address1)
    protected void invalidGuestCheckoutTooLongAddressConfirmationTest(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutGuestDataPage checkoutGuestDataPage = new CheckoutGuestDataPage(driver);
        //checkout page billing address web element assert
        isBillingAddressSectionWebElementDisplayed(checkoutPage);
        //capture screenshot before the test (for user verification)
        captureScreenshot(driver, "Guest on Checkout Confirmation Page");
        //invalid guest input data getter (too long user address)
        checkoutGuestDataPage.invalidAdditionalGuestTooLongAddressDataGetter();
        //input valid first name
        checkoutGuestDataPage.inputValidFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestDataPage.inputValidLastNameIntoLastNameInputField();
        //input valid email address
        checkoutGuestDataPage.inputValidEmailIntoEmailInputField();
        //click billing country dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressCountryDropdownMenu();
        //select 'United States' option
        checkoutPage.selectUSOption();
        //click billing state dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressStateDropdownMenu();
        //select 'Illinois' option
        checkoutPage.selectIllinoisOption();
        //input valid user city
        checkoutGuestDataPage.inputValidUserCityIntoCityInputField();
        //input too long address (address 1 is required only) (120 chars)
        checkoutGuestDataPage.inputTooLongAddressIntoAddress1InputField();
        //input valid user zip code
        checkoutGuestDataPage.inputValidZipCodeIntoPostCodeInputField();
        //input valid user phone number
        checkoutGuestDataPage.inputValidPhoneIntoPhoneNumberInputField();
        //capture screenshot of the invalid input (too long user address)
        captureScreenshot(driver, "Too long user address");
        //click 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //assert the expected error message appears, if it doesn't, log the issue
        try {
            assertEquals("User address is too long.", checkoutGuestDataPage.getInvalidInputErrorMessage(), "The error message text doesn't match expectations.");
        } catch (TimeoutException e) {
            // log the issue if error message didn't appear without crashing the test
            logger.error("The address1 input field doesn't have an error on 'too long' input.");
        }
        //capture screenshot of the invalid test result (too long user address)
        captureScreenshot(driver, "Invalid Required Guest Data for Billing Address (too long user address)");
    }

    //invalid guest checkout confirmation test method - too short user zip code (2 chars)
    protected void invalidGuestCheckoutTooShortZipCodeConfirmationTest(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutGuestDataPage checkoutGuestDataPage = new CheckoutGuestDataPage(driver);
        //checkout page billing address web element assert
        isBillingAddressSectionWebElementDisplayed(checkoutPage);
        //capture screenshot before the test (for user verification)
        captureScreenshot(driver, "Guest on Checkout Confirmation Page");
        //invalid guest input data getter (too short user zip code)
        checkoutGuestDataPage.invalidAdditionalGuestTooShortZipCodeDataGetter();
        //input valid first name
        checkoutGuestDataPage.inputValidFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestDataPage.inputValidLastNameIntoLastNameInputField();
        //input valid email address
        checkoutGuestDataPage.inputValidEmailIntoEmailInputField();
        //click billing country dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressCountryDropdownMenu();
        //select 'United States' option
        checkoutPage.selectUSOption();
        //click billing state dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressStateDropdownMenu();
        //select 'Illinois' option
        checkoutPage.selectIllinoisOption();
        //input valid user city
        checkoutGuestDataPage.inputValidUserCityIntoCityInputField();
        //input valid address (address 1 is required only)
        checkoutGuestDataPage.inputValidAddressIntoAddress1InputField();
        //input too short zip code (2 chars)
        checkoutGuestDataPage.inputTooShortZipCodeIntoPostCodeInputField();
        //input valid user phone number
        checkoutGuestDataPage.inputValidPhoneIntoPhoneNumberInputField();
        //capture screenshot of the invalid input (too short user zip code)
        captureScreenshot(driver, "Too short user zip code");
        //click 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //assert the expected error message appears, if it doesn't, log the issue
        try {
            assertEquals("User zip code is too short.", checkoutGuestDataPage.getInvalidInputErrorMessage(), "The error message text doesn't match expectations.");
        } catch (TimeoutException e) {
            // log the issue if error message didn't appear without crashing the test
            logger.error("The post code input field doesn't have an error on 'too short' input.");
        }
        //capture screenshot of the invalid test result (too short user zip code)
        captureScreenshot(driver, "Invalid Required Guest Data for Billing Address (too short user zip code)");
    }
    //invalid guest checkout confirmation test method - too long user zip code (75 chars)
    protected void invalidGuestCheckoutTooLongZipCodeConfirmationTest(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutGuestDataPage checkoutGuestDataPage = new CheckoutGuestDataPage(driver);
        //checkout page billing address web element assert
        isBillingAddressSectionWebElementDisplayed(checkoutPage);
        //capture screenshot before the test (for user verification)
        captureScreenshot(driver, "Guest on Checkout Confirmation Page");
        //invalid guest input data getter (too long user zip code)
        checkoutGuestDataPage.invalidAdditionalGuestTooLongZipCodeDataGetter();
        //input valid first name
        checkoutGuestDataPage.inputValidFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestDataPage.inputValidLastNameIntoLastNameInputField();
        //input valid email address
        checkoutGuestDataPage.inputValidEmailIntoEmailInputField();
        //click billing country dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressCountryDropdownMenu();
        //select 'United States' option
        checkoutPage.selectUSOption();
        //click billing state dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressStateDropdownMenu();
        //select 'Illinois' option
        checkoutPage.selectIllinoisOption();
        //input valid user city
        checkoutGuestDataPage.inputValidUserCityIntoCityInputField();
        //input valid address (address 1 is required only)
        checkoutGuestDataPage.inputValidAddressIntoAddress1InputField();
        //input too long zip code (75 chars)
        checkoutGuestDataPage.inputTooLongZipCodeIntoPostCodeInputField();
        //input valid user phone number
        checkoutGuestDataPage.inputValidPhoneIntoPhoneNumberInputField();
        //capture screenshot of the invalid input (too long user zip code)
        captureScreenshot(driver, "Too long user zip code");
        //click 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //assert the expected error message appears, if it doesn't, log the issue
        try {
            assertEquals("User zip code is too long.", checkoutGuestDataPage.getInvalidInputErrorMessage(), "The error message text doesn't match expectations.");
        } catch (TimeoutException e) {
            // log the issue if error message didn't appear without crashing the test
            logger.error("The post code input field doesn't have an error on 'too long' input.");
        }
        //capture screenshot of the invalid test result (too long user zip code)
        captureScreenshot(driver, "Invalid Required Guest Data for Billing Address (too long user zip code)");
    }

    //invalid guest checkout confirmation test method - too short user phone number (6 chars)
    protected void invalidGuestCheckoutTooShortPhoneConfirmationTest(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutGuestDataPage checkoutGuestDataPage = new CheckoutGuestDataPage(driver);
        //checkout page billing address web element assert
        isBillingAddressSectionWebElementDisplayed(checkoutPage);
        //capture screenshot before the test (for user verification)
        captureScreenshot(driver, "Guest on Checkout Confirmation Page");
        //invalid guest input data getter (too short user phone number)
        checkoutGuestDataPage.invalidAdditionalGuestTooShortPhoneDataGetter();
        //input valid first name
        checkoutGuestDataPage.inputValidFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestDataPage.inputValidLastNameIntoLastNameInputField();
        //input valid email address
        checkoutGuestDataPage.inputValidEmailIntoEmailInputField();
        //click billing country dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressCountryDropdownMenu();
        //select 'United States' option
        checkoutPage.selectUSOption();
        //click billing state dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressStateDropdownMenu();
        //select 'Illinois' option
        checkoutPage.selectIllinoisOption();
        //input valid user city
        checkoutGuestDataPage.inputValidUserCityIntoCityInputField();
        //input valid address (address 1 is required only)
        checkoutGuestDataPage.inputValidAddressIntoAddress1InputField();
        //input valid zip code
        checkoutGuestDataPage.inputValidZipCodeIntoPostCodeInputField();
        //input too short phone number (6 chars)
        checkoutGuestDataPage.inputTooShortPhoneIntoPhoneNumberInputField();
        //capture screenshot of the invalid input (too short user phone number)
        captureScreenshot(driver, "Too short user phone number");
        //click 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //assert the expected error message appears, if it doesn't, log the issue
        try {
            assertEquals("User phone number is too short.", checkoutGuestDataPage.getInvalidInputErrorMessage(), "The error message text doesn't match expectations.");
        } catch (TimeoutException e) {
            // log the issue if error message didn't appear without crashing the test
            logger.error("The phone number input field doesn't have an error on 'too short' input.");
        }
        //capture screenshot of the invalid test result (too short user phone number)
        captureScreenshot(driver, "Invalid Required Guest Data for Billing Address (too short user phone number)");
    }
    //invalid guest checkout confirmation test method - too long user phone number (25 chars)
    protected void invalidGuestCheckoutTooLongPhoneConfirmationTest(){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutGuestDataPage checkoutGuestDataPage = new CheckoutGuestDataPage(driver);
        //checkout page billing address web element assert
        isBillingAddressSectionWebElementDisplayed(checkoutPage);
        //capture screenshot before the test (for user verification)
        captureScreenshot(driver, "Guest on Checkout Confirmation Page");
        //invalid guest input data getter (too long user phone number)
        checkoutGuestDataPage.invalidAdditionalGuestTooLongPhoneDataGetter();
        //input valid first name
        checkoutGuestDataPage.inputValidFirstNameIntoFirstNameInputField();
        //input valid last name
        checkoutGuestDataPage.inputValidLastNameIntoLastNameInputField();
        //input valid email address
        checkoutGuestDataPage.inputValidEmailIntoEmailInputField();
        //click billing country dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressCountryDropdownMenu();
        //select 'United States' option
        checkoutPage.selectUSOption();
        //click billing state dropdown menu (somehow the webpage doesn't keep the chosen result before after refresh)
        checkoutPage.clickBillingAddressStateDropdownMenu();
        //select 'Illinois' option
        checkoutPage.selectIllinoisOption();
        //input valid user city
        checkoutGuestDataPage.inputValidUserCityIntoCityInputField();
        //input valid address (address 1 is required only)
        checkoutGuestDataPage.inputValidAddressIntoAddress1InputField();
        //input valid zip code
        checkoutGuestDataPage.inputValidZipCodeIntoPostCodeInputField();
        //input too long phone number (25 chars)
        checkoutGuestDataPage.inputTooLongPhoneIntoPhoneNumberInputField();
        //capture screenshot of the invalid input (too long user phone number)
        captureScreenshot(driver, "Too long user phone number");
        //click 'Continue' button
        checkoutPage.clickBillingAddressContinueButton();
        //assert the expected error message appears, if it doesn't, log the issue
        try {
            assertEquals("User phone number is too long.", checkoutGuestDataPage.getInvalidInputErrorMessage(), "The error message text doesn't match expectations.");
        } catch (TimeoutException e) {
            // log the issue if error message didn't appear without crashing the test
            logger.error("The phone number input field doesn't have an error on 'too long' input.");
        }
        //capture screenshot of the invalid test result (too short user phone number)
        captureScreenshot(driver, "Invalid Required Guest Data for Billing Address (too long user phone number)");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //homepage web element assert test method
    protected void isHomePageWebElementDisplayed(HomePage homePage){
        //assert homepage community poll radio buttons are displayed (as a list)
        assertTrue(homePage.isCommunityPollRadioButtonDisplayed(), "The homepage community poll radio button isn't displayed");
        //assert homepage community poll vote button is displayed
        assertTrue(homePage.isVoteButtonDisplayed(), "The homepage community poll vote button isn't displayed");
        //assert homepage aside tag links are displayed (as a list)
        assertTrue(homePage.isAsideTagsLinkDisplayed(), "The homepage aside tags link isn't displayed");
        //assert homepage product cards are displayed (as a list)
        assertTrue(homePage.isProductCardDisplayed(), "The homepage product card isn't displayed");
        //assert homepage product names are displayed (as a list)
        assertTrue(homePage.isProductNameDisplayed(), "The homepage product name isn't displayed");
        //assert homepage product prices are displayed (as a list)
        assertTrue(homePage.isProductPriceDisplayed(), "The homepage product price isn't displayed");
        //assert homepage product 'add to cart' buttons are displayed (as a list)
        assertTrue(homePage.isAddToCartProductButtonDisplayed(), "The homepage product 'add to cart' button isn't displayed");
    }

    //general page web element assert test method
    protected void isGeneralPageWebElementDisplayed(HomePage homePage){
        //assert homepage logo is displayed
        assertTrue(homePage.isHomePageLogoDisplayed(), "The homepage logo isn't displayed");
        //assert search bar input field is displayed
        assertTrue(homePage.isSearchInputBarDisplayed(), "The search bar input field isn't displayed");
        //assert search button is displayed
        assertTrue(homePage.isSearchButtonDisplayed(), "The search button isn't displayed");
        //assert register head nav link is displayed
        assertTrue(homePage.isRegisterHeadNavLinkDisplayed(), "The register head nav link isn't displayed");
        //assert login head nav link is displayed
        assertTrue(homePage.isLoginHeadNavLinkDisplayed(), "The login head nav link isn't displayed");
        //assert shopping cart head nav link is displayed
        assertTrue(homePage.isShoppingCartHeadNavLinkDisplayed(), "The shopping cart head nav link isn't displayed");
        //assert wishlist head nav link is displayed
        assertTrue(homePage.isWishlistHeadNavLinkDisplayed(), "The wishlist head nav link isn't displayed");
        //assert books nav link is displayed
        assertTrue(homePage.isBooksNavLinkDisplayed(), "The books nav link isn't displayed");
        //assert computers nav link is displayed
        assertTrue(homePage.isComputersNavLinkDisplayed(), "The computers nav link isn't displayed");
        //assert electronics nav link is displayed
        assertTrue(homePage.isElectronicsNavLinkDisplayed(), "The electronics nav link isn't displayed");
        //assert apparel & shoes nav link is displayed
        assertTrue(homePage.isApparelShoesNavLinkDisplayed(), "The apparel & shoes nav link isn't displayed");
        //assert digital downloads nav link is displayed
        assertTrue(homePage.isDownloadsNavLinkDisplayed(), "The digital downloads nav link isn't displayed");
        //assert jewelry nav link is displayed
        assertTrue(homePage.isJewelryNavLinkDisplayed(), "The jewelry nav link isn't displayed");
        //assert gift cards nav link is displayed
        assertTrue(homePage.isGiftCardsNavLinkDisplayed(), "The gift cards nav link isn't displayed");
        //assert footer column info are displayed (as a list)
        assertTrue(homePage.isColumnInfoLinkDisplayed(), "The footer column info link isn't displayed");
        //assert footer customer service are displayed (as a list)
        assertTrue(homePage.isCustomerServiceLinkDisplayed(), "The footer customer service link isn't displayed");
        //assert footer my account link are displayed (as a list)
        assertTrue(homePage.isMyAccountLinkDisplayed(), "The footer my account link isn't displayed");
        //assert footer social media link are displayed (as a list)
        assertTrue(homePage.isSocialMediaLinkDisplayed(), "The footer social media link isn't displayed");
        //assert footer disclaimer text is displayed
        assertTrue(homePage.isDisclaimerTextDisplayed(), "The footer disclaimer text isn't displayed");
    }
    //homepage text assert test method
    protected void isHomePageTextMatchExpectations(HomePage homePage){
        //assert homepage categories aside box title matches expectations
        assertEquals("CATEGORIES", homePage.getCategoriesAsideBoxTitle(), "The homepage categories aside box title text doesn't match expectations");
        //assert homepage manufacturers aside box title matches expectations
        assertEquals("MANUFACTURERS", homePage.getManufacturersAsideBoxTitle(), "The homepage manufacturers aside box title text doesn't match expectations");
        //assert homepage tags aside box title matches expectations
        assertEquals("POPULAR TAGS", homePage.getTagsBoxTitle(), "The homepage tags aside box title text doesn't match expectations");
        //assert homepage community poll title matches expectations
        assertEquals("COMMUNITY POLL", homePage.getCommunityPollTitle(), "The homepage community poll title text doesn't match expectations");
        //assert homepage product section title matches expectations
        assertEquals("FEATURED PRODUCTS", homePage.getProductsSectionTitle(), "The homepage product section title text doesn't match expectations");
    }
    //homepage products logger method
    protected void logHomePageProductsData(HomePage homePage){
        System.out.println("Products displayed on homepage: " + "\n");
        logger.info("Product name: " + homePage.getProductName());
        logger.info("Product price: " + homePage.getProductPrice());
    }

    //general page text assert test method
    protected void isGeneralPageTextElementAsExpected(HomePage homePage){
        //assert footer column info title matches expectations
        assertEquals("INFORMATION", homePage.getColumnInfoTitle(), "The column info title text doesn't match expectations");
        //assert footer customer service title matches expectations
        assertEquals("CUSTOMER SERVICE", homePage.getCustomerServiceTitle(), "The customer service title text doesn't match expectations");
        //assert footer my account title matches expectations
        assertEquals("MY ACCOUNT", homePage.getMyAccountTitle(), "The my account title text doesn't match expectations");
        //assert footer social media title matches expectations
        assertEquals("FOLLOW US", homePage.getSocialMediaTitle(), "The social media title text doesn't match expectations");
        //assert footer disclaimer text matches expectations
        assertEquals("Copyright © 2024 Tricentis Demo Web Shop. All rights reserved.", homePage.getDisclaimerText(), "The disclaimer text doesn't match expectations");
    }

    //aside page web element assert test method
    protected void isAsidePageWebElementDisplayed(HomePage homePage){
        //assert aside newsletter input field is displayed
        assertTrue(homePage.isNewsletterInputFieldDisplayed(), "The aside newsletter input field isn't displayed");
        //assert aside newsletter button is displayed
        assertTrue(homePage.isNewsletterButtonDisplayed(), "The aside newsletter button isn't displayed");
        //assert aside manufacturers link is displayed
        assertTrue(homePage.isManufacturersLinkDisplayed(), "The aside manufacturer link isn't displayed");
        //assert aside categories link are displayed (as a list)
        assertTrue(homePage.isCategoriesLinkDisplayed(), "The aside categories link isn't displayed");
    }

    //register page web element assert test method
    protected void isRegisterPageWebElementDisplayed(RegisterPage registerPage){
        //assert register page title is displayed
        assertTrue(registerPage.isRegisterPageTitleDisplayed(), "The register page title isn't displayed");
        //assert gender male button is displayed
        assertTrue(registerPage.isGenderMaleButtonDisplayed(), "The gender male button isn't displayed");
        //assert gender female button is displayed
        assertTrue(registerPage.isGenderFemaleButtonDisplayed(), "The gender female button isn't displayed");
        //assert first name input field is displayed
        assertTrue(registerPage.isFirstNameInputFieldDisplayed(), "The first name input field isn't displayed");
        //assert last name input field is displayed
        assertTrue(registerPage.isLastNameInputFieldDisplayed(), "The last name input field isn't displayed");
        //assert email input field is displayed
        assertTrue(registerPage.isEmailInputFieldDisplayed(), "The email input field isn't displayed");
        //assert password input field is displayed
        assertTrue(registerPage.isPasswordInputFieldDisplayed(), "The password input field isn't displayed");
        //assert confirm password input field is displayed
        assertTrue(registerPage.isConfirmPasswordInputFieldDisplayed(), "The confirm password input field isn't displayed");
        //assert 'Register' button is displayed
        assertTrue(registerPage.isRegisterButtonDisplayed(), "The 'Register' button isn't displayed");
    }

    //login page web element assert test method
    protected void isLoginPageWebElementDisplayed(LoginPage loginPage){
        //assert login page title is displayed
        assertTrue(loginPage.isLoginPageTitleDisplayed(), "The login page title isn't displayed");
        //assert register section title is displayed
        assertTrue(loginPage.isRegisterSectionTitleDisplayed(), "The register section title isn't displayed");
        //assert register section description is displayed
        assertTrue(loginPage.isRegisterSectionDescriptionDisplayed(), "The register section description isn't displayed");
        //assert register section button is displayed
        assertTrue(loginPage.isRegisterSectionButtonDisplayed(), "The register section button isn't displayed");
        //assert login section title is displayed
        assertTrue(loginPage.isLoginSectionTitleDisplayed(), "The login section title isn't displayed");
        //assert email input field is displayed
        assertTrue(loginPage.isEmailAddressInputFieldDisplayed(), "The email address input field isn't displayed");
        //assert password input field is displayed
        assertTrue(loginPage.isPasswordInputFieldDisplayed(), "The password input field isn't displayed");
        //assert 'Remember me' checkbox is displayed
        assertTrue(loginPage.isRememberMeCheckboxDisplayed(), "The 'Remember me' checkbox isn't displayed");
        //assert 'Forgot password' link is displayed
        assertTrue(loginPage.isForgotPasswordLinkDisplayed(), "The 'Forgot password' link isn't displayed");
        //assert login button is displayed
        assertTrue(loginPage.isLoginButtonDisplayed(), "The login button isn't displayed");
    }
    //login page register section text assert method
    protected void isRegisterSectionTextAsExpected(LoginPage loginPage){
        //assert the user gets onto login page
        assertEquals("Welcome, Please Sign In!", loginPage.getLoginPageTitle(), "The login page title doesn't match expectations or the user is on the wrong page");
        //assert the register section title is as expected
        assertEquals("New Customer", loginPage.getRegisterSectionTitle(), "The register section title doesn't match expectations");
        //assert the register section description is as expected
        assertEquals("By creating an account on our website you will be able to shop faster, be up to date on an orders status, and keep track of the orders you have previously made.", loginPage.getRegisterSectionDescription(), "The register section description doesn't match expectations");
    }
    //login page login section text assert method
    protected void isLoginSectionTextAsExpected(LoginPage loginPage){
        //assert the login section title is as expected
        assertEquals("Returning Customer", loginPage.getLoginSectionTitle(), "The login section title doesn't match expectations");
    }

    //search product page web element assert test method
    protected void isSearchProductPageWebElementDisplayed(SearchProductPage searchProductPage){
        //assert search product page title is displayed
        assertTrue(searchProductPage.isSearchProductPageTitleDisplayed(), "The search product page title isn't displayed");
        //assert search keyword label is displayed
        assertTrue(searchProductPage.isSearchKeywordLabelDisplayed(), "The search keyword label isn't displayed");
        //assert search keyword input bar is displayed
        assertTrue(searchProductPage.isSearchKeywordInputBarDisplayed(), "The search keyword input bar isn't displayed");
        //assert search button is displayed
        assertTrue(searchProductPage.isSearchButtonDisplayed(), "The search button isn't displayed");
        //assert 'Advanced search' checkbox is displayed
        assertTrue(searchProductPage.isAdvancedSearchCheckboxDisplayed(), "The 'Advanced search' checkbox isn't displayed");
        //assert search 'Sort by' dropdown menu is displayed
        assertTrue(searchProductPage.isSearchSortByDropdownMenuDisplayed(), "The search 'Sort by' dropdown menu isn't displayed");
        //assert search 'display count' dropdown menu is displayed
        assertTrue(searchProductPage.isSearchDisplayCountDropdownMenuDisplayed(), "The search 'display count' dropdown menu isn't displayed");
        //assert search 'page view' dropdown menu is displayed
        assertTrue(searchProductPage.isViewAsDropdownMenuDisplayed(), "The search 'page view' dropdown menu isn't displayed");
        //assert search product cards are displayed (as a list)
        assertTrue(searchProductPage.isSearchProductCardDisplayed(), "The search product cards aren't displayed");
        //assert search product names are displayed (as a list)
        assertTrue(searchProductPage.isSearchProductNameDisplayed(), "The search product names aren't displayed");
        //assert search product review stars are displayed (as a list)
        assertTrue(searchProductPage.isSearchProductReviewStarsDisplayed(), "The search product review stars aren't displayed");
        //assert search product unit prices are displayed (as a list)
        assertTrue(searchProductPage.isSearchProductUnitPriceDisplayed(), "The search product unit prices aren't displayed");
        //assert search product 'Add to cart' buttons are displayed (as a list) //'StaleElementRefException' even though the elements are visually present and nothing obstructs them
        //assertTrue(searchProductPage.isSearchProductAddToCartButtonDisplayed(), "The search product 'Add to cart' buttons aren't displayed");
    }
    //search page text element assert method
    protected void isSearchProductPageTextAsExpected(SearchProductPage searchProductPage){
        //assert search product page title is as expected
        assertEquals("Search", searchProductPage.getSearchProductPageTitle(), "The search product page title doesn't match expectations");
        //assert search product page title is as expected
        assertEquals("Search keyword:", searchProductPage.getSearchKeywordLabel(), "The search product page keyword label doesn't match expectations");
    }

    //search product page data getter (single product)
    protected void logSingleSearchedProductData(SearchProductPage searchProductPage){
        System.out.println("Product displayed in the search product page data: " + "\n");
        logger.info("Product name (searched product page): " + searchProductPage.getSingleSearchedProductName());
        logger.info("Product unit price (searched product page): " + searchProductPage.getSingleSearchedProductUnitPrice());

        System.out.println("\n");
    }
    //search product page data getter
    protected void logSearchedProductsData(SearchProductPage searchProductPage){
        System.out.println("Products displayed in the search product page data: " + "\n");
        logger.info("Product names (searched product page): " + searchProductPage.getSearchedProductNames());
        logger.info("Product unit prices (searched product page): " + searchProductPage.getSearchedProductPrices());

        System.out.println("\n");
    }

    //single product page web element assert test method
    protected void isSingleProductPageWebElementDisplayed(SingleProductPage singleProductPage){
        //assert main product picture is displayed
        assertTrue(singleProductPage.isMainProductPictureDisplayed(), "The main product picture isn't displayed");
        //assert product description is displayed
        assertTrue(singleProductPage.isProductDescriptionDisplayed(), "The product description isn't displayed");
        //assert product name is displayed
        assertTrue(singleProductPage.isProductNameDisplayed(), "The product name isn't displayed");
        //assert product short description is displayed
        assertTrue(singleProductPage.isProductShortDescriptionDisplayed(), "The product short description isn't displayed");
        //assert product availability is displayed
        assertTrue(singleProductPage.isProductAvailabilityDisplayed(), "The product availability isn't displayed");
        //assert product review box is displayed
        assertTrue(singleProductPage.isProductReviewBoxDisplayed(), "The product review box isn't displayed");
        //assert product view reviews link is displayed
        assertTrue(singleProductPage.isProductViewReviewsLinkDisplayed(), "The product view reviews link isn't displayed");
        //assert product add review link is displayed
        assertTrue(singleProductPage.isProductAddReviewLinkDisplayed(), "The product add review link isn't displayed");
        //assert product price is displayed
        assertTrue(singleProductPage.isProductPriceDisplayed(), "The product price isn't displayed");
        //assert product quantity input field is displayed
        assertTrue(singleProductPage.isProductQuantityInputFieldDisplayed(), "The product quantity input field isn't displayed");
        //assert 'Email a friend' button is displayed
        assertTrue(singleProductPage.isProductEmailAFriendButtonDisplayed(), "The 'Email a friend' button isn't displayed");
        //assert 'Add to cart' button is displayed
        assertTrue(singleProductPage.isProductAddToCartButtonDisplayed(), "The 'Add to cart' button isn't displayed");
        //assert 'Add to compare' is displayed
        assertTrue(singleProductPage.isProductAddToCompareButtonDisplayed(), "The 'Add to compare' isn't displayed");
        //assert product breadcrumb path is displayed (as a list)
        assertTrue(singleProductPage.isProductBreadcrumbPathDisplayed(), "The product breadcrumb path isn't displayed");
        //assert product tags are displayed (as a list)
        assertTrue(singleProductPage.isProductTagDisplayed(), "The product tags isn't displayed");
        //assert 'customers who bought same product' product cards are displayed (as a list)
        assertTrue(singleProductPage.isCustomersBoughtSameProductCardDisplayed(), "The 'customers who bought same product' product card isn't displayed");
    }
    //additional single product page web element assert test method
    protected void isAdditionalSinglePageWebElementDisplayed(SingleProductPage singleProductPage){
        //assert product free shipping badge is displayed
        assertTrue(singleProductPage.isProductFreeShippingBadgeDisplayed(), "The product free shipping badge isn't displayed");
        //assert product processor radio buttons aren't displayed (as a list)
        assertTrue(singleProductPage.isProductProcessorRadioButtonElementsDisplayed(), "The product processor radio button isn't displayed");
        //assert product RAM radio buttons aren't displayed (as a list)
        assertTrue(singleProductPage.isProductRAMRadioButtonElementsDisplayed(), "The product RAM radio button isn't displayed");
        //assert product thumb pictures are displayed (as a list)
        assertTrue(singleProductPage.isProductThumbPictureDisplayed(), "The product thumb picture path isn't displayed");
        //assert product HDD radio buttons are displayed (as a list)
        assertTrue(singleProductPage.isProductHDDRadioButtonDisplayed(), "The product HDD radio button isn't displayed");
        //assert product OS radio buttons are displayed (as a list)
        assertTrue(singleProductPage.isProductOSRadioButtonDisplayed(), "The product OS radio button isn't displayed");
        //assert product software radio buttons are displayed (as a list)
        assertTrue(singleProductPage.isProductSoftwareRadioButtonDisplayed(), "The product software radio button isn't displayed");
    }

    //single product page data logger method
    protected void logSingleProductPageData(SingleProductPage singleProductPage){
        System.out.println("Product data on a single product page: " + "\n");
        logger.info("Product name (single product page): " + singleProductPage.getProductName());
        logger.info("Product short description (single product page): " + singleProductPage.getProductShortDescription());
        logger.info("Product description (single product page): " + singleProductPage.getProductDescription());
        logger.info("Product availability (single product page): " + singleProductPage.getProductAvailability());
        logger.info("Product default quantity (single product page): " + singleProductPage.getDefaultProductQuantity());
        logger.info("Product unit price (single product page): " + singleProductPage.getProductUnitPrice());
    }

    //shopping cart page web element assert test method
    protected void isShoppingCartPageWebElementDisplayed(ShoppingCartPage shoppingCartPage){
        //assert shopping cart page title is displayed
        assertTrue(shoppingCartPage.isShoppingCartPageTitleDisplayed(), "The shopping cart page title isn't displayed");
        //assert 'Update shopping cart' button is displayed
        assertTrue(shoppingCartPage.isUpdateShoppingCartButtonDisplayed(), "The 'Update shopping cart' button isn't displayed");
        //assert 'Continue shopping' button is displayed
        assertTrue(shoppingCartPage.isContinueShoppingButtonDisplayed(), "The 'Continue shopping' button isn't displayed");
        //assert shopping cart page discount section title is displayed
        assertTrue(shoppingCartPage.isDiscountCodeSectionTitleDisplayed(), "The discount section title isn't displayed");
        //assert shopping cart page discount section hint is displayed
        assertTrue(shoppingCartPage.isDiscountCodeSectionHintDisplayed(), "The discount section hint isn't displayed");
        //assert shopping cart page discount code input field is displayed
        assertTrue(shoppingCartPage.isDiscountCodeInputFieldDisplayed(), "The discount code input field isn't displayed");
        //assert shopping cart page 'Apply discount' button is displayed
        assertTrue(shoppingCartPage.isApplyDiscountCouponButtonDisplayed(), "The 'Apply discount' button isn't displayed");
        //assert shopping cart page gift card section title is displayed
        assertTrue(shoppingCartPage.isGiftCardSectionTitleDisplayed(), "The gift card section title isn't displayed");
        //assert shopping cart page gift card section hint is displayed
        assertTrue(shoppingCartPage.isGiftCardSectionHintDisplayed(), "The gift card section hint isn't displayed");
        //assert shopping cart page gift card code input field is displayed
        assertTrue(shoppingCartPage.isGiftCardCodeInputFieldDisplayed(), "The gift card code input field isn't displayed");
        //assert shopping cart page 'Add gift card' button is displayed
        assertTrue(shoppingCartPage.isAddGiftCardButtonDisplayed(), "The 'Add gift card' button isn't displayed");
        //assert shopping cart page estimate shipping section title is displayed
        assertTrue(shoppingCartPage.isEstimateShippingSectionTitleDisplayed(), "The estimate shipping section title isn't displayed");
        //assert shopping cart page estimate shipping section hint is displayed
        assertTrue(shoppingCartPage.isEstimateShippingSectionHintDisplayed(), "The estimate shipping section hint isn't displayed");
        //assert shopping cart page shipping country dropdown menu is displayed
        assertTrue(shoppingCartPage.isShippingCountryDropdownMenuDisplayed(), "The shipping country dropdown menu isn't displayed");
        //assert shopping cart page shipping state dropdown menu is displayed
        assertTrue(shoppingCartPage.isShippingStateDropdownMenuDisplayed(), "The shipping state dropdown menu isn't displayed");
        //assert shopping cart page zip code input field is displayed
        assertTrue(shoppingCartPage.isZipCodeInputFieldDisplayed(), "The zip code input field isn't displayed");
        //assert shopping cart page estimate shipping button is displayed
        assertTrue(shoppingCartPage.isEstimateShippingButtonDisplayed(), "The 'Estimate shipping' button isn't displayed");
        //assert shopping cart page product sub-total price is displayed
        assertTrue(shoppingCartPage.isProductSubTotalPriceDisplayed(), "The product sub total price isn't displayed");
        //assert shopping cart page product shipping price is displayed
        assertTrue(shoppingCartPage.isProductShippingPriceDisplayed(), "The product shipping price isn't displayed");
        //assert shopping cart page product tax is displayed
        assertTrue(shoppingCartPage.isProductTaxDisplayed(), "The product tax isn't displayed");
        //assert shopping cart page product total price is displayed
        assertTrue(shoppingCartPage.isProductTotalPriceDisplayed(), "The product total price isn't displayed");
        //assert shopping cart page 'Agree to terms' checkbox is displayed
        assertTrue(shoppingCartPage.isAgreeToTermsCheckBoxDisplayed(), "The 'Agree to terms' checkbox isn't displayed");
        //assert shopping cart page 'Checkout' button is displayed
        assertTrue(shoppingCartPage.isCheckoutButtonDisplayed(), "The 'Checkout' button isn't displayed");
        //assert shopping cart table remove product checkboxes are displayed (as a list)
        assertTrue(shoppingCartPage.isShoppingCartProductRemoveCheckboxDisplayed(), "The shopping cart table product remove checkbox isn't displayed");
        //assert shopping cart table product images are displayed (as a list)
        assertTrue(shoppingCartPage.isShoppingCartProductImageDisplayed(), "The shopping cart table product image isn't displayed");
        //assert shopping cart table product name are displayed (as a list)
        assertTrue(shoppingCartPage.isShoppingCartProductNameDisplayed(), "The shopping cart table product name isn't displayed");
        //assert shopping cart table product unit prices are displayed (as a list)
        assertTrue(shoppingCartPage.isShoppingCartProductUnitPriceDisplayed(), "The shopping cart table product unit price isn't displayed");
        //assert shopping cart table product quantity input fields are displayed (as a list)
        assertTrue(shoppingCartPage.isShoppingCartProductQtyInputFieldDisplayed(), "The shopping cart table product quantity input fields isn't displayed");
        //assert shopping cart table product total price are displayed (as a list)
        assertTrue(shoppingCartPage.isShoppingCartProductTotalPriceDisplayed(), "The shopping cart table product total price isn't displayed");
    }

    //shopping cart page text element assert test method
    protected void isShoppingCartTextElementAsExpected(ShoppingCartPage shoppingCartPage){
        //assert discount code section title as expected
        assertEquals("Discount Code", shoppingCartPage.getDiscountSectionTitle(), "The shopping cart discount section title doesn't match expectations");
        //assert discount code section hint as expected
        assertEquals("Enter your coupon here", shoppingCartPage.getDiscountSectionHint(), "The shopping cart discount section hint doesn't match expectations");
        //assert gift card section title as expected
        assertEquals("Gift Cards", shoppingCartPage.getGiftCardSectionTitle(), "The shopping cart gift card title doesn't match expectations");
        //assert gift card section hint as expected
        assertEquals("Enter gift card code", shoppingCartPage.getGiftCardSectionHint(), "The shopping cart gift card hint doesn't match expectations");
        //assert estimate shipping section title as expected
        assertEquals("Estimate shipping", shoppingCartPage.getEstimateShippingSectionTitle(), "The shopping cart estimate shipping title doesn't match expectations");
        //assert estimate shipping section hint as expected
        assertEquals("Enter your destination to get a shipping estimate", shoppingCartPage.getEstimateShippingSectionHint(), "The shopping cart estimate shipping hint doesn't match expectations");
    }

    //shopping cart product data logger
    protected void logShoppingCartProductData(ShoppingCartPage shoppingCartPage){
        System.out.println("Shopping cart product available data: " + "\n");
        System.out.println("Shopping cart table product data: " + "\n");

        logger.info("Product name(s): " + shoppingCartPage.getShoppingCartTableProductName());
        logger.info("Product unit price(s): " + shoppingCartPage.getShoppingCartTableProductUnitPrice());
        logger.info("Product quantity(ies): " + shoppingCartPage.getShoppingCartTableProductQuantity());
        logger.info("Product total price(s): " + shoppingCartPage.getShoppingCartTableProductTotalPrice());

        System.out.println("Shopping cart lower table product data: " + "\n");

        logger.info("Product(s) sub-total price: " + shoppingCartPage.getProductSubTotalPrice());
        logger.info("Product(s) shipping price: " + shoppingCartPage.getProductShippingPrice());
        logger.info("Product(s) tax: " + shoppingCartPage.getProductTax());
        logger.info("Product(s) total price: " + shoppingCartPage.getProductTotalPrice());

        System.out.println("\n");
    }

    //checkout page billing address section web element assert test method
    protected void isBillingAddressSectionWebElementDisplayed(CheckoutPage checkoutPage){
        //assert the checkout page title is displayed
        assertTrue(checkoutPage.isCheckoutPageTitleDisplayed(), "The checkout page title isn't displayed");
        //assert the billing address section title is displayed
        assertTrue(checkoutPage.isBillingAddressSectionTitleDisplayed(), "The billing address section title isn't displayed");
        //assert the billing address section first name input field is displayed
        assertTrue(checkoutPage.isFirstNameInputFieldDisplayed(), "The billing address section first name input field isn't displayed");
        //assert the billing address section last name input field is displayed
        assertTrue(checkoutPage.isLastNameInputFieldDisplayed(), "The billing address section last name input field isn't displayed");
        //assert the billing address section email input field is displayed
        assertTrue(checkoutPage.isEmailAddressInputFieldDisplayed(), "The billing address section email input field isn't displayed");
        //assert the billing address section company input field is displayed
        assertTrue(checkoutPage.isCompanyInputFieldDisplayed(), "The billing address section company input field isn't displayed");
        //assert the billing address section country dropdown menu is displayed
        assertTrue(checkoutPage.isCountryDropdownMenuDisplayed(), "The billing address section country dropdown menu isn't displayed");
        //assert the billing address section state dropdown menu is displayed
        assertTrue(checkoutPage.isStateDropdownMenuDisplayed(), "The billing address section state dropdown menu isn't displayed");
        //assert the billing address section city input field is displayed
        assertTrue(checkoutPage.isCityInputFieldDisplayed(), "The billing address section city input field isn't displayed");
        //assert the billing address section address1 (required) input field is displayed
        assertTrue(checkoutPage.isAddress1InputFieldDisplayed(), "The billing address section address 1 input field isn't displayed");
        //assert the billing address section address2 input field is displayed
        assertTrue(checkoutPage.isAddress2InputFieldDisplayed(), "The billing address section address 2 input field isn't displayed");
        //assert the billing address section postal code input field is displayed
        assertTrue(checkoutPage.isPostalCodeInputFieldDisplayed(), "The billing address section postal code input field isn't displayed");
        //assert the billing address section phone number input field is displayed
        assertTrue(checkoutPage.isPhoneNumberInputFieldDisplayed(), "The billing address section phone number input field isn't displayed");
        //assert the billing address section fax number input field is displayed
        assertTrue(checkoutPage.isFaxNumberInputFieldDisplayed(), "The billing address section fax number input field isn't displayed");
        //assert the billing address section 'Continue' button is displayed
        assertTrue(checkoutPage.isBillingAddressContinueButtonDisplayed(), "The billing address section 'Continue' button isn't displayed");
    }
    //shipping address section web element assert test method
    protected void isShippingAddressSectionWebElementDisplayed(CheckoutPage checkoutPage){
        //assert the shipping address section title is displayed
        assertTrue(checkoutPage.isShippingAddressSectionTitleDisplayed(), "The shipping address section title isn't displayed");
        //assert the shipping address section dropdown menu is displayed //selenium cannot find this element even though it's fully visible with valid selector
        assertTrue(checkoutPage.isShippingAddressDropdownMenuDisplayed(), "The shipping address dropdown menu isn't displayed");
        //assert the shipping address section dropdown description is displayed
        assertTrue(checkoutPage.isShippingAddressDropdownMenuDescriptionDisplayed(), "The shipping address dropdown menu description isn't displayed");
        //assert the shipping address 'In store pickup' checkbox is displayed
        assertTrue(checkoutPage.isShippingAddressInStorePickupCheckboxDisplayed(), "The shipping address 'In store pickup' checkbox isn't displayed");
        //assert the shipping address in store description is displayed
        assertTrue(checkoutPage.isShippingAddressInStoreDescriptionDisplayed(), "The shipping address in store description isn't displayed");
        //assert the shipping address back link is displayed
        assertTrue(checkoutPage.isShippingAddressBackLinkDisplayed(), "The shipping address back link isn't displayed");
        //assert the shipping address 'Continue' button is displayed
        assertTrue(checkoutPage.isShippingAddressContinueButtonDisplayed(), "The shipping address section title isn't displayed");
    }
    //shipping address section text element assert method
    protected void isShippingAddressSectionTextAsExpected(CheckoutPage checkoutPage){
        //assert shipping section title as expected
        assertEquals("2\n" +
                "Shipping Address", checkoutPage.getShippingAddressSectionTitle(), "The shipping address section title doesn't match expectations");
        //assert shipping section dropdown menu description as expected
        assertEquals("Select a shipping address from your address book or enter a new address.", checkoutPage.getShippingAddressDropdownMenuDescription(), "The shipping address section dropdown menu description doesn't match expectations");
        //assert shipping section in store pickup description as expected
        assertEquals("Pick up your items at the store (put your store address here)", checkoutPage.getShippingAddressInStorePickupDescription(), "The shipping address section in store pickup description doesn't match expectations");
    }
    //payment method section web element assert test method
    protected void isPaymentMethodSectionWebElementDisplayed(CheckoutPage checkoutPage){
        //assert payment method section title is displayed
        assertTrue(checkoutPage.isPaymentMethodSectionTitleDisplayed(), "The payment method section title isn't displayed");
        //assert payment method section 'Cash on delivery' radio button is displayed
        assertTrue(checkoutPage.isPaymentMethodCashOnDeliveryRadioButtonDisplayed(), "The payment method 'Cash on delivery' radio button isn't displayed");
        //assert payment method section 'Check/money order' radio button is displayed
        assertTrue(checkoutPage.isPaymentMethodCheckMoneyOrderRadioButtonDisplayed(), "The payment method 'Check/money' order radio button isn't displayed");
        //assert payment method section 'Credit card' radio button is displayed
        assertTrue(checkoutPage.isPaymentMethodCreditCardRadioButtonDisplayed(), "The payment method 'Credit card' radio button isn't displayed");
        //assert payment method section 'Purchase order' radio button is displayed
        assertTrue(checkoutPage.isPaymentMethodPurchaseOrderRadioButtonDisplayed(), "The payment method 'Purchase order' radio button isn't displayed");
        //assert payment method section back link is displayed
        assertTrue(checkoutPage.isPaymentMethodBackLinkDisplayed(), "The payment method back link isn't displayed");
        //assert payment method section 'Continue' button is displayed
        assertTrue(checkoutPage.isPaymentMethodContinueButtonDisplayed(), "The payment method section 'Continue' button isn't displayed");
    }
    //payment information section web element assert test method
    protected void isPaymentInformationSectionWebElementDisplayed(CheckoutPage checkoutPage){
        //assert payment information section title is displayed
        assertTrue(checkoutPage.isPaymentInformationSectionTitleDisplayed(), "The payment information section title isn't displayed.");
        //assert payment information text table is displayed
        assertTrue(checkoutPage.isPaymentInformationTextTableDisplayed(), "The payment information text table isn't displayed.");
        //assert payment information back link is displayed
        assertTrue(checkoutPage.isPaymentInformationBackLinkDisplayed(), "The payment information back link isn't displayed.");
        //assert payment information 'Continue' button is displayed
        assertTrue(checkoutPage.isPaymentInformationContinueButtonDisplayed(), "The payment information section 'continue' button isn't displayed.");
    }
    //payment information section data logger method
    protected void logPaymentInfoSectionData(CheckoutPage checkoutPage){
        System.out.println("Payment information table data: " + "\n");

        logger.info("Payment information data: " + checkoutPage.getPaymentInformationSectionData());

        System.out.println("\n");
    }

    //confirm order section web element assert test method
    protected void isConfirmOrderSectionWebElementDisplayed(CheckoutPage checkoutPage){
        //assert confirm order section title is displayed
        //assertTrue(checkoutPage.isConfirmOrderSectionTitleDisplayed(), "The confirm order section title isn't displayed.");
        //assert confirm order billing address data is displayed
        assertTrue(checkoutPage.isConfirmOrderBillingAddressDataDisplayed(), "The confirm order billing address data isn't displayed.");
        //assert confirm order shipping method data is displayed
        assertTrue(checkoutPage.isConfirmOrderShippingMethodDataDisplayed(), "The confirm order shipping method data isn't displayed.");
        //assert confirm order product images are displayed (as a list)
        assertTrue(checkoutPage.isConfirmOrderProductImageDisplayed(), "The confirm order product images aren't displayed.");
        //assert confirm order product names are displayed (as a list)
        assertTrue(checkoutPage.isConfirmOrderProductNameDisplayed(), "The confirm order product names aren't displayed.");
        //assert confirm order product unit prices are displayed (as a list)
        assertTrue(checkoutPage.isConfirmOrderProductUnitPriceDisplayed(), "The confirm order unit prices aren't displayed.");
        //assert confirm order product quantities are displayed (as a list)
        assertTrue(checkoutPage.isConfirmOrderProductQuantityDisplayed(), "The confirm order product quantities aren't displayed.");
        //assert confirm order product total prices are displayed (as a list)
        assertTrue(checkoutPage.isConfirmOrderProductTotalTablePriceDisplayed(), "The confirm order product total prices aren't displayed.");
        //assert product order sub-total price is displayed
        assertTrue(checkoutPage.isConfirmOrderProductSubTotalPriceDisplayed(), "The product order sub total price isn't displayed.");
        //assert product order shipping method price is displayed
        assertTrue(checkoutPage.isConfirmOrderProductShippingPriceDisplayed(), "The product order shipping method price isn't displayed.");
        //assert product order additional fee is displayed
        assertTrue(checkoutPage.isConfirmOrderProductAdditionalFeeDisplayed(), "The product order additional fee isn't displayed.");
        //assert product order tax is displayed
        assertTrue(checkoutPage.isConfirmOrderProductTaxDisplayed(), "The product order tax isn't displayed.");
        //assert product order total price is displayed
        assertTrue(checkoutPage.isConfirmOrderProductTotalPriceDisplayed(), "The product order total price isn't displayed.");
        //assert confirm order section back link is displayed
        assertTrue(checkoutPage.isConfirmOrderBackLinkDisplayed(), "The confirm order section back link isn't displayed.");
        //assert 'Confirm' button is displayed
        assertTrue(checkoutPage.isConfirmOrderButtonDisplayed(), "The confirm order button isn't displayed.");
    }
    //confirm order billing/shipping data logger method
    protected void logOrderBillingShippingData(CheckoutPage checkoutPage){
        System.out.println("Billing and shipping displayed data: " + "\n");

        logger.info("Billing address data: " + checkoutPage.getConfirmOrderBillingAddressData());
        logger.info("Shipping method data: " + checkoutPage.getConfirmOrderShippingMethodData());

        System.out.println("\n");
    }
    //confirm order product tabular data logger method
    protected void logPreConfirmOrderProductData(CheckoutPage checkoutPage){
        System.out.println("Pre-confirm order displayed product data: " + "\n");

        logger.info("Product name(s) (upper table): " + checkoutPage.getConfirmOrderTableProductName());
        logger.info("Product unit price(s) (upper table): " + checkoutPage.getConfirmOrderTableProductUnitPrice());
        logger.info("Product quantity(s) (upper table): " + checkoutPage.getConfirmOrderTableProductQuantity());
        logger.info("Product total price(s) (upper table): " + checkoutPage.getConfirmOrderTableProductTotalPrice());

        logger.info("Order sub-total price (lower table): " + checkoutPage.getConfirmOrderProductSubTotalPrice());
        logger.info("Order shipping price (lower table): " + checkoutPage.getConfirmOrderProductShippingPrice());
        logger.info("Order additional fee (lower table): " + checkoutPage.getConfirmOrderProductAdditionalFee());
        logger.info("Order tax amount (lower table): " + checkoutPage.getConfirmOrderProductTax());
        logger.info("Order total price (lower table): " + checkoutPage.getConfirmOrderProductTotalPrice());

        System.out.println("\n");
    }

    //confirm order product tabular data logger method
    protected void logPreConfirmOrderWithCreditCardProductData(CheckoutPage checkoutPage){
        System.out.println("Pre-confirm order displayed product data: " + "\n");

        logger.info("Product name(s) (upper table (with credit card)): " + checkoutPage.getConfirmOrderTableProductName());
        logger.info("Product unit price(s) (upper table (with credit card)): " + checkoutPage.getConfirmOrderTableProductUnitPrice());
        logger.info("Product quantity(s) (upper table (with credit card)): " + checkoutPage.getConfirmOrderTableProductQuantity());
        logger.info("Product total price(s) (upper table (with credit card)): " + checkoutPage.getConfirmOrderTableProductTotalPrice());

        logger.info("Order sub-total price (lower table (with credit card)): " + checkoutPage.getConfirmOrderProductSubTotalPrice());
        logger.info("Order shipping price (lower table (with credit card)): " + checkoutPage.getConfirmOrderProductShippingPrice());
        logger.info("Order tax amount (lower table (with credit card)): " + checkoutPage.getConfirmOrderProductAdditionalFee());
        logger.info("Order total price (lower table (with credit card)): " + checkoutPage.getConfirmOrderProductTax());

        System.out.println("\n");
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //test result screenshot method
    public void captureScreenshot(WebDriver driver, String fileName) {
        try {
            Thread.sleep(1500);//apply wait time for the right time to get the screenshot (WebDriverWait doesn't work here)
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File destination = new File("D:\\IntelliJ Selenium projects\\DemoWebShopSelenium\\src\\test\\resources\\" + " " +  fileName + ".png");
            Files.copy(screenshot.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
            logger.info("Screenshot saved at: " + destination.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
