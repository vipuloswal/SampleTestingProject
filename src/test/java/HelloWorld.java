import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

    public static void main(String args[]){
        System.out.println("Hello World");

        //System.setProperty("webdriver.driver","\\Documents\\Learning\\Selenium\\chromedriver");
        WebDriver driver = new ChromeDriver();
        }
    }