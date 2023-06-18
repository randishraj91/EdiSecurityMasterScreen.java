 package stepDefinition;

import baseMethods.BaseLibrary;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pageObjects.*;

public class OfficeTest{

	EntityScreen ES = new EntityScreen();
	NewPartnerScreen NP = new NewPartnerScreen();
	OfficeScreen OS = new OfficeScreen();



	@And("Click Add New Office button")
	public void userClickOnAddNewOffice() throws Exception {
		ES.clickaccountdatamanagementmenu();
		OS.clickofficesubmenu();
		OS.clickAddNewOffice();
	}

	@And("Enter all inputs in the office and click Save button")
	public void userallfieldsonoffice() throws Exception {
		OS.creteOfficeWithallFields();
		NP.reportfileupload();
		NP.savepartner();
	}

	@And("^upload \"([^\"]*)\" file format$")
	public void wrongformatuploadonoffice(String input) throws Exception {
		OS.wrongfileupload(input);
	}

	@And("delete the uploaded file")
	public void deleteuploadfile() throws Exception {
		OS.deleteuploadedfile();
	}

	@And("enter valid inputs on office fields")
	public void validinputsonoffice() throws Exception {
		OS.creteOfficeWithmandatoryields(BaseLibrary.getdatabasedonsheet("Office", 0, 1),BaseLibrary.getdatabasedonsheet("Office", 3, 1),BaseLibrary.randomnumbergenerator(8),BaseLibrary.randomstringgenerator(8));
	}

	@And("Enter mandatory inputs in the office and click Save button")
	public void usermandatoryfieldsonoffice() throws Exception {
		OS.creteOfficeWithmandatoryields(BaseLibrary.getdatabasedonsheet("Office", 0, 1),BaseLibrary.getdatabasedonsheet("Office", 3, 1),BaseLibrary.randomnumbergenerator(8),BaseLibrary.randomstringgenerator(8));
		NP.savepartner();
	}

	@Then("apply one filter and search on office")
	public void click_onefilter() throws Exception {
		OS.searchwithvaildonefilter(BaseLibrary.getdatabasedonsheet("Office", 7, 1));
	}

	@Then("apply multiple filter and search on office")
	public void click_multiplefilter() throws Exception {
		OS.searchwithmultiplefilter(BaseLibrary.getdatabasedonsheet("Office", 7, 1),BaseLibrary.getdatabasedonsheet("Office", 6, 1));
	}

	@Then("apply multiple filter with invalid input and search on office")
	public void click_multipefilterwithinvalid() throws Exception {
		OS.searchwithmultipleinvalidfilter();
	}

	@Then("apply filter with valid and invalid input and search on office")
	public void click_multipefilterwithvalidandinvalid() throws Exception {
		OS.searchwithmultiplevalidandinvalidfilter(BaseLibrary.getdatabasedonsheet("Office", 7, 1));
	}

	@Then("verify records on office")
	public void click_recordsoffice() throws Exception {
		OS.recordsonvalidoffice(BaseLibrary.getdatabasedonsheet("Office", 6, 1));
	}

	@Then("apply one filter with invalid input and search on office")
	public void click_onefilterwithinvalid() throws Exception {
		OS.searchwithoneinvalidfilter();
	}

	@Then("^enter the \"([^\"]*)\" input on office universal search and search it$")
	public void entityuniversalsearch(String input) throws Exception {
		OS.officeuniversalsearch(input,BaseLibrary.getdatabasedonsheet("Office", 7, 1));
		NP.clickSearchIcon();
	}

	@And("Create Business Entity and Partner")
	public void createbusinessentityandpartner() throws Exception {
		ES.clickaccountdatamanagementmenu();
		ES.clickenitysubmenu();
		ES.clickaddnewentity();
		ES.createentitywithmandatory(BaseLibrary.getdatabasedonsheet("Office", 0, 1),
				BaseLibrary.getdatabasedonsheet("Office", 1, 1), BaseLibrary.getdatabasedonsheet("Office", 2, 1));
		ES.entitysavebutton();
		ES.verifynewentity();
		ES.clickaccountdatamanagementmenu();
		NP.clickpartnersubmenu();
		NP.clickaddnewpartner(BaseLibrary.getdatabasedonsheet("Office", 0, 1));
		NP.feedvailddatatomandatorypartnerinformationfields(BaseLibrary.getdatabasedonsheet("Office", 3, 1),BaseLibrary.getdatabasedonsheet("Partner", 5, 1),
				BaseLibrary.getdatabasedonsheet("Partner", 27, 1), BaseLibrary.getdatabasedonsheet("Office", 5, 1));
		NP.feedvailddatatoalllegalriskfields(BaseLibrary.getdatabasedonsheet("Partner", 48, 1));
		NP.feedvailddatatoallProductinfofields(BaseLibrary.getdatabasedonsheet("Partner", 52, 1));
		NP.feedvailddatatomandatoryfundingfields(BaseLibrary.getdatabasedonsheet("Partner", 68, 1));
		NP.feedvailddatatomandatorysettlementfields();
		NP.feedvailddatatomandatoryreportfields("Yes");
		NP.savepartner();
	}

	@And("View the created office in a list view on office Overview page")
	public void check_newoffice() throws Exception {
		ES.clickfilter();
		OS.searchwithonefilter();
		OS.recordsonoffice();
	}

	@And("Verify updated successfully and verify updated records on office")
	public void verifysuccessfully() throws Exception {
		OS.Verifysuccessfullymessage();
		OS.recordsonoffice();
	}

	@And("Click Edit button, entered Updated Inputs in the office and click Save button")
	public void office_update() throws Exception {
		OS.Update_office();
		NP.savepartner();
	}

	@Given("^click on the View column list and deselect the columns \"([^\"]*)\"$")
	public void click_on_the_view_column_list_and_select_the_columns(String columnname) throws Exception {
		OS.ViewColumn(columnname);
	}

	@And("^Verify \"([^\"]*)\" column is not displaying$")
	public void verifycolumn(String columnname) throws Exception {
		OS.notdisplaycolumn(columnname);
	}

	@Given("^click on the View column list and select the columns \"([^\"]*)\"$")
	public void click_on_view_column_list_and_select_the_columns(String columnname) throws Exception {
		OS.ViewColumn(columnname);
	}

	@And("^Verify \"([^\"]*)\" column is displaying$")
	public void verifycolumndisplaying(String columnname) throws Exception {
		OS.displaycolumn(columnname);
	}
	@Then("^Verify \"([^\"]*)\"  document downloaded in download folder and find the file name$")
	public void verify_document_downloaded_in_download_folder_and_find_filename(String filename) throws Throwable {
		OS.getFilename(filename);
	}

	@Then("Verify user able to read entries on CSV file")
	public void user_able_to_read_CSVfile(String filename) throws Throwable {
		OS.getCSVFitTableRowValues(filename);
	}

	@Then("^Verifying \"([^\"]*)\" web table entries and csv file entries by Comparing it$")
	public void Verifying_web_table_entries_and_csv_file_entries_are_same(String filename) throws Throwable {
		Assert.assertEquals(OS.getApplicationFitTableRowValues(),(OS.getCSVFitTableRowValues(filename)));
	}

	@Then("^user should delete the \"([^\"]*)\" CSV file from downloaded folder$")
	public void verify_something_document_downloaded_in_download_folder(String fileNAme) throws Throwable {
		OS.verifyExportFileDownload(fileNAme);
	}

	@Then("verify row is visible")
	public void verify_row_is_visible() throws Throwable {
		OS.getrowvisible();
	}

	@And("^Click on the export button$")
	public void click_on_the_export_button() throws Throwable {
		OS.ClickOnExportButton();
	}


}