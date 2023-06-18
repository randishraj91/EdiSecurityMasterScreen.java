package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginScreen;
import pageObjects.PartnerScreen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PartnerTest {
    LoginScreen loginScreen = new LoginScreen();
    PartnerScreen partner = new PartnerScreen();



    @Given("user navigate to Partner screen")
    public void user_navigate_to_partner_screen() throws Exception {
        LoginScreen.openApplication();
        partner.clickSystemMaster();
        partner.loadTestData();

    }

    @Given("click on Add New Partner button")
    public void click_on_add_new_partner_button() throws Exception {
        partner.addNewPartner();
    }

    @When("Enter the Partner ID details with All fields")
    public void enter_the_partner_id_details_with_all_fields() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/partner.properties");
        String partnerid = prop.getProperty("Random_PartnerId");
        String partnercode = prop.getProperty("PartnerCode");
        String company = prop.getProperty("Company");
        String status = prop.getProperty("Status");
        String parentibid = prop.getProperty("ParentIBID");
        String partnername = prop.getProperty("PartnerName");
        String region = prop.getProperty("Region");

        String regtype = prop.getProperty("RegistrationType");
        String mpid = prop.getProperty("MPID");
        String dtcpass = prop.getProperty("DTCPassword");
        String partnum = prop.getProperty("PartnerNumber");
        String finum = prop.getProperty("FinraNum");
        String secnum = prop.getProperty("SecNum");
        String alertcd = prop.getProperty("AlertCD");
        String oasys = prop.getProperty("OasysCD");
        String bic = prop.getProperty("BicCD");
        String institutional = prop.getProperty("InstitutionalID");

        String upload = prop.getProperty("Upload");

        String production = prop.getProperty("Productionkeys");
        String commercial = prop.getProperty("CommercialLaunch");
        String contract = prop.getProperty("ContractTerm");
        String apitype = prop.getProperty("ApiType");

        partner.partnerid("Random_PartnerId");
        partner.partnercode("Random_PartnerCode");
        partner.Company("Random_Company");
        partner.Status(status);
        partner.ParentIBID(parentibid);
        partner.partnername("Random_PartnerName");
        partner.region(region);

        partner.registrationtype(regtype);
        partner.mpid(mpid);
        partner.dtcpassword(dtcpass);
        partner.partnernumber(partnum);
        partner.finranum(finum);
        partner.secnum(secnum);
        partner.alertcd(alertcd);
        partner.oasysid(oasys);
        partner.bicid(bic);
        partner.institutionalid(institutional);

        partner.Upload(upload);

        partner.productionkey(production);
        partner.commerciallaunch(commercial);
        partner.contractTerm(contract);
        partner.usingevent();
        partner.usinglegacy();
        partner.Apitype(apitype);
    }


    @When("Enter the Partner ID details with mandatory fields")
    public void enter_the_partner_id_details_with_mandatory_fields() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/partner.properties");
        String partnerid = prop.getProperty("PartnerID");
        String partnercode = prop.getProperty("PartnerCode");
        String company = prop.getProperty("Company");
        String status = prop.getProperty("Status");
        String parentibid = prop.getProperty("ParentIBID");
        String partnername = prop.getProperty("PartnerName");
        String region = prop.getProperty("Region");

        String regtype = prop.getProperty("RegistrationType");
        String mpid = prop.getProperty("MPID");
        String dtcpass = prop.getProperty("DTCPassword");
        String partnum = prop.getProperty("PartnerNumber");
        String finum = prop.getProperty("FinraNum");
        String secnum = prop.getProperty("SecNum");
        String alertcd = prop.getProperty("AlertCD");
        String oasys = prop.getProperty("OasysCD");
        String bic = prop.getProperty("BicCD");
        String institutional = prop.getProperty("InstitutionalID");



        String production = prop.getProperty("Productionkeys");
        String commercial = prop.getProperty("CommercialLaunch");
        String contract = prop.getProperty("ContractTerm");
        String apitype = prop.getProperty("ApiType");
        String usingevents = prop.getProperty("UsingEvents");
        String usinglegacy = prop.getProperty("UsingLegacy");
/*
        partner.partnerid(partnerid);
        partner.partnercode(partnercode);
        partner.Company(company);
*/
        partner.partnerid("Random_PartnerId");
        partner.partnercode("Random_PartnerCode");
        partner.Company("Random_Company");
        partner.Status(status);
        partner.ParentIBID(parentibid);
      //  partner.partnername(partnername);
        partner.partnername("Random_PartnerName");
        partner.region(region);

        partner.registrationtype(regtype);
        partner.mpid(mpid);
        partner.dtcpassword(dtcpass);
        partner.partnernumber(partnum);
        partner.finranum(finum);
        partner.secnum(secnum);
        partner.alertcd(alertcd);
        partner.oasysid(oasys);
        partner.bicid(bic);
        partner.institutionalid(institutional);

        partner.productionkey1(production);
        partner.commerciallaunch1(commercial);
        partner.contractTerm1(contract);
        partner.usingevent();
        partner.usinglegacy();
        partner.Apitype1(apitype);
    }

    @Then("validation message should be displayed on Partner screen")
    public void validation_message_should_be_displayed_on_Partner_screen() throws Exception {
        partner.verifyValidationMessage();
    }

    public static Properties readPropertiesFile(String fileName) throws IOException {
        FileInputStream fis = null;
        Properties prop = null;
        try {
            fis = new FileInputStream(fileName);
            prop = new Properties();
            prop.load(fis);
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            fis.close();
        }
        return prop;
    }
    @Then("click the partner save button")
    public void click_the_save_button() throws Exception {
        partner.clickSave();
    }
    @Then("click the partnerId save button")
    public void click_the_partner_id_save_button() throws Exception {
        partner.clickPartnerSave();
    }
    @Given("Click on the Existing Partner")
    public void click_on_the_existing_partner() throws Exception {
        partner.PartnerEdit();
      //  partner.enterInSearchBox("partnercode");
    }


    @When("Enter the Corporate details with All fields")
    public void enter_the_corporate_details_with_all_fields() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/partner.properties");

        String companylegal = prop.getProperty("CompanyLegal");
        String nickname = prop.getProperty("Nickname");
        String industry = prop.getProperty("Industry");
        String companytype = prop.getProperty("CompanyType");
        String ticker = prop.getProperty("Ticker");
        String corporatedate = prop.getProperty("DateOfFormation");
        String stateofincorporation = prop.getProperty("StateOfIncorporation");

        String name = prop.getProperty("AuthName");
        String add1 = prop.getProperty("Add1");
        String add2 = prop.getProperty("Add2");
        String title = prop.getProperty("Title");
        String country = prop.getProperty("Country");
        String city = prop.getProperty("City");

        String remarks = prop.getProperty("Remarks");
        String entrydate = prop.getProperty("EntryDate");
        String upload = prop.getProperty("Upload");


        partner.CompanyLegal(companylegal);
        partner.Nickname(nickname);
        partner.Industry(industry);
        partner.CompanyType(companytype);
        partner.Ticker(ticker);
        partner.Prospectus();
        partner.DateOfFormation(corporatedate);
        partner.StateOfIncorporation(stateofincorporation);
        partner.Authorized();
        partner.AuthorizedName(name);
        partner.Address1(add1);
        partner.Address2(add2);
        partner.Title(title);
        partner.Country(country);
        partner.City(city);
        // partner.AuthorizedPlus();
        partner.FinanceTab();
        partner.remarks(remarks);
        partner.entrydate(entrydate);
        partner.Upload(upload);

        partner.CorporateDocTab();
        partner.remarks(remarks);
        partner.entrydate(entrydate);
        partner.Upload(upload);

        partner.PoliciesTab();
        partner.remarks(remarks);
        partner.entrydate(entrydate);
        partner.Upload(upload);
    }

    @When("Enter the Corporate details with mandatory fields")
    public void enter_the_corporate_details_with_mandatory_fields() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/partner.properties");

        String companylegal = prop.getProperty("CompanyLegal");
        String nickname = prop.getProperty("Nickname");
        String industry = prop.getProperty("Industry");
        String companytype = prop.getProperty("CompanyType");
        String ticker = prop.getProperty("Ticker");
        String corporatedate = prop.getProperty("DateOfFormation");
        String stateofincorporation = prop.getProperty("StateOfIncorporation");

        String name = prop.getProperty("AuthName");
        String add1 = prop.getProperty("Add1");
        String add2 = prop.getProperty("Add2");
        String title = prop.getProperty("Title");
        String country = prop.getProperty("Country");
        String city = prop.getProperty("City");

        partner.CompanyLegal(companylegal);
        partner.Nickname(nickname);
        partner.Industry(industry);
        partner.CompanyType(companytype);
        partner.Ticker(ticker);
        partner.Prospectus();
        partner.DateOfFormation(corporatedate);
        partner.StateOfIncorporation(stateofincorporation);
        partner.Authorized();
        partner.AuthorizedName(name);
        partner.Address1(add1);
        partner.Address2(add2);
        partner.Title(title);
        partner.Country(country);
        partner.City(city);

    }
    @Given("Click on the Existing Partner - Tax")
    public void click_on_the_existing_partner_tax() throws Exception {
        partner.PartnerEditTax();

    }


    @When("Enter the Tax & Statements & Confirms details with All fields")
    public void enter_the_tax_statements_confirms_details_with_all_fields() throws Exception {

        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/partner.properties");

        String taxid = prop.getProperty("TaxId");
        String controlcode = prop.getProperty("ControlCode");
        String contactname = prop.getProperty("ContactName");
        String contacttitle = prop.getProperty("ContactTitle");
        String contactphone = prop.getProperty("ContactPhone");
        String statfooter = prop.getProperty("StatementFooter");
        String statdisclaimer = prop.getProperty("StatementDisclaimer");
        String confooter = prop.getProperty("ConfirmsFooter");
        String condisclaimer = prop.getProperty("ConfirmsDisclaimer");
        String upload = prop.getProperty("Uploadtax");


        partner.TaxId(taxid);
        partner.TaxCode(controlcode);
        partner.ContactName(contactname);
        partner.ContactTitle(contacttitle);
        partner.ContactPhone(contactphone);
        partner.StatementFooter(statfooter);
        partner.StatementDisclaimer(statdisclaimer);
        partner.ConfimrsFooter(confooter);
        partner.ConfirmsDisclaimer(condisclaimer);
        partner.Upload(upload);


    }
    @When("Enter the Tax & Statements & Confirms details with mandatory fields")
    public void enter_the_tax_statements_confirms_details_with_mandatory_fields() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/partner.properties");

        String taxid = prop.getProperty("TaxId");
        String controlcode = prop.getProperty("ControlCode");
        String contactname = prop.getProperty("ContactName");
        String contacttitle = prop.getProperty("ContactTitle");
        String contactphone = prop.getProperty("ContactPhone");
        String statfooter = prop.getProperty("StatementFooter");
        String statdisclaimer = prop.getProperty("StatementDisclaimer");
        String confooter = prop.getProperty("ConfirmsFooter");
        String condisclaimer = prop.getProperty("ConfirmsDisclaimer");
        String upload = prop.getProperty("Uploadtax");


        partner.TaxId(taxid);
        partner.TaxCode(controlcode);
        partner.ContactName(contactname);
        partner.ContactTitle(contacttitle);
        partner.ContactPhone(contactphone);
        partner.StatementFooter(statfooter);
        partner.StatementDisclaimer(statdisclaimer);
        partner.ConfimrsFooter(confooter);
        partner.ConfirmsDisclaimer(condisclaimer);



    }


    @Given("Click on the Existing Partner - Onboarding")
    public void click_on_the_existing_partner_onboarding() throws Exception {
        partner.PartnerEditOnboarding();
    }

    @When("Enter the Onboarding and Funding details with All fields")
    public void enter_the_onboarding_and_funding_details_with_all_fields() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/partner.properties");

        String typeofkyc = prop.getProperty("TypeOfKyc");
        String offeringtype = prop.getProperty("OfferingType");
        String rebalance = prop.getProperty("Rebalance");
        String permitted = prop.getProperty("Permitted");
        String accountTypes = prop.getProperty("AccountTypes");
        String cashmanagement = prop.getProperty("CashManagement");
        String tradingtypes = prop.getProperty("TradingTypes");
        String freqtime = prop.getProperty("FreqTime");


        String local = prop.getProperty("LocalPartner");
        String net = prop.getProperty("NetSettlement");
        String money = prop.getProperty("MoneyMovement");
        String payment = prop.getProperty("PaymentVendor");
        String api = prop.getProperty("ApiStatement");
        String funding = prop.getProperty("FundingTypes");

        String listtype = prop.getProperty("ListType");
        String groupname = prop.getProperty("GroupName");

        String upload = prop.getProperty("Upload");

        partner.CipReliance();
        partner.TypeOfKyc(typeofkyc);
        partner.OfferingType(offeringtype);
        partner.RebalanceFrequency(rebalance);
        partner.Permitted(permitted);
        partner.AccountTypes(accountTypes);
        partner.CashManagement(cashmanagement);
        partner.TradingTypes(tradingtypes);
        partner.FreTime(freqtime);
        partner.specAlloy();
        partner.KycDoc();
        partner.PartOfSecurity();

        partner.Upload(upload);

        partner.licensed();
        partner.LocalPartner(local);
        partner.NetSettlement(net);
        partner.MoneyMovement(money);
        partner.PaymentVendor(payment);
        partner.InstantBuying();
        partner.ApiStatement(api);
        partner.Fundingtypes(funding);
        partner.EnableVirtual();
        partner.ListType(listtype);
        partner.InstrumentGroupName(groupname);
    }

    @When("Enter the Onboarding and Funding details with mandatory fields")
    public void enter_the_onboarding_and_funding_details_with_mandatory_fields() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/partner.properties");

        String typeofkyc = prop.getProperty("TypeOfKyc");
        String offeringtype = prop.getProperty("OfferingType");
        String rebalance = prop.getProperty("Rebalance");
        String permitted = prop.getProperty("Permitted");
        String accountTypes = prop.getProperty("AccountTypes");
        String cashmanagement = prop.getProperty("CashManagement");
        String tradingtypes = prop.getProperty("TradingTypes");
        String freqtime = prop.getProperty("FreqTime");


        String local = prop.getProperty("LocalPartner");
        String net = prop.getProperty("NetSettlement");
        String money = prop.getProperty("MoneyMovement");
        String payment = prop.getProperty("PaymentVendor");
        String api = prop.getProperty("ApiStatement");
        String funding = prop.getProperty("FundingTypes");

        String listtype = prop.getProperty("ListType");
        String groupname = prop.getProperty("GroupName");


        partner.CipReliance();
        partner.TypeOfKyc(typeofkyc);
        partner.OfferingType(offeringtype);
        partner.RebalanceFrequency(rebalance);
        partner.Permitted(permitted);
        partner.AccountTypes(accountTypes);
        partner.CashManagement(cashmanagement);
        partner.TradingTypes(tradingtypes);
        partner.FreTime(freqtime);
        partner.specAlloy();
        partner.KycDoc();
        partner.PartOfSecurity();


        partner.licensed();
        partner.LocalPartner1(local);
        partner.NetSettlement1(net);
        partner.MoneyMovement1(money);
        partner.PaymentVendor1(payment);
        partner.InstantBuying();
        partner.ApiStatement1(api);

        partner.EnableVirtual();


    }



    @When("Enter the Risk Compliance details with All fields")
    public void enter_the_risk_compliance_details_with_all_fields() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/partner.properties");

        String reporting = prop.getProperty("Reporting");
        String trading = prop.getProperty("TradingLimit");
        String funding = prop.getProperty("FundingLimit");
        String line = prop.getProperty("LineOfCredit");
        String initial = prop.getProperty("InitialClearing");
        String partnerrate = prop.getProperty("PartnerRate");
        String billing = prop.getProperty("BillingRoll");
        String acats = prop.getProperty("AcatsFee");
        String upload = prop.getProperty("Upload");
        partner.catReporting();
        partner.Reporting(reporting);
        partner.TradingLimit(trading);
        partner.FundingLimit(funding);
        partner.LineOfCredit(line);
        partner.InitialClearing(initial);
        partner.PartnerRate(partnerrate);
        partner.BillingRoll(billing);
        partner.AcatsFee(acats);
        partner.Upload(upload);
    }


    @When("Enter the Risk Compliance details with mandatory fields")
    public void enter_the_risk_compliance_details_with_mandatory_fields() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/partner.properties");

        String reporting = prop.getProperty("Reporting");
        String trading = prop.getProperty("TradingLimit");
        String funding = prop.getProperty("FundingLimit");
        String line = prop.getProperty("LineOfCredit");
        String initial = prop.getProperty("InitialClearing");
        String partnerrate = prop.getProperty("PartnerRate");
        String billing = prop.getProperty("BillingRoll");
        String acats = prop.getProperty("AcatsFee");
        partner.catReporting();
        partner.Reporting(reporting);
        partner.TradingLimit(trading);
        partner.FundingLimit(funding);
        partner.LineOfCredit(line);
        partner.InitialClearing(initial);
        partner.PartnerRate(partnerrate);
        partner.BillingRoll(billing);
        partner.AcatsFee(acats);
    }
    @Given("Click on the Existing Partner - Risk")
    public void click_on_the_existing_partner_risk() throws Exception {
        partner.PartnerEditRisk();

    }

    @Then("Check whether Partner is created in the List Screen")
    public void check_whether_partner_id_is_created_in_the_list_screen() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/partner.properties");
        String code = prop.getProperty("PartnerCode");

        partner.verifyPartnerTableList(code);

    }
    @Then("Check whether Partner code is created in the List Screen")
    public void check_whether_partner_code_is_created_in_the_list_screen() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/partner.properties");
        String code = prop.getProperty("PartnerCode");

        partner.verifyPartnerCode(code);
    }

    @When("Enter the Search Keyword")
    public void enter_the_search_keyword() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/partner.properties");
        String partnercode = prop.getProperty("PartnerCode");
        partner.enterInSearchBox(partnercode);
    }

    @Given("click on the Partner filter button")
    public void click_on_the_partner_filter_button() throws Exception {
        partner.PartnerFilter();

    }

    @When("Click on Partner Filter Search Button")
    public void click_on_partner_filter_search_button() throws Exception {
        partner.FilterSearch();

    }

    @When("enter the Mpid and Alert Acronym")
    public void enter_the_mpid_and_alert_acronym() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/partner.properties");
        String mpid = prop.getProperty("MPID");
        String alert = prop.getProperty("AlertAcronym");

        partner.filterMpid(mpid);
        partner.filterAlert(alert);

    }

    @When("Check whether Mpid and Alert are displayed in the List Screen")
    public void check_whether_mpid_and_alert_are_displayed_in_the_list_screen() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/partner.properties");
        String mpid = prop.getProperty("MPID");
        String alert = prop.getProperty("AlertAcronym");

        partner.verifyMpid(mpid);
        partner.verifyAlert(alert);

    }
    @When("Check whether Partner Code is displayed in the List Screen")
    public void check_whether_partner_code_is_displayed_in_the_list_screen() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/partner.properties");

        String code = prop.getProperty("PartnerCode");
        partner.verifyPartnerCode(code);

    }


    @When("Check whether Partner name is displayed in the List Screen")
    public void check_whether_partner_name_is_displayed_in_the_list_screen() throws Exception {

        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/partner.properties");

        String name = prop.getProperty("PartnerName");
        partner.verifyPartnerName(name);

    }


    @When("Check whether Company is displayed in the List Screen")
    public void check_whether_company_is_displayed_in_the_list_screen() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/partner.properties");

        String company = prop.getProperty("Company");
        partner.verifyCompany(company);

    }


    @When("Check whether Mpid is displayed in the List Screen")
    public void check_whether_mpid_is_displayed_in_the_list_screen() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/partner.properties");

        String mpid = prop.getProperty("MPID");
        partner.verifyMpid(mpid);

    }


    @When("Check whether Alert is displayed in the List Screen")
    public void check_whether_alert_is_displayed_in_the_list_screen() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/partner.properties");

        String alert = prop.getProperty("AlertAcronym");
        partner.verifyAlert(alert);

    }


    @When("Check whether Fin Doc is displayed in the List Screen")
    public void check_whether_fin_doc_is_displayed_in_the_list_screen() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/partner.properties");

        String fin = prop.getProperty("FinDate");
        partner.verifyFinDoc(fin);

    }


    @When("Check whether Oasys Id is displayed in the List Screen")
    public void check_whether_oasys_id_is_displayed_in_the_list_screen() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/partner.properties");

        String oasys = prop.getProperty("OasysId");
        partner.verifyOasysID(oasys);

    }

    @When("Check whether Tax Id is displayed in the List Screen")
    public void check_whether_tax_id_is_displayed_in_the_list_screen() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/partner.properties");

        String tax = prop.getProperty("TaxId");
        partner.verifyTaxID(tax);
    }

    @When("enter the Partner Code")
    public void enter_the_partner_code() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/partner.properties");
        String partnercode = prop.getProperty("PartnerCode");
        partner.filterPartnercode(partnercode);

    }

    @When("enter Partner Name")
    public void enter_partner_name() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/partner.properties");
        String partnername = prop.getProperty("PartnerName");
        partner.filterPartnername(partnername);

    }

    @When("enter the Company")
    public void enter_the_company() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/partner.properties");
        String partnercompany = prop.getProperty("Company");
        partner.filterPartnerCompany(partnercompany);

    }

    @When("enter the Mpid")
    public void enter_the_mpid() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/partner.properties");
        String mpid = prop.getProperty("MPID");
        partner.filterMpid(mpid);

    }
    @When("enter the Alert acronym")
    public void enter_the_alert_acronym() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/partner.properties");
        String alert = prop.getProperty("AlertAcronym");
        partner.filterAlert(alert);

    }
    @When("enter the Fin Doc Date")
    public void enter_the_fin_doc_date() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/partner.properties");
        String fin = prop.getProperty("FinDate");
        partner.filterFindate(fin);

    }
    @When("enter the Oasys Id")
    public void enter_the_oasys_id() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/partner.properties");
        String oasys = prop.getProperty("OasysId");
        partner.filterOasysid(oasys);

    }
    @When("enter the Tax Id")
    public void enter_the_tax_id() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/partner.properties");
        String tax= prop.getProperty("TaxId");
        partner.filterTaxid(tax);

    }

    @Given("Click on the Existing Partner - Partner Id")
    public void click_on_the_existing_partner_partner_id() throws Exception {
        partner.PartnerIDEdit();
    }

    @When("Edit the Partner Id details")
    public void edit_the_partner_id_details() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/partner.properties");

        String partnerid = prop.getProperty("PartnerID1");
        String partnercode = prop.getProperty("PartnerCode1");
        String company = prop.getProperty("Company1");
        String status = prop.getProperty("Status1");
        String parentibid = prop.getProperty("ParentIBID1");
        String partnername = prop.getProperty("PartnerName1");
        String region = prop.getProperty("Region1");

        String regtype = prop.getProperty("RegistrationType1");
        String mpid = prop.getProperty("MPID1");
        String dtcpass = prop.getProperty("DTCPassword1");
        String partnum = prop.getProperty("PartnerNumber1");
        String finum = prop.getProperty("FinraNum1");
        String secnum = prop.getProperty("SecNum1");
        String alertcd = prop.getProperty("AlertCD1");
        String oasys = prop.getProperty("OasysCD1");
        String bic = prop.getProperty("BicCD1");
        String institutional = prop.getProperty("InstitutionalID1");

        String production = prop.getProperty("Productionkeys1");
        String commercial = prop.getProperty("CommercialLaunch1");
        String contract = prop.getProperty("ContractTerm1");
        String apitype = prop.getProperty("ApiType1");

        partner.partnerid(partnerid);
        partner.partnercode(partnercode);
        partner.Company(company);
        partner.Status(status);
        partner.ParentIBID(parentibid);
        partner.partnername(partnername);
        partner.region(region);

        partner.registrationtype(regtype);
        partner.mpid(mpid);
        partner.dtcpassword(dtcpass);
        partner.partnernumber(partnum);
        partner.finranum(finum);
        partner.secnum(secnum);
        partner.alertcd(alertcd);
        partner.oasysid(oasys);
        partner.bicid(bic);
        partner.institutionalid(institutional);

        partner.productionkey(production);
        partner.commerciallaunch(commercial);
        partner.contractTerm(contract);
        partner.usingevent();
        partner.usinglegacy();
        partner.Apitype(apitype);


    }

    @When("user enter  {string}  in Partner search box")
    public void user_enter_in_partner_search_box(String string) throws Exception {
        partner.enterNoDataInSearchBox(string);
    }


    @When("user should able to view {string} in Partner table list screen")
    public void user_should_able_to_view_in_partner_table_list_screen(String string) throws Exception {
        partner.verifyNoDataDisplayed(string);

    }
    @Then("{string} edit validation message should be displayed on Partner screen")
    public void edit_validation_message_should_be_displayed_on_partner_screen(String string) throws Exception {
        partner.verifyValidationMessaeWithText("has been saved successfully!");
    }
    @Given("click on the Export Button check whether the Partner List is downloaded")
    public void click_on_the_export_button_check_whether_the_partner_list_is_downloaded() throws Exception {
        partner.Export();
    }
    
    
    
    
    
    //YAkshana
    
    
    
    
    
    
}