package com.tricentis.demowebshop;

import org.junit.jupiter.api.*;

public class ConfirmCheckoutPageTest extends TestMethods {

    //valid checkout confirmation tests

    //single featured product

    //Test 009 -> check out confirmation of a single featured product test (as a registered user)
    @Test
    @DisplayName("Checkout Confirmation Of A Single Featured Product Test (as a registered user)")
    @Tag("Single_Featured_Product_Checkout_Confirmation_Reg_User")
    @Tag("Single_Featured_Product_Checkout_Confirmation")
    void singleFeaturedProductCheckoutConfirmationRegUserTest(){
        HomePage homePage = new HomePage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to register page
        userNavigationToRegisterPageTest(homePage);
        //valid user account creation test (male gender button)
        validMaleUserCreationTest(registerPage);
        //add a single featured product to cart test (as a registered user)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a registered user) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutTest(shoppingCartPage);
        //check out confirmation of a single featured product test (as a registered user) //this test method is universal for all product types
        validRegUserCheckoutConfirmationTest();
    }

    //Test 009a -> check out confirmation of a single featured product test (as a guest)
    @Test
    @DisplayName("Checkout Confirmation Of A Single Featured Product Test (as a guest)")
    @Tag("Single_Featured_Product_Checkout_Confirmation_Guest")
    @Tag("Single_Featured_Product_Checkout_Confirmation")
    void singleFeaturedProductCheckoutConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //check out confirmation of a single featured product test (as a guest) //this test method is universal for all product types
        validGuestCheckoutConfirmationTest();
    }

    //single available product

    //Test 009b -> check out confirmation of a single available product test (as a registered user)
    @Test
    @DisplayName("Checkout Confirmation Of A Single Available Product Test (as a registered user)")
    @Tag("Single_Available_Product_Checkout_Confirmation_Reg_User")
    @Tag("Single_Available_Product_Checkout_Confirmation")
    void singleAvailableProductCheckoutConfirmationRegUserTest(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //user navigation to register page
        userNavigationToRegisterPageTest(homePage);
        //valid user account creation test (male gender button)
        validMaleUserCreationTest(registerPage);
        //add a single available product to cart test (as a registered user)
        addASingleAvailableProductToCartTest();
        //add a single available product to check out test (as a registered user) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutTest(shoppingCartPage);
        //check out confirmation of a single available product test (as a registered user) //this test method is universal for all product types
        validRegUserCheckoutConfirmationTest();
    }

    //Test 009c -> check out confirmation of a single available product test (as a guest)
    @Test
    @DisplayName("Checkout Confirmation Of A Single Available Product Test (as a guest)")
    @Tag("Single_Available_Product_Checkout_Confirmation_Guest")
    @Tag("Single_Available_Product_Checkout_Confirmation")
    void singleAvailableProductCheckoutConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single available product to cart test (as a guest)
        addASingleAvailableProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //check out confirmation of a single available product test (as a guest) //this test method is universal for all product types
        validGuestCheckoutConfirmationTest();
    }

    //multiple featured products

    //Test 009d -> check out confirmation of multiple featured products test (as a registered user)
    @Test
    @DisplayName("Checkout Confirmation Of Multiple Featured Products Test (as a registered user)")
    @Tag("Multiple_Featured_Products_Checkout_Confirmation_Reg_User")
    @Tag("Multiple_Featured_Products_Checkout_Confirmation")
    void multipleFeaturedProductsCheckoutConfirmationRegUserTest(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //user navigation to register page
        userNavigationToRegisterPageTest(homePage);
        //valid user account creation test (male gender button)
        validMaleUserCreationTest(registerPage);
        //add multiple featured products to cart test (as a registered user)
        addMultipleFeaturedProductToCartTest();
        //add multiple featured products to check out test (as a registered user) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutTest(shoppingCartPage);
        //check out confirmation of a multiple featured products test (as a registered user) //this test method is universal for all product types
        validRegUserCheckoutConfirmationTest();
    }

    //Test 009e -> check out confirmation of multiple featured products test (as a guest)
    @Test
    @DisplayName("Checkout Confirmation Of Multiple Featured Products Test (as a guest)")
    @Tag("Multiple_Featured_Products_Checkout_Confirmation_Guest")
    @Tag("Multiple_Featured_Products_Checkout_Confirmation")
    void multipleFeaturedProductsCheckoutConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add multiple featured products to cart test (as a guest)
        addMultipleFeaturedProductToCartTest();
        //add multiple featured products to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //check out confirmation of multiple featured products test (as a guest) //this test method is universal for all product types
        validGuestCheckoutConfirmationTest();
    }
}
