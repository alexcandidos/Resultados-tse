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
    private MainPage mainPage = new MainPage(AppiumDriverManager.getDriver());;
    private SearchPage searchPage = new SearchPage(AppiumDriverManager.getDriver());

    @Given("I launch the app by the first time")
    public void launchApp() {
        initialSetupPage = new InitialSetupPage(AppiumDriverManager.getDriver());
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
        assert mainPage.selectPlaceStr.isDisplayed();
    }

    @Then("I select a location by UF {string}")
    public void selectLocationByUF(String option) {
        mainPage.selectPlace();
        searchPage.selectState(option);
    }

    @Then("I select the turno {string}")
    public void selectTurno(String option) {
        searchPage.selectTurno(option);
    }
}
