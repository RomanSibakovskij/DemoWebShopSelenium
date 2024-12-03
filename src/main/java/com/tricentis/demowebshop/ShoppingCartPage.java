package com.tricentis.demowebshop;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.util.*;

public class ShoppingCartPage extends BasePage{

    //shopping cart web elements
    @FindBy(xpath = "//div[@class='page-title']/h1")
    private WebElement shoppingCartPageTitle;
    //product table list elements
    private List <WebElement> shoppingCartProductRemoveButtonElements = driver.findElements(By.xpath("//table[@class='cart']/tbody/tr/td[1]/input"));
    @FindBy(xpath = "//table[@class='cart']/tbody/tr/td[2]")
    private List <WebElement> shoppingCartProductImageElements;
    @FindBy(xpath = "//table[@class='cart']/tbody/tr/td[3]")
    private List <WebElement> shoppingCartProductNameElements;
    @FindBy(xpath = "//table[@class='cart']/tbody/tr/td[4]")
    private List <WebElement> shoppingCartProductUnitPriceElements;
    @FindBy(xpath = "//table[@class='cart']/tbody/tr/td[5]/input")
    private List <WebElement> shoppingCartProductQtyInputFieldElements;
    @FindBy(xpath = "//table[@class='cart']/tbody/tr/td[6]")
    private List <WebElement> shoppingCartProductTotalPriceElements;
    //singular elements
    @FindBy(xpath = "//input[@name='updatecart']")
    private WebElement updateShoppingCartButton;
    @FindBy(xpath = "//input[@name='continueshopping']")
    private WebElement continueShoppingButton;
    //discount code section
    @FindBy(xpath = "//div[@class='coupon-box']//strong")
    private WebElement discountCodeSectionTitle;
    @FindBy(xpath = "//div[@class='coupon-box']/div[@class='hint']")
    private WebElement discountCodeSectionHint;
    @FindBy(xpath = "//div[@class='coupon-box']//input[@name='discountcouponcode']")
    private WebElement discountCodeInputField;
    @FindBy(xpath = "//div[@class='coupon-box']//input[@value='Apply coupon']")
    private WebElement applyDiscountCouponButton;
    //gift cards section
    @FindBy(xpath = "//div[@class='giftcard-box']//strong")
    private WebElement giftCardSectionTitle;
    @FindBy(xpath = "//div[@class='giftcard-box']/div[@class='hint']")
    private WebElement giftCardSectionHint;
    @FindBy(xpath = "//div[@class='giftcard-box']//input[@name='giftcardcouponcode']")
    private WebElement giftCardCodeInputField;
    @FindBy(xpath = "//div[@class='giftcard-box']//input[@value='Add gift card']")
    private WebElement addGiftCardButton;
    //estimate shipping section
    @FindBy(xpath = "//div[@class='estimate-shipping']//strong")
    private WebElement estimateShippingSectionTitle;
    @FindBy(xpath = "//div[@class='estimate-shipping']/div[@class='hint']")
    private WebElement estimateShippingSectionHint;
    @FindBy(xpath = "//div[@class='estimate-shipping']//select[@id='CountryId']")
    private WebElement shippingCountryDropdownMenu;
    @FindBy(xpath = "//div[@class='estimate-shipping']//select[@id='StateProvinceId']")
    private WebElement shippingStateDropdownMenu;
    @FindBy(xpath = "//div[@class='estimate-shipping']//input[@id='ZipPostalCode']")
    private WebElement zipCodeInputField;
    @FindBy(xpath = "//div[@class='estimate-shipping']//input[@value='Estimate shipping']")
    private WebElement estimateShippingButton;
    //product price elements
    @FindBy(xpath = "//table[@class='cart-total']//tr[1]/td[2]")
    private WebElement productSubTotalPrice;
    @FindBy(xpath = "//table[@class='cart-total']//tr[2]/td[2]")
    private WebElement productShippingPrice;
    @FindBy(xpath = "//table[@class='cart-total']//tr[3]/td[2]")
    private WebElement productTax;
    @FindBy(xpath = "//table[@class='cart-total']//tr[4]/td[2]")
    private WebElement productTotalPrice;
    @FindBy(xpath = "//div[@class='totals']//input[@id='termsofservice']")
    private WebElement agreeToTermsCheckbox;
    @FindBy(xpath = "//div[@class='totals']//button[@id='checkout']")
    private WebElement checkoutButton;


    public ShoppingCartPage(WebDriver driver) {super(driver);}

    //shopping cart page web element assert methods
    public boolean isShoppingCartPageTitleDisplayed() {return shoppingCartPageTitle.isDisplayed();}
    public boolean isUpdateShoppingCartButtonDisplayed() {return updateShoppingCartButton.isDisplayed();}
    public boolean isContinueShoppingButtonDisplayed() {return continueShoppingButton.isDisplayed();}
    public boolean isDiscountCodeSectionTitleDisplayed() {return discountCodeSectionTitle.isDisplayed();}
    public boolean isDiscountCodeSectionHintDisplayed() {return discountCodeSectionHint.isDisplayed();}
    public boolean isDiscountCodeInputFieldDisplayed() {return discountCodeInputField.isDisplayed();}
    public boolean isApplyDiscountCouponButtonDisplayed() {return applyDiscountCouponButton.isDisplayed();}
    public boolean isGiftCardSectionTitleDisplayed() {return giftCardSectionTitle.isDisplayed();}
    public boolean isGiftCardSectionHintDisplayed() {return giftCardSectionHint.isDisplayed();}
    public boolean isGiftCardCodeInputFieldDisplayed() {return giftCardCodeInputField.isDisplayed();}
    public boolean isAddGiftCardButtonDisplayed() {return addGiftCardButton.isDisplayed();}
    public boolean isEstimateShippingSectionTitleDisplayed() {return estimateShippingSectionTitle.isDisplayed();}
    public boolean isEstimateShippingSectionHintDisplayed() {return estimateShippingSectionHint.isDisplayed();}
    public boolean isShippingCountryDropdownMenuDisplayed() {return shippingCountryDropdownMenu.isDisplayed();}
    public boolean isShippingStateDropdownMenuDisplayed() {return shippingStateDropdownMenu.isDisplayed();}
    public boolean isZipCodeInputFieldDisplayed() {return zipCodeInputField.isDisplayed();}
    public boolean isEstimateShippingButtonDisplayed() {return estimateShippingButton.isDisplayed();}
    public boolean isProductSubTotalPriceDisplayed() {return productSubTotalPrice.isDisplayed();}
    public boolean isProductShippingPriceDisplayed() {return productShippingPrice.isDisplayed();}
    public boolean isProductTaxDisplayed() {return productTax.isDisplayed();}
    public boolean isProductTotalPriceDisplayed() {return productTotalPrice.isDisplayed();}
    public boolean isAgreeToTermsCheckBoxDisplayed() {return agreeToTermsCheckbox.isDisplayed();}
    public boolean isCheckoutButtonDisplayed() {return checkoutButton.isDisplayed();}

    //list elements (shopping cart table)
    public boolean isShoppingCartProductRemoveButtonDisplayed() {
        for (WebElement element : shoppingCartProductRemoveButtonElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isShoppingCartProductImageDisplayed() {
        for (WebElement element : shoppingCartProductImageElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isShoppingCartProductNameDisplayed() {
        for (WebElement element : shoppingCartProductNameElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isShoppingCartProductUnitPriceDisplayed() {
        for (WebElement element : shoppingCartProductUnitPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isShoppingCartProductQtyInputFieldDisplayed() {
        for (WebElement element : shoppingCartProductQtyInputFieldElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isShoppingCartProductTotalPriceDisplayed() {
        for (WebElement element : shoppingCartProductTotalPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
}
