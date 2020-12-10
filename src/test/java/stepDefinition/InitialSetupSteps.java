package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.AppiumDriverManager;
import pages.InitialSetupPage;
import pages.MainPage;
import pages.SearchPage;

public class InitialSetupSteps {

    private InitialSetupPage initialSetupPage;
    private MainPage mainPage;
    private SearchPage searchPage;

    @Given("I launch the app by the first time")
    public void launchApp() {
        initialSetupPage = new InitialSetupPage(AppiumDriverManager.getDriver());
        mainPage = new MainPage(AppiumDriverManager.getDriver());
        searchPage = new SearchPage(AppiumDriverManager.getDriver());
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
