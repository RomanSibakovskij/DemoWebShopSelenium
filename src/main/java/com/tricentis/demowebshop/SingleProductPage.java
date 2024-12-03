package com.tricentis.demowebshop;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.util.*;

public class SingleProductPage extends BasePage{

    //single product page web elements
    @FindBy(xpath = "//div[@class='picture']/img")
    private WebElement mainProductPicture;
    @FindBy(xpath = "//div[@class='full-description']")
    private WebElement productDescription;
    @FindBy(xpath = "//div[@class='product-name']/h1")
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
    @FindBy(xpath = "//select[@id='product_attribute_16_5_4']")
    private WebElement productProcessorDropdownMenu;
    @FindBy(xpath = "//select[@id='product_attribute_16_6_5']")
    private WebElement productRAMDropdownMenu;
    //list elements
    @FindBy(xpath = "//div[@class='breadcrumb']//li//a")
    private List <WebElement> breadcrumbPathElements;
    @FindBy(xpath = "//div[@class='picture-thumbs']//img")
    private List <WebElement> thumbProductPicturesElements;
    private List <WebElement> productHDDRadioButtonElements = driver.findElements(By.xpath("//div[@class='attributes']//dd[3]/ul[@class='option-list']/li"));
    private List <WebElement> productOSRadioButtonElements = driver.findElements(By.xpath("//div[@class='attributes']//dd[4]/ul[@class='option-list']/li"));
    private List <WebElement> productSoftwareOptionsRadioButtonElements = driver.findElements(By.xpath("//div[@class='attributes']//dd[5]/ul[@class='option-list']/li"));
    private List <WebElement> productTagElements = driver.findElements(By.xpath("//div[@class='product-tags-list']/ul/li"));
    private List <WebElement> customersBoughtSameProductCardElements = driver.findElements(By.xpath("//div[@class='also-purchased-products-grid product-grid']/div[@class='item-box'"));
    //price element
    @FindBy(xpath = "//div[@class='product-price']/span")
    private WebElement productUnitPrice;
    @FindBy(xpath = "//input[@id='addtocart_16_EnteredQuantity']")
    private WebElement productQuantityInputField;
    @FindBy(xpath = "//input[@value='Email a friend']")
    private WebElement productEmailAFriendButton;
    @FindBy(xpath = "//input[@value='Add to compare']")
    private WebElement productAddToCompareButton;
    @FindBy(xpath = "//div[@class='add-to-cart']//input[@value='Add to cart']")
    private WebElement productAddToCartButton;
    @FindBy(xpath = "//div[@class='add-to-cart']//input[@value='Add to wishlist']")
    private WebElement productAddToWishlistButton;


    public SingleProductPage(WebDriver driver) {super(driver);}


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
    public boolean isProductFreShippingBadgeDisplayed() {return productFreeShippingBadge.isDisplayed();}
    public boolean isProductProcessorDropdownMenuDisplayed() {return productProcessorDropdownMenu.isDisplayed();}
    public boolean isProductRAMDropdownMenuDisplayed() {return productRAMDropdownMenu.isDisplayed();}
    public boolean isProductAddToWishlistButtonDisplayed() {return productAddToWishlistButton.isDisplayed();}

    public boolean isProductThumbPictureDisplayed() {
        for (WebElement element : thumbProductPicturesElements) {
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
