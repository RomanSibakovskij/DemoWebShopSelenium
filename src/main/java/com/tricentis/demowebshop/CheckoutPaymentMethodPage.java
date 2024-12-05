package com.tricentis.demowebshop;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class CheckoutPaymentMethodPage extends BasePage{

    //credit card section input elements
    @FindBy(xpath = "//div[@class='section payment-info']//table//tr[1]/td[2]/select")
    private WebElement creditCardTypeDropdownMenu;
    @FindBy(xpath = "//div[@class='section payment-info']//table//tr[2]/td[2]/input")
    private WebElement creditCardNameInputField;
    @FindBy(xpath = "//div[@class='section payment-info']//table//tr[3]/td[2]/input")
    private WebElement creditCardNumberInputField;
    @FindBy(xpath = "//div[@class='section payment-info']//table//tr[4]/td[2]/select[@id='ExpireMonth']")
    private WebElement creditCardMonthInputField;
    @FindBy(xpath = "//div[@class='section payment-info']//table//tr[4]/td[2]/select[@id='ExpireYear']")
    private WebElement creditCardYearInputField;
    @FindBy(xpath = "//div[@class='section payment-info']//table//tr[5]/td[2]/input")
    private WebElement creditCardCVCInputField;


    public CheckoutPaymentMethodPage(WebDriver driver) {super(driver);}

}
