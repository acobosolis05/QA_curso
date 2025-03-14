package com.airam;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class ApplicationTest {
    private WebDriver driver;

    // Este método se ejecuta antes de cada prueba
    @BeforeEach
    public void setUp() {
        EdgeOptions options = new EdgeOptions();
        driver = new EdgeDriver(options);
        driver.manage().window().maximize(); // Maximiza la ventana del navegador
    }

    // Prueba para verificar el título de la página de Google
    @Test 
    void VerificarGooglee() {
        driver.get("https://www.google.com"); // Navega a la página de Google
        
        String title = driver.getTitle(); // Obtiene el título de la página y lo guarda en un String

        // Verifica que el título sea "Foogle" (Nota: esto fallará porque el título real es "Google")
        assertEquals("Google", title, "El titulo no coincide con lo esperado");
    }
    @Test 
    public void testGoogleLogoClass() {
        driver.get("https://www.google.com");
        WebElement logo = driver.findElement(By.className("lnXdpd"));
        String logo_class = logo.getDomAttribute("class");
        assertNotEquals("logo equivocado", logo_class, "El clase si coincide");
        driver.quit();
    }
    @Test 
    public void testSearchInputFirstSuggestion() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.google.com");
        WebElement searchInput = driver.findElement(By.className("gLFyf"));
        searchInput.sendKeys("hotmail");
        WebElement firstSuggestion= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.wM6W7d")));
        String firstSuggestionText = firstSuggestion.getText();
        assertTrue(firstSuggestionText.toLowerCase().contains("hotmail"), "La primera opción debería contener 'hotmail'");
    }
}