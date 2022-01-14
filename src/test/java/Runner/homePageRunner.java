package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:features/searchFlight.feature"},
                       glue = {"PageObjectModel.BDD"})
                        //glue = {"test.java.PageObjectModel.BDD"})
public class homePageRunner {
}