package com.tests.Cucumber;

import com.tests.Managers.WebDriverManager;
import com.tests.Managers.WebPageObjectManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestContext {

  private WebDriverManager webDriverManager;
  private WebPageObjectManager webPageObjectManager;

public TestContext(){
    webDriverManager=new WebDriverManager();
    webPageObjectManager=new WebPageObjectManager(webDriverManager.getDriver());
}
public WebDriverManager getWebDriverManager(){
    return webDriverManager;
}

    public WebPageObjectManager getWebPageObjectManager() {
        return webPageObjectManager;
    }
}

/*
package Cucumber;

import Managers.WebDriverManager;
import Managers.WebPageObjectManager;

public class TestContext {
    private WebDriverManager webDriverManager;
    private WebPageObjectManager webPageObjectManager;

    public TestContext() {
        webDriverManager = new WebDriverManager();
        //environmentType = FileReaderManager.getInstance().getConfigReader().getEnvironment();

        webPageObjectManager = new WebPageObjectManager(webDriverManager.getDriver());


    }


    public WebDriverManager getWebDriverManager() {
        return webDriverManager;
    }

    public WebPageObjectManager getWebPageObjectManager() {
        return webPageObjectManager;
    }
}

*/
