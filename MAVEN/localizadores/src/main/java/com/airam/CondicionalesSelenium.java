package com.airam;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CondicionalesSelenium {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        try {
            // Navegar a Google
            driver.get("https://www.google.com");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

            // Navegar a Wikipedia
            driver.get("https://www.wikipedia.org/");

            // Condicional 1: Verificar si el campo de búsqueda está presente y escribir en
            // él
            WebElement searchBox = driver.findElement(By.id("searchInput"));
            if (searchBox.isDisplayed()) {
                searchBox.sendKeys("Selenium WebDriver");
            }

            // Condicional 2: Verificar si el botón de búsqueda está habilitado y hacer clic
            // en él
            WebElement searchButton = driver.findElement(By.className("pure-button"));
            if (searchButton.isEnabled()) {
                searchButton.click();
            }

            // Esperar unos segundos para que cargue la nueva página
            Thread.sleep(3000);

            // Condicional 3: Verificar si el título de la página contiene "Selenium" y
            // mostrar un mensaje
            if (driver.getTitle().contains("Selenium")) {
                System.out.println("Navegación exitosa: Página de Selenium abierta.");
            } else {
                System.out.println("No se encontró la página esperada.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Cerrar el navegador
            driver.quit();
        }
    }
}
// driver.switchTo().newWindow(WindowType.TAB);
// driver.get("https://www.google.com");