package com.qa.smartbear.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearOrderPage {
    public SmartBearOrderPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@name='ctl00$MainContent$fmwOrder$ddlProduct']")
    WebElement productName;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']")
    WebElement quantity;

    @FindBy(xpath = "//*[@id=\"ctl00_MainContent_fmwOrder_txtName\"]")
    WebElement customerName;

    @FindBy(xpath = "//*[@id=\"ctl00_MainContent_fmwOrder_TextBox2\"]")
    WebElement street;

    @FindBy(xpath = "//*[@id=\"ctl00_MainContent_fmwOrder_TextBox3\"]")
    WebElement city;

    @FindBy(xpath = "//*[@id=\"ctl00_MainContent_fmwOrder_TextBox5\"]")
    WebElement zip;

    @FindBy(xpath = "//*[@id=\"ctl00_MainContent_fmwOrder_cardList_0\"]")
    WebElement visa;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_cardList_1")
    WebElement masterCard;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_cardList_2")
    WebElement americanExpress;

    @FindBy(xpath = "//*[@id=\"ctl00_MainContent_fmwOrder_TextBox6\"]")
    WebElement cardNumber;

    @FindBy(xpath = "//*[@id=\"ctl00_MainContent_fmwOrder_TextBox1\"]")
    WebElement expireDate;

    @FindBy(xpath = "//*[@id=\"ctl00_MainContent_fmwOrder_InsertButton\"]")
    WebElement processButton;

    @FindBy(xpath = "//*[@id=\"ctl00_MainContent_fmwOrder\"]/tbody/tr/td/div/strong")
    WebElement message;

    @FindBy(xpath = "//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[2]/td[2]")
    WebElement name;

    @FindBy(xpath = "//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[2]/td[3]")
    WebElement product;

    @FindBy(xpath = "//a[.='View all orders']")
    WebElement viewAllOrdersButton;


    public void productInformation(String productName, String quantity){
        this.productName.sendKeys(productName);
        this.quantity.sendKeys(quantity);
    }

    public void addressInformation(String customerName, String street, String city, String zip){
        this.customerName.sendKeys(customerName);
        this.street.sendKeys(street);
        this.city.sendKeys(city);
        this.zip.sendKeys(zip);
    }

    public void paymentInformation(String card, String cardNumber, String expireDate){
        if(card.equals("Visa")){
            visa.click();
        }else if(card.equals("MasterCard")){
            masterCard.click();
        }else{
            americanExpress.click();
        }
        this.cardNumber.sendKeys(cardNumber);
        this.expireDate.sendKeys(expireDate);

    }

    public void textValidation(String expectedMessage){
        processButton.click();
        Assert.assertEquals(expectedMessage, message.getText());
    }

    public void clickViewAllOrdersButton(){
        viewAllOrdersButton.click();
    }

    public void viewOrderValidation(String expectedName, String expectedProduct){
        Assert.assertEquals(expectedName, name.getText());
        Assert.assertEquals(expectedProduct, product.getText());
    }
}
