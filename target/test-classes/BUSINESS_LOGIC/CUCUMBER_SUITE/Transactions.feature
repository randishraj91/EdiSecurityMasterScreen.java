@RegressionTest
Feature: Transaction Feature

  Background: User is successfully logged in

  @PR1
  Scenario: Prerequisite - 1
    And user navigate to company screen
    #Company
    And user navigate to company screen and click add company button
    And user enters the following Mandatory basic details for transaction
      | Company Name | Random_Name  |
      | Company Code | Random_Code  |
      | Tax Id       | Random_TaxId |
    And user enters the following Mandatory Communication details
      | Address Line1 | Adress line 1 |
      | Country       | United States |
      | State         | Arkansas      |
      | City          | Ashdown       |
      | Zipcode       | 589658        |
      | Contact       | 78965847585   |
    Then click the save button
    Then "Company has been created successfully!" validation message should be displayed on Company screen
    And user navigate to Partner screen for transactions
    #Partner
    Given click on Add New Partner button
    When  Enter the Partner ID details with mandatory fields for transactions
    Then  click the partner save button for transactions
    And user navigate to office screen for transactions
     #Office
    And click on add new office button
    And user enters the following office details on add new office screen for transactions
      | Office code    | Random_OfficeCode             |
      | Company        | CompanyName            |
      | Correspondent  | Partner                 |
      | Office Name    | Random_Name                   |
      | Description    | created with automated script |
      | Address Line 1 | Twin towers                   |
      | Country        | United States                 |
      | State          | Alabama                       |
      | City           | Adamsville                    |
      | Phone number   | 78548545584                   |
    And user clicks save button on office screen
    Then  validation message should be displayed on screen
    And user navigate to Sub Office screen for transaction
    #SubOffice
    And click on add new Sub Office button
    And user enters the following details with all fields on Sub Office Screen for transactions
      | Correspondent   | Partner          |
      | Office Name     | Random_OfficeName      |
      | Sub Office Name | Random_SubOfficeName   |
      | Sub Office Code | Random_SubOfficeCode   |
      | Purpose         | Created for automation |
    And user clicks save Sub Office button
    Then "Sub Office has been created successfully!" validation message should be displayed on Sub Office screen



  @PR2
  Scenario: Prerequisite - 2
    And user navigate to Account Masters screen for transactions
    #Account Master - 1   Trade Entry has been created successfully!
    And click on add new Account Master button
    And user enters the account profile details with only mandatory fields for transactions
    And user enters the customer information details with only mandatory fields
    And user enters the Address details with all fields
    And user enters the tax details with only mandatory fields
    And user enters the Interested Party details with only mandatory fields
    And user enters the Swifts details with only mandatory fields
    And user clicks save button on SM screen
    Then "Account Master has been created successfully!" validation message should be displayed on Account Master screen
    # GL Account
    And click on add new Account Master button
    And user enters the  GL account profile details with only mandatory fields for transactions
    And user enters the customer information details with only mandatory fields
    And user enters the Address details with all fields
    And user enters the tax details with only mandatory fields
    And user enters the Interested Party details with only mandatory fields
    And user enters the Swifts details with only mandatory fields
    And user clicks save button on SM screen
    Then "Account Master has been created successfully!" validation message should be displayed on Account Master screen
    #Cost Center
    And user navigate to Cost Center screen for transactions
    And click on add new Cost Center button
    And user enters the following details with all fields on Cost Center Screen for transactions
      | Correspondent    | Random_Correspondent   |
      | Office Name      | Random_OfficeName      |
      | Sub Office Name  | Random_SubOfficeName   |
      | Cost Center Name | Random_CostCenter      |
      | Cost Center Code | Random_CostCenterCode  |
      | Purpose          | Created for automation |
    And user clicks save Cost Center button
    Then "Cost center has been created successfully!" validation message should be displayed on Cost Center screen
    Given user navigate to Account Executive screen for transactions
    #Account Executive
    Given click on Add New Executive button
    When  Enters the following details with mandatory fields for transactions
    Then  click the Account save button
    Given user navigate to broker screen for transactions
    #Broker
    Given click on Add New Broker button
    When  Enters the Broker details with mandatory fields for transactions
    Then  click the Broker save button
    #Security Master
    And user navigate security master screen for transaction
    And click on add new Security Master button
    And user enters the following Symbol details with all fields for transaction
      | Symbol          | Random_Symbol         |
      | Security Number | Random_SecurityNumber |
      | Assert Type     | Cryptocurrency        |
      | Sec Type        | Fixed Income          |
    And user enters the following Security master details with mandatory fields
      | CUSIP          | Random_CUSIP   |
      | Sec Sub Type   | Discount Issue |
      | Exchange       | FTP24           |
      | Status         | Inactive       |
      | Country        | United States  |
      | Reg Fee Charge | Yes            |
    And user enters the following Security Margin mandatory additional details
      | Marginable | No |
    And user enters the following Security Crypto Profile details
      | Contact Address     | New crypt crn |
      | Cryptocurrency Type | Airdrop       |
      | Alternative Symbol  | STATUS_GEN    |
    And user enters the following Security Prices details
      | Prices   | 140      |
      | Currency | USD |
    And user clicks save button on security master screen
    Then "Security Master has been created successfully!" validation message should be displayed on Security Master screen


  @FBT
  Scenario: First Buy Trade
   #Trade
    And user navigate to trade entry screen
    Then user enter the First Buy Trade
    Then verify transaction and journal listing for trade entry
    And verify the trade in Stock Record
    And Verify the trade in  Stock ledger
    And Verify the trade in  Cash ledger
    And Verify the trade in  Trail  Balance
    And Verify the trade in  Tax Lot






















  @Transa
  Scenario: Sample test
    And open App
    Then verify transaction and journal listing for trade entry
    And verify the trade in Stock Record
    And Verify the trade in  Stock ledger
    And Verify the trade in  Cash ledger
    And Verify the trade in  Trail  Balance
    And Verify the trade in  Tax Lot


  @Transa12
  Scenario: Sample test
    And open App
    Then verify transaction and journal listing for trade entry
    And Verify the trade in  Trail  Balance


























