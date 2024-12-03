package com.tricentis.demowebshop;

import org.junit.jupiter.api.*;

public class AddToCartProductPageTest extends TestMethods{

    //single featured product tests

    //Test 007 -> add a single featured product to cart test (as a registered user)
    @Test
    @DisplayName("Add A Single Featured Product To Cart Test (as a registered user)")
    @Tag("Add_Single_Featured_Product_To_Cart_Reg_User")
    @Tag("Add_Single_Featured_Product_To_Cart")
    void addSingleFeaturedProductToCartRegUserTest(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to register page
        userNavigationToRegisterPageTest(homePage);
        //valid user account creation test (male gender button)
        validMaleUserCreationTest(registerPage);
        //add a single featured product to cart test (as a registered user)
        addASingleFeaturedProductToCartTest();
    }

    //Test 007a -> add a single featured product to cart test (as a guest)
    @Test
    @DisplayName("Add A Single Featured Product To Cart Test (as a guest)")
    @Tag("Add_Single_Featured_Product_To_Cart_Guest")
    @Tag("Add_Single_Featured_Product_To_Cart")
    void addASingleFeaturedProductToCartGuestTest(){
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
    }

    //single available product tests

    //Test 007b -> add a single available product to cart test (as a registered user)
    @Test
    @DisplayName("Add A Single Available Product To Cart Test (as a registered user)")
    @Tag("Add_Single_Available_Product_To_Cart_Reg_User")
    @Tag("Add_Single_Available_Product_To_Cart")
    void addSingleAvailableProductToCartRegUserTest(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to register page
        userNavigationToRegisterPageTest(homePage);
        //valid user account creation test (male gender button)
        validMaleUserCreationTest(registerPage);
        //add a single available product to cart test (as a registered user)
        addASingleAvailableProductToCartTest();
    }

    //Test 007c -> add a single available product to cart test (as a guest)
    @Test
    @DisplayName("Add A Single Available Product To Cart Test (as a guest)")
    @Tag("Add_Single_Available_Product_To_Cart_Guest")
    @Tag("Add_Single_Available_Product_To_Cart")
    void addASingleAvailableProductToCartGuestTest(){
        //add a single available product to cart test (as a guest)
        addASingleAvailableProductToCartTest();
    }

    //multiple featured products addition to cart tests

    //Test 007d -> add multiple featured products to cart test (as a registered user)
    @Test
    @DisplayName("Add Multiple Featured Products To Cart Test (as a registered user)")
    @Tag("Add_Multiple_Featured_Products_To_Cart_Reg_User")
    @Tag("Add_Multiple_Featured_Products_To_Cart")
    void addMultipleFeaturedProductsToCartRegUserTest(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to register page
        userNavigationToRegisterPageTest(homePage);
        //valid user account creation test (male gender button)
        validMaleUserCreationTest(registerPage);
        //add multiple featured products to cart test (as a registered user)
        addMultipleFeaturedProductToCartTest();
    }

    //Test 007e -> add multiple featured products to cart test (as a guest)
    @Test
    @DisplayName("Add Multiple Featured Products To Cart Test (as a guest)")
    @Tag("Add_Multiple_Featured_Products_To_Cart_Guest")
    @Tag("Add_Multiple_Featured_Products_To_Cart")
    void addMultipleFeaturedProductsToCartGuestTest(){
        //add multiple featured products to cart test (as a guest)
        addMultipleFeaturedProductToCartTest();
    }

    //multiple available products addition to cart tests

    //Test 007f -> add multiple available products to cart test (as a registered user)
    @Test
    @DisplayName("Add Multiple Available Products To Cart Test (as a registered user)")
    @Tag("Add_Multiple_Available_Products_To_Cart_Reg_User")
    @Tag("Add_Multiple_Available_Products_To_Cart")
    void addMultipleAvailableProductsToCartRegUserTest(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to register page
        userNavigationToRegisterPageTest(homePage);
        //valid user account creation test (male gender button)
        validMaleUserCreationTest(registerPage);
        //add multiple available products to cart test (as a registered user)
        addMultipleAvailableProductsToCartTest();
    }
}
