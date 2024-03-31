package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Scenario3.feature", glue = {
"stepDefinitions" }, monochrome = true, plugin = { "pretty",
        "html:target/TestReports/Scenario3.html" }, tags = "@pk003")
public class Runner3 {

}

