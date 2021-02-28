package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeatures/Login.feature"},
        glue= {"AppStepDefinitions"},
        plugin= ("pretty"),
        monochrome = true,
        publish = true)
public class LoginTest {

}
