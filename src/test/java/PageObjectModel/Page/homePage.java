package PageObjectModel.Page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class homePage extends PageObject {

    @FindBy(xpath ="//label[contains(@class, 'radio__secondary')]")
    List<WebElement> tripTypeOptionsList;

    public List<WebElement> getTripTypeOptionsList(){
        return tripTypeOptionsList;
    }

    public void openApplicationWithURL(String url) {
        open();
        //System.setProperty("webdriver.chrome.driver", "C:\\vipul-development\\Softwares\\chromedriver_win32\\chromedriver.exe");
        //getDriver() = new ChromeDriver();
        getDriver().get(url);
        getDriver().manage().window().maximize();
    }

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
    }
}