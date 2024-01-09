package utilites;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utilites {

    WebDriver driver;
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
