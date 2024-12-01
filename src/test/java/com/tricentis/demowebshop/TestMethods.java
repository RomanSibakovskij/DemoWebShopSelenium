package com.tricentis.demowebshop;

import org.openqa.selenium.support.ui.*;
import org.slf4j.*;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.*;
import java.io.File;
import java.nio.file.*;
import java.time.Duration;

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
        isGeneralPageTextMatchExpectations(homePage);
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
    protected void isGeneralPageTextMatchExpectations(HomePage homePage){
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
