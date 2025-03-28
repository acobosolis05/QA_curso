package com.airam;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.airam.pages.AlertasHome;



import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

class ApplicationTest {

    private WebDriver driver;
    private AlertasHome home;
    

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        home = new AlertasHome(driver, "https://www.demoblaze.com/index.html");
    }

    @AfterEach
    void tearDown() {
        // driver.quit();
    }

    @Test
    public void testClickTbody() {
     // Hacer clic en la categoría Phones
    home.selectPhonesCategory();

    // Inicializar WebDriverWait
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    // Esperar a que el contenedor de productos se actualice
    WebElement productContainer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("col-lg-9")));

    // Esperar a que al menos un producto esté dentro del contenedor
    WebElement firstProduct = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#tbodyid div")));

    // Verificar que el contenedor tiene contenido
    Assertions.assertTrue(productContainer.isDisplayed(), "El contenedor de productos no está visible después del clic");
    Assertions.assertTrue(firstProduct.isDisplayed(), "No se cargaron productos después del clic");
    }

    @Test
    public void testClickLogin() {
        // Hacer clic en el enlace de inicio de sesión
        WebElement loginLink = driver.findElement(By.id("login2"));
        loginLink.click();

        // Esperar a que el modal se abra
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loginModal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logInModal")));

        // Verificar que el modal está visible
        Assertions.assertTrue(loginModal.isDisplayed(), "El modal de inicio de sesión no se abrió correctamente");
    }

    @Test
    public void testLogin() {
        // Hacer clic en el botón de "Log in" para abrir el modal
        home.selectLogin();

        // Esperar a que el modal se cargue
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logInModal")));

        // Llamar al método login de AlertasHome
        home.login("airam", "1234");

        // Verificar que el modal se cerró (opcional)
        boolean modalClosed = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("logInModal")));
        Assertions.assertTrue(modalClosed, "El modal de login no se cerró después del clic.");
    }
}


