package PageObjectModel.Step;

import PageObjectModel.Page.homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class homePageSteps {

    WebDriver driver;

    /*public homePageSteps(WebDriver driver){
        this.driver=driver;
    }*/

    public void launchUrl(String url){
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void selectTripType(String tripType) {

        homePage homePageObj=new homePage(driver);

        By tripTypeOptions = By.xpath("//label[contains(@class, 'radio__secondary')]");

        List<WebElement> tripTypeOptionsList = driver.findElements(tripTypeOptions);

        if (tripType.equalsIgnoreCase("One way")) {
            tripTypeOptionsList.get(0).click();
        } else if (tripType.equalsIgnoreCase("Round trip")) {
            tripTypeOptionsList.get(1).click();
        } else if (tripType.equalsIgnoreCase("Multi-city")) {
            tripTypeOptionsList.get(2).click();
        }
        /*if (tripType.equalsIgnoreCase("One way")) {
            homePageObj.getTripTypeOptionsList().get(0).click();
        } else if (tripType.equalsIgnoreCase("Round trip")) {
            homePageObj.getTripTypeOptionsList().get(1).click();
        } else if (tripType.equalsIgnoreCase("Multi-city")) {
            homePageObj.getTripTypeOptionsList().get(2).click();
        }*/
    }

    public void closeBrowser(){
        driver.quit();
    }
}