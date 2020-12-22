package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import manager.AppiumDriverManager;
import pages.MainPage;

public class MainSteps {

    MainPage mainPage = new MainPage(AppiumDriverManager.getDriver());

    @Then("I see the result is completed")
    public void resultIsCompleted() {
        assert mainPage.percentStr.isDisplayed();
    }

    @Then("I see there is a candidate elected")
    public void candidateElected() {
        assert mainPage.electedStr.isDisplayed();
    }

    @Given("I open one of the candidates")
    public void openCandidate() {
        mainPage.firstCandidateAvatar.click();
    }

    @Given("I click on favorite tab")
    public void openFavoriteTab() {
        mainPage.favoriteTab.click();
    }

    @Given("I see the candidate is present")
    public void favoriteListIsNotEmpty() {
        assert mainPage.electedStr.isDisplayed();
    }
}
