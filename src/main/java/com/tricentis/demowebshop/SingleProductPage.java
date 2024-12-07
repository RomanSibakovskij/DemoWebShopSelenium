package com.tricentis.demowebshop;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;

public class SingleProductPage extends BasePage{

    //single product page web elements
    @FindBy(xpath = "//div[@class='picture']/img")
    private WebElement mainProductPicture;
    @FindBy(xpath = "//div[@class='full-description']")
    private WebElement productDescription;
    @FindBy(xpath = "//div[@class='product-name']")
    private WebElement productName;
    @FindBy(xpath = "//div[@class='short-description']")
    private WebElement productShortDescription;
    @FindBy(xpath = "//div[@class='stock']")
    private WebElement productAvailability;
    @FindBy(xpath = "//div[@class='free-shipping']")
    private WebElement productFreeShippingBadge;
    @FindBy(xpath = "//div[@class='product-review-box']")
    private WebElement productReviewBox;
    @FindBy(xpath = "//div[@class='product-review-links']/a[1]")
    private WebElement productViewReviewsLink;
    @FindBy(xpath = "//div[@class='product-review-links']/a[2]")
    private WebElement productAddReviewLink;
    //list elements
    @FindBy(xpath = "//div[@class='breadcrumb']//li//a")
    private List <WebElement> breadcrumbPathElements;
    @FindBy(xpath = "//div[@class='picture-thumbs']//img")
    private List <WebElement> thumbProductPicturesElements;
    //list elements
    private List <WebElement> productProcessorRadioButtonElements = driver.findElements(By.xpath("//div[@class='attributes']//dd[1]/ul[@class='option-list']/li"));
    private List <WebElement> productRAMRadioButtonElements = driver.findElements(By.xpath("//div[@class='attributes']//dd[2]/ul[@class='option-list']/li"));
    private List <WebElement> productHDDRadioButtonElements = driver.findElements(By.xpath("//div[@class='attributes']//dd[3]/ul[@class='option-list']/li"));
    private List <WebElement> productOSRadioButtonElements = driver.findElements(By.xpath("//div[@class='attributes']//dd[4]/ul[@class='option-list']/li"));
    private List <WebElement> productSoftwareOptionsRadioButtonElements = driver.findElements(By.xpath("//div[@class='attributes']//dd[5]/ul[@class='option-list']/li"));
    private List <WebElement> productTagElements = driver.findElements(By.xpath("//div[@class='product-tags-list']/ul/li"));
    private List <WebElement> customersBoughtSameProductCardElements = driver.findElements(By.xpath("//div[@class='also-purchased-products-grid product-grid']/div[@class='item-box']"));
    //price element
    @FindBy(xpath = "//div[@class='product-price']/span")
    private WebElement productUnitPrice;
    @FindBy(xpath = "//input[@class='qty-input']")
    private WebElement productQuantityInputField;
    @FindBy(xpath = "//input[@value='Email a friend']")
    private WebElement productEmailAFriendButton;
    @FindBy(xpath = "//div[@class='compare-products']/input[@type='button']")
    private WebElement productAddToCompareButton;
    @FindBy(xpath = "//div[@class='add-to-cart']//input[@value='Add to cart']")
    private WebElement productAddToCartButton;


    public SingleProductPage(WebDriver driver) {super(driver);}

    //change the product quantity method
    public void changeSingleProductQuantity(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOfAllElements(productQuantityInputField));
        productQuantityInputField.clear();
        productQuantityInputField.sendKeys(String.valueOf(3));
    }

    //click 'Add to cart' button method
    public void clickAddToCartButton(){productAddToCartButton.click();}

    //single product page data getters
    public String getProductName() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.visibilityOfAllElements(productName));
        return productName.getText();
    }

    public String getProductDescription() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOfAllElements(productDescription));
        return productDescription.getText();
    }
    public String getProductShortDescription() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOfAllElements(productShortDescription));
        return productShortDescription.getText();
    }
    public String getProductAvailability() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOfAllElements(productAvailability));
        return productAvailability.getText();
    }
    public String getDefaultProductQuantity() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOfAllElements(productQuantityInputField));
        return productQuantityInputField.getDomAttribute("value");
    }
    public String getProductUnitPrice() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOfAllElements(productUnitPrice));
        return productUnitPrice.getText();
    }


    //single product page web element assert methods
    public boolean isMainProductPictureDisplayed(){return mainProductPicture.isDisplayed();}
    public boolean isProductDescriptionDisplayed(){return productDescription.isDisplayed();}
    public boolean isProductNameDisplayed(){return productName.isDisplayed();}
    public boolean isProductShortDescriptionDisplayed(){return productShortDescription.isDisplayed();}
    public boolean isProductAvailabilityDisplayed(){return productAvailability.isDisplayed();}
    public boolean isProductReviewBoxDisplayed(){return productReviewBox.isDisplayed();}
    public boolean isProductViewReviewsLinkDisplayed(){return productViewReviewsLink.isDisplayed();}
    public boolean isProductAddReviewLinkDisplayed(){return productAddReviewLink.isDisplayed();}
    public boolean isProductPriceDisplayed(){return productUnitPrice.isDisplayed();}
    public boolean isProductQuantityInputFieldDisplayed(){return productQuantityInputField.isDisplayed();}
    public boolean isProductEmailAFriendButtonDisplayed(){return productEmailAFriendButton.isDisplayed();}
    public boolean isProductAddToCartButtonDisplayed(){return productAddToCartButton.isDisplayed();}
    public boolean isProductAddToCompareButtonDisplayed(){return productAddToCompareButton.isDisplayed();}

    public boolean isProductBreadcrumbPathDisplayed() {
        for (WebElement element : breadcrumbPathElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductTagDisplayed() {
        for (WebElement element : productTagElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isCustomersBoughtSameProductCardDisplayed() {
        for (WebElement element : customersBoughtSameProductCardElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

    //elements that not all pages have
    public boolean isProductFreeShippingBadgeDisplayed() {return productFreeShippingBadge.isDisplayed();}

    public boolean isProductThumbPictureDisplayed() {
        for (WebElement element : thumbProductPicturesElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductProcessorRadioButtonElementsDisplayed() {
        for (WebElement element : productProcessorRadioButtonElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductRAMRadioButtonElementsDisplayed() {
        for (WebElement element : productRAMRadioButtonElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductHDDRadioButtonDisplayed() {
        for (WebElement element : productHDDRadioButtonElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductOSRadioButtonDisplayed() {
        for (WebElement element : productOSRadioButtonElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductSoftwareRadioButtonDisplayed() {
        for (WebElement element : productSoftwareOptionsRadioButtonElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
}
