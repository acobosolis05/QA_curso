package com.airam;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://getbootstrap.com/docs/4.3/components/dropdowns/");
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @Test
    void testDropdownSelection() {
        // Esperar a que el botón del dropdown sea interactivo
        WebElement dropdownButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("dropdownMenuButton")));
        dropdownButton.click();

        // Seleccionar la opción "Action"
        WebElement actionOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(), 'Action')]")));
        actionOption.click();

        // Verificar que el dropdown se haya cerrado después de seleccionar una opción
        Assertions.assertTrue(wait.until(ExpectedConditions.invisibilityOf(actionOption)),
                "El dropdown no se cerró después de seleccionar la opción.");
    }
}
