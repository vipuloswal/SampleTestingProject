package PageObjectModel.BDD;

import PageObjectModel.Step.homePageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class homePageBDD {

    @Steps
    homePageSteps homePageStepsObj;

    @Given("^User launch application with (.*)$")
    public void openApplication(String url) {
        homePageStepsObj.openApplicationWithURL(url);
    }

    @When("^User select the trip type as (.*)$")
    public void selectTripType(String tripType) {
        homePageStepsObj.selectTripType(tripType);
    }

    @When("^User search flight using (.*) and (.*) location$")
    public void selectLocation(String sourceLocation, String destinationLocation) {
        homePageStepsObj.setSourceAndDestinationLocation(sourceLocation,destinationLocation);
        System.out.println("User entered source and destination locations to search flight options");
    }

    @Then("^User can confirm booking$")
    public void validateWebElementOperations() {
        System.out.println("User confirmed booking");
    }
}