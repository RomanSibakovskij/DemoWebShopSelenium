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
}
