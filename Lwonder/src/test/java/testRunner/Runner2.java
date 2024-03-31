package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Scenario2.feature", glue = {
"stepDefinitions" }, monochrome = true, plugin = { "pretty",
        "html:target/TestReports/Scenario2.html" }, tags = "@pk002")
public class Runner2  {

}

