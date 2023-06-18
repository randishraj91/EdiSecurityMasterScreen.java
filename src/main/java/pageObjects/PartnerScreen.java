package pageObjects;

import baseMethods.BaseLibrary;
import baseMethods.DataDrivenUtility;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;

import java.io.IOException;
import java.util.Random;

public class PartnerScreen {

    public static String Pub_Partner = "";
    public static String Pub_PartnerCode = "";
    public static DataDrivenUtility dd = null;
    public String dataSheetPath = System.getProperty("user.dir") + "/src/test/resources/testFiles/TestData.xlsx";
    By systemMaster1 = By.xpath("//*[@id='simple-menu']/ul/li[2]/em");
    By systemMaster = By.xpath("//*[@id='simple-menu']/ul/li[1]/em");
    By navigatePartner = By.xpath("//ul[@class='sub-menu-list']//li//a[text()='Partner']");
    By addNewPartner = By.xpath("//*[text()='Add New Partner']");

    //Partner Identifiers
    By PartnerId = By.xpath("//input[@class]");
    By PartnerCode = By.xpath("//input[@class]//following::input[1]");
    By company = By.xpath("//input[@class]//following::input[2]");
    By status = By.xpath("//input[@class]//following::input[3]");
    By parentIBID = By.xpath("//input[@class]//following::input[4]");
    By PartnerName = By.xpath("//input[@class]//following::input[5]");
    By Region = By.xpath("//input[@class]//following::input[6]");

    // Partner Registration
    By RegistrationType = By.xpath("//input[@class]//following::input[7]");
    By Mpid = By.xpath("//input[@class]//following::input[8]");
    By Dtcpassword = By.xpath("//input[@class]//following::input[9]");
    By Partnernumber = By.xpath("//input[@class]//following::input[10]");
    By Finranum = By.xpath("//input[@class]//following::input[11]");
    By SecNum = By.xpath("//input[@class]//following::input[12]");
    By Alertcd = By.xpath("//input[@class]//following::input[13]");
    By Oasysid = By.xpath("//input[@class]//following::input[14]");
    By Bicid = By.xpath("//input[@class]//following::input[15]");
    By Institutionalid = By.xpath("//input[@class]//following::input[16]");

    // Integration Details
    By ProductionKeys = By.xpath("//input[@class]//following::input[17]");
    By CommercialLaunch = By.xpath("//input[@class]//following::input[18]");
    By ContractTerm = By.xpath("//input[@class]//following::input[19]");

    By ApiType = By.xpath("//input[@class]//following::input[20]");
    By Usingevent = By.xpath("//button[@value='Yes']");
    By Usinglegacy = By.xpath("//button[@value='Yes']//following::button[2]");

    //Integration Mandatory
    By ProductionKeys1 = By.xpath("//input[@class]//following::input[18]");
    By CommercialLaunch1 = By.xpath("//input[@class]//following::input[19]");
    By ContractTerm1 = By.xpath("//input[@class]//following::input[20]");
    By ApiType1 = By.xpath("//input[@class]//following::input[21]");

    // Corporate Details
    By CorporateTab= By.xpath("//span[text()='Corporate']");
    By companylegal = By.xpath("//input[@class]");
    By nickname = By.xpath("//input[@class]//following::input[1]");
    By industry = By.xpath("//input[@class]//following::input[2]");
    By companytype = By.xpath("//input[@class]//following::input[3]");
    By ticker = By.xpath("//input[@class]//following::input[4]");
    By prospectus = By.xpath("//button[@value='No']");
    By dateofformation = By.xpath("//input[@class]//following::input[5]");
    By stateofincorporation = By.xpath("//input[@class]//following::input[6]");

    // Authorized Users
    By authorized = By.xpath("//*[@type='checkbox']");
    By name = By.xpath("//input[@class]//following::input[8]");
    By address1 = By.xpath("//input[@class]//following::input[9]");
    By address2 = By.xpath("//input[@class]//following::input[10]");
    By title = By.xpath("//input[@class]//following::input[11]");
    By country = By.xpath("//input[@class]//following::input[12]");
    By city = By.xpath("//input[@class]//following::input[13]");
    By plusicon = By.xpath("//*[@class='add-new-row']");
    By deleteicon  = By.xpath("//*[@src='/assets/img/trash.png']");

    // Corporate Documents
    By FinanceTab= By.xpath("//span[text()='Financial Documents']");
    By remarks1 = By.xpath("//textarea[@class]");
    By entrydate1 = By.xpath("//input[@class]//following::input[16]");

    By CorporateDocTab= By.xpath("//span[text()='Corporate Documents']");

    By PoliciesTab= By.xpath("//span[text()='Policies']");

    // Tax & Statements & Confirms

    By TaxTab= By.xpath("//span[text()='Tax & Statements & Confirms']");
    By TaxId = By.xpath("//input[@class]");
    By IrsTaxCode = By.xpath("//input[@class]//following::input[1]");
    By IrsName = By.xpath("//input[@class]//following::input[2]");
    By IrsTitle = By.xpath("//input[@class]//following::input[3]");
    By IrsPhone = By.xpath("//input[@class]//following::input[4]");
    By statementFooter = By.xpath("//textarea[@class]");
    By statementDisclaimer = By.xpath("//textarea[@class]//following::textarea[2]");
    By confirmsFooter = By.xpath("//textarea[@class]//following::textarea[4]");
    By confirmsDisclaimer = By.xpath("//textarea[@class]//following::textarea[6]");
    By upload = By.xpath("//input[@type='file']");


    // OnBoarding & Funding

    By OnboardingTab= By.xpath("//span[text()='OnBoarding & Funding']");
    By CipReliance = By.xpath("//button[@value='No']");
    By typeofKyc = By.xpath("//input[@class]");
    By offeringtype = By.xpath("//input[@class]//following::input[1]");
    By offervalue= By.xpath("//*[@data-value='HSA']");
    By rebalance = By.xpath("//input[@class]//following::input[2]");
    By permitted = By.xpath("//input[@class]//following::input[3]");
    By accountTypes = By.xpath("//input[@class]//following::input[4]");
    By accountvalue= By.xpath("//*[@data-value='CASH']");
    By cashmanagement = By.xpath("//input[@class]//following::input[5]");
    By tradingTypes = By.xpath("//input[@class]//following::input[6]");
    By freqTime = By.xpath("//input[@class]//following::input[7]");
    By specialAlloy = By.xpath("//button[@value='Yes']//following::button[13]");
    By kycDoc = By.xpath("//button[@value='Yes']//following::button[15]");
    By partOfSecurity = By.xpath("//button[@value='Yes']//following::button[17]");


    // Funding Details
    By licensed = By.xpath("//button[@value='Yes']//following::button[20]");
    By localPartner = By.xpath("//input[@class]//following::input[8]");
    By netSettlement = By.xpath("//input[@class]//following::input[9]");
    By moneyMovement = By.xpath("//input[@class]//following::input[10]");
    By moneyvalue= By.xpath("//*[@data-value='Wire']");
    By PaymentVendor = By.xpath("//input[@class]//following::input[11]");
    By instantBuying = By.xpath("//button[@value='Yes']//following::button[28]");
    By apiStatement = By.xpath("//input[@class]//following::input[12]");
    By fundingTypes = By.xpath("//input[@class]//following::input[13]");
    By enableVirtual = By.xpath("//button[@value='Yes']//following::button[32]");

    // Funding Mandatory

    By localPartner1 = By.xpath("//input[@class]//following::input[9]");
    By netSettlement1 = By.xpath("//input[@class]//following::input[10]");
    By moneyMovement1 = By.xpath("//input[@class]//following::input[11]");
    By PaymentVendor1 = By.xpath("//input[@class]//following::input[12]");
    By apiStatement1 = By.xpath("//input[@class]//following::input[13]");


    // Instrument group
    By listType = By.xpath("//input[@class]//following::input[14]");
    By instrumentGroupName = By.xpath("//input[@class]//following::input[15]");
    By instrumentvalue= By.xpath("//*[@data-value='creative names are cool!']");

    // Risk Compliance Details
    By RiskTab= By.xpath("//span[text()='Risk compliance & Billing']");
    By catReporting = By.xpath("//button[@value='No']");
    By reporting = By.xpath("//input[@class]");
    By tradinglimit = By.xpath("//input[@class]//following::input[1]");
    By fundinglimit = By.xpath("//input[@class]//following::input[2]");
    By lineofcredit= By.xpath("//input[@class]//following::input[3]");
    By initialclearing = By.xpath("//input[@class]//following::input[4]");
    By partnerrate = By.xpath("//input[@class]//following::input[5]");
    By billingroll = By.xpath("//input[@class]//following::input[6]");
    By acatsfee = By.xpath("//input[@class]//following::input[7]");

    // Buttons
    By button_Save = By.xpath("//*[text()='Save']");
    By button_Save_No = By.xpath("//span[text()='No, Proceed']");
    By button_Save_Yes = By.xpath("//span[text()='Yes, go back']");

    By button_cancel= By.xpath("//*[text()='Cancel']");
    By cancel_yes =By.xpath("//span[text()='Yes, go back']");
    By cancel_No =By.xpath("//span[text()='No, Proceed']");

    // Global Search
    By searchPartner = By.xpath("//input[@id='outlined-basic']");
    By searchIcon = By.xpath("//i[@class='search-icon']");

    // filter
    By partnerfilter= By.xpath("//span[text()='Filter By']");
    By filterpartnercode= By.id("filter_code");
    By filterpartnername= By.id("filter_name");
    By filtercompany= By.id("filter_company");
    By filtermpid= By.id("filter_mpid");
    By filteralert= By.id("filter_alertCd");
    By filterfin= By.id("filter_finDocRenewelDate");
    By filteroasys= By.id("filter_oasysCd");
    By filtertaxid= By.id("filter_taxId");

    By filtersearch= By.xpath("//span[text()='Search']");
    By filterreset= By.xpath("//span[text()='Reset']");

    //Edit
    By PartnerEditclick= By.xpath("//*[@class='MuiTableCell-root MuiTableCell-body link  MuiTableCell-sizeSmall']");
    By textTooVerify = By.xpath("//*[contains(text(),'Settlement Rule has been created successfully!')]");
    By taxList = By.xpath("//em[text()='Tax ID']");
    By partnerList = By.xpath("//em[text()='Partner Name']");
    By noDataOnTable = By.xpath("//*[contains(text(),'No data found')]");

    By editMessage =   By.xpath("//*[contains(text(),'has been saved successfully!')]");
    By closeValidation = By.xpath("//*[@title='Close']");
    By exportlink =   By.xpath("//*[@class='MuiSvgIcon-root']");
    By exportbutton =   By.xpath("//li[@role='menuitem']");

    public void verifyValidationMessage() throws Exception {

        BaseLibrary.verifyText(textTooVerify,"Settlement Rule has been created successfully!");
    }


    public void clickSystemMaster() throws Exception {

        BaseLibrary.waitAndClickElementsUsingByLocator(systemMaster);
        BaseLibrary.SetWaitTime(1000);
        BaseLibrary.waitAndClickElement(navigatePartner);
    }
    public void addNewPartner() throws Exception {

        BaseLibrary.waitAndClickElementsUsingByLocator(addNewPartner);
        BaseLibrary.SetWaitTime(1000);

    }

    public void configDD() throws IOException {

    }

    public void partnerid(String textToSent) throws Exception {
        //BaseLibrary.clearText(PartnerId);
       // BaseLibrary.sendKeysToWebElement(PartnerId, textToSent);
        if (textToSent.contentEquals("Random_PartnerId")) {
            BaseLibrary.clearText(PartnerId);
            Random random = new Random();
            int y = random.nextInt(10000);
            textToSent = Integer.toString(y);
            BaseLibrary.sendKeysToWebElement(PartnerId, textToSent);
            dd = new DataDrivenUtility();
            dd.setExcelFile(dataSheetPath,"Partner");
            dd.setCellValue(1,1,textToSent,dataSheetPath);

        } else {
            BaseLibrary.clearText(PartnerId);
            BaseLibrary.sendKeysToWebElement(PartnerId, textToSent);
        }
    }
    public void partnercode(String textToSent) throws Exception {
        if (textToSent.contentEquals("Random_PartnerCode")) {
            BaseLibrary.setFocusToElement(PartnerCode);
            Random random = new Random();
            int y = random.nextInt(500000);
            textToSent = Integer.toString(y);
            BaseLibrary.sendKeysToWebElement(PartnerCode, textToSent);
            dd.setCellValue(2,1,textToSent,dataSheetPath);
        } else {
            BaseLibrary.clearText(PartnerCode);
            BaseLibrary.sendKeysToWebElement(PartnerCode, textToSent);
        }
    }
    public void Company(String textToSent) throws Exception {
      //  BaseLibrary.clearText(company);
       // BaseLibrary.clickOnTextFromDropdownList(company, textToSent);
        if (textToSent.contentEquals("Random_Company")) {
            BaseLibrary.clearText(company);

            textToSent = getCompanyName();
            BaseLibrary.clickOnTextFromDropdownList(company, textToSent);
        } else {
            BaseLibrary.clearText(company);
            BaseLibrary.clickOnTextFromDropdownList(company, textToSent);
        }

    }

    private String getCompanyName() throws IOException {
        dd = new DataDrivenUtility();
        dd.setExcelFile(dataSheetPath,"Company");
        String rdata = dd.getCellData(1,1);
        return rdata;

    }

    public void Status(String textToSent) throws Exception {
        BaseLibrary.clearText(status);
        BaseLibrary.clickOnTextFromDropdownList(status, textToSent);

    }
    public void ParentIBID(String textToSent) throws Exception {
        BaseLibrary.clearText(parentIBID);
        BaseLibrary.sendKeysToWebElement(parentIBID, textToSent);

    }
    public void partnername(String textToSent) throws Exception {
       // BaseLibrary.clearText(PartnerName);
      //  BaseLibrary.sendKeysToWebElement(PartnerName, textToSent);
        if (textToSent.contentEquals("Random_PartnerName")) {
            String generatedString = RandomStringUtils.randomAlphabetic(8);
            textToSent = "Part" + generatedString;
            BaseLibrary.clearText(PartnerName);
            BaseLibrary.sendKeysToWebElement(PartnerName, textToSent);
            dd = new DataDrivenUtility();
            dd.setExcelFile(dataSheetPath,"Partner");
            dd.setCellValue(3,1,textToSent,dataSheetPath);

        } else {
            BaseLibrary.clearText(PartnerName);
            BaseLibrary.sendKeysToWebElement(PartnerName, textToSent);

        }

    }
    public void region(String textToSent) throws Exception {
        BaseLibrary.clearText(Region);
        BaseLibrary.clickOnTextFromDropdownList(Region, textToSent);

    }

    /* Partner Registration */

    public void registrationtype(String textToSent) throws Exception {
        BaseLibrary.clearText(RegistrationType);
        BaseLibrary.clickOnTextFromDropdownList(RegistrationType, textToSent);

    }

    public void mpid(String textToSent) throws Exception {
        BaseLibrary.clearText(Mpid);
        BaseLibrary.sendKeysToWebElement(Mpid, textToSent);
    }

    public void dtcpassword(String textToSent) throws Exception {
        BaseLibrary.clearText(Dtcpassword);
        BaseLibrary.sendKeysToWebElement(Dtcpassword, textToSent);
    }

    public void partnernumber(String textToSent) throws Exception {
        BaseLibrary.clearText(Partnernumber);
        BaseLibrary.sendKeysToWebElement(Partnernumber, textToSent);
    }

    public void finranum(String textToSent) throws Exception {
        BaseLibrary.clearText(Finranum);
        BaseLibrary.sendKeysToWebElement(Finranum, textToSent);
    }

    public void secnum(String textToSent) throws Exception {
        BaseLibrary.clearText(SecNum);
        BaseLibrary.sendKeysToWebElement(SecNum, textToSent);
    }

    public void alertcd(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(Alertcd);
        BaseLibrary.clearText(Alertcd);
        BaseLibrary.sendKeysToWebElement(Alertcd, textToSent);
    }

    public void oasysid(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(Oasysid);
        BaseLibrary.clearText(Oasysid);
        BaseLibrary.sendKeysToWebElement(Oasysid, textToSent);
    }

    public void bicid(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(Bicid);
        BaseLibrary.clearText(Bicid);
        BaseLibrary.sendKeysToWebElement(Bicid, textToSent);
    }

    public void institutionalid(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(Institutionalid);
        BaseLibrary.clearText(Institutionalid);
        BaseLibrary.sendKeysToWebElement(Institutionalid, textToSent);
    }

    /* Institutional ID */

    public void productionkey(String textToSent) throws Exception {

        BaseLibrary.setFocusToElement(ProductionKeys);
        BaseLibrary.clearText(ProductionKeys);
        BaseLibrary.sendKeysToWebElement(ProductionKeys, textToSent);
    }

    public void commerciallaunch(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(CommercialLaunch);
        BaseLibrary.clearText(CommercialLaunch);
        BaseLibrary.sendKeysToWebElement(CommercialLaunch, textToSent);
    }

    public void contractTerm(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(ContractTerm);
        BaseLibrary.clearText(ContractTerm);
        BaseLibrary.sendKeysToWebElement(ContractTerm, textToSent);
    }


    public void Apitype(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(ApiType);
        BaseLibrary.clearText(ApiType);
        BaseLibrary.clickOnTextFromDropdownList(ApiType, textToSent);

    }

    public void usingevent() throws Exception {
        BaseLibrary.setFocusToElement(Usingevent);
        BaseLibrary.waitAndClickElementsUsingByLocator(Usingevent);

    }

    public void usinglegacy() throws Exception {
        BaseLibrary.setFocusToElement(Usinglegacy);
        BaseLibrary.waitAndClickElementsUsingByLocator(Usinglegacy);

    }

    //Integration Mandatory

    public void productionkey1(String textToSent) throws Exception {

        BaseLibrary.setFocusToElement(ProductionKeys1);
        BaseLibrary.clearText(ProductionKeys1);
        BaseLibrary.sendKeysToWebElement(ProductionKeys1, textToSent);
    }

    public void commerciallaunch1(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(CommercialLaunch1);
        BaseLibrary.clearText(CommercialLaunch1);
        BaseLibrary.sendKeysToWebElement(CommercialLaunch1, textToSent);
    }

    public void contractTerm1(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(ContractTerm1);
        BaseLibrary.clearText(ContractTerm1);
        BaseLibrary.sendKeysToWebElement(ContractTerm1, textToSent);
    }


    public void Apitype1(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(ApiType1);
        BaseLibrary.clearText(ApiType1);
        BaseLibrary.clickOnTextFromDropdownList(ApiType1, textToSent);

    }

    //Corporate Details
    public void CompanyLegal(String textToSent) throws Exception {
        BaseLibrary.clearText(companylegal);
        BaseLibrary.sendKeysToWebElement(companylegal, textToSent);

    }

    public void Nickname(String textToSent) throws Exception {
        BaseLibrary.clearText(nickname);
        BaseLibrary.sendKeysToWebElement(nickname, textToSent);

    }

    public void Industry(String textToSent) throws Exception {
        BaseLibrary.clearText(industry);
        BaseLibrary.clickOnTextFromDropdownList(industry, textToSent);

    }

    public void CompanyType(String textToSent) throws Exception {
        BaseLibrary.clearText(companytype);
        BaseLibrary.clickOnTextFromDropdownList(companytype, textToSent);

    }

    public void Ticker(String textToSent) throws Exception {
        BaseLibrary.clearText(ticker);
        BaseLibrary.sendKeysToWebElement(ticker, textToSent);
    }

    public void Prospectus() throws Exception {
        BaseLibrary.clearText(prospectus);
        BaseLibrary.waitAndClickElementsUsingByLocator(prospectus);

    }

    public void DateOfFormation(String textToSent) throws Exception {
        BaseLibrary.clearText(dateofformation);

        BaseLibrary.sendKeysToWebElement(dateofformation, textToSent);
    }
    public void StateOfIncorporation(String textToSent) throws Exception {
        BaseLibrary.clearText(stateofincorporation);
        BaseLibrary.clickOnTextFromDropdownList(stateofincorporation, textToSent);

    }

    // Authorized Users

    public void Authorized() throws Exception {
        BaseLibrary.setFocusToElement(authorized);
        BaseLibrary.waitAndClickElement(authorized);
    }

    public void AuthorizedName(String textToSent) throws Exception {
        BaseLibrary.clearText(name);
        BaseLibrary.sendKeysToWebElement(name, textToSent);
    }

    public void Address1(String textToSent) throws Exception {
        BaseLibrary.clearText(address1);
        BaseLibrary.sendKeysToWebElement(address1, textToSent);
    }

    public void Address2(String textToSent) throws Exception {
        BaseLibrary.clearText(address2);
        BaseLibrary.sendKeysToWebElement(address2, textToSent);
    }

    public void Title(String textToSent) throws Exception {
        BaseLibrary.clearText(title);
        BaseLibrary.sendKeysToWebElement(title, textToSent);
    }

    public void Country(String textToSent) throws Exception {
        BaseLibrary.SetWaitTime(1000);
        BaseLibrary.setFocusToElement(country);
        BaseLibrary.clearText(country);
        BaseLibrary.clickOnTextFromDropdownList(country, textToSent);

    }

    public void City(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(city);
        BaseLibrary.clearText(city);
        BaseLibrary.clickOnTextFromDropdownList(city, textToSent);
        BaseLibrary.SetWaitTime(2000);
    }

    public void AuthorizedPlus() throws Exception {

        BaseLibrary.waitAndClickElementsUsingByLocator(plusicon);
        BaseLibrary.SetWaitTime(1000);
    }

    //Corporate documents
    public void FinanceTab() throws Exception {

        BaseLibrary.setFocusToElement(FinanceTab);
        BaseLibrary.waitAndClickElementsUsingByLocator(FinanceTab);
        BaseLibrary.SetWaitTime(1000);
    }
    public void CorporateDocTab() throws Exception {
        BaseLibrary.SetWaitTime(5000);
        BaseLibrary.setFocusToElement(CorporateDocTab);
        BaseLibrary.waitAndClickElementsUsingByLocator(CorporateDocTab);
        BaseLibrary.SetWaitTime(1000);
    }
    public void PoliciesTab() throws Exception {

        BaseLibrary.setFocusToElement(PoliciesTab);
        BaseLibrary.waitAndClickElementsUsingByLocator(PoliciesTab);
        BaseLibrary.SetWaitTime(1000);
    }
    public void remarks(String textToSent) throws Exception {
        BaseLibrary.SetWaitTime(1000);
        BaseLibrary.setFocusToElement(remarks1);
        BaseLibrary.clearText(remarks1);
        BaseLibrary.sendKeysToWebElement(remarks1,textToSent);
        BaseLibrary.SetWaitTime(1000);
    }
    public void entrydate(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(entrydate1);
        BaseLibrary.clearText(entrydate1);
        BaseLibrary.sendKeysToWebElement(entrydate1,textToSent);
        BaseLibrary.SetWaitTime(1000);
    }
    // Tax & Statements & Confirms

    public void TaxId(String textToSent) throws Exception {

        BaseLibrary.sendKeysToWebElement(TaxId, textToSent);

    }

    public void TaxCode(String textToSent) throws Exception {

        BaseLibrary.sendKeysToWebElement(IrsTaxCode, textToSent);

    }

    public void ContactName(String textToSent) throws Exception {

        BaseLibrary.clickOnTextFromDropdownList(IrsName, textToSent);

    }

    public void ContactTitle(String textToSent) throws Exception {

        BaseLibrary.clickOnTextFromDropdownList(IrsTitle, textToSent);

    }

    public void ContactPhone(String textToSent) throws Exception {

        BaseLibrary.sendKeysToWebElement(IrsPhone, textToSent);
    }

    public void StatementFooter(String textToSent) throws Exception {

        BaseLibrary.sendKeysToWebElement(statementFooter,textToSent);

    }
    public void StatementDisclaimer(String textToSent) throws Exception {

        BaseLibrary.sendKeysToWebElement(statementDisclaimer,textToSent);

    }
    public void ConfimrsFooter(String textToSent) throws Exception {

        BaseLibrary.sendKeysToWebElement(confirmsFooter,textToSent);

    }
    public void ConfirmsDisclaimer(String textToSent) throws Exception {

        BaseLibrary.sendKeysToWebElement(confirmsDisclaimer,textToSent);

    }

    // Onborading and Funding

    public void CipReliance () throws Exception {

        BaseLibrary.waitAndClickElementsUsingByLocator(CipReliance);

    }
    public void TypeOfKyc(String textToSent) throws Exception {

        BaseLibrary.clickOnTextFromDropdownList(typeofKyc,textToSent);

    }
    public void OfferingType(String textToSent) throws Exception {
        BaseLibrary.actionMoveAndClickByLocator(offeringtype);
        BaseLibrary.waitAndClickElement(offervalue);
        BaseLibrary.actionMoveAndClickByLocator(rebalance);

    }
    public void RebalanceFrequency(String textToSent) throws Exception {

        BaseLibrary.clickOnTextFromDropdownList(rebalance,textToSent);

    }
    public void Permitted(String textToSent) throws Exception {

        BaseLibrary.clickOnTextFromDropdownList(permitted,textToSent);

    }
    public void AccountTypes(String textToSent) throws Exception {


        BaseLibrary.actionMoveAndClickByLocator(accountTypes);
        BaseLibrary.waitAndClickElement(accountvalue);
        BaseLibrary.actionMoveAndClickByLocator(cashmanagement);

    }
    public void CashManagement(String textToSent) throws Exception {

        BaseLibrary.clickOnTextFromDropdownList(cashmanagement,textToSent);

    }
    public void TradingTypes(String textToSent) throws Exception {

        BaseLibrary.clickOnTextFromDropdownList(tradingTypes,textToSent);

    }
    public void FreTime (String textToSent) throws Exception {

        BaseLibrary.clickOnTextFromDropdownList(freqTime,textToSent);

    }
    public void specAlloy() throws Exception {

        BaseLibrary.waitAndClickElementsUsingByLocator(specialAlloy);

    }
    public void KycDoc() throws Exception {

        BaseLibrary.waitAndClickElementsUsingByLocator(kycDoc);

    }
    public void PartOfSecurity() throws Exception {

        BaseLibrary.waitAndClickElementsUsingByLocator(partOfSecurity);

    }
    public void licensed() throws Exception {
        BaseLibrary.setFocusToElement(licensed);
        BaseLibrary.waitAndClickElementsUsingByLocator(licensed);

    }
    public void LocalPartner(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(localPartner);
        BaseLibrary.clickOnTextFromDropdownList(localPartner,textToSent);

    }
    public void NetSettlement(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(netSettlement);
        BaseLibrary.clickOnTextFromDropdownList(netSettlement,textToSent);

    }
    public void MoneyMovement(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(moneyMovement);
        BaseLibrary.actionMoveAndClickByLocator(moneyMovement);
        BaseLibrary.waitAndClickElement(moneyvalue);
        BaseLibrary.actionMoveAndClickByLocator(PaymentVendor);

    }
    public void PaymentVendor(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(PaymentVendor);
        BaseLibrary.clickOnTextFromDropdownList(PaymentVendor,textToSent);

    }
    public void InstantBuying() throws Exception {
        BaseLibrary.setFocusToElement(instantBuying);
        BaseLibrary.waitAndClickElementsUsingByLocator(instantBuying);

    }
    public void Fundingtypes(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(fundingTypes);
        BaseLibrary.clickOnTextFromDropdownList(fundingTypes,textToSent);

    }
    public void EnableVirtual() throws Exception {
        BaseLibrary.setFocusToElement(enableVirtual);
        BaseLibrary.waitAndClickElementsUsingByLocator(enableVirtual);

    }

    public void ApiStatement(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(apiStatement);
        BaseLibrary.clickOnTextFromDropdownList(apiStatement,textToSent);

    }

    // Funding Mandatory

    public void LocalPartner1(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(localPartner1);
        BaseLibrary.clickOnTextFromDropdownList(localPartner1,textToSent);

    }
    public void NetSettlement1(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(netSettlement1);
        BaseLibrary.clickOnTextFromDropdownList(netSettlement1,textToSent);

    }
    public void MoneyMovement1(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(moneyMovement1);
        BaseLibrary.actionMoveAndClickByLocator(moneyMovement1);
        BaseLibrary.waitAndClickElement(moneyvalue);
        BaseLibrary.actionMoveAndClickByLocator(PaymentVendor1);

    }
    public void PaymentVendor1(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(PaymentVendor1);
        BaseLibrary.clickOnTextFromDropdownList(PaymentVendor1,textToSent);

    }

    public void ApiStatement1(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(apiStatement1);
        BaseLibrary.sendKeysToWebElement(apiStatement1,textToSent);

    }


    // Instrument Group
    public void ListType(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(listType);
        BaseLibrary.clickOnTextFromDropdownList(listType,textToSent);

    }
    public void InstrumentGroupName(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(instrumentGroupName);
        BaseLibrary.actionMoveAndClickByLocator(instrumentGroupName);
        BaseLibrary.waitAndClickElement(instrumentvalue);

        BaseLibrary.actionMoveAndClickByLocator(button_Save);
    }

    // Risk Compliance & Billing
    public void catReporting() throws Exception {

        BaseLibrary.waitAndClickElementsUsingByLocator(catReporting);

    }
    public void Reporting(String textToSent) throws Exception {

        BaseLibrary.clickOnTextFromDropdownList(reporting,textToSent);

    }
    public void TradingLimit(String textToSent) throws Exception {

        BaseLibrary.sendKeysToWebElement(tradinglimit,textToSent);

    }
    public void FundingLimit(String textToSent) throws Exception {

        BaseLibrary.sendKeysToWebElement(fundinglimit,textToSent);

    }
    public void LineOfCredit(String textToSent) throws Exception {

        BaseLibrary.sendKeysToWebElement(lineofcredit,textToSent);

    }
    public void InitialClearing(String textToSent) throws Exception {

        BaseLibrary.sendKeysToWebElement(initialclearing,textToSent);

    }

    public void PartnerRate(String textToSent) throws Exception {

        BaseLibrary.clickOnTextFromDropdownList(partnerrate,textToSent);

    }
    public void BillingRoll(String textToSent) throws Exception {

        BaseLibrary.clickOnTextFromDropdownList(billingroll,textToSent);

    }
    public void AcatsFee(String textToSent) throws Exception {

        BaseLibrary.clickOnTextFromDropdownList(acatsfee,textToSent);

    }

    public void Upload(String textToSent) throws Exception {

        BaseLibrary.SetWaitTime(2000);
        BaseLibrary.setFocusToElement(upload);
        BaseLibrary.actionMoveAndClickByLocator(upload);
        String filePath = System.getProperty("user.dir") +textToSent ;
        BaseLibrary.uploadWithGivenFile(filePath);
        BaseLibrary.SetWaitTime(5000);
    }


    public void DeleteIcon(String textToSent) throws Exception {

        BaseLibrary.waitAndClickElementsUsingByLocator(deleteicon);
    }
    public void clickPartnerSave() throws Exception {

        BaseLibrary.setFocusToElement(button_Save);
        BaseLibrary.waitAndClickElementsUsingByLocator(button_Save);
        BaseLibrary.waitAndClickElementsUsingByLocator(button_Save_No);
        BaseLibrary.SetWaitTime(30);

    }

    public void clickSave() throws Exception {

        BaseLibrary.setFocusToElement(button_Save);
        BaseLibrary.waitAndClickElementsUsingByLocator(button_Save);
        BaseLibrary.SetWaitTime(30);

    }
    public void enterInSearchBox(String textToSent) throws Exception {
        BaseLibrary.SetWaitTime(10);

        BaseLibrary.sendKeysToWebElement(searchPartner, Pub_Partner);
        BaseLibrary.waitAndClickElementsUsingByLocator(searchIcon);
        BaseLibrary.SetWaitTime(1000);
    }

    public void enterNoDataInSearchBox(String textToSent) throws Exception {
        BaseLibrary.SetWaitTime(10);

        BaseLibrary.sendKeysToWebElement(searchPartner, textToSent);
        BaseLibrary.waitAndClickElementsUsingByLocator(searchIcon);
        BaseLibrary.SetWaitTime(1000);
    }

    public void verifyNoDataDisplayed(String textToVerify) throws Exception {
        BaseLibrary.SetWaitTime(3000);
        BaseLibrary.verifyText(noDataOnTable,textToVerify);
    }
    public void PartnerFilter() throws Exception {

        BaseLibrary.waitAndClickElementsUsingByLocator(partnerfilter);


    }
    public void filterPartnercode(String textToSent) throws Exception {
        BaseLibrary.SetWaitTime(30);

        BaseLibrary.sendKeysToWebElement(filterpartnercode, textToSent);
        BaseLibrary.SetWaitTime(10);
    }

    public void filterPartnername(String textToSent) throws Exception {
        BaseLibrary.SetWaitTime(30);


        BaseLibrary.sendKeysToWebElement(filterpartnername, textToSent);
        BaseLibrary.SetWaitTime(10);
    }
    public void filterPartnerCompany(String textToSent) throws Exception {
        BaseLibrary.SetWaitTime(30);
        BaseLibrary.clickOnTextFromDropdownList(filtercompany, textToSent);
        BaseLibrary.SetWaitTime(10);
    }
    public void filterMpid(String textToSent) throws Exception {
        BaseLibrary.SetWaitTime(30);

        BaseLibrary.sendKeysToWebElement(filtermpid, textToSent);
        BaseLibrary.SetWaitTime(10);
    }

    public void filterAlert(String textToSent) throws Exception {
        BaseLibrary.SetWaitTime(30);

        BaseLibrary.sendKeysToWebElement(filteralert, textToSent);
        BaseLibrary.SetWaitTime(10);
    }

    public void filterFindate(String textToSent) throws Exception {
        BaseLibrary.SetWaitTime(30);

        BaseLibrary.sendKeysToWebElement(filterfin, textToSent);
        BaseLibrary.SetWaitTime(10);
    }

    public void filterOasysid(String textToSent) throws Exception {
        BaseLibrary.SetWaitTime(30);
        BaseLibrary.setFocusToElement(filteroasys);

        BaseLibrary.sendKeysToWebElement(filteroasys, textToSent);
        BaseLibrary.SetWaitTime(10);
    }

    public void filterTaxid(String textToSent) throws Exception {
        BaseLibrary.SetWaitTime(30);
        BaseLibrary.setFocusToElement(filtertaxid);

        BaseLibrary.sendKeysToWebElement(filtertaxid, textToSent);
        BaseLibrary.SetWaitTime(10);
    }
    public void FilterSearch() throws Exception {

        BaseLibrary.SetWaitTime(10);
        BaseLibrary.setFocusToElement(filtersearch);
        BaseLibrary.waitAndClickElementsUsingByLocator(filtersearch);
        BaseLibrary.SetWaitTime(30);

    }
    public void FilterReset() throws Exception {

        BaseLibrary.SetWaitTime(10);
        BaseLibrary.waitAndClickElementsUsingByLocator(filterreset);
        BaseLibrary.SetWaitTime(30);
    }
    public void clickCancelYes() throws Exception {

        BaseLibrary.waitAndClickElementsUsingByLocator(button_cancel);
        BaseLibrary.waitAndClickElementsUsingByLocator(cancel_yes);

    }
    public void clickCancelNo() throws Exception {

        BaseLibrary.waitAndClickElementsUsingByLocator(button_cancel);
        BaseLibrary.waitAndClickElementsUsingByLocator(cancel_No);

    }
    public void PartnerEdit() throws Exception {

        BaseLibrary.waitAndClickElementsUsingByLocator(PartnerEditclick);
        BaseLibrary.waitAndClickElementsUsingByLocator(CorporateTab);
        BaseLibrary.SetWaitTime(1000);

    }
    public void PartnerEditTax() throws Exception {

        BaseLibrary.waitAndClickElementsUsingByLocator(PartnerEditclick);
        BaseLibrary.waitAndClickElementsUsingByLocator(TaxTab);
        BaseLibrary.SetWaitTime(1000);

    }
    public void PartnerEditOnboarding() throws Exception {

        BaseLibrary.waitAndClickElementsUsingByLocator(PartnerEditclick);
        BaseLibrary.waitAndClickElementsUsingByLocator(OnboardingTab);
        BaseLibrary.SetWaitTime(1000);

    }
    public void PartnerEditRisk() throws Exception {

        BaseLibrary.waitAndClickElementsUsingByLocator(PartnerEditclick);
        BaseLibrary.waitAndClickElementsUsingByLocator(RiskTab);
        BaseLibrary.SetWaitTime(1000);

    }

    public void PartnerIDEdit() throws Exception {

        BaseLibrary.waitAndClickElementsUsingByLocator(PartnerEditclick);
        BaseLibrary.SetWaitTime(1000);

    }
    public void verifyPartnerTableList(String name1) throws Exception {
        BaseLibrary.verifyTableListWithSingleColumnWithName(Pub_PartnerCode,"Partner Code");

    }
    public void verifyPartnerCode(String name) throws Exception {

        BaseLibrary.verifyTableListWithSingleColumnWithName(name,"Partner Code");

    }

    public void verifyPartnerName(String name) throws Exception {

        BaseLibrary.VerifyDynText(name);


    }
    public void verifyCompany(String name) throws Exception {

        BaseLibrary.verifyTableListWithSingleColumnWithName(name,  "Company");
    }
    public void verifyMpid(String name) throws Exception {

        BaseLibrary.verifyTableListWithSingleColumnWithName(name,"MPID");
    }
    public void verifyAlert(String name) throws Exception {

        BaseLibrary.verifyTableListWithSingleColumnWithName(name,"Alert Acronym");

    }
    public void verifyFinDoc(String name) throws Exception {

        BaseLibrary.verifyTableListWithSingleColumnWithName(name,"Fin Doc Renewel Date");

    }
    public void verifyOasysID(String name) throws Exception {

        BaseLibrary.verifyTableListWithSingleColumnWithName(name,"OASYS ID");

    }
    public void verifyTaxID(String name) throws Exception {
        BaseLibrary.setFocusToElement(taxList);
        BaseLibrary.verifyTableListWithSingleColumnWithName(name,"Tax ID");

    }
    public void verifyValidationMessaeWithText(String strVerify) throws Exception {
        BaseLibrary.verifyText(editMessage,strVerify);
        BaseLibrary.waitAndClickElement(closeValidation);
    }
    public void Export() throws Exception {
        BaseLibrary.waitAndClickElementsUsingByLocator(exportlink);
        BaseLibrary.waitAndClickElementsUsingByLocator(exportbutton);
        BaseLibrary.SetWaitTime(1000);

    }

    public void loadTestData() throws IOException {
        System.out.println("Load Test Data");
        dd = new DataDrivenUtility();
        dd.setExcelFile(dataSheetPath, "Partner");
        Pub_Partner = dd.getCellData(3, 1);
        Pub_PartnerCode = dd.getCellData(2, 1);

    }



}