Feature: Partner Feature

  @NewUser
  Scenario: 757596_Verify an user can be created with autopilot informations
    Given Login as a Super Admin
    And Create Business Entity to which user should be added
    And Create New "ADVISOR" Partner type to which User should be added
    Then Navigate to User and Accounts module
    And Choose the partner and Click add new users
    Then Choose "Institutional" user type
    And Enter "valid" inputs in User fields "with autopilot" and click User Save button
    Then "User has been created sucessfully" Validate message should be displayed

  @NewUser
  Scenario: 757596_Verify it accepts only the pdf documents to upload
    Given Login as a Super Admin
    Then Navigate to User and Accounts module
    And Choose the partner and Click add new users
    Then Choose "Institutional" user type
    And Enter "valid" inputs in User fields "with invaild document" and click User Save button

  @NewUser
  Scenario: 757596_Verify the approved users can able to create accounts..
    Given Login as a Super Admin
    Then Navigate to User and Accounts module
    And Choose the partner
    And Check create accounts link for approved users

  @NewUser
  Scenario: 757596_Modify the user details and verify the user details can be updated
    Given Login as a Super Admin
    Then Navigate to User and Accounts module
    And Choose the partner
    And Click already created user
    And Update "Address" and click save button
    Then "The changes for the User has been updated sucessfully" Validate message should be displayed

  @NewUser
  Scenario: 757596_Check whether the created institutional user Status can be changed to Approved, Closed, Revoked and Pending.
    Given Login as a Super Admin
    Then Navigate to User and Accounts module
    And Choose the partner
    And Click already created user
    And Update "Status" and click save button
    Then "The changes for the User has been updated sucessfully" Validate message should be displayed

  @NewUser
  Scenario: 757596_Verify an user associated with advisor type of partner can modify the autopilot details in both Institutional user details.
    Given Login as a Super Admin
    Then Navigate to User and Accounts module
    And Choose the partner
    And Click already created user
    And Update "Autopilot" and click save button
    Then "The changes for the User has been updated sucessfully" Validate message should be displayed

  @NewUser
  Scenario: 757596_Go to user info and verify the provided information is displayed properly.
    Given Login as a Super Admin
    Then Navigate to User and Accounts module
    And Choose the partner
    And Click already created user
    And Verify Created user information is displayed properly

  @NewUser
  Scenario: 757596_Verify the attached documents can be downloaded.
    Given Login as a Super Admin
    Then Navigate to User and Accounts module
    And Choose the partner
    And Click already created user
    And Verify the attached documents can be downloaded

  @NewUser
  Scenario: 757596_Add a note to a user and Verify it is displayed in the View/ Edit Mode.
    Given Login as a Super Admin
    Then Navigate to User and Accounts module
    And Choose the partner
    And Click already created user
    And Verify "Single" notes is displayed properly

  @NewUser
  Scenario: 757596_Verify the attached documents can be removed by clicking on the trash icon
    Given Login as a Super Admin
    Then Navigate to User and Accounts module
    And Choose the partner
    And Click already created user
    And Verify the attached documents can be removed by clicking on the trash icon

  @NewUser
  Scenario: 757596_Verify user cannot be created without filling the mandatory fields.
    Given Login as a Super Admin
    Then Navigate to User and Accounts module
    And Choose the partner and Click add new users
    Then Choose "Institutional" user type
    Then Check save button is disabled

  @NewUser
  Scenario: 757596_Verify an user can upload mulitple documents.
    Given Login as a Super Admin
    Then Navigate to User and Accounts module
    And Choose the partner and Click add new users
    Then Choose "Institutional" user type
    And Enter "valid" inputs in User fields "with multi document" and click User Save button
    Then "User has been created sucessfully" Validate message should be displayed

  @NewUser
  Scenario: 757596_Check whether an director user can be created under the institutional user
    Given Login as a Super Admin
    Then Navigate to User and Accounts module
    And Choose the partner and Click add new users
    Then Choose "Director" user type
    And Enter "valid" inputs in Director User fields "with autopilot" and click User Save button
    Then "User has been created sucessfully" Validate message should be displayed

  @NewUser
  Scenario: 757596_Verify the Institutional and Director User has access to Create, View and Edit the details.
    Given Login as a Super Admin
    Then Navigate to User and Accounts module
    And Choose the partner
    And Click already created Director user
    And Update "Address" and click save button
    Then "The changes for the User has been updated sucessfully" Validate message should be displayed

  @NewUser
  Scenario: 757596_Check whether the Users and Accounts count displays in the header section
    Given Login as a Super Admin
    Then Navigate to User and Accounts module
    And Choose the partner
    Then Check Users and Accounts count should be displayed

  # Script ready, Need to change xpath
  @NewUser
  Scenario: 757596_Verify The Universal Search Functionality With The Valid Data.
    Given Login as a Super Admin
    Then Navigate to User and Accounts module
    And Choose the partner
    And enter the "valid" input on User universal search and search it
    And verify records on User

  @NewUser
  Scenario: 757596_Verify The Universal Search Functionality With The Invalid Data.
    Given Login as a Super Admin
    Then Navigate to User and Accounts module
    And Choose the partner
    And enter the "invalid" input on User universal search and search it
    And verify no record found

  @NewUser
  Scenario: 757596_Apply One Filter At A Time With The Valid Data and Verify The Results
    Given Login as a Super Admin
    Then Navigate to User and Accounts module
    And Choose the partner
    And click on filter button
    And Apply one filter and search on User
    And verify records on User

  @NewUser
  Scenario: 757596_Apply One Filter At A Time With The Invalid Data and Verify The System Shows The No Data Found Message.
    Given Login as a Super Admin
    Then Navigate to User and Accounts module
    And Choose the partner
    And click on filter button
    And Apply one filter with invalid input and search on User
    And verify no record found

  @NewUser
  Scenario: 757596_Apply Multiple Filter At A Time With The Valid Data and Verify The Results.
    Given Login as a Super Admin
    Then Navigate to User and Accounts module
    And Choose the partner
    And click on filter button
    And Apply multiple filter and search on User
    And verify records on User

  @NewUser
  Scenario: 757596_Apply Multiple Filter At A Time With The inValid Data and Verify The Results.
    Given Login as a Super Admin
    Then Navigate to User and Accounts module
    And Choose the partner
    And click on filter button
    And Apply multiple filter with invaild input and search on User
    And verify no record found

  @NewUser
  Scenario: 757596_Apply The Clear All and Verify System Clears All The Fields.
    Given Login as a Super Admin
    Then Navigate to User and Accounts module
    And Choose the partner
    And click on filter button
    And Apply clear all in User filter

  @NewUser
  Scenario: 757596_Click on the Reset buttom from filter menu and verify it refresh the list screen.
    Given Login as a Super Admin
    Then Navigate to User and Accounts module
    And Choose the partner
    And click on filter button
    And Click on the Reset buttom from User filter menu

  @NewUser
  Scenario: 757596_Apply the Sort on Every Column and Verify the Results.
    Given Login as a Super Admin
    Then Navigate to User and Accounts module
    And Choose the partner
    And sort order on column
    And verify sorted records in "ascending order"
    And sort order on column
    And verify sorted records in "decending order"
    And sort order on column

  @NewUser
  Scenario: 757596_Check whether the pagination works properly when the filter is applied.
    Given Login as a Super Admin
    Then Navigate to User and Accounts module
    And Choose the partner
    Then Should show the page number properly

  @NewUser
  Scenario: 757596_Check whether the Next and Previous linktext switches the tab in Create, View and Edit Mode.
    Given Login as a Super Admin
    Then Navigate to User and Accounts module
    And Choose the partner and Click add new users
    Then Choose "Institutional" user type
    Then Check Next and Previous linktext switches

  @NewUserTest
  Scenario: 757596_Check whether the View column works properly in both list section and filter menu section.
    Given Login as a Super Admin
    Then Navigate to User and Accounts module
    And Choose the partner
    Then Check View column works properly

  @NewUser
  Scenario: 757596_Verify multiple director user can be created under a partner
    Given Login as a Super Admin
    Then Navigate to User and Accounts module
    And Choose the partner and Click add new users
    Then Choose "Director" user type
    And Verify multiple director user can be created under a partner and click User Save button
    Then "User has been created sucessfully" Validate message should be displayed

  @NewUser
  Scenario: 757596_Create a director user a partner which has no Insitutional user and Verify system throws an validation error toast message
    Given Login as a Super Admin
    #And Create New "BROKER" Partner type to which User should be added
    Then Navigate to User and Accounts module
    And Choose the partner and Click add new users
    Then Choose "Director" user type
    And Enter "valid" inputs in Director User fields "with autopilot" and click User Save button
    Then "No institutional user available for this partner" Validate message should be displayed

  @NewUser
  Scenario: 757596_Check whether an user can be created under different partners.
    Given Login as a Super Admin
    And Create New "BROKER" Partner type to which User should be added
    Then Navigate to User and Accounts module
    And Choose the partner and Click add new users
    Then Choose "Institutional" user type
    And Enter "valid" inputs in User fields "without autopilot" and click User Save button

  @NewUser
  Scenario: 757596_Add a note to a user and Verify it is displayed in the View/ Edit Mode.
    Given Login as a Super Admin
    Then Navigate to User and Accounts module
    And Choose the partner
    And Click already created user
    And Verify "Multiple" notes is displayed properly
