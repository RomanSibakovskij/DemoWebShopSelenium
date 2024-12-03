package com.tricentis.demowebshop;

import org.junit.jupiter.api.*;

public class AddToCheckoutProductPageTest extends TestMethods{

    //single featured product tests

    //Test 008 -> add a single featured product to check out test (as a registered user)
    @Test
    @DisplayName("Add A Single Featured Product To Checkout Test (as a registered user)")
    @Tag("Add_Single_Featured_Product_To_Checkout_Reg_User")
    @Tag("Add_Single_Featured_Product_To_Checkout")
    void addSingleFeaturedProductToCartRegUserTest(){
        HomePage homePage = new HomePage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to register page
        userNavigationToRegisterPageTest(homePage);
        //valid user account creation test (male gender button)
        validMaleUserCreationTest(registerPage);
        //add a single featured product to cart test (as a registered user)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to checkout test (as a registered user)
        addSingleFeaturedProductToCheckoutTest(shoppingCartPage);
    }

}
