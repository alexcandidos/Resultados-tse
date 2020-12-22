package stepDefinition;

import io.cucumber.java.en.When;
import manager.AppiumDriverManager;
import pages.CandidatePage;

public class CandidateSteps {

    CandidatePage candidatePage = new CandidatePage(AppiumDriverManager.getDriver());

    @When("I add to favorites")
    public void resultIsCompleted() {
        candidatePage.addToFavorite.click();
        assert candidatePage.favorited.isDisplayed();
    }

    @When("I return to home page")
    public void closeWindow() {
        candidatePage.closeWindow.click();
    }

}
