@RegressionTest   @blotter  @SmokeTest
Feature: Blotter Feature

  Background: User is successfully logged in
    And user navigate to blotter screen


  Scenario: 724945_Create blotter With All Fields
    And click on add new blotter button
    And user enters the following details with all fields on blotter screen
      | Blotter Number              | Random_Number        |
      | Blotter Name                | Random_Name          |
      | Contra Account              | Random_GLCOANumber               |
      | Blotter Exchange Code  Type | NASDAQ               |
      | Blotter Clearing  Type      | Fund/Serv            |
      | Blotter Method              | Phone Order          |
      | Processing  Ind             | CDT-ICBC OFFSET OMNI |
      | Compare Code                | CNS                  |
      | Compare file                | 361                  |
      | Settlement Cdoe             | 5555                 |
      | Settlement Custodian Number | 5555                 |
      | Settlement Bank Number      | 5555                 |
      | Settlement Currency         | INR                  |
    And user clicks save button on blotter screen
    Then "Blotter has been created successfully!" validation message should be displayed on blotter screen
    #Then verify blotter has been update table list


  Scenario: 724944_Create blotter With only Mandatory Fields
    And click on add new blotter button
    And user enters the following details with only mandatory fields on blotter screen
      | Blotter Number              | Random_Number              |
      | Blotter Name                | Random_Name                |
      | Blotter Exchange Code  Type | American Stock Exchange    |
      | Blotter Clearing  Type      | Correspondent Clearing/CNS |
      | Blotter Method              | Electronic                 |
    And user clicks save button on blotter screen
    Then "Blotter has been created successfully!" validation message should be displayed on blotter screen
    #Then verify blotter has been update table list



  Scenario: 724951_Edit existing blotter and verify the change getting updated successfully
    When user enter blotter name  in search box
    And user click on the blotter name
    And user enters the following  updated details with all fields on blotter screen
      | Blotter Number | Random_Number |
      | Blotter Name   | Random_Name   |
    And user clicks save button on blotter screen
    Then Validate message on blotter screen
   # Then verify blotter has been update table list


  Scenario: 724954_Search blotter with blotter name and verify blotter displayed
    When user enter blotter name  in search box
    And user click on the blotter name and details should be displayed



  Scenario: 724955_Search blotter with invalid blotter name and verify blotter not displayed
    When user enter blotter name "No Data"  in search box
    And user should able to "No data found" in  the blotter table list screen


  Scenario: 724963_Filter blotter with blotter name and verify blotter displayed
    When user click on the filter button on blotter screen
    And enter the blotter name "Random_Name"
    And click on the search button on blotter screen
    Then user should able see the below blotter details to be displayed
      | Blotter name | Random_Name   |
    And user click on the blotter name and details should be displayed


  Scenario: 724964_Filter blotter with blotter number and verify blotter displayed
    When user click on the filter button on blotter screen
    And enter the blotter number "Random_Number"
    And click on the search button on blotter screen
    Then user should able see the below blotter details to be displayed
      | Blotter name   | Random_Name   |
    And user click on the blotter name and details should be displayed


    #need to check currency rate integration part
