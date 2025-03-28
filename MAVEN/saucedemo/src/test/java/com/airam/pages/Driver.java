package com.airam.pages;

import org.openqa.selenium.WebDriver;

public class Driver {
    protected WebDriver driver;
    public Driver(WebDriver driverName, String url) {
        this.driver = driverName;
        driverName.manage().window().maximize();
        driverName.get(url);
    }
}
