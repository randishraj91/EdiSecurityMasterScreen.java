@EdiSecurityMaster

Feature: EDI Security Master Feature

  @EdiSecurityMaster
  Scenario:742384_Create A New Security Master With All The Fields
    Given Login as a Super Admin EDI Security Master
    Then User should be redirected to Security Master data Overview Screen
    Then Click Add New Security Master button
    And Enter data in all Security Master Fields
   Then "Security Master has been created successfully!" Validate message should be displayed

  @EdiSecurityMaster
  Scenario:742383_Create A New Security Master With Mandotry Fields
    Given Login as a Super Admin EDI Security Master
    Then User should be redirected to Security Master data Overview Screen
    Then Click Add New Security Master button
    And Enter data in all Security Master Mandatory Fields
   Then "Security Master has been created successfully!" Validate message should be displayed


  @EdiSecurityMaster
  Scenario:749836_Create A New Security Master With Fields Left Empty And Verify It Throws Validaiton Message
    Given Login as a Super Admin EDI Security Master
    Then User should be redirected to Security Master data Overview Screen
    Then Click Add New Security Master button
    And Enter data With Fields Left Empty
    Then "Please enter value in any one of fields such as CUSIP, SEDOL, ISIN under Security Master" It Throws Validaiton Message


  @EdiSecurityMaster
  Scenario:742389_Create A New Security Master And Verify The Newly Created Symbol In The Trade Entry Create Page
    Given Login as a Super Admin EDI Security Master
    Then User should be redirected to Security Master data Overview Screen
    Then Click Add New Security Master button
    And Enter data in all Security Master Fields And Verify The Newly Created Symbol
    Then "Security Master has been created successfully!" Validate message should be displayed

  @EdiSecurityMaster
  Scenario:742390_Create A New Security Master with Max valid inputs
    Given Login as a Super Admin EDI Security Master
    Then User should be redirected to Security Master data Overview Screen
    Then Click Add New Security Master button
    And  Enter the data all Security Master with Max valid inputs
    Then "Security Master has been created successfully!" Validate message should be displayed


  @EdiSecurityMaster
  Scenario: 749837_Create A New Security Master With The Same symbol And Verify The System Shows The Message
    Given Login as a Super Admin EDI Security Master
    Then User should be redirected to Security Master data Overview Screen
    Then Click Add New Security Master button
    And Enter data in all Security Master Fields With The Same symbol
    Then "symbol already exist" Validate message should be displayed

  @EdiSecurityMaster
  Scenario:742388_Update A Security Master With Mandatory Fields And Verify The Changes Have Been Saved
    Given Login as a Super Admin EDI Security Master
    Then User should be redirected to Security Master data Overview Screen
    Then Click Filter By button and enter value filter
    Then Click on the update Security Master
    And update data in all Security Master Mandatory Fields
    Then "The changes for the Security Master has been saved successfully!" Validate message should be displayed


  @EdiSecurityMaster
  Scenario:742385_Update A Security Master With all Fields And Verify The Changes Have Been Saved
    Given Login as a Super Admin EDI Security Master
    Then User should be redirected to Security Master data Overview Screen
    Then Click Filter By button and enter value filter
    Then Click on the update Security Master
    And update data in all Security Master all Fields
    Then "The changes for the Security Master has been saved successfully!" Validate message should be displayed


  @EdiSecurityMaster
  Scenario:749839_Apply One Filter At A Time With The Valid Data And Verify The Results
    Given Login as a Super Admin EDI Security Master
    Then User should be redirected to Security Master data Overview Screen
    Then Click Filter By button
    And apply one filter and search on symbol
    And verify records on Symbol Value

  @EdiSecurityMaster
  Scenario:749840_Apply One Filter At A Time With The Invalid Data And Verify The System Shows The No Data Found Message
    Given Login as a Super Admin EDI Security Master
    Then User should be redirected to Security Master data Overview Screen
    Then Click Filter By button
    And apply one filter At A Time With The Invalid Data
    And verify the no Data Found

  @EdiSecurityMaster
  Scenario:749841_Apply Multiple Filter At A Time With The Valid Data And Verify The Results
    Given Login as a Super Admin EDI Security Master
    Then User should be redirected to Security Master data Overview Screen
    Then Click Filter By button
    And Apply Multiple  At A Time With The valid Data
    And verify the Multiple Filter Valid Data

  @EdiSecurityMaster
  Scenario:749842_Apply Multiple Filter At A Time With The Invalid Data And Verify The System Shows The No Data Found Message
    Given Login as a Super Admin EDI Security Master
    Then User should be redirected to Security Master data Overview Screen
    Then Click Filter By button
    And Apply Multiple Filter At A Time With The Invalid Data
    And verify the Multiple Filter InValid Data


  @EdiSecurityMaster
  Scenario:758099_Verify Applying One Vaild security Type Filter at a Time in FilterBy Section
    Given Login as a Super Admin EDI Security Master
    Then User should be redirected to Security Master data Overview Screen
    Then Click Filter By button
    And Apply security Type Filter
    And Verify records on security Type Filter

  @EdiSecurityMaster
  Scenario:742386_Verify The Universal Search Functionality With The Valid Data
    Given Login as a Super Admin EDI Security Master
    Then User should be redirected to Security Master data Overview Screen
    Then Click On the Search Button
    And Enter valid Search Data
    And Verify records on valid Search Data

  @EdiSecurityMaster
  Scenario:742387_Verify The Universal Search Functionality With The InValid Data
    Given Login as a Super Admin EDI Security Master
    Then User should be redirected to Security Master data Overview Screen
    Then Click On the Search Button
    And Enter invalid Search Data
    And verify the search no Data Found

  @EdiSecurityMaster
  Scenario:749835_Verify The Export Functionality On The List Page
    Given Login as a Super Admin EDI Security Master
    Then User should be redirected to Security Master data Overview Screen
    Then click on the Three Dot button
    Then Click on Export function
    Then Verifying "Edi Security Master" web table entries and csv file entriess by Comparing it
    And user should delete the "Edi Security Master" CSV fiiles from downloaded folders




