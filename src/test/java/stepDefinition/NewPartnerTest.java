package stepDefinition;

import baseMethods.BaseLibrary;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CompanyScreen;
import pageObjects.DashboardScreen;
import pageObjects.EntityScreen;
import pageObjects.LoginScreen;
import pageObjects.NewPartnerScreen;
import pageObjects.UserScreen;

public class NewPartnerTest {

	LoginScreen LS = new LoginScreen();
	DashboardScreen DS = new DashboardScreen();
	CompanyScreen CS = new CompanyScreen();
	EntityScreen ES = new EntityScreen();
	NewPartnerScreen NP = new NewPartnerScreen();
	UserScreen US = new UserScreen();

	@Given("Login as a Super Admin")
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

	@And("Create Business Entity to which partner should be added")
	public void create_entity() throws Exception {
		Thread.sleep(10000);
		ES.clickaccountdatamanagementmenu();
		ES.clickenitysubmenu();
		ES.clickaddnewentity();
		ES.createentitywithmandatory(BaseLibrary.getdatabasedonsheet("Partner", 1, 1),
				BaseLibrary.getdatabasedonsheet("Partner", 2, 1), BaseLibrary.getdatabasedonsheet("Partner", 3, 1));
		ES.entitysavebutton();
		ES.verifynewentity();

	}

	@And("Create Business Entity to which user should be added")
	public void create_entity_user() throws Exception {
		Thread.sleep(2000);
		ES.clickaccountdatamanagementmenu();
		ES.clickenitysubmenu();
		ES.clickaddnewentity();
		ES.createentitywithmandatory(BaseLibrary.getdatabasedonsheet("Partner", 1, 6),
				BaseLibrary.getdatabasedonsheet("Partner", 2, 6), BaseLibrary.getdatabasedonsheet("Partner", 3, 6));
		ES.entitysavebutton();
		ES.verifynewentity();

	}

	@And("Create New {string} Partner type to which User should be added")
	public void create_partner_user(String partnertype) throws Exception {
		if(partnertype.equalsIgnoreCase("ADIVSOR"))
		{
		ES.clickaccountdatamanagementmenu();
		NP.clickpartnersubmenu();
		NP.clickaddnewpartner(BaseLibrary.getdatabasedonsheet("Partner", 1, 6));
		Thread.sleep(30000);
		NP.feedvailddatatomandatorypartnerinformationfields(BaseLibrary.getdatabasedonsheet("Partner", 4, 6),partnertype, BaseLibrary.getdatabasedonsheet("Partner", 27, 6),
				BaseLibrary.randomstringgenerator(6));
		NP.feedvailddatatoalllegalriskfields(BaseLibrary.getdatabasedonsheet("Partner", 48, 6));
		NP.feedvailddatatoallProductinfofields(BaseLibrary.getdatabasedonsheet("Partner", 52, 6));
		NP.feedvailddatatomandatoryfundingfields(BaseLibrary.getdatabasedonsheet("Partner", 68, 6));
		NP.feedvailddatatomandatorysettlementfields();
		NP.feedvailddatatomandatoryofficefields("yes",BaseLibrary.getdatabasedonsheet("Partner", 148, 6));
		NP.feedvailddatatomandatoryreportfields("yes");
		NP.savepartner();
		ES.validationMeassage("Partner has been saved successfully!");
		}
		else if (partnertype.equalsIgnoreCase("BROKER")){
			ES.clickaccountdatamanagementmenu();
			NP.clickpartnersubmenu();
			NP.clickaddnewpartner(BaseLibrary.getdatabasedonsheet("Partner", 1, 6));
			Thread.sleep(3000);
			NP.feedvailddatatomandatorypartnerinformationfields(BaseLibrary.randomstringgenerator(9),partnertype, BaseLibrary.getdatabasedonsheet("Partner", 27, 6),
					BaseLibrary.randomstringgenerator(6));
			NP.feedvailddatatoalllegalriskfields(BaseLibrary.getdatabasedonsheet("Partner", 48, 6));
			NP.feedvailddatatoallProductinfofields(BaseLibrary.getdatabasedonsheet("Partner", 52, 6));
			NP.feedvailddatatomandatoryfundingfields(BaseLibrary.getdatabasedonsheet("Partner", 68, 6));
			NP.feedvailddatatomandatorysettlementfields();
			NP.feedvailddatatomandatoryofficefields("yes",BaseLibrary.randomstringgenerator(9));
			NP.feedvailddatatomandatoryreportfields("yes");
			NP.savepartner();
			ES.validationMeassage("Partner has been saved successfully!");
			
		}

	}

	@And("Choose the partner and Click add new users")
	public void choosepartner_clickadd() throws Exception {
		
	//	US.choosepartner(NP.partnerName);
		US.choosepartner("acsgqcdvv");
		US.clickadduser();
	}
	
	
	@And("Choose the partner")
	public void choosepartner() throws Exception {
	//	US.choosepartner(NP.partnerName);
		US.choosepartner("acsgqcdvv");
		Thread.sleep(1000000);
	}
	
	@And("Create different Business Entity to which partner should be added")
	public void create_diff_entity() throws Exception {
		ES.clickaccountdatamanagementmenu();
		ES.clickenitysubmenu();
		ES.clickaddnewentity();
		ES.createentitywithmandatory(BaseLibrary.getdatabasedonsheet("Partner", 1, 3),
				BaseLibrary.getdatabasedonsheet("Partner", 2, 3), BaseLibrary.getdatabasedonsheet("Partner", 3, 3));
		ES.entitysavebutton();
		ES.verifynewentity();

	}

	@And("Click Add New Partner button")
	public void click_addnewpartner() throws Exception {
		ES.clickaccountdatamanagementmenu();
		NP.clickpartnersubmenu();
		NP.clickaddnewpartner(BaseLibrary.getdatabasedonsheet("Partner", 1, 1));
		Thread.sleep(15000);

	}

	@Then("Check save button is disabled")
	public void check_disabledsavebutton() throws Exception {
		NP.checksavebutton();

	}

	@And("Click Add New Partner button with different entity")
	public void click_addnewpartner_diffentity() throws Exception {
		ES.clickaccountdatamanagementmenu();
		NP.clickpartnersubmenu();
		NP.clickaddnewpartner(BaseLibrary.getdatabasedonsheet("Partner", 1, 3));
		Thread.sleep(10000);

	}

	@Then("Enter valid inputs in the fields and click Save button")
	public void enter_vailddata_partner() throws Exception {

		NP.feedvailddatatoallpartnerinformationfields();
		NP.feedvailddatatoalllegalriskfields(BaseLibrary.getdatabasedonsheet("Partner", 48, 1));
		NP.feedvailddatatoallProductinfofields(BaseLibrary.getdatabasedonsheet("Partner", 52, 1));
		NP.feedvailddatatoallfundingfields();
		NP.feedvailddatatoallsettlementfields();
		NP.feedvailddatatoallofficefields();
		NP.feedvailddatatoallreportfields();
		NP.savepartner();

	}

	@Then("Enter valid {string} inputs in the fields and click Save button")
	public void enter_vaildminmaxdata_partner(String type) throws Exception {
		if (type.equalsIgnoreCase("minimum")) {
			NP.feedvaildminmaxdatatoallpartnerinformationfields(4);
			NP.feedvaildminmaxdatatoalllegalriskfields(BaseLibrary.getdatabasedonsheet("Partner", 48, 1), 4);
			NP.feedvaildminmaxdatatoallProductinfofields(BaseLibrary.getdatabasedonsheet("Partner", 52, 1), 4);
			NP.feedvaildminmaxdatatoallfundingfields(4);
			NP.feedvaildminmaxdatatoallsettlementfields(4);
			NP.feedvaildminmaxdatatoallofficefields(4);
			NP.feedvaildminmaxdatatoallreportfields(4);
			NP.savepartner();
		} else {
			NP.feedvaildminmaxdatatoallpartnerinformationfields(5);
			NP.feedvaildminmaxdatatoalllegalriskfields(BaseLibrary.getdatabasedonsheet("Partner", 48, 1), 5);
			NP.feedvaildminmaxdatatoallProductinfofields(BaseLibrary.getdatabasedonsheet("Partner", 52, 1), 5);
			NP.feedvaildminmaxdatatoallfundingfields(5);
			NP.feedvaildminmaxdatatoallsettlementfields(5);
			NP.feedvaildminmaxdatatoallofficefields(5);
			NP.feedvaildminmaxdatatoallreportfields(5);
			NP.savepartner();
		}

	}

	@Then("Enter valid inputs in the mandatory fields and click Save button")
	public void enter_vaildmandatorydata_partner() throws Exception {

		NP.feedvailddatatomandatorypartnerinformationfields(BaseLibrary.randomstringgenerator(9),BaseLibrary.getdatabasedonsheet("Partner", 5, 1),
				BaseLibrary.getdatabasedonsheet("Partner", 27, 1), BaseLibrary.randomstringgenerator(6));
		NP.feedvailddatatoalllegalriskfields(BaseLibrary.getdatabasedonsheet("Partner", 48, 1));
		NP.feedvailddatatoallProductinfofields(BaseLibrary.getdatabasedonsheet("Partner", 52, 1));
		NP.feedvailddatatomandatoryfundingfields(BaseLibrary.getdatabasedonsheet("Partner", 68, 1));
		NP.feedvailddatatomandatorysettlementfields();
		NP.feedvailddatatomandatoryofficefields("yes",BaseLibrary.randomstringgenerator(9));
		NP.feedvailddatatomandatoryreportfields("yes");
		NP.savepartner();

	}

	@Then("Enter valid inputs in the mandatory fields with different {string} and click Save button")
	public void enter_vaildmandatorydata_partner_diffpartnertype(String differenttypes) throws Exception {

		if (differenttypes.equalsIgnoreCase("Broker Partner")) {
			NP.feedvailddatatomandatorypartnerinformationfields(BaseLibrary.randomstringgenerator(9),"Broker",
					BaseLibrary.getdatabasedonsheet("Partner", 27, 1), BaseLibrary.randomstringgenerator(6));
		} else if (differenttypes.equalsIgnoreCase("Business structure")) {
			NP.feedvailddatatomandatorypartnerinformationfields(BaseLibrary.randomstringgenerator(9),BaseLibrary.getdatabasedonsheet("Partner", 5, 1), "DBA",
					BaseLibrary.randomstringgenerator(6));
		} else if (differenttypes.equalsIgnoreCase("Same WIP ID")) {
			NP.feedvailddatatomandatorypartnerinformationfields(BaseLibrary.randomstringgenerator(9),BaseLibrary.getdatabasedonsheet("Partner", 5, 1), "DBA",
					BaseLibrary.getdatabasedonsheet("Partner", 113, 1));
		} else {
			NP.feedvailddatatomandatorypartnerinformationfields(BaseLibrary.randomstringgenerator(9),BaseLibrary.getdatabasedonsheet("Partner", 5, 1),
					BaseLibrary.getdatabasedonsheet("Partner", 27, 1), BaseLibrary.randomstringgenerator(6));
		}

		if (differenttypes.equalsIgnoreCase("Registration Type")) {
			NP.feedvailddatatoalllegalriskfields("OTHER");
		} else {
			NP.feedvailddatatoalllegalriskfields(BaseLibrary.getdatabasedonsheet("Partner", 48, 1));
		}

		if (differenttypes.equalsIgnoreCase("Product ID")) {
			NP.feedvailddatatoallProductinfofields("OTC");
		} else {
			NP.feedvailddatatoallProductinfofields(BaseLibrary.getdatabasedonsheet("Partner", 52, 1));
		}

		if (differenttypes.equalsIgnoreCase("Funding Type")) {
			NP.feedvailddatatomandatoryfundingfields("Bulk Deposit");
		} else {
			NP.feedvailddatatomandatoryfundingfields(BaseLibrary.getdatabasedonsheet("Partner", 68, 1));
		}

		NP.feedvailddatatomandatorysettlementfields();

		if (differenttypes.equalsIgnoreCase("Office and suboffice")) {
			NP.feedvailddatatomandatoryofficefieldswithmultiplesuboff("yes");
		} else {
			NP.feedvailddatatomandatoryofficefields("yes",BaseLibrary.randomstringgenerator(9));
		}

		NP.feedvailddatatomandatoryreportfields("yes");
		NP.savepartner();

	}

	@Then("Enter valid inputs in the mandatory fields without {string} document and click Save button")
	public void enter_vaildmandatorydata_partner_withoutdoc(String module) throws Exception {

		NP.feedvailddatatomandatorypartnerinformationfields(BaseLibrary.randomstringgenerator(9),BaseLibrary.getdatabasedonsheet("Partner", 5, 1),
				BaseLibrary.getdatabasedonsheet("Partner", 27, 1), BaseLibrary.randomstringgenerator(6));
		NP.feedvailddatatoalllegalriskfields(BaseLibrary.getdatabasedonsheet("Partner", 48, 1));
		NP.feedvailddatatoallProductinfofields(BaseLibrary.getdatabasedonsheet("Partner", 52, 1));
		NP.feedvailddatatomandatoryfundingfields(BaseLibrary.getdatabasedonsheet("Partner", 68, 1));
		NP.feedvailddatatomandatorysettlementfields();
		if (module.equalsIgnoreCase("office")) {
			NP.feedvailddatatomandatoryofficefields("No",BaseLibrary.randomstringgenerator(9));
		} else {
			NP.feedvailddatatomandatoryofficefields("yes",BaseLibrary.randomstringgenerator(9));
		}
		if (module.equalsIgnoreCase("report")) {
			NP.feedvailddatatomandatoryreportfields("No");
			NP.checksavebutton();
		} else {
			NP.feedvailddatatomandatoryreportfields("Yes");
			NP.savepartner();
		}

	}

	@And("View the create Partner in a list view on Partner Overview page")
	public void check_newpartner() throws Exception {
		Thread.sleep(5000);
		ES.clickfilter();
		NP.searchwithonefilter();
		NP.recordsonentity();
	}

	@And("Click Edit button, entered Updated Inputs in the fields and click Save button")
	public void partner_update() throws Exception {
		NP.Update_partner();
		NP.savepartner();
	}

	@Then("Enter min valid inputs on partner and click Save button")
	public void enter_minvalid_partner() throws Exception {
		NP.feedvailddatatominpartnerinformationfields();
		NP.feedvailddatatominlegalriskfields();
		// NP.feedvailddatatoallProductinfofields();
		NP.feedvailddatatominfundingfields();
		NP.feedvailddatatominsettlementfields();
		NP.feedvailddatatominofficefields();
		NP.feedvailddatatominreportfields();
		NP.savepartner();
	}

	@Then("verify records on partner")
	public void click_recordspartner() throws Exception {
		NP.recordsvaildonentity(BaseLibrary.getdatabasedonsheet("Partner", 4, 1));
	}

	@Then("apply one filter and search on partner")
	public void click_onefilter() throws Exception {
		NP.searchwithvaildonefilter(BaseLibrary.getdatabasedonsheet("Partner", 4, 1));
	}

	@Then("apply one filter with invalid input and search on partner")
	public void click_onefilterwithinvalid() throws Exception {
		NP.searchwithoneinvalidfilter();
	}

	@Then("apply multiple filter and search on partner")
	public void click_multiplefilter() throws Exception {
		NP.searchwithmultiplefilter(BaseLibrary.getdatabasedonsheet("Partner", 4, 1),
				BaseLibrary.getdatabasedonsheet("Partner", 113, 1));
	}

	@Then("apply multiple filter with invalid input and search on partner")
	public void click_multipefilterwithinvalid() throws Exception {
		NP.searchwithmultipleinvalidfilter();
	}

	@Then("^enter the \"([^\"]*)\" input on partner universal search and search it$")
	public void entityuniversalsearch(String input) throws Exception {
		NP.partneruniversalsearch(input, BaseLibrary.getdatabasedonsheet("Partner", 4, 1));
		NP.clickSearchIcon();
	}

//
//	@Then("Enter data in mandatory fields on partner with a Same wlpid and click Save button")
//	public void enter_samewlpid_partner() throws Exception {
//		NP.feedvailddatatomandatorypartnerinformationfields();
//		NP.feedvailddatatoalllegalriskfields();
//		NP.feedvailddatatoallProductinfofields();
//		NP.feedvailddatatomandatoryfundingfields();
//		NP.feedvailddatato_samewlpid_settlementfields();
//		NP.feedvailddatatomandatoryofficefields();
//		NP.feedvailddatatomandatoryreportfields();
//		NP.savepartner();
//	}
//
//	@Then("Enter New Partner without office and click Save button")
//	public void enter_mandatorydata_partner_withoutoffice() throws Exception {
//		NP.feedvailddatatomandatorypartnerinformationfields();
//		NP.feedvailddatatoalllegalriskfields();
//		NP.feedvailddatatoallProductinfofields();
//		NP.feedvailddatatomandatoryfundingfields();
//		NP.feedvailddatatomandatorysettlementfields();
//		NP.feedvailddatatomandatoryreportfields();
//		NP.savepartner();
//	}
//
//	@Then("Enter New Partner without report and click Save button")
//	public void enter_mandatorydata_partnerwithoutreport() throws Exception {
//		NP.feedvailddatatomandatorypartnerinformationfields();
//		NP.feedvailddatatoalllegalriskfields();
//		NP.feedvailddatatoallProductinfofields();
//		NP.feedvailddatatomandatoryfundingfields();
//		NP.feedvailddatatomandatorysettlementfields();
//		NP.feedvailddatatomandatoryofficefields();
//		NP.feedvailddatatomandatorywithoutreportfields();
//		NP.savepartner();
//	}

}
