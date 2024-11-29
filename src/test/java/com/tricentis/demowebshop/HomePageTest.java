package com.tricentis.demowebshop;

import org.junit.jupiter.api.*;

public class HomePageTest extends TestMethods{

    @Test
    @DisplayName("Navigate To Register Page")
    @Tag("User_Navigation_To_Register_Page")
    void navigateToRegisterPageTest(){
        HomePage homePage = new HomePage(driver);
        userNavigationToRegisterPageTest(homePage);
    }
}
