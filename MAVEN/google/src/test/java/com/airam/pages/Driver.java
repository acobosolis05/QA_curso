package com.airam.pages;

import org.openqa.selenium.WebDriver;

public class Driver {
    private WebDriver driver;
    public Driver(WebDriver i_driver, String url) {
        this.driver = i_driver;
        this.driver.manage().window().maximize();
        this.driver.get(url);
    }
    
    public String getTitle() {
        return this.driver.getTitle();
    }
}
