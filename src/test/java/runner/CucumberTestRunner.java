package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:build/cucumber-html-report"},
features = {"src/main/resources/features"},
glue = {"stepDefinition"})

public class CucumberTestRunner {
}
