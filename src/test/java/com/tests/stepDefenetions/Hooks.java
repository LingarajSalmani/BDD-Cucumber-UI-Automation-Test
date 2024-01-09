package com.tests.stepDefenetions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.Status;
import com.tests.Managers.ExtentManager;
import com.tests.Managers.WebDriverManager;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;



public class Hooks {
    private ExtentReports extent = ExtentManager.getInstance();
    private ExtentTest test;
    WebDriver driver;
    WebDriverManager we_driver=new WebDriverManager();
    @Before
    public void beforeScenario(Scenario scenario) {
        String scenarioName = scenario.getName();
        test = extent.createTest(scenarioName);
    }

    @After
    public void closeDriver(Scenario scenario){
        if (scenario.isFailed()) {
            test.log(Status.FAIL,
                    "Scenario Failed");
        } else {
            test.log(Status.PASS, "Scenario Passed");
        }

        extent.flush();
      driver=we_driver.driver;
        driver.close();


        }
    }

