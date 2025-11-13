package com.qa.smartbear.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features/smartbear",
        glue = "com/qa/smartbear/definitions",
        plugin = {"pretty", "html:target/uiReport.html", "rerun:target/uiFailedTests.txt"}

)

public class SmartBearRunner {

}
