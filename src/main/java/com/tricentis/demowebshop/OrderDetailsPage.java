package com.tricentis.demowebshop;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;

public class OrderDetailsPage extends BasePage{

    //pre-order information page elements
    @FindBy(xpath = "//div[@class='page checkout-page']/div[@class='page-title']")
    private WebElement orderSubmissionSuccessTitle;
    @FindBy(xpath = "//div[@class='section order-completed']//strong")
    private WebElement orderSubmissionSuccessMessage;
    @FindBy(xpath = "//div[@class='section order-completed']//ul/li[1]")
    private WebElement submittedOrderNumber;
    @FindBy(xpath = "//div[@class='section order-completed']//ul/li[2]/a")
    private WebElement orderDetailsPageLink;
    @FindBy(xpath = "//div[@class='buttons']/input[@type='button']")
    private WebElement continueButton;
    //order details page elements
    @FindBy(xpath = "//div[@class='page order-details-page']/div[@class='page-title']")
    private WebElement orderDetailsPageTitle;
    @FindBy(xpath = "//div[@class='order-overview']")
    private WebElement orderOverview;
    @FindBy(xpath = "//div[@class='order-details-area']/table//ul[@class='billing-info']")
    private WebElement orderBillingInformation;
    @FindBy(xpath = "//div[@class='order-details-area']/table//ul[@class='shipping-info']")
    private WebElement orderShippingInformation;
    @FindBy(xpath = "//div[@class='section products']/div[@class='title']")
    private WebElement orderProductsSectionTitle;
    //product table list elements
    @FindBy(xpath = "//table[@class='data-table']//tbody/tr/td[1]")
    private List<WebElement> orderProductNameElements;
    @FindBy(xpath = "//table[@class='data-table']//tbody/tr/td[2]")
    private List<WebElement> orderProductUnitPriceElements;
    @FindBy(xpath = "//table[@class='data-table']//tbody/tr/td[3]")
    private List<WebElement> orderProductQuantityElements;
    @FindBy(xpath = "//table[@class='data-table']//tbody/tr/td[4]")
    private List<WebElement> orderProductTotalPriceElements;
    //singular elements
    @FindBy(xpath = "//div[@class='actions']/input[@type='button']")
    private WebElement reOrderButton;
    //lower order table elements
    @FindBy(xpath = "//table[@class='cart-total']//tr[1]/td[2]")
    private WebElement orderSubTotalPrice;
    @FindBy(xpath = "//table[@class='cart-total']//tr[2]/td[2]")
    private WebElement orderShippingPrice;
    @FindBy(xpath = "//table[@class='cart-total']//tr[3]/td[2]")
    private WebElement orderAdditionalFee;
    @FindBy(xpath = "//table[@class='cart-total']//tr[4]/td[2]")
    private WebElement orderTax;
    @FindBy(xpath = "//table[@class='cart-total']//tr[5]/td[2]")
    private WebElement orderTotalPrice;

    public OrderDetailsPage(WebDriver driver) {super(driver);}

    //order details page link click method
    public void clickOrderDetailsPageLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(orderDetailsPageLink));
        orderDetailsPageLink.click();
    }
    // 'Continue' button click method
    public void clickContinueButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(continueButton));
        continueButton.click();
    }

    //order submission success title getter
    public String getOrderSubmissionSuccessTitle(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.visibilityOf(orderSubmissionSuccessTitle));
        return orderSubmissionSuccessTitle.getText();
    }
    //order submission success message getter
    public String getOrderSubmissionMessageTitle(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.visibilityOf(orderSubmissionSuccessMessage));
        return orderSubmissionSuccessMessage.getText();
    }
    //submitted order number getter
    public String getSubmitterOrderNumber(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.visibilityOf(submittedOrderNumber));
        return submittedOrderNumber.getText();
    }
    //order details page title getter
    public String getOrderDetailsPageTitle(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.visibilityOf(orderDetailsPageTitle));
        return orderDetailsPageTitle.getText();
    }

    //pre-order information page web element assert methods
    public boolean isOrderSubmissionSuccessTitleDisplayed() {return orderSubmissionSuccessTitle.isDisplayed();}
    public boolean isOrderSubmissionSuccessMessageDisplayed() {return orderSubmissionSuccessMessage.isDisplayed();}
    public boolean isSubmittedOrderNumberDisplayed() {return submittedOrderNumber.isDisplayed();}
    public boolean isOrderDetailsPageLinkDisplayed() {return orderDetailsPageLink.isDisplayed();}
    public boolean isContinueButtonDisplayed() {return continueButton.isDisplayed();}

    //order details page web element assert methods
    public boolean isOrderDetailsPageTitleDisplayed() {return orderDetailsPageTitle.isDisplayed();}
    public boolean isOrderOverviewDisplayed() {return orderOverview.isDisplayed();}
    public boolean isOrderBillingInformationDisplayed() {return orderBillingInformation.isDisplayed();}
    public boolean isOrderShippingInformationDisplayed() {return orderShippingInformation.isDisplayed();}
    public boolean isOrderProductsSectionTitleDisplayed() {return orderProductsSectionTitle.isDisplayed();}
    public boolean isReOrderButtonDisplayed() {return reOrderButton.isDisplayed();}
    public boolean isOrderSubTotalPriceDisplayed() {return orderSubTotalPrice.isDisplayed();}

    //list elements
    public boolean isOrderProductNameDisplayed() {
        for (WebElement element : orderProductNameElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isOrderProductUnitPriceDisplayed() {
        for (WebElement element : orderProductUnitPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isOrderProductQuantityDisplayed() {
        for (WebElement element : orderProductQuantityElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isOrderProductTotalPriceDisplayed() {
        for (WebElement element : orderProductTotalPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
}
