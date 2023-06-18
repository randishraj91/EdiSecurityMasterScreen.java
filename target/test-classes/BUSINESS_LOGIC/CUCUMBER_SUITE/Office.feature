Feature: Office Feature

  @Office
  Scenario: 742342&742343&743004_Create new Office with all fields & Updation
    Given Login as a Super Admin
    And Create Business Entity and Partner
    And Click Add New Office button
    And Enter all inputs in the office and click Save button
    Then "Office has been created successfully!" Validate message should be displayed
    And View the created office in a list view on office Overview page
    Then Click Edit button, entered Updated Inputs in the office and click Save button
    And Verify updated successfully and verify updated records on office

  @Office
  Scenario: 742341&742994_Create new Office with mandatory fields & Updation
    Given Login as a Super Admin
    And Click Add New Office button
    And Enter mandatory inputs in the office and click Save button
    Then "Office has been created successfully!" Validate message should be displayed
    And View the created office in a list view on office Overview page
    Then Click Edit button, entered Updated Inputs in the office and click Save button
    And Verify updated successfully and verify updated records on office

  @Office
  Scenario: 742992_Create A New Office With The Same Office Number And Verify The System Shows The Proper Error Message
    Given Login as a Super Admin
    And Click Add New Office button
    And Enter all inputs in the office and click Save button
    Then "Office Number Already Exist" Validate message should be displayed

  @Office
  Scenario: 742997_Verify Applying One Valid Filter at a Time in filterbysection
    Given Login as a Super Admin
    When click "Office" from the Account Data Management menu
    Then click on filter button
    And apply one filter and search on office
    And verify records on office

  @Office
  Scenario: 742998_Verify Applying One inValid Filter at a Time in filterbysection
    Given Login as a Super Admin
    When click "Office" from the Account Data Management menu
    Then click on filter button
    And apply one filter with invalid input and search on office
    And verify no record found

  @Office
  Scenario: 742999_Verify Applying multiple Valid Filter at a Time in filterbysection
    Given Login as a Super Admin
    When click "Office" from the Account Data Management menu
    Then click on filter button
    And apply multiple filter and search on office
    And verify records on office

  @Office
  Scenario: 743000_Apply Multiple Filter At A Time With The Invalid Data And Verify The System Shows The No Data Found Message
    Given Login as a Super Admin
    When click "Office" from the Account Data Management menu
    Then click on filter button
    And apply multiple filter with invalid input and search on office
    And verify no record found

  @Office
  Scenario: 742346_Verify Applying One Vaild and One InValid Filter at a Time in FilterBy Section
    Given Login as a Super Admin
    When click "Office" from the Account Data Management menu
    Then click on filter button
    And apply filter with valid and invalid input and search on office
    And verify no record found

  @Office
  Scenario: 742344_Verify Universal Search with Valid Data
    Given Login as a Super Admin
    When click "Office" from the Account Data Management menu
    And enter the "valid" input on office universal search and search it
    And verify records on office

  @Office
  Scenario: 742345_Verify Universal Search with Valid Data
    Given Login as a Super Admin
    When click "Office" from the Account Data Management menu
    And enter the "invalid" input on office universal search and search it
    And verify no record found

  @Office
  Scenario: 743006&743005_Verify File Upload With The Wrong File Format/ zero KB file
    Given Login as a Super Admin
    And Click Add New Office button
    And enter valid inputs on office fields
    And upload "wrong" file format
    Then "File format not supported" Validate message should be displayed
    And delete the uploaded file
    And upload "0 KB" file format
    And click save button
    Then "Office has been created successfully!" Validate message should be displayed

  @Office
  Scenario:743008_Verify The View Column Functionality On The List Page By Selecting Few Columns and By Selecting All Columns
    Given Login as a Super Admin
    When click "Office" from the Account Data Management menu
    And click on the View column list and deselect the columns "Country"
    And Verify "Country" column is not displaying
    And click on the View column list and select the columns "Country"
    And Verify "Country" column is displaying

  @Office
  Scenario: 742995_Verify The Export Functionality On The List Page
    Given Login as a Super Admin
    When click "Office" from the Account Data Management menu
    And Click on the export button
    Then Verifying "office" web table entries and csv file entries by Comparing it
    And user should delete the "office" CSV file from downloaded folder

  @Office
  Scenario: 742996_Verify The Export Functionality On The List Page
    Given Login as a Super Admin
    When click "Office" from the Account Data Management menu
    Then click on filter button
    And apply one filter and search on office
    And verify records on office
    And Click on the export button
    Then Verifying "office" web table entries and csv file entries by Comparing it
    And user should delete the "office" CSV file from downloaded folder