package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.AppiumDriverManager;
import pages.InitialSetupPage;
import pages.MainPage;
import pages.SearchPage;

import java.net.MalformedURLException;

public class InitialSetupSteps {

    InitialSetupPage initialSetupPage;
    MainPage mainPage;
    SearchPage searchPage;

    @Given("I launch the app by the first time")
    public void launchApp() throws MalformedURLException, InterruptedException {
        initialSetupPage = new InitialSetupPage(AppiumDriverManager.createDriver("android"));
        mainPage = new MainPage(AppiumDriverManager.createDriver("android"));
        searchPage = new SearchPage(AppiumDriverManager.createDriver("android"));
    }

    @When("I click on {string}")
    public void clickOn(String option) {
        initialSetupPage.click(option);
    }

    @When("I scroll to the end")
    public void scrollToEnd(){
        initialSetupPage.scrollToEnd();
    }

    @Then("I am on the app home page")
    public void homePageReached() {
        mainPage.selectPlace();
    }

    @Then("I select the uf")
    public void selectUf() {
        searchPage.selectUf();
        searchPage.state();
    }
}
