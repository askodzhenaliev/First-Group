package com.qa.smartbear.definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class SmartBearHook {

    public WebDriver driver;

    @Before
    public void setup(){
        driver = DriverHelper.getDriver();
        driver.get(ConfigReader.readProperty("smartbear"));
    }

    @After
    public void teardown(){
        driver.quit();
    }


}
