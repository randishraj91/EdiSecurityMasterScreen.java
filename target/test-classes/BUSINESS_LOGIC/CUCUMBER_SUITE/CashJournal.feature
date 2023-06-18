
Feature: Cash journal Feature
  Background: User is successfully logged in
    Given user navigate to Cash Journal screen

  @San
  Scenario: 712255_Create Cash Journal With All Fields
    Given Create a new Cash Journal entry with All fields
    When Click on Cash Journal Save button
    Then validation message should be displayed on Cash Journal screen

  @San
  Scenario: 712254_Create Cash Journal With mandatory Fields
    Given Create a new Cash Journal entry with mandatory fields
    When Click on Cash Journal Save button
    Then validation message should be displayed on Cash Journal screen

    @San70
  Scenario:712257_Create A New Cash Journal Entry With Fractional Amount
    Given Create A New Cash Journal Entry With Fractional Amount
    When Click on Cash Journal Save button
    Then validation message should be displayed on Cash Journal screen

  @San
  Scenario: 712256_Create Cash Journal With multiple Cash entries
    Given Create a new Cash Journal entry with multiple Cash entries
    When Click on Cash Journal Save button
    Then validation message should be displayed on Cash Journal screen

  Scenario: 712265_Update the Cash Journal with mandatory fields
    Given Search the Cash Transaction and click on the Transaction no
    When Update the Cash Journal with mandatory fields
    Then Click on Cash Journal Save button
    And "edit message" edit validation message should be displayed on Cash Journal screen


  Scenario: 712266_Update the Cash Journal All fields
    Given Search the Cash Transaction and click on the Transaction no
    When Update the Cash Journal with All fields
    Then Click on Cash Journal Save button
    And "edit message" edit validation message should be displayed on Cash Journal screen

  @San
  Scenario: 712268_Click On Clear Button And Verify System Clears All The Inputs
    Given Create a new Cash Journal entry with All fields
    When Click on Cash Journal Clear button


  @san7
  Scenario: 716481_Cancel the Cash Journal
    Given Search the Cash Transaction and click on the Transaction no
    When Click ok Cash Journal Cancel Trade button and select the reason to cancel
    Then "Cancel message" cancel validation message should be displayed on Cash Journal screen