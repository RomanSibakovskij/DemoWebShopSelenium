package com.tricentis.demowebshop;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class CheckoutPaymentMethodPage extends BasePage{

    //credit card section input elements
    @FindBy(xpath = "//div[@class='section payment-info']//table//tr[1]/td[2]/select")
    private WebElement creditCardTypeDropdownMenu;
    @FindBy(xpath = "//select[@id='CreditCardType']/option[@value='MasterCard']")
    private WebElement creditCardMasterCardOption;
    @FindBy(xpath = "//select[@id='CreditCardType']/option[@value='Discover']")
    private WebElement creditCardDiscoverOption;
    @FindBy(xpath = "//select[@id='CreditCardType']/option[@value='Amex']")
    private WebElement creditCardAmexOption;
    @FindBy(xpath = "//div[@class='section payment-info']//table//tr[2]/td[2]/input")
    private WebElement creditCardNameInputField;
    @FindBy(xpath = "//div[@class='section payment-info']//table//tr[3]/td[2]/input")
    private WebElement creditCardNumberInputField;
    @FindBy(xpath = "//div[@class='section payment-info']//table//tr[4]/td[2]/select[@id='ExpireMonth']")
    private WebElement creditCardMonthDropdownMenu;
    @FindBy(xpath = "//select[@id='ExpireMonth']/option[@value='4']")
    private WebElement creditCardValidMonthOption;
    @FindBy(xpath = "//div[@class='section payment-info']//table//tr[4]/td[2]/select[@id='ExpireYear']")
    private WebElement creditCardYearDropdownMenu;
    @FindBy(xpath = "//select[@id='ExpireYear']/option[@value='2024']")
    private WebElement creditCardExpiredYearOption;
    @FindBy(xpath = "//select[@id='ExpireYear']/option[@value='2029']")
    private WebElement creditCardValidYearOption;
    @FindBy(xpath = "//div[@class='section payment-info']//table//tr[5]/td[2]/input")
    private WebElement creditCardCVCInputField;
    //invalid credit card input error message element (no input)
    @FindBy(xpath = "//div[@id='checkout-step-payment-info']//ul/li")
    private WebElement missingCreditCardInputErrorMessage;
    //purchase order number input field element
    @FindBy(xpath = "//div[@class='section payment-info']//input[@id='PurchaseOrderNumber']")
    private WebElement purchaseOrderNumberInputField;

    //valid credit card data
    private String regUserCardHolderName;
    private String guestCardHolderName;
    private String cardNumber;
    private String cardCVCNumber;

    //valid purchase order number data
    private String purchaseOrderNumber = String.valueOf(TestDataGenerator.getRandomPostalOrderNumber());

    //no singular credit input data
    private String noGuestCardHolderName;
    private String noCardNumber;
    private String noCardCVCNumber;

    //no purchase order number data
    private String noPurchaseOrderNumber = "";

    //too short / too long singular credit input data
    private String tooShortGuestCardHolderName;
    private String tooLongGuestCardHolderName;
    private String tooShortCardNumber;
    private String tooLongCardNumber;
    private String tooShortCVCNumber;

    //invalid singular credit input data
    private String invalidGuestCardHolderNameFormat;
    private String invalidCardNumberFormat;
    private String invalidCVCNumberFormat;


    public CheckoutPaymentMethodPage(WebDriver driver) {super(driver);}

    //credit card dropdown menu click method
    public void clickCreditCardDropdownMenu(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.elementToBeClickable(creditCardTypeDropdownMenu));
        creditCardTypeDropdownMenu.click();
    }
    //select 'MasterCard' option method
    public void selectMasterCardOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.visibilityOf(creditCardMasterCardOption));
        creditCardMasterCardOption.click();
    }
    //select 'Discover' option method
    public void selectDiscoverOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.visibilityOf(creditCardDiscoverOption));
        creditCardDiscoverOption.click();
    }
    //select 'Amex' option method
    public void selectAmexOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.visibilityOf(creditCardAmexOption));
        creditCardAmexOption.click();
    }

    //valid guest credit card data getter
    public void validGuestCreditCardDataGetter(){

        TestDataGenerator testDataGenerator = new TestDataGenerator(driver);

        guestCardHolderName = testDataGenerator.getFirstName() + " " + testDataGenerator.getLastName();
        cardNumber = TestDataGenerator.generateCreditCardNumber();
        cardCVCNumber = TestDataGenerator.generateCVC(cardNumber);
        System.out.println("Valid generated user credit card data (guest): " + "\n");

        logger.info("Credit cardholder name (guest): " + guestCardHolderName);
        logger.info("Credit card number (guest): " + cardNumber);
        logger.info("Credit card CVC number (guest): " + cardCVCNumber);

        System.out.println("\n");
    }
    //valid credit card data input methods
    public void inputValidCreditCardNameIntoNameInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.visibilityOf(creditCardNameInputField));
        creditCardNameInputField.sendKeys(guestCardHolderName);
    }
    public void inputValidCreditCardNumberIntoCardNumberInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(creditCardNumberInputField));
        creditCardNumberInputField.sendKeys(cardNumber);
    }
    public void inputValidCreditCardCVCIntoCVCInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(creditCardCVCInputField));
        creditCardCVCInputField.sendKeys(cardCVCNumber);
    }
    //valid credit card date methods
    public void clickCreditCardMonthDropdownMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.elementToBeClickable(creditCardMonthDropdownMenu));
        creditCardMonthDropdownMenu.click();
    }
    public void selectCreditCardValidMonthOption() {creditCardValidMonthOption.click();}

    public void clickCreditCardYearDropdownMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.elementToBeClickable(creditCardYearDropdownMenu));
        creditCardYearDropdownMenu.click();
    }
    public void selectCreditCardValidYearOption() {creditCardValidYearOption.click();}
    //expired year click method
    public void selectCreditCardExpiredYearOption() {creditCardExpiredYearOption.click();}

    //valid registered user credit card data getter
    public void validUserCreditCardDataGetter(){

        TestDataGenerator testDataGenerator = new TestDataGenerator(driver);

        regUserCardHolderName = testDataGenerator.getFirstName() + " " + testDataGenerator.getLastName();
        cardNumber = TestDataGenerator.generateCreditCardNumber();
        cardCVCNumber = TestDataGenerator.generateCVC(cardNumber);
        System.out.println("Valid generated user credit card data (registered user): " + "\n");

        logger.info("Credit cardholder name (registered user): " + regUserCardHolderName);
        logger.info("Credit card number (registered user): " + cardNumber);
        logger.info("Credit card CVC number (registered user): " + cardCVCNumber);

        System.out.println("\n");
    }
    //valid credit card data input method (registered user)
    public void inputValidUserCreditCardNameIntoNameInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(creditCardNameInputField));
        creditCardNameInputField.sendKeys(regUserCardHolderName);
    }

    //invalid guest credit card data getter - no guest cardholder name
    public void invalidGuestCreditCardNoCardNameDataGetter(){

        TestDataGenerator testDataGenerator = new TestDataGenerator(driver);

        noGuestCardHolderName = "";
        cardNumber = TestDataGenerator.generateCreditCardNumber();
        cardCVCNumber = TestDataGenerator.generateCVC(cardNumber);
        System.out.println("Invalid generated user credit card data (guest - no cardholder name): " + "\n");

        logger.info("No guest credit cardholder name: " + noGuestCardHolderName);
        logger.info("Credit card number (guest - no cardholder name)): " + cardNumber);
        logger.info("Credit card CVC number (guest - no cardholder name): " + cardCVCNumber);

        System.out.println("\n");
    }
    //invalid credit card data input methods - no cardholder name
    public void inputNoCreditCardNameIntoNameInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.visibilityOf(creditCardNameInputField));
        creditCardNameInputField.sendKeys(noGuestCardHolderName);
    }

    //invalid guest credit card data getter - no guest card number
    public void invalidGuestCreditCardNoCardNumberDataGetter(){

        TestDataGenerator testDataGenerator = new TestDataGenerator(driver);

        guestCardHolderName = testDataGenerator.getFirstName() + " " + testDataGenerator.getLastName();
        noCardNumber = "";
        cardCVCNumber = "334";
        System.out.println("Invalid generated user credit card data (guest - no card number): " + "\n");

        logger.info("Credit cardholder name (guest - no card number): " + guestCardHolderName);
        logger.info("No guest credit card number: " + noCardNumber);
        logger.info("Credit card CVC number (guest - no card number): " + cardCVCNumber);

        System.out.println("\n");
    }
    //invalid credit card data input method - no credit card number
    public void inputNoCreditCardNumberIntoCardNumberInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(creditCardNumberInputField));
        creditCardNumberInputField.sendKeys(noCardNumber);
    }

    //invalid guest credit card data getter - no guest credit card CVC number
    public void invalidGuestCreditCardNoCardCVCNumberDataGetter(){

        TestDataGenerator testDataGenerator = new TestDataGenerator(driver);

        guestCardHolderName = testDataGenerator.getFirstName() + " " + testDataGenerator.getLastName();
        cardNumber = TestDataGenerator.generateCreditCardNumber();
        noCardCVCNumber = "";
        System.out.println("Invalid generated user credit card data (guest - no card CVC number): " + "\n");

        logger.info("Credit cardholder name (guest - no card CVC number): " + guestCardHolderName);
        logger.info("Credit card number (guest - no card CVC number): " + cardNumber);
        logger.info("No guest credit card CVC number: " + cardCVCNumber);

        System.out.println("\n");
    }

    //invalid credit card data input methods - no credit card CVC number
    public void inputNoCreditCardCVCIntoCVCInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.visibilityOf(creditCardCVCInputField));
        creditCardCVCInputField.sendKeys(noCardCVCNumber);
    }

    //invalid credit card error message getter (no singular input)
    public String getMissingCreditCardInputErrorMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(750));
        wait.until(ExpectedConditions.visibilityOf(missingCreditCardInputErrorMessage));
        return missingCreditCardInputErrorMessage.getText();
    }

    //'Purchase Order' number input method
    public void inputValidPurchaseOrderNumberIntoPONumberInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(purchaseOrderNumberInputField));
        purchaseOrderNumberInputField.sendKeys(purchaseOrderNumber);
    }

    //invalid 'Purchase Order' number input method - no number input
    public void inputNoPurchaseOrderNumberIntoPONumberInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(purchaseOrderNumberInputField));
        purchaseOrderNumberInputField.sendKeys(noPurchaseOrderNumber);
    }

    //invalid guest credit card data getter - too short guest cardholder name (4 chars)
    public void invalidGuestCreditCardTooShortCardNameDataGetter(){

        TestDataGenerator testDataGenerator = new TestDataGenerator(driver);

        tooShortGuestCardHolderName = "Himn";
        cardNumber = TestDataGenerator.generateCreditCardNumber();
        cardCVCNumber = TestDataGenerator.generateCVC(cardNumber);

        System.out.println("Invalid generated user credit card data (guest - too short cardholder name): " + "\n");

        logger.info("Too short guest credit cardholder name: " + tooShortGuestCardHolderName);
        logger.info("Credit card number (guest - too short cardholder name)): " + cardNumber);
        logger.info("Credit card CVC number (guest - too short cardholder name): " + cardCVCNumber);

        System.out.println("\n");
    }
    //invalid credit card data input methods - too short cardholder name (4 chars)
    public void inputTooShortCreditCardNameIntoNameInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.visibilityOf(creditCardNameInputField));
        creditCardNameInputField.sendKeys(tooShortGuestCardHolderName);
    }

    //invalid guest credit card data getter - too long guest cardholder name (100 chars)
    public void invalidGuestCreditCardTooLongCardNameDataGetter(){

        TestDataGenerator testDataGenerator = new TestDataGenerator(driver);

        tooLongGuestCardHolderName = "Adsfsfdfdsffgfjhghjkfgdfsfdfghfgjhjkghfgfdfdfdfdf Fsdsddsdsffdffdssdsaasffdhffhgjhgjkfghfgfdfsdsxcvm";
        cardNumber = TestDataGenerator.generateCreditCardNumber();
        cardCVCNumber = TestDataGenerator.generateCVC(cardNumber);

        System.out.println("Invalid generated user credit card data (guest - too long cardholder name): " + "\n");

        logger.info("Too long guest credit cardholder name: " + tooLongGuestCardHolderName);
        logger.info("Credit card number (guest - too long cardholder name)): " + cardNumber);
        logger.info("Credit card CVC number (guest - too long cardholder name): " + cardCVCNumber);

        System.out.println("\n");
    }
    //invalid credit card data input methods - too long cardholder name (100 chars)
    public void inputTooLongCreditCardNameIntoNameInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.visibilityOf(creditCardNameInputField));
        creditCardNameInputField.sendKeys(tooLongGuestCardHolderName);
    }

    //invalid guest credit card data getter - invalid guest cardholder name format (digits only)
    public void invalidGuestCreditCardInvalidCardNameFormatDataGetter(){

        TestDataGenerator testDataGenerator = new TestDataGenerator(driver);

        invalidGuestCardHolderNameFormat = "1234345546776990756";
        cardNumber = TestDataGenerator.generateCreditCardNumber();
        cardCVCNumber = TestDataGenerator.generateCVC(cardNumber);

        System.out.println("Invalid generated user credit card data (guest - invalid cardholder name format): " + "\n");

        logger.info("Invalid guest credit cardholder name format: " + invalidGuestCardHolderNameFormat);
        logger.info("Credit card number (guest - invalid cardholder name format)): " + cardNumber);
        logger.info("Credit card CVC number (guest - invalid cardholder name format): " + cardCVCNumber);

        System.out.println("\n");
    }
    //invalid credit card data input methods - invalid cardholder name (digits only)
    public void inputInvalidCreditCardNameFormatIntoNameInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.visibilityOf(creditCardNameInputField));
        creditCardNameInputField.sendKeys(invalidGuestCardHolderNameFormat);
    }

    //invalid guest credit card data getter - too short guest card number (15 digits)
    public void invalidGuestCreditCardTooShortCardNumberDataGetter(){

        TestDataGenerator testDataGenerator = new TestDataGenerator(driver);

        guestCardHolderName = testDataGenerator.getFirstName() + " " + testDataGenerator.getLastName();
        tooShortCardNumber= "049887243186538";
        cardCVCNumber = "334";
        System.out.println("Invalid generated user credit card data (guest - too short card number): " + "\n");

        logger.info("Credit cardholder name (guest - too short card number): " + guestCardHolderName);
        logger.info("Too short guest credit card number: " + tooShortCardNumber);
        logger.info("Credit card CVC number (guest - too short card number): " + cardCVCNumber);

        System.out.println("\n");
    }
    //invalid credit card data input method - too short credit card number (15 digits)
    public void inputTooShortCreditCardNumberIntoCardNumberInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(creditCardNumberInputField));
        creditCardNumberInputField.sendKeys(tooShortCardNumber);
    }

    //invalid guest credit card data getter - too long guest card number (18 digits)
    public void invalidGuestCreditCardTooLongCardNumberDataGetter(){

        TestDataGenerator testDataGenerator = new TestDataGenerator(driver);

        guestCardHolderName = testDataGenerator.getFirstName() + " " + testDataGenerator.getLastName();
        tooLongCardNumber= "049887024318653844";
        cardCVCNumber = "334";
        System.out.println("Invalid generated user credit card data (guest - too long card number): " + "\n");

        logger.info("Credit cardholder name (guest - too long card number): " + guestCardHolderName);
        logger.info("Too long guest credit card number: " + tooLongCardNumber);
        logger.info("Credit card CVC number (guest - too long card number): " + cardCVCNumber);

        System.out.println("\n");
    }
    //invalid credit card data input method - too short credit card number (18 digits)
    public void inputTooLongCreditCardNumberIntoCardNumberInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(creditCardNumberInputField));
        creditCardNumberInputField.sendKeys(tooLongCardNumber);
    }

    //invalid guest credit card data getter - invalid guest card number format (random 16 digits)
    public void invalidGuestCreditCardInvalidCardNumberFormatDataGetter(){

        TestDataGenerator testDataGenerator = new TestDataGenerator(driver);

        guestCardHolderName = testDataGenerator.getFirstName() + " " + testDataGenerator.getLastName();
        invalidCardNumberFormat= "1234568765444566";
        cardCVCNumber = "334";
        System.out.println("Invalid generated user credit card data (guest - invalid card number format): " + "\n");

        logger.info("Credit cardholder name (guest - invalid card number format): " + guestCardHolderName);
        logger.info("Invalid guest credit card number format: " + invalidCardNumberFormat);
        logger.info("Credit card CVC number (guest - invalid card number format): " + cardCVCNumber);

        System.out.println("\n");
    }
    //invalid credit card data input method - invalid credit card number format (random 16 digits)
    public void inputInvalidCreditCardNumberFormatIntoCardNumberInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(creditCardNumberInputField));
        creditCardNumberInputField.sendKeys(invalidCardNumberFormat);
    }

    //invalid guest credit card data getter - too short guest credit card CVC number (2 digits)
    public void invalidGuestCreditCardTooShortCardCVCNumberDataGetter(){

        TestDataGenerator testDataGenerator = new TestDataGenerator(driver);

        guestCardHolderName = testDataGenerator.getFirstName() + " " + testDataGenerator.getLastName();
        cardNumber = TestDataGenerator.generateCreditCardNumber();
        tooShortCVCNumber = "21";
        System.out.println("Invalid generated user credit card data (guest - too short card CVC number): " + "\n");

        logger.info("Credit cardholder name (guest - too short card CVC number): " + guestCardHolderName);
        logger.info("Credit card number (guest - too short card CVC number): " + tooShortCVCNumber);
        logger.info("Too short guest credit card CVC number: " + tooShortCVCNumber);

        System.out.println("\n");
    }

    //invalid credit card data input methods - too short credit card CVC number (2 digits)
    public void inputTooShortCreditCardCVCIntoCVCInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.visibilityOf(creditCardCVCInputField));
        creditCardCVCInputField.sendKeys(tooShortCVCNumber);
    }

    //invalid guest credit card data getter - invalid guest credit card CVC number format (chars only)
    public void invalidGuestCreditCardInvalidCardCVCFormatDataGetter(){

        TestDataGenerator testDataGenerator = new TestDataGenerator(driver);

        guestCardHolderName = testDataGenerator.getFirstName() + " " + testDataGenerator.getLastName();
        cardNumber = TestDataGenerator.generateCreditCardNumber();
        invalidCVCNumberFormat = "AFD";
        System.out.println("Invalid generated user credit card data (guest - invalid CVC number format): " + "\n");

        logger.info("Credit cardholder name (guest - invalid CVC number format): " + guestCardHolderName);
        logger.info("Credit card number (guest - invalid CVC number format): " + tooShortCVCNumber);
        logger.info("Invalid guest credit card CVC number format: " + invalidCVCNumberFormat);

        System.out.println("\n");
    }

    //invalid credit card data input methods - invalid credit card CVC number format (chars only)
    public void inputInvalidCreditCardCVCFormatIntoCVCInputField() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.visibilityOf(creditCardCVCInputField));
        creditCardCVCInputField.sendKeys(invalidCVCNumberFormat);
    }
}
