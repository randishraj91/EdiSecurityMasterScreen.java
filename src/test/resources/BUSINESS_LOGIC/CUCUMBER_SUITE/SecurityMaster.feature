@SmokeTest   @SecurityMaster23
Feature: Security Master Feature

  Background: User is successfully logged in
    And user navigate to Security Masters screen


  Scenario: Create Security Master With All Fields
    And click on add new Security Master button
    And verify column label on Security Master Screen
    And user enters the following Symbol details with all fields
      | Symbol          | Random_Symbol         |
      | Security Number | Random_SecurityNumber |
      | Assert Type     | Cryptocurrency        |
      | Sec Type        | Fixed Income          |
    And user enters the following Security master details with all fields
      | CUSIP          | Random_CUSIP   |
      | SEDOL          | Random_SEDOL   |
      | ISIN           | Random_ISIN    |
      | Sec Sub Type   | Discount Issue |
      | Exchange       | FTP24           |
      | Status         | Inactive       |
      | Country        | United States  |
      | Reg Fee Charge | Yes            |
    And user enters the following Security master additional details
      | PM Group           | Test                           |
      | PM volatility      | 10000                          |
      | Outstanding Shares | Random_Date                    |
      | Issuer             | Market Indicator/Index         |
      | Penny Pilot        | Yes                            |
      | Outstanding Shares | 4353453                        |
      | MIC                | 10000                          |
      | Fed Taxable        | Non Taxable                    |
      | State Taxable      | No Indiction In Official Stmnt |
      | Firm Sec Sub Type  | Yes                            |
    And user enters the following Security Margin additional details
      | Marginable          | No       |
      | Fed Long Rate       | 0.100000 |
      | Fed Short Rate      | 0.100000 |
      | Exchange Long Rate  | 0.100000 |
      | Exchange Short Rate | 0.100000 |
      | House Long Rate     | 0.100000 |
      | House Short Rate    | 0.100000 |
    And user enters the following Security Margin PM details
      | PM House Long Rate  | 0.100000 |
      | PM House Short Rate | 0.100000 |
      | PM Hedge Long Rate  | 0.100000 |
      | PM Hedge Short Rate | 0.100000 |
      | PM Exchn Long Rate  | 0.100000 |
      | PM Exchn Short Rate | 0.100000 |
    And user enters the following Security Settlement PM details
      | Hard to Borrow    | Yes              |
      | Sweep Destination | FEDERATED        |
      | Sweep Code        | Randon_SweepCode |
      | Currency          | BSD              |
    And user enters the following Security Classification details
      | SIC Cd     | AAAA |
      | WhenIssued | Yes  |
    And user enters the following Security Crypto Profile details
      | Contact Address     | New crypt crn |
      | Cryptocurrency Type | Airdrop       |
      | Alternative Symbol  | STATUS_GEN    |
    And user enters the following Security Prices details
      | Prices   | 9000      |
      | Currency | USD |
    And user clicks save button on security master screen
    Then "Security Master has been created successfully!" validation message should be displayed on Security Master screen
   # Then verify Security Master has been update table list



  Scenario: 724775_Search Security Master with Security Master name and verify Security Master displayed
    When user enter Security Master symbol "Random_Symbol" in search box
    Then user should able see the below Security Master details to be displayed
      | Security Master Symbol      | Random_Symbol |
      | Security Master Assert Type | Random_Assert |
      | Security Master Sec Type    | Random_Sec    |
    And user click on the Security Master details screen should be displayed



  Scenario: 724776_Search Security Master with Security Master name and verify Security Master displayed
    When user enter Security Master name "No Data"  in search box
    And user should able to "No data found" in table list screen


  Scenario: 724786_Filter security master with security master symbol and verify security master displayed
    When user click on the filter button
    And enter the Security Master symbol "Random_Symbol"
    And click on the search button
    Then user should able see the below Security Master details to be displayed
      | Security Master Symbol      | Random_Symbol |
      | Security Master Assert Type | Random_Assert |
      | Security Master Sec Type    | Random_Sec    |
    #And user click on the Security Master details screen should be displayed

  @SecurityMaster
  Scenario: 724787_Filter Security Master with Security Master assert type and verify Security Master displayed
    When user click on the filter button
    And enter the Security Master country "Random_Assert"
    And click on the search button
    Then user should able see only "Random_Assert" Security Masters detail

  @SecurityMaster
  Scenario: 724788_Filter Security Master with Security Master Sec Type and verify Security Master displayed
    When user click on the filter button
    And enter the Security Master date "Random_Sec"
    And click on the search button
    Then user should able see only date "Random_Sec" Security Masters detail


  Scenario: 724789_Filter security master with security number and verify security master displayed
    When user click on the filter button
    And enter the Security Master CUSIP "Random_CUSIP"
    And click on the search button
    Then user should able see the below Security Master details to be displayed
      | Security Master Symbol      | Random_Symbol |
      | Security Master Assert Type | Random_Assert |
      | Security Master Sec Type    | Random_Sec    |


  Scenario: 724767_Edit existing Security Master and verify the change getting updated successfully
    When user enter Security Master symbol "Random_Symbol" in search box
    Then user should able see the below Security Master details to be displayed
      | Security Master Symbol      | Random_Symbol |
      | Security Master Assert Type | Random_Assert |
      | Security Master Sec Type    | Random_Sec    |
    And user click on the Security Master details screen should be displayed
    And user enters the following  updated details with all fields on SM screen
      | Sec Type            | Fixed Income   |
      | CUSIP               | Random_CUSIP   |
      | Sec Sub Type        | Discount Issue |
      | Exchange            | FTP24           |
      | Marginable          | Yes            |
      | Fed Long Rate       | 1              |
      | Fed Short Rate      | 1              |
      | Exchange Long Rate  | 1              |
      | Exchange Short Rate | 1              |
      | House Long Rate     | 1              |
      | House Short Rate    | 1              |
      | Prices              | 10000          |
      | Currency            | USD            |
    And user clicks save button on security master screen
    Then "edit message" edit validation message should be displayed on SM screen
    And user enter Security Master symbol "Random_Symbol" in search box
    Then user should able see the below Security Master details to be displayed
      | Security Master Symbol      | Random_Symbol |
      | Security Master Assert Type | Random_Assert |
      | Security Master Sec Type    | Random_Sec    |



  Scenario: 724756_Create Security Master With only Mandatory Fields
    And click on add new Security Master button
    And verify column label on Security Master Screen
    And user enters the following Symbol details with all fields
      | Symbol          | Random_Symbol         |
      | Security Number | Random_SecurityNumber |
      | Assert Type     | Cryptocurrency        |
      | Sec Type        | Fixed Income          |
    And user enters the following Security master details with mandatory fields
      | CUSIP          | Random_CUSIP   |
      | Sec Sub Type   | Discount Issue |
      | Exchange       | FTP24           |
      | Status         | Inactive       |
      | Country        | United States  |
      | Reg Fee Charge | Yes            |
    And user enters the following Security Margin mandatory additional details
      | Marginable | No |
    And user enters the following Security Crypto Profile details
      | Contact Address     | New crypt crn |
      | Cryptocurrency Type | Airdrop       |
      | Alternative Symbol  | STATUS_GEN    |
    And user enters the following Security Prices details
      | Prices   | 9000      |
      | Currency | USD |
    And user clicks save button on security master screen
    Then "Security Master has been created successfully!" validation message should be displayed on Security Master screen
   # Then verify Security Master has been update table list


