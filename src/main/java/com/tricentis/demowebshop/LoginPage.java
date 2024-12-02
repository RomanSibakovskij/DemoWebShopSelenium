package com.tricentis.demowebshop;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class LoginPage extends BasePage{

    //login page web elements
    @FindBy(xpath = "//div[@class='page-title']/h1")
    private WebElement loginPageTitle;
    //register section
    @FindBy(xpath = "//div[@class='new-wrapper register-block']//strong")
    private WebElement registerSectionTitle;
    @FindBy(xpath = "//div[@class='new-wrapper register-block']//div[@class='text']")
    private WebElement registerSectionDescription;
    @FindBy(xpath = "//div[@class='new-wrapper register-block']//input[@class='button-1 register-button']")
    private WebElement registerSectionButton;
    //login section
    @FindBy(xpath = "//div[@class='returning-wrapper']//strong")
    private WebElement loginSectionTitle;
    @FindBy(xpath = "//div[@class='validation-summary-errors']")
    private WebElement unsuccessfulLoginErrorMessage;
    @FindBy(xpath = "//span[@class='field-validation-error']")
    private WebElement invalidEmailFormatErrorMessage;
    @FindBy(xpath = "//div[@class='returning-wrapper']//input[@id='Email']")
    private WebElement emailAddressInputField;
    @FindBy(xpath = "//div[@class='returning-wrapper']//input[@id='Password']")
    private WebElement passwordInputField;
    @FindBy(xpath = "//div[@class='returning-wrapper']//input[@id='RememberMe']")
    private WebElement rememberMeCheckbox;
    @FindBy(xpath = "//div[@class='returning-wrapper']//span/a")
    private WebElement forgotPasswordLink;
    @FindBy(xpath = "//form[@action='/login']//input[@value='Log in']")
    private WebElement loginButton;

    //valid input data
    private String email;
    private String password;

    //no singular input data
    private String noEmail;
    private String noPassword;

    //invalid singular input data
    private String invalidEmail;
    private String invalidEmailFormat;

    public LoginPage(WebDriver driver) {super(driver);}

    //valid user login data getter
    public void validUserLoginDataGetter(RegisterPage registerPage) {

        email = registerPage.getEmail();
        password = registerPage.getPassword();

        System.out.println("Valid user login data: " + "\n");
        logger.info("Valid user login email address: " + registerPage.getEmail());
        logger.info("Valid user login password: " + registerPage.getPassword());

        System.out.println("\n");
    }
    //valid user data input methods
    public void inputEmailIntoEmailInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(emailAddressInputField));
        emailAddressInputField.sendKeys(email);
    }
    public void inputPasswordIntoPasswordInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys(password);
    }

    //invalid input data

    //no singular input
    //invalid user login data getter (no user email address)
    public void invalidUserLoginDataGetterNoEmail(RegisterPage registerPage) {

        noEmail = "";
        password = registerPage.getPassword();

        System.out.println("Invalid user login data (no email): " + "\n");
        logger.info("Missing user login email address: " + noEmail);
        logger.info("Valid user login password (no email): " + registerPage.getPassword());

        System.out.println("\n");
    }
    //invalid user data input method (no email address)
    public void inputNoEmailIntoEmailInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(emailAddressInputField));
        emailAddressInputField.sendKeys(noEmail);
    }

    //invalid user login data getter (no login password)
    public void invalidUserLoginDataGetterNoPassword(RegisterPage registerPage) {

        email = registerPage.getEmail();
        noPassword = "";

        System.out.println("Invalid user login data (no password): " + "\n");
        logger.info("Valid user login email address (no password): " + email);
        logger.info("Missing user login password: " + noPassword);

        System.out.println("\n");
    }
    //invalid user data input method (no user password)
    public void inputNoPasswordIntoPasswordInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys(noPassword);
    }

    //invalid singular input
    //invalid user login data getter (invalid user email address)
    public void invalidUserLoginDataGetterInvalidEmail(RegisterPage registerPage) {

        invalidEmail = "kl334@example.org";
        password = registerPage.getPassword();

        System.out.println("Invalid user login data (invalid email): " + "\n");
        logger.info("Invalid user login email address: " + invalidEmail);
        logger.info("Valid user login password (invalid email): " + registerPage.getPassword());

        System.out.println("\n");
    }
    //invalid user data input method (invalid email address)
    public void inputInvalidEmailIntoEmailInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(emailAddressInputField));
        emailAddressInputField.sendKeys(invalidEmail);
    }

    //invalid user login data getter (invalid user email address format)
    public void invalidUserLoginDataGetterInvalidEmailFormat(RegisterPage registerPage) {

        invalidEmailFormat = "kl113example.org";
        password = registerPage.getPassword();

        System.out.println("Invalid user login data (invalid email format): " + "\n");
        logger.info("Invalid user login email address (by format): " + invalidEmailFormat);
        logger.info("Valid user login password (invalid email format): " + registerPage.getPassword());

        System.out.println("\n");
    }
    //invalid user data input method (invalid email address format)
    public void inputInvalidEmailFormatIntoEmailInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(emailAddressInputField));
        emailAddressInputField.sendKeys(invalidEmailFormat);
    }

    //login button click method
    public void clickLoginButton(){loginButton.click();}

    //login page title getter
    public String getLoginPageTitle(){return loginPageTitle.getText();}
    //register section title getter
    public String getRegisterSectionTitle(){return registerSectionTitle.getText();}
    //register section description getter
    public String getRegisterSectionDescription(){return registerSectionDescription.getText();}
    //login section title getter
    public String getLoginSectionTitle(){return loginSectionTitle.getText();}

    //unsuccessful login error message getter
    public String getUnsuccessfulLoginErrorMessageText(){return unsuccessfulLoginErrorMessage.getText();}
    //invalid email format error message getter
    public String getInvalidEmailFormatErrorMessageText(){return invalidEmailFormatErrorMessage.getText();}

    //'Register' button click method
    public void clickRegisterButton(){registerSectionButton.click();}

    //login page web element assert methods
    public boolean isLoginPageTitleDisplayed(){return loginPageTitle.isDisplayed();}
    public boolean isRegisterSectionTitleDisplayed(){return registerSectionTitle.isDisplayed();}
    public boolean isRegisterSectionDescriptionDisplayed(){return registerSectionDescription.isDisplayed();}
    public boolean isRegisterSectionButtonDisplayed(){return registerSectionButton.isDisplayed();}
    public boolean isLoginSectionTitleDisplayed(){return loginSectionTitle.isDisplayed();}
    public boolean isEmailAddressInputFieldDisplayed(){return emailAddressInputField.isDisplayed();}
    public boolean isPasswordInputFieldDisplayed(){return passwordInputField.isDisplayed();}
    public boolean isRememberMeCheckboxDisplayed(){return rememberMeCheckbox.isDisplayed();}
    public boolean isForgotPasswordLinkDisplayed(){return forgotPasswordLink.isDisplayed();}
    public boolean isLoginButtonDisplayed(){return loginButton.isDisplayed();}

}
