package com.airam.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglehomePage extends Driver {
    public GooglehomePage(WebDriver i_driver, String url) {
        super(i_driver, url);
        PageFactory.initElements(i_driver, this);
}
    
    @FindBy(css = "img[alt=\'Google\']")
    private WebElement googleLogo;

    public String getlogoClases() {
        return googleLogo.getDomAttribute("class");
    }

    @FindBy(className  = "gLFyf")
    private WebElement searchBox;

    public void buscar(String textoBuscar){
        searchBox.sendKeys(textoBuscar);
        
    }
    
}
