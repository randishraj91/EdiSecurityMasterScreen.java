package stepDefinition;

import constant.CommonConstant;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AccountMasterScreen;
import pageObjects.LoginScreen;

import java.util.List;

public class AccountMaster {

    LoginScreen LoginScreen = new LoginScreen();
    AccountMasterScreen AccountMaster = new AccountMasterScreen();

    public List<List<String>> data = null;

    @Given("user navigate to Account Masters screen")
    public void user_navigate_to_account_masters_screen() throws Exception {
        LoginScreen.openApplication();
        AccountMaster.clickSystemMaster();
        AccountMaster.loadTestData();
    }

    @Given("click on add new Account Master button")
    public void click_on_add_new_account_master_button() throws Exception {
        AccountMaster.addNewSecurityMaster();
    }

    @Given("verify column label on Account Master Screen")
    public void verify_column_label_on_account_master_screen() throws Exception {
        AccountMaster.verifyLabel();
    }

    @Given("user enters the account profile details with all fields")
    public void user_enters_the_account_profile_details_with_all_fields() throws Exception {
        AccountMaster.selectDesignator("Trader");
        AccountMaster.selectLegalFormation("EXPB");
        AccountMaster.selectPartner("Random_Partner"); //partner office need to loaded from property files
        AccountMaster.selectOffice("Random_Office");
        AccountMaster.selectSubOffice("Random_SubOffice");
        AccountMaster.enterDwAccountNumber("Random_DwAccountNumber");
        AccountMaster.enterCustomerAccountNumber("Random_CSAccountNumber");
        AccountMaster.enterAccountName("Random_AccountNumber");
        AccountMaster.selectAccoutType("C-CASH");
        AccountMaster.selectStatus("Restricted");
        AccountMaster.selectStatusReasonCode("Duplicate");
        AccountMaster.selectGroupId("CGROUP");
        AccountMaster.selectRegRep("Representative");
        AccountMaster.selectAdvisor("Test Exe");
        AccountMaster.selectAnalyst("Data Analyst");
        AccountMaster.selectPortfolioManager("Managing Person");
        AccountMaster.selectAccountBaseCurrency("USD"); //Random_Currency
        AccountMaster.enterStartDT("Random_Date");
        AccountMaster.enterAccountClosedDate("Random_Date");
        AccountMaster.enterAccountRestrictedDate("Random_Date");
        AccountMaster.selectTag1("Tag1");
        AccountMaster.enterNotForTag1("Tag1");
        AccountMaster.selectInternalNote("Yes");
    }

    @Given("user enters the customer information details with all fields")
    public void user_enters_the_customer_information_details_with_all_fields() throws Exception {
        AccountMaster.enterFirstNane("Gorge");
        AccountMaster.enterMiddleName("RR");
        AccountMaster.enterLastNane("Martin");
        AccountMaster.enterShortName("Marti");
        AccountMaster.enterSalutation("Mr");
        AccountMaster.enterLEI("Random_SecurityNumber");
        AccountMaster.enterDOB("06/21/1992");
        AccountMaster.selectSNNType("Adoption Taxpayer ID Number");
        AccountMaster.enterSNNTax("Random_SSN");
        AccountMaster.enterIDType("UAN");
        AccountMaster.enterPlaceOfIssue("USA");
        AccountMaster.selectNasadEmp("Yes");
        AccountMaster.selectNasadSpouse("Yes");
        AccountMaster.selectDirectorOfBrokerDealer("Yes");
        AccountMaster.enterBrokerFirmName("Emp");
        AccountMaster.selectDirectorOfBrokerCompany("Yes");
        AccountMaster.selectSymbolOfPublicCompany("AAPL");
        AccountMaster.selectPoliticallyExposed("No");
        AccountMaster.enterPoliticallyExposedName("Mute");
        AccountMaster.selectAccountOfAnotherFirm("No");
        AccountMaster.selectMartialStatus("M");
        AccountMaster.enterDependants("No");
        AccountMaster.enterDeceasedDate("Random_Date");
    }

    @Given("user enters the Address details with all fields")
    public void user_enters_the_address_details_with_all_fields() throws Exception {
        AccountMaster.enterAddressLine1("New york town");
        AccountMaster.enterAddressLine2("Town market");
        AccountMaster.enterAddressLine3("Twin road");
        AccountMaster.selectCountry("United States");
        AccountMaster.selectState("Alabama");
        AccountMaster.selectCity("Aliceville");
        AccountMaster.enterZipCode("6000788");
        AccountMaster.enterPhoneNumber("69845454654");
        AccountMaster.enterEmail("dwn@wenlog.com");
        AccountMaster.enterFax("57865465854");
        AccountMaster.selectMaillingAddress("Yes");
        AccountMaster.selectInTradyNotice("Yes");
        AccountMaster.selectEmpLegalAddress("Yes");
        AccountMaster.selectCudotialAddress("Yes");
    }

    @Given("user enters the Address details with only mandatory fields")
    public void user_enters_the_Address_details_with_only_mandatory_fields() throws Exception {
        AccountMaster.enterAddressLine1("New york town");
        AccountMaster.enterAddressLine2("Town market");
        AccountMaster.enterAddressLine3("Twin road");
        AccountMaster.selectCountry("United States");
        AccountMaster.selectState("Alabama");
        AccountMaster.selectCity("Aliceville");
        AccountMaster.enterZipCode("6000788");
        AccountMaster.enterPhoneNumber("69845454654");
        AccountMaster.enterEmail("dwn@wenlog.com");
        AccountMaster.enterFax("57865465854");
        AccountMaster.selectMaillingAddress("Yes");
        AccountMaster.selectInTradyNotice("Yes");
        AccountMaster.enterEmployeeStatus("Working");
        AccountMaster.enterJobTitle("SSE");
        AccountMaster.selectEmpLegalAddress("Yes");
        AccountMaster.selectCudotialAddress("Yes");
    }



    @Given("user enters the tax details with all fields")
    public void user_enters_the_tax_details_with_all_fields() throws Exception {
        AccountMaster.SelectTEFRA("B2 - 2st Notice");
        AccountMaster.selectCitizenship("United States");
        AccountMaster.selectTaxCountry("United States");
        AccountMaster.selectCostBasic("LOT_COST");
        AccountMaster.selectTaxLot("First-In, First-Out");
        AccountMaster.selectw8w9exempt("EXEMPT");
        AccountMaster.selectw8w9("Yes");
        AccountMaster.selectTaxStatus("C-Crop");
        AccountMaster.selectReceipentCode("Artist Or Athlete");
        AccountMaster.selectFACTA("Yes");

    }

    @Given("user enters the Interested Party details with all fields")
    public void user_enters_the_interested_party_details_with_all_fields() throws Exception {
        AccountMaster.selectType("IP To Account");
        AccountMaster.selectReceiveConfirms("Yes");
        AccountMaster.selectReceiveStatement("No");
        AccountMaster.enterName("Random_Name");
        AccountMaster.enterIPAAddressLine1("Abu Palace");
        AccountMaster.enterIPAAddressLine2("illiam road");
        AccountMaster.enterIPAAddressLine3("illiam nagar");
        AccountMaster.selectIPACountry("United States");
        AccountMaster.selectIPAState("Alabama");
        AccountMaster.selectIPACity("Aliceville");
        AccountMaster.enterIPAZipCode("6000788");
        AccountMaster.enterIPAPhoneHome("69845454654");
        AccountMaster.enterIPAPhoneWork("69845454654");
        AccountMaster.enterIPAPhoneNumber("9845454654");
        AccountMaster.enterIPAEmail("dwn@wenlog.com");
        AccountMaster.enterIPAFax("57865465854");
    }
    @Given("user enters the Invertment profile details with all fields")
    public void user_enters_the_invertment_profile_details_with_all_fields() throws Exception {
        AccountMaster.selectInvertmentObjective("CapitalPreservation");
        AccountMaster.selectRiskTolerance("MODERATE");
        AccountMaster.enterAnnualIncome("10000000");
        AccountMaster.enterNetWorth("52151554");
        AccountMaster.enterLiquidity("52151556");
        AccountMaster.selectFixedIncomeExperience("LIMIT");
        AccountMaster.selectStockExperiene("LIMIT");
        AccountMaster.selectOptionsExperience("LIMIT");
        AccountMaster.enterYOEinFixedIncome("22");
        AccountMaster.enterYOEinStock("11");
        AccountMaster.enterYOEinOptions("7");
        AccountMaster.enterTimeHorizon("LONGTERM");
        AccountMaster.selectLiquidity("HIGH");
        AccountMaster.enterRule2111("2111 approved");
        AccountMaster.selectBusinessNeeds("Market Marker");


    }
    @Given("user enters the Instruction and Permission details with all fields")
    public void user_enters_the_instruction_and_permission_details_with_all_fields() throws Exception {
        AccountMaster.selectDIVReInvent("Yes");
        AccountMaster.selectCorpBuyBack("Yes");
        AccountMaster.selectDayTrader("No");
        AccountMaster.selectProductPermissions("MARGIN");
        AccountMaster.enterMINNetEQ("500");
        AccountMaster.selectCapacity("Agent");
        AccountMaster.selectSolicitated("SOLICITED");
        AccountMaster.selectRegFee("Yes");
        AccountMaster.selectMoneyMarketSweep("Yes");
        AccountMaster.selectSweepDestination("Sweep Dest1");
        AccountMaster.selectSweepSymbol("Sweep Symbol1");
        AccountMaster.selectOptionDesig("Market Marker");
        AccountMaster.enterLargeTraderID1("large 1");
        AccountMaster.enterLargeTraderID2("Large 2");
        AccountMaster.enterLargeTraderID3("Large 3");
        AccountMaster.selectProxyOptout("Yes");
        AccountMaster.enterEscrowType("Online Wallets");


    }
    @Given("user enters the Document with fields details")
    public void user_enters_the_document_with_fields_details() throws Exception {
        AccountMaster.enterdocumentforNewAccount("New Account form 1");
        AccountMaster.uploadFileNAF(CommonConstant.AccountMaster_NAF);

    }
    @Given("user enters the Swifts details with all fields")
    public void user_enters_the_swifts_details_with_all_fields() throws Exception {
        AccountMaster.SFselectCountry("United States");
        AccountMaster.selectCurrencySWIFT("EUR");
        AccountMaster.enterEuroClear("financially ");
        AccountMaster.enterCedel("Eurobond market");
        AccountMaster.enterKass("Kass market");
        AccountMaster.enterLocal("Local wallet");
        AccountMaster.selectAgentBank("Golden Reserve");
        AccountMaster.enterAgentAccount("Random_AccountNumber");
        AccountMaster.enterAgentBIC("Random_AgentBIC");
        AccountMaster.enterClientBIC("Random_ClientBIC");
    }

    @Then("{string} validation message should be displayed on Account Master screen")
    public void validation_message_should_be_displayed_on_account_master_screen(String verifyText) throws Exception {
       AccountMaster.verifyValidationMessae(verifyText);
    }
    @Then("user clicks save button on SM screen")
    public void user_clicks_save_button_on_SM_screen() throws Exception {
        AccountMaster.clickSaveButton();
    }

    @Given("user enters the account profile details with only mandatory fields")
    public void user_enters_the_account_profile_details_with_only_mandatory_fields() throws Exception {
        AccountMaster.selectDesignator("Trader");
        AccountMaster.selectLegalFormation("EXPB");
        AccountMaster.selectPartner("Random_Partner"); //partner office need to loaded from property files
        AccountMaster.selectOffice("Random_Office");
        AccountMaster.selectSubOffice("Random_SubOffice");
        AccountMaster.enterDwAccountNumber("Random_DwAccountNumber");
        AccountMaster.enterCustomerAccountNumber("Random_CSAccountNumber");
        AccountMaster.enterAccountName("Random_AccountNumber");
        AccountMaster.selectAccoutType("C-CASH");
        AccountMaster.selectStatus("Restricted");
        AccountMaster.selectStatusReasonCode("Duplicate");
        AccountMaster.selectGroupId("CGROUP");
        AccountMaster.selectRegRep("Representative");
        AccountMaster.selectAdvisor("Test Exe");
        AccountMaster.selectAnalyst("Data Analyst");
        AccountMaster.selectPortfolioManager("Managing Person");
        AccountMaster.selectAccountBaseCurrency("USD"); //Random_Currency

         }


    @Given("then user edit the account profile fields")
    public void then_user_edit_the_account_profile_fields() throws Exception {
        AccountMaster.selectDesignator("Trader");
        AccountMaster.selectLegalFormation("EXPB");
        AccountMaster.enterDwAccountNumber("Random_DwAccountNumber");
        AccountMaster.enterCustomerAccountNumber("Random_CSAccountNumber");
        AccountMaster.enterAccountName("Random_AccountNumber");
        AccountMaster.selectAccoutType("C-LENDING(FullyPaidfor)");
        AccountMaster.selectStatus("Inactive");
        AccountMaster.selectStatusReasonCode("Un-Used");
        AccountMaster.selectAnalyst("AE Analysts");


    }

    @Then("{string} update validation message should be displayed on Account Master screen")
    public void update_validation_message_should_be_displayed_on_account_master_screen(String verifyText) throws Exception {
        AccountMaster.verifyUpdateValidationMessae(verifyText);
    }

    @Given("user enters the customer information details with only mandatory fields")
    public void user_enters_the_customer_information_details_with_only_mandatory_fields() throws Exception {
        AccountMaster.enterFirstNane("NewMan");

    }
/*
    @Given("user enters the Address details with only mandatory fields")
    public void user_enters_the_address_details_with_only_mandatory_fields() {
        AccountMaster.enterAddressLine1("New york town");
        AccountMaster.enterAddressLine2("Town market");
        AccountMaster.enterAddressLine3("Twin road");
        AccountMaster.selectCountry("United States");
        AccountMaster.selectState("Alabama");
        AccountMaster.selectCity("Aliceville");
        AccountMaster.enterZipCode("6000788");
        AccountMaster.enterPhoneNumber("69845454654");
        AccountMaster.enterEmail("dwn@wenlog.com");
        AccountMaster.enterFax("57865465854");
        AccountMaster.selectMaillingAddress("Yes");
        AccountMaster.selectInTradyNotice("Yes");
        AccountMaster.enterEmployeeStatus("Working");
        AccountMaster.enterJobTitle("SSE");
        AccountMaster.selectEmpLegalAddress("Yes");
        AccountMaster.selectCudotialAddress("Yes");
    }

 */
    @Given("user enters the tax details with only mandatory fields")
    public void user_enters_the_tax_details_with_only_mandatory_fields() throws Exception {

        AccountMaster.SelectTEFRA("B2 - 2st Notice");
        AccountMaster.selectCitizenship("United States");
        AccountMaster.selectTaxCountry("United States");
        AccountMaster.selectw8w9exempt("EXEMPT");


    }
    @Given("user enters the Interested Party details with only mandatory fields")
    public void user_enters_the_interested_party_details_with_only_mandatory_fields() throws Exception {// Write code here that turns the phrase above into concrete actions
        AccountMaster.selectType("IP To Account");
        AccountMaster.enterName("Random_Name");
        AccountMaster.enterIPAAddressLine1("Abu Palace");
        AccountMaster.enterIPAAddressLine2("illiam road");
        AccountMaster.enterIPAAddressLine3("illiam nagar");
        AccountMaster.selectIPACountry("United States");
        AccountMaster.selectIPAState("Alabama");
        AccountMaster.selectIPACity("Aliceville");
        AccountMaster.enterIPAZipCode("6000788");
        AccountMaster.enterIPAPhoneHome("69845454654");
        AccountMaster.enterIPAPhoneWork("69845454654");
        AccountMaster.enterIPAPhoneNumber("9845454654");
        AccountMaster.enterIPAEmail("dwn@wenlog.com");
        AccountMaster.enterIPAFax("57865465854");
    }


    @Given("user enters the Invertment profile details with only mandatory fields")
    public void user_enters_the_invertment_profile_details_with_only_mandatory_fields() {

    }
    @Given("user enters the Instruction and Permission details with only mandatory fields")
    public void user_enters_the_instruction_and_permission_details_with_only_mandatory_fields() {

    }
    @Given("user enters the Swifts details with only mandatory fields")
    public void user_enters_the_swifts_details_with_only_mandatory_fields() throws Exception {
        AccountMaster.SFselectCountry("United States");
        AccountMaster.selectCurrencySWIFT("EUR");
    }


    @When("user enter Account Master name  in search box")
    public void user_enter_account_master_name_in_search_box() throws Exception {
        AccountMaster.enterAccountMasterDetailsInSearchBox("AccountName");
    }

    @When("user enter Account Master number  in search box")
    public void user_enter_account_master_number_in_search_box() throws Exception {

        AccountMaster.enterAccountMasterDetailsInSearchBox("AccountNumber");
    }

    @When("user enter Account Master type  in search box")
    public void user_enter_account_master_type_in_search_box() throws Exception {

        AccountMaster.enterAccountMasterDetailsInSearchBox("AccountType");
    }

    @Then("user should able see the below Account Master details to be displayed")
    public void user_should_able_see_the_below_account_master_details_to_be_displayed(DataTable dataTable) throws Exception {
        data = dataTable.asLists(String.class);
        AccountMaster.verifyTableValue(data.get(0).get(0),data.get(0).get(1));
        data = null;
    }

    @Then("user click on the Account Master details screen should be displayed")
    public void user_click_on_the_account_master_details_screen_should_be_displayed() {

    }



    @When("user enter Account Master name {string}  in search box")
    public void user_enter_account_master_name_in_search_box(String string) throws Exception {
        AccountMaster.enterDetailsInSearchBox("No Data");
    }

    @When("enter the Account Master name {string}")
    public void enter_the_account_master_name(String string) throws Exception {
        AccountMaster.filterAccountName("AC_Name");
    }

    @When("user should able see only  Account Master name {string} Account Masters detail")
    public void user_should_able_see_only_Account_Master_name_Account_Masters_detail(String string) {
        AccountMaster.verifyAccountName("Account_Name");
    }


    @When("enter the Account Master type {string}")
    public void enter_the_account_master_type(String string) throws Exception {
        AccountMaster.enterAccountMasterTypeInFilter("CASH");
    }

    @When("user should able see only  Account Master type {string} Account Masters detail")
    public void user_should_able_see_only_Account_Master_type_Account_Masters_detail(String string) {
        AccountMaster.verifyAccountType("CASH");
    }

    @When("enter the Account Master Partner {string}")
    public void enter_the_account_master_Partner(String string) throws Exception {
        AccountMaster.filterPartner("Partner");
    }

    @When("user should able see only  Account Master Partner {string} Account Masters detail")
    public void user_should_able_see_only_Account_Master_Partner_Account_Masters_detail(String string) {
        AccountMaster.verifyAccountPartner("Partner");
    }



    @When("enter the Account Master country {string}")
    public void enter_the_account_master_country(String string) {

    }


    @Then("user should able see only {string} Account Masters detail")
    public void user_should_able_see_only_account_masters_detail(String string) {

    }

    @When("enter the Account Master date {string}")
    public void enter_the_account_master_date(String string) {

    }

    @Then("user should able see only date {string} Account Masters detail")
    public void user_should_able_see_only_date_account_masters_detail(String string) {

    }

    @When("select the Account Master assert type as {string}")
    public void select_the_account_master_assert_type_as(String string) {

    }

    @Then("user should able see only assert type {string} Account Masters detail")
    public void user_should_able_see_only_assert_type_account_masters_detail(String string) {

    }

    @When("select the Account Master Account type as {string}")
    public void select_the_account_master_account_type_as(String string) {

    }

    @Then("user should able see only Account type {string} Account Masters detail")
    public void user_should_able_see_only_account_type_account_masters_detail(String string) {

    }

    @When("user should select the trade Account Master as {string}")
    public void user_should_select_the_trade_account_master_as(String string) {

    }

    @Then("user should able see only Account Master which trade Account Master are {string}")
    public void user_should_able_see_only_account_master_which_trade_account_master_are(String string) {

    }


    @When("user should select the settlement Account Master as {string}")
    public void user_should_select_the_settlement_account_master_as(String string) {

    }


    @Then("user should able see only Account Master which settlement Account Master are {string}")
    public void user_should_able_see_only_account_master_which_settlement_account_master_are(String string) {

    }




}
