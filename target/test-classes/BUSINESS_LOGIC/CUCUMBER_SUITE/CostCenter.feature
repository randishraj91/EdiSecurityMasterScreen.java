@Sprint13
Feature: CostCenter Feature

  @CostCenter
  Scenario: 743275&743276&743280_Create new cost center with all fields & Updation
    Given Login as a Super Admin
    And Create Business Entity and Partner with office and suboffice for cost center
    And Click Add New Cost Center button
    And Enter all inputs in the cost center and click Save button
    Then "Cost center has been created successfully!" Validate message should be displayed
    And View the created cost center in a list view on office Overview page
    Then Click Edit button, entered Updated Inputs in the cost center and click Save button
    And Verify updated successfully and verify updated records on cost center

  @CostCenter
  Scenario: 743274&743277&743279_Create new cost center with mandatory fields & Updation
    Given Login as a Super Admin
    And Click Add New Cost Center button
    And Enter mandatory inputs in the cost center and click Save button
    Then "Cost center has been created successfully!" Validate message should be displayed
    And View the created cost center in a list view on office Overview page
    Then Click Edit button, entered Updated Inputs in the cost center and click Save button
    And Verify updated successfully and verify updated records on cost center


  @CostCenter
  Scenario: 743278_Create A New Cost Center With The Same Cost Center Code And Verify The System Shows The Proper Error Message
    Given Login as a Super Admin
    And Click Add New Cost Center button
    And Enter all inputs in the cost center and click Save button
    Then "Cost Center Code Already Exist" Validate message should be displayed

  @CostCenter
  Scenario: 743282_Verifying Export data - costcenter
    Given Login as a Super Admin
    When click "CostCenter" from the Account Data Management menu
    And Click on the export button
    Then Verifying "cost_center" web table entries and csv file entries by Comparing it
    And user should delete the "cost_center" CSV file from downloaded folder


  @CostCenter
  Scenario: 743283_Apply The Filters And Verify The Export Functionality On The List Page
    Given Login as a Super Admin
    When click "CostCenter" from the Account Data Management menu
    Then click on filter button
    And apply one filter and search on cost center
    And verify records on cost center
    And Click on the export button
    Then Verifying "cost_center" web table entries and csv file entries by Comparing it
    And user should delete the "cost_center" CSV file from downloaded folder

  @CostCenter
  Scenario: 743287_Verify Applying One Valid Filter at a Time in filterbysection
    Given Login as a Super Admin
    When click "CostCenter" from the Account Data Management menu
    Then click on filter button
    And apply one filter and search on cost center
    And verify records on cost center

  @CostCenter
  Scenario: 743288_Verify Applying One inValid Filter at a Time in filterbysection
    Given Login as a Super Admin
    When click "CostCenter" from the Account Data Management menu
    Then click on filter button
    And apply one filter with invalid input and search on cost center
    And verify no record found

  @CostCenter
  Scenario:743289_Verify Applying multiple Valid Filter at a Time in filterbysection
    Given Login as a Super Admin
    When click "CostCenter" from the Account Data Management menu
    Then click on filter button
    And apply multiple filter and search on cost center
    And verify records on cost center

  @CostCenter
  Scenario: 743290_Apply Multiple Filter At A Time With The Invalid Data And Verify The System Shows The No Data Found Message
    Given Login as a Super Admin
    When click "CostCenter" from the Account Data Management menu
    Then click on filter button
    And apply multiple filter with invalid input and search on cost center
    And verify no record found

  @CostCenter
  Scenario: 743291_Verify Applying One Vaild and One InValid Filter at a Time in FilterBy Section
    Given Login as a Super Admin
    When click "CostCenter" from the Account Data Management menu
    Then click on filter button
    And apply filter with valid and invalid input and search on cost center
    And verify no record found

  @CostCenter
  Scenario: 743302_Verify Universal Search with Valid Data
    Given Login as a Super Admin
    When click "CostCenter" from the Account Data Management menu
    And enter the "valid" input on cost center universal search and search it
    And verify records on cost center

  @CostCenter
  Scenario: 743303_Verify Universal Search with Valid Data
    Given Login as a Super Admin
    When click "CostCenter" from the Account Data Management menu
    And enter the "invalid" input on cost center universal search and search it
    And verify no record found

