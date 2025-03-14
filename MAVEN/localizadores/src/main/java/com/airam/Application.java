package com.airam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Application {

    public static void main(String[] args) {
        // // Configurar la ruta del driver y abrir el navegador
        // System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        // // Reemplaza "path/to/chromedriver" con la ruta de tu driver
        // // Crear una instancia de WebDriver
        // WebDriver driver = new ChromeDriver();
        // // Maximizar la ventana del navegador
        // driver.manage().window().maximize();
        // // Abrir la página de Wikipedia
        // driver.get("https://www.wikipedia.org");
        // // Localizar y hacer clic en los elementos por ID
        // try {
        //     // Encuentra el primer elemento por su ID y haz clic en él
        //     WebElement firstElement = driver.findElement(By.id("www-wikipedia-org"));
        //     // Reemplaza "el parametro" con el ID real
        //     firstElement.click();
        //     // Encuentra el segundo elemento por su ID y haz clic en él
        //     // Encuentra el tercer elemento por su ID y haz clic en él
        // } catch (Exception e) {
        //     System.out.println("No se pudieron encontrar todos los elementos: " + e.getMessage());
        // }
        // // Cerrar el navegador
        // driver.quit();

        // Configurar la ruta del driver 
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe"); 
        // Reemplaza "path/to/chromedriver" con la ruta de tu driver 
        // Crear una instancia de WebDriver 
        WebDriver driver = new ChromeDriver(); 
        // Maximizar la ventana del navegador driver.manage().window().maximize();
        try { 
        // Abrir la página de Wikipedia 
        driver.get("https://www.wikipedia.org"); 
        // Localizar y hacer clic en los elementos por ID 
        WebElement englishLink = driver.findElement(By.id("www-wikipedia-org")); 
        englishLink.click(); 
        // Esperar unos segundos para que la página cargue completamente 
        Thread.sleep(2000); 
        // Navegar a GitHub 
        driver.navigate().to("https://github.com/"); 
        // Localizar un input por su atributo 'name' y escribir texto 
        WebElement searchInput = driver.findElement(By.name("user_email"));
        searchInput.sendKeys("Mail de prueba para Selenium"); 
        WebElement signUpButton = driver.findElement(By.partialLinkText("Sign up")); 
        signUpButton.click();
        } catch (Exception e) { 
        System.out.println("Error: " + e.getMessage()); 
        } finally { 
        // Cerrar el navegador 
        //driver.quit();
        } 
        }
    }


