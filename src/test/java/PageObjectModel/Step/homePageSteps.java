package PageObjectModel.Step;

import PageObjectModel.Page.homePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class homePageSteps extends ScenarioSteps {

    homePage homePage;
    /*public homePageSteps(WebDriver driver){
        this.driver=driver;
    }*/

    @Step
    public void openApplicationWithURL(String url){
        //below line will be added for windows to set chrome driver path, in case of Mac we have placed chrome driver to
        //Users/vipuloswal/Bin
        homePage.openApplicationWithURL(url);
    }

    @Step
    public void selectTripType(String tripType) {

        /*By tripTypeOptions = By.xpath("//label[contains(@class, 'radio__secondary')]");

        List<WebElement> tripTypeOptionsList = driver.findElements(tripTypeOptions);

        if (tripType.equalsIgnoreCase("One way")) {
            tripTypeOptionsList.get(0).click();
        } else if (tripType.equalsIgnoreCase("Round trip")) {
            tripTypeOptionsList.get(1).click();
        } else if (tripType.equalsIgnoreCase("Multi-city")) {
            tripTypeOptionsList.get(2).click();
        }
*/
        if (tripType.equalsIgnoreCase("One way")) {
            homePage.getTripTypeOptionsList().get(0).click();
        } else if (tripType.equalsIgnoreCase("Round trip")) {
            homePage.getTripTypeOptionsList().get(1).click();
        } else if (tripType.equalsIgnoreCase("Multi-city")) {
            homePage.getTripTypeOptionsList().get(2).click();
        }
    }

    public void setSourceAndDestinationLocation(String sourceLocation, String destinationLocation) {

    }
}