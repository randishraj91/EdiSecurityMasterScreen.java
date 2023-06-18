package stepDefinition;

import baseMethods.BaseLibrary;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pageObjects.*;

public class HolidayTest {


    LoginScreen LS = new LoginScreen();
    DashboardScreen DS = new DashboardScreen();
    CompanyScreen CS = new CompanyScreen();
    EdiSecurityMasterScreen ESM = new EdiSecurityMasterScreen();
    GLCOAScreen GL = new GLCOAScreen();
    HolidayScreen HD = new HolidayScreen();
    EntityScreen ES = new EntityScreen();
    NewPartnerScreen NP = new NewPartnerScreen();

    @Given("Login as a Super Admin Holiday")
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
    @Then("User should be redirected to System Wide Master Data Screen and Choose the Holiday from list")
    public void User_should_be_redirected_to_System_Wide_Master_Data_Screen_and_Choose_the_Holiday_from_list() throws Exception {
        HD.clickonsystemwidemasterdataholiday();
        HD.clickonholiday();
    }

    @Then("^\"([^\"]*)\" Validate message should be Holiday displayed$")
    public void validationMeassage(String validationMeassage) throws Exception {
        HD.validationMeassage(validationMeassage);
    }

    @Then("Click on the Add New Holiday button")
    public void Click_on_the_Add_New_Holiday_button() throws Exception {
        HD.clickonaddnewholidaybutton();
    }

    @And("Enter data in all Fields Holiday")
    public void Enter_data_in_all_Fields_Holiday() throws Exception {
        HD.enterallfieldsholiday();
        HD.savehholiday();
    }
    @And("View the created office in a list view on holiday Overview page")
    public void View_the_created_office_in_a_list_view_on_holiday_Overview_page() throws Exception {
        ES.clickfilter();
        HD.onefiltervalidholiday();
        HD.recordsonholiday();
    }


    @And("Create A New Holiday With The Mandatory Fields")
    public void Create_A_New_Holiday_With_The_Mandatory_Fields() throws Exception {
        HD.enterMandatoryfieldsholiday();
        HD.savehholiday();
    }
    @Then("User should able to create a New Holiday")
    public void User_should_able_to_create_a_New_Holiday() throws Exception {
        HD.savehholiday();
    }

    @And("Update Holiday has been saved successfully Validate message should be displayed")
    public void Update_Holiday_has_been_saved_successfully_Validate_message_should_be_displayed() throws Exception {
        HD.holidayupdatevalidationMeassage();
    }

    @And("Holiday has been saved successfully Validate message should be displayed")
    public void Holiday_has_been_saved_successfully_Validate_message_should_be_displayed() throws Exception {
        HD.holidayvalidationMeassage();
    }

    @Then("User should able to update a new Holiday")
    public void User_should_able_to_update_a_new_Holiday() throws Exception {
        HD.savehholiday();
    }

    @And("Create A New Holiday With Different Security Type")
    public void Create_A_New_Holiday_With_Different_Security_Type() throws Exception {
        HD.enterwithdifferentsecuritytype();
        HD.savehholiday();
    }


    @And("Create A New Holiday With The Same Holiday Name And click Save button")
    public void Create_A_New_Holiday_With_The_Same_Holiday_Name_And_click_Save_button() throws Exception {
        HD.entersameholidayname();
        HD.savehholiday();
    }

    @Then("Verify The System Shows The Proper Error Message")
    public void Verify_The_System_Shows_The_Proper_Error_Message() throws Exception {
        HD.verifysystemshowsthepropererrormessage();
    }

    @Then("Click on the edit and view option from Holiday data list")
    public void Click_on_the_edit_and_view_option_from_Holiday_data_list() throws Exception {
        HD.clickonthethreedotholiday();
        HD.clickontheholidayedit();
    }

    @And("Update A Holiday With All The Fields")
    public void Update_A_Holiday_With_All_The_Fields() throws Exception {
        HD.updateholidayallthefields();
        HD.savehholiday();
    }

    @And("Update A Holiday With Mandatory Fields")
    public void Update_A_Holiday_With_Mandatory_Fields() throws Exception {
        HD.updateholidayMandatoryfields();
        HD.savehholiday();
    }

    @Then("Click on the Holiday filter button")
    public void Click_on_the_Holiday_filter_button() throws Exception {
        HD.clickonholidayfilter();
    }
    @And("Apply One Filter At A Time With The Valid Holiday Data")
    public void Apply_One_Filter_At_A_Time_With_The_Valid_Holiday_Data() throws Exception {
        HD.onefiltervalidholidaydata(BaseLibrary.getdatabasedonsheet("Holiday", 7, 1));
    }

    @Then("Apply One Filter At A Time With The InValid Holiday Data")
    public void Apply_One_Filter_At_A_Time_With_The_InValid_Holiday_Data() throws Exception {
        HD.onefilterinvalidholidaydata(BaseLibrary.getdatabasedonsheet("Holiday", 3, 1));
    }

    @And("Apply Multiple Filter At A Time With The Valid Holiday Data")
    public void Apply_Multiple_Filter_At_A_Time_With_The_Valid_Holiday_Data() throws Exception {
        HD.Multiplefiltervalidholidaydata(BaseLibrary.getdatabasedonsheet("Holiday", 7, 1),BaseLibrary.getdatabasedonsheet("Holiday", 3, 1));
    }

    @And("Applying One Valid and One InValid Filter at a Time in FilterBy Section")
    public void Applying_One_Valid_and_One_InValid_Filter_at_a_Time_in_FilterBy_Section() throws Exception {
        HD.onevalidoneinvalidfilter(BaseLibrary.randomstringgenerator(7),BaseLibrary.getdatabasedonsheet("Holiday", 3, 1));
    }

    @Then("Apply Multiple Filter At A Time With The InValid Holiday Data")
    public void Apply_Multiple_Filter_At_A_Time_With_The_InValid_Holiday_Data() throws Exception {
        HD.Multiplefilterinvalidholidaydata(BaseLibrary.getdatabasedonsheet("Holiday", 3, 1),BaseLibrary.getdatabasedonsheet("Holiday", 7, 1));
    }

    @And("verify records on Valid Holiday Data filter")
    public void verify_records_on_Valid_Holiday_Data_filter() throws Exception {
        HD.verifyholidaydata(BaseLibrary.getdatabasedonsheet("Holiday", 7, 1));
    }

    @And("Verify The System Shows The No Data Found Holiday Message")
    public void Verify_The_System_Shows_The_No_Data_Found_Holiday_Message() throws Exception {
        HD.holidaynodatafound();
    }

    @And("Click on the Holiday Search Functionality With The Valid Data")
    public void Click_on_the_Holiday_Search_Functionality_With_The_Valid_Data() throws Exception {
        HD.clickonholidaysearchbutton();
    }

    @Then("Enter the Holiday valid Search Data")
    public void Enter_the_Holiday_valid_Search_Data() throws Exception {
        HD.entervalidsearchholiday(BaseLibrary.getdatabasedonsheet("Holiday", 7, 1));
    }

    @Then("Enter the Holiday Invalid Search Data")
    public void Enter_the_Holiday_Invalid_Search_Data() throws Exception {
        HD.enterinvalidsearchholiday(BaseLibrary.randomstringgenerator(7));
    }


    @And("Verify The System Shows The No Data Found Search Holiday Message")
    public void Verify_The_System_Shows_The_No_Data_Found_Search_Holiday_Message() throws Exception {
        HD.verifyinvalidsearchholiday();
    }

    @And("verify records on Valid Search Holiday")
    public void verify_records_on_Valid_Search_Holiday() throws Exception {
        HD.verifyoutcomevalidsearch(BaseLibrary.getdatabasedonsheet("Holiday", 7, 1));
    }

    @And("^Click on the export button Holiday$")
    public void Click_on_the_export_button_Holiday() throws Exception {
        HD.clickontheexportholidaythreedot();

    }

    @And("Hoilday sort order on column")
    public void Hoilday_sort_order_on_column() throws Exception {
        HD.clickonsortcolumn();
    }

    @And("verify sorted records in ascending order")
    public void verify_sorted_records_in_ascending_order() throws Exception {
        HD.verifyonsortcolumn();
    }
    @Then("^Verifying \"([^\"]*)\" web table entriess and csv file entriess by Comparing it$")
    public void Verifying_web_table_entriess_and_csv_file_entriess_by_Comparing_it(String filename) throws Throwable {
        Assert.assertEquals(HD.getApplicationFitTableRowValues(),(HD.getCSVFitTableRowValues(filename)));
    }

    @Then("^user should delete the \"([^\"]*)\" CSV files from downloaded folder$")
    public void verify_something_document_downloaded_in_download_folder(String fileNAme) throws Throwable {
        HD.verifyExportFileDownload(fileNAme);
    }
}
