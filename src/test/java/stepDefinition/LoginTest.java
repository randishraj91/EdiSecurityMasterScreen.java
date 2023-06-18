package stepDefinition;

import baseMethods.BaseLibrary;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CompanyScreen;
import pageObjects.DashboardScreen;
import pageObjects.EdiSecurityMasterScreen;
import pageObjects.LoginScreen;

public class LoginTest {

	LoginScreen LS = new LoginScreen();
	DashboardScreen DS = new DashboardScreen();
	CompanyScreen CS = new CompanyScreen();
	EdiSecurityMasterScreen ESM=new EdiSecurityMasterScreen();


	@When("User enter the super admin username")
	public void user_enter_the_username() throws Exception {
		LS.enterUserName(BaseLibrary.getdatabasedonsheet("Login", 1, 1));
	}

	@And("Enter the super admin password")
	public void user_enter_the_password() throws Exception {
		LS.enterPassword(BaseLibrary.getdatabasedonsheet("Login", 2, 1));
	}

	
	@When("User enter the individual username")
	public void user_enter_the_ind_username() throws Exception {
		LS.enterUserName(BaseLibrary.getdatabasedonsheet("Login", 3, 1));
	}

	@And("Enter the individual password")
	public void user_enter_the_ind_password() throws Exception {
		LS.enterPassword(BaseLibrary.getdatabasedonsheet("Login", 4, 1));
	}
	
	
	@When("User enter the invaild username")
	public void user_enter_the_invaild_username() throws Exception {
		LS.enterUserName(BaseLibrary.randommailgenerator());
	}

	@And("Enter the invaild password")
	public void user_enter_the_invaild_password() throws Exception {
		LS.enterPassword(BaseLibrary.randomstringgenerator(10));
	}

	@When("User enter the blank username")
	public void user_enter_the_blank_username() throws Exception {
		LS.enterUserName("");
	}

	@And("Enter the blank password")
	public void user_enter_the_blank_password() throws Exception {
		LS.enterPassword("");
	}

	@Then("Click login button")
	public void user_click_login_button() throws Exception {
		LS.clickLoginButton();
	}

	@And("Enter the confirmation code")
	public void user_enter_the_confirm_code() throws Exception {
		LS.enterandclickconfirmcode(BaseLibrary.getdatabasedonsheet("Config", 1, 1),
				BaseLibrary.getdatabasedonsheet("Config", 2, 1),
				BaseLibrary.getdatabasedonsheet("Config", 3, 1),
				BaseLibrary.getdatabasedonsheet("Config", 4, 1),
				BaseLibrary.getdatabasedonsheet("Config", 5, 1));
	}

	@Then("Company page should be displayed")
	public void verify_companypage() throws Exception {
		LS.verifycompanypage();
	}

	@Then("Alert message should be displayed")
	public void verify_alert() throws Exception {
		LS.verifyalert();
	}

	@Then("Validation message should be displayed")
	public void verify_vaildation() throws Exception {
		LS.verifyvaildation();
	}

	@Then("Choose the Specific Company")
	public void select_company() throws Exception {
		LS.choosecompany();
	}



	@Then("User should be redirected to Company Overview Screen")
	public void verify_dashboard() throws Exception {
		DS.verifydashboard();
	}

	@Then("User should able to switch to another company from the list and view the Company Overview page")
	public void switch_company() throws Exception {
		DS.switchcompany(LS.Companyname);
	}
	
	@Then("User should able to switch to last company from the list and view the Company Overview page")
	public void switch_last_company() throws Exception {
		DS.switchlastcompany(LS.Companyname);
	}
	
	@Then("Add New Company button should be disabled User can View the Company overview on Home Screen")
	public void verify_disable_addnewcompany() throws Exception {
		DS.checkaddnewcompanydisable();
	}

}
