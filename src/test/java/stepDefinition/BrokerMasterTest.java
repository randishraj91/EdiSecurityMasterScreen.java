package stepDefinition;

import baseMethods.BaseLibrary;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BrokerMasterTest {
    LoginScreen LS = new LoginScreen();
    DashboardScreen DS = new DashboardScreen();
    CompanyScreen CS = new CompanyScreen();
    EdiSecurityMasterScreen ESM = new EdiSecurityMasterScreen();
    BrokermasterScreen BRM= new BrokermasterScreen();

    @Given("Login as a Super Admin Broker Master")
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
    @And("User should be redirected to System wide Master data Overview Screen")
    public void User_should_be_redirected_to_System_wide_Master_data_Overview_Screen() throws Exception {
        BRM.clickontheSystemwideMasterdata();
    }
   @Then ("Choose the Brokermaster from Main list")
    public void Choose_the_Brokermaster_from_Main_list() throws Exception {
        BRM.clickonthebrokermasterfrommainlist();
    }

    @And ("Click Add New Broker button")
    public void Click_Add_New_Broker_button() throws Exception {
        BRM.clickontheaddnewbrokerbutton();
    }

    @And ("Enter data in all Broker  Fields")
    public void Enter_data_in_all_Broker_Fields() throws Exception {
        BRM.createllfiledsBM();
        BRM.clicksaveBM();
    }

    @And ("Enter data in all Broker Mandatory Fields")
    public void Enter_data_in_all_Broker_Mandatory_Fields() throws Exception {
        BRM.createmandatoryfiledsBM();
        BRM.clicksaveBM();
    }


    @And ("Updating  all Broker Master With Mandatory Fields")
    public void Updating_all_Broker_Master_With_Mandatory_Fields() throws Exception {
        BRM.updateMandatoryFields();
        BRM.clicksaveBM();
    }

    @And ("Updating  the Broker Master With All Fields")
    public void Updating_the_Broker_Master_With_All_Fields() throws Exception {
        BRM.updateAllFields();
        BRM.clicksaveBM();
    }
    @And("Update Broker Master has been saved successfully Validate message should be displayed")
    public void Update_Broker_Master_has_been_saved_successfully_Validate_message_should_be_displayed() throws Exception {
        BRM.brokerupdatevalidationMeassage();
    }

    @And ("Enter data in all Broker Master With The Same Broker")
    public void Enter_data_in_all_Broker_Master_With_The_Same_Broker() throws Exception {
        BRM.createwiththesamebroker();
        BRM.clicksaveBM();
    }

    @Then("Verify Broker The System Shows The Proper Error Message")
    public void Verify_Broker_The_System_Shows_The_Proper_Error_Message() throws Exception {
        BRM.verifysystemshowsthepropererrormessage();
    }

    @And ("Click on the edit and view option from list and edit button")
    public void Click_on_the_edit_and_view_option_from_list_and_edit_button() throws Exception {
        BRM.editandviewoption();
        BRM.editbutton();
    }


    @Then ("User should able to create a new broker master")
    public void User_should_able_to_create_a_new_broker_master() throws Exception {
        BRM.clicksaveBM();
    }

    @Then ("Click Filter By  button BM")
    public void Click_Filter_By_button_BM() throws Exception {
        BRM.firststepFilter();
    }

    @Then ("Apply One Filter Valid Data and Search")
    public void Apply_One_Filter_Valid_Data_and_Search() throws Exception {
        BRM.onefiltervaliddataBM(BaseLibrary.getdatabasedonsheet("Broker", 17, 1));
    }

    @Then ("Apply One Filter InValid Data and Search BM")
    public void Apply_One_Filter_InValid_Data_and_Search_BM() throws Exception {
        BRM.onefilterinvaliddataBM(BaseLibrary.getdatabasedonsheet("Broker", 19, 1));
    }

    @And("Apply Multiple Filter InValid Data and Search BM")
    public void Apply_Multiple_Filter_InValid_Data_and_Search_BM() throws Exception {
        BRM.MultipleinvaliddataBM(BaseLibrary.getdatabasedonsheet("Broker", 19, 1),BaseLibrary.getdatabasedonsheet("Broker", 20, 1));
    }

    @Then ("Apply Multiple Filter Valid Data and Search")
    public void Apply_Multiple_Filter_Valid_Data_and_Search() throws Exception {
        BRM.onemultiplevaliddataBM(BaseLibrary.getdatabasedonsheet("Broker", 17, 1),BaseLibrary.getdatabasedonsheet("Broker", 18, 1));
    }
    @Then ("verify records on Valid Data filter")
    public void verify_records_on_Valid_Data_filter() throws Exception {
        BRM.verifyonevalidfilterBM(BaseLibrary.getdatabasedonsheet("Broker", 17, 1));
    }
    @And("verify the no Data Found BM")
    public void verify_the_no_Data_Found_BM() throws Exception {
        BRM.norecordonefilter();
    }

    @Then ("Click On the Search Button Broker Master and update value")
    public void Click_On_the_Search_Button_Broker_Master_and_update_value() throws Exception {
        BRM.Clickonsearchfilter();
        BRM.validsearchbroker(BaseLibrary.getdatabasedonsheet("Broker", 2, 3));
    }

    @Then("Click On the Search Button Broker Master")
    public void Click_On_the_Search_Button_Broker_Master() throws Exception {
        BRM.Clickonsearchfilter();
    }

    @And("Enter the broker valid Search Data")
    public void enter_the_broker_valid_search_data() throws Exception {
        BRM.validsearchbroker(BaseLibrary.getdatabasedonsheet("Broker", 2, 2));
    }

    @And("Enter the broker Invalid Search Data")
    public void Enter_the_broker_Invalid_Search_Data() throws Exception {
        BRM.validsearchbroker(BaseLibrary.getdatabasedonsheet("Broker", 22, 1));
    }

    @And("verify the records on valid Search Data")
    public void verify_the_records_on_valid_Search_Data() throws Exception {
        BRM.verifyoutcomevalidsearch(BaseLibrary.getdatabasedonsheet("Broker", 2, 2));
    }

    @And("Select on the pre export Options")
    public void Select_on_the_pre_export_Options() throws Exception {
        BRM.clickonpreexport();
    }

    @Then("Click on the Export Button")
    public void Click_on_the_Export_Button() throws Exception {
        BRM.clickonexport();
    }


    @Then("^user should delete the \"([^\"]*)\" CSV files from downloaded follder$")
    public void verify_something_document_downloaded_in_download_follder(String fileNAme) throws Throwable {
        BRM.verifyExportFileDownload(fileNAme);
    }

    @Then("Verifying \"([^\"]*)\" web tables entrie and csv files entries by Comparing it")
    public void verifyingWebTablesEntrieAndCsvFilesEntriesByComparingIt(String filename) throws Throwable {
        Assert.assertEquals(BRM.getApplicationFitTableRowValues(),(BRM.getCSVFitTableRowValues(filename)));
    }
}



