Feature: SubOffice

@SubOffice
  Scenario: 743024&742353_Create new subOffice with all fields & Updation
    Given Login as a Super Admin
    And Create Business Entity,Partner,office
    And Click Add New SubOffice button
    And Enter all inputs in the suboffice and click Save button
    Then "Sub Office has been created successfully!" Validate message should be displayed
    And View the created suboffice in a list view on office Overview page
    Then Click Edit button, entered Updated Inputs in the suboffice and click Save button
    And Verify updated successfully and verify updated records on suboffice


  @SubOffice
  Scenario: 743012_Create A New Office With The Same Office Number And Verify The System Shows The Proper Error Message
    Given Login as a Super Admin
    And Click Add New SubOffice button
    And Enter all inputs in the suboffice and click Save button
    Then "Sub Office Code Already Exist" Validate message should be displayed

  @SubOffice
  Scenario: 742354_Verify Universal Search with Valid Data
    Given Login as a Super Admin
    When click "SubOffice" from the Account Data Management menu
    And enter the "valid" input on suboffice universal search and search it
    And verify records on suboffice

  @SubOffice
  Scenario: 742355_Verify Universal Search with Valid Data
    Given Login as a Super Admin
    When click "SubOffice" from the Account Data Management menu
    And enter the "invalid" input on suboffice universal search and search it
    And verify no record found

  @SubOffice
  Scenario: 743015_Verifying Export data - SubOffice
    Given Login as a Super Admin
    When click "SubOffice" from the Account Data Management menu
    And Click on the export button
    Then Verifying "subOffice" web table entries and csv file entries by Comparing it
    And user should delete the "subOffice" CSV file from downloaded folder

  @SubOffice
  Scenario: 743016_Verify The Export Functionality On The List Page
    Given Login as a Super Admin
    When click "SubOffice" from the Account Data Management menu
    Then click on filter button
    And apply one filter and search on suboffice
    And verify records on suboffice
    And Click on the export button
    Then Verifying "subOffice" web table entries and csv file entries by Comparing it
    And user should delete the "subOffice" CSV file from downloaded folder

  @SubOffice
  Scenario: 743017_Verify Applying One Valid Filter at a Time in filterbysection
    Given Login as a Super Admin
    When click "SubOffice" from the Account Data Management menu
    Then click on filter button
    And apply one filter and search on suboffice
    And verify records on suboffice

  @SubOffice
  Scenario: 743018_Verify Applying One inValid Filter at a Time in filterbysection
    Given Login as a Super Admin
    When click "SubOffice" from the Account Data Management menu
    Then click on filter button
    And apply one filter with invalid input and search on suboffice
    And verify no record found

  @SubOffice
  Scenario:743019_Verify Applying multiple Valid Filter at a Time in filterbysection
    Given Login as a Super Admin
    When click "SubOffice" from the Account Data Management menu
    Then click on filter button
    And apply multiple filter and search on suboffice
    And verify records on suboffice

  @SubOffice
  Scenario: 743020_Apply Multiple Filter At A Time With The Invalid Data And Verify The System Shows The No Data Found Message
    Given Login as a Super Admin
    When click "SubOffice" from the Account Data Management menu
    Then click on filter button
    And apply multiple filter with invalid input and search on suboffice
    And verify no record found

  @SubOffice
  Scenario: 743021_Verify Applying One Vaild and One InValid Filter at a Time in FilterBy Section
    Given Login as a Super Admin
    When click "SubOffice" from the Account Data Management menu
    Then click on filter button
    And apply filter with valid and invalid input and search on suboffice
    And verify no record found