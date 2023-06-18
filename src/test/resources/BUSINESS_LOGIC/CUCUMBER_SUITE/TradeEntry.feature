
Feature: Trade Entry Feature
  Background: User is successfully logged in
    Given user navigate to Trade Entry screen



  Scenario: 715241_Create Trade Entry With All Fields
    Given user enters the Trade Entry details with All fields
    When Click on Trade Save button
    Then validation message should be displayed on Trade screen


  Scenario: 715229_Create Trade Entry With mandatory Fields
    Given user enters the Trade Entry details with mandatory fields
    When Click on Trade Save button
    Then validation message should be displayed on Trade screen

@San
  Scenario: 715232_Create Trade Entry With Fractional Quantity and Price
    Given Create Trade Entry With Fractional Quantity and Price
    When Click on Trade Save button
    Then validation message should be displayed on Trade screen

  @san89
  Scenario: 715256_Create Trade Entry With all Transaction types
    Given user enters the Trade Entry details with all transaction type
    When Click on Trade Save button
    Then validation message should be displayed on Trade screen


  Scenario: 715234_Create Trade Entry With all Entry types
    Given user enters the Trade Entry details with all Entry types
    When Click on Trade Save button
    Then validation message should be displayed on Trade screen


  Scenario: 715240_Update the Trade with mandatory fields
    Given Search the Transaction and click on the Transaction no
    When Update the Trade Entry mandatory fields
    Then Click on Trade Save button
    And "edit message" edit validation message should be displayed on Trade Entry screen

@San3
  Scenario: 715241_Update the Trade with All fields
    Given Search the Transaction and click on the Transaction no
    When Update the Trade Entry All fields
    Then Click on Trade Save button
    And "edit message" edit validation message should be displayed on Trade Entry screen

  @san78
  Scenario: 716468_Cancel the Trade Entry
    Given Search the Transaction and click on the Transaction no
    When Click ok Cancel Trade button and select the reason to cancel
    Then "Cancel message" cancel validation message should be displayed on Trade Entry screen