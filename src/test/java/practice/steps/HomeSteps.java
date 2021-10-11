package practice.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import practice.pages.HomePage;
import practice.tasks.interactions.ClickOn;

public class HomeSteps {
    @Steps
    HomePage homePage;
    ClickOn clickOn;

    @Given("^I have visited to Cars Direct page$")
    public void visitPracticePage() {
        homePage.open();
    }

    @When("^I click on \"(.*)\" button$")
    public void clickOnButton(String text) {
        clickOn.homeButton(text);
    }
}
