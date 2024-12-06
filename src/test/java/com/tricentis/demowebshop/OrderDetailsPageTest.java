package com.tricentis.demowebshop;

import org.junit.jupiter.api.*;

public class OrderDetailsPageTest extends TestMethods{

    //Test 010 -> order details validation of a single featured product test (as a registered user)
    @Test
    @DisplayName("Order Details Validation Of A Single Featured Product Test (as a registered user)")
    @Tag("Single_Featured_Product_Order_Validation_Reg_User")
    @Tag("Single_Featured_Product_Order_Validation")
    void singleFeaturedProductCheckoutConfirmationRegUserTest(){
        HomePage homePage = new HomePage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        OrderDetailsPage orderDetailsPage = new OrderDetailsPage(driver);
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
        //order validation test
        submittedOrderValidationTest(orderDetailsPage);
    }

}
