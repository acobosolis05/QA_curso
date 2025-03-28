package com.airam.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AlertasHome extends Driver {
    public AlertasHome(WebDriver i_driver, String url) {
        super(i_driver, url);
        PageFactory.initElements(i_driver, this);
    }

    public void selectPhonesCategory() {
        WebElement phonesCategory = driver.findElement(By.xpath("//a[contains(text(),'Phones')]"));
        phonesCategory.click();
    }

    public void selectLogin() {
        WebElement login = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
        login.click();
    }

    public void login(String user, String pass) {
        WebElement usernameField = driver.findElement(By.id("loginusername"));
        usernameField.sendKeys(user);
    
        WebElement passwordField = driver.findElement(By.id("loginpassword"));
        passwordField.sendKeys(pass);
    
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();
    }
}
