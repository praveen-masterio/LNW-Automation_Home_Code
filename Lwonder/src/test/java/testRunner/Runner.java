package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Scenario1.feature", glue = {
"stepDefinitions.StepDefinitions" }, monochrome = true, plugin = { "pretty",
        "html:target/TestReports/Scenario1.html" }, tags = "@pk001")
public class Runner  {

}



