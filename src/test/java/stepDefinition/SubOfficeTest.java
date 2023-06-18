package stepDefinition;

import baseMethods.BaseLibrary;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.*;

public class SubOfficeTest {

    EntityScreen ES = new EntityScreen();
    NewPartnerScreen NP = new NewPartnerScreen();
    OfficeScreen OS = new OfficeScreen();
    SubOfficeScreen SS = new SubOfficeScreen();

    @And("Create Business Entity,Partner,office")
    public void createbusinessentitypartneroffice() throws Exception {
        ES.clickaccountdatamanagementmenu();
        ES.clickenitysubmenu();
        ES.clickaddnewentity();
        ES.createentitywithmandatory(BaseLibrary.getdatabasedonsheet("SubOffice", 0, 1),
                BaseLibrary.getdatabasedonsheet("SubOffice", 1, 1), BaseLibrary.getdatabasedonsheet("Office", 2, 1));
        ES.entitysavebutton();
        ES.verifynewentity();
        ES.clickaccountdatamanagementmenu();
        NP.clickpartnersubmenu();
        NP.clickaddnewpartner(BaseLibrary.getdatabasedonsheet("SubOffice", 0, 1));
        NP.feedvailddatatomandatorypartnerinformationfields
                (BaseLibrary.getdatabasedonsheet("SubOffice", 3, 1),
                BaseLibrary.getdatabasedonsheet("Partner", 5, 1),
                BaseLibrary.getdatabasedonsheet("Partner", 27, 1),
                        BaseLibrary.getdatabasedonsheet("SubOffice", 5, 1));
        NP.feedvailddatatoalllegalriskfields(BaseLibrary.getdatabasedonsheet("Partner", 48, 1));
        NP.feedvailddatatoallProductinfofields(BaseLibrary.getdatabasedonsheet("Partner", 52, 1));
        NP.feedvailddatatomandatoryfundingfields(BaseLibrary.getdatabasedonsheet("Partner", 68, 1));
        NP.feedvailddatatomandatorysettlementfields();
        NP.feedvailddatatomandatoryofficefieldsforotherscreen();
        NP.feedvailddatatomandatoryreportfields("Yes");
        NP.savepartner();
        OS.Verifysuccessfullymessage();
        ES.clickaccountdatamanagementmenu();
        OS.clickofficesubmenu();
        OS.clickAddNewOffice();
        OS.creteOfficeWithmandatoryields(BaseLibrary.getdatabasedonsheet("SubOffice", 0, 1),BaseLibrary.getdatabasedonsheet("SubOffice", 3, 1),BaseLibrary.getdatabasedonsheet("SubOffice", 6, 1), BaseLibrary.getdatabasedonsheet("SubOffice", 7, 1));
        NP.savepartner();
        OS.Verifysuccessfullymessage();
    }

    @And("View the created suboffice in a list view on office Overview page")
    public void check_newsuboffice() throws Exception {
        ES.clickfilter();
        SS.searchwithonefilter();
        SS.recordsonsuboffice();
    }

    @And("Click Edit button, entered Updated Inputs in the suboffice and click Save button")
    public void suboffice_update() throws Exception {
        SS.Update_office();
        NP.savepartner();
    }

    @And("Verify updated successfully and verify updated records on suboffice")
    public void verifysuccessfully() throws Exception {
        OS.Verifysuccessfullymessage();
        SS.recordsonsuboffice();
    }

    @Then("^enter the \"([^\"]*)\" input on suboffice universal search and search it$")
    public void subofficeuniversalsearch(String input) throws Exception {
        SS.subofficeuniversalsearch(input,BaseLibrary.getdatabasedonsheet("SubOffice", 8, 1));
        NP.clickSearchIcon();
    }

    @Then("verify records on suboffice")
    public void click_recordsoffice() throws Exception {
        SS.recordsonvalidsuboffice(BaseLibrary.getdatabasedonsheet("SubOffice", 8, 1));
    }

    @Then("apply one filter and search on suboffice")
    public void click_onefilter() throws Exception {
        SS.searchwithvaildonefilter(BaseLibrary.getdatabasedonsheet("SubOffice", 8, 1));
    }

    @Then("apply multiple filter and search on suboffice")
    public void click_multiplefilter() throws Exception {
        SS.searchwithmultiplefilter(BaseLibrary.getdatabasedonsheet("SubOffice", 8, 1),BaseLibrary.getdatabasedonsheet("SubOffice", 9, 1));
    }

    @Then("apply one filter with invalid input and search on suboffice")
    public void click_onefilterwithinvalid() throws Exception {
        SS.searchwithoneinvalidfilter();
    }

    @Then("apply filter with valid and invalid input and search on suboffice")
    public void click_multipefilterwithvalidandinvalid() throws Exception {
        SS.searchwithmultiplevalidandinvalidfilter(BaseLibrary.getdatabasedonsheet("SubOffice", 8, 1));
    }

    @Then("apply multiple filter with invalid input and search on suboffice")
    public void click_multipefilterwithinvalid() throws Exception {
        SS.searchwithmultipleinvalidfilter();
    }

    @And("Click Add New SubOffice button")
    public void userClickOnAddNewSubOffice() throws Exception {
        ES.clickaccountdatamanagementmenu();
        SS.clicksubofficesubmenu();
        SS.clickAddNewOffice();
    }

    @And("Enter all inputs in the suboffice and click Save button")
    public void userallfieldsonosubofficeffice() throws Exception {
        SS.cretesubOfficeWithallFields(BaseLibrary.getdatabasedonsheet("SubOffice", 3, 1), BaseLibrary.getdatabasedonsheet("SubOffice", 7, 1),
                BaseLibrary.getdatabasedonsheet("SubOffice", 8, 1), BaseLibrary.getdatabasedonsheet("SubOffice", 9, 1));
        NP.savepartner();
    }

}