Feature: Partner Feature
   
    
  @NewPartner @Demo12
  Scenario: 757596&757612_Verify User able to Create a New Partner with All fields & Updation
    Given Login as a Super Admin
    And Create Business Entity to which partner should be added
    And Click Add New Partner button
    Then Enter valid inputs in the fields and click Save button
    And "Partner has been saved successfully!" Validate message should be displayed
    And View the create Partner in a list view on Partner Overview page
    Then Click Edit button, entered Updated Inputs in the fields and click Save button
    And "The changes for the partner has been saved successfully!" Validate message should be displayed

  @NewPartner
  Scenario: 757597&757613_Verify User able to Create a New Partner with Mandatory fields & Updation
    Given Login as a Super Admin
    And Click Add New Partner button
    Then Enter valid inputs in the mandatory fields and click Save button
    And "Partner has been saved successfully!" Validate message should be displayed
    And View the create Partner in a list view on Partner Overview page
    Then Click Edit button, entered Updated Inputs in the fields and click Save button
    And "The changes for the partner has been saved successfully!" Validate message should be displayed

  @NewPartner
  Scenario: 757602&757617_Verify User able to Create a New Partner with Different Partner Type & Updation
    Given Login as a Super Admin
    And Click Add New Partner button
    Then Enter valid inputs in the mandatory fields with different "Broker Partner" and click Save button
    And "Partner has been saved successfully!" Validate message should be displayed
    And View the create Partner in a list view on Partner Overview page
    Then Click Edit button, entered Updated Inputs in the fields and click Save button
    And "The changes for the partner has been saved successfully!" Validate message should be displayed

  @NewPartner
  Scenario: 757603_Verify User able to Create a New Partner with Different Business Structure Type & Updation
    Given Login as a Super Admin
    And Click Add New Partner button
    Then Enter valid inputs in the mandatory fields with different "Business structure" and click Save button
    And "Partner has been saved successfully!" Validate message should be displayed

  @NewPartner
  Scenario: 757604&757620_Verify User able to Create a New Partner with Different Product ID & Updation
    Given Login as a Super Admin
    And Click Add New Partner button
    Then Enter valid inputs in the mandatory fields with different "Product ID" and click Save button
    And "Partner has been saved successfully!" Validate message should be displayed
    And View the create Partner in a list view on Partner Overview page
    Then Click Edit button, entered Updated Inputs in the fields and click Save button
    And "The changes for the partner has been saved successfully!" Validate message should be displayed

  @NewPartner
  Scenario: 757605&757618_Verify User able to Create a New Partner with Different Registration Type & Updation
    Given Login as a Super Admin
    And Click Add New Partner button
    Then Enter valid inputs in the mandatory fields with different "Registration Type" and click Save button
    And "Partner has been saved successfully!" Validate message should be displayed
    And View the create Partner in a list view on Partner Overview page
    Then Click Edit button, entered Updated Inputs in the fields and click Save button
    And "The changes for the partner has been saved successfully!" Validate message should be displayed

  @NewPartner
  Scenario: 757606&757619_Verify User able to Create a New Partner with Different Funding Type  & Updation
    Given Login as a Super Admin
    And Click Add New Partner button
    Then Enter valid inputs in the mandatory fields with different "Funding Type" and click Save button
    And "Partner has been saved successfully!" Validate message should be displayed
    And View the create Partner in a list view on Partner Overview page
    Then Click Edit button, entered Updated Inputs in the fields and click Save button
    And "The changes for the partner has been saved successfully!" Validate message should be displayed

  @NewPartner
  Scenario: 757607&757611_Verify User able to Create a New Partner with a Same wlpid & Updation
    Given Login as a Super Admin
    And Click Add New Partner button
    Then Enter valid inputs in the mandatory fields with different "Same WIP ID" and click Save button
    And "Wlp Id Already Exist" Validate message should be displayed

  @NewPartner
  Scenario: 757609&757622_Verify User able to Create a New Partner without Office Document & Updation
    Given Login as a Super Admin
    And Click Add New Partner button
    Then Enter valid inputs in the mandatory fields without "Office" document and click Save button
    And "Partner has been saved successfully!" Validate message should be displayed
    And View the create Partner in a list view on Partner Overview page
    Then Click Edit button, entered Updated Inputs in the fields and click Save button
    And "The changes for the partner has been saved successfully!" Validate message should be displayed

  @NewPartner
  Scenario: 757610_Verify User able to Create a New Partner without Report Document
    Given Login as a Super Admin
    And Click Add New Partner button
    Then Enter valid inputs in the mandatory fields without "Report" document and click Save button

  @NewPartner
  Scenario: 757599_Verify User able to Create a New Partner with a Different Business Entity
    Given Login as a Super Admin
    And Create different Business Entity to which partner should be added
    And Click Add New Partner button with different entity
    Then Enter valid inputs in the mandatory fields and click Save button
    And "Partner has been saved successfully!" Validate message should be displayed

  @NewPartner
  Scenario: 757598_Verify User able to Create a New Partner without Mandatory Fields
    Given Login as a Super Admin
    And Click Add New Partner button
    Then Check save button is disabled

  @NewPartner
  Scenario: 757608&757621_Verify User able to Create a New Partner with Multiple office and suboffice
    Given Login as a Super Admin
    And Click Add New Partner button
    Then Enter valid inputs in the mandatory fields with different "Office and suboffice" and click Save button
    And "Partner has been saved successfully!" Validate message should be displayed
    And View the create Partner in a list view on Partner Overview page
    Then Click Edit button, entered Updated Inputs in the fields and click Save button
    And "The changes for the partner has been saved successfully!" Validate message should be displayed

  @NewPartner
  Scenario: 757600&757615_Verify User able to Create a New Partner with Min Valid Inputs & updation
    Given Login as a Super Admin
    And Click Add New Partner button
    Then Enter valid "minimum" inputs in the fields and click Save button
    And "Partner has been saved successfully!" Validate message should be displayed
    And View the create Partner in a list view on Partner Overview page
    Then Click Edit button, entered Updated Inputs in the fields and click Save button
    And "The changes for the partner has been saved successfully!" Validate message should be displayed

  @NewPartner
  Scenario: 757601&757616_Verify User able to Create a New Partner with Max Valid Inputs & updation
    Given Login as a Super Admin
    And Click Add New Partner button
    Then Enter valid "maximum" inputs in the fields and click Save button
    And "Partner has been saved successfully!" Validate message should be displayed
    And View the create Partner in a list view on Partner Overview page
    Then Click Edit button, entered Updated Inputs in the fields and click Save button
    And "The changes for the partner has been saved successfully!" Validate message should be displayed

  @NewPartnerTest
  Scenario: 757625_Verify Universal Search with Valid Data
  And user launches the PostTrade application for super admin
    And Enter the confirmation code
    Then Choose the Specific Company
    And click "Partner" from the Account Data Management menu
    And enter the "valid" input on partner universal search and search it
    And verify records on partner

  @NewPartnerTest
  Scenario: 757626_Verify Universal Search with invalid Data
    And user launches the PostTrade application for super admin
    And Enter the confirmation code
    Then Choose the Specific Company
    And click "Partner" from the Account Data Management menu
    And enter the "invalid" input on entity universal search and search it
    And verify no record found

  @NewPartnerTest
  Scenario: 757627_Verify Applying One Valid Filter at a Time in filterbysection
    And user launches the PostTrade application for super admin
    And Enter the confirmation code
    Then Choose the Specific Company
    And click "Partner" from the Account Data Management menu
    And click on filter button
    And apply one filter and search on partner
    And verify records on partner

  @NewPartnerTest
  Scenario: 757628_Verify Applying One inValid Filter at a Time in filterbysection
    And user launches the PostTrade application for super admin
    And Enter the confirmation code
    Then Choose the Specific Company
    And click "Partner" from the Account Data Management menu
    And click on filter button
    And apply one filter with invalid input and search on partner
    And verify no record found

  @NewPartnerTest
  Scenario: 757629_Verify Applying multiple Valid Filter at a Time in filterbysection
     And user launches the PostTrade application for super admin
    And Enter the confirmation code
    Then Choose the Specific Company
    And click "Partner" from the Account Data Management menu
    And click on filter button
    And apply multiple filter and search on partner
    And verify records on partner

  @NewPartnerTest
  Scenario: 757630_Apply Multiple Filter At A Time With The Invalid Data And Verify The System Shows The No Data Found Message
    And user launches the PostTrade application for super admin
    And Enter the confirmation code
    Then Choose the Specific Company
    And click "Partner" from the Account Data Management menu
    And click on filter button
    And apply multiple filter with invalid input and search on partner
    And verify no record found

  @NewPartnerTest1
  Scenario: 757631_Verify sort
    Given Login as a Super Admin
    And click "Partner" from the Account Data Management menu
    And sort order on column
    And verify sorted records in "ascending order"
    And sort order on column
    And verify sorted records in "decending order"
    And sort order on column
