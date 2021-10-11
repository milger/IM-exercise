package practice.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import practice.pages.NewCarsPage;
import practice.questions.FilteredCars;
import practice.tasks.SelectMake;
import practice.tasks.interactions.ClickOn;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.not;

public class NewCarsSteps {
    @Steps
    SelectMake selectMake;
    ClickOn clickOn;
    FilteredCars filteredCars;

    @When("^select the \"(.*)\" make$")
    public void selectTheMake(String makeName) {
        selectMake.inTheDropdown(makeName);
    }

    @And("^click Find Your Next Car$")
    public void clickFindYourNextCar() {
        clickOn.elementBy(NewCarsPage.BUTTON_FIND_YOUR_NEXT_CAR);
    }

//    @Then("^\"(.*)\" model should be displayed in the list$")
//    public void modelShouldBeDisplayedInTheList(String modelName) {
//        assertThat(filteredCars.cardTitleList(), hasItem(modelName));
//    }

    @Then("^\"(.*)\" model (should not be displayed|should be displayed) in the list$")
    public void modelShouldNotBeDisplayedInTheList(String modelName, String expectation) {
        if (expectation.equals("should be displayed"))
            assertThat(filteredCars.cardTitleList(), hasItem(modelName));
        else
            assertThat(filteredCars.cardTitleList(), not(hasItem(modelName)));
    }
}
