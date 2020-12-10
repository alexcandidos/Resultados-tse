package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-html-report"},
        features = {"src/main/resources/features"},
        glue = {"stepDefinition"},
        monochrome = true
        )

public class CucumberTestRunner {
}
