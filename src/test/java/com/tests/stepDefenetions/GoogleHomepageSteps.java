package com.tests.stepDefenetions;

import com.tests.Cucumber.TestContext;


import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import com.tests.pageObjects.GoogleHomePage;
import org.testng.Assert;

public class GoogleHomepageSteps{


    // Test context to share information between steps
  TestContext testContext;
    GoogleHomePage homePage;

    // Constructor to inject TestContext
    public GoogleHomepageSteps(TestContext testContext) {
        this.testContext = testContext;
        homePage=testContext.getWebPageObjectManager().getHomePage();


    }

    @Given("User is navigates to google home page")
    public void userNavigatesToGoogleHomePage() throws InterruptedException {

       homePage.openGoogleChrome();
       //Thread.sleep(10000);
    }

    @When("User enters the text and click on search button")
    public void userEntersTextAndClicksSearch() {
        homePage.enterTextInSearchBox();
        homePage.clickOnSearchButton();
    }

    @When("User enters the text {string} and click on search button")
    public void user_enters_the_text_and_click_on_search_button(String string) {
        homePage.enterTextInSearchBox(string);
        homePage.clickOnSearchButton();
    }

    @When("User provide the text from property file and click on search button")
    public void user_provide_the_text_from_property_file_and_click_on_search_button() {
        // Write code here that turns the phrase above into concrete actions
        homePage.enterTextInSearchBoxFromPropertyFile();
        homePage.clickOnSearchButton();

    }
    @Then("Results should be display")
    public void resultsShouldBeDisplayed() {
        homePage.verifySearchedText();
    }

    @Then("Searched text is displayed in results screen")
    public void searchedTextIsDisplayedInResults() {

    }

    @Then("Google home page should be displayed with results")
    public void google_home_page_should_be_displayed_with_results() {

        boolean isPresent=homePage.verifyGoogleLogoIsDisplayed();
        Assert.assertEquals(isPresent, true);
    }

/*//*********************************************************

    @Given("User is navigates to google home page")
    public void user_is_navigates_to_google_home_page() {
        // Write code here that turns the phrase above into concrete actions
        homePage.openGoogleChrome();
    }
    @When("User enters the text and click on search button")
    public void user_enters_the_text_and_click_on_search_button() {
        homePage.enterTextInSearchBox();
        homePage.clickOnSearchButton();
    }
    @Then("Results should be display")
    public void results_should_be_display() {
        homePage.verifySearchedText();
    }
    @Then("Searched text is displayed in results screen")
    public void searched_text_is_displayed_in_results_screen() {

    }*/


    // Don't forget to close the WebDriver after the scenario
    // This can be done using an @After hook or in an After hook in your runner class
    // For simplicity, we'll just close the WebDriver here

}


