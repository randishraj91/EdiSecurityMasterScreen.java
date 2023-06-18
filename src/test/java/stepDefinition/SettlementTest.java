package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.LoginScreen;
import pageObjects.SettlementPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;
import java.util.List;
import java.util.Properties;

public class SettlementTest {
    LoginScreen loginScreen = new LoginScreen();
    SettlementPage SettlementScreen = new SettlementPage();
    WebDriver driver;

    public List<List<String>> data = null;
    private Hashtable<Object, Object> textBox;

    @Given("^user navigate to Settlement screen$")
    public void user_navigate_to_Settlement_screen() throws Throwable {

        LoginScreen.openApplication();
        SettlementScreen.clickSystemMaster();
        SettlementScreen.loadTestData();
    }

    @Given("^click on Add New Rules button$")
    public void click_on_Add_New_Rules_button() throws Throwable {
        SettlementScreen.addNewSettlement();
    }

    @When("^user enters the Settlement details with All fields$")
    public void user_enters_the_Settlement_details_with_All_fields() throws Throwable {

        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/settlement.properties");
        String days = prop.getProperty("Number");
        String asset = prop.getProperty("AssetType");
        String security = prop.getProperty("SecurityType");
        String country = prop.getProperty("CountryCode");
        SettlementScreen.selectCountryCode("United States");
        SettlementScreen.selectsettlementAssetType("Cryptocurrency");
        SettlementScreen.selectsettlementSecurityType("Certificate");
        SettlementScreen.enterNumberOfDays("Random_Days");
    }

    @Then("^user clicks Cancel button Yes$")
    public void user_clicks_Cancel_button() throws Throwable {
        SettlementScreen.clickCancelYes();
    }

    @Then("^user clicks Cancel button No$")
    public void user_clicks_Cancel_button_No() throws Throwable {
        SettlementScreen.clickCancelNo();
    }

    @When("^Enter keyword$")
    public void enter_keyword() throws Throwable {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/settlement.properties");
        String asset = prop.getProperty("AssetType");

        SettlementScreen.enterSettlementInSearchBox(asset);

    }

    @When("user enter  {string}  in search box")
    public void user_enter_in_search_box(String string) throws Exception {
        SettlementScreen.enterNoDataSettlementInSearchBox(string);
    }


    @When("user should able to view {string} in table list screen")
    public void user_should_able_to_view_in_table_list_screen(String string) throws Exception {
        SettlementScreen.verifyNoDataDisplayed(string);

    }

    @Then("user should see the Settlement details")
    public void user_should_see_the_settlement_details() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/settlement.properties");
        String asset = prop.getProperty("AssetType");
        SettlementScreen.verifySettlementList(asset);
    }

    @Given("^click on the Settlement filter by button$")
    public void click_on_the_Settlement_filter_by_button() throws Throwable {
        SettlementScreen.settlementFilter();
    }


    @When("^enter the Number of days and Security Type$")
    public void enter_the_Number_of_days() throws Throwable {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/settlement.properties");
        String number = prop.getProperty("Number");
        String security = prop.getProperty("SecurityType");
        SettlementScreen.filternumber(number);
        SettlementScreen.filtersecurity(security);

    }

    @When("enter the Number of days")
    public void enter_the_number_of_days() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/settlement.properties");
        String number = prop.getProperty("Number");

        SettlementScreen.filternumber(number);

    }


    @When("enter Security Type")
    public void enter_security_type() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/settlement.properties");
        String security = prop.getProperty("SecurityType");
        SettlementScreen.filtersecurity(security);

    }

    @When("enter the Asset Type")
    public void enter_the_asset_type() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/settlement.properties");
        String asset = prop.getProperty("AssetType");
        SettlementScreen.filterasset(asset);

    }

    @When("enter the Country code")
    public void enter_the_country_code() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/settlement.properties");
        String country = prop.getProperty("CountryCode");
        SettlementScreen.filtercountry(country);
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

    @Given("^Click on Search Button$")
    public void click_on_Search_Button() throws Throwable {
        SettlementScreen.FilterSearch();
    }

    @When("^Click on Reset Button$")
    public void click_on_Reset_Button() throws Throwable {
        SettlementScreen.FilterReset();
    }

    @Given("^Click the Existing Settlement Rule$")
    public void click_the_Existing_Settlement_Rule() throws Throwable {
        SettlementScreen.settlementEdit();
    }

    @When("^Update all the settlement fields$")
    public void update_all_the_settlement_fields() throws Throwable {
/*
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/settlement.properties");
        String days = prop.getProperty("Number1");
        String asset = prop.getProperty("AssetType1");
        String security = prop.getProperty("SecurityType1");
        String country = prop.getProperty("CountryCode1");
        SettlementScreen.selectCountryCode(country);
        SettlementScreen.selectsettlementAssetType(asset);
        SettlementScreen.selectsettlementSecurityType(security);
        SettlementScreen.enterNumberOfDays(days);
*/
        SettlementScreen.enterNumberOfDays("Random_Days");

    }

    @Then("^Click on Save button$")
    public void click_on_Save_button() throws Throwable {
        SettlementScreen.clickSave();
    }


    @When("Check whether Number of days and security type is displayed in the List Screen")
    public void check_whether_number_of_days_and_security_type_is_displayed_in_the_list_screen() throws Exception {

        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/settlement.properties");
        String security = prop.getProperty("SecurityType");
        SettlementScreen.verifySecurity(security);
    }


    @When("Check whether Number of days is displayed in the List Screen")
    public void check_whether_number_of_days_is_displayed_in_the_list_screen() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/settlement.properties");
        String number = prop.getProperty("Number");
        SettlementScreen.verifyNumber(number);
    }


    @When("Check whether Security type is displayed in the List Screen")
    public void check_whether_security_type_is_displayed_in_the_list_screen() throws Exception {

        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/settlement.properties");
        String security = prop.getProperty("SecurityType");
        SettlementScreen.verifySecurity(security);
    }


    @When("Check whether Asset Type is displayed in the List Screen")
    public void check_whether_asset_type_is_displayed_in_the_list_screen() throws Exception {

        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/settlement.properties");
        String asset = prop.getProperty("AssetType");
        SettlementScreen.verifyAsset(asset);
    }

    @When("Check whether Country Code is displayed in the List Screen")
    public void check_whether_country_code_is_displayed_in_the_list_screen() throws Exception {

        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/settlement.properties");
        String country = prop.getProperty("CountryCode");
        SettlementScreen.verifyCountry(country);
    }

    @Then("validation message should be displayed on Settlement screen")
    public void validation_message_should_be_displayed_on_settlement_screen() throws Exception {
        SettlementScreen.verifyValidationMessage();
    }

    @Then("{string} edit validation message should be displayed on Settlement screen")
    public void edit_validation_message_should_be_displayed_on_settlement_screen(String string) throws Exception {
        SettlementScreen.verifyValidationMessaeWithText("has been saved successfully!");
    }

    @Given("click on the Export Button check whether the Settlement List is downloaded")
    public void click_on_the_export_button_check_whether_the_settlement_list_is_downloaded() throws Exception {
        SettlementScreen.ExportSettlement();
    }

    @Given("click on the Settlement View column list and select the columns")
    public void click_on_the_Settlement_view_column_list_and_select_the_columns() throws Exception {
        SettlementScreen.ViewColumn();
    }
}
