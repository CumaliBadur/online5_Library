package com.Library.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },
        strict = true,  //giving error with this
        features ="src/test/resources/features",
        glue = "com/Library/step_definitions",
        dryRun = false,
        tags = "@login"
)
public class CukesRunner {
}
