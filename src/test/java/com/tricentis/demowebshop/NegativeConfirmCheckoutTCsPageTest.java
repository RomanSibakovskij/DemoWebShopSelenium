package com.tricentis.demowebshop;

import org.junit.jupiter.api.*;

public class NegativeConfirmCheckoutTCsPageTest extends TestMethods{

    //negative checkout confirmation tests (since guest starts with all empty input fields, it's more prudent to test guest branch only -> reg user will have the same output)

    //no singular billing address input tests

    //Test 009n -> invalid check out confirmation test - no first name (as a guest)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - No First Name (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("No_Billing_Address_Singular_Input")
    @Tag("No_Singular_Input")
    void invalidCheckoutNoFirstNameConfirmationGuestTest(){
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
    @Tag("No_Billing_Address_Singular_Input")
    @Tag("No_Singular_Input")
    void invalidCheckoutNoLastNameConfirmationGuestTest(){
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
    @Tag("No_Billing_Address_Singular_Input")
    @Tag("No_Singular_Input")
    void invalidCheckoutNoEmailConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - no email (as a guest)
        invalidGuestCheckoutNoEmailConfirmationTest();
    }

    //Test 009q -> invalid check out confirmation test - no country / state selected (as a guest)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - No Country/State Selection (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("No_Billing_Address_Singular_Input")
    @Tag("No_Singular_Input")
    void invalidCheckoutNoCountryStateConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - no country/state selection (as a guest)
        invalidGuestCheckoutNoCountryStateConfirmationTest();
    }

    //Test 009r -> invalid check out confirmation test - no user city (as a guest)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - No User City (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("No_Billing_Address_Singular_Input")
    @Tag("No_Singular_Input")
    void invalidCheckoutNoCityConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - no user city (as a guest)
        invalidGuestCheckoutNoCityConfirmationTest();
    }

    //Test 009s -> invalid check out confirmation test - no user address (as a guest)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - No User Address (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("No_Billing_Address_Singular_Input")
    @Tag("No_Singular_Input")
    void invalidCheckoutNoAddressConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - no user address (as a guest)
        invalidGuestCheckoutNoAddressConfirmationTest();
    }

    //Test 009t -> invalid check out confirmation test - no user zip code (as a guest)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - No User Zip Code (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("No_Billing_Address_Singular_Input")
    @Tag("No_Singular_Input")
    void invalidCheckoutNoZipCodeConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - no user zip code (as a guest)
        invalidGuestCheckoutNoZipCodeConfirmationTest();
    }

    //Test 009u -> invalid check out confirmation test - no user phone number (as a guest)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - No User Phone (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("No_Billing_Address_Singular_Input")
    @Tag("No_Singular_Input")
    void invalidCheckoutNoPhoneConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - no user phone number (as a guest)
        invalidGuestCheckoutNoPhoneConfirmationTest();
    }

    //no singular 'Credit Card' payment method input tests

    //Test 009v -> invalid check out confirmation test - no credit card holder name (as a guest)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - No Credit Card Name (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("No_Credit_Card_Singular_Input")
    @Tag("No_Singular_Input")
    void invalidCheckoutNoCardNameConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - no credit card holder name (as a guest)
        invalidGuestCheckoutCreditCardNoCardNameConfirmationTest();
    }

    //Test 009w -> invalid check out confirmation test - no credit card number (as a guest)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - No Credit Card Number (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("No_Credit_Card_Singular_Input")
    @Tag("No_Singular_Input")
    void invalidCheckoutNoCardNumberConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - no credit card number (as a guest)
        invalidGuestCheckoutCreditCardNoCardNumberConfirmationTest();
    }

    //Test 009x -> invalid check out confirmation test - no credit card CVC number (as a guest)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - No Credit Card CVC Number (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("No_Credit_Card_Singular_Input")
    @Tag("No_Singular_Input")
    void invalidCheckoutNoCardCVCNumberConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - no credit card CVC number (as a guest)
        invalidGuestCheckoutCreditCardNoCardCVCNumberConfirmationTest();
    }

    //no 'Purchase Order' number test

    //Test 009y -> invalid check out confirmation test - no purchase order number (as a guest) (the guest has confirmed the order despite empty purchase order number - this defeats the purpose of further 'Purchase Order' section testing)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - No Purchase Order Number (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("No_Purchase_Order_Input")
    @Tag("No_Singular_Input")
    void invalidCheckoutNoPurchaseOrderNumberConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - no purchase order number (as a guest)
        invalidGuestCheckoutNoPurchaseOrderNumberConfirmationTest();
    }

    //too short / too long singular input tests

    //Test 009z -> invalid check out confirmation test - too short first name (as a guest) (the test proceeds further instead of failing on missing error - test has failed)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - Too Short First Name (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("Too_Short_Billing_Address_Singular_Input")
    @Tag("Too_Short_Singular_Input")
    void invalidCheckoutTooShortFirstNameConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - too short first name (as a guest) (1 char is usually too short)
        invalidGuestCheckoutTooShortFirstNameConfirmationTest();
    }

    //Test 009aa -> invalid check out confirmation test - too long first name (as a guest) (the test proceeds further instead of failing on missing error - test has failed)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - Too Long First Name (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("Too_Long_Billing_Address_Singular_Input")
    @Tag("Too_Long_Singular_Input")
    void invalidCheckoutTooLongFirstNameConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - too long first name (as a guest) (125 chars is usually too short)
        invalidGuestCheckoutTooLongFirstNameConfirmationTest();
    }

    //Test 009ab -> invalid check out confirmation test - too short last name (as a guest) (the test proceeds further instead of failing on missing error - test has failed)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - Too Short Last Name (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("Too_Short_Billing_Address_Singular_Input")
    @Tag("Too_Short_Singular_Input")
    void invalidCheckoutTooShortLastNameConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - too short last name (as a guest) (1 char is usually too short)
        invalidGuestCheckoutTooShortLastNameConfirmationTest();
    }

    //Test 009ac -> invalid check out confirmation test - too long last name (as a guest) (the test proceeds further instead of failing on missing error - test has failed)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - Too Long Last Name (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("Too_Long_Billing_Address_Singular_Input")
    @Tag("Too_Long_Singular_Input")
    void invalidCheckoutTooLongLastNameConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - too long last name (as a guest) (125 chars is usually too long)
        invalidGuestCheckoutTooLongLastNameConfirmationTest();
    }

    //Test 009ad -> invalid check out confirmation test - too short email address (as a guest) (the test proceeds further instead of failing on missing error - test has failed)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - Too Short Email (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("Too_Short_Billing_Address_Singular_Input")
    @Tag("Too_Short_Singular_Input")
    void invalidCheckoutTooShortEmailConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - too short email address (as a guest) (3 char email usually is too short -> name, '@', domain)
        invalidGuestCheckoutTooShortEmailNameConfirmationTest();
    }

    //Test 009ae -> invalid check out confirmation test - too long email address (as a guest) (the test proceeds further instead of failing on missing error - test has failed)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - Too Long Email (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("Too_Long_Billing_Address_Singular_Input")
    @Tag("Too_Long_Singular_Input")
    void invalidCheckoutTooLongEmailConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - too long email address (as a guest) (3 char email usually is too short -> name, '@', domain)
        invalidGuestCheckoutTooLongEmailNameConfirmationTest();
    }

    //Test 009af -> invalid check out confirmation test - too short user city (as a guest) (the test proceeds further instead of failing on missing error - test has failed)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - Too Short City (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("Too_Short_Billing_Address_Singular_Input")
    @Tag("Too_Short_Singular_Input")
    void invalidCheckoutTooShortCityConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - too short user city (as a guest) (1 char)
        invalidGuestCheckoutTooShortCityConfirmationTest();
    }

    //Test 009ag -> invalid check out confirmation test - too long user city (as a guest) (the test proceeds further instead of failing on missing error - test has failed)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - Too Long City (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("Too_Long_Billing_Address_Singular_Input")
    @Tag("Too_Long_Singular_Input")
    void invalidCheckoutTooLongCityConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - too long user city (as a guest) (75 chars)
        invalidGuestCheckoutTooLongCityConfirmationTest();
    }

    //Test 009ah -> invalid check out confirmation test - too short user address (as a guest) (the test proceeds further instead of failing on missing error - test has failed)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - Too Short Address (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("Too_Short_Billing_Address_Singular_Input")
    @Tag("Too_Short_Singular_Input")
    void invalidCheckoutTooShortAddressConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - too short user address (as a guest) (3 chars)
        invalidGuestCheckoutTooShortAddressConfirmationTest();
    }

    //Test 009ai -> invalid check out confirmation test - too long user address (as a guest) (the test proceeds further instead of failing on missing error - test has failed)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - Too Long Address (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("Too_Long_Billing_Address_Singular_Input")
    @Tag("Too_Long_Singular_Input")
    void invalidCheckoutTooLongAddressConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - too long user address (as a guest) (120 chars)
        invalidGuestCheckoutTooLongAddressConfirmationTest();
    }

    //Test 009aj -> invalid check out confirmation test - too short user zip code (as a guest) (the test proceeds further instead of failing on missing error - test has failed)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - Too Short Zip Code (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("Too_Short_Billing_Address_Singular_Input")
    @Tag("Too_Short_Singular_Input")
    void invalidCheckoutTooShortZipCodeConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - too short user zip code (as a guest) (2 chars)
        invalidGuestCheckoutTooShortZipCodeConfirmationTest();
    }
}
