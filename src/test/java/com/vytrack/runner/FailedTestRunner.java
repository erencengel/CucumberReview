package com.vytrack.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@target/rerun.txt", //tell location of future files
        glue = "com/vytrack/step_definitions",     //tell where code is, // check if we have missing part
        plugin = {"html:target/default-html-reports"}
)
public class FailedTestRunner {

}
