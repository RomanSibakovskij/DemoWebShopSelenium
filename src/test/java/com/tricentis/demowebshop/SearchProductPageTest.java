package com.tricentis.demowebshop;

import org.junit.jupiter.api.*;

public class SearchProductPageTest extends TestMethods{

    //single available product search tests

    //Test 006 -> search for a single available product test (as a registered user)
    @Test
    @DisplayName("Search For A Single Available Product Test (as a registered user)")
    @Tag("Single_Available_Product_Search_Reg_User")
    @Tag("Single_Available_Product_Search")
    void singleAvailableProductSearchRegUserTest(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to register page
        userNavigationToRegisterPageTest(homePage);
        //valid user account creation test (male gender button)
        validMaleUserCreationTest(registerPage);
        //single featured product search test (as a registered user)
        searchForASingleFeaturedProductTest();
        //single available product search test (as a registered user)
        searchForASingleAvailableProductTest();
    }

    //Test 006a -> search for a single available product test (as a guest)
    @Test
    @DisplayName("Search For A Single Available Product Test (as a guest)")
    @Tag("Single_Available_Product_Search_Guest")
    @Tag("Single_Available_Product_Search")
    void singleAvailableProductSearchGuestTest(){
        //single featured product search test (as a guest)
        searchForASingleFeaturedProductTest();
        //single available product search test (as a guest)
        searchForASingleAvailableProductTest();
    }
}
