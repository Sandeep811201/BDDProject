package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features"},
        glue = {"stepDefinitions"},
        tags = "@SauceDemo",
        plugin = {"pretty:target/prettyReport.txt", "html:target/cucumber-htmlreport", "junit:target/cucumber-reports/Cucumber.xml"},
        monochrome = true
)
public class Runner {

}
