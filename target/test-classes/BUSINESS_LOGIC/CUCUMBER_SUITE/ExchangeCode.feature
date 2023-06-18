@RegressionTest    @ExchangeCode
Feature: Exchange Code Feature

  Background: Login into the Application
    Given user navigate to Exchange code screen


  Scenario:724632_Create Exchange Code With mandatory Fields
    Given click on Add New Exchange button
    When  Enters mandatory fields for Exchange code
    Then  click the Exchange save button
    And validation message should be displayed on Exchange Code screen

  Scenario: 724633_Create Exchange Code With All Fields
    Given click on Add New Exchange button
    When  Enters all the fields
    Then  click the Exchange save button
    And validation message should be displayed on Exchange Code screen


  Scenario: Create Exchange Code With mandatory Fields and click Cancel Yes button
    Given click on Add New Exchange button
    When  Enters mandatory fields for Exchange code and click no
    Then  click the Exchange Cancel Yes button


  Scenario: Create Exchange Code With mandatory Fields and click Cancel No button
    Given click on Add New Exchange button
    When  Enters mandatory fields for Exchange code and click no
    Then  click the Exchange Cancel No button


  Scenario: 724639_Search Exchange  Code Globally
    Given Enter Exchange code and click on Search Icon
     Then Verify the Exchange Code search result


  Scenario: 726635_Search Exchange Code with invalid Data
    When user enter  "No Data"  in Exchange search box
    And user should able to view "No data found" in Exchange list screen


  Scenario: 724643_Multiple Search - filter Exchange Code with Idsi and DTC
    Given click on the Exchange Code filter  button
    When Enter the DTC and Idsi
    And Click on Exchange Filter Search Button
    And Verify Idsi and Dtc are displayed


  Scenario: 724641_filter Exchange Code with Idsi
    Given click on the Exchange Code filter  button
    When Enter the  Idsi
    And Click on Exchange Filter Search Button
    And Verify Idsi is displayed


  Scenario: 724652_filter Exchange Code with Dtc Market
    Given click on the Exchange Code filter  button
    When Enter the  Dtc Market
    And Click on Exchange Filter Search Button
    And Verify Dtc Market is displayed

  Scenario: 724653_filter Exchange Code with Occ Acronym
    Given click on the Exchange Code filter  button
    When Enter the  Occ Acronym
    And Click on Exchange Filter Search Button
    And Verify Occ Acronym is displayed


  Scenario: 724654_filter Exchange Code with Bluesheet
    Given click on the Exchange Code filter  button
    When Enter the  Bluesheet
    And Click on Exchange Filter Search Button
    And Verify BlueSheet is displayed


  Scenario: 724656_filter Exchange Code with  Exchange Name
    Given click on the Exchange Code filter  button
    When Enter the Exchange Name
    And Click on Exchange Filter Search Button
    And Verify Exchange Name is displayed


  Scenario: 724655_filter Exchange Code with Mic Code
    Given click on the Exchange Code filter  button
    When Enter the Mic Code
    And Click on Exchange Filter Search Button
    And Verify Mic Code is displayed



    Scenario: 724646_Reset - filter Exchange Code and click on Reset Button
    Given click on the Exchange Code filter  button
    When Enter the Mic Code
    And Click on Exchange Filter Reset Button


  Scenario: 724650_Edit existing Exchange Code
    Given Click the Existing Exchange Code
    When Change the Exchange code,Mic code and Idsi
    Then click the Exchange save button
    And "edit message" edit validation message should be displayed on Exchange screen



  Scenario:724637_Export the Exchange Code List
    Given click on the Export Button check whether the Exchange Code List is downloaded
