@RegressionTest  @CRRR
Feature: CurrencyRate Feature

  Background: Login into the Application
    Given user navigate to CurrencyRate screen


  Scenario: 725006_Create Currency Rate With All Fields
    Given click on Add New Currency Rate button
    When  Enters all the Currency Rate fields
    Then  click the Currency Rate save button
    And validation message should be displayed on Currency Rate screen


  Scenario: Create Currency Rate With mandatory Fields
    Given click on Add New Currency Rate button
    When  Enter the Currency Rate details with mandatory fields
    Then  click the Currency Rate save button
    And validation message should be displayed on Currency Rate screen


  Scenario: 725013_Search Currency Rate Globally
    Given Enter Currency and click on Search Icon
    And Verify Search Result is displayed


  Scenario: 726638_Search Currency rate with invalid Data
    When user enter  "No Data"  in Currency search box
    And user should able to view "No data found" in Currency list screen


  Scenario: 725023_Filter currency rate with currency and rate and verify respective currency displayed
    Given click on the Currency rate filter  button
    When Enter the Currency and rate
    Then Click on Currency Filter Search Button
    And Verify Currency and Rate are displayed


  Scenario: 725025_Filter currency rate with currency and verify respective currency displayed
    Given click on the Currency rate filter  button
    When Enter the Currency
    Then Click on Currency Filter Search Button
     And Verify Currency is displayed


  Scenario: 725024_Filter currency rate with rate and verify respective displayed
    Given click on the Currency rate filter  button
    When Enter the rate
    Then Click on Currency Filter Search Button
    And Verify Rate is displayed


  Scenario: 725026_Filter currency rate with description and verify respective currency displayed
    Given click on the Currency rate filter  button
    When Enter the description
    Then Click on Currency Filter Search Button
    And Verify description is displayed



  Scenario: 725027_Filter currency rate with currency against and verify respective currency displayed
    Given click on the Currency rate filter  button
    When Select the Currency Against
    Then Click on Currency Filter Search Button
    And Verify Currency Against is displayed


  Scenario: 725028_Filter currency rate with rate date and verify respective currency displayed
    Given click on the Currency rate filter  button
    When Enter the Rate date
    Then Click on Currency Filter Search Button
    And Verify Rate date is displayed


  Scenario: 725008_Edit existing Currency Rate
    Given Enter Currency and click on Search Icon
    When Change the Currency and Rate
    Then click the Currency Rate save button
    Then "edit message" edit validation message should be displayed on Currency screen


  Scenario:725010_Export the Currency rate List
    Given click on the Export Button check whether the Currency rate List is downloaded
