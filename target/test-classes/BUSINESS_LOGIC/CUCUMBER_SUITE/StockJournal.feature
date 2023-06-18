
Feature: Stock journal Feature
  Background: User is successfully logged in
    Given user navigate to stock Journal screen


  Scenario: 712193_Create Stock Journal With All Fields
    Given Create a new Stock Journal entry with All fields
    When Click on Stock Journal Save button
    Then validation message should be displayed on Stock Journal screen


  Scenario: 712192_Create Stock Journal With mandatory Fields
    Given Create a new Stock Journal entry with mandatory fields
    When Click on Stock Journal Save button
    Then validation message should be displayed on Stock Journal screen

  @Re1
  Scenario: 712194_Create Stock Journal With multiple stock entries
    Given Create a new Stock Journal entry with multiple stock entries
    When Click on Stock Journal Save button
    Then validation message should be displayed on Stock Journal screen

  Scenario:C712195_Create A New Stock Journal Entry With Fractional Quantity and Cost Basis
    Given Create A New Stock Journal Entry With Fractional Quantity and Cost Basis
    When Click on Stock Journal Save button
    Then validation message should be displayed on Stock Journal screen

  @San
  Scenario: 712203_Update the Stock Journal with mandatory fields
    Given Search the Stock Transaction and click on the Transaction no
    When Update the Stock Journal with mandatory fields
    Then Click on Stock Journal Save button
    And "edit message" edit validation message should be displayed on Stock Journal screen

  @San
  Scenario: 712204_Update the Stock Journal All fields
    Given Search the Stock Transaction and click on the Transaction no
    When Update the Stock Journal with All fields
    Then Click on Stock Journal Save button
    And "edit message" edit validation message should be displayed on Stock Journal screen


  Scenario: 712206_Click On Clear Button And Verify System Clears All The Inputs
    Given Create a new Stock Journal entry with All fields
    When Click on Stock Journal Clear button

@san7
  Scenario: 716491_Cancel the Stock Journal
    Given Search the Stock Transaction and click on the Transaction no
    When Click ok Stock Journal Cancel Trade button and select the reason to cancel
    Then "Cancel message" cancel validation message should be displayed on Stock Journal screen