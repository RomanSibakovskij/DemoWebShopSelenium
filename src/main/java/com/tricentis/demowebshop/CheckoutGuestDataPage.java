package com.tricentis.demowebshop;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class CheckoutGuestDataPage extends BasePage{

    //billing address section web elements
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-billing']//div[@class='enter-address-body']//input[@id='BillingNewAddress_FirstName']")
    private WebElement firstNameInputField;
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-billing']//div[@class='enter-address-body']//input[@id='BillingNewAddress_LastName']")
    private WebElement lastNameInputField;
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-billing']//div[@class='enter-address-body']//input[@id='BillingNewAddress_Email']")
    private WebElement emailAddressInputField;
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-billing']//div[@class='enter-address-body']//input[@id='BillingNewAddress_City']")
    private WebElement cityInputField;
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-billing']//div[@class='enter-address-body']//input[@id='BillingNewAddress_Address1']")
    private WebElement address1InputField; //required input
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-billing']//div[@class='enter-address-body']//input[@id='BillingNewAddress_ZipPostalCode']")
    private WebElement postalCodeInputField;
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-billing']//div[@class='enter-address-body']//input[@id='BillingNewAddress_PhoneNumber']")
    private WebElement phoneNumberInputField;
    //invalid input error message element
    @FindBy(xpath = "//div[@id='checkout-step-billing']//span[@class='field-validation-error']")
    private WebElement invalidInputErrorMessage;


    //valid guest input data
    private String firstName;
    private String lastName;
    private String email;
    private String city;
    private String address1;
    private String zipCode;
    private String phoneNumber;

    //no singular guest input data
    private String noFirstName;
    private String noLastName;
    private String noEmail;
    private String noCity;


    public CheckoutGuestDataPage(WebDriver driver) {super(driver);}

    //valid guest input data getter
    public void validAdditionalGuestDataGetter(CheckoutGuestDataPage checkoutGuestDataPage){
        System.out.println("Valid guest user data generated: " + "\n");

        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(12);
        city = TestDataGenerator.getRandomCity();
        address1 = TestDataGenerator.generateRandomAddress(8);
        zipCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        phoneNumber = TestDataGenerator.generatePhoneNumber(6);

        logger.info("Valid guest first name: " + firstName);
        logger.info("Valid guest last name: " + lastName);
        logger.info("Valid guest email: " + email);
        logger.info("Valid guest city: " + city);
        logger.info("Valid guest address: " + address1);
        logger.info("Valid guest zip code: " + zipCode);
        logger.info("Valid guest phone number: " + phoneNumber);

        System.out.println("\n");
    }
    //valid guest data input methods
    public void inputValidFirstNameIntoFirstNameInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.sendKeys(firstName);
    }
    public void inputValidLastNameIntoLastNameInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys(lastName);
    }
    public void inputValidEmailIntoEmailInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(emailAddressInputField));
        emailAddressInputField.sendKeys(email);
    }
    public void inputValidUserCityIntoCityInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(cityInputField));
        cityInputField.sendKeys(city);
    }
    public void inputValidAddressIntoAddress1InputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(address1InputField));
        address1InputField.sendKeys(address1);
    }
    public void inputValidZipCodeIntoPostCodeInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(postalCodeInputField));
        postalCodeInputField.sendKeys(zipCode);
    }
    public void inputValidPhoneIntoPhoneNumberInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(phoneNumberInputField));
        phoneNumberInputField.sendKeys(phoneNumber);
    }

    //invalid data methods

    //no singular input

    //invalid guest input data getter - no first name
    public void invalidAdditionalGuestNoFirstNameDataGetter(CheckoutGuestDataPage checkoutGuestDataPage){
        System.out.println("Invalid guest user data generated (no first name): " + "\n");

        noFirstName = "";
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(12);
        city = TestDataGenerator.getRandomCity();
        address1 = TestDataGenerator.generateRandomAddress(8);
        zipCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        phoneNumber = TestDataGenerator.generatePhoneNumber(6);

        logger.info("No guest first name: " + noFirstName);
        logger.info("Valid guest last name (no first name): " + lastName);
        logger.info("Valid guest email (no first name): " + email);
        logger.info("Valid guest city (no first name): " + city);
        logger.info("Valid guest address (no first name): " + address1);
        logger.info("Valid guest zip code (no first name): " + zipCode);
        logger.info("Valid guest phone number (no first name): " + phoneNumber);

        System.out.println("\n");
    }
    //invalid guest data input method - no first name
    public void inputNoFirstNameIntoFirstNameInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.sendKeys(noFirstName);
    }

    //invalid guest input data getter - no last name
    public void invalidAdditionalGuestNoLastNameDataGetter(CheckoutGuestDataPage checkoutGuestDataPage){
        System.out.println("Invalid guest user data generated (no last name): " + "\n");

        firstName = TestDataGenerator.getRandomFirstName();
        noLastName = "";
        email = TestDataGenerator.generateRandomEmailAddress(12);
        city = TestDataGenerator.getRandomCity();
        address1 = TestDataGenerator.generateRandomAddress(8);
        zipCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        phoneNumber = TestDataGenerator.generatePhoneNumber(6);

        logger.info("Valid guest first name (no last name): " + firstName);
        logger.info("No guest last name: " + noLastName);
        logger.info("Valid guest email (no last name): " + email);
        logger.info("Valid guest city (no last name): " + city);
        logger.info("Valid guest address (no last name): " + address1);
        logger.info("Valid guest zip code (no last name): " + zipCode);
        logger.info("Valid guest phone number (no last name): " + phoneNumber);

        System.out.println("\n");
    }
    //invalid guest data input method - no last name
    public void inputNoLastNameIntoLastNameInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys(noLastName);
    }

    //invalid guest input data getter - no email address
    public void invalidAdditionalGuestNoEmailDataGetter(CheckoutGuestDataPage checkoutGuestDataPage){
        System.out.println("Invalid guest user data generated (no email address): " + "\n");

        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        noEmail = "";
        city = TestDataGenerator.getRandomCity();
        address1 = TestDataGenerator.generateRandomAddress(8);
        zipCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        phoneNumber = TestDataGenerator.generatePhoneNumber(6);

        logger.info("Valid guest first name (no email address): " + firstName);
        logger.info("Valid guest last name (no email address): " + lastName);
        logger.info("No guest email: " + noEmail);
        logger.info("Valid guest city (no email address): " + city);
        logger.info("Valid guest address (no email address): " + address1);
        logger.info("Valid guest zip code (no email address): " + zipCode);
        logger.info("Valid guest phone number (no email address): " + phoneNumber);

        System.out.println("\n");
    }
    //invalid guest data input method - no email address
    public void inputNoEmailIntoEmailInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(emailAddressInputField));
        emailAddressInputField.sendKeys(noEmail);
    }

    //invalid guest input data getter - no city
    public void invalidAdditionalGuestNoCityDataGetter(CheckoutGuestDataPage checkoutGuestDataPage){
        System.out.println("Invalid guest user data generated (no city): " + "\n");

        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(8);
        noCity = "";
        address1 = TestDataGenerator.generateRandomAddress(8);
        zipCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        phoneNumber = TestDataGenerator.generatePhoneNumber(6);

        logger.info("Valid guest first name (no city): " + firstName);
        logger.info("Valid guest last name (no city): " + lastName);
        logger.info("Valid guest email (no city): " + email);
        logger.info("No guest city: " + city);
        logger.info("Valid guest address (no city): " + address1);
        logger.info("Valid guest zip code (no city): " + zipCode);
        logger.info("Valid guest phone number (no city): " + phoneNumber);

        System.out.println("\n");
    }
    //invalid guest data input method - no city
    public void inputNoCityIntoCityInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(cityInputField));
        cityInputField.sendKeys(noCity);
    }

    //guest first/last name getters
    public String getGuestFirstName(){return firstName;}
    public String getGuestLastName(){return lastName;}

    //invalid singular input error message getter
    public String getInvalidInputErrorMessage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.visibilityOf(invalidInputErrorMessage));
        return invalidInputErrorMessage.getText();
    }
}
