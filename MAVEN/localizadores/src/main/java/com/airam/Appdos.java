package com.airam;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Appdos {
    public static void main(String[] args) {
        // Crear una instancia de WebDriver
        WebDriver driver = new ChromeDriver();
        // Maximizar la ventana del navegador
        driver.manage().window().maximize();
        try {
            // Abrir la página de Google
            driver.get("https://www.google.com");
            // Configurar tiempo de espera implícito
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            // Navegar a LinkedIn
            driver.navigate().to("https://linkedin.com/");
            // Intentar encontrar el botón "Iniciar Sesión"
            WebElement signInButton = driver.findElement(By.className("nav__button-secondary"));
            signInButton.click();
            // Configurar tiempo de espera implícito NUEVO
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
            driver.navigate().to("https://github.com/");
            WebElement emailInput = driver.findElement(By.id("hero_user_email"));
            emailInput.sendKeys("cobo@gmailcom");
            // Navegar a Wikipedia
            driver.navigate().to("https://es.wikipedia.org");
            WebElement buscarInfo = driver.findElement(By.className("cdx-text-input__input"));
            buscarInfo.sendKeys("programar", Keys.ENTER);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Cerrar la ventana del navegador
            driver.quit();
        }

        
    }
}

