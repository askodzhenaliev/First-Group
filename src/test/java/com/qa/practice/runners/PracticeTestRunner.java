package com.qa.practice.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/practice", //location of the feature files
        glue = "com/qa/practice/stepdefinitions"//location of the step definition classes
//        dryRun = false, //to get snips without executing the step
//        tags = "@regression" //all about filtration of scenarios

)

public class PracticeTestRunner {

}
