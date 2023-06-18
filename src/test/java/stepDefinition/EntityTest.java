package stepDefinition;

import baseMethods.BaseLibrary;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CompanyScreen;
import pageObjects.DashboardScreen;
import pageObjects.EntityScreen;
import pageObjects.LoginScreen;

public class EntityTest {

	LoginScreen LS = new LoginScreen();
	DashboardScreen DS=new DashboardScreen();
	CompanyScreen CS=new CompanyScreen();
	EntityScreen ES=new EntityScreen();

	
	
	@Then("Click Add New Entity button in Account data management")
	public void click_addentitybutton() throws Exception {
		ES.clickaccountdatamanagementmenu();
		ES.clickenitysubmenu();
		ES.clickaddnewentity();
	}
	
	@And("Enter data in all Entity Mandatory Fields")
	public void click_entitymandatoryfield() throws Exception {
		ES.createentitywithmandatory(BaseLibrary.getdatabasedonsheet("Entity", 1, 1),BaseLibrary.getdatabasedonsheet("Entity", 2, 1),BaseLibrary.getdatabasedonsheet("Entity", 6, 1));
	}
	
	@And("User should able to create a new Entity")
	public void click_entitysavebutton() throws Exception {
		ES.entitysavebutton();
		ES.verifynewentity();
	}
	
	 @And("^click \"([^\"]*)\" from the Account Data Management menu$")
	    public void when_user_clicks_something_from_the_account_data_management_menu(String menuName) throws Throwable {
	        DS.account_data_management_menu(menuName);
	    }


	@And("^click \"([^\"]*)\" from the System Wide Master Data$")
	public void when_user_clicks_something_from_the_System_Wide_Master_Data(String menuName) throws Throwable {
		DS.system_Wide_master_data(menuName);
	}

	    @Then("Click Add New Entity button")
	    public void click_add_entity() throws Exception {
	        ES.clickaddnewentity();
	    }

	    @And("Enter data in all Fields on Entity")
	    public void enter_Entity_allfield() throws Exception {
	        ES.createmandatorywithallfield();
	    }

	    @And("Enter max valid input Fields on Entity")
	    public void enter_Entity_maxinputfield() throws Exception {
	        ES.createfieldswithmaxinput();
	    }

	    @And("Enter data in mandatory Fields on Entity")
	    public void enter_Entity_mandatoryfield() throws Exception {
	        ES.createmandatorywithmandatoryfield();
	    }

	    @Then("click save button")
	    public void click_savebutton() throws Exception {
	        ES.clicksavebutton();
	    }

	    @Then("click skip button")
	    public void click_skipbutton() throws Exception {
	        ES.clickskipbutton();
	    }

	    @Then("click Add Partner button on popup")
	    public void click_AddPartnerbuttonpopup() throws Exception {
	        ES.clickAddPartnerbuttonpopup();
	    }

	    @Then("Navigates to Partner page")
	    public void click_Partnerpage() throws Exception {
	        ES.navigatepartnerscreen();
	    }

	    @Then("click on filter button")
	    public void click_filter() throws Exception {
	    //    ES.clickfilter();
	        
	    }

	    @Then("apply one filter and search on entity")
	    public void click_onefilter() throws Exception {
	        ES.searchwithonefilter();
	    }

	    @Then("apply one filter with invalid input and search on entity")
	    public void click_onefilterwithinvalid() throws Exception {
	        ES.searchwithoneinvalidfilter();
	    }

	    @Then("apply multiple filter with invalid input and search on entity")
	    public void click_multipefilterwithinvalid() throws Exception {
	        ES.searchwithmultipleinvalidfilter();
	    }

	    @Then("click save without mandatory fields and verify unable to save on entity")
	    public void withoutmandatoryfields() throws Exception {
	        ES.withoutmandatoryfields();
	    }

	    @Then("apply multiple filter and search on entity")
	    public void click_multiplefilter() throws Exception {
	        ES.searchwithmultiplefilter();
	    }

	    @Then("verify records on entity")
	    public void click_recordsonentity() throws Exception {
	        ES.recordsonentity();
	    }
	    @Then("user launches the PostTrade application for super admin")
	    public void superadminusercredentials() throws Exception {
	        LS.enterUserName(BaseLibrary.getdatabasedonsheet("Login", 1, 1));
	        LS.enterPassword(BaseLibrary.getdatabasedonsheet("Login", 2, 1));
	        LS.clickLoginButton();
	    }
	    @Then("user launches the PostTrade application for individual user")
	    public void individualsercredentials() throws Exception {
	        LS.enterUserName(BaseLibrary.getdatabasedonsheet("Login", 3, 1));
	        LS.enterPassword(BaseLibrary.getdatabasedonsheet("Login", 4, 1));
	        LS.clickLoginButton();
	    }

	    @Then("verify no record found")
	    public void norecordfound() throws Exception {
	        ES.norecordfound();
	    }

	    @Then("^\"([^\"]*)\" Validate message should be displayed$")
	    public void validationMeassage(String validationMeassage) throws Exception {
	        ES.validationMeassage(validationMeassage);
	    }

	    @Then("click on full legal name on entity")
	    public void clickfulllegalname() throws Exception {
	        ES.clickfulllegalname();
	    }

	    @Then("^filter existing record and edit \"([^\"]*)\" inputs to entity$")
	    public void entityedit(String input) throws Exception {
	        ES.editentity(input);
	    }

	    @Then("^sort order on column$")
	    public void sortcolumn() throws Exception {
	        ES.sortcolumn();
	    }

	    @Then("^verify sorted records in \"([^\"]*)\"$")
	    public void sortcolumn(String sortorder) throws Exception {
	        ES.columnsortorder(sortorder);
	    }


	    @Then("verify saved successful message")
	    public void savedsuccessfulmessage() throws Exception {
	        CS.checksavedmessage();
	    }

	    @Then("verify error message on entity")
	    public void errormessageentity() throws Exception {
	        ES.errormessageentity();
	    }

	    @Then("^enter the \"([^\"]*)\" input on entity universal search and search it$")
	    public void entityuniversalsearch(String input) throws Exception {
	        ES.entityuniversalsearch(input);
	        ES.clickSearchIcon();
	    }
	
	
}
