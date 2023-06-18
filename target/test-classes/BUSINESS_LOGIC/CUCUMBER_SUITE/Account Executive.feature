@Sprint13
Feature: AccountExecutive Feature

  @AccountExecutive
  Scenario: 742361&743271_Create new account executive with all fields & Updation
    Given Login as a Super Admin
    And Create Business Entity and Partner with office and suboffice for account executive
    And Click Add New account executive button
    And Enter all inputs in the account executive and click Save button
    Then "Account Executive has been created successfully!" Validate message should be displayed
    And View the created account executive in a list view on office Overview page
    Then Click Edit button, entered Updated Inputs in the account executive and click Save button
    And Verify updated successfully and verify updated records on account executive

  @AccountExecutive
  Scenario: 742360&742362_Create new account executive with mandatory fields & Updation
    Given Login as a Super Admin
    And Click Add New account executive button
    And Enter mandatory inputs in the account executive and click Save button
    Then "Account Executive has been created successfully!" Validate message should be displayed
    And View the created account executive in a list view on office Overview page
    Then Click Edit button, entered Updated Inputs in the account executive and click Save button
    And Verify updated successfully and verify updated records on account executive

  @AccountExecutive1
  Scenario: 743260_Create A New Account Executives Without Mandatory Field And Verify The System Shows The Proper Error Message
    Given Login as a Super Admin
    And Click Add New account executive button
    And create an account executives without mandatory field

  @AccountExecutive
  Scenario: 743259_Create A New account executive With The Same account executive Code And Verify The System Shows The Proper Error Message
    Given Login as a Super Admin
    And Click Add New account executive button
    And Enter all inputs in the account executive and click Save button
    Then "Exec Cd Already Exist" Validate message should be displayed

  @AccountExecutive
  Scenario: 742363_Verifying Export data - Account Executive
    Given Login as a Super Admin
    When click "AccountExecutive" from the Account Data Management menu
    And Click on the export button
    Then Verifying "account_executive" web table entries and csv file entries by Comparing it
    And user should delete the "account_executive" CSV file from downloaded folder


  @AccountExecutive
  Scenario: 743258_Apply The Filters And Verify The Export Functionality On The List Page
    Given Login as a Super Admin
    When click "AccountExecutive" from the Account Data Management menu
    Then click on filter button
    And apply one filter and search on account executive
    And verify records on account executive
    And Click on the export button
    Then Verifying "account_executive" web table entries and csv file entries by Comparing it
    And user should delete the "account_executive" CSV file from downloaded folder

  @AccountExecutive
  Scenario: 743264_Verify Applying One Valid Filter at a Time in filterbysection
    Given Login as a Super Admin
    When click "AccountExecutive" from the Account Data Management menu
    Then click on filter button
    And apply one filter and search on account executive
    And verify records on account executive

  @AccountExecutive
  Scenario: 743265_Verify Applying One inValid Filter at a Time in filterbysection
    Given Login as a Super Admin
    When click "AccountExecutive" from the Account Data Management menu
    Then click on filter button
    And apply one filter with invalid input and search on account executive
    And verify no record found

  @AccountExecutive
  Scenario:743266_Verify Applying multiple Valid Filter at a Time in filterbysection
    Given Login as a Super Admin
    When click "AccountExecutive" from the Account Data Management menu
    Then click on filter button
    And apply multiple filter and search on account executive
    And verify records on account executive

  @AccountExecutive
  Scenario: 743267_Apply Multiple Filter At A Time With The Invalid Data And Verify The System Shows The No Data Found Message
    Given Login as a Super Admin
    When click "AccountExecutive" from the Account Data Management menu
    Then click on filter button
    And apply multiple filter with invalid input and search on account executive
    And verify no record found

  @AccountExecutive
  Scenario: 743268_Verify Applying One Vaild and One InValid Filter at a Time in FilterBy Section
    Given Login as a Super Admin
    When click "AccountExecutive" from the Account Data Management menu
    Then click on filter button
    And apply filter with valid and invalid input and search on account executive
    And verify no record found

  @AccountExecutive
  Scenario: 742364_Verify Universal Search with Valid Data
    Given Login as a Super Admin
    When click "AccountExecutive" from the Account Data Management menu
    And enter the "valid" input on account executive universal search and search it
    And verify records on account executive

  @AccountExecutive
  Scenario: 742374_Verify Universal Search with Valid Data
    Given Login as a Super Admin
    When click "AccountExecutive" from the Account Data Management menu
    And enter the "invalid" input on account executive universal search and search it
    And verify no record found