package com.tricentis.demowebshop;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;

public class HomePage extends BasePage{

    //home page header web elements  (general page elements)
    @FindBy(xpath = "//div[@class='header-logo']//img")
    private WebElement homePageLogo;
    @FindBy(xpath = "//div[@class='search-box']//input[@id='small-searchterms']")
    private WebElement searchInputBar;
    @FindBy(xpath = "//div[@class='search-box']//input[@type='submit']")
    private WebElement searchButton;
    //header nav link elements  (general page elements)
    @FindBy(xpath = "//div[@class='header-links']/ul/li[1]")
    private WebElement registerHeadNavLink;
    @FindBy(xpath = "//div[@class='header-links']/ul/li[2]")
    private WebElement loginHeadNavLink;
    @FindBy(xpath = "//div[@class='header-links']/ul/li[3]")
    private WebElement shoppingCartHeadNavLink;
    @FindBy(xpath = "//div[@class='header-links']/ul/li[4]")
    private WebElement wishlistHeadNavLink;
    //navbar link elements  (general page elements)
    @FindBy(xpath = "//ul[@class='top-menu']/li[1]")
    private WebElement booksNavLink;
    @FindBy(xpath = "//ul[@class='top-menu']/li[2]")
    private WebElement computersNavLink;
    @FindBy(xpath = "//ul[@class='top-menu']/li[3]")
    private WebElement electronicsNavLink;
    @FindBy(xpath = "//ul[@class='top-menu']/li[4]")
    private WebElement apparelShoesNavLink;
    @FindBy(xpath = "//ul[@class='top-menu']/li[5]")
    private WebElement downloadsNavLink;
    @FindBy(xpath = "//ul[@class='top-menu']/li[6]")
    private WebElement jewelryNavLink;
    @FindBy(xpath = "//ul[@class='top-menu']/li[7]")
    private WebElement giftCardsNavLink;
    //aside menu elements
    @FindBy(xpath = "//div[@class='block block-category-navigation']//strong")
    private WebElement categoriesSectionTitle;
    private List<WebElement> categoriesAsideLinkElements = driver.findElements(By.xpath("//div[@class='block block-category-navigation']//ul/li"));
    @FindBy(xpath = "//div[@class='block block-manufacturer-navigation']//strong")
    private WebElement manufacturersSectionTitle;
    @FindBy(xpath = "//div[@class='block block-manufacturer-navigation']//ul/li")
    private WebElement manufacturersAsideLink;
    @FindBy(xpath = "//div[@class='block block-popular-tags']//strong")
    private WebElement tagsSectionTitle;
    private List<WebElement> tagsAsideLinkElements = driver.findElements(By.xpath("//div[@class='tags']//ul/li"));
    ///newsletter box  (general page elements)
    @FindBy(xpath = "//div[@id='newsletter-subscribe-block']//input[@id='newsletter-email']")
    private WebElement newsLetterInputField;
    @FindBy(xpath = "//div[@id='newsletter-subscribe-block']//input[@id='newsletter-subscribe-button']")
    private WebElement newsLetterButton;
    //community poll box
    @FindBy(xpath = "//div[@class='block block-poll']//strong[.='Community poll']")
    private WebElement communityPollTitle;
    private List<WebElement> communityPollOptionElements = driver.findElements(By.xpath("//ul[@class='poll-options']/li/input"));
    @FindBy(xpath = "//div[@class='block block-poll']//input[@id='vote-poll-1']")
    private WebElement voteButton;
    //homepage main section elements
    @FindBy(xpath = "//div[@class='product-grid home-page-product-grid']//strong")
    private WebElement productSectionTitle;
    private List<WebElement> productCardElements = driver.findElements(By.xpath("//div[@class='page-body']//div[@class='product-item']"));
    @FindBy(xpath = "//div[@class='page-body']//h2[@class='product-title']")
    private List<WebElement> productNameElements;
    @FindBy(xpath = "//div[@class='page-body']//span[@class='price actual-price']")
    private List<WebElement> productPriceElements;
    private List<WebElement> productAddToCartButtonElements = driver.findElements(By.xpath("//div[@class='page-body']//input[@type='button']"));
    //footer elements (general page elements)
    @FindBy(xpath = "//div[@class='column information']/h3")
    private WebElement columnInfoTitle;
    private List<WebElement> columnInfoLinkElements = driver.findElements(By.xpath("//div[@class='column information']//ul/li"));
    @FindBy(xpath = "//div[@class='column customer-service']/h3")
    private WebElement customerServiceTitle;
    private List<WebElement> customerServiceLinkElements = driver.findElements(By.xpath("//div[@class='column customer-service']//ul/li"));
    @FindBy(xpath = "//div[@class='column my-account']/h3")
    private WebElement myAccountTitle;
    private List<WebElement> myAccountLinkElements = driver.findElements(By.xpath("//div[@class='column my-account']//ul/li"));
    @FindBy(xpath = "//div[@class='column follow-us']/h3")
    private WebElement socialMediaTitle;
    private List<WebElement> socialMediaLinkElements = driver.findElements(By.xpath("//div[@class='column follow-us']//ul/li"));
    @FindBy(xpath = "//div[@class='footer-disclaimer']")
    private WebElement disclaimerText;

    public HomePage(WebDriver driver) {super(driver);}

    //homepage product data getters
    public List<String> getProductName() {
        List<String> productName = new ArrayList<>();
        for (WebElement element : productNameElements) {
            productName.add(element.getText());
        }
        return productName;
    }
    public List<String> getProductPrice() {
        List<String> productPrice = new ArrayList<>();
        for (WebElement element : productPriceElements) {
            productPrice.add(element.getText());
        }
        return productPrice;
    }

    //click 'Register' link method
    public void clickRegisterHeadNavLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.elementToBeClickable(registerHeadNavLink));
        registerHeadNavLink.click();
    }

    //register nav link text getter
    public String getRegisterHeadNavLinkText(){return registerHeadNavLink.getText();}

    //click 'Login' link method
    public void clickLoginHeadNavLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.elementToBeClickable(loginHeadNavLink));
        loginHeadNavLink.click();
    }

    //categories box title getter
    public String getCategoriesAsideBoxTitle(){return categoriesSectionTitle.getText();}
    //manufacturers box title getter
    public String getManufacturersAsideBoxTitle(){return manufacturersSectionTitle.getText();}
    //tags box title getter
    public String getTagsBoxTitle(){return tagsSectionTitle.getText();}

    //community poll title getter
    public String getCommunityPollTitle(){return communityPollTitle.getText();}

    //homepage products section title getter
    public String getProductsSectionTitle(){return productSectionTitle.getText();}

    //footer getters
    //column info title getter
    public String getColumnInfoTitle(){return columnInfoTitle.getText();}
    //customer service title getter
    public String getCustomerServiceTitle(){return customerServiceTitle.getText();}
    //my account title getter
    public String getMyAccountTitle(){return myAccountTitle.getText();}
    //social media title getter
    public String getSocialMediaTitle(){return socialMediaTitle.getText();}
    //disclaimer text getter
    public String getDisclaimerText(){return disclaimerText.getText();}

    //general page web elements assert methods (elements that all pages have - header / footer)
    public boolean isHomePageLogoDisplayed(){return homePageLogo.isDisplayed();}
    public boolean isSearchInputBarDisplayed(){return searchInputBar.isDisplayed();}
    public boolean isSearchButtonDisplayed(){return searchButton.isDisplayed();}
    public boolean isRegisterHeadNavLinkDisplayed(){return registerHeadNavLink.isDisplayed();}
    public boolean isLoginHeadNavLinkDisplayed(){return loginHeadNavLink.isDisplayed();}
    public boolean isShoppingCartHeadNavLinkDisplayed(){return shoppingCartHeadNavLink.isDisplayed();}
    public boolean isWishlistHeadNavLinkDisplayed(){return wishlistHeadNavLink.isDisplayed();}
    public boolean isBooksNavLinkDisplayed(){return booksNavLink.isDisplayed();}
    public boolean isComputersNavLinkDisplayed(){return computersNavLink.isDisplayed();}
    public boolean isElectronicsNavLinkDisplayed(){return electronicsNavLink.isDisplayed();}
    public boolean isApparelShoesNavLinkDisplayed(){return apparelShoesNavLink.isDisplayed();}
    public boolean isDownloadsNavLinkDisplayed(){return downloadsNavLink.isDisplayed();}
    public boolean isJewelryNavLinkDisplayed(){return jewelryNavLink.isDisplayed();}
    public boolean isGiftCardsNavLinkDisplayed(){return giftCardsNavLink.isDisplayed();}
    public boolean isDisclaimerTextDisplayed(){return disclaimerText.isDisplayed();}

    public boolean isColumnInfoLinkDisplayed() {
        for (WebElement element : columnInfoLinkElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isCustomerServiceLinkDisplayed() {
        for (WebElement element : customerServiceLinkElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isMyAccountLinkDisplayed() {
        for (WebElement element : myAccountLinkElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isSocialMediaLinkDisplayed() {
        for (WebElement element : socialMediaLinkElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

    //aside web element assert methods (not all pages have them)
    public boolean isNewsletterInputFieldDisplayed() {return newsLetterInputField.isDisplayed();}
    public boolean isNewsletterButtonDisplayed() {return newsLetterButton.isDisplayed();}
    public boolean isManufacturersLinkDisplayed() {return manufacturersAsideLink.isDisplayed();}

    public boolean isCategoriesLinkDisplayed() {
        for (WebElement element : categoriesAsideLinkElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

    //homepage web element assert methods
    public boolean isVoteButtonDisplayed() {return voteButton.isDisplayed();}

    public boolean isCommunityPollRadioButtonDisplayed() {
        for (WebElement element : communityPollOptionElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isAsideTagsLinkDisplayed() {
        for (WebElement element : tagsAsideLinkElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductCardDisplayed() {
        for (WebElement element : productCardElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductNameDisplayed() {
        for (WebElement element : productNameElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductPriceDisplayed() {
        for (WebElement element : productPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isAddToCartProductButtonDisplayed() {
        for (WebElement element : productAddToCartButtonElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
}
