package com.tests.pageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilites.ConfigurationReader;

import java.io.IOException;
import java.util.Properties;

public class GoogleHomePage extends BasePage {

//WebDriver driver;

  public GoogleHomePage(WebDriver driver) {
    super(driver);

  }

  ConfigurationReader configurationReader = new ConfigurationReader();

  String text = configurationReader.getTestString();
  @FindBy(id ="APjFqb" )
  WebElement searchbox;
  @FindBy(xpath ="(//input[@value='Google Search'])[2]" )
  WebElement SearcheButton;

  @FindBy(xpath="//span[contains(text(), 'Including results for')]//a")
  WebElement searchedText;
  @FindBy(xpath="//a[@title='Go to Google Home']")
  WebElement googleLogo;
  String text2="Ind vs aus t20 series squad";


  public void enterTextInSearchBox(){
    sendKeysWithJS(driver, searchbox, text2);
  }
  public void enterTextInSearchBoxFromPropertyFile(){
    sendKeysWithJS(driver, searchbox, text);
  }

  public void enterTextInSearchBox(String string){
    sendKeysWithJS(driver, searchbox, string);
  }

  @DataProvider(name = "data-provider")
  public Object[][] dpMethod(){
    return new Object[][] {{"First-Value"}, {"Second-Value"}};
  }
@Test(dataProvider = "data-provider")
  public void enterTextInSearchBox3(String string){
    sendKeysWithJS(driver, searchbox, string);
  }
  public void clickOnSearchButton(){
    //Utilites.clickElementWithJS(driver, clickOnSearcheButton);
    SearcheButton.click();
  }
  public void openGoogleChrome(){

    driver.get("https://www.google.com");
  }
  public void verifySearchedText(){

    //WebElement clickOnSearchedText= findElementByDynamicString(driver, text);
    boolean isPresent=searchedText.isDisplayed();
    Assert.assertEquals(Boolean.TRUE, isPresent);
    scrollToElement(driver, searchedText);
    clickElementWithJS(driver, searchedText);

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

  public static void clickElementWithJS(WebDriver driver, WebElement element) {
    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    jsExecutor.executeScript("arguments[0].click();", element);
  }

  public static void sendKeysWithJS(WebDriver driver, WebElement element, String text) {
    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    jsExecutor.executeScript("arguments[0].value = arguments[1];", element, text);
  }

  public boolean verifyGoogleLogoIsDisplayed(){
    boolean isPresent = verifyElementIsDisplayed(googleLogo);

    return isPresent;
  }
  public boolean verifyElementIsDisplayed(WebElement element){
    boolean isPresent;
    if(element.isDisplayed()){
      isPresent=true;

    }
    else{
      isPresent=false;
    }

    return isPresent;
  }








  //WebElement clickOnSearchedText= driver.findElement(By.xpath("//a//div[contains(text(), 'Ind vs aus t20 series squad')]"));





  // Close the browser.

}

