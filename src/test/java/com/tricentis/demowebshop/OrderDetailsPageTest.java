package com.tricentis.demowebshop;

import org.junit.jupiter.api.*;

public class OrderDetailsPageTest extends TestMethods{

    //Test 010 -> order details validation of a single featured product test (as a registered user)
    @Test
    @DisplayName("Order Details Validation Of A Single Featured Product Test (as a registered user)")
    @Tag("Single_Featured_Product_Order_Validation_Reg_User")
    @Tag("Single_Featured_Product_Order_Validation")
    void singleFeaturedProductOrderValidationRegUserTest(){
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
        //order validation test //this test method is universal for all product types
        submittedOrderValidationTest();
    }

    //Test 010a ->  order details validation of a single featured product test (as a guest)
    @Test
    @DisplayName("Order Details Validation Of A Single Featured Product Test (as a guest)")
    @Tag("Single_Featured_Product_Order_Validation_Guest")
    @Tag("Single_Featured_Product_Order_Validation")
    void singleFeaturedProductOrderValidationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //check out confirmation of a single featured product test (as a guest) //this test method is universal for all product types
        validGuestCheckoutConfirmationTest();
        //order validation test //this test method is universal for all product types
        submittedOrderValidationTest();
    }

    //single available product

    //Test 010b -> order details validation of a single available product test (as a registered user)
    @Test
    @DisplayName("Order Details Validation Of A Single Available Product Test (as a registered user)")
    @Tag("Single_Available_Product_Order_Validation_Reg_User")
    @Tag("Single_Available_Product_Order_Validation")
    void singleAvailableProductOrderValidationRegUserTest(){
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
        //order validation test //this test method is universal for all product types
        submittedOrderValidationTest();
    }

    //Test 010c -> order details validation of a single available product test (as a guest)
    @Test
    @DisplayName("Order Details Validation Of A Single Available Product Test (as a guest)")
    @Tag("Single_Available_Product_Order_Validation_Guest")
    @Tag("Single_Available_Product_Order_Validation")
    void singleAvailableProductOrderValidationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single available product to cart test (as a guest)
        addASingleAvailableProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //check out confirmation of a single available product test (as a guest) //this test method is universal for all product types
        validGuestCheckoutConfirmationTest();
        //order validation test //this test method is universal for all product types
        submittedOrderValidationTest();
    }

    //multiple featured products

    //Test 010d -> order details validation of multiple featured products test (as a registered user)
    @Test
    @DisplayName("Order Details Validation Of Multiple Featured Products Test (as a registered user)")
    @Tag("Multiple_Featured_Products_Order_Validation_Reg_User")
    @Tag("Multiple_Featured_Products_Order_Validation")
    void multipleFeaturedProductsOrderValidationRegUserTest(){
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
        //order validation test //this test method is universal for all product types
        submittedOrderValidationTest();
    }

    //Test 010e -> order details validation of multiple featured products test (as a guest)
    @Test
    @DisplayName("Order Details Validation Of Multiple Featured Products Test (as a guest)")
    @Tag("Multiple_Featured_Products_Order_Validation_Guest")
    @Tag("Multiple_Featured_Products_Order_Validation")
    void multipleFeaturedProductsOrderValidationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add multiple featured products to cart test (as a guest)
        addMultipleFeaturedProductToCartTest();
        //add multiple featured products to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //check out confirmation of multiple featured products test (as a guest) //this test method is universal for all product types
        validGuestCheckoutConfirmationTest();
        //order validation test //this test method is universal for all product types
        submittedOrderValidationTest();
    }
}
