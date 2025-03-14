package com.airam;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class esperasExplicitas {
public static void main(String[] args) {

    WebDriver driver = new ChromeDriver();
    // Maximizar la ventana del navegador
    driver.manage().window().maximize();
    try {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        // Abrir la página de Google y esperar a que aparezca el cuadro de
        driver.get("https://www.google.com");
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
        searchBox.sendKeys("Selenium WebDriver", Keys.ENTER);
        // Navegar a GitHub y esperar a que el botón "Login" sea clickeable
        driver.navigate().to("https://github.com/");
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign in")));
        loginButton.click();
        // Navegar a Amazon y esperar a que se cargue el menú de idiomas
        driver.navigate().to("https://www.amazon.com/");
        WebElement categoryMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a#icp-nav-flyout")));
        categoryMenu.click();
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    } finally {
        driver.quit();
    }
}
}
