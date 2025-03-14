package com.airam;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.airam.pages.GooglehomePage;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

class ApplicationTest {
    private WebDriver driver;
    private GooglehomePage home;


    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        home = new GooglehomePage(driver, "https://www.google.com");
        
    }
    @AfterEach void tearDown() {
        driver.quit();
    }

    @Test
    public void testTitle() {
        String title = home.getTitle();
        Assertions.assertEquals("Google", title, "El titulo no coincide con lo esperado");
    }
    @Test
    public void testLogo() {
        String logoClases = home.getlogoClases();
        Assertions.assertFalse(logoClases.contains("logo"), "El logo no contiene la clase logo");
    }
    @Test 
    public void testSearchInputFirstSuggestion() {
        String textoBuscar = "Hotmail";
        home.buscar(textoBuscar);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement primerelemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.wM6W7d")));
        String textoSugerido = primerelemento.getText();
        Assertions.assertEquals("hotmail", textoSugerido.toLowerCase(), "El texto sugerido no coincide con lo esperado");
        
    }

}
