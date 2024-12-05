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

    //multiple available products

    //Test 009f -> check out confirmation of multiple available products test (as a registered user)
    @Test
    @DisplayName("Checkout Confirmation Of Multiple Available Products Test (as a registered user)")
    @Tag("Multiple_Available_Products_Checkout_Confirmation_Reg_User")
    @Tag("Multiple_Available_Products_Checkout_Confirmation")
    void multipleAvailableProductsCheckoutConfirmationRegUserTest(){
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
        //check out confirmation of a multiple available products test (as a registered user) //this test method is universal for all product types
        validRegUserCheckoutConfirmationTest();
    }

    //Test 009g -> check out confirmation of multiple available products test (as a guest)
    @Test
    @DisplayName("Checkout Confirmation Of Multiple Available Products Test (as a guest)")
    @Tag("Multiple_Available_Products_Checkout_Confirmation_Guest")
    @Tag("Multiple_Available_Products_Checkout_Confirmation")
    void multipleAvailableProductsCheckoutConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add multiple available products to cart test (as a guest)
        addMultipleAvailableProductsToCartTest();
        //add multiple available products to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //check out confirmation of multiple available products test (as a guest) //this test method is universal for all product types
        validGuestCheckoutConfirmationTest();
    }

    // 'Check Money' order payment method tests

    //Test 009h -> check out confirmation of a single product test - with 'Check/Money Order' payment method (as a registered user)
    @Test
    @DisplayName("Checkout Confirmation Of A Product Test (as a registered user - 'Check/Money Order' payment method)")
    @Tag("Single_Product_Checkout_Confirmation_Reg_User")
    @Tag("Single_Product_Checkout_Confirmation")
    @Tag("Check_Money_Payment_Method")
    void singleProductCheckoutCheckMoneyConfirmationRegUserTest(){
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
        //check out confirmation of a single product test (as a registered user - with selected 'Check/Money Order' payment method)
        validRegUserCheckoutCheckMoneyConfirmationTest();
    }

    //Test 009i -> check out confirmation of multiple products test (as a guest - with selected 'Check/Money Order' payment method)
    @Test
    @DisplayName("Checkout Confirmation Of Multiple Products Test (as a guest - 'Check/Money Order' payment method)")
    @Tag("Multiple_Products_Checkout_Confirmation_Guest")
    @Tag("Multiple_Products_Checkout_Confirmation")
    @Tag("Check_Money_Payment_Method")
    void multipleProductsCheckoutCheckMoneyConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add multiple featured products to cart test (as a guest)
        addMultipleFeaturedProductToCartTest();
        //add multiple featured products to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //check out confirmation of multiple products test (as a guest - with selected 'Check/Money Order' payment method)
        validGuestCheckoutCheckMoneyConfirmationTest();
    }

    //'Credit Card' payment method tests

    //Test 009j -> check out confirmation of a single product test (as a registered user - with 'Credit Card' payment method)
    @Test
    @DisplayName("Checkout Confirmation Of A Single Product Test (as a registered user ('Credit Card' payment method))")
    @Tag("Single_Product_Checkout_Confirmation_Reg_User")
    @Tag("Single_Product_Checkout_Confirmation")
    @Tag("Credit_Card_Payment_Method")
    void singleProductCheckoutWithCreditCardConfirmationRegUserTest(){
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
        //check out confirmation of a single product test (as a registered user - with 'Credit Card' payment method)
        validRegUserCheckoutCreditCardConfirmationTest();
    }

    //Test 009k -> check out confirmation of multiple available products test (as a guest - with 'Credit Card' payment method)
    @Test
    @DisplayName("Checkout Confirmation Of Multiple Products Test (as a guest ('Credit Card' payment method))")
    @Tag("Multiple_Products_Checkout_Confirmation_Guest")
    @Tag("Multiple_Products_Checkout_Confirmation")
    @Tag("Credit_Card_Payment_Method")
    void multipleProductsCheckoutWithCreditCardConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add multiple available products to cart test (as a guest)
        addMultipleAvailableProductsToCartTest();
        //add multiple available products to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //check out confirmation of multiple products test (as a guest - with 'Credit Card' payment method) //this test method is universal for all product types
        validGuestCheckoutCreditCardConfirmationTest();
    }

    //'Purchase Order' payment method tests

    //Test 009l -> check out confirmation of a single product test (as a registered user - with 'Purchase Order' payment method)
    @Test
    @DisplayName("Checkout Confirmation Of A Single Product Test (as a registered user ('Purchase Order' payment method))")
    @Tag("Single_Product_Checkout_Confirmation_Reg_User")
    @Tag("Single_Product_Checkout_Confirmation")
    @Tag("Purchase_Order_Payment_Method")
    void singleProductCheckoutPurchaseOrderConfirmationRegUserTest(){
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
        //check out confirmation of a single available product test (as a registered user - with 'Purchase Order' payment method)
        validRegUserCheckoutPurchaseOrderConfirmationTest();
    }

    //Test 009m -> check out confirmation of a single product test (as a guest - with 'Purchase Order' payment method)
    @Test
    @DisplayName("Checkout Confirmation Of A Single Product Test (as a guest ('Purchase Order' payment method))")
    @Tag("Single_Product_Checkout_Confirmation_Guest")
    @Tag("Single_Product_Checkout_Confirmation")
    @Tag("Purchase_Order_Payment_Method")
    void singleProductCheckoutPurchaseOrderConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //check out confirmation of a single featured product test (as a guest - with 'Purchase Order' payment method)
        validGuestCheckoutPurchaseOrderConfirmationTest();
    }

    //negative checkout confirmation tests (since guest starts with all empty input fields, it's more prudent to test guest branch only -> reg user will have the same output)

    //Test 009n -> invalid check out confirmation test - no first name (as a guest)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - No First Name (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("No_Singular_Input")
    void invalidSingleProductCheckoutNoFirstNameConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - no first name (as a guest)
        invalidGuestCheckoutNoFirstNameConfirmationTest();
    }

    //Test 009o -> invalid check out confirmation test - no last name (as a guest)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - No Last Name (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("No_Singular_Input")
    void invalidSingleProductCheckoutNoLastNameConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - no last name (as a guest)
        invalidGuestCheckoutNoLastNameConfirmationTest();
    }

    //Test 009p -> invalid check out confirmation test - no email address (as a guest)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - No Email (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("No_Singular_Input")
    void invalidSingleProductCheckoutNoEmailConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - no email (as a guest)
        invalidGuestCheckoutNoEmailConfirmationTest();
    }
}
