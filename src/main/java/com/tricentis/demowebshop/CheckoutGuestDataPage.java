package com.tricentis.demowebshop;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class CheckoutGuestDataPage extends BasePage{

    //billing address section web elements
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-billing']/div[@class='step-title']")
    private WebElement billingAddressSectionTitle;
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-billing']//div[@class='enter-address-body']//input[@id='BillingNewAddress_FirstName']")
    private WebElement firstNameInputField;
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-billing']//div[@class='enter-address-body']//input[@id='BillingNewAddress_LastName']")
    private WebElement lastNameInputField;
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-billing']//div[@class='enter-address-body']//input[@id='BillingNewAddress_Email']")
    private WebElement emailAddressInputField;
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-billing']//div[@class='enter-address-body']//input[@id='BillingNewAddress_Company']")
    private WebElement companyInputField;
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-billing']//div[@class='enter-address-body']//select[@id='BillingNewAddress_CountryId']")
    private WebElement countryDropdownMenu;
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']/option[@value='1']")
    private WebElement countryUsOption;
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-billing']//div[@class='enter-address-body']//select[@id='BillingNewAddress_StateProvinceId']")
    private WebElement stateDropdownMenu;
    @FindBy(xpath = "//select[@id='BillingNewAddress_StateProvinceId']/option[@value='20']")
    private WebElement stateIllinoisOption;
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-billing']//div[@class='enter-address-body']//input[@id='BillingNewAddress_City']")
    private WebElement cityInputField;
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-billing']//div[@class='enter-address-body']//input[@id='BillingNewAddress_Address1']")
    private WebElement address1InputField; //required input
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-billing']//div[@class='enter-address-body']//input[@id='BillingNewAddress_Address2']")
    private WebElement address2InputField;
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-billing']//div[@class='enter-address-body']//input[@id='BillingNewAddress_ZipPostalCode']")
    private WebElement postalCodeInputField;
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-billing']//div[@class='enter-address-body']//input[@id='BillingNewAddress_PhoneNumber']")
    private WebElement phoneNumberInputField;
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-billing']//div[@class='enter-address-body']//input[@id='BillingNewAddress_FaxNumber']")
    private WebElement faxNumberInputField;
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-billing']//input[@class='button-1 new-address-next-step-button']")
    private WebElement billingAddressContinueButton;

    public CheckoutGuestDataPage(WebDriver driver) {super(driver);}

}
