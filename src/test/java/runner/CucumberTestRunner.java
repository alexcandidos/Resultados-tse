package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import manager.AppiumDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // Run the scenarios specified by tags
        //tags = {""},

        // Define the features files location
        features = {"src/main/resources/features"},

        // Define the steps files location
        glue = {"stepDefinition"},

        // Readable format of the console output from Cucumber
        monochrome = true,

        // Code snippets will be created using camelcase
        snippets = CucumberOptions.SnippetType.CAMELCASE,

        // Plugins
        plugin = {"pretty", "html:target/cucumber-html-report"}
        )
class CucumberTestRunner {

        @BeforeClass
        public static void setUp(){
                AppiumDriverManager.getDriver();
        }

        @AfterClass
        public static void tearDown(){
                AppiumDriverManager.closeDriver();

        }
}
