package com.qa.smartbear.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearLoginPage {

    public SmartBearLoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@type='text']")
    WebElement username;

    @FindBy(xpath = "//input[@type='password']")
    WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement submitButton;

    @FindBy(xpath = "//a[.='Order']")
    WebElement orderBtn;


    public void loginFunctionality(String username, String password) throws InterruptedException {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        Thread.sleep(5000);
        submitButton.click();
        Thread.sleep(5000);
    }

    public void clickOrderButton(){
        orderButton.click();
    }
}
