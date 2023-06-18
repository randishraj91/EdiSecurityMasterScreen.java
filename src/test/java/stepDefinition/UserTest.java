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

public class UserTest {

	LoginScreen LS = new LoginScreen();
	DashboardScreen DS = new DashboardScreen();
	CompanyScreen CS = new CompanyScreen();
	EntityScreen ES = new EntityScreen();
	NewPartnerScreen NP = new NewPartnerScreen();
	UserScreen US = new UserScreen();

	@Then("Navigate to User and Accounts module")
	public void Navigate_user_account() throws Exception {
		ES.clickaccountdatamanagementmenu();
		US.clickuseraccountsubmenu();
	}

	@Then("Choose {string} user type")
	public void choosepartner_clickadd(String usertype) throws Exception {
		US.chooseusertype(usertype);
		US.clickcreateuser();

	}

	@And("Enter {string} inputs in User fields {string} and click User Save button")
	public void feeddata_user_allfields(String data_type, String moduletype) throws Exception {
		Thread.sleep(3000);
		if (moduletype.equalsIgnoreCase("with autopilot")) {
//			US.feed_vaild_basicinfo(data_type, BaseLibrary.randomstringgenerator(8), NP.Sub_Office,
//					BaseLibrary.randomstringgenerator(8), BaseLibrary.randomstringgenerator(8));
			US.feed_vaild_basicinfo(data_type,BaseLibrary.getdatabasedonsheet("InstitutionalUser", 1, 1), "Kkbratmwu",
					BaseLibrary.randomstringgenerator(8), BaseLibrary.randomstringgenerator(8));
			US.feed_vaild_legalinfo(data_type);
			US.feed_vaild_autopilotinfo();
			US.feed_vaild_docinfo("yes");
			US.feed_vaild_noteinfo();
			US.clicksavebutton();
			US.clickcreatebutton();
		} else if (moduletype.equalsIgnoreCase("without autopilot")) {
			US.feed_vaild_basicinfo(data_type, BaseLibrary.randomstringgenerator(8), NP.Sub_Office,
					BaseLibrary.randomstringgenerator(8), BaseLibrary.randomstringgenerator(8));
			US.feed_vaild_legalinfo(data_type);
			US.feed_vaild_docinfo("yes");
			US.feed_vaild_noteinfo();
			US.feed_vaild_noteinfo_two();
			US.clicksavebutton();
			US.clickcreatebutton();
		}
		else if (moduletype.equalsIgnoreCase("with multi document")) {
			US.feed_vaild_basicinfo(data_type, BaseLibrary.randomstringgenerator(8), "Kkbratmwu",
					BaseLibrary.randomstringgenerator(8), BaseLibrary.randomstringgenerator(8));
			US.feed_vaild_legalinfo(data_type);
			US.feed_vaild_autopilotinfo();
			US.feed_vaild_docinfo("yes");
			US.feed_vaild_docinfo_2("yes");
			US.feed_vaild_noteinfo();
			US.clicksavebutton();
			US.clickcreatebutton();
		}
		else if (moduletype.equalsIgnoreCase("with invaild document")) {
			US.feed_invaild_docinfo();
		}
		

	}
	
	@And("Enter {string} inputs in Director User fields {string} and click User Save button")
	public void feeddata_Director_user_allfields(String data_type, String moduletype) throws Exception {
		Thread.sleep(3000);
		if (moduletype.equalsIgnoreCase("with autopilot")) {
//			US.feed_vaild_basicinfo(data_type, BaseLibrary.randomstringgenerator(8), NP.Sub_Office,
//					BaseLibrary.randomstringgenerator(8), BaseLibrary.randomstringgenerator(8));
			
			US.feed_vaild_director_basicinfo(data_type,
					BaseLibrary.getdatabasedonsheet("DirectorUser", 1, 1),"Kkbratmwu");
			US.feed_vaild_director_legalinfo(data_type);
			US.feed_vaild_autopilotinfo();
			US.feed_vaild_docinfo("yes");
			US.feed_vaild_noteinfo();
			US.clicksavebutton();
			US.clickcreatebutton();
		}
		
	}
	
	
	@And("Verify multiple director user can be created under a partner and click User Save button")
	public void feeddata_multiple_Director_user_allfields() throws Exception {
		Thread.sleep(3000);
//			US.feed_vaild_basicinfo(data_type, BaseLibrary.randomstringgenerator(8), NP.Sub_Office,
//					BaseLibrary.randomstringgenerator(8), BaseLibrary.randomstringgenerator(8));
			
			US.feed_vaild_director_basicinfo("valid",
					BaseLibrary.randomstringgenerator(8),"Kkbratmwu");
			US.feed_vaild_director_legalinfo("valid");
			US.feed_vaild_autopilotinfo();
			US.feed_vaild_docinfo("yes");
			US.feed_vaild_noteinfo();
			US.clicksavebutton();
			US.clickcreatebutton();
	}



	@Then("Click already created user")
	public void click_already_created_partner() throws Exception {
		// US.click_already_created_user(US.User_Name);
		US.click_already_created_user("ivecocqo");
	}
	
	@Then("Click already created Director user")
	public void click_already_created_director_partner() throws Exception {
	//	US.click_already_created_user(US.First_Name);
		US.click_already_created_director_user("bwnobtxux");
	}

	@Then("Check create accounts link for approved users")
	public void check_accountuser() throws Exception {
		// US.click_already_created_user(US.User_Name);
		US.check_createaccountlink("ivecocqo");
	}

	@Then("Update {string} and click save button")
	public void updateuser(String type) throws Exception {
		US.edit_user();
		US.Update_user(type);
		US.clicksavebutton();

	}
	
	

	@Then("Verify Created user information is displayed properly")
	public void verifyuserinformation() throws Exception {
		US.verify_user_information();
	}
	
	@Then("Verify {string} notes is displayed properly")
	public void verifynotesinformation(String type) throws Exception {
		US.verify_user_notes(type);
	}
	
	
	@Then("Verify the attached documents can be downloaded")
	public void verifydownloads() throws Exception {
		US.verify_downloads();;
	}
	
	@Then("Check Users and Accounts count should be displayed")
	public void verifycount() throws Exception {
		US.verify_counts();
	}
	
	@Then("Verify the attached documents can be removed by clicking on the trash icon")
	public void verifytrash() throws Exception {
		US.edit_user();
		US.verify_trash();;
	}


	@Then("Apply one filter and search on User")
	public void click_onefilter() throws Exception {
		US.searchwithvaildonefilter(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 1, 1));
		Thread.sleep(50000000);
	}

	@Then("verify records on User")
	public void click_recordspartner() throws Exception {
		US.recordsvaildonuser(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 1, 1));
	}
	
	@Then("^enter the \"([^\"]*)\" input on User universal search and search it$")
	public void entityuniversalsearch(String input) throws Exception {
		US.partneruniversalsearch(input, BaseLibrary.getdatabasedonsheet("InstitutionalUser", 1, 1));
		US.clickSearchIcon();
	}
	
	@Then("Apply one filter with invalid input and search on User")
	public void click_onefilterwithinvalid() throws Exception {
		US.searchwithoneinvalidfilter();
	}

	@Then("Apply multiple filter and search on User")
	public void click_multiplefilter() throws Exception {
		US.searchwithmultiplefilter(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 1, 1),
				"0");
	}
	
	@Then("Apply multiple filter with invaild input and search on User")
	public void click_multiplefilter_invaild() throws Exception {
		US.searchwithmultiplefilter(BaseLibrary.randomstringgenerator(4),
				"0");
	}
	
	
	@Then("Apply clear all in User filter")
	public void clear_filter() throws Exception {
		US.clearfilter(BaseLibrary.randomstringgenerator(4),
				"0");
	}
	
	
	@Then("Click on the Reset buttom from User filter menu")
	public void reset_filter() throws Exception {
		US.resetfilter(BaseLibrary.randomstringgenerator(4),
				"0");
	}
	
	@Then("Should show the page number properly")
	public void pagenumber() throws Exception {
		US.pagenumber();
	}

	@Then("Check Next and Previous linktext switches")
	public void switchtab() throws Exception {
		US.switchtab();
	}
	

	@Then("Check View column works properly")
	public void viewcolumn() throws Exception {
		US.viewcolumn();
	}
	
	

}
