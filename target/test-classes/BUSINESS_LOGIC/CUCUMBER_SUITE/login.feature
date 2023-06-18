@Login @Sprint12
Feature: Login Feature

  @test @Adminlogin @Simple  @Demo12
  Scenario: 757514_Verify That Super Admin User Is able to Login With Valid Credentials
    When User enter the super admin username
    And Enter the super admin password
    Then Click login button
    And Enter the confirmation code
    Then Company page should be displayed

  @Adminlogin @Simple
  Scenario: 757515_Verify That Super Admin User Is Not Able to Login With Invalid Username and Invalid Password
    When User enter the invaild username
    And Enter the invaild password
    Then Click login button
    Then Alert message should be displayed

  @Adminlogin @Simple
  Scenario: 757516_Verify That User Is Not Able to Login With Blank Username or Password
    When User enter the blank username
    And Enter the blank password
    Then Click login button
    Then Validation message should be displayed

  @Adminlogin @Medium
  Scenario: 757517_Verify the Super Admin User can able to choose the company
    When User enter the super admin username
    And Enter the super admin password
    Then Click login button
    And Enter the confirmation code
    Then Company page should be displayed
    And Choose the Specific Company
    Then User should be redirected to Company Overview Screen

  @Adminlogin @Medium
  Scenario: 757518_Verify the Super Admin User can able to choose the company
    When User enter the super admin username
    And Enter the super admin password
    Then Click login button
    And Enter the confirmation code
    Then Company page should be displayed
    And Choose the Specific Company
    Then User should be redirected to Company Overview Screen
    And User should able to switch to last company from the list and view the Company Overview page

  @Adminlogin @Complex
  Scenario: 757519_Verify the Super Admin User can able to Create a new Company with All Mandatory fields
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

  @Adminlogin @Complex
  Scenario: 757520_Verify the Super Admin User can able to Create a new Entity with All Mandatory fields
    When User enter the super admin username
    And Enter the super admin password
    Then Click login button
    And Enter the confirmation code
    Then Company page should be displayed
    And Choose the Specific Company
    Then User should be redirected to Company Overview Screen
    Then Click Add New Entity button in Account data management
    And Enter data in all Entity Mandatory Fields
    Then User should able to create a new Entity

  @Adminlogin @Complex
  Scenario: 757520_Verify the Super Admin User can able to Create a new Entity with All Mandatory fields
    When User enter the super admin username
    And Enter the super admin password
    Then Click login button
    And Enter the confirmation code
    Then Company page should be displayed
    And Choose the Specific Company
    Then User should be redirected to Security Master Screen data
    Then Click Add New Entity button in Account data management
    And Enter data in all Entity Mandatory Fields
    Then User should able to create a new Entity

  #@testing @Simple
  #Scenario: 757524_Verify the Individual User Is able to Login With Valid Credentials
    #When User enter the individual username
    #And Enter the individual password
    #Then Click login button
    #And Enter the confirmation code
#
  #@testing @Simple
  #Scenario: 757525_Verify the Individual User Is Not able to Login With Invalid Credentials
    #When User enter the invaild username
    #And Enter the invaild password
    #Then Click login button
    #Then Alert message should be displayed
#
  #@testing @Simple
  #Scenario: 757526_Verify the Individual User can able to choose the company
    #When User enter the individual username
    #And Enter the individual password
    #Then Click login button
    #And Enter the confirmation code
    #Then User should be redirected to Company Overview Screen
    #
    #@testing @Simple
  #Scenario: 757527_Verify User can able to view the Company overview by login as an Individual User
    #When User enter the individual username
    #And Enter the individual password
    #Then Click login button
    #And Enter the confirmation code
    #Then User should be redirected to Company Overview Screen
    #Then Add New Company button should be disabled User can View the Company overview on Home Screen
