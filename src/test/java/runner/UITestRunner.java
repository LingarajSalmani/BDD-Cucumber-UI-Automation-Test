package runner;

import com.cucumber.listener.Reporter;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import utilites.ConfigurationReader;
import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features"},
        glue = {"stepDefinitions"},
        //tags= { "@IntegrationTesting" },
        plugin = {"pretty", "html:target/cucumber-reports"},
       // plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target//cucumber-reports//report.html"},
        monochrome = true
)
public class UITestRunner {

    static ConfigurationReader fileReader=new ConfigurationReader();
    @AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File(fileReader.getReportConfigPath()));
    }
}
