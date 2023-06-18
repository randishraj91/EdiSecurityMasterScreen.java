package stepDefinition;

import baseMethods.BaseLibrary;
import constant.CommonConstant;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AccountMasterScreen;
import pageObjects.LoginScreen;
import pageObjects.PartnerScreen;
import pageObjects.TransactionsScreen;

import java.util.List;

public class TransactionTest {

    TransactionsScreen Transactions = new TransactionsScreen();
    PartnerScreen partner = new PartnerScreen();
    AccountMasterScreen AccountMaster = new AccountMasterScreen();

    public List<List<String>> data = null;

    @Given("user enters the following Mandatory basic details for transaction")
    public void user_enters_the_following_mandatory_basic_details_for_transaction(DataTable arg1) throws Exception {
        data = arg1.asLists(String.class);
        Transactions.enterCompanyName(data.get(0).get(1));
        Transactions.enterCompanyCode(data.get(1).get(1));
        Transactions.enterManCompanyTaxID(data.get(2).get(1));

        data = null;
    }


    @Given("user navigate to Partner screen for transactions")
    public void user_navigate_to_Partner_screen_for_transactions() throws Exception {
        partner.clickSystemMaster();
    }

    @When("Enter the Partner ID details with mandatory fields for transactions")
    public void enter_the_partner_id_details_with_mandatory_fields_for_transactions() throws Exception {


        Transactions.partneridTrans("Random_PartnerId");
        Transactions.partnercodeTrans("Random_PartnerCode");
        Transactions.CompanyTrans("RandomCompany");
        partner.Status("Active");
        partner.ParentIBID("9887789");
        Transactions.partnername("Random_PartnerName");
        partner.region("Canada");

        partner.registrationtype("Registered Carrying Broker");
        partner.mpid("facilitate");
        partner.dtcpassword("facilitate");
        partner.partnernumber("495359479");
        partner.finranum("495359479");
        partner.secnum("495359479");
        partner.alertcd("optimize495359479");
        partner.oasysid("optimize495359479");
        partner.bicid("optimize495359479");
        partner.institutionalid("495359479");
        partner.productionkey1("09/27/2013");
        partner.commerciallaunch1("09/27/2013");
        partner.contractTerm1("08/19/2021");
        partner.usingevent();
        partner.usinglegacy();
        partner.Apitype1("FIX");
    }



    @Given("user navigate to office screen for transactions")
    public void user_navigate_to_office_screen_for_transactions() throws Exception {
        Transactions.relogin();
        Transactions.NavigateToOfficeScreenTrans();;
    }

    @Then("click the partner save button for transactions")
    public void click_the_save_button_for_transactions() throws Exception {
        Transactions.clickSavePart();
    }

    @Given("user enters the following office details on add new office screen for transactions")
    public void user_enters_the_following_office_details_on_add_new_office_screen_for_transactions(DataTable dataTable) throws Exception {
        data = dataTable.asLists(String.class);
        Transactions.enterOfficeCode(data.get(0).get(1));
        Transactions.selectCompanyName(data.get(1).get(1));
        Transactions.selectCorrespondentNameTrans(data.get(2).get(1));
        Transactions.enterOfficeName(data.get(3).get(1));
        Transactions.enterDescription(data.get(4).get(1));
        Transactions.enterAddressLine1(data.get(5).get(1));
        Transactions.enterOfficeCountry(data.get(6).get(1));
        Transactions.enterOfficeState(data.get(7).get(1));
        Transactions.enterOfficeCity(data.get(8).get(1));
        Transactions.enterOfficePhone(data.get(9).get(1));
        data = null;
    }

    @Given("user navigate to Sub Office screen for transaction")
    public void user_navigate_to_sub_office_screen_for_transaction() throws Exception {
        Transactions.navigateSubOfficeScreen();
    }

    @Given("user navigate to Account Masters screen for transactions")
    public void user_navigate_to_account_masters_screen_for_transactions() throws Exception {
        LoginScreen.openApplication();
        BaseLibrary.SetWaitTime(1000);
        Transactions.clickSystemMaster();
        Transactions.loadTransactionTestDataFprP2(CommonConstant.FirstTradeEntry);
    }


    @Given("user navigate to Cost Center screen for transactions")
    public void user_navigate_to_cost_center_screen_for_transactions() throws Exception {
        Transactions.navigateCostCenterScreen();
    }


    @Given("^user enters the following details with all fields on Cost Center Screen for transactions$")
    public void user_enters_the_following_details_with_all_fields_on_cost_center_screen_for_transactions(DataTable dataTable) throws Exception {
        data = dataTable.asLists(String.class);
        Transactions.selectCorrespondentCostC(data.get(0).get(1));
        Transactions.selectOfficeCostC(data.get(1).get(1));
        Transactions.selectSubOfficeCostC(data.get(2).get(1));
        Transactions.enterCostCenterName(data.get(3).get(1));
        Transactions.enterCostCenterCode(data.get(4).get(1));
        Transactions.enterPurposeCostC(data.get(5).get(1));
        data =null;
    }

    @Given("^user navigate to Account Executive screen for transactions$")
    public void user_navigate_to_Account_Executive_screen_for_transactions() throws Throwable {
        BaseLibrary.SetWaitTime(2000);
        Transactions.NavigateToAccountExecu();

    }


    @Given("^user navigate to broker screen for transactions$")
    public void user_navigate_to_broker_screen_for_transactions() throws Throwable {
        BaseLibrary.SetWaitTime(2000);
        Transactions.NavigateToBroker();
    }

    @Given("user enters the following details with all fields on Sub Office Screen for transactions")
    public void user_enters_the_following_details_with_all_fields_on_sub_office_screen_for_transactions(DataTable dataTable) throws Exception {
        data = dataTable.asLists(String.class);
        Transactions.selectCorrespondent(data.get(0).get(1));
        Transactions.selectOffice(data.get(1).get(1));
        Transactions.enterSubOffice(data.get(2).get(1));
        Transactions.enterSubOfficeCode(data.get(3).get(1));
        Transactions.enterPurpose(data.get(4).get(1));
        data = null;
    }


    @Given("user enters the account profile details with only mandatory fields for transactions")
    public void user_enters_the_account_profile_details_with_only_mandatory_fields_for_transactions() throws Exception {
        AccountMaster.selectDesignator("Trader");
        AccountMaster.selectLegalFormation("EXPB");
        Transactions.selectPartner("Random_partner"); //partner office need to loaded from property files
        Transactions.selectOfficeTra("Random_Office");
        Transactions.selectSubOffice("Random_SubOffice");
        Transactions.enterDwAccountNumber("Random_DwAccountNumber");
        Transactions.enterCustomerAccountNumber("Random_CSAccountNumber");
        Transactions.enterAccountName("Random_AccountName");
        AccountMaster.selectAccoutType("C-CASH");
        AccountMaster.selectStatus("Active");
        AccountMaster.selectStatusReasonCode("Duplicate");
        AccountMaster.selectGroupId("CGROUP");
        AccountMaster.selectRegRep("Representative");
        AccountMaster.selectAdvisor("Test Exe");
        AccountMaster.selectAnalyst("Data Analyst");
        AccountMaster.selectPortfolioManager("Managing Person");
        AccountMaster.selectAccountBaseCurrency("USD"); //Random_Currency

    }


    @Given("user enters the  GL account profile details with only mandatory fields for transactions")
    public void user_enters_the_GL_account_profile_details_with_only_mandatory_fields_for_transactions() throws Exception {
        AccountMaster.selectDesignator("Trader");
        AccountMaster.selectLegalFormation("EXPB");
        Transactions.selectPartner("Random_partner"); //partner office need to loaded from property files
        Transactions.selectOfficeTra("Random_Office");
        Transactions.selectSubOffice("Random_SubOffice");
        Transactions.enterGLDwAccountNumber("Random_DwAccountNumber");
        Transactions.enterGLCustomerAccountNumber("Random_CSAccountNumber");
        Transactions.enterGLAccountName("Random_AccountName");
        AccountMaster.selectAccoutType("GL-General Ledger");
        AccountMaster.selectStatus("Active");
        AccountMaster.selectStatusReasonCode("Duplicate");
        AccountMaster.selectGroupId("CGROUP");
        AccountMaster.selectRegRep("Representative");
        AccountMaster.selectAdvisor("Test Exe");
        AccountMaster.selectAnalyst("Data Analyst");
        AccountMaster.selectPortfolioManager("Managing Person");
        AccountMaster.selectAccountBaseCurrency("USD"); //Random_Currency

    }

    @When("^Enters the following details with mandatory fields for transactions$")
    public void enters_the_following_details_with_mandatory_fields_for_transactions() throws Throwable {

        Transactions.executionnameAE("Random_AEName");
        Transactions.executiveindicator("Advisors");
        Transactions.PartnerAE("Partner");
        Transactions.descriptionAE("test description");
        Transactions.executioncodeAE("Random_AECode");
        Transactions.OfficeAE("Random_Office");
        Transactions.SubOfficeAE("Random_Office");


    }


    @When("Enters the Broker details with mandatory fields for transactions")
    public void enters_the_broker_details_with_mandatory_fields_for_transactions() throws Exception {

        Transactions.BrokerNumber("Random_Number");
        Transactions.BrokerName("Random_Name");
        Transactions.Symbol("Random_Number");
        Transactions.Qsr("9A");
        Transactions.ClearingBroker("9");
        Transactions.Type("018");
        Transactions.BrokerEntry("Grant Agent");

    }

    @Given("user navigate to trade entry screen")
    public void user_navigate_to_trade_entry_screen() throws Exception {
        Transactions.navigateTradeEntryScreen();
    }

    @Given("open App")
    public void open_App() throws Exception {
        LoginScreen.openApplication();
        BaseLibrary.SetWaitTime(1000);
        Transactions.navigateTradeListScreen();
    }

    @Then("user enter the First Buy Trade")
    public void user_enter_the_first_buy_trade() throws Exception {
        Transactions.enterFirstTrade(CommonConstant.FirstTradeEntry);
    }

    @Then("verify transaction and journal listing for trade entry")
    public void verify_transaction_and_journal_listing_for_trade_entry() throws Exception {
        Transactions.filterAndVerifyfirstTrade();
    }

    @Then("verify the trade in Stock Record")
    public void verify_the_trade_in_stock_record() throws Exception {
        Transactions.navigateStockRecordScreen();
        Transactions.verifyStockRecord();
    }

    @Then("Verify the trade in  Stock ledger")
    public void verify_the_trade_in_stock_ledger() throws Exception {
        Transactions.navigateStockLedgerScreen();
        Transactions.verifyStockLedger();
    }

    @Then("Verify the trade in  Cash ledger")
    public void verify_the_trade_in_cash_ledger() throws Exception {
        Transactions.navigateCashLedgerScreen();
        //Transactions.verifyCashLedger();
    }

    @Then("Verify the trade in  Trail  Balance")
    public void verify_the_trade_in_trail_balance() throws Exception {
        Transactions.navigateTrailBalanceScreen();
        Transactions.verifyTrailBalance();
    }

    @Then("Verify the trade in  Tax Lot")
    public void verify_the_trade_in_tax_lot() throws Exception {
        Transactions.navigateTaxLotScreen();
        Transactions.verifyTaxLot();
    }

    @Given("user navigate security master screen for transaction")
    public void click_on_add_new_security_master_button_for_transactions() throws Exception {
        Transactions.navigateSecurityMaster();
    }

    @Given("user enters the following Symbol details with all fields for transaction")
    public void user_enters_the_following_Symbol_details_with_all_fields_for_transaction(DataTable dataTable) throws Exception {
        data = dataTable.asLists(String.class);
        Transactions.enterSymbol(data.get(0).get(1));
        Transactions.enterSecurityNumber(data.get(1).get(1));
        Transactions.selectAssertType(data.get(2).get(1));
        Transactions.selectSecType(data.get(3).get(1));
        data=null;
    }



}


























