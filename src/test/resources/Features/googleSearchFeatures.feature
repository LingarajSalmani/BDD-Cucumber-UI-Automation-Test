Feature: Google Search Testing

  @RegressionTesting @FunctionalTesting @IntegrationTesting
  Scenario: Verify user is able to search the content in google home page
    Given User is navigates to google home page
    When User enters the text and click on search button
    Then Google home page should be displayed with results



  @RegressionTesting @FunctionalTesting
  Scenario Outline: Verify user is able to search the different contents in google home page
    Given User is navigates to google home page
    When User enters the text "<text>" and click on search button
    Then Google home page should be displayed with results

    Examples:
      | text     |
      | Ind vs AUS t20 series squad    |
      | Ind vs SA t20 series squad    |

  @RegressionTesting
  Scenario: Verify user is able to search the content in google home page using property file
    Given User is navigates to google home page
    When User provide the text from property file and click on search button
    Then Google home page should be displayed with results

  #Scenario: Verify user is able to search the content in google home page using data provider in TestNG
    #Given User is navigates to google home page
   # When User enters the text and click on search button
    #Then Google home page should be displayed with results
     # Then Results should be display
   # And Searched text is displayed in results screen
