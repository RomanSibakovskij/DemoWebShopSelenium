package com.tricentis.demowebshop;

import org.junit.jupiter.api.*;

public class HomePageTest extends TestMethods{

    //Test 001 -> user navigation to register page test (as a guest)
    @Test
    @DisplayName("Navigate To Register Page Test (as a guest)")
    @Tag("User_Navigation_To_Register_Page")
    void navigateToRegisterPageTest(){
        HomePage homePage = new HomePage(driver);
        userNavigationToRegisterPageTest(homePage);
    }

    //single featured product search tests

    //Test 005 -> search for a single featured product test (as a registered user)
    @Test
    @DisplayName("Search For A Single Featured Product Test (as a registered user)")
    @Tag("Single_Featured_Product_Search_Reg_User")
    void singleFeaturedProductSearchRegUserTest(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //user navigation to register page
        userNavigationToRegisterPageTest(homePage);
        //valid user account creation test (male gender button)
        validMaleUserCreationTest(registerPage);
        //single product search test (as a registered user)
        searchForASingleFeaturedProductTest();
    }

    //Test 005a -> search for a single featured product test (as a guest)
    @Test
    @DisplayName("Search For A Single Featured Product Test (as a guest)")
    @Tag("Single_Featured_Product_Search_Guest")
    @Tag("Single_Featured_Product_Search")
    void singleFeaturedProductSearchGuestTest(){
        HomePage homePage = new HomePage(driver);;
        //single product search test (as a guest)
        searchForASingleFeaturedProductTest();
    }

}
