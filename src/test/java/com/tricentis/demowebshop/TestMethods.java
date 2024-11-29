package com.tricentis.demowebshop;

import org.openqa.selenium.support.ui.*;
import org.slf4j.*;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.*;
import java.io.File;
import java.nio.file.*;
import java.time.Duration;

public class TestMethods extends BaseTest{

    protected static final Logger logger = LoggerFactory.getLogger(TestMethods.class);

    //navigate to register page test method
    protected void userNavigationToRegisterPageTest(HomePage homePage){
        //homepage web element assert
        isHomePageWebElementDisplayed(homePage);
        //homepage text assert
        isHomePageTextMatchExpectations(homePage);
        //general page web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //general page text assert
        isGeneralPageTextMatchExpectations(homePage);
        //aside page web element assert
        isAsidePageWebElementDisplayed(homePage);
        //homepage product data logger
        logHomePageProductsData(homePage);
        //click 'Register' header nav link
        homePage.clickRegisterHeadNavLink();
    }

    //homepage web element assert tst method
    protected void isHomePageWebElementDisplayed(HomePage homePage){
        //assert homepage community poll radio buttons are displayed (as a list)
        assertTrue(homePage.isCommunityPollRadioButtonDisplayed(), "The homepage community poll radio button isn't displayed");
        //assert homepage community poll vote button is displayed
        assertTrue(homePage.isVoteButtonDisplayed(), "The homepage community poll vote button isn't displayed");
        //assert homepage aside tag links are displayed (as a list)
        assertTrue(homePage.isAsideTagsLinkDisplayed(), "The homepage aside tags link isn't displayed");
        //assert homepage product cards are displayed (as a list)
        assertTrue(homePage.isProductCardDisplayed(), "The homepage product card isn't displayed");
        //assert homepage product names are displayed (as a list)
        assertTrue(homePage.isProductNameDisplayed(), "The homepage product name isn't displayed");
        //assert homepage product prices are displayed (as a list)
        assertTrue(homePage.isProductPriceDisplayed(), "The homepage product price isn't displayed");
        //assert homepage product 'add to cart' buttons are displayed (as a list)
        assertTrue(homePage.isAddToCartProductButtonDisplayed(), "The homepage product 'add to cart' button isn't displayed");
    }

    //general page web element assert test method
    protected void isGeneralPageWebElementDisplayed(HomePage homePage){
        //assert homepage logo is displayed
        assertTrue(homePage.isHomePageLogoDisplayed(), "The homepage logo isn't displayed");
        //assert search bar input field is displayed
        assertTrue(homePage.isSearchInputBarDisplayed(), "The search bar input field isn't displayed");
        //assert search button is displayed
        assertTrue(homePage.isSearchButtonDisplayed(), "The search button isn't displayed");
        //assert register head nav link is displayed
        assertTrue(homePage.isRegisterHeadNavLinkDisplayed(), "The register head nav link isn't displayed");
        //assert login head nav link is displayed
        assertTrue(homePage.isLoginHeadNavLinkDisplayed(), "The login head nav link isn't displayed");
        //assert shopping cart head nav link is displayed
        assertTrue(homePage.isShoppingCartHeadNavLinkDisplayed(), "The shopping cart head nav link isn't displayed");
        //assert wishlist head nav link is displayed
        assertTrue(homePage.isWishlistHeadNavLinkDisplayed(), "The wishlist head nav link isn't displayed");
        //assert books nav link is displayed
        assertTrue(homePage.isBooksNavLinkDisplayed(), "The books nav link isn't displayed");
        //assert computers nav link is displayed
        assertTrue(homePage.isComputersNavLinkDisplayed(), "The computers nav link isn't displayed");
        //assert electronics nav link is displayed
        assertTrue(homePage.isElectronicsNavLinkDisplayed(), "The electronics nav link isn't displayed");
        //assert apparel & shoes nav link is displayed
        assertTrue(homePage.isApparelShoesNavLinkDisplayed(), "The apparel & shoes nav link isn't displayed");
        //assert digital downloads nav link is displayed
        assertTrue(homePage.isDownloadsNavLinkDisplayed(), "The digital downloads nav link isn't displayed");
        //assert jewelry nav link is displayed
        assertTrue(homePage.isJewelryNavLinkDisplayed(), "The jewelry nav link isn't displayed");
        //assert gift cards nav link is displayed
        assertTrue(homePage.isGiftCardsNavLinkDisplayed(), "The gift cards nav link isn't displayed");
        //assert footer column info are displayed (as a list)
        assertTrue(homePage.isColumnInfoLinkDisplayed(), "The footer column info link isn't displayed");
        //assert footer customer service are displayed (as a list)
        assertTrue(homePage.isCustomerServiceLinkDisplayed(), "The footer customer service link isn't displayed");
        //assert footer my account link are displayed (as a list)
        assertTrue(homePage.isMyAccountLinkDisplayed(), "The footer my account link isn't displayed");
        //assert footer social media link are displayed (as a list)
        assertTrue(homePage.isSocialMediaLinkDisplayed(), "The footer social media link isn't displayed");
        //assert footer disclaimer text is displayed
        assertTrue(homePage.isDisclaimerTextDisplayed(), "The footer disclaimer text isn't displayed");
    }
    //homepage text assert test method
    protected void isHomePageTextMatchExpectations(HomePage homePage){
        //assert homepage categories aside box title matches expectations
        assertEquals("CATEGORIES", homePage.getCategoriesAsideBoxTitle(), "The homepage categories aside box title text doesn't match expectations");
        //assert homepage manufacturers aside box title matches expectations
        assertEquals("MANUFACTURERS", homePage.getManufacturersAsideBoxTitle(), "The homepage manufacturers aside box title text doesn't match expectations");
        //assert homepage tags aside box title matches expectations
        assertEquals("POPULAR TAGS", homePage.getTagsBoxTitle(), "The homepage tags aside box title text doesn't match expectations");
        //assert homepage community poll title matches expectations
        assertEquals("COMMUNITY POLL", homePage.getCommunityPollTitle(), "The homepage community poll title text doesn't match expectations");
        //assert homepage product section title matches expectations
        assertEquals("FEATURED PRODUCTS", homePage.getProductsSectionTitle(), "The homepage product section title text doesn't match expectations");
    }
    //homepage products logger method
    protected void logHomePageProductsData(HomePage homePage){
        System.out.println("Products displayed on homepage: " + "\n");
        logger.info("Product name: " + homePage.getProductName());
        logger.info("Product price: " + homePage.getProductPrice());
    }

    //general page text assert test method
    protected void isGeneralPageTextMatchExpectations(HomePage homePage){
        //assert footer column info title matches expectations
        assertEquals("INFORMATION", homePage.getColumnInfoTitle(), "The column info title text doesn't match expectations");
        //assert footer customer service title matches expectations
        assertEquals("CUSTOMER SERVICE", homePage.getCustomerServiceTitle(), "The customer service title text doesn't match expectations");
        //assert footer my account title matches expectations
        assertEquals("MY ACCOUNT", homePage.getMyAccountTitle(), "The my account title text doesn't match expectations");
        //assert footer social media title matches expectations
        assertEquals("FOLLOW US", homePage.getSocialMediaTitle(), "The social media title text doesn't match expectations");
        //assert footer disclaimer text matches expectations
        assertEquals("Copyright © 2024 Tricentis Demo Web Shop. All rights reserved.", homePage.getDisclaimerText(), "The disclaimer text doesn't match expectations");
    }

    //aside page web element assert test method
    protected void isAsidePageWebElementDisplayed(HomePage homePage){
        //assert aside newsletter input field is displayed
        assertTrue(homePage.isNewsletterInputFieldDisplayed(), "The aside newsletter input field isn't displayed");
        //assert aside newsletter button is displayed
        assertTrue(homePage.isNewsletterButtonDisplayed(), "The aside newsletter button isn't displayed");
        //assert aside manufacturers link is displayed
        assertTrue(homePage.isManufacturersLinkDisplayed(), "The aside manufacturer link isn't displayed");
        //assert aside categories link are displayed (as a list)
        assertTrue(homePage.isCategoriesLinkDisplayed(), "The aside categories link isn't displayed");
    }
}
