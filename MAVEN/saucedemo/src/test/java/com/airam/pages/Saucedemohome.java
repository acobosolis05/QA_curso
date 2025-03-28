package com.airam.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Saucedemohome extends Driver {
    public Saucedemohome(WebDriver driverName, String url) {
        super(driverName, url);
        PageFactory.initElements(driverName,this);
    }

    @FindBy(id="user-name")
    private WebElement userName;
    public void setUserName(String user){
        userName.sendKeys(user);
    }

    @FindBy(id="password")
    private WebElement password;
    public void setPassword(String pass){
        password.sendKeys(pass);
    }

    @FindBy(id="login-button")
    private WebElement loginButton;
    public void clickLogin(){
        loginButton.click();
    }
    public String getTextLogin(){
        return loginButton.getDomAttribute("value");
    }

    @FindBy(css="h3[data-test='error']")
    private WebElement errorText;
    public String getErrorText(){
        return errorText.getText();
    }


    @FindBy(css="div.product_label")
    private WebElement loginSuccess;
    public String getMessageLogin(){
        return loginSuccess.getText();
    }

    @FindBy(xpath = "//*[@id='menu_button_container']/div/div[3]/div/button")
    private WebElement openMenu;
    public void clickOpenMenu(){
        openMenu.click();
    }

    @FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/nav/a[3]")
    private WebElement logout;
    public void clickLogout(){
        logout.click();
    }


}
