@BrokerMaster
Feature: Broker Master Feature

  @BrokerMaster
  Scenario: 742444_Create A New Broker Master With All The Fields
    Given Login as a Super Admin Broker Master
    And User should be redirected to System wide Master data Overview Screen
    Then Choose the Brokermaster from Main list
    And  Click Add New Broker button
    And Enter data in all Broker  Fields
    Then "Broker master has been created successfully!" Validate message should be displayed

  @BrokerMaster
  Scenario: 742443_Create A New Broker Master With The Mandatory Fields
    Given Login as a Super Admin Broker Master
    And User should be redirected to System wide Master data Overview Screen
    Then Choose the Brokermaster from Main list
    And  Click Add New Broker button
    And Enter data in all Broker Mandatory Fields
    Then "Broker master has been created successfully!" Validate message should be displayed

  @BrokerMaster
  Scenario: 744882_Create A New Broker Master With The Same Broker Name
    Given Login as a Super Admin Broker Master
    And User should be redirected to System wide Master data Overview Screen
    Then Choose the Brokermaster from Main list
    And  Click Add New Broker button
    And Enter data in all Broker Master With The Same Broker
    Then "Broker Name Already Exist" Validate message should be displayed

  @BrokerMaster
  Scenario: 742445_Update A Broker Master With Mandatory Fields And Verify The Changes Have Been Saved
    Given Login as a Super Admin Broker Master
    And User should be redirected to System wide Master data Overview Screen
    Then Choose the Brokermaster from Main list
    Then Click On the Search Button Broker Master and update value
    And  Click on the edit and view option from list and edit button
    And Updating  all Broker Master With Mandatory Fields
    And "The changes for the broker master creqdqs has been saved successfully!" Validate message should be displayed

  @BrokerMaster
  Scenario: 744874_Update A Broker Master With All The Fields And Verify The Changes Have Been Saved
    Given Login as a Super Admin Broker Master
    And User should be redirected to System wide Master data Overview Screen
    Then Choose the Brokermaster from Main list
    Then Click On the Search Button Broker Master and update value
    And  Click on the edit and view option from list and edit button
    And Updating  the Broker Master With All Fields
    And "The changes for the broker master creqdqs has been saved successfully!" Validate message should be displayed


  @BrokerMaster
  Scenario:742448_Apply One Filter At A Time With The Valid Data And Verify The Results
    Given Login as a Super Admin Broker Master
    And User should be redirected to System wide Master data Overview Screen
    Then Choose the Brokermaster from Main list
    Then Click Filter By  button BM
    And Apply One Filter Valid Data and Search
    Then verify records on Valid Data filter


  @BrokerMaster
  Scenario:742449_Apply Multiple Filter At A Time With The Valid Data And Verify The Results
    Given Login as a Super Admin Broker Master
    And User should be redirected to System wide Master data Overview Screen
    Then Choose the Brokermaster from Main list
    Then Click Filter By  button BM
    And Apply Multiple Filter Valid Data and Search
    Then verify records on Valid Data filter

  @BrokerMaster
  Scenario:744872_Apply One Filter At A Time With The InValid Data And Verify The Results
    Given Login as a Super Admin Broker Master
    And User should be redirected to System wide Master data Overview Screen
    Then Choose the Brokermaster from Main list
    Then Click Filter By  button BM
    And Apply One Filter InValid Data and Search BM
    And verify the no Data Found BM

  @BrokerMaster
  Scenario:744873_Apply Multiple Filter At A Time With The InValid Data And Verify The Results
    Given Login as a Super Admin Broker Master
    And User should be redirected to System wide Master data Overview Screen
    Then Choose the Brokermaster from Main list
    Then Click Filter By  button BM
    And Apply Multiple Filter InValid Data and Search BM
    And verify the no Data Found BM

  @BrokerMaster
  Scenario:742447_Verify The Universal Search Functionality With The Valid Data
    Given Login as a Super Admin Broker Master
    And User should be redirected to System wide Master data Overview Screen
    Then Choose the Brokermaster from Main list
    Then Click On the Search Button Broker Master
    And Enter the broker valid Search Data
    Then verify the records on valid Search Data

  @BrokerMaster
  Scenario:742450_Verify The Universal Search Functionality With The InValid Data
    Given Login as a Super Admin Broker Master
    And User should be redirected to System wide Master data Overview Screen
    Then Choose the Brokermaster from Main list
    Then Click On the Search Button Broker Master
    And Enter the broker Invalid Search Data
    And verify the no Data Found BM

  @BrokerMaster
  Scenario:742446_Verify The Export Functionality On The List Page
    Given Login as a Super Admin Broker Master
    And User should be redirected to System wide Master data Overview Screen
    Then Choose the Brokermaster from Main list
    And Select on the pre export Options
    Then Click on the Export Button
    Then Verifying "Broker Master" web tables entrie and csv files entries by Comparing it
    And user should delete the "Broker Master" CSV files from downloaded follder



