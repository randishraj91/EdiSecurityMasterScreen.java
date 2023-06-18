@Holiday
Feature: Holiday Feature

  @Holiday
  Scenario: 742402_Create A New Holiday With All The Fields
    Given Login as a Super Admin Holiday
    Then User should be redirected to System Wide Master Data Screen and Choose the Holiday from list
    Then Click on the Add New Holiday button
    And Enter data in all Fields Holiday
    Then "Holiday has been created successfully!" Validate message should be displayed

  @Holiday
  Scenario: 744050_Create A New Holiday With Different Security Type
    Given Login as a Super Admin Holiday
    Then User should be redirected to System Wide Master Data Screen and Choose the Holiday from list
    Then Click on the Add New Holiday button
    And Create A New Holiday With Different Security Type
    Then "Holiday has been created successfully!" Validate message should be displayed

  @Holiday
  Scenario: 742401_Create A New Holiday With The Mandatory Fields
    Given Login as a Super Admin Holiday
    Then User should be redirected to System Wide Master Data Screen and Choose the Holiday from list
    Then Click on the Add New Holiday button
    And Create A New Holiday With The Mandatory Fields
    Then "Holiday has been created successfully!" Validate message should be displayed

  @Holiday
  Scenario: 744035_Create A New Holiday With The Same Holiday Name And Verify The System Shows The Proper Error Message
    Given Login as a Super Admin Holiday
    Then User should be redirected to System Wide Master Data Screen and Choose the Holiday from list
    Then Click on the Add New Holiday button
    And Create A New Holiday With The Same Holiday Name And click Save button
    Then "Holiday Already Exists" Validate message should be displayed

  @Holiday
  Scenario: 742403_Update A Holiday With All The Fields And Verify The Changes Have Been Saved
    Given Login as a Super Admin Holiday
    Then User should be redirected to System Wide Master Data Screen and Choose the Holiday from list
    And Click on the Holiday Search Functionality With The Valid Data
    Then Enter the Holiday valid Search Data
    Then Click on the edit and view option from Holiday data list
    And Update A Holiday With All The Fields
    And "The changes for the holiday holiiday has been saved successfully!" Validate message should be displayed

  @Holiday
  Scenario: 744041_Update A Holiday With Mandatory Fields And Verify The Changes Have Been Saved
    Given Login as a Super Admin Holiday
    Then User should be redirected to System Wide Master Data Screen and Choose the Holiday from list
    And Click on the Holiday Search Functionality With The Valid Data
    Then Enter the Holiday valid Search Data
    Then Click on the edit and view option from Holiday data list
    And Update A Holiday With Mandatory Fields
    And "The changes for the holiday holiiday has been saved successfully!" Validate message should be displayed


  @Holiday
  Scenario: 744042_Apply One Filter At A Time With The Valid Data And Verify The Results
    Given Login as a Super Admin Holiday
    Then User should be redirected to System Wide Master Data Screen and Choose the Holiday from list
    And Click on the Holiday filter button
    Then Apply One Filter At A Time With The Valid Holiday Data
    And verify records on Valid Holiday Data filter

  @Holiday
  Scenario: 744044_Apply One Filter At A Time With The Invalid Data And Verify The System Shows The No Data Found Message
    Given Login as a Super Admin Holiday
    Then User should be redirected to System Wide Master Data Screen and Choose the Holiday from list
    And Click on the Holiday filter button
    Then Apply One Filter At A Time With The InValid Holiday Data
    And Verify The System Shows The No Data Found Holiday Message


  @Holiday
  Scenario: 744045_Apply Multiple Filter At A Time With The Valid Data And Verify The Results
    Given Login as a Super Admin Holiday
    Then User should be redirected to System Wide Master Data Screen and Choose the Holiday from list
    And Click on the Holiday filter button
    Then Apply Multiple Filter At A Time With The Valid Holiday Data
    And verify records on Valid Holiday Data filter

  @Holiday
  Scenario: 744048_Verify Applying One Valid and One InValid Filter at a Time in FilterBy Section
    Given Login as a Super Admin Holiday
    Then User should be redirected to System Wide Master Data Screen and Choose the Holiday from list
    And Click on the Holiday filter button
    Then Applying One Valid and One InValid Filter at a Time in FilterBy Section
    And Verify The System Shows The No Data Found Holiday Message



  @Holiday
  Scenario: 744047_Apply Multiple Filter At A Time With The Invalid Data And Verify The System Shows The No Data Found Message
    Given Login as a Super Admin Holiday
    Then User should be redirected to System Wide Master Data Screen and Choose the Holiday from list
    And Click on the Holiday filter button
    Then Apply Multiple Filter At A Time With The InValid Holiday Data
    And Verify The System Shows The No Data Found Holiday Message

  @Holiday
  Scenario: 742404_Verify The Universal Search Functionality With The Valid Data
    Given Login as a Super Admin Holiday
    Then User should be redirected to System Wide Master Data Screen and Choose the Holiday from list
    And Click on the Holiday Search Functionality With The Valid Data
    Then Enter the Holiday valid Search Data
    And verify records on Valid Search Holiday

  @Holiday
  Scenario: 742405_Verify The Universal Search Functionality With The InValid Data
    Given Login as a Super Admin Holiday
    Then User should be redirected to System Wide Master Data Screen and Choose the Holiday from list
    And Click on the Holiday Search Functionality With The Valid Data
    Then Enter the Holiday Invalid Search Data
    And Verify The System Shows The No Data Found Search Holiday Message

  @Holiday
  Scenario: 744038_Verify The Export Functionality On The List Page
    Given Login as a Super Admin Holiday
     When click "Holiday" from the System Wide Master Data
    And Click on the export button Holiday
    Then Verifying "Holiday" web table entriess and csv file entriess by Comparing it
    And user should delete the "Holiday" CSV files from downloaded folder

  @Holiday
  Scenario: 744037_Verify Holiday Sort Feature And Verify The Results
    Given Login as a Super Admin Holiday
    Then User should be redirected to System Wide Master Data Screen and Choose the Holiday from list
    And Hoilday sort order on column
    And verify sorted records in ascending order


