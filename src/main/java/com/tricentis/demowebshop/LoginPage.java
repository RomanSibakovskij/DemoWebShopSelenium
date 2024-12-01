package com.tricentis.demowebshop;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

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
    @FindBy(xpath = "//div[@class='new-wrapper register-block']//input")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {super(driver);}

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
