package com.tricentis.demowebshop;

import org.junit.jupiter.api.*;

public class AddToCheckoutProductPageTest extends TestMethods{

    //single featured product addition to check out tests

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

    //single available product addition to check out tests

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

    //invalid product addition to check out method test

    //Test 008d -> invalid 'Add a single available product to check out' without clicking 'Agree to Terms' checkbox test (as a guest)
    @Test
    @DisplayName("Invalid Add A Single Available Product To Checkout Without Click On Agree To Terms Checkbox Test (as a guest)")
    @Tag("Add_Single_Available_Product_To_Checkout_Guest")
    @Tag("Add_Single_Available_Product_To_Checkout")
    @Tag("Invalid_Add_Product_To_Checkout")
    void addASingleAvailableProductToCheckoutWithoutAgreeToTermsGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single available product to cart test (as a guest)
        addASingleAvailableProductToCartTest();
        //invalid 'Add a single featured product to check out' without clicking 'Agree to Terms' checkbox test (as a guest)
        invalidAddProductToCheckoutAsGuestNoAgreeToTermsTest(shoppingCartPage);
    }

    //multiple featured products addition to check out tests

    //Test 008e -> add multiple featured products to check out test (as a registered user)
    @Test
    @DisplayName("Add Multiple Featured Products To Checkout Test (as a registered user)")
    @Tag("Add_Multiple_Featured_Products_To_Checkout_Reg_User")
    @Tag("Add_Multiple_Featured_Products_To_Checkout")
    void addMultipleFeaturedProductsToCheckoutRegUserTest(){
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
    }

    //Test 008f -> add multiple featured products to check out test (as a guest)
    @Test
    @DisplayName("Add Multiple Featured Products To Checkout Test (as a guest)")
    @Tag("Add_Multiple_Featured_Products_To_Checkout_Guest")
    @Tag("Add_Multiple_Featured_Products_To_Checkout")
    void addMultipleFeaturedProductsToCheckoutGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add multiple featured products to cart test (as a guest)
        addMultipleFeaturedProductToCartTest();
        //add multiple featured products to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
    }

    //multiple available products addition to check out tests

    //Test 008g -> add multiple available products to check out test (as a registered user)
    @Test
    @DisplayName("Add Multiple Available Products To Checkout Test (as a registered user)")
    @Tag("Add_Multiple_Available_Products_To_Checkout_Reg_User")
    @Tag("Add_Multiple_Available_Products_To_Checkout")
    void addMultipleAvailableProductsToCheckoutRegUserTest(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //user navigation to register page
        userNavigationToRegisterPageTest(homePage);
        //valid user account creation test (male gender button)
        validMaleUserCreationTest(registerPage);
        //add multiple available products to cart test (as a registered user)
        addMultipleAvailableProductsToCartTest();
        //add multiple available products to check out test (as a registered user) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutTest(shoppingCartPage);
    }

    //Test 008h -> add multiple available products to check out test (as a guest)
    @Test
    @DisplayName("Add Multiple Available Products To Checkout Test (as a guest)")
    @Tag("Add_Multiple_Available_Products_To_Checkout_Guest")
    @Tag("Add_Multiple_Available_Products_To_Checkout")
    void addMultipleAvailableProductsToCheckoutGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add multiple available products to cart test (as a guest)
        addMultipleAvailableProductsToCartTest();
        //add multiple available products to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
    }

    //Test 008i -> add multiple available products to check out test (as a guest => with Remove product from checkout function test)
    @Test
    @DisplayName("Add Multiple Available Products To Checkout [with Remove Product From Cart] Test (as a guest)")
    @Tag("Add_Multiple_Available_Products_To_Checkout_Guest")
    @Tag("Add_Multiple_Available_Products_To_Checkout")
    @Tag("Remove_Set_Product_From_Checkout")
    void addMultipleAvailableProductsToCheckoutGuestWithProductRemovalTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add multiple available products to cart test (as a guest)
        addMultipleAvailableProductsToCartTest();
        //add multiple available products to check out test (as a guest) => with product removal from checkout
        addProductToCheckoutAsGuestWithProductRemovalTest(shoppingCartPage);
    }
}
