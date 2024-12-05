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

    //valid guest input data
    private String firstName;
    private String lastName;
    private String email;
    private String city;
    private String address1;
    private String zipCode;
    private String phoneNumber;


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

    //guest first/last name getters
    public String getGuestFirstName(){return firstName;}
    public String getGuestLastName(){return lastName;}
}
