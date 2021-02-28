package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/AppFeatures/UberBooking.feature"},
		glue = {"AppStepDefinitions"},
		tags= "@Prod",
		plugin = "pretty")
public class UberTest {

}
