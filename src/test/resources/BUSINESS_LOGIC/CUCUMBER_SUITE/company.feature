@Company @Sprint12
Feature: Company Feature

  @Company @Complex @Demo12
  Scenario: 757531_Verify Add New Company by entering data only in Mandatory Fields
    When User enter the super admin username
    And Enter the super admin password
    Then Click login button
    And Enter the confirmation code
    Then Company page should be displayed
    And Choose the Specific Company
    Then User should be redirected to Company Overview Screen
    Then Click Add New Company button
   And Enter data in all Company Mandatory Fields
    Then User should able to create a new company

  @Company @Medium
  Scenario: 757532_Add New Company And Verify User Can Switch To The New Company To View Details
    When User enter the super admin username
    And Enter the super admin password
    Then Click login button
    And Enter the confirmation code
    Then Company page should be displayed
    And Choose the Specific Company
    Then User should be redirected to Company Overview Screen
    And Switch to the new company

  @Company @Medium
  Scenario: 757533_Verify Add New Company by entering data Without Mandatory Fields
    When User enter the super admin username
    And Enter the super admin password
    Then Click login button
    And Enter the confirmation code
    Then Company page should be displayed
    And Choose the Specific Company
    Then User should be redirected to Company Overview Screen
    Then Click Add New Company button
    And Enter data without Mandators fields and click Save button

  @Company @Complex
  Scenario: 757534_Verify Add New Company by filling up with Valid Inputs
    When User enter the super admin username
    And Enter the super admin password
    Then Click login button
    And Enter the confirmation code
    Then Company page should be displayed
    And Choose the Specific Company
    Then User should be redirected to Company Overview Screen
    Then Click Add New Company button
    And Enter data in all Company Fields
    Then User should able to create a new company

  @Company @Complex
  Scenario: 757535_Verify Add New Company by filling up with invalid Inputs
    When User enter the super admin username
    And Enter the super admin password
    Then Click login button
    And Enter the confirmation code
    Then Company page should be displayed
    And Choose the Specific Company
    Then User should be redirected to Company Overview Screen
    Then Click Add New Company button
    And Enter invaild data in all Company Fields

  @Company @Complex
  Scenario: 757536_Verify Add New Company by entering the same company code
    When User enter the super admin username
    And Enter the super admin password
    Then Click login button
    And Enter the confirmation code
    Then Company page should be displayed
    And Choose the Specific Company
    Then User should be redirected to Company Overview Screen
    Then Click Add New Company button
    And Enter data in all Company Mandatory Fields
    Then User should able to view the validation message

  @Company @Medium
  Scenario: 757537_Add New Company and Verify User Can Switch To The New Company To View Details
    When User enter the super admin username
    And Enter the super admin password
    Then Click login button
    And Enter the confirmation code
    Then Company page should be displayed
    And Choose the Specific Company
    Then User should be redirected to Company Overview Screen
    And Switch to the new company
    And Click Edit option and modify the company details with "valid" data
    Then Click Save button and user should able to receive the updation message

  @Company @Medium
  Scenario: 757538_Verify update company by entering Invalid data
    When User enter the super admin username
    And Enter the super admin password
    Then Click login button
    And Enter the confirmation code
    Then Company page should be displayed
    And Choose the Specific Company
    Then User should be redirected to Company Overview Screen
    And Switch to the new company
    And Click Edit option and modify the company details with "Invalid" data
