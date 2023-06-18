package stepDefinition;

import baseMethods.BaseLibrary;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pageObjects.LoginScreen;
import pageObjects.SecurityMasterScreen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class SecurityMasterTest {

    SecurityMasterScreen SecurityMaster  = new SecurityMasterScreen();
    public List<List<String>> data = null;

    @Given("user navigate to Security Masters screen")
    public void user_navigate_to_security_masters_screen() throws Exception {
        LoginScreen.openApplication();
        SecurityMaster.clickSystemMaster();
        SecurityMaster.loadTestData();
    }



    @Given("verify column label on Security Master Screen")
    public void verify_column_label_on_security_master_screen() throws Exception {
       SecurityMaster.verifyLabels();
    }

    @Given("user enters the following Symbol details with all fields")
    public void user_enters_the_following_symbol_details_with_all_fields(DataTable dataTable) throws Exception {
        data = dataTable.asLists(String.class);
        SecurityMaster.enterSymbol(data.get(0).get(1));
        SecurityMaster.enterSecurityNumber(data.get(1).get(1));
        SecurityMaster.selectAssertType(data.get(2).get(1));
        SecurityMaster.selectSecType(data.get(3).get(1));
        data=null;
    }
    @Given("user enters the following Security master details with all fields")
    public void user_enters_the_following_security_master_details_with_all_fields(DataTable dataTable) throws Exception {
        data = dataTable.asLists(String.class);
        SecurityMaster.enterCUSIP(data.get(0).get(1));
        SecurityMaster.enterSEDOL(data.get(1).get(1));
        SecurityMaster.enterISIN(data.get(2).get(1));
        SecurityMaster.selectSecSubType(data.get(3).get(1));
        SecurityMaster.selectExchange(data.get(4).get(1));
        SecurityMaster.selectStatus(data.get(5).get(1));
        SecurityMaster.selectCountry(data.get(6).get(1));
        SecurityMaster.selectRegFeeCharge(data.get(7).get(1));
        data =null;
    }

    @Given("user enters the following Security master details with mandatory fields")
    public void user_enters_the_following_security_master_details_with_mandatory_fields(DataTable dataTable) throws Exception {
        data = dataTable.asLists(String.class);
        BaseLibrary.waitAndClickElement(By.xpath("//button/span[contains(text(),'Security Master')]"));
        SecurityMaster.enterCUSIP(data.get(0).get(1));
        SecurityMaster.selectSecSubType(data.get(1).get(1));
        SecurityMaster.selectExchange(data.get(2).get(1));
        SecurityMaster.selectStatus(data.get(3).get(1));
        SecurityMaster.selectCountry(data.get(4).get(1));
        SecurityMaster.selectRegFeeCharge(data.get(5).get(1));
        data =null;
    }

    @Given("user enters the following Security master additional details")
    public void user_enters_the_following_security_master_additional_details(DataTable dataTable) throws Exception {
        data = dataTable.asLists(String.class);
        SecurityMaster.enterPMGroup(data.get(0).get(1));
        SecurityMaster.enterVolatility(data.get(1).get(1));
        SecurityMaster.enterOutstandingSharesDates(data.get(2).get(1));
        SecurityMaster.selectIssuer(data.get(3).get(1));
        SecurityMaster.selectPennyPilot(data.get(4).get(1));
        SecurityMaster.enterOutstandingShares(data.get(5).get(1));
        SecurityMaster.enterMIC(data.get(6).get(1));
        SecurityMaster.selectFedTaxable(data.get(7).get(1));
        SecurityMaster.selectStateTaxable(data.get(8).get(1));
        SecurityMaster.selectFirmSecSubType(data.get(9).get(1));
        data =null;
    }
    @Given("user enters the following Security Margin additional details")
    public void user_enters_the_following_security_margin_additional_details(DataTable dataTable) throws Exception {
        data = dataTable.asLists(String.class);
        SecurityMaster.selectMarginable(data.get(0).get(1));
        SecurityMaster.enterFedLongRate(data.get(1).get(1));
        SecurityMaster.enterFedShortRate(data.get(2).get(1));
        SecurityMaster.enterExchangeLongRate(data.get(3).get(1));
        SecurityMaster.enterExchangeShortRate(data.get(4).get(1));
        SecurityMaster.enterHouseLongRate(data.get(5).get(1));
        SecurityMaster.enterHouseShortRate(data.get(6).get(1));
        data =null;
    }


    @Given("user enters the following Security Margin mandatory additional details")
    public void user_enters_the_following_security_Margin_mandatory_details(DataTable dataTable) throws Exception {
        data = dataTable.asLists(String.class);
        SecurityMaster.selectMarginable(data.get(0).get(1));
        data =null;
    }



    @Given("user enters the following Security Margin PM details")
    public void user_enters_the_following_security_margin_pm_details(DataTable dataTable) throws Exception {
        data = dataTable.asLists(String.class);
        SecurityMaster.enterPMHouseLongRate(data.get(0).get(1));
        SecurityMaster.enterPMHouseShortRate(data.get(1).get(1));
        SecurityMaster.enterPMHedgeLongRate(data.get(2).get(1));
        SecurityMaster.enterPMHedgeShortRate(data.get(3).get(1));
        SecurityMaster.enterExchnLongRate(data.get(4).get(1));
        SecurityMaster.enterExchnShortRate(data.get(5).get(1));
        data =null;
    }
    @Given("user enters the following Security Settlement PM details")
    public void user_enters_the_following_security_settlement_pm_details(DataTable dataTable) throws Exception {
        data = dataTable.asLists(String.class);
        SecurityMaster.selectHardToBorrow(data.get(0).get(1));
        SecurityMaster.selectSweepDestination(data.get(1).get(1));
        SecurityMaster.enterSweepCode(data.get(2).get(1));
        SecurityMaster.enterCurrency(data.get(3).get(1));
        data =null;
    }
    @Given("user enters the following Security Classification details")
    public void user_enters_the_following_security_classification_details(DataTable dataTable) throws Exception {
        data = dataTable.asLists(String.class);
        SecurityMaster.enterSICCd(data.get(0).get(1));
        SecurityMaster.selectWhenIssued(data.get(1).get(1));
        data =null;
    }
    @Given("user enters the following Security Prices details")
    public void user_enters_the_following_security_prices_details(DataTable dataTable) throws Exception {
        data = dataTable.asLists(String.class);
        SecurityMaster.enterPrice(data.get(0).get(1));
        SecurityMaster.selectCurrency(data.get(1).get(1));
        data =null;
    }


    @Given("user enters the following Security Crypto Profile details")
    public void user_enters_the_following_security_crypto_profile_details(DataTable dataTable) throws Exception {
        data = dataTable.asLists(String.class);
        SecurityMaster.enterContactAddress(data.get(0).get(1));
        SecurityMaster.selectCryptoCurrencyType(data.get(1).get(1));
        SecurityMaster.selectAltenativeSymbols(data.get(2).get(1));
        data =null;
    }

    @When("^user clicks save button on security master screen$")
    public void user_clicks_save_button_on_security_master_screen() throws Throwable {
        SecurityMaster.clickSaveButton();
    }

    @Then("{string} validation message should be displayed on Security Master screen")
    public void validation_message_should_be_displayed_on_security_master_screen(String verifyText) throws Exception {
        SecurityMaster.verifyValidationMessae(verifyText);
    }

    @Then("verify Security Master has been update table list")
    public void verify_security_master_has_been_update_table_list() {

    }


    @Given("click on add new Security Master button")
    public void click_on_add_new_security_master_button() throws Exception {
        SecurityMaster.addNewSecurityMaster();
    }


    @When("user enter Security Master name {string}  in search box")
    public void user_enter_security_master_name_in_search_box(String textToSent) throws Exception {
        SecurityMaster.enterSecuritySearchBox(textToSent);
    }


    @When("enter the Security Master symbol {string}")
    public void enter_the_security_master_symbol(String string) throws Exception {
        SecurityMaster.enterSecSymbolInFilter(string);
    }


    @When("enter the Security Master country {string}")
    public void enter_the_security_master_country(String string) throws Exception {

        SecurityMaster.enterSecAssertTypeInFilter(string);
    }

    @Then("user should able see only {string} Security Masters detail")
    public void user_should_able_see_only_security_masters_detail(String textToSent) throws Exception {
        SecurityMaster.verifySecAssertTypeInFilter(textToSent);
    }


    @When("enter the Security Master date {string}")
    public void enter_the_security_master_date(String string) throws Exception {
        SecurityMaster.enterSecTypeInFilter(string);
    }

    @When("enter the Security Master CUSIP {string}")
    public void enter_the_security_master_CUSIP(String string) throws Exception {
        SecurityMaster.enterCUSIPInFilter(string);
    }

    @Then("user should able see only date {string} Security Masters detail")
    public void user_should_able_see_only_date_security_masters_detail(String textToSent) throws Exception {
        SecurityMaster.verifySecTypeInFilter(textToSent);
    }


    @When("select the Security Master assert type as {string}")
    public void select_the_security_master_assert_type_as(String string) {

    }

    @Then("user should able see only assert type {string} Security Masters detail")
    public void user_should_able_see_only_assert_type_security_masters_detail(String string) {

    }


    @When("select the Security Master security type as {string}")
    public void select_the_security_master_security_type_as(String string) {

    }

    @Then("user should able see only security type {string} Security Masters detail")
    public void user_should_able_see_only_security_type_security_masters_detail(String string) {

    }


    @When("user should select the trade Security Master as {string}")
    public void user_should_select_the_trade_security_master_as(String string) {

    }

    @Then("user should able see only Security Master which trade Security Master are {string}")
    public void user_should_able_see_only_security_master_which_trade_security_master_are(String string) {

    }


    @When("user should select the settlement Security Master as {string}")
    public void user_should_select_the_settlement_security_master_as(String string) {

    }

    @Then("user should able see only Security Master which settlement Security Master are {string}")
    public void user_should_able_see_only_security_master_which_settlement_security_master_are(String string) {

    }

    @When("user enter Security Master symbol  in search box")
    public void user_enter_security_master_symbol_in_search_box() {
        // SecurityMaster.enterSecSymbolOnSearchBox();
    }

    @Then("user should able see the below Security Master details to be displayed")
    public void user_should_able_see_the_below_security_master_details_to_be_displayed(DataTable dataTable) throws Exception {
        data = dataTable.asLists(String.class);
        SecurityMaster.verifySymbol(data.get(0).get(1));
        SecurityMaster.verifyAssertType(data.get(1).get(1));
       // SecurityMaster.verifySecurityType(data.get(2).get(1));
        data =null;
    }

    @When("user enter Security Master symbol {string} in search box")
    public void user_enter_security_master_symbol_in_search_box(String string) throws Exception {
      SecurityMaster.enterSecuritySearchBox(string);
    }

    @Then("user click on the Security Master details screen should be displayed")
    public void user_click_on_the_security_master_details_screen_should_be_displayed() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/securitymaster.properties");
        String Symbol = prop.getProperty("Symbol");
        SecurityMaster.clickSymbol(Symbol);
        BaseLibrary.SetWaitTime(3);
    }

    @Then("{string} edit validation message should be displayed on SM screen")
    public void edit_validation_message_should_be_displayed_on_SM_screen(String string) throws Exception {
        SecurityMaster.verifyValidationMessaeWithText("has been saved successfully!");
       // The changes for the Security Master has been saved successfully!
    }


    @Then("user enters the following  updated details with all fields on SM screen")
    public void user_enters_the_following_updated_details_with_all_fields_on_SM_screen(io.cucumber.datatable.DataTable dataTable) throws Exception {
        BaseLibrary.SetWaitTime(3000);
        data = dataTable.asLists(String.class);
        SecurityMaster.selectSecType(data.get(0).get(1));
        SecurityMaster.enterCUSIP(data.get(1).get(1));
        SecurityMaster.selectSecSubType(data.get(2).get(1));
        SecurityMaster.selectExchange(data.get(3).get(1));
        SecurityMaster.selectMarginable(data.get(4).get(1));
        SecurityMaster.enterFedLongRate(data.get(5).get(1));
        SecurityMaster.enterFedShortRate(data.get(6).get(1));
        SecurityMaster.enterExchangeLongRate(data.get(7).get(1));
        SecurityMaster.enterExchangeShortRate(data.get(8).get(1));
        SecurityMaster.enterHouseLongRate(data.get(9).get(1));
        SecurityMaster.enterHouseShortRate(data.get(10).get(1));
        SecurityMaster.enterPrice(data.get(11).get(1));
        SecurityMaster.selectCurrency(data.get(12).get(1));
        data = null;
    }

    public static Properties readPropertiesFile(String fileName) throws IOException {
        FileInputStream fis = null;
        Properties prop = null;
        try {
            fis = new FileInputStream(fileName);
            prop = new Properties();
            prop.load(fis);
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            fis.close();
        }
        return prop;
    }



}
