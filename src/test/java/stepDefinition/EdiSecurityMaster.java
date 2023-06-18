package stepDefinition;

import baseMethods.BaseLibrary;
import baseMethods.DataDrivenUtility;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.CompanyScreen;
import pageObjects.DashboardScreen;
import pageObjects.EdiSecurityMasterScreen;
import pageObjects.LoginScreen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class EdiSecurityMaster {

    LoginScreen LS = new LoginScreen();
    DashboardScreen DS = new DashboardScreen();
    CompanyScreen CS = new CompanyScreen();
    EdiSecurityMasterScreen ESM = new EdiSecurityMasterScreen();

    @Given("Login as a Super Admin EDI Security Master")
    public void login_super_admin() throws Exception {
        LS.enterUserName(BaseLibrary.getdatabasedonsheet("Login", 1, 1));
        LS.enterPassword(BaseLibrary.getdatabasedonsheet("Login", 2, 1));
        LS.clickLoginButton();
        LS.enterandclickconfirmcode(BaseLibrary.getdatabasedonsheet("Config", 1, 1),
                BaseLibrary.getdatabasedonsheet("Config", 2, 1), BaseLibrary.getdatabasedonsheet("Config", 3, 1),
                BaseLibrary.getdatabasedonsheet("Config", 4, 1), BaseLibrary.getdatabasedonsheet("Config", 5, 1));
        LS.choosecompany();
        DS.verifydashboard();
    }

    @Then("User should be redirected to Security Master data Overview Screen")
    public void click_securitymasterdata() throws Exception {
        ESM.clicksecuritymasterdata();
        ESM.Chooseedisecuritymaster();
    }

    @And("Choose the EDI Security Master from list")
    public void  Choose_the_EDI_Security_Master_from_list() throws Exception {
        ESM.Chooseedisecuritymaster();
    }

    @Then("Click Add New Security Master button")
    public void add_edisecuritymaster() throws Exception {
        ESM.Addedisecuritymaster();
    }

    @Then("Click on the update Security Master")
    public void click_on_the_update_security_master() throws Exception {
        ESM.firsteditoption();
        ESM.secondeditoption();
    }


    @And("Enter data in all Security Master Mandatory Fields")
    public void enter_edisecuritymastermandatoryfield() throws Exception {
        ESM.createedisecuritymasterwithmandatory();
        ESM.clicksavebutton();
    }

    @And("update data in all Security Master Mandatory Fields")
    public void update_data_in_all_security_master_mandatory_fields() throws Exception {
        ESM.updatesecuritymasterwithmandatory();
        ESM.clicksavebutton();
    }

    @And ("Enter data in all Security Master Fields And Verify The Newly Created Symbol")
    public void enter_data_the_in_symbol_fields_and_verify_the_newly_created_symbol() throws Exception {
        ESM.createdsymbolfield();
        ESM.clicksavebutton();
    }


    @And ("Enter the data all Security Master with Max valid inputs")
    public void enter_the_data_all_security_master_with_max_valid_inputs() throws Exception {
        ESM.createdmaxvalidinputs();
        ESM.clicksavebutton();
    }

    @And ("Enter data in all Security Master Fields With The Same symbol")
    public void Enter_data_in_all_Security_master_fields_with_the_same_symbol() throws Exception {
        ESM.samesymbol();
        ESM.clicksavebutton();
    }

    @And("Enter data With Fields Left Empty")
    public void Enter_data_With_Fields_Left_Empty() throws Exception {
        ESM.fieldsleftemptyvalidaiton();
        ESM.clicksavebutton();
    }

    @Then("User should able to create a new Security Master")
    public void click_savebutton() throws Exception {
        ESM.clicksavebutton();
    }

    @And("Enter data in all Security Master Fields")
    public void enter_edisecuritymasterallfield() throws Exception {
        ESM.createedisecuritymasterwithallfield();
        ESM.clicksavebutton();
    }

    @And("update data in all Security Master all Fields")
    public void update_data_in_all_security_master_all_fields() throws Exception {
        ESM.updateedisecuritymasterallfield();
        ESM.clicksavebutton();
    }

    @And("Enter data in all Security Master Fields With The Same security Code")
    public void enter_WithTheSamesecurityCode() throws Exception {
        ESM.verifytheSamesecurityCode();
    }
    @Then("Click on Edit button from the List")
    public void Edit_button() throws Exception {
        ESM.Threedotbutton();
    }


    @Then("Click Filter By button and enter value filter")
    public void Click_Filter_By_button_and_enter_value_filter() throws Exception {
        ESM.Searchbutton();
        ESM.validsearchoperation(BaseLibrary.getdatabasedonsheet("EDI Security Master", 2, 2));
    }



    @Then("Click Filter By button")
    public void filter_button() throws Exception {
        ESM.Filterbutton();
    }

    @Then("Click On the Search Button")
    public void click_on_the_search_button() throws Exception {
        ESM.Searchbutton();
    }

    @Then("click on the Three Dot button")
    public void click_on_the_three_dot_button() throws Exception {
        ESM.threedotbutton();
    }

    @Then("Click on Export function")
    public void click_on_export_function() throws Exception {
        ESM.exportbutton();
    }

    @And("apply one filter and search on symbol")
    public void apply_one_filter_and_search_on_symbol() throws Exception {
        ESM.onefiltervaliddata(BaseLibrary.getdatabasedonsheet("EDI Security Master", 94, 1));
    }

    @And("Apply Multiple  At A Time With The valid Data")
    public void apply_multiple_at_a_time_with_the_valid_data() throws Exception {
        ESM.multiplevaliddata(BaseLibrary.getdatabasedonsheet("EDI Security Master", 94, 1),BaseLibrary.getdatabasedonsheet("EDI Security Master", 102, 1));
    }

    @And("Enter valid Search Data")
    public void enter_valid_search_data() throws Exception {
        ESM.validsearchoperation(BaseLibrary.getdatabasedonsheet("EDI Security Master", 101, 1));
    }


    @And("Enter invalid Search Data")
    public void enter_invalid_search_data() throws Exception {
        ESM.invalidsearchoperation(BaseLibrary.getdatabasedonsheet("EDI Security Master", 99, 1));
    }

    @And("Apply security Type Filter")
    public void apply_security_Type_filter() throws Exception {
        ESM.securitytypefilter(BaseLibrary.getdatabasedonsheet("EDI Security Master", 98, 1));
    }
    @And("Apply Multiple At A Time With The valid Data")
    public void Apply_Multiple_At_A_Time_With_The_valid_Data() throws Exception {
        ESM.applymultiplefiltervaliddata(BaseLibrary.getdatabasedonsheet("EDI Security Master", 83, 1),
                BaseLibrary.getdatabasedonsheet("EDI Security Master", 16, 1));
    }

    @And("apply one filter At A Time With The Invalid Data")
    public void apply_one_filter_At_A_Time_With_The_Invalid_Data() throws Exception {
        ESM.onefilterinvaliddata(BaseLibrary.getdatabasedonsheet("EDI Security Master", 95, 1));
    }

    @And("Apply Multiple Filter At A Time With The Invalid Data")
    public void Apply_multiple_Filter_at_a_time_with_the_invalid_data() throws Exception {
        ESM.Multiplefilterinvaliddata(BaseLibrary.getdatabasedonsheet("EDI Security Master", 90, 1),
                BaseLibrary.getdatabasedonsheet("EDI Security Master", 84, 1));
    }
    @And("verify the Multiple Filter Valid Data")
    public void verify_the_multiple_filter_valid_data() throws Exception {
        ESM.verifymultiplefiltervaliddata(BaseLibrary.getdatabasedonsheet("EDI Security Master", 94, 1));
    }

    @And("verify the no Data Found")
    public void verify_the_no_Data_Found() throws Exception {
        ESM.norecordfoundedionefilter();
    }
    @And("verify the search no Data Found")
    public void verify_the_search_no_data_found() throws Exception {
        ESM.norecordfoundedionesearch();
    }
    @And("verify the Multiple Filter InValid Data")
    public void verify_the_multiple_filter_invalid_data() throws Exception {
        ESM.norecordfoundedionefilter();
    }
    @Then("verify records on Symbol Value")
    public void verify_records_on_Symbol_Value() throws Exception {
        ESM.verifysymboloutput(BaseLibrary.getdatabasedonsheet("EDI Security Master", 94, 1));
    }
    @Then("Verify records on security Type Filter")
    public void verify_records_on_security_type_filter() throws Exception {
        ESM.verifysecuritytypefilter(BaseLibrary.getdatabasedonsheet("EDI Security Master", 97, 1));
    }
    @Then("Verify records on valid Search Data")
    public void verify_records_on_valid_search_data() throws Exception {
        ESM.verifysvalidSearchdata(BaseLibrary.getdatabasedonsheet("EDI Security Master", 101, 1));
    }
    @Then("verify records on Same security number")
    public void verify_records_on_Same_security_number() throws Exception {
        ESM.verifysamesecuritynumber(BaseLibrary.getdatabasedonsheet("EDI Security Master", 97, 1));
    }
    @Then("^\"([^\"]*)\" It Throws Validaiton Message$")
    public void itthrowsvalidaitonmessage(String throwsvalidationMeassage) throws Exception {
        ESM.throwsvalidationMeassage(throwsvalidationMeassage);
    }
    @Then("^Verifying \"([^\"]*)\" web table entries and csv file entriess by Comparing it$")
    public void Verifying_web_table_entries_and_csv_file_entriess_by_Comparing_it(String filename) throws Throwable {
        Assert.assertEquals(ESM.getApplicationFitTableRowValues(),(ESM.getCSVFitTableRowValues(filename)));
    }

    @Then("^user should delete the \"([^\"]*)\" CSV fiiles from downloaded folders$")
    public void verify_something_document_downloaded_in_download_folders(String fileNAme) throws Throwable {
        ESM.verifyExportFileDownload(fileNAme);
    }
}