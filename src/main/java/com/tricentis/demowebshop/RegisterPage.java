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
    //register success message web element
    @FindBy(xpath = "//div[@class='result']")
    private WebElement registerSuccessMessage;
    //continue button web element
    @FindBy(xpath = "//input[@class='button-1 register-continue-button']")
    private WebElement continueButton;

    //valid input data
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String confirmPassword;

    //no singular input
    private String noFirstName;
    private String noLastName;
    private String noEmail;
    private String noPassword;
    private String noConfirmPassword;

    //too short singular input
    private String tooShortFirstName;
    private String tooShortLastName;
    private String tooShortEmailAddress;
    private String tooShortPassword;
    private String tooShortConfirmPassword;

    //too long singular input
    private String tooLongFirstName;

    public RegisterPage(WebDriver driver) {super(driver);}

    //male gender button click method
    public void clickMaleGenderButton() {genderMaleButton.click();}
    //female gender button click method
    public void clickFemaleGenderButton() {genderFemaleButton.click();}

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

    //invalid user input data getter(no first name)
    public void invalidUserInputDataGetterNoFirstName() {
        noFirstName = "";
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(7);
        password = TestDataGenerator.generateRandomPassword();
        confirmPassword = password;

        System.out.println("Invalid user data generated for registration (no first name): " + "\n");
        logger.info("No first name: " + noFirstName);
        logger.info("Valid last name (no first name): " + lastName);
        logger.info("Valid email (no first name): " + email);
        logger.info("Valid password (no first name): " + password);
        logger.info("Valid matching confirm password (no first name): " + confirmPassword);
    }

    //invalid input data method (no first name)
    public void inputNoFirstNameIntoFirstNameInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.sendKeys(noFirstName);
    }

    //invalid user input data getter(no last name)
    public void invalidUserInputDataGetterNoLastName() {
        firstName = TestDataGenerator.getRandomFirstName();
        noLastName = "";
        email = TestDataGenerator.generateRandomEmailAddress(7);
        password = TestDataGenerator.generateRandomPassword();
        confirmPassword = password;

        System.out.println("Invalid user data generated for registration (no last name): " + "\n");
        logger.info("Valid first name (no last name): " + firstName);
        logger.info("No last name: " + noLastName);
        logger.info("Valid email (no last name): " + email);
        logger.info("Valid password (no last name): " + password);
        logger.info("Valid matching confirm password (no last name): " + confirmPassword);
    }
    //invalid input data method (no last name)
    public void inputNoLastNameIntoLastNameInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys(noLastName);
    }

    //invalid user input data getter(no email)
    public void invalidUserInputDataGetterNoEmail() {
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        noEmail = "";
        password = TestDataGenerator.generateRandomPassword();
        confirmPassword = password;

        System.out.println("Invalid user data generated for registration (no email address): " + "\n");
        logger.info("Valid first name (no email address): " + firstName);
        logger.info("Valid last name (no email address): " + lastName);
        logger.info("No email: " + noEmail);
        logger.info("Valid password (no email address): " + password);
        logger.info("Valid matching confirm password (no email address): " + confirmPassword);
    }
    //invalid input data method (no email)
    public void inputNoEmailIntoEmailInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(emailInputField));
        emailInputField.sendKeys(noEmail);
    }

    //invalid user input data getter(no password / confirm password)
    public void invalidUserInputDataGetterNoPassword() {
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(7);
        noPassword = "";
        noConfirmPassword = noPassword;

        System.out.println("Invalid user data generated for registration (no password and confirm password): " + "\n");
        logger.info("Valid first name (no password and confirm password): " + firstName);
        logger.info("Valid last name (no password and confirm password): " + lastName);
        logger.info("Valid email (no password and confirm password): " + email);
        logger.info("No password: " + noPassword);
        logger.info("No confirm password: " + noConfirmPassword);
    }
    //invalid input data method (no password)
    public void inputNoPasswordIntoPasswordInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys(noPassword);
    }
    //invalid input data method (no confirm password)
    public void inputNoConfirmPasswordIntoConfirmPasswordInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(confirmPasswordInputField));
        confirmPasswordInputField.sendKeys(noConfirmPassword);
    }

    //too short singular input
    //invalid user input data getter(too short first name)
    public void invalidUserInputDataGetterTooShortFirstName() {
        tooShortFirstName = "H";
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(7);
        password = TestDataGenerator.generateRandomPassword();
        confirmPassword = password;

        System.out.println("Invalid user data generated for registration (too short first name): " + "\n");
        logger.info("Too short first name: " + tooShortFirstName);
        logger.info("Valid last name (too short first name): " + lastName);
        logger.info("Valid email (too short first name): " + email);
        logger.info("Valid password (too short first name): " + password);
        logger.info("Valid matching confirm password (too short first name): " + confirmPassword);
    }
    //invalid input data method (too short first name)
    public void inputTooShortFirstNameIntoFirstNameInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.sendKeys(tooShortFirstName);
    }

    //invalid user input data getter(too short last name)
    public void invalidUserInputDataGetterTooShortLastName() {
        firstName = TestDataGenerator.getRandomFirstName();
        tooShortLastName = "G";
        email = TestDataGenerator.generateRandomEmailAddress(7);
        password = TestDataGenerator.generateRandomPassword();
        confirmPassword = password;

        System.out.println("Invalid user data generated for registration (too short last name): " + "\n");
        logger.info("Valid first name (too short last name): " + firstName);
        logger.info("Too short last name: " + tooShortLastName);
        logger.info("Valid email (too short last name): " + email);
        logger.info("Valid password (too short last name): " + password);
        logger.info("Valid matching confirm password (too short last name): " + confirmPassword);
    }
    //invalid input data method (too short last name)
    public void inputTooShortLastNameIntoLastNameInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys(tooShortLastName);
    }

    //invalid user input data getter(too short email)
    public void invalidUserInputDataGetterTooShortEmail() {
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        tooShortEmailAddress = "c@example.org";
        password = TestDataGenerator.generateRandomPassword();
        confirmPassword = password;

        System.out.println("Invalid user data generated for registration (too short email address): " + "\n");
        logger.info("Valid first name (too short email address): " + firstName);
        logger.info("Valid last name (too short email address): " + lastName);
        logger.info("Too short email: " + tooShortEmailAddress);
        logger.info("Valid password (too short email address): " + password);
        logger.info("Valid matching confirm password (too short email address): " + confirmPassword);
    }
    //invalid input data method (too short email)
    public void inputTooShortEmailIntoEmailInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(emailInputField));
        emailInputField.sendKeys(tooShortEmailAddress);
    }

    //invalid user input data getter(too short password / confirm password)
    public void invalidUserInputDataGetterTooShortPassword() {
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(7);
        tooShortPassword = "KdRGf";
        tooShortConfirmPassword = tooShortPassword;

        System.out.println("Invalid user data generated for registration (too short password and confirm password): " + "\n");
        logger.info("Valid first name (too short password and confirm password): " + firstName);
        logger.info("Valid last name (too short password and confirm password): " + lastName);
        logger.info("Valid email (too short password and confirm password): " + email);
        logger.info("Too short password: " + tooShortPassword);
        logger.info("Too short matching confirm password: " + tooShortConfirmPassword);
    }
    //invalid input data method (too short password)
    public void inputTooShortPasswordIntoPasswordInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys(tooShortPassword);
    }
    //invalid input data method (too short confirm password)
    public void inputTooShortConfirmPasswordIntoConfirmPasswordInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(confirmPasswordInputField));
        confirmPasswordInputField.sendKeys(tooShortConfirmPassword);
    }

    //too long singular input
    //invalid user input data getter(too long first name) => 100 chars
    public void invalidUserInputDataGetterTooLongFirstName() {
        tooLongFirstName = "m2rRYVTDsuqXdpBVIQWfMbeSZcuwlujHdsddddddddddddddddddddasdasdsaqeqdsadsdsdvcvcvcxvxcvdxfsfsfdsfgdsfdf";
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(7);
        password = TestDataGenerator.generateRandomPassword();
        confirmPassword = password;

        System.out.println("Invalid user data generated for registration (too long first name): " + "\n");
        logger.info("Too long first name: " + tooLongFirstName);
        logger.info("Valid last name (too long first name): " + lastName);
        logger.info("Valid email (too long first name): " + email);
        logger.info("Valid password (too long first name): " + password);
        logger.info("Valid matching confirm password (too long first name): " + confirmPassword);
    }
    //invalid input data method (too long first name)
    public void inputTooLongFirstNameIntoFirstNameInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.sendKeys(tooLongFirstName);
    }

    //register page title getter
    public String getRegisterPageTitle() {return registerPageTitle.getText();}

    //invalid singular input error message getter
    public String getInvalidSingularInputErrorMessage(){return invalidInputErrorMessage.getText();}

    //private data getters
    public String getEmail() {return email;}
    public String getPassword() {return password;}

    //register success message getter
    public String getRegisterSuccessMessage() {return registerSuccessMessage.getText();}

    //continue button click method
    public void clickContinueButton() {continueButton.click();}

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