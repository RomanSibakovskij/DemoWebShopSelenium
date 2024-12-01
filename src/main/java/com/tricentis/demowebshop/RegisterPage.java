package com.tricentis.demowebshop;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage extends BasePage {

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

    //valid input data
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String confirmPassword;

    public RegisterPage(WebDriver driver) {super(driver);}

    //male gender button click method
    public void clickMaleGenderButton() {genderMaleButton.click();}

    //valid user input data getter
    public void validUserInputDataGetter() {
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(7);
        password = TestDataGenerator.generateRandomPassword();
        confirmPassword = password;

        System.out.println("Valid user data generated for registration: " + "\n");
        logger.info("Valid first name: " + firstName);
        logger.info("Valid last name: " + lastName);
        logger.info("Valid email: " + email);
        logger.info("Valid password: " + password);
        logger.info("Valid matching confirm password: " + confirmPassword);
    }

    //valid input data methods
    public void inputFirstNameIntoFirstNameInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.sendKeys(firstName);
    }

    public void inputLastNameIntoLastNameInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys(lastName);
    }

    public void inputEmailIntoEmailInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(emailInputField));
        emailInputField.sendKeys(email);
    }

    public void inputPasswordIntoPasswordInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys(password);
    }

    public void inputConfirmPasswordIntoConfirmPasswordInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(confirmPasswordInputField));
        confirmPasswordInputField.sendKeys(confirmPassword);
    }

    //'Register' button click method
    public void clickRegisterButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.elementToBeClickable(registerButton));
        registerButton.click();
    }

    //register page title getter
    public String getRegisterPageTitle() {return registerPageTitle.getText();}

    //private data getters
    public String getEmail() {return email;}
    public String getPassword() {return password;}

    //register page web element assert methods
    public boolean isRegisterPageTitleDisplayed() {return registerPageTitle.isDisplayed();}
    public boolean isGenderMaleButtonDisplayed() {return genderMaleButton.isDisplayed();}
    public boolean isGenderFemaleButtonDisplayed() {return genderFemaleButton.isDisplayed();}
    public boolean isFirstNameInputFieldDisplayed() {return firstNameInputField.isDisplayed();}
    public boolean isLastNameInputFieldDisplayed() {return lastNameInputField.isDisplayed();}
    public boolean isEmailInputFieldDisplayed() {return emailInputField.isDisplayed();}
    public boolean isPasswordInputFieldDisplayed() {return passwordInputField.isDisplayed();}
    public boolean isConfirmPasswordInputFieldDisplayed() {return confirmPasswordInputField.isDisplayed();}
    public boolean isRegisterButtonDisplayed() {return registerButton.isDisplayed();}
}