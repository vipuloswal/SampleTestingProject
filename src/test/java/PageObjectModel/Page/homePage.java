package PageObjectModel.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class homePage {

    WebDriver driver;

    public homePage(WebDriver driver){
        this.driver=driver;
    }

    By tripTypeOptions = By.xpath("//label[contains(@class, 'radio__secondary')]");

    List<WebElement> tripTypeOptionsList = driver.findElements(tripTypeOptions);

    public List<WebElement> getTripTypeOptionsList(){
        return tripTypeOptionsList;
    }
}