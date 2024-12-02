package com.tricentis.demowebshop;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.util.*;

public class SearchProductPage extends BasePage{

    //search page web elements
    @FindBy(xpath = "//div[@class='page-title']/h1")
    private WebElement searchPageTitle;
    @FindBy(xpath = "//div[@class='search-input']//label[.=('Search keyword:')]")
    private WebElement searchKeywordLabel;
    @FindBy(xpath = "//div[@class='search-input']//input[@id='Q']")
    private WebElement searchKeywordBar;
    @FindBy(xpath = "//div[@class='search-input']//input[@value='Search']")
    private WebElement searchButton;
    @FindBy(xpath = "//div[@class='search-input']//input[@id='As']")
    private WebElement advancedSearchCheckbox;
    @FindBy(xpath = "//div[@class='product-sorting']//select[@id='products-orderby']")
    private WebElement searchSortByDropdownMenu;
    @FindBy(xpath = "//div[@class='product-page-size']//select[@id='products-pagesize']")
    private WebElement searchDisplayCountDropdownSelector;
    @FindBy(xpath = "//div[@class='product-viewmode']//select[@id='products-viewmode']")
    private WebElement viewAsDropdownSelector;
    //searched products section
    @FindBy(xpath = "//div[@class='product-grid']/div[@class='item-box']")
    private List<WebElement> searchProductCardElements;
    private List<WebElement> searchProductNameElements = driver.findElements(By.xpath("//div[@class='item-box']//h2/a"));
    @FindBy(xpath = "//div[@class='item-box']//div[@class='rating']")
    private List<WebElement> searchProductReviewStarsElements;
    @FindBy(xpath = "//div[@class='item-box']//div[@class='prices']")
    private List<WebElement> searchProductUnitPriceElements;
    private List<WebElement> searchProductAddToCartButtonElements = driver.findElements(By.xpath("//div[@class='item-box']//input[@value='Add to cart']"));

    public SearchProductPage(WebDriver driver) {super(driver);}

    //search product page web element assert methods
    public boolean isSearchProductPageTitleDisplayed() {return searchPageTitle.isDisplayed();}
    public boolean isSearchKeywordLabelDisplayed() {return searchKeywordLabel.isDisplayed();}
    public boolean isSearchKeywordInputBarDisplayed() {return searchKeywordBar.isDisplayed();}
    public boolean isSearchButtonDisplayed() {return searchButton.isDisplayed();}
    public boolean isAdvancedSearchDisplayed() {return advancedSearchCheckbox.isDisplayed();}
    public boolean isSearchSortByDropdownDisplayed() {return searchSortByDropdownMenu.isDisplayed();}
    public boolean isSearchDisplayCountDropdownDisplayed() {return searchDisplayCountDropdownSelector.isDisplayed();}
    public boolean isViewAsDropdownDisplayed() {return viewAsDropdownSelector.isDisplayed();}

    public boolean isSearchProductCardDisplayed() {
        for (WebElement element : searchProductCardElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isSearchProductNameDisplayed() {
        for (WebElement element : searchProductNameElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isSearchProductReviewStarsDisplayed() {
        for (WebElement element : searchProductReviewStarsElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isSearchProductUnitPriceDisplayed() {
        for (WebElement element : searchProductUnitPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isSearchProductAddToCartButtonDisplayed() {
        for (WebElement element : searchProductAddToCartButtonElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
}
