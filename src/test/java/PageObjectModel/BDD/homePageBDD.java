package PageObjectModel.BDD;

import PageObjectModel.Step.homePageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class homePageBDD {

    WebDriver driver;
    homePageSteps homePageStepsObj;

    @Given("^User launch application with (.*)$")
    public void openApplication(String url) {//throws io.cucumber.java.PendingException {
        //below line will be added for windows, in case of Mac we have placed chrome driver to
        //Users/vipuloswal/Bin
        //System.setProperty("webdriver.driver","\\Documents\\Learning\\Selenium\\chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        //homePageStepsObj.launchUrl(url);
    }

    @When("^User search flight using (.*) and (.*) location$")
    public void selectOperation(String sourceLocation, String destinationLocation) {
        System.out.println("User entered source and destination locations to search flight options");
    }

    @When("^User select the trip type as (.*)$")
    public void selectTripType(String tripType) {

        //homePageSteps homePageStepsObj=new homePageSteps(driver);
        //homePageStepsObj.selectTripType(tripType);
        List<WebElement> tripTypeOptions = driver.findElements(By.xpath("//label[contains(@class, 'radio__secondary')]"));

        if (tripType.equalsIgnoreCase("One way")) {
            tripTypeOptions.get(0).click();
        } else if (tripType.equalsIgnoreCase("Round trip")) {
            tripTypeOptions.get(1).click();
        } else if (tripType.equalsIgnoreCase("Multi-city")) {
            tripTypeOptions.get(2).click();
        }
    }

    @Then("^User can confirm booking$")
    public void validateWebElementOperations() {
        System.out.println("User confirmed booking");
    }
}