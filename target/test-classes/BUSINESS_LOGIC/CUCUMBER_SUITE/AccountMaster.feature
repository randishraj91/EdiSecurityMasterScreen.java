@SmokeTest  @AccountMAster
Feature: Account Master Feature

  Background: User is successfully logged in
    And user navigate to Account Masters screen


  Scenario: 724820_Create Account Master With All Fields
    And click on add new Account Master button
    And verify column label on Account Master Screen
    And user enters the account profile details with all fields
    And user enters the customer information details with all fields
    And user enters the Address details with all fields
    And user enters the tax details with all fields
    And user enters the Interested Party details with all fields
    And user enters the Invertment profile details with all fields
    And user enters the Instruction and Permission details with all fields
    And user enters the Document with fields details
    And user enters the Swifts details with all fields
    And user clicks save button on SM screen
    Then "Account Master has been created successfully!" validation message should be displayed on Account Master screen


  Scenario: 724819_Create Account Master With only Mandatory Fields
    And click on add new Account Master button
    And verify column label on Account Master Screen
    And user enters the account profile details with only mandatory fields
    And user enters the customer information details with only mandatory fields
    And user enters the Address details with all fields
    And user enters the tax details with only mandatory fields
    And user enters the Interested Party details with only mandatory fields
  #  And user enters the Invertment profile details with only mandatory fields
  #  And user enters the Instruction and Permission details with only mandatory fields
    And user enters the Swifts details with only mandatory fields
    And user clicks save button on SM screen
    Then "Account Master has been created successfully!" validation message should be displayed on Account Master screen



  Scenario: 724853_Search Account Master with Account Master name and verify Account Master displayed
    When user enter Account Master name  in search box
    Then user should able see the below Account Master details to be displayed
      | Account Master name | Random_Name |
      | Account Master date | Random_Date |


#712106
  Scenario: 724854_Search Account Master with No data and verify No data displayed
    When user enter Account Master name "No Data"  in search box
    And user should able to "No data found" in table list screen



  Scenario: 724863_Filter Account Master with Account Master name and verify Account Master displayed
    When user click on the filter button
    And enter the Account Master name "Random_Name"
    And click on the search button
    Then user should able see the below Account Master details to be displayed
      | Account Master name | Random_Name |
      | Account Master date | Random_Date |
    And user click on the Account Master details screen should be displayed



  Scenario: 724864_Filter Account Master with Account Master Account Name and verify Account Master displayed
    When user click on the filter button
    And enter the Account Master name "Random_AccountName"
    And click on the search button
    Then user should able see only  Account Master name "Random_AccountName" Account Masters detail


  Scenario: 724865_Filter Account Master with Account Master Account Type and verify Account Master displayed
    When user click on the filter button
    And enter the Account Master type "Random_AccountType"
    And click on the search button
    Then user should able see only  Account Master type "Random_AccountType" Account Masters detail


  Scenario: 724866_Filter Account Master with Account Master partner and verify Account Master displayed
    When user click on the filter button
    And enter the Account Master Partner "Random_Partner"
    And click on the search button
    Then user should able see only  Account Master Partner "Random_Partner" Account Masters detail



  Scenario:724862_Edit existing Account Master and verify the change getting updated successfully
    When user enter Account Master name  in search box
    Then user should able see the below Account Master details to be displayed
      | Account Master name | Random_Name |
      | Account Master date | Random_Date |
    And then user edit the account profile fields
    And user clicks save button on SM screen
    Then "The changes for the Account Master has been saved successfully!" update validation message should be displayed on Account Master screen
    When user enter Account Master name  in search box
    Then user should able see the below Account Master details to be displayed
      | Account Master name | Random_Name |
      | Account Master date | Random_Date |








