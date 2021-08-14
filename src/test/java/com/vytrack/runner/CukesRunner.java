package com.vytrack.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//specifying to run it with
@RunWith(Cucumber.class)
/*providing option for cucumber to provide
 * where is your feature file    |  features = "feature file folder path here"
 * where is  the code that match the steps in cucumber | glue = "step defitions folder path here"
 * whether to run the actual code or just to check if you have missing steps | dryRun = true/false
 * what kind of report you want to get and other options | plugins= ...
 * which scenarios or feature you want to run | tags = @something and @somethingelse
 */

@CucumberOptions(features = "src/test/resources/features", //tell location of future files
                glue = "com/vytrack/step_definitions",     //tell where code is, // check if we have missing part
                dryRun = false,
                plugin = {"json:target/cucumber.json",
                          "html:target/default-html-reports",
                            "rerun:target/rerun.txt"},
                tags = "@wip3 or @store"
)

public class CukesRunner {
}
