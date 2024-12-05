package com.tricentis.demowebshop;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPaymentMethodPage extends BasePage{

    //credit card section input elements
    @FindBy(xpath = "//div[@class='section payment-info']//table//tr[1]/td[2]/select")
    private WebElement creditCardTypeDropdownMenu;
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
    @FindBy(xpath = "//select[@id='ExpireYear']/option[@value='2032']")
    private WebElement creditCardValidYearOption;
    @FindBy(xpath = "//div[@class='section payment-info']//table//tr[5]/td[2]/input")
    private WebElement creditCardCVCInputField;

    //valid credit card data
    private String regUserCardHolderName;
    private String guestCardHolderName;
    private String cardNumber;
    private String cardCVCNumber;


    public CheckoutPaymentMethodPage(WebDriver driver) {super(driver);}

    //valid guest credit card data getter
    public void validGuestCreditCardDataGetter(){

        TestDataGenerator testDataGenerator = new TestDataGenerator(driver);

        guestCardHolderName = testDataGenerator.getFirstName() + " " + testDataGenerator.getLastName();
        cardNumber = TestDataGenerator.generateCreditCardNumber();
        cardCVCNumber = TestDataGenerator.generateCVC(cardNumber);
        System.out.println("Valid generated user credit card data (guest): " + "\n");

        logger.info("Credit card holder name (guest): " + guestCardHolderName);
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

    //valid registered user credit card data getter
    public void validUserCreditCardDataGetter(){

        TestDataGenerator testDataGenerator = new TestDataGenerator(driver);

        regUserCardHolderName = testDataGenerator.getFirstName() + " " + testDataGenerator.getLastName();
        cardNumber = TestDataGenerator.generateCreditCardNumber();
        cardCVCNumber = TestDataGenerator.generateCVC(cardNumber);
        System.out.println("Valid generated user credit card data (registered user): " + "\n");

        logger.info("Credit card holder name (registered user): " + regUserCardHolderName);
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

}
