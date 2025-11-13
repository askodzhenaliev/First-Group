package com.qa.practice.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterUserPage {
    public RegisterUserPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[.=' Signup / Login']")
    WebElement signUpAndLoginButton;

    @FindBy(xpath = "//h2[contains(text(),'Signup')]")
    WebElement newUserSignupText;

    @FindBy(xpath = "//input[@name='name']")
    WebElement name;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement email;

    @FindBy(xpath = "//button[.='Signup']")
    WebElement signupButton;

    @FindBy(xpath = "//b[contains(text(),'Account')]")
    WebElement enterAccountInformationText;

    @FindBy(xpath = "//input[@name='password']")
    WebElement password;

    @FindBy(xpath = "//input[@value='Mr']")
    WebElement mrButton;

    @FindBy(xpath = "//input[@value='Mrs']")
    WebElement mrsButton;

    @FindBy(xpath = "//select[@id='days']")
    WebElement dayOfBirth;

    @FindBy(xpath = "//select[@id='months']")
    WebElement monthOfBirth;

    @FindBy(xpath = "//select[@id='years']")
    WebElement yearOfBirth;

    @FindBy(xpath = "//input[@id='newsletter']")
    WebElement newsletterCheckbox;

    @FindBy(xpath = "//input[@id='optin']")
    WebElement offersCheckbox;




    public void clickAndValidateText(String expectedNewUserText){
        signUpAndLoginButton.click();
        Assert.assertEquals(expectedNewUserText, newUserSignupText.getText());
    }

    public void signupFunctionality(String name, String email){
        this.name.sendKeys(name);
        this.email.sendKeys(email);
        signupButton.click();
    }

    public void enterAccountInformationTextValidation(String expectedAccountInformationText){
        Assert.assertEquals(expectedAccountInformationText, enterAccountInformationText.getText());
    }

    public void accountInformationFunctionality(String title, String name, String password, String day, String month, String year){
        if(title.equals("Mr")){
            mrButton.click();
        }else mrsButton.click();

        this.name.sendKeys(name);
        this.password.sendKeys(password);
        this.dayOfBirth.sendKeys(day);
        this.monthOfBirth.sendKeys(month);
        this.yearOfBirth.sendKeys(year);
        newsletterCheckbox.click();
        offersCheckbox.click();

    }



}
