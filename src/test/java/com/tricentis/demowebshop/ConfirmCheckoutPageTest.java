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
}
