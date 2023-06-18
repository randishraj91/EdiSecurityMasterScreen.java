@GLCOA

Feature: GLCOA Feature

  @GLCOA
  Scenario: 742375_Create A New GL-COA With The Mandatory Fields
    Given Login as a Super Admin GL
    And Create Business Entity,Partner,office,SubOffice,cost center and Account Executive
    Then Click Add New GLCOA button
    And Enter data in all GLCOA Mandatory Fields
    Then "GLCOA has been created successfully!" Validate message should be displayed

  @GLCOA
  Scenario: 743856_Create A New GL-COA With The Same GL Account Number And Verify The System Shows The Proper Error Message
    Given Login as a Super Admin GL
    Then Click Add New GLCOA button
    And Enter data in all GLCOA The Same GL Account Number
    Then "Gl Number Already Exist" Validate message should be displayed

  @GLCOA
  Scenario: 743859_Create A New GL-COA With Max valid inputs
    Given Login as a Super Admin GL
    Then Click Add New GLCOA button
    And Create A New GL-COA With Max valid inputs
    Then "Glcoa has been created successfully!" Validate message should be displayed


  @GLCOA
  Scenario: 742376_Update A GLCOA With Mandatory Fields And Verify The Changes Have Been Saved
    Given Login as a Super Admin GL
    Then User should be redirected to Account data Management Overview Screen
    And Choose the GL Chart Of Accounts from list
    Then Click On the Search operation GlCOA and enter GL values
    Then  Click on the edit and view option from Glcoa list
    And Updating A GLCOA With Mandatory Fields
    And Verify updated successfully and verify updated records on GL-COA

  @GLCOA
  Scenario: 743857_Update A GL-COA With maximum Valid Inputs
    Given Login as a Super Admin GL
    Then User should be redirected to Account data Management Overview Screen
    And Choose the GL Chart Of Accounts from list
    Then Click On the Search operation GlCOA and enter GL values
    Then  Click on the edit and view option from Glcoa list
    And Update A GL-COA With maximum Valid Inputs
    And Verify updated successfully and verify updated records on GL-COA


  @GLCOA
  Scenario: 750252_Verify The Export Functionality On The List Page
    Given Login as a Super Admin GL
    Then User should be redirected to Account data Management Overview Screen
    Then Click on The Glcoa Export Functionality
    Then Verifying "GLCOA" web table entrie and csv file entries by Comparing it
    And user should delete the "GLCOA" CSV file from downloaded folders

  @GLCOA
  Scenario: 742377_Verify The Universal Search Functionality With The Valid Data
    Given Login as a Super Admin GL
    Then User should be redirected to Account data Management Overview Screen
    And Choose the GL Chart Of Accounts from list
    Then Click On the Search operation GlCOA
    And Enter the GL valid Search Data
   Then verify records on Valid Search Glcoa


  @GLCOA
  Scenario: 742378_Verify The Universal Search Functionality With The InValid Data
    Given Login as a Super Admin GL
    Then User should be redirected to Account data Management Overview Screen
    And Choose the GL Chart Of Accounts from list
    Then Click On the Search operation GlCOA
    And Enter the GL Invalid Search Data
    Then verify the no Data Found GLCOA

  @GLCOA
  Scenario:742382_Apply One Filter At A Time With The valid Data And Verify The Data
    Given Login as a Super Admin GL
    Then User should be redirected to Account data Management Overview Screen
    And Choose the GL Chart Of Accounts from list
    Then Click On the Filter operation GlCOA
    And Enter the valid one glcoa filter data
    Then verify records on Valid Glcoa Data filter

  @GLCOA
  Scenario:744813_Verify Applying On office Filter at a Time in FilterBy Section and Verify The Data
    Given Login as a Super Admin GL
    Then User should be redirected to Account data Management Overview Screen
    And Choose the GL Chart Of Accounts from list
    Then Click On the Filter operation GlCOA
    And Applying On office Filter at a Time in FilterBy Section
    Then verify records on office filter

  @GLCOA
  Scenario: 743858_Apply Multiple Filter At A Time With The valid Data And Verify The Data
    Given Login as a Super Admin GL
    Then User should be redirected to Account data Management Overview Screen
    And Choose the GL Chart Of Accounts from list
    Then Click On the Filter operation GlCOA
    And Apply Multiple Filter At A Time With The valid Glcoa Data
    Then verify records on Valid Glcoa Data filter

  @GLCOA
  Scenario: 743861_Apply One Filter At A Time With The Invalid Data And Verify The System Shows The No Data Found Message
    Given Login as a Super Admin GL
    Then User should be redirected to Account data Management Overview Screen
    And Choose the GL Chart Of Accounts from list
    Then Click On the Filter operation GlCOA
    And Apply One Filter At A Time With The Invalid glcoa Data
    Then verify the no Data Found GLCOA

  @GLCOA
  Scenario:743862_Apply Multiple Filter At A Time With The Invalid Data And Verify The System Shows The No Data Found Message
    Given Login as a Super Admin GL
    Then User should be redirected to Account data Management Overview Screen
    And Choose the GL Chart Of Accounts from list
    Then Click On the Filter operation GlCOA
    And Apply Multiple Filter At A Time With The Invalid Glcoa Data
    Then verify the no Data Found GLCOA