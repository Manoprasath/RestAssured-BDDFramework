package com.marusputin.testrunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/marusputin/features",
        glue = {"com/marusputin/stepDefinitions"},
        dryRun = false,
        monochrome = true,
        plugin = {"pretty",
                "html:test-output.html",
                "json:target/cucumber-reports/Cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml"
        })
public class TestRunner {
}
