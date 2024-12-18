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
    @FindBy(xpath = "//div[@class='section order-completed']/div[@class='title']/strong[.= 'Your order has been successfully processed!']")
    private WebElement orderSubmissionSuccessMessage;
    @FindBy(xpath = "//div[@class='section order-completed']//ul/li[1]")
    private WebElement submittedOrderNumber;
    @FindBy(xpath = "//div[@class='section order-completed']//ul/li[2]/a")
    private WebElement orderDetailsPageLink;
    @FindBy(xpath = "//div[@class='buttons']/input[@type='button']")
    private WebElement continueButton;
    //order details page elements
    @FindBy(xpath = "//div[@class='page order-details-page']/div[@class='page-title']/h1")
    private WebElement orderDetailsPageTitle;
    @FindBy(xpath = "//div[@class='page order-details-page']/div[@class='page-title']/a[2]")
    private WebElement orderPDFInvoiceButton;
    @FindBy(xpath = "//div[@class='page order-details-page']/div[@class='page-title']/a[1]")
    private WebElement orderPrintButton;
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

    //order submission success title getter
    public String getOrderSubmissionSuccessTitle(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.visibilityOf(orderSubmissionSuccessTitle));
        return orderSubmissionSuccessTitle.getText();
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
    //order details products section title getter
    public String getOrderDetailsProductsSectionTitle(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.visibilityOf(orderProductsSectionTitle));
        return orderProductsSectionTitle.getText();
    }

    //order details invoice product data (both tables) getters
    public List<String> getOrderInvoiceProductName() {
        List<String> productNames = new ArrayList<>();
        for (WebElement element : orderProductNameElements) {
            productNames.add(element.getText());
        }
        return productNames;
    }
    public List<String> getOrderInvoiceProductUnitPrice() {
        List<String> productUnitPrices = new ArrayList<>();
        for (WebElement element : orderProductUnitPriceElements) {
            productUnitPrices.add(element.getText());
        }
        return productUnitPrices;
    }
    public List<String> getOrderInvoiceProductQuantity() {
        List<String> productQuantities = new ArrayList<>();
        for (WebElement element : orderProductQuantityElements) {
            productQuantities.add(element.getText());
        }
        return productQuantities;
    }
    public List<String> getOrderInvoiceProductTotalPrice() {
        List<String> productTotalPrices = new ArrayList<>();
        for (WebElement element : orderProductTotalPriceElements) {
            productTotalPrices.add(element.getText());
        }
        return productTotalPrices;
    }
    public String getOrderInvoiceSubTotalPrice(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.visibilityOf(orderSubTotalPrice));
        return orderSubTotalPrice.getText();
    }
    public String getOrderInvoiceShippingPrice(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.visibilityOf(orderShippingPrice));
        return orderShippingPrice.getText();
    }
    public String getOrderInvoiceAdditionalFee(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.visibilityOf(orderAdditionalFee));
        return orderAdditionalFee.getText();
    }
    public String getOrderInvoiceTax(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.visibilityOf(orderTax));
        return orderTax.getText();
    }
    public String getOrderInvoiceTotalPrice(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.visibilityOf(orderTotalPrice));
        return orderTotalPrice.getText();
    }

    //pre-order information page web element assert methods
    public boolean isOrderSubmissionSuccessTitleDisplayed() {return orderSubmissionSuccessTitle.isDisplayed();}
    public boolean isOrderSubmissionSuccessMessageDisplayed() {return orderSubmissionSuccessMessage.isDisplayed();}
    public boolean isSubmittedOrderNumberDisplayed() {return submittedOrderNumber.isDisplayed();}
    public boolean isOrderDetailsPageLinkDisplayed() {return orderDetailsPageLink.isDisplayed();}
    public boolean isContinueButtonDisplayed() {return continueButton.isDisplayed();}

    //order details page web element assert methods
    public boolean isOrderDetailsPageTitleDisplayed() {return orderDetailsPageTitle.isDisplayed();}
    public boolean isOrderDetailsPDFInvoiceButtonDisplayed() {return orderPDFInvoiceButton.isDisplayed();}
    public boolean isOrderDetailsPrintButtonDisplayed() {return orderPrintButton.isDisplayed();}
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
