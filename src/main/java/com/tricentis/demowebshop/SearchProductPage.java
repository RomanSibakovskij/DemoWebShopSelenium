package com.tricentis.demowebshop;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
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
    @FindBy(xpath = "//div[@class='item-box']//h2/a")
    private WebElement singleSearchProductName;
    @FindBy(xpath = "//div[@class='item-box']//h2/a")
    private List<WebElement> searchProductNameElements;
    @FindBy(xpath = "//div[@class='item-box']//div[@class='rating']")
    private List<WebElement> searchProductReviewStarsElements;
    @FindBy(xpath = "//div[@class='item-box']//div[@class='prices']")
    private WebElement singleSearchProductUnitPrice;
    @FindBy(xpath = "//div[@class='item-box']//div[@class='prices']")
    private List<WebElement> searchProductUnitPriceElements;
    private List<WebElement> searchProductAddToCartButtonElements = driver.findElements(By.xpath("//div[@class='item-box']//input[@value='Add to cart']"));

    //single available product data
    private String singleAvailableProductName = TestDataGenerator.pickRandomAvailableProduct();

    public SearchProductPage(WebDriver driver) {super(driver);}

    //search page bar input query method
    public void inputSingleAvailableProductSearchQueryIntoSearchBar(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(searchKeywordBar));
        searchKeywordBar.clear();
        searchKeywordBar.sendKeys(singleAvailableProductName);
    }

    //click 'Search' button method
    public void clickSearchButton(){searchButton.click();}

    //search product page title getter
    public String getSearchProductPageTitle() {return searchPageTitle.getText();}
    //search product page keyword label getter
    public String getSearchKeywordLabel() {return searchKeywordLabel.getText();}

    //single searched product name getter
    public String getSingleSearchedProductName() {return singleSearchProductName.getText();}
    //single searched product unit price getter
    public String getSingleSearchedProductUnitPrice(){return singleSearchProductUnitPrice.getText();}

    //single searched available product name getter
    public String getSingleAvailableProductName(){return singleAvailableProductName;}

    //multiple searched product names getter
    public List<String> getSearchedProductNames() {
        List<String> productName = new ArrayList<>();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.visibilityOfAllElements(searchProductNameElements));

        for (WebElement element : searchProductNameElements) {
            productName.add(element.getText());
        }
        return productName;
    }

    //multiple searched product unit prices getter
    public List<String> getSearchedProductPrices() {
        List<String> productName = new ArrayList<>();
        for (WebElement element : searchProductUnitPriceElements) {
            productName.add(element.getText());
        }
        return productName;
    }

    //search product page web element assert methods
    public boolean isSearchProductPageTitleDisplayed() {return searchPageTitle.isDisplayed();}
    public boolean isSearchKeywordLabelDisplayed() {return searchKeywordLabel.isDisplayed();}
    public boolean isSearchKeywordInputBarDisplayed() {return searchKeywordBar.isDisplayed();}
    public boolean isSearchButtonDisplayed() {return searchButton.isDisplayed();}
    public boolean isAdvancedSearchCheckboxDisplayed() {return advancedSearchCheckbox.isDisplayed();}
    public boolean isSearchSortByDropdownMenuDisplayed() {return searchSortByDropdownMenu.isDisplayed();}
    public boolean isSearchDisplayCountDropdownMenuDisplayed() {return searchDisplayCountDropdownSelector.isDisplayed();}
    public boolean isViewAsDropdownMenuDisplayed() {return viewAsDropdownSelector.isDisplayed();}

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
