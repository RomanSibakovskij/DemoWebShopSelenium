package com.tricentis.demowebshop;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{

    //register page web elements
    @FindBy(xpath = "//div[@class='page registration-page']//h1")
    private WebElement registerPageTitle;
    @FindBy(xpath = "//div[@class='page registration-page']//input[@id='gender-male']")
    private WebElement genderMaleButton;
    @FindBy(xpath = "//div[@class='page registration-page']//input[@id='gender-female']")
    private WebElement genderFemaleButton;
    @FindBy(xpath = "//div[@class='page registration-page']//input[@id='FirstName']")
    private WebElement firstNameInputField;
    @FindBy(xpath = "//div[@class='page registration-page']//input[@id='LastName']")
    private WebElement lastNameInputField;
    @FindBy(xpath = "//div[@class='page registration-page']//input[@id='Email']")
    private WebElement emailInputField;
    @FindBy(xpath = "//div[@class='page registration-page']//input[@id='Password']")
    private WebElement passwordInputField;
    @FindBy(xpath = "//div[@class='page registration-page']//input[@id='ConfirmPassword']")
    private WebElement confirmPasswordInputField;
    @FindBy(xpath = "//div[@class='page registration-page']//span[@class='field-validation-error']")
    private WebElement invalidInputErrorMessage;
    @FindBy(xpath = "//div[@class='page registration-page']//input[@id='register-button']")
    private WebElement registerButton;

    public RegisterPage(WebDriver driver) {super(driver);}

    //register page title getter
    public String getRegisterPageTitle() {return registerPageTitle.getText();}

    //register page web element assert methods
    public boolean isRegisterPageTitleDisplayed(){return registerPageTitle.isDisplayed();}
    public boolean isGenderMaleButtonDisplayed(){return genderMaleButton.isDisplayed();}
    public boolean isGenderFemaleButtonDisplayed(){return genderFemaleButton.isDisplayed();}
    public boolean isFirstNameInputFieldDisplayed(){return firstNameInputField.isDisplayed();}
    public boolean isLastNameInputFieldDisplayed(){return lastNameInputField.isDisplayed();}
    public boolean isEmailInputFieldDisplayed(){return emailInputField.isDisplayed();}
    public boolean isPasswordInputFieldDisplayed(){return passwordInputField.isDisplayed();}
    public boolean isConfirmPasswordInputFieldDisplayed(){return confirmPasswordInputField.isDisplayed();}
    public boolean isRegisterButtonDisplayed(){return registerButton.isDisplayed();}


}
