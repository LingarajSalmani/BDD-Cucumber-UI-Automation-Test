package com.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstTest {
    public static void main(String[] args) throws InterruptedException {
        // Specify the path to the ChromeDriver executable.
       // System.setProperty("webdriver.chrome.driver", "C:\\Users\\salmanil\\Desktop\\drivers\\chromedriver.exe");
        //C:\Users\salmanil\Desktop\drivers\version1191\chrome-win64
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\salmanil\\Desktop\\drivers\\version119\\chromedriver-win64\\chromedriver.exe");

        //C:\Users\salmanil\Desktop\drivers\version119\chrome-win64
        // Initialize the WebDriver object to open Chrome browser.
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();

        // Open a website (e.g., Google).
       // driver.navigate().to("https://www.google.com");
        driver.get("https://www.google.com");
        //driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

       // driver.findElement(By.id("APjFqb")).sendKeys("ind vs aus t20 series squad");
        WebElement searchbox=driver.findElement(By.id("APjFqb"));
        String text="Ind vs aus t20 series squad";

        sendKeysWithJS(driver, searchbox, text);

        WebElement clickOnSearcheButton= driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
        clickElementWithJS(driver, clickOnSearcheButton);


        //WebElement clickOnSearchedText= driver.findElement(By.xpath("//a//div[contains(text(), 'Ind vs aus t20 series squad')]"));
       WebElement clickOnSearchedText=findElementByDynamicString(driver, text);
        scrollToElement(driver, clickOnSearchedText);
        clickElementWithJS(driver, clickOnSearchedText);



        // Close the browser.
        driver.quit();
    }
    public static void clickElementWithJS(WebDriver driver, WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", element);
    }

    public static void sendKeysWithJS(WebDriver driver, WebElement element, String text) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].value = arguments[1];", element, text);
    }

    public static void scrollToElement(WebDriver driver, WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        // Scroll to the element using JavaScript
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static WebElement findElementByDynamicString(WebDriver driver, String dynamicString) {
        // Build the XPath with the dynamic string
        String xpath = "//div[contains(text(), '" + dynamicString + "')]";

        //Find the element using the dynamic XPath
        return driver.findElement(By.xpath(xpath));
    }


}





