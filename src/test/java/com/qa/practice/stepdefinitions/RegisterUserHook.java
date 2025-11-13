package com.qa.practice.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class RegisterUserHook {
    public WebDriver driver;

    @Before
    public void setup(){
        driver = DriverHelper.getDriver();
        driver.get(ConfigReader.readProperty("exercise1_url"));
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
