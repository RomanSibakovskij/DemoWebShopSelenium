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
    private String noAddress1;
    private String noZipCode;
    private String noPhone;

    //too short / too long singular input data
    private String tooShortFirstName;
    private String tooLongFirstName;
    private String tooShortLastName;
    private String tooLongLastName;
    private String tooShortEmail;
    private String tooLongEmail;
    private String tooShortCity;
    private String tooLongCity;
    private String tooShortAddress1;
    private String tooLongAddress1;
    private String tooShortZipCode;
    private String tooLongZipCode;
    private String tooShortPhone;
    private String tooLongPhone;

    //invalid format input data
    private String invalidEmailFormat;
    private String alreadyUsedBeforeEmail; //the one used in manual testing
    private String invalidPhoneFormat;


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
    public void invalidAdditionalGuestNoFirstNameDataGetter(){
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
    public void invalidAdditionalGuestNoLastNameDataGetter(){
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
    public void invalidAdditionalGuestNoEmailDataGetter(){
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
    public void invalidAdditionalGuestNoCityDataGetter(){
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
        logger.info("No guest city: " + noCity);
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

    //invalid guest input data getter - no user address (address1)
    public void invalidAdditionalGuestNoAddressDataGetter(){
        System.out.println("Invalid guest user data generated (no user address): " + "\n");

        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(8);
        city = TestDataGenerator.getRandomCity();
        noAddress1 = "";
        zipCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        phoneNumber = TestDataGenerator.generatePhoneNumber(6);

        logger.info("Valid guest first name (no user address): " + firstName);
        logger.info("Valid guest last name (no user address): " + lastName);
        logger.info("Valid guest email (no user address): " + email);
        logger.info("Valid guest city (no user address): " + city);
        logger.info("No guest address: " + noAddress1);
        logger.info("Valid guest zip code (no user address): " + zipCode);
        logger.info("Valid guest phone number (no user address): " + phoneNumber);

        System.out.println("\n");
    }
    //invalid guest data input method - no address (address1 is required input field)
    public void inputNoAddressIntoAddress1InputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(address1InputField));
        address1InputField.sendKeys(noAddress1);
    }

    //invalid guest input data getter - no user zip code
    public void invalidAdditionalGuestNoZipCodeDataGetter(){
        System.out.println("Invalid guest user data generated (no user zip code): " + "\n");

        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(8);
        city = TestDataGenerator.getRandomCity();
        address1 = TestDataGenerator.generateRandomAddress(6);
        noZipCode = "";
        phoneNumber = TestDataGenerator.generatePhoneNumber(6);

        logger.info("Valid guest first name (no user zip code): " + firstName);
        logger.info("Valid guest last name (no user zip code): " + lastName);
        logger.info("Valid guest email (no user zip code): " + email);
        logger.info("Valid guest city (no user zip code): " + city);
        logger.info("Valid guest address (no user zip code): " + address1);
        logger.info("No guest zip code (no user zip code): " + noZipCode);
        logger.info("Valid guest phone number (no user zip code): " + phoneNumber);

        System.out.println("\n");
    }
    //invalid guest data input method - no zip code
    public void inputNoZipCodeIntoPostCodeInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(postalCodeInputField));
        postalCodeInputField.sendKeys(noZipCode);
    }

    //invalid guest input data getter - no user phone number
    public void invalidAdditionalGuestNoPhoneDataGetter(){
        System.out.println("Invalid guest user data generated (no user phone number): " + "\n");

        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(8);
        city = TestDataGenerator.getRandomCity();
        address1 = TestDataGenerator.generateRandomAddress(6);
        zipCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        noPhone = "";

        logger.info("Valid guest first name (no user phone number): " + firstName);
        logger.info("Valid guest last name (no user phone number): " + lastName);
        logger.info("Valid guest email (no user phone number): " + email);
        logger.info("Valid guest city (no user phone number): " + city);
        logger.info("Valid guest address (no user phone number): " + address1);
        logger.info("Valid guest zip code (no user phone number): " + zipCode);
        logger.info("No guest phone number: " + noPhone);

        System.out.println("\n");
    }
    //invalid guest data input method - no phone number
    public void inputNoPhoneIntoPhoneNumberInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(phoneNumberInputField));
        phoneNumberInputField.sendKeys(noPhone);
    }

    //too short / too long singular input methods

    //invalid guest input data getter - too short first name (1 char)
    public void invalidAdditionalGuestTooShortFirstNameDataGetter(){
        System.out.println("Invalid guest user data generated (too short first name): " + "\n");

        tooShortFirstName = "X";
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(12);
        city = TestDataGenerator.getRandomCity();
        address1 = TestDataGenerator.generateRandomAddress(8);
        zipCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        phoneNumber = TestDataGenerator.generatePhoneNumber(6);

        logger.info("Too short guest first name: " + tooShortFirstName);
        logger.info("Valid guest last name (too short first name): " + lastName);
        logger.info("Valid guest email (too short first name): " + email);
        logger.info("Valid guest city (too short first name): " + city);
        logger.info("Valid guest address (too short first name): " + address1);
        logger.info("Valid guest zip code (too short first name): " + zipCode);
        logger.info("Valid guest phone number (too short first name): " + phoneNumber);

        System.out.println("\n");
    }
    //invalid guest data input method - too short first name
    public void inputTooShortFirstNameIntoFirstNameInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.sendKeys(tooShortFirstName);
    }
    //invalid guest input data getter - too long first name (125 chars)
    public void invalidAdditionalGuestTooLongFirstNameDataGetter(){
        System.out.println("Invalid guest user data generated (too long first name): " + "\n");

        tooLongFirstName = "addddddddddddddsdddddfffffffffffffffffffffssssssssssssssscxvcfhfgjhgjfgbvdfrgttujytkyulkjhjfghfdgsdfsdgfdhfgjhfgjfhgffdgdssds";
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(12);
        city = TestDataGenerator.getRandomCity();
        address1 = TestDataGenerator.generateRandomAddress(8);
        zipCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        phoneNumber = TestDataGenerator.generatePhoneNumber(6);

        logger.info("Too long guest first name: " + tooLongFirstName);
        logger.info("Valid guest last name (too long first name): " + lastName);
        logger.info("Valid guest email (too long first name): " + email);
        logger.info("Valid guest city (too long first name): " + city);
        logger.info("Valid guest address (too long first name): " + address1);
        logger.info("Valid guest zip code (too long first name): " + zipCode);
        logger.info("Valid guest phone number (too long first name): " + phoneNumber);

        System.out.println("\n");
    }
    //invalid guest data input method - too long first name
    public void inputTooLongFirstNameIntoFirstNameInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.sendKeys(tooLongFirstName);
    }

    //invalid guest input data getter - too short last name (1 char)
    public void invalidAdditionalGuestTooShortLastNameDataGetter(){
        System.out.println("Invalid guest user data generated (too short last name): " + "\n");

        firstName = TestDataGenerator.getRandomFirstName();
        tooShortLastName = "C";
        email = TestDataGenerator.generateRandomEmailAddress(12);
        city = TestDataGenerator.getRandomCity();
        address1 = TestDataGenerator.generateRandomAddress(8);
        zipCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        phoneNumber = TestDataGenerator.generatePhoneNumber(6);

        logger.info("Valid guest first name (too short last name): " + firstName);
        logger.info("Too short guest last name: " + tooShortLastName);
        logger.info("Valid guest email (too short last name): " + email);
        logger.info("Valid guest city (too short last name): " + city);
        logger.info("Valid guest address (too short last name): " + address1);
        logger.info("Valid guest zip code (too short last name): " + zipCode);
        logger.info("Valid guest phone number (too short last name): " + phoneNumber);

        System.out.println("\n");
    }
    //invalid guest data input method - too short last name
    public void inputTooShortLastNameIntoLastNameInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys(tooShortLastName);
    }
    //invalid guest input data getter - too long last name (125 chars)
    public void invalidAdditionalGuestTooLongLastNameDataGetter(){
        System.out.println("Invalid guest user data generated (too long last name): " + "\n");

        firstName = TestDataGenerator.getRandomFirstName();
        tooLongLastName = "addddddddddddddsdddddfffffffffffffffffffffssssssssssssssscxvcfhfgjhgjfgbvdfrgttujytkyulkjhjfghfdgsdfsdgfdhfgjhfgjfhgffdgdssds";
        email = TestDataGenerator.generateRandomEmailAddress(12);
        city = TestDataGenerator.getRandomCity();
        address1 = TestDataGenerator.generateRandomAddress(8);
        zipCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        phoneNumber = TestDataGenerator.generatePhoneNumber(6);

        logger.info("Valid guest first name (too long last name): " + firstName);
        logger.info("Too long guest last name: " + tooLongLastName);
        logger.info("Valid guest email (too long last name): " + email);
        logger.info("Valid guest city (too long last name): " + city);
        logger.info("Valid guest address (too long last name): " + address1);
        logger.info("Valid guest zip code (too long last name): " + zipCode);
        logger.info("Valid guest phone number (too long last name): " + phoneNumber);

        System.out.println("\n");
    }
    //invalid guest data input method - too long last name
    public void inputTooLongLastNameIntoLastNameInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys(tooLongLastName);
    }

    //invalid guest input data getter - too short email address name (3 chars)
    public void invalidAdditionalGuestTooShortEmailDataGetter(){
        System.out.println("Invalid guest user data generated (too short email address): " + "\n");

        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        tooShortEmail = "m@b.com";
        city = TestDataGenerator.getRandomCity();
        address1 = TestDataGenerator.generateRandomAddress(8);
        zipCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        phoneNumber = TestDataGenerator.generatePhoneNumber(6);

        logger.info("Valid guest first name (too short email address): " + firstName);
        logger.info("Valid guest last name (too short email address): " + lastName);
        logger.info("Too short guest email address: " + tooShortEmail);
        logger.info("Valid guest city (too short email address): " + city);
        logger.info("Valid guest address (too short email address): " + address1);
        logger.info("Valid guest zip code (too short email address): " + zipCode);
        logger.info("Valid guest phone number (too short email address): " + phoneNumber);

        System.out.println("\n");
    }
    //invalid guest data input method - too short email address
    public void inputTooShortEmailIntoEmailInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(emailAddressInputField));
        emailAddressInputField.sendKeys(tooShortEmail);
    }
    //invalid guest input data getter - too long email address name (125 chars total)
    public void invalidAdditionalGuestTooLongEmailDataGetter(){
        System.out.println("Invalid guest user data generated (too long email address): " + "\n");

        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        tooLongEmail = TestDataGenerator.generateRandomEmailAddress(115);
        city = TestDataGenerator.getRandomCity();
        address1 = TestDataGenerator.generateRandomAddress(8);
        zipCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        phoneNumber = TestDataGenerator.generatePhoneNumber(6);

        logger.info("Valid guest first name (too long email address): " + firstName);
        logger.info("Valid guest last name (too long email address): " + lastName);
        logger.info("Too long guest email address: " + tooLongEmail);
        logger.info("Valid guest city (too long email address): " + city);
        logger.info("Valid guest address (too long email address): " + address1);
        logger.info("Valid guest zip code (too long email address): " + zipCode);
        logger.info("Valid guest phone number (too long email address): " + phoneNumber);

        System.out.println("\n");
    }
    //invalid guest data input method - too long email address
    public void inputTooLongEmailIntoEmailInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(emailAddressInputField));
        emailAddressInputField.sendKeys(tooLongEmail);
    }

    //invalid guest input data getter - too short city (1 char)
    public void invalidAdditionalGuestTooShortCityDataGetter(){
        System.out.println("Invalid guest user data generated (too short city): " + "\n");

        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(8);
        tooShortCity = "Y";
        address1 = TestDataGenerator.generateRandomAddress(8);
        zipCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        phoneNumber = TestDataGenerator.generatePhoneNumber(6);

        logger.info("Valid guest first name (too short city): " + firstName);
        logger.info("Valid guest last name (too short city): " + lastName);
        logger.info("Valid guest email (too short city): " + email);
        logger.info("Too short guest city: " + tooShortCity);
        logger.info("Valid guest address (too short city): " + address1);
        logger.info("Valid guest zip code (too short city): " + zipCode);
        logger.info("Valid guest phone number (too short city): " + phoneNumber);

        System.out.println("\n");
    }
    //invalid guest data input method - too short city
    public void inputTooShortCityIntoCityInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(cityInputField));
        cityInputField.sendKeys(tooShortCity);
    }
    //invalid guest input data getter - too long city (75 chars)
    public void invalidAdditionalGuestTooLongCityDataGetter(){
        System.out.println("Invalid guest user data generated (too long city): " + "\n");

        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(8);
        tooLongCity = "addddddddddddddsdddddfffffffffffffffffffffssssssssssssssscxvcfhfgjhgjfgbvdd";
        address1 = TestDataGenerator.generateRandomAddress(8);
        zipCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        phoneNumber = TestDataGenerator.generatePhoneNumber(6);

        logger.info("Valid guest first name (too long city): " + firstName);
        logger.info("Valid guest last name (too long city): " + lastName);
        logger.info("Valid guest email (too long city): " + email);
        logger.info("Too long guest city: " + tooLongCity);
        logger.info("Valid guest address (too long city): " + address1);
        logger.info("Valid guest zip code (too long city): " + zipCode);
        logger.info("Valid guest phone number (too long city): " + phoneNumber);

        System.out.println("\n");
    }
    //invalid guest data input method - too long city
    public void inputTooLongCityIntoCityInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(cityInputField));
        cityInputField.sendKeys(tooLongCity);
    }

    //invalid guest input data getter - too short user address (address1) (3 chars)
    public void invalidAdditionalGuestTooShortAddressDataGetter(){
        System.out.println("Invalid guest user data generated (too short user address): " + "\n");

        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(8);
        city = TestDataGenerator.getRandomCity();
        tooShortAddress1 = "3rd";
        zipCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        phoneNumber = TestDataGenerator.generatePhoneNumber(6);

        logger.info("Valid guest first name (too short user address): " + firstName);
        logger.info("Valid guest last name (too short user address): " + lastName);
        logger.info("Valid guest email (too short user address): " + email);
        logger.info("Valid guest city (too short user address): " + city);
        logger.info("Too short guest address: " + tooShortAddress1);
        logger.info("Valid guest zip code (too short user address): " + zipCode);
        logger.info("Valid guest phone number (too short user address): " + phoneNumber);

        System.out.println("\n");
    }
    //invalid guest data input method - too short address (address1 is required input field)
    public void inputTooShortAddressIntoAddress1InputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(address1InputField));
        address1InputField.sendKeys(tooShortAddress1);
    }
    //invalid guest input data getter - too long user address (address1) (120 chars)
    public void invalidAdditionalGuestTooLongAddressDataGetter(){
        System.out.println("Invalid guest user data generated (too long user address): " + "\n");

        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(8);
        city = TestDataGenerator.getRandomCity();
        tooLongAddress1 = TestDataGenerator.generateRandomEmailAddress(115);
        zipCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        phoneNumber = TestDataGenerator.generatePhoneNumber(6);

        logger.info("Valid guest first name (too long user address): " + firstName);
        logger.info("Valid guest last name (too long user address): " + lastName);
        logger.info("Valid guest email (too long user address): " + email);
        logger.info("Valid guest city (too long user address): " + city);
        logger.info("Too long guest address: " + tooLongAddress1);
        logger.info("Valid guest zip code (too long user address): " + zipCode);
        logger.info("Valid guest phone number (too long user address): " + phoneNumber);

        System.out.println("\n");
    }
    //invalid guest data input method - too long address (address1 is required input field)
    public void inputTooLongAddressIntoAddress1InputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(address1InputField));
        address1InputField.sendKeys(tooLongAddress1);
    }

    //invalid guest input data getter - too short user zip code (2 chars)
    public void invalidAdditionalGuestTooShortZipCodeDataGetter(){
        System.out.println("Invalid guest user data generated (too short user zip code): " + "\n");

        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(8);
        city = TestDataGenerator.getRandomCity();
        address1 = TestDataGenerator.generateRandomAddress(6);
        tooShortZipCode = "22";
        phoneNumber = TestDataGenerator.generatePhoneNumber(6);

        logger.info("Valid guest first name (too short user zip code): " + firstName);
        logger.info("Valid guest last name (too short user zip code): " + lastName);
        logger.info("Valid guest email (too short user zip code): " + email);
        logger.info("Valid guest city (too short user zip code): " + city);
        logger.info("Valid guest address (too short user zip code): " + address1);
        logger.info("Too short guest zip code: " + tooShortZipCode);
        logger.info("Valid guest phone number (too short user zip code): " + phoneNumber);

        System.out.println("\n");
    }
    //invalid guest data input method - too short zip code (2 chars)
    public void inputTooShortZipCodeIntoPostCodeInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(postalCodeInputField));
        postalCodeInputField.sendKeys(tooShortZipCode);
    }
    //invalid guest input data getter - too long user zip code (75 chars)
    public void invalidAdditionalGuestTooLongZipCodeDataGetter(){
        System.out.println("Invalid guest user data generated (too long user zip code): " + "\n");

        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(8);
        city = TestDataGenerator.getRandomCity();
        address1 = TestDataGenerator.generateRandomAddress(6);
        tooLongZipCode = "121232423121323455467658678576534231234234565768798956756443542342343453463";
        phoneNumber = TestDataGenerator.generatePhoneNumber(6);

        logger.info("Valid guest first name (too long user zip code): " + firstName);
        logger.info("Valid guest last name (too long user zip code): " + lastName);
        logger.info("Valid guest email (too long user zip code): " + email);
        logger.info("Valid guest city (too long user zip code): " + city);
        logger.info("Valid guest address (too long user zip code): " + address1);
        logger.info("Too long guest zip code: " + tooLongZipCode);
        logger.info("Valid guest phone number (too long user zip code): " + phoneNumber);

        System.out.println("\n");
    }
    //invalid guest data input method - too long zip code (75 chars)
    public void inputTooLongZipCodeIntoPostCodeInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(postalCodeInputField));
        postalCodeInputField.sendKeys(tooLongZipCode);
    }

    //invalid guest input data getter - too short phone number (6 chars)
    public void invalidAdditionalGuestTooShortPhoneDataGetter(){
        System.out.println("Invalid guest user data generated (too short user phone number): " + "\n");

        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(8);
        city = TestDataGenerator.getRandomCity();
        address1 = TestDataGenerator.generateRandomAddress(6);
        zipCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        tooShortPhone = "+98548";

        logger.info("Valid guest first name (too short user phone number): " + firstName);
        logger.info("Valid guest last name (too short user phone number): " + lastName);
        logger.info("Valid guest email (too short user phone number): " + email);
        logger.info("Valid guest city (too short user phone number): " + city);
        logger.info("Valid guest address (too short user phone number): " + address1);
        logger.info("Valid guest zip code (too short user phone number): " + zipCode);
        logger.info("Too short guest phone number: " + tooShortPhone);

        System.out.println("\n");
    }
    //invalid guest data input method - too short phone number
    public void inputTooShortPhoneIntoPhoneNumberInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(phoneNumberInputField));
        phoneNumberInputField.sendKeys(tooShortPhone);
    }
    //invalid guest input data getter - too long phone number (25 chars)
    public void invalidAdditionalGuestTooLongPhoneDataGetter(){
        System.out.println("Invalid guest user data generated (too long user phone number): " + "\n");

        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(8);
        city = TestDataGenerator.getRandomCity();
        address1 = TestDataGenerator.generateRandomAddress(6);
        zipCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        tooLongPhone = "+985481212324231213234375";

        logger.info("Valid guest first name (too long user phone number): " + firstName);
        logger.info("Valid guest last name (too long user phone number): " + lastName);
        logger.info("Valid guest email (too long user phone number): " + email);
        logger.info("Valid guest city (too long user phone number): " + city);
        logger.info("Valid guest address (too long user phone number): " + address1);
        logger.info("Valid guest zip code (too long user phone number): " + zipCode);
        logger.info("Too long guest phone number: " + tooLongPhone);

        System.out.println("\n");
    }
    //invalid guest data input method - too long phone number (25 chars)
    public void inputTooLongPhoneIntoPhoneNumberInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(phoneNumberInputField));
        phoneNumberInputField.sendKeys(tooLongPhone);
    }

    //invalid input data format

    //invalid guest input data getter - no email address
    public void invalidAdditionalGuestInvalidEmailFormatDataGetter(){
        System.out.println("Invalid guest user data generated (invalid email address format): " + "\n");

        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        invalidEmailFormat = "fr334example.org";
        city = TestDataGenerator.getRandomCity();
        address1 = TestDataGenerator.generateRandomAddress(8);
        zipCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        phoneNumber = TestDataGenerator.generatePhoneNumber(6);

        logger.info("Valid guest first name (invalid email address format): " + firstName);
        logger.info("Valid guest last name (invalid email address format): " + lastName);
        logger.info("Invalid guest email format: " + invalidEmailFormat);
        logger.info("Valid guest city (invalid email address format): " + city);
        logger.info("Valid guest address (invalid email address format): " + address1);
        logger.info("Valid guest zip code (invalid email address format): " + zipCode);
        logger.info("Valid guest phone number (invalid email address format): " + phoneNumber);

        System.out.println("\n");
    }
    //invalid guest data input method - invalid email address format
    public void inputInvalidEmailIntoEmailInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(emailAddressInputField));
        emailAddressInputField.sendKeys(invalidEmailFormat);
    }

    //invalid guest input data getter - already used email address
    public void invalidAdditionalGuestUsedEmailDataGetter(){
        System.out.println("Invalid guest user data generated (used email address): " + "\n");

        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        alreadyUsedBeforeEmail = "m0@example.com";
        city = TestDataGenerator.getRandomCity();
        address1 = TestDataGenerator.generateRandomAddress(8);
        zipCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        phoneNumber = TestDataGenerator.generatePhoneNumber(6);

        logger.info("Valid guest first name (used email address): " + firstName);
        logger.info("Valid guest last name (used email address): " + lastName);
        logger.info("Used email (existing in database, or, at least, it should): " + alreadyUsedBeforeEmail);
        logger.info("Valid guest city (used email address): " + city);
        logger.info("Valid guest address (used email address): " + address1);
        logger.info("Valid guest zip code (used email address): " + zipCode);
        logger.info("Valid guest phone number (used email address): " + phoneNumber);

        System.out.println("\n");
    }
    //invalid guest data input method - already used email address (in manual testing)
    public void inputUsedEmailIntoEmailInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(emailAddressInputField));
        emailAddressInputField.sendKeys(alreadyUsedBeforeEmail);
    }

    //invalid guest input data getter - invalid phone number format (special symbols only)
    public void invalidAdditionalGuestInvalidPhoneFormatDataGetter(){
        System.out.println("Invalid guest user data generated (invalid user phone number format): " + "\n");

        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        email = TestDataGenerator.generateRandomEmailAddress(8);
        city = TestDataGenerator.getRandomCity();
        address1 = TestDataGenerator.generateRandomAddress(6);
        zipCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        invalidPhoneFormat = "!@#$%^&*()_+";

        logger.info("Valid guest first name (invalid user phone number format): " + firstName);
        logger.info("Valid guest last name (invalid user phone number format): " + lastName);
        logger.info("Valid guest email (invalid user phone number format): " + email);
        logger.info("Valid guest city (invalid user phone number format): " + city);
        logger.info("Valid guest address (invalid user phone number format): " + address1);
        logger.info("Valid guest zip code (invalid user phone number format): " + zipCode);
        logger.info("Invalid guest phone number format: " + invalidPhoneFormat);

        System.out.println("\n");
    }
    //invalid guest data input method - invalid phone number format (special symbols only)
    public void inputInvalidPhoneIntoPhoneNumberInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(phoneNumberInputField));
        phoneNumberInputField.sendKeys(invalidPhoneFormat);
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
