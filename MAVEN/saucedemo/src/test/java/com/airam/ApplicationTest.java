package com.airam;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


import com.airam.pages.Saucedemohome;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

class ApplicationTest {
    private WebDriver driver;
    private Saucedemohome homePage;
    @BeforeEach
    public void setUp(){
        driver = new ChromeDriver();
        homePage = new Saucedemohome(driver,"https://www.saucedemo.com/v1/index.html");
    }

    @ParameterizedTest
    @CsvSource({
            "'', '', Epic sadface: Username is required",
            "'standard_user', '123', Epic sadface: Username and password do not match any user in this service",
            "'locked_out_user', 'secret_sauce', 'Epic sadface: Sorry, this user has been locked out.'"
    })
    public void loginWithoutCredentials(String userName, String password, String expectedMessage) {
        homePage.setUserName(userName);
        homePage.setPassword(password);
        homePage.clickLogin();
        Assertions.assertEquals(expectedMessage, homePage.getErrorText());
    }

    @ParameterizedTest
    @CsvSource({
            "'standard_user', 'secret_sauce'",
            "'problem_user', 'secret_sauce'",
            "'performance_glitch_user', 'secret_sauce'"
    })
    public void loginSuccess(String userName, String password) {
        homePage.setUserName(userName);
        homePage.setPassword(password);
        homePage.clickLogin();
        Assertions.assertEquals("Products", homePage.getMessageLogin());
        homePage.clickOpenMenu();
        homePage.clickLogout();
        Assertions.assertEquals("LOGIN",homePage.getTextLogin());
    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }
}

