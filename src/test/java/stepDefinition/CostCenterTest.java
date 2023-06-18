package stepDefinition;

import baseMethods.BaseLibrary;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.*;

public class CostCenterTest {

    EntityScreen ES = new EntityScreen();
    NewPartnerScreen NP = new NewPartnerScreen();
    OfficeScreen OS = new OfficeScreen();

    CostCenterScreen CCS = new CostCenterScreen();

    @And("Create Business Entity and Partner with office and suboffice for cost center")
    public void createbusinessentityandpartner() throws Exception {
        ES.clickaccountdatamanagementmenu();
        ES.clickenitysubmenu();
        ES.clickaddnewentity();
        ES.createentitywithmandatory(BaseLibrary.getdatabasedonsheet("CostCenter", 0, 1),
                BaseLibrary.getdatabasedonsheet("CostCenter", 1, 1), BaseLibrary.getdatabasedonsheet("CostCenter", 2, 1));
        ES.entitysavebutton();
        ES.verifynewentity();
        ES.clickaccountdatamanagementmenu();
        NP.clickpartnersubmenu();
        NP.clickaddnewpartner(BaseLibrary.getdatabasedonsheet("CostCenter", 0, 1));
        NP.feedvailddatatomandatorypartnerinformationfieldsforotherscreen(BaseLibrary.getdatabasedonsheet("CostCenter", 3, 1), BaseLibrary.getdatabasedonsheet("Partner", 5, 1),
                BaseLibrary.getdatabasedonsheet("Partner", 27, 1), BaseLibrary.getdatabasedonsheet("CostCenter", 5, 1));
        NP.feedvailddatatoalllegalriskfields(BaseLibrary.getdatabasedonsheet("Partner", 48, 1));
        NP.feedvailddatatoallProductinfofields(BaseLibrary.getdatabasedonsheet("Partner", 52, 1));
        NP.feedvailddatatomandatoryfundingfields(BaseLibrary.getdatabasedonsheet("Partner", 68, 1));
        NP.feedvailddatatomandatorysettlementfields();
       NP.feedvailddatatomandatoryofficefieldsonpartner(BaseLibrary.getdatabasedonsheet("CostCenter", 7, 1),BaseLibrary.getdatabasedonsheet("CostCenter", 6, 1),
                BaseLibrary.getdatabasedonsheet("CostCenter", 8, 1),BaseLibrary.getdatabasedonsheet("CostCenter", 9, 1));
        NP.feedvailddatatomandatoryreportfields("Yes");
        NP.savepartner();
        OS.Verifysuccessfullymessage();
    }

    @And("Click Add New Cost Center button")
    public void userClickOnAddNewAddCostCenter() throws Exception {
        ES.clickaccountdatamanagementmenu();
        CCS.clickcostcentersubmenu();
        CCS.clickAddNewcostcenter();
    }

    @And("Enter all inputs in the cost center and click Save button")
    public void userallfieldsoncostcenter() throws Exception {
        CCS.createCostCenterWithallFields();
        NP.savepartner();
    }

    @And("Enter mandatory inputs in the cost center and click Save button")
    public void usermandatoryfieldsoncostcenter() throws Exception {
        CCS.createCostCenterWithmandatoryFields(BaseLibrary.getdatabasedonsheet("GL COA", 27, 1),
                BaseLibrary.getdatabasedonsheet("GL COA", 28, 1));
        NP.savepartner();
    }

    @And("View the created cost center in a list view on office Overview page")
    public void check_newcostcenter() throws Exception {
        ES.clickfilter();
        CCS.searchwithonefilter();
        CCS.recordsoncostcenter();
    }

    @And("Click Edit button, entered Updated Inputs in the cost center and click Save button")
    public void costcenter_update() throws Exception {
        CCS.Update_costcenter();
        NP.savepartner();
    }

    @And("Verify updated successfully and verify updated records on cost center")
    public void verifysuccessfully() throws Exception {
        OS.Verifysuccessfullymessage();
        CCS.recordsoncostcenter();
    }

    @Then("apply one filter and search on cost center")
    public void click_onefilter() throws Exception {
        CCS.searchwithvaildonefilter(BaseLibrary.getdatabasedonsheet("CostCenter", 10, 1));
    }

    @Then("apply multiple filter and search on cost center")
    public void click_multiplefilter() throws Exception {
        CCS.searchwithmultiplefilter(BaseLibrary.getdatabasedonsheet("CostCenter", 10, 1), BaseLibrary.getdatabasedonsheet("CostCenter", 11, 1));
    }

    @Then("apply one filter with invalid input and search on cost center")
    public void click_onefilterwithinvalid() throws Exception {
        CCS.searchwithoneinvalidfilter();
    }

    @Then("apply filter with valid and invalid input and search on cost center")
    public void click_multipefilterwithvalidandinvalid() throws Exception {
        CCS.searchwithmultiplevalidandinvalidfilter(BaseLibrary.getdatabasedonsheet("CostCenter", 10, 1));
    }

    @Then("apply multiple filter with invalid input and search on cost center")
    public void click_multipefilterwithinvalid() throws Exception {
        CCS.searchwithmultipleinvalidfilter();
    }
    @Then("verify records on cost center")
    public void click_recordsoffice() throws Exception {
        CCS.recordsonvalidcostcenter(BaseLibrary.getdatabasedonsheet("CostCenter", 10, 1));
    }
    @Then("^enter the \"([^\"]*)\" input on cost center universal search and search it$")
    public void coscenteruniversalsearch(String input) throws Exception {
        CCS.costcenteruniversalsearch(input,BaseLibrary.getdatabasedonsheet("CostCenter", 10, 1));
        NP.clickSearchIcon();
    }
}
