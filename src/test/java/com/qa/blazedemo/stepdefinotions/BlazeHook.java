package com.qa.blazedemo.stepdefinotions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class BlazeHook {

    // Its  a class that we store @Before and @After

    public WebDriver driver;

    //@Before from cucumber
//    @Before
//    public void setup(){
//        driver = DriverHelper.getDriver();
//        driver.get(ConfigReader.readProperty("blaze_url"));
//    }
//
//    @After
//    public void tearDown(){
//        driver.quit();
//    }




}
