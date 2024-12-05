package com.tricentis.demowebshop;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;
import java.time.Duration;

public class CheckoutPage extends BasePage{

    //checkout page web elements
    @FindBy(xpath = "//div[@class='page-title']")
    private WebElement checkoutPageTitle;
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
    // shipping address section elements
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-shipping']//div[@class='step-title']")
    private WebElement shippingAddressSectionTitle;
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-shipping']//div[@id='checkout-shipping-load']//select[@id='shipping-address-select']")
    private WebElement shippingAddressDropdownMenu;
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-shipping']//div[@class='section select-shipping-address']//label")
    private WebElement shippingAddressDropdownMenuDescription;
    @FindBy(xpath = "//input[@id='PickUpInStore']")
    private WebElement shippingAddressInStorePickupCheckbox;
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-shipping']//p[@class='description']")
    private WebElement shippingAddressInStoreDescription;
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-shipping']//p[@class='back-link']/a")
    private WebElement shippingAddressBackLink;
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-shipping']//input[@class='button-1 new-address-next-step-button']")
    private WebElement shippingAddressContinueButton;
    //payment method section
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-payment_method']//div[@class='step-title']")
    private WebElement paymentMethodSectionTitle;
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-payment_method']//ul[@class='method-list']/li[1]//input")
    private WebElement paymentMethodCashOnDeliveryRadioButton;
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-payment_method']//ul[@class='method-list']/li[2]//input")
    private WebElement paymentMethodCheckMoneyOrderRadioButton;
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-payment_method']//ul[@class='method-list']/li[3]//input")
    private WebElement paymentMethodCreditCardRadioButton;
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-payment_method']//ul[@class='method-list']/li[4]//input")
    private WebElement paymentMethodPurchaseOrderRadioButton;
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-payment_method']//div[@id='payment-method-buttons-container']/p/a")
    private WebElement paymentMethodBackLink;
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-payment_method']//div[@id='payment-method-buttons-container']/input")
    private WebElement paymentMethodContinueButton;
    //payment information section
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-payment_info']//div[@class='step-title']")
    private WebElement paymentInformationSectionTitle;
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-payment_info']//div[@class='info']")
    private WebElement paymentInformationTextTable;
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-payment_info']//p[@class='back-link']/a")
    private WebElement paymentInformationBackLink;
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-payment_info']//input")
    private WebElement paymentInformationContinueButton;
    //confirm order section
    @FindBy(xpath = "//ol[@id='checkout-steps']/li[@id='opc-payment_info']//div[@class='step-title']")
    private WebElement confirmOrderSectionTitle;
    @FindBy(xpath = "//div[@id='checkout-confirm-order-load']/div[@class='checkout-data']/div[@class='order-summary-body']//ul[@class='billing-info']")
    private WebElement confirmOrderBillingAddressData;
    @FindBy(xpath = "//div[@id='checkout-confirm-order-load']/div[@class='checkout-data']/div[@class='order-summary-body']//ul[@class='shipping-info']")
    private WebElement confirmOrderShippingMethodData;
    //table list elements
    @FindBy(xpath = "//div[@id='checkout-confirm-order-load']/div[@class='checkout-data']//table[@class='cart']//tr[@class='cart-item-row']/td[1]")
    private List<WebElement> confirmOrderProductImageElements;
    @FindBy(xpath = "//div[@id='checkout-confirm-order-load']/div[@class='checkout-data']//table[@class='cart']//tr[@class='cart-item-row']/td[2]")
    private List<WebElement> confirmOrderProductNameElements;
    @FindBy(xpath = "//div[@id='checkout-confirm-order-load']/div[@class='checkout-data']//table[@class='cart']//tr[@class='cart-item-row']/td[3]")
    private List<WebElement> confirmOrderProductUnitPriceElements;
    @FindBy(xpath = "//div[@id='checkout-confirm-order-load']/div[@class='checkout-data']//table[@class='cart']//tr[@class='cart-item-row']/td[4]")
    private List<WebElement> confirmOrderProductQuantityElements;
    @FindBy(xpath = "//div[@id='checkout-confirm-order-load']/div[@class='checkout-data']//table[@class='cart']//tr[@class='cart-item-row']/td[5]")
    private List<WebElement> confirmOrderProductTotalPriceElements;
    //lower table elements
    @FindBy(xpath = "//div[@id='checkout-confirm-order-load']/div[@class='checkout-data']//table[@class='cart-total']//tr[1]/td[2]")
    private WebElement confirmOrderProductSubTotalPrice;
    @FindBy(xpath = "//div[@id='checkout-confirm-order-load']/div[@class='checkout-data']//table[@class='cart-total']//tr[2]/td[2]")
    private WebElement confirmOrderProductShippingPrice;
    @FindBy(xpath = "//div[@id='checkout-confirm-order-load']/div[@class='checkout-data']//table[@class='cart-total']//tr[3]/td[2]")
    private WebElement confirmOrderProductAdditionalFee;
    @FindBy(xpath = "//div[@id='checkout-confirm-order-load']/div[@class='checkout-data']//table[@class='cart-total']//tr[4]/td[2]")
    private WebElement confirmOrderProductTax;
    @FindBy(xpath = "//div[@id='checkout-confirm-order-load']/div[@class='checkout-data']//table[@class='cart-total']//tr[5]/td[2]")
    private WebElement confirmOrderProductTotalPrice;
    //buttons
    @FindBy(xpath = "//div[@id='confirm-order-buttons-container']/p[@class='back-link']/a")
    private WebElement confirmOrderProductBackLink;
    @FindBy(xpath = "//div[@id='confirm-order-buttons-container']/input")
    private WebElement confirmOrderButton;

    //valid additional registered user data
    private String city;
    private String address1;
    private String zipCode;
    private String phoneNumber;

    public CheckoutPage(WebDriver driver) {super(driver);}

    //valid registered user input data getter
    public void validAdditionalRegUserDataGetter(){
        System.out.println("Valid additional registered user data generated: " + "\n");

        city = TestDataGenerator.getRandomCity();
        address1 = TestDataGenerator.generateRandomAddress(8);
        zipCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        phoneNumber = TestDataGenerator.generatePhoneNumber(6);

        logger.info("Valid registered user city: " + city);
        logger.info("Valid registered user address: " + address1);
        logger.info("Valid registered user zip code: " + zipCode);
        logger.info("Valid registered user phone number: " + phoneNumber);
    }

    //valid additional registered user data input methods
    public void inputValidUserCityIntoCityInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(cityInputField));
        cityInputField.sendKeys(city);
    }
    public void inputValidUserAddressIntoAddress1InputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(address1InputField));
        address1InputField.sendKeys(address1);
    }
    public void inputValidUserZipCodeIntoPostCodeInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(postalCodeInputField));
        postalCodeInputField.sendKeys(zipCode);
    }
    public void inputValidUserPhoneIntoPhoneNumberInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(phoneNumberInputField));
        phoneNumberInputField.sendKeys(phoneNumber);
    }

    //billing address section country dropdown menu click method
    public void clickBillingAddressCountryDropdownMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.elementToBeClickable(countryDropdownMenu));
        countryDropdownMenu.click();
    }

    //select 'United States' option
    public void selectUSOption(){countryUsOption.click();}

    //billing address section state dropdown menu click method
    public void clickBillingAddressStateDropdownMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.elementToBeClickable(stateDropdownMenu));
        stateDropdownMenu.click();
    }

    //select 'Illinois' option
    public void selectIllinoisOption(){stateIllinoisOption.click();}

    //click 'Continue' button method (billing address section)
    public void clickBillingAddressContinueButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.elementToBeClickable(billingAddressContinueButton));
        billingAddressContinueButton.click();
    }

    //checkout page title getter
    public String getCheckoutPageTitle() {return checkoutPageTitle.getText();}


    //shipping address section

    //click 'In-store' checkbox text method
    public void clickInStoreCheckbox(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(shippingAddressInStorePickupCheckbox));
        shippingAddressInStorePickupCheckbox.click();
    }

    //click 'Continue' button method (shipping address)
    public void clickShippingAddressContinueButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(shippingAddressContinueButton));
        shippingAddressContinueButton.click();
    }

    //shipping address section text getters
    public String getShippingAddressSectionTitle(){return shippingAddressSectionTitle.getText();}
    public String getShippingAddressDropdownMenuDescription(){return shippingAddressDropdownMenu.getText();}
    public String getShippingAddressInStorePickupDescription(){return shippingAddressInStoreDescription.getText();}

    //payment method section

    //click 'Continue' button method (payment method)
    public void clickCheckMoneyOrderRadioButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(paymentMethodCheckMoneyOrderRadioButton));
        paymentMethodCheckMoneyOrderRadioButton.click();
    }

    //click 'Continue' button method (payment method)
    public void clickPaymentMethodContinueButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(paymentMethodContinueButton));
        paymentMethodContinueButton.click();
    }

    //payment information section

    //click 'Continue' button method (payment method)
    public void clickPaymentInfoContinueButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(paymentInformationContinueButton));
        paymentInformationContinueButton.click();
    }

    //confirm order section

    //data getters
    public String getConfirmOrderBillingAddressData(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(confirmOrderBillingAddressData));
        return confirmOrderBillingAddressData.getText();
    }
    public String getConfirmOrderShippingMethodData(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(confirmOrderShippingMethodData));
        return confirmOrderShippingMethodData.getText();
    }

    //product table data getters
    public List<String> getConfirmOrderTableProductName() {
        List<String> productNames = new ArrayList<>();
        for (WebElement element : confirmOrderProductNameElements) {
            productNames.add(element.getText());
        }
        return productNames;
    }
    public List<String> getConfirmOrderTableProductUnitPrice() {
        List<String> productUnitPrices = new ArrayList<>();
        for (WebElement element : confirmOrderProductUnitPriceElements) {
            productUnitPrices.add(element.getText());
        }
        return productUnitPrices;
    }
    public List<String> getConfirmOrderTableProductQuantity() {
        List<String> productQuantities = new ArrayList<>();
        for (WebElement element : confirmOrderProductQuantityElements) {
            productQuantities.add(element.getText());
        }
        return productQuantities;
    }
    public List<String> getConfirmOrderTableProductTotalPrice() {
        List<String> productNames = new ArrayList<>();
        for (WebElement element : confirmOrderProductTotalPriceElements) {
            productNames.add(element.getText());
        }
        return productNames;
    }

    //lower product table data getters
    public String getConfirmOrderProductSubTotalPrice(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(confirmOrderProductSubTotalPrice));
        return confirmOrderProductSubTotalPrice.getText();
    }
    public String getConfirmOrderProductShippingPrice(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(confirmOrderProductShippingPrice));
        return confirmOrderProductShippingPrice.getText();
    }
    public String getConfirmOrderProductAdditionalFee(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(confirmOrderProductAdditionalFee));
        return confirmOrderProductAdditionalFee.getText();
    }
    public String getConfirmOrderProductTax(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(confirmOrderProductTax));
        return confirmOrderProductTax.getText();
    }
    public String getConfirmOrderProductTotalPrice(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.visibilityOf(confirmOrderProductTotalPrice));
        return confirmOrderProductTotalPrice.getText();
    }

    //click 'Confirm' button method (confirm order)
    public void clickConfirmButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(confirmOrderButton));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", confirmOrderButton);
        confirmOrderButton.click();
    }

    //checkout page billing address section web element assert methods
    public boolean isCheckoutPageTitleDisplayed() {return checkoutPageTitle.isDisplayed();}
    public boolean isBillingAddressSectionTitleDisplayed() {return billingAddressSectionTitle.isDisplayed();}
    public boolean isFirstNameInputFieldDisplayed() {return firstNameInputField.isDisplayed();}
    public boolean isLastNameInputFieldDisplayed() {return lastNameInputField.isDisplayed();}
    public boolean isEmailAddressInputFieldDisplayed() {return emailAddressInputField.isDisplayed();}
    public boolean isCompanyInputFieldDisplayed() {return companyInputField.isDisplayed();}
    public boolean isCountryDropdownMenuDisplayed() {return countryDropdownMenu.isDisplayed();}
    public boolean isStateDropdownMenuDisplayed() {return stateDropdownMenu.isDisplayed();}
    public boolean isCityInputFieldDisplayed() {return cityInputField.isDisplayed();}
    public boolean isAddress1InputFieldDisplayed() {return address1InputField.isDisplayed();}
    public boolean isAddress2InputFieldDisplayed() {return address2InputField.isDisplayed();}
    public boolean isPostalCodeInputFieldDisplayed() {return postalCodeInputField.isDisplayed();}
    public boolean isPhoneNumberInputFieldDisplayed() {return phoneNumberInputField.isDisplayed();}
    public boolean isFaxNumberInputFieldDisplayed() {return faxNumberInputField.isDisplayed();}
    public boolean isBillingAddressContinueButtonDisplayed() {return billingAddressContinueButton.isDisplayed();}

    //shipping address section web element assert methods
    public boolean isShippingAddressSectionTitleDisplayed(){return shippingAddressSectionTitle.isDisplayed();}
    public boolean isShippingAddressDropdownMenuDisplayed() {return shippingAddressDropdownMenu.isDisplayed();}
    public boolean isShippingAddressDropdownMenuDescriptionDisplayed() {return shippingAddressDropdownMenuDescription.isDisplayed();}
    public boolean isShippingAddressInStorePickupCheckboxDisplayed() {return shippingAddressInStorePickupCheckbox.isDisplayed();}
    public boolean isShippingAddressInStoreDescriptionDisplayed() {return shippingAddressInStoreDescription.isDisplayed();}
    public boolean isShippingAddressBackLinkDisplayed() {return shippingAddressBackLink.isDisplayed();}
    public boolean isShippingAddressContinueButtonDisplayed() {return shippingAddressContinueButton.isDisplayed();}

    //payment method section web element assert methods
    public boolean isPaymentMethodSectionTitleDisplayed() {return paymentMethodSectionTitle.isDisplayed();}
    public boolean isPaymentMethodCashOnDeliveryRadioButtonDisplayed() {return paymentMethodCashOnDeliveryRadioButton.isDisplayed();}
    public boolean isPaymentMethodCheckMoneyOrderRadioButtonDisplayed() {return paymentMethodCheckMoneyOrderRadioButton.isDisplayed();}
    public boolean isPaymentMethodCreditCardRadioButtonDisplayed() {return paymentMethodCreditCardRadioButton.isDisplayed();}
    public boolean isPaymentMethodPurchaseOrderRadioButtonDisplayed() {return paymentMethodPurchaseOrderRadioButton.isDisplayed();}
    public boolean isPaymentMethodBackLinkDisplayed() {return paymentMethodBackLink.isDisplayed();}
    public boolean isPaymentMethodContinueButtonDisplayed() {return paymentMethodContinueButton.isDisplayed();}

    //payment method web element assert methods
    public boolean isPaymentInformationSectionTitleDisplayed() {return paymentInformationSectionTitle.isDisplayed();}
    public boolean isPaymentInformationTextTableDisplayed() {return paymentInformationTextTable.isDisplayed();}
    public boolean isPaymentInformationBackLinkDisplayed() {return paymentInformationBackLink.isDisplayed();}
    public boolean isPaymentInformationContinueButtonDisplayed() {return paymentInformationContinueButton.isDisplayed();}

    //confirm order section web element assert methods
    public boolean isConfirmOrderSectionTitleDisplayed() {return confirmOrderSectionTitle.isDisplayed();}
    public boolean isConfirmOrderBillingAddressDataDisplayed() {return confirmOrderBillingAddressData.isDisplayed();}
    public boolean isConfirmOrderShippingMethodDataDisplayed() {return confirmOrderShippingMethodData.isDisplayed();}
    public boolean isConfirmOrderProductSubTotalPriceDisplayed() {return confirmOrderProductSubTotalPrice.isDisplayed();}
    public boolean isConfirmOrderProductShippingPriceDisplayed() {return confirmOrderProductShippingPrice.isDisplayed();}
    public boolean isConfirmOrderProductAdditionalFeeDisplayed() {return confirmOrderProductAdditionalFee.isDisplayed();}
    public boolean isConfirmOrderProductTaxDisplayed() {return confirmOrderProductTax.isDisplayed();}
    public boolean isConfirmOrderProductTotalPriceDisplayed() {return confirmOrderProductTotalPrice.isDisplayed();}
    public boolean isConfirmOrderBackLinkDisplayed() {return confirmOrderProductBackLink.isDisplayed();}
    public boolean isConfirmOrderButtonDisplayed() {return confirmOrderButton.isDisplayed();}
    //list elements (confirm order section)
    public boolean isConfirmOrderProductImageDisplayed() {
        for (WebElement element : confirmOrderProductImageElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isConfirmOrderProductNameDisplayed() {
        for (WebElement element : confirmOrderProductNameElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isConfirmOrderProductUnitPriceDisplayed() {
        for (WebElement element : confirmOrderProductImageElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isConfirmOrderProductQuantityDisplayed() {
        for (WebElement element : confirmOrderProductQuantityElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isConfirmOrderProductTotalTablePriceDisplayed() {
        for (WebElement element : confirmOrderProductTotalPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
}
