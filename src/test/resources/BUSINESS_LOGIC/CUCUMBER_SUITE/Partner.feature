Feature: Partner Feature

  Background: Login into the Application
    Given user navigate to Partner screen

    #718873    725068
  @Partner  @DailyRun
  Scenario: 725109_Create Partner Id With All Fields
    Given click on Add New Partner button
    When  Enter the Partner ID details with All fields
    Then  click the partnerId save button

  @Partner @DailyRun
  Scenario: 725110_Create Partner Id With mandatory Fields
    Given click on Add New Partner button
    When  Enter the Partner ID details with mandatory fields
    Then  click the partner save button


  @Partner @DailyRun
  Scenario: 725111_Create corporate with all fields
    Given  Click on the Existing Partner
    When  Enter the Corporate details with All fields
    Then  click the partner save button

  @Partner @DailyRun
  Scenario: 725112_Create corporate with mandatory fields
    Given  Click on the Existing Partner
    When  Enter the Corporate details with mandatory fields
    Then  click the partner save button

  @Partner @DailyRun
  Scenario: 725113_Create tax & statements & confirms with all fields
    Given  Click on the Existing Partner - Tax
    When  Enter the Tax & Statements & Confirms details with All fields
    Then  click the partner save button

  @Partner @DailyRun
  Scenario: 725114_Create Tax & Statements & Confirms With mandatory Fields
    Given  Click on the Existing Partner - Tax
    When  Enter the Tax & Statements & Confirms details with mandatory fields
    Then  click the partner save button

  @Partner @DailyRun
  Scenario: 725115_Create OnBoarding and Funding Details With All Fields
    Given  Click on the Existing Partner - Onboarding
    When  Enter the Onboarding and Funding details with All fields
    Then  click the partner save button

  @Partner @DailyRun
  Scenario: 725116_Create OnBoarding and Funding Details With mandatory Fields
    Given  Click on the Existing Partner - Onboarding
    When  Enter the Onboarding and Funding details with mandatory fields
    Then  click the partner save button

  @Partner @DailyRun
  Scenario: 725117_Create Risk Compliance Details With All Fields
    Given  Click on the Existing Partner - Risk
    When  Enter the Risk Compliance details with All fields
    Then  click the partner save button

  @Partner @DailyRun
  Scenario: 725118_Create Risk Compliance Details With mandatory Fields
    Given  Click on the Existing Partner - Risk
    When  Enter the Risk Compliance details with mandatory fields
    Then  click the partner save button

  @Partner @DailyRun
  Scenario: 726676_Search Partner globally
    When Enter the Search Keyword
    And   Check whether Partner is created in the List Screen

  @Partner @DailyRun
  Scenario: 726677_Search Partner with invalid Data
    When user enter  "No Data"  in Partner search box
    And user should able to view "No data found" in Partner table list screen


  @Partner1
  Scenario: 712178_Multiple Search - Filter Settlement with Mpid and Alert Acronym
    Given click on the Partner filter button
    When enter the Mpid and Alert Acronym
    And Click on Partner Filter Search Button
    And   Check whether Mpid and Alert are displayed in the List Screen

  @SmokeTest1
  Scenario: 712176_Filter Partner with Partner Code
    Given click on the Partner filter button
    When enter the Partner Code
    And Click on Partner Filter Search Button
    And  Check whether Partner Code is displayed in the List Screen

  @SmokeTest25
  Scenario: 718883_Filter Partner with Partner Name
    Given click on the Partner filter button
    When enter Partner Name
    And Click on Partner Filter Search Button
    And Check whether Partner name is displayed in the List Screen
  
  @SmokeTest1
  Scenario: 718884_Filter Partner with Company
    Given click on the Partner filter button
    When enter the Company
    And Click on Partner Filter Search Button
    And  Check whether Company is displayed in the List Screen

  @SmokeTest1
  Scenario:718885_Filter Partner with Mpid
    Given click on the Partner filter button
    When enter the Mpid
    And Click on Partner Filter Search Button
    And  Check whether Mpid is displayed in the List Screen

  @SmokeTest1
  Scenario: 718886_Filter Partner with Alert acronym
    Given click on the Partner filter button
    When enter the Alert acronym
    And Click on Partner Filter Search Button
    And  Check whether Alert is displayed in the List Screen

  @SmokeTest1
  Scenario: 718887_Filter Partner with Fin Doc Date
    Given click on the Partner filter button
    When enter the Fin Doc Date
    And Click on Partner Filter Search Button

  @SmokeTest1
  Scenario: 718888_Filter Partner with Oasys Id
    Given click on the Partner filter button
    When enter the Oasys Id
    And Click on Partner Filter Search Button
    And  Check whether Oasys Id is displayed in the List Screen

  @SmokeTest1
  Scenario: 718889_Filter Partner with Tax Id
    Given click on the Partner filter button
    When enter the Tax Id
    And Click on Partner Filter Search Button
    And  Check whether Tax Id is displayed in the List Screen

  @SmokeTest5
  Scenario: Edit Partner Id details
    Given  Click on the Existing Partner - Partner Id
    When  Edit the Partner Id details
    Then  click the partner save button
    And "edit message" edit validation message should be displayed on Partner screen

  @SmokeTest89
  Scenario:719542_Export the Partner List
    Given click on the Export Button check whether the Partner List is downloaded
