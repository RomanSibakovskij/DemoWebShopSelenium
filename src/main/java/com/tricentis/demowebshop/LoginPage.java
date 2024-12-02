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
