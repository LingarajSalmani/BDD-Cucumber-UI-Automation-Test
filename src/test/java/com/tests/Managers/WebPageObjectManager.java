package com.tests.Managers;

import org.openqa.selenium.WebDriver;
import com.tests.pageObjects.GoogleHomePage;


public class WebPageObjectManager {
    public WebDriver driver;
    private GoogleHomePage homepage;

    public WebPageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public GoogleHomePage getHomePage() {
        return (homepage == null) ? homepage = new GoogleHomePage(this.driver) : homepage;
    }

}






