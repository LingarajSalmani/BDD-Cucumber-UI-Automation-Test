package com.tests.pageObjects;





import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;



public class BasePage {
  public  WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(this.driver, this);
        //this.driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }




    /*@BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\salmanil\\Desktop\\drivers\\version119\\chromedriver-win64\\chromedriver.exe");
         driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

    }

    @AfterClass
    public void teardown(){
        driver.quit();
    }*/
}
