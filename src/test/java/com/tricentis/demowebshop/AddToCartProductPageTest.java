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
        //add a single featured product search test (as a registered user)
        addASingleFeaturedProductToCartTest();
    }

    //Test 007a -> add a single featured product to cart test (as a guest)
    @Test
    @DisplayName("Add A Single Featured Product To Cart Test (as a guest)")
    @Tag("Add_Single_Featured_Product_To_Cart_Guest")
    @Tag("Add_Single_Featured_Product_To_Cart")
    void singleFeaturedProductSearchGuestTest(){
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
    }

    //single available product tests


}
