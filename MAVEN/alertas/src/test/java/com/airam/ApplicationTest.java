package com.airam;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

class ApplicationTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
    }

    @Test
    public void testPromptAlert() {
        // Cambiar al iframe donde está el botón "Try it"
        driver.switchTo().frame("iframeResult");

        // Hacer clic en el botón "Try it"
        WebElement tryItButton = driver.findElement(By.xpath("//button[text()='Try it']"));
        tryItButton.click();

        // Manejar la alerta emergente
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Airam");  // Ingresar nombre en la alerta
        alert.accept();  // Aceptar la alerta

        // Verificar que el nombre ingresado se muestra en la página
        WebElement resultText = driver.findElement(By.id("demo"));
        assertTrue(resultText.getText().contains("Airam"), "El texto de la alerta no se reflejó correctamente.");
    }

    @AfterEach
    public void tearDown() {
        // driver.quit();
    }
}
