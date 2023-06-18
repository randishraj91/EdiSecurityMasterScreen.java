package stepDefinition;


import baseMethods.BaseLibrary;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pageObjects.*;

public class GLCOATest {

    LoginScreen LS = new LoginScreen();
    DashboardScreen DS = new DashboardScreen();
    NewPartnerScreen NP = new NewPartnerScreen();
    CompanyScreen CS = new CompanyScreen();
    EntityScreen ES = new EntityScreen();
    EdiSecurityMasterScreen ESM = new EdiSecurityMasterScreen();
    CostCenterScreen CCS = new CostCenterScreen();
    GLCOAScreen GL = new GLCOAScreen();
    OfficeScreen OS = new OfficeScreen();
    SubOfficeScreen SS = new SubOfficeScreen();


    @Given("Login as a Super Admin GL")
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
    @And("Create Business Entity,Partner,office,SubOffice,cost center and Account Executive")
    public void Create_Business_Entity_Partner_office_SubOffice_cost_center_and_Account_Executive() throws Exception {
        ES.clickaccountdatamanagementmenu();
        ES.clickenitysubmenu();
        ES.clickaddnewentity();
        ES.createentitywithmandatory
                (BaseLibrary.getdatabasedonsheet("GL COA", 4, 1),
                BaseLibrary.getdatabasedonsheet("GL COA", 5, 1),
                        BaseLibrary.getdatabasedonsheet("GL COA", 6, 1));
        ES.entitysavebutton();

        ES.verifynewentity();
        ES.clickaccountdatamanagementmenu();
        NP.clickpartnersubmenu();
        NP.clickaddnewpartner(BaseLibrary.getdatabasedonsheet("GL COA", 4, 1));
        NP.feedvailddatatomandatorypartnerinformationfields
                (BaseLibrary.getdatabasedonsheet("GL COA", 7, 1),
                BaseLibrary.getdatabasedonsheet("Partner", 5, 1),
                BaseLibrary.getdatabasedonsheet("Partner", 27, 1),
                BaseLibrary.getdatabasedonsheet("GL COA", 9, 1));
        NP.feedvailddatatoalllegalriskfields(BaseLibrary.getdatabasedonsheet("Partner", 48, 1));
        NP.feedvailddatatoallProductinfofields(BaseLibrary.getdatabasedonsheet("Partner", 52, 1));
        NP.feedvailddatatomandatoryfundingfields(BaseLibrary.getdatabasedonsheet("Partner", 68, 1));
        NP.feedvailddatatomandatorysettlementfields();
        NP.feedvailddatatomandatoryofficesubofficefields
                (BaseLibrary.getdatabasedonsheet("GL COA", 11, 1),
                BaseLibrary.getdatabasedonsheet("GL COA", 10, 1));
                        NP.feedvailddatatominreportfields();
        NP.savepartner();
        OS.Verifysuccessfullymessage();

        ES.clickaccountdatamanagementmenu();
        OS.clickofficesubmenu();
        OS.clickAddNewOffice();
        OS.creteOfficeWithmandatoryields
                (BaseLibrary.getdatabasedonsheet("GL COA", 10, 1),
                        BaseLibrary.getdatabasedonsheet("GL COA", 4, 1),
                        BaseLibrary.getdatabasedonsheet("GL COA", 7, 1),
                        BaseLibrary.getdatabasedonsheet("GL COA", 11, 1));
        NP.savepartner();
        OS.Verifysuccessfullymessage();

        ES.clickaccountdatamanagementmenu();
        SS.clicksubofficesubmenu();
        SS.clickAddNewOffice();
        SS.cretesubOfficeWithallFields
                (BaseLibrary.getdatabasedonsheet("GL COA", 7, 1),
                        BaseLibrary.getdatabasedonsheet("GL COA", 11, 1),
                BaseLibrary.getdatabasedonsheet("GL COA", 12, 1),
                        BaseLibrary.getdatabasedonsheet("GL COA", 13, 1));
        NP.savepartner();
        SS.Verifysuccessfullymessage();


      ES.clickaccountdatamanagementmenu();
        CCS.clickcostcentersubmenu();
        CCS.clickAddNewcostcenter();
        CCS.createCostCenterglcoaWithmandatoryFields
                (BaseLibrary.getdatabasedonsheet("GL COA", 7, 1),
                        BaseLibrary.getdatabasedonsheet("GL COA", 11, 1),
                        BaseLibrary.getdatabasedonsheet("GL COA", 12, 1),
                        BaseLibrary.getdatabasedonsheet("GL COA", 18, 1),
                BaseLibrary.getdatabasedonsheet("GL COA", 19, 1));
        NP.savepartner();
        SS.Verifysuccessfullymessage();


        ES.clickaccountdatamanagementmenu();
        CCS.clickcostcentersubmenu();
        CCS.clickAddNewcostcenter();
        CCS.createCostCenterglcoaWithmandatoryFields
                (BaseLibrary.getdatabasedonsheet("GL COA", 7, 1),
                        BaseLibrary.getdatabasedonsheet("GL COA", 11, 1),
                        BaseLibrary.getdatabasedonsheet("GL COA", 12, 1),
                        BaseLibrary.getdatabasedonsheet("GL COA", 18, 1),
                        BaseLibrary.getdatabasedonsheet("GL COA", 19, 1));
        NP.savepartner();
        SS.Verifysuccessfullymessage();


    }



    @Then("User should be redirected to Account data Management Overview Screen")
    public void user_should_be_redirected_to_account_data_management_overview_screen() throws Exception {
        GL.clickontheaccountdatamanagement();
    }

    @And("Choose the GL Chart Of Accounts from list")
    public void choose_the_gl_chart_of_accounts_from_list() throws Exception {
        GL.clickonglcoafromthelist();
    }

    @Then("Click Add New GLCOA button")
    public void click_add_new_GLCOA_button() throws Exception {
        GL.clickontheaccountdatamanagement();
        GL.clickonglcoafromthelist();
        GL.clickonaddnewglcoa();
    }

    @And("Enter data in all GLCOA Mandatory Fields")
    public void enter_data_in_all_glcoa_mandatory_fields() throws Exception {
        GL.enterallglcoamandatory
                (BaseLibrary.getdatabasedonsheet("GL COA", 1, 1),
                        BaseLibrary.getdatabasedonsheet("GL COA", 2, 1));
        GL.saveglcoa();
    }

    @And("Enter data in all GLCOA The Same GL Account Number")
    public void enter_data_in_all_GLCOA_the_same_GL_account_number() throws Exception {
        GL.enterglcoasameGLaccountnumber();
        GL.saveglcoa();
    }

    @Then("Create A New GL-COA With Max valid inputs")
    public void Create_A_New_GLCOA_With_Max_valid_inputs() throws Exception {
        GL.createmaxvalidinputs();
        GL.saveglcoa();
    }

    @Then("Click on the edit and view option from Glcoa list")
    public void click_on_the_edit_and_view_option_from_gllist() throws Exception {
        GL.clickoneditfirst();
        GL.clickoneditsecond();
    }

    @Then("Click on The Glcoa Export Functionality")
    public void Click_on_The_Glcoa_Export_Functionality() throws Exception {
        GL.clickonexportthreebutton();
        GL.clickonexport();
    }

    @Then("Updating A GLCOA With Mandatory Fields")
    public void Updating_A_GLCOA_With_Mandatory_Fields() throws Exception {
        GL.Updateglcoamandatoryfields();
        GL.saveglcoa();
    }
    @And("Update GLCOA has been saved successfully Validate message should be displayed")
    public void Update_GLCOA_has_been_saved_successfully_Validate_message_should_be_displayed() throws Exception {
        GL.glcoaupdatevalidationMeassage();
    }

    @Then("Update A GL-COA With maximum Valid Inputs")
    public void Update_A_GLCOA_With_maximum_Valid_Inputs() throws Exception {
        GL.Updatemaximumvalidinputs();
        GL.saveglcoa();
    }

    @And("Verify updated successfully and verify updated records on GL-COA")
    public void Verify_updated_successfully_and_verify_updated_records_on_GL() throws Exception {
        OS.Verifysuccessfullymessage();
        GL.recordsonglcoa(BaseLibrary.getdatabasedonsheet("GL COA", 20, 1));
    }

    @Then("Click On the Search operation GlCOA")
    public void Click_On_the_Search_operation_GlCOA() throws Exception {
        GL.searchoperationgl();
    }
    @Then("Click On the Search operation GlCOA and enter GL values")
    public void Click_On_the_Search_operation_GlCOA_and_enter_GL_values() throws Exception {
        GL.searchoperationgl();
        GL.entervalidsearch(BaseLibrary.getdatabasedonsheet("GL COA", 20, 1));
    }

    @And("Enter the GL Invalid Search Data")
    public void Enter_the_GL_Invalid_Search_Data() throws Exception {
        GL.enterinvalidsearch(BaseLibrary.randomnumbergenerator(7));
    }

    @And("Enter the GL valid Search Data")
    public void Enter_the_GL_valid_Search_Data() throws Exception {
        GL.entervalidsearch(BaseLibrary.getdatabasedonsheet("GL COA", 1, 1));
    }

    @Then("verify records on Valid Search Glcoa")
    public void verify_records_on_Valid_Search_Glcoa() throws Exception {
        GL.verifyvalidsearch(BaseLibrary.getdatabasedonsheet("GL COA", 1, 1));
    }

    @Then("verify the no Data Found GLCOA")
    public void verify_the_no_Data_Found_GLCOA() throws Exception {
        GL.glnodatafound();
    }

    @Then("Click On the Filter operation GlCOA")
    public void Click_On_the_Filter_operation_GlCOA() throws Exception {
        GL.glcoafilterclick();
    }

    @And("Enter the valid one glcoa filter data")
    public void Enter_the_valid_one_glcoa_filter_data() throws Exception {
        GL.onefiltervalidgldata(BaseLibrary.getdatabasedonsheet("GL COA", 1, 1));
    }

    @And("Applying On office Filter at a Time in FilterBy Section")
    public void Applying_On_office_Filter_at_a_Time_in_FilterBy_Section() throws Exception {
        GL.applyingonofficeFilter(BaseLibrary.getdatabasedonsheet("GL COA", 1, 1)
        ,BaseLibrary.getdatabasedonsheet("GL COA", 2, 1));
    }

    @And("Apply One Filter At A Time With The Invalid glcoa Data")
    public void Apply_One_Filter_At_A_Time_With_The_Invalid_glcoa_Data() throws Exception {
        GL.onefilterinvalidgldata(BaseLibrary.randomnumbergenerator(7));
    }

    @And("Apply Multiple Filter At A Time With The valid Glcoa Data")
    public void Apply_Multiple_Filter_At_A_Time_With_The_valid_Glcoa_Data() throws Exception {
        GL.multiplevalidgldata(BaseLibrary.getdatabasedonsheet("GL COA", 1, 1),BaseLibrary.getdatabasedonsheet("GL COA", 2, 1));
    }

    @And("Apply Multiple Filter At A Time With The Invalid Glcoa Data")
    public void Apply_Multiple_Filter_At_A_Time_With_The_Invalid_Glcoa_Data() throws Exception {
        GL.multipleinvalidgldata(BaseLibrary.randomnumbergenerator(7),(BaseLibrary.randomnumbergenerator(7)));
    }

    @Then("verify records on Valid Glcoa Data filter")
    public void verify_records_on_Valid_Glcoa_Data_filter() throws Exception {
        GL.verifyvalidfilter(BaseLibrary.getdatabasedonsheet("GL COA", 1, 1));
    }

    @Then("verify records on office filter")
    public void verify_records_on_office_filter() throws Exception {
        GL.glnodatafound();
    }

    @Then("Verify The System Shows The Proper Error GL Message")
    public void Verify_The_System_Shows_The_Proper_Error_GL_Message() throws Exception {
        GL.verifysameglnumber();
    }
    @Then("^Verifying \"([^\"]*)\" web table entrie and csv file entries by Comparing it$")
    public void Verifying_web_table_entries_and_csv_file_entries_are_same(String filename) throws Throwable {
        Assert.assertEquals(GL.getApplicationFitTableRowValues(),(GL.getCSVFitTableRowValues(filename)));
    }
    @Then("^user should delete the \"([^\"]*)\" CSV file from downloaded folders$")
    public void verify_something_document_downloaded_in_download_folder(String fileNAme) throws Throwable {
        GL.verifyExportFileDownload(fileNAme);
    }
}