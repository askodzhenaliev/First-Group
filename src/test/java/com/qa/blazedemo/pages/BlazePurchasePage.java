package com.qa.blazedemo.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class BlazePurchasePage {

    public BlazePurchasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@name='fromPort']")
    WebElement departure;

    @FindBy(xpath = "//select[@name='toPort']")
    WebElement destination;

    @FindBy(xpath = "//input")
    WebElement findFlightButton;

    @FindBy(tagName = "h3")
    WebElement header;

    @FindBy(xpath = "/html/body/div[2]/table/tbody/tr[1]/td[1]/input")
    WebElement firstFlightButton;

    @FindBy(xpath = "//input[@id='inputName']")
    WebElement name;

    @FindBy(xpath = "//input[@id='address']")
    WebElement address;

    @FindBy(xpath = "//input[@id='city']")
    WebElement city;

    @FindBy(xpath = "//input[@id='state']")
    WebElement state;

    @FindBy(xpath = "//input[@id='zipCode']")
    WebElement zipCode;

    @FindBy(xpath = "//select[@id='cardType']")
    WebElement cardType;

    @FindBy(xpath = "//input[@id='creditCardNumber']")
    WebElement creditCardNumber;

    @FindBy(xpath = "//input[@id='creditCardMonth']")
    WebElement month;

    @FindBy(xpath = "//input[@id='creditCardYear']")
    WebElement year;

    @FindBy(xpath = "//input[@id='nameOnCard']")
    WebElement nameOnCard;

    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement checkBox;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement purchaseFlightButton;

    @FindBy(tagName = "h1")
    WebElement actualMessage;

    public void choosingDepartureFlight(String departure) {
        BrowserUtils.selectBy(this.departure, departure, "text");
    }

    public void choosingDestinationAndClickingFindingFlight(String destination) {
        BrowserUtils.selectBy(this.destination, destination, "text");
        findFlightButton.click();
    }

    public void validateHeader(String expectedHeader) {
        Assert.assertEquals(expectedHeader, header.getText());
    }

    public void clickFirstFlightButton() {
        firstFlightButton.click();
        System.out.println("fixing some bugs");
    }

    public void contactInformation(String name, String address, String city, String state, String zipCode) {
        this.name.sendKeys(name);
        this.address.sendKeys(address);
        this.city.sendKeys(city);
        this.state.sendKeys(state);
        this.zipCode.sendKeys(zipCode);
    }

    public void paymentInformation(String cardType, String creditCardNumber, String month, String year, String nameOnCard) {
        this.cardType.sendKeys(cardType);
        this.creditCardNumber.sendKeys(creditCardNumber);
        this.month.sendKeys(month);
        this.year.sendKeys(year);
        this.nameOnCard.sendKeys(nameOnCard);

    }

    public void rememberMeButtonAndClickPurchase(){
        checkBox.click();
        purchaseFlightButton.click();

    }

    public void messageValidation(String expectedMessage){
        Assert.assertEquals(expectedMessage, actualMessage.getText());
    }
}


