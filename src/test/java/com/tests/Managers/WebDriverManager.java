package com.tests.Managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverManager {
    public static WebDriver driver;
   // private EventFiringWebDriver driver;
   // public WebDriverManager webDriverManager=new WebDriverManager();
    public static WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\salmanil\\Desktop\\drivers\\version119\\chromedriver-win64\\chromedriver.exe");

        //C:\Users\salmanil\Desktop\drivers\version119\chrome-win64
        // Initialize the WebDriver object to open Chrome browser.
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();

        return driver;
    }


}
