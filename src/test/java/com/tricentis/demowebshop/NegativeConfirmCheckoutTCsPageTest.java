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

    //Test 009af -> invalid check out confirmation test - invalid email address format (as a guest)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - Invalid Email Format (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("Invalid_Billing_Address_Singular_Input")
    @Tag("Invalid_Singular_Input")
    void invalidCheckoutInvalidEmailFormatConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - invalid email address format (as a guest)
        invalidGuestCheckoutInvalidEmailFormatConfirmationTest();
    }

    //Test 009ag -> invalid check out confirmation test - used email address format (as a guest) (the test proceeds further instead of failing on missing error - test has failed)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - Used Email (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("Invalid_Billing_Address_Singular_Input")
    @Tag("Invalid_Singular_Input")
    void invalidCheckoutUsedEmailConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - used email address (as a guest)
        invalidGuestCheckoutUsedEmailConfirmationTest();
    }

    //Test 009ah -> invalid check out confirmation test - too short user city (as a guest) (the test proceeds further instead of failing on missing error - test has failed)
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

    //Test 009ai -> invalid check out confirmation test - too long user city (as a guest) (the test proceeds further instead of failing on missing error - test has failed)
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

    //Test 009ak -> invalid check out confirmation test - too short user address (as a guest) (the test proceeds further instead of failing on missing error - test has failed)
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

    //Test 009al -> invalid check out confirmation test - too long user address (as a guest) (the test proceeds further instead of failing on missing error - test has failed)
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

    //Test 009am -> invalid check out confirmation test - too short user zip code (as a guest) (the test proceeds further instead of failing on missing error - test has failed)
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

    //Test 009an -> invalid check out confirmation test - too long user zip code (as a guest) (the test proceeds further instead of failing on missing error - test has failed)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - Too Long Zip Code (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("Too_Long_Billing_Address_Singular_Input")
    @Tag("Too_Long_Singular_Input")
    void invalidCheckoutTooLongZipCodeConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - too long user zip code (as a guest) (75 chars)
        invalidGuestCheckoutTooLongZipCodeConfirmationTest();
    }

    //Test 009ao -> invalid check out confirmation test - too short user phone number (as a guest) (the test proceeds further instead of failing on missing error - test has failed)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - Too Short Phone (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("Too_Short_Billing_Address_Singular_Input")
    @Tag("Too_Short_Singular_Input")
    void invalidCheckoutTooShortPhoneConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - too short user phone number (as a guest) (6 chars)
        invalidGuestCheckoutTooShortPhoneConfirmationTest();
    }

    //Test 009ap -> invalid check out confirmation test - too long user phone number (as a guest) (the test proceeds further instead of failing on missing error - test has failed)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - Too Long Phone (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("Too_Long_Billing_Address_Singular_Input")
    @Tag("Too_Long_Singular_Input")
    void invalidCheckoutTooLongPhoneConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - too long user phone number (as a guest) (25 chars)
        invalidGuestCheckoutTooLongPhoneConfirmationTest();
    }

    //Test 009ap -> invalid check out confirmation test - invalid user phone number format (as a guest) (the test proceeds further instead of failing on missing error - test has failed)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - Invalid Phone Format (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("Invalid_Billing_Address_Singular_Input")
    @Tag("Invalid_Singular_Input")
    void invalidCheckoutInvalidPhoneFormatConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - invalid user phone number format (as a guest) (special symbols only)
        invalidGuestCheckoutInvalidPhoneFormatConfirmationTest();
    }

    //'Payment Information' section negative too short / too long tests

    //Test 009aq -> invalid check out confirmation test - too short user cardholder name (as a guest) (the test proceeds further instead of failing on missing error - test has failed)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - Too Short Card Name (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("Too_Short_Payment_Information_Singular_Input")
    @Tag("Too_Short_Singular_Input")
    void invalidCheckoutTooShortCardNameConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - too short user cardholder name (as a guest) (4 chars)
        invalidGuestCheckoutCreditCardTooShortCardNameConfirmationTest();
    }

    //Test 009ar -> invalid check out confirmation test - too long user cardholder name (as a guest) (the test proceeds further instead of failing on missing error - test has failed)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - Too Long Card Name (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("Too_Long_Payment_Method_Singular_Input")
    @Tag("Too_Long_Singular_Input")
    void invalidCheckoutTooLongCardNameConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - too long user cardholder name (as a guest) (100 chars)
        invalidGuestCheckoutCreditCardTooLongCardNameConfirmationTest();
    }

    //Test 009as -> invalid check out confirmation test - invalid user cardholder name format (as a guest) (the test proceeds further instead of failing on missing error - test has failed)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - Invalid Card Name Format (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("Invalid_Payment_Method_Singular_Input")
    @Tag("Invalid_Singular_Input")
    void invalidCheckoutInvalidCardNameFormatConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - invalid user cardholder name format (as a guest) (digits only)
        invalidGuestCheckoutCreditCardInvalidCardNameFormatConfirmationTest();
    }

    //Test 009at -> invalid check out confirmation test - too short user card number (as a guest)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - Too Short Card Number (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("Too_Short_Payment_Information_Singular_Input")
    @Tag("Too_Short_Singular_Input")
    void invalidCheckoutTooShortCardNumberConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - too short user card number (as a guest) (15 digits)
        invalidGuestCheckoutCreditCardTooShortCardNumberConfirmationTest();
    }

    //Test 009au -> invalid check out confirmation test - too long user card number (as a guest)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - Too Long Card Number (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("Too_Long_Payment_Method_Singular_Input")
    @Tag("Too_Long_Singular_Input")
    void invalidCheckoutTooLongCardNumberConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - too long user card number (as a guest) (18 digits)
        invalidGuestCheckoutCreditCardTooLongCardNumberConfirmationTest();
    }

    //Test 009av -> invalid check out confirmation test - invalid user card number format (as a guest)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - Invalid Card Number Format (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("Invalid_Payment_Method_Singular_Input")
    @Tag("Invalid_Singular_Input")
    void invalidCheckoutInvalidCardNumberFormatConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - invalid user card number format (as a guest) (random 16 digits - no structure / algorithm)
        invalidGuestCheckoutCreditCardInvalidCardNumberFormatConfirmationTest();
    }

    //Test 009aw -> invalid check out confirmation test - too short user card CVC number (as a guest) (this input field has a 4 char limit, so too long CVC scenario cannot be enacted here)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - Too Short CVC Number (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("Too_Short_Payment_Information_Singular_Input")
    @Tag("Too_Short_Singular_Input")
    void invalidCheckoutTooShortCardCVCNumberConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - too short user card CVC number (as a guest) (2 digits)
        invalidGuestCheckoutCreditCardTooShortCardCVCNumberConfirmationTest();
    }

    //Test 009ax -> invalid check out confirmation test - invalid user card CVC number (as a guest)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - Invalid CVC Format (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("Invalid_Payment_Information_Singular_Input")
    @Tag("Invalid_Singular_Input")
    void invalidCheckoutInvalidCardCVCFormatConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - invalid user card CVC format (as a guest) (chars only)
        invalidGuestCheckoutCreditCardInvalidCardCVCFormatConfirmationTest();
    }

    //Test 009ay -> invalid check out confirmation test - expired user credit card (as a guest) (the test proceeds further instead of failing on missing error - test has failed)
    @Test
    @DisplayName("Invalid Checkout Confirmation Test - Expired Credit Card (as a guest)")
    @Tag("Invalid_Checkout_Confirmation_Guest")
    @Tag("Invalid_Payment_Method")
    void invalidCheckoutExpiredCardConfirmationGuestTest(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //add a single featured product to cart test (as a guest)
        addASingleFeaturedProductToCartTest();
        //add a single featured product to check out test (as a guest) //this test method is universal for all product types since they all end up on same checkout page
        addProductToCheckoutAsGuestTest(shoppingCartPage);
        //invalid check out confirmation test - expired user credit card (as a guest)
        invalidGuestCheckoutExpiredCreditCardConfirmationTest();
    }
}
