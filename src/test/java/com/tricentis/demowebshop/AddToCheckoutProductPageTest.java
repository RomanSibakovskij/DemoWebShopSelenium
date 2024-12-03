package com.tricentis.demowebshop;

import org.junit.jupiter.api.*;

public class AddToCheckoutProductPageTest extends TestMethods{

    //single featured product tests

    //Test 008 -> add a single featured product to check out test (as a registered user)
    @Test
    @DisplayName("Add A Single Featured Product To Checkout Test (as a registered user)")
    @Tag("Add_Single_Featured_Product_To_Checkout_Reg_User")
    @Tag("Add_Single_Featured_Product_To_Checkout")
    void addSingleFeaturedProductToCheckoutRegUserTest(){
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
    }

    //Test 008a -> add a single featured product to check out test (as a guest)
    @Test
    @DisplayName("Add A Single Featured Product To Checkout Test (as a guest)")
    @Tag("Add_Single_Featured_Product_To_Checkout_Guest")
    @Tag("Add_Single_Featured_Product_To_Checkout")
    void addASingleFeaturedProductToCheckoutGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
    }

    //single available product tests

    //Test 008b -> add a single available product to check out test (as a registered user)
    @Test
    @DisplayName("Add A Single Available Product To Checkout Test (as a registered user)")
    @Tag("Add_Single_Available_Product_To_Checkout_Reg_User")
    @Tag("Add_Single_Available_Product_To_Checkout")
    void addSingleAvailableProductToCheckoutRegUserTest(){
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
    }

    //Test 008c -> add a single available product to check out test (as a guest)
    @Test
    @DisplayName("Add A Single Available Product To Checkout Test (as a guest)")
    @Tag("Add_Single_Available_Product_To_Checkout_Guest")
    @Tag("Add_Single_Available_Product_To_Checkout")
    void addASingleAvailableProductToCheckoutGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single available product to cart test (as a guest)
        addASingleAvailableProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
    }

}
