@RegressionTest  @SettlementDateRules
Feature: Settlement Date Rules Feature

  Background: User is successfully logged in
    Given user navigate to Settlement screen

  @SmokeTestSet1
  Scenario: 725037_Create Settlement Rules With All Fields
    Given click on Add New Rules button
    When user enters the Settlement details with All fields
    Then Click on Save button
    And validation message should be displayed on Settlement screen

  Scenario: Create Settlement Rules With All Fields
    Given click on Add New Rules button
    When user enters the Settlement details with All fields
    Then user clicks Cancel button Yes


  Scenario: Create Settlement Rules With All Fields
    Given click on Add New Rules button
    When user enters the Settlement details with All fields
    Then user clicks Cancel button No

  @SmokeTestSet1
  Scenario: 725043_Search Settlement globally
    When Enter keyword
    Then user should see the Settlement details

  @SmokeTestSet1
  Scenario: 725044_Search Settlement with invalid Data
    When user enter  "No Data"  in search box
    And user should able to view "No data found" in table list screen


  Scenario: 710712_Multiple Search - Filter Settlement with Number of days and security type
    Given click on the Settlement filter by button
    When enter the Number of days and Security Type
    And Click on Search Button
    And  Check whether Number of days and security type is displayed in the List Screen


  Scenario: 710710_Filter Settlement with Number of days
    Given click on the Settlement filter by button
    When enter the Number of days
    And Click on Search Button
    And  Check whether Number of days is displayed in the List Screen

  @SmokeTestSet1
  Scenario:725055_Filter Settlement with security type
    Given click on the Settlement filter by button
    When enter Security Type
    And Click on Search Button
    And  Check whether Security type is displayed in the List Screen

  @SmokeTestSet1
  Scenario: 725053_Filter Settlement with Asset Type
    Given click on the Settlement filter by button
    When enter the Asset Type
    And Click on Search Button
    And  Check whether Asset Type is displayed in the List Screen

  @SmokeTestSet1
  Scenario: 725054_Filter Settlement with Country Code
    Given click on the Settlement filter by button
    When enter the Country code
    And Click on Search Button
    And  Check whether Country Code is displayed in the List Screen

  @SmokeTestSet1
  Scenario: 725049_Reset the Filter fields
    Given click on the Settlement filter by button
    When enter the Number of days and Security Type
    And Click on Reset Button

  @SmokeTestSet1
  Scenario: 725038_Edit existing settlement rules
    When Enter keyword
    Given Click the Existing Settlement Rule
    When Update all the settlement fields
    Then Click on Save button
    And "edit message" edit validation message should be displayed on Settlement screen

  Scenario:725040_Export the Settlement List
    Given click on the Export Button check whether the Settlement List is downloaded

  Scenario:Verify the Settlement View Column Functionality
    Given click on the Settlement View column list and select the columns
