package stepDefinition;

import baseMethods.BaseLibrary;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.CompanyScreen;
import pageObjects.DashboardScreen;
import pageObjects.LoginScreen;

public class CompanyTest {

	LoginScreen LS = new LoginScreen();
	DashboardScreen DS = new DashboardScreen();
	CompanyScreen CS = new CompanyScreen();

	@Then("Click Add New Company button")
	public void click_add_company() throws Exception {
		DS.clickaddnewcompany();
	}

	@And("Enter data in all Company Mandatory Fields")
	public void enter_companymandatoryfield() throws Exception {
		CS.createcompanywithmandatory();
	}

	@Then("User should able to create a new company")
	public void click_savebutton() throws Exception {
		CS.clicksavebutton();
		CS.creationmessage();
	}

	@Then("User should able to view the validation message")
	public void check_validationmessage() throws Exception {
		CS.clicksavebutton();
		CS.validationmessage();

	}

	@Then("Switch to the new company")
	public void switch_new_company() throws Exception {
		DS.switchcompany(LS.Companyname);
	}

	@And("Enter data without Mandators fields and click Save button")
	public void clicksave_withoutmandatoryfield() throws Exception {
		CS.enteremail(BaseLibrary.getdatabasedonsheet("Company", 10, 1));
		CS.checksavebutton();
	}

	@And("Enter data in all Company Fields")
	public void enter_companyfields() throws Exception {
		CS.createcompanywithallfields();
	}

	@And("Enter invaild data in all Company Fields")
	public void enterinvailddata_companyfields() throws Exception {
		CS.createcompanywithinvailddata();
	}

	@And("Click Edit option and modify the company details with {string} data")
	public void click_editoption(String datatype) throws Exception {
		CS.clickedit(datatype);
		if (datatype.equalsIgnoreCase("invalid")) {
			CS.checksavebutton();
		}

	}

	@Then("Click Save button and user should able to receive the updation message")
	public void check_updationmessage() throws Exception {
		CS.clicksavebutton();
		CS.checksavedmessage();
	}

}
