package com.qa.weborder.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/weborder", //location of the feature files
        glue = "com/qa/weborder/stepdefinition",//location of the step definition classes
        dryRun = false, //to get snips without executing the step
        tags = "@regression" //all about filtration of scenarios

)

public class WebOrderRunner {

}
