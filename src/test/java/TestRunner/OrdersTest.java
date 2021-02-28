package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/AppFeatures/Orders.feature" },
             glue = {"AppStepDefinitions" ,"MyHooks"}, 
             tags= "@Smoke or @Regression",
             plugin = {"pretty",
            		 "json:target/MyReports/report.json",
            		 "junit:target/MyReports/report.xml"
             },
             publish=true,
             dryRun = true,
             //strict = true,
             monochrome = true)
public class OrdersTest {

}
