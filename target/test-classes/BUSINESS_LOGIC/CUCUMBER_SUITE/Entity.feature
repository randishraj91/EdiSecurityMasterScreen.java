@Sprint12 @EntityTest
Feature: Entity Feature

  @EntityTest
  Scenario: 757540_Verify Add New Entity with All Fields
    And user launches the PostTrade application for super admin
    And Enter the confirmation code
    Then Choose the Specific Company
    And click "Entity" from the Account Data Management menu
    Then Click Add New Entity button
    And Enter data in all Fields on Entity
    Then click save button
    And click skip button
    And click on filter button
    And apply one filter and search on entity
    And verify records on entity

  @EntityTest
  Scenario: 757539_Verify Add New Entity with Valid Inputs
    And user launches the PostTrade application for super admin
    And Enter the confirmation code
    Then Choose the Specific Company
    And click "Entity" from the Account Data Management menu
    Then Click Add New Entity button
    And Enter data in mandatory Fields on Entity
    Then click save button
    And click skip button
    And click on filter button
    And apply one filter and search on entity
    And verify records on entity

  @EntityTest
  Scenario: 757542_Verify Add New Entity without Manatory Fields
    And user launches the PostTrade application for super admin
    And Enter the confirmation code
    Then Choose the Specific Company
    And click "Entity" from the Account Data Management menu
    Then Click Add New Entity button
    And click save without mandatory fields and verify unable to save on entity

  @EntityTest
  Scenario: 757541_Verify Add New Entity with Mandatory Fields
    And user launches the PostTrade application for super admin
    And Enter the confirmation code
    Then Choose the Specific Company
    And click "Entity" from the Account Data Management menu
    Then Click Add New Entity button
    And Enter data in mandatory Fields on Entity
    Then click save button
    And click skip button
    And click on filter button
    And apply one filter and search on entity
    And verify records on entity

  @EntityTest
  Scenario: 757552_Verify Popup box should be displayed for adding a partner for respective Entity by login as an Super User
    And user launches the PostTrade application for super admin
    And Enter the confirmation code
    Then Choose the Specific Company
    And click "Entity" from the Account Data Management menu
    Then Click Add New Entity button
    And Enter data in mandatory Fields on Entity
    Then click save button
    And click Add Partner button on popup
    And Navigates to Partner page

  @EntityTest
  Scenario: 757543_Verify Add New Entity with Max valid inputs
    And user launches the PostTrade application for super admin
    And Enter the confirmation code
    Then Choose the Specific Company
    And click "Entity" from the Account Data Management menu
    Then Click Add New Entity button
    And Enter max valid input Fields on Entity
    Then click save button
    And click skip button

  @EntityTest
  Scenario: 757544_Verify Add New Entity with same Legal Name
    And user launches the PostTrade application for super admin
    And Enter the confirmation code
    Then Choose the Specific Company
    And click "Entity" from the Account Data Management menu
    Then Click Add New Entity button
    And Enter data in all Fields on Entity
    Then click save button
    And "Legal Name Already Exist" Validate message should be displayed

  @EntityTest
  Scenario: 757555_Apply One Filter At A Time With The Valid Data And Verify The Results
    And user launches the PostTrade application for super admin
    And Enter the confirmation code
    Then Choose the Specific Company
    And click "Entity" from the Account Data Management menu
    Then Click Add New Entity button
    And Enter data in mandatory Fields on Entity
    Then click save button
    And click skip button
    And click on filter button
    And apply one filter and search on entity
    And verify records on entity

  @EntityTest
  Scenario: 757556_Apply One Filter At A Time With The Invalid Data And Verify The System Shows The No Data Found Message
    And user launches the PostTrade application for super admin
    And Enter the confirmation code
    Then Choose the Specific Company
    And click "Entity" from the Account Data Management menu
    And click on filter button
    And apply one filter with invalid input and search on entity
    And verify no record found

  @EntityTest
  Scenario: 757557_Apply multiple Filter At A Time With The Valid Data And Verify The Results
    And user launches the PostTrade application for super admin
    And Enter the confirmation code
    Then Choose the Specific Company
    And click "Entity" from the Account Data Management menu
    Then Click Add New Entity button
    And Enter data in mandatory Fields on Entity
    Then click save button
    And click skip button
    And click on filter button
    And apply multiple filter and search on entity
    And verify records on entity

  @EntityTest
  Scenario: 757558_Apply Multiple Filter At A Time With The Invalid Data And Verify The System Shows The No Data Found Message
    And user launches the PostTrade application for super admin
    And Enter the confirmation code
    Then Choose the Specific Company
    And click "Entity" from the Account Data Management menu
    And click on filter button
    And apply multiple filter with invalid input and search on entity
    And verify no record found

  @EntityTest
  Scenario: 757553_Verify Universal Search with Valid Data
    And user launches the PostTrade application for super admin
    And Enter the confirmation code
    Then Choose the Specific Company
    And click "Entity" from the Account Data Management menu
    Then Click Add New Entity button
    And Enter data in mandatory Fields on Entity
    Then click save button
    And click skip button
    And enter the "valid" input on entity universal search and search it
    And verify records on entity

  @EntityTest
  Scenario: 757554_Verify Universal Search with invalid Data
    And user launches the PostTrade application for super admin
    And Enter the confirmation code
    Then Choose the Specific Company
    And click "Entity" from the Account Data Management menu
    And enter the "invalid" input on entity universal search and search it
    And verify no record found

  @EntityTest
  Scenario: 757546_Verify Update Entity with Invalid Inputs
    And user launches the PostTrade application for super admin
    And Enter the confirmation code
    Then Choose the Specific Company
    And click "Entity" from the Account Data Management menu
    And filter existing record and edit "Invalid" inputs to entity
    And verify error message on entity

  @EntityTest
  Scenario: 757545_Verify Update Entity with Mandatory Fields
    And user launches the PostTrade application for super admin
    And Enter the confirmation code
    Then Choose the Specific Company
    And click "Entity" from the Account Data Management menu
    And filter existing record and edit "valid" inputs to entity
    Then click save button
    And verify saved successful message

  @EntityTest
  Scenario: 757559_Verify sort
    And user launches the PostTrade application for super admin
    And Enter the confirmation code
    Then Choose the Specific Company
    And click "Entity" from the Account Data Management menu
    And sort order on column
    And verify sorted records in "ascending order"
    And sort order on column
    And verify sorted records in "decending order"
    And sort order on column


  #Scenario: 757547_Verify User can able to Add a Entity by login as an Individual User
    #And user launches the PostTrade application for individual user
    #And Enter the confirmation code
    #And click "Entity" from the Account Data Management menu
    #Then Click Add New Entity button
    #And Enter data in mandatory Fields on Entity
    #Then click save button
    #And click skip button
    #And click on filter button
    #And apply multiple filter and search on entity
    #And verify records on entity
#
  #Scenario: 757548_Verify User can able to Add a Entity with Mandatory fields by login as an Individual User
    #And user launches the PostTrade application for individual user
    #And Enter the confirmation code
    #And click "Entity" from the Account Data Management menu
    #Then Click Add New Entity button
    #And Enter data in mandatory Fields on Entity
    #Then click save button
    #And click skip button
    #And click on filter button
    #And apply multiple filter and search on entity
    #And verify records on entity
#
#
  #Scenario: 757550_Verify User can not able to update a Entity with invalid data by login as an Individual User
    #And user launches the PostTrade application for individual user
    #And Enter the confirmation code
    #Then Choose the Specific Company
    #And click "Entity" from the Account Data Management menu
    #And filter existing record and edit "Invalid" inputs to entity
    #And verify error message on entity
#
#
  #Scenario: 757549_Verify User can able to update a Entity by login as an Individual User
    #And user launches the PostTrade application for individual user
    #And Enter the confirmation code
    #Then Choose the Specific Company
    #And click "Entity" from the Account Data Management menu
    #And filter existing record and edit "valid" inputs to entity
    #Then click save button
    #And verify saved successful message
#
#
  #Scenario: 757551_VerifyVerify Popup box should be displayed for add a partner for respective Entity by login as an Individual User
    #And user launches the PostTrade application for individual user
    #And Enter the confirmation code
    #Then Choose the Specific Company
    #And click "Entity" from the Account Data Management menu
    #Then Click Add New Entity button
    #And Enter data in mandatory Fields on Entity
    #Then click save button
    #And click Add Partner button on popup
    #And Navigates to Partner page