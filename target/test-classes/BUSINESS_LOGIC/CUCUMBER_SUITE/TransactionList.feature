
Feature: Transaction List Feature
    Background: User is successfully logged in
    Given user navigate to Transaction screen


  Scenario: Search the Transaction with Valid Keyword
    Given user enters the Keyword in Searchbox
    Then Verify the Search Result


  Scenario: Search Transaction with invalid Data
    When user enter  "No Data"  in search box
    And user should able to view "No data found" in table list screen

  @Sanity6
  Scenario: 710712_Multiple Search - Filter Transaction with Symbol and Currency
    Given click on the Transaction filter by button
    When Select  the Currency and Symbol
    Then Click on Search Button
    And  Check whether Currency and Symbol are displayed in the List Screen

  @Sanity
  Scenario: Filter Transaction with Batch Number
    Given click on the Transaction filter by button
    When enter the Batch Number
    Then Click on Search Button
    And  Check whether Batch Number is displayed in the List Screen

  @Sanity7
  Scenario: Filter Transaction with Correspondent
    Given click on the Transaction filter by button
    When Select the Correspondent
    Then Click on Search Button
    And  Check whether Correspondent is displayed in the List Screen


  @Sanity7
  Scenario: Filter Transaction with Office
    Given click on the Transaction filter by button
    When Select the Office
    Then Click on Search Button
    And  Check whether Office is displayed in the List Screen

  @Sanity7
  Scenario: Filter Transaction with Account Number
    Given click on the Transaction filter by button
    When Select the Account Number
    Then Click on Search Button
    And  Check whether Account Number is displayed in the List Screen

  @Sanity7
  Scenario: Filter Transaction with Account Name
    Given click on the Transaction filter by button
    When Select the Account Name
    Then Click on Search Button
    And  Check whether Account Name is displayed in the List Screen

  @Sanity6
  Scenario: Filter Transaction with Account Type
    Given click on the Transaction filter by button
    When Select the Account Type
    Then Click on Search Button
    And  Check whether Account Type is displayed in the List Screen

  @Sanity6
  Scenario: Filter Transaction with Transaction Type
    Given click on the Transaction filter by button
    When Select the Transaction Type
    Then Click on Search Button
    And  Check whether Transaction Type is displayed in the List Screen

  @Sanity6
  Scenario: Filter Transaction with Trade Date
    Given click on the Transaction filter by button
    When Select the Trade Date
    Then Click on Search Button
    And  Check whether Trade Date is displayed in the List Screen

  @Sanity6
  Scenario: Filter Transaction with Settlement Date
    Given click on the Transaction filter by button
    When Select the Settlement Date
    Then Click on Search Button
    And  Check whether Settlement Date is displayed in the List Screen

  @Sanity6
  Scenario: Filter Transaction with Entry Date
    Given click on the Transaction filter by button
    When Select the Entry Date
    Then Click on Search Button
    And  Check whether Entry Date is displayed in the List Screen

  @Sanity66
  Scenario: Filter Transaction with Currency
    Given click on the Transaction filter by button
    When Select the Currency
    Then Click on Search Button
    And  Check whether Currency is displayed in the List Screen

  @Sanity66
  Scenario: Filter Transaction with Price
    Given click on the Transaction filter by button
    When Enter the price
    Then Click on Search Button
    And  Check whether Price is displayed in the List Screen

  @Sanity65
  Scenario: Filter Transaction with Gross Amount
    Given click on the Transaction filter by button
    When Enter the Gross Amount
    Then Click on Search Button
    And  Check whether Gross Amount is displayed in the List Screen

  @Sanity6
  Scenario: Filter Transaction with Net Amount
    Given click on the Transaction filter by button
    When Enter the Net Amount
    Then Click on Search Button
    And  Check whether Net Amount is displayed in the List Screen


  @Sanity6
  Scenario: Filter Transaction with Entry Type
    Given click on the Transaction filter by button
    When Select the Entry Type
    Then Click on Search Button
    And  Check whether Entry Type is displayed in the List Screen

  @Sanity6
  Scenario: Filter Transaction with Transaction Number
    Given click on the Transaction filter by button
    When Select the Transaction Number
    Then Click on Search Button
    And  Check whether Transaction Number is displayed in the List Screen