package pageObjects;

import baseMethods.BaseLibrary;
import baseMethods.DataDrivenUtility;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

public class TransactionsScreen {

    public static String Pub_companyName = "";
    public static String Pub_partner = "";
    public static String Pub_office = "";
    public static String Pub_subOffice = "";
    public static String Pub_AccountNumber = "";
    public static String Pub_CCAccountNumber = "";
    public static String Pub_AccountName = "";
    public static String Pub_GLAccountNumber = "";
    public static String Pub_GLCCAccountNumber = "";
    public static String Pub_GLAccountName = "";
    public static String Pub_CostCenterName = "";
    public static String Pub_CostCenterCode = "";
    public static String Pub_AccountExecutiveName = "";
    public static String Pub_AccountExecutiveCode = "";
    public static String Pub_CCBroker = "";
    public static String Pub_BrockerName = "";
    public static DataDrivenUtility dd;


    Properties props = new Properties();

    By companyName = By.xpath("(//input)[1]");
    By companyCode = By.xpath("(//input)[2]");
    By companyTaxId = By.xpath("(//input)[5]");
    By PartnerId = By.xpath("//input[@class]");
    By PartnerCode = By.xpath("//input[@class]//following::input[1]");
    By company = By.xpath("//input[@class]//following::input[2]");
    By accountManagement = By.xpath("//*[@id='simple-menu']/ul/li[1]/em");
    By navigateOffice = By.xpath("//ul[@class='sub-menu-list']//li//a[text()='Office']");
    By officeNumber = By.id("add_officeNumber");
    By TcompanyName = By.id("add_companyName");
    By correspondentName = By.id("add_correspondentName");
    By officeName = By.id("add_officeName");
    By officeNameXpath = By.xpath("//*[@id='add_officeName']");
    By description = By.id("add_description");
    By addressLine1 = By.id("add_addressLine1");
    By addressLine2 = By.id("add_addressLine2");
    By officecountry = By.id("add_country");
    By officeState = By.xpath("(//input)[9]");
    By officeCity = By.xpath("(//input)[10]");
    By officePhone = By.id("add_phoneMobile");
    By PartnerName = By.xpath("//input[@class]//following::input[5]");
    By button_Save = By.xpath("//*[text()='Save']");
    By button_Save_No = By.xpath("//span[text()='No, Proceed']");
    By button_Save_Yes = By.xpath("//span[text()='Yes, go back']");
    By navigateSubOffice = By.xpath("//ul[@class='sub-menu-list']//li//a[text()='Sub Office']");
    By subOfficeCorrespondent = By.xpath("(//input)[1]");
    By subOfficeOffice = By.xpath("(//input)[2]");
    By subOfficeName = By.xpath("(//input)[3]");
    By subOfficeCode = By.xpath("(//input)[4]");
    By subOfficePurpose = By.xpath("(//input)[5]");
    By accountDataMaster = By.xpath("//*[@id='simple-menu']/ul/li[1]/em");
    By accountMaster = By.xpath("//ul[@class='sub-menu-list']//li//a[text()='Account Master']");
    By partner = By.xpath("(//input)[3]");
    By office = By.xpath("(//input)[4]");
    By subOffice = By.xpath("(//input)[5]");
    By DWAccountNumber = By.xpath("//label[contains(text(),('DW Account Number*'))]/..//div/input");
    By CustomerAccount = By.xpath("//label[contains(text(),('Customer Account Number*'))]/..//div/input");
    By AccountName = By.xpath("//label[contains(text(),('Account Name*'))]/..//div/input");
    By navigateCostCenter = By.xpath("//ul[@class='sub-menu-list']//li//a[text()='Cost Center']");
    By ccofficeCorrespondent = By.xpath("(//input)[1]");
    By ccoffice = By.xpath("(//input)[2]");
    By ccsubOffice = By.xpath("(//input)[3]");
    By cCName = By.xpath("(//input)[4]");
    By cCCode = By.xpath("(//input)[5]");
    By cCPurpose = By.xpath("(//input)[6]");
    By systemMaster = By.xpath("//*[@id='simple-menu']/ul/li[1]/em");
    By navigateExecutive = By.xpath("//ul[@class='sub-menu-list']//li//a[text()='Account Executive']");
    By ExecutiveIndicatorAE = By.xpath("//input[@class]//following::input[1]");
    By partnerAE = By.xpath("//input[@class]//following::input[2]");
    By descriptionAE = By.xpath("//input[@class]//following::input[3]");
    By ExecutionCodeAe = By.xpath("//input[@class]//following::input[4]");
    By officeAE = By.xpath("//input[@class]//following::input[5]");
    By subofficeAE = By.xpath("//input[@class]//following::input[6]");
    By ExecutiveIndicator = By.xpath("//input[@class]//following::input[1]");
    By brokernameTT = By.xpath("(//input)[2]");
    By symbolTT = By.xpath("(//input)[3]");
    By qsrTT = By.xpath("(//input)[4]");
    By clearingbrokerTT = By.xpath("(//input)[5]");
    By typeTT = By.xpath("(//input)[6]");
    By brokerentryTT = By.xpath("(//input)[8]");
    By brokernumberTT = By.xpath("(//input)[1]");
    By execName = By.xpath("(//input)[1]");



    public void enterCompanyName(String textToSent) throws Exception {

        if (textToSent.contentEquals("Random_Name")) {
            BaseLibrary.clearText(companyName);
            String generatedString = RandomStringUtils.randomAlphabetic(8);
            textToSent = "CMP" + generatedString;
            props.put("Company_Name", textToSent);
            BaseLibrary.sendKeysToWebElement(companyName, textToSent);
            Pub_companyName = textToSent;
            DataDrivenUtility dd = new DataDrivenUtility();
            dd.setExcelFile("src/test/resources/testFiles/FirstTrade.xlsx","PreReq");
            dd.setCellValue(1,1,Pub_companyName,"src/test/resources/testFiles/FirstTrade.xlsx");
        } else {
            BaseLibrary.clearText(companyName);
            BaseLibrary.sendKeysToWebElement(companyName, textToSent);
            props.put("Company_Name", textToSent);
            Pub_companyName = textToSent;
            DataDrivenUtility dd = new DataDrivenUtility();
            dd.setExcelFile("src/test/resources/testFiles/FirstTrade.xlsx","PreReq");
            dd.setCellValue(1,1,Pub_companyName,"src/test/resources/testFiles/FirstTrade.xlsx");


        }
    }

    public void enterCompanyCode(String textToSent) throws Exception {

        if (textToSent.contentEquals("Random_Code")) {

            BaseLibrary.clearText(companyCode);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date) + " ");
            String data = formatter.format(date).toString().replaceAll("\\s+", " ");
            textToSent = data.replaceAll("[^a-zA-Z0-9]", "");
            props.put("Company_Code", textToSent);
            BaseLibrary.sendKeysToWebElement(companyCode, textToSent);

        } else {
            BaseLibrary.clearText(companyCode);
            BaseLibrary.sendKeysToWebElement(companyCode, textToSent);
        }


    }

    public void enterManCompanyTaxID(String textToSent) throws Exception {
        //BaseLibrary.clearText(companyTaxId);
        //BaseLibrary.sendKeysToWebElement(companyTaxId, textToSent);
        if (textToSent.contentEquals("Random_TaxId")) {
            BaseLibrary.clearText(companyTaxId);
            Properties prop1 = readPropertiesFile(
                    System.getProperty("user.dir") + "/src/test/resources/properties/transactions.properties");
            textToSent = prop1.getProperty("Company_TaxID");
            int sum = Integer.parseInt(textToSent);
            sum++;
            textToSent = Integer.toString(sum);
            props.put("Company_TaxID", textToSent);
            BaseLibrary.sendKeysToWebElement(companyTaxId, textToSent);
            String path = System.getProperty("user.dir") + "/src/test/resources/properties/transactions.properties";
            FileOutputStream outputStrem = new FileOutputStream(path);
            props.store(outputStrem, "This is a sample properties file");
        } else {
            BaseLibrary.clearText(companyTaxId);
            BaseLibrary.sendKeysToWebElement(companyTaxId, textToSent);
        }
    }

    public void partneridTrans(String textToSent) throws Exception {
        if (textToSent.contentEquals("Random_PartnerId")) {
            BaseLibrary.clearText(PartnerId);
            Random random = new Random();
            int y = random.nextInt(10000);
            textToSent = Integer.toString(y);
            props.put("PartnerId", textToSent);
            BaseLibrary.sendKeysToWebElement(PartnerId, textToSent);
        } else {
            BaseLibrary.clearText(PartnerId);
            BaseLibrary.sendKeysToWebElement(PartnerId, textToSent);
        }
    }

    public void partnercodeTrans(String textToSent) throws Exception {
        if (textToSent.contentEquals("Random_PartnerCode")) {
            BaseLibrary.clearText(PartnerCode);
            Random random = new Random();
            int y = random.nextInt(500000);
            textToSent = Integer.toString(y);
            props.put("PartnerCode", textToSent);
            BaseLibrary.sendKeysToWebElement(PartnerCode, textToSent);

        } else {
            BaseLibrary.clearText(PartnerCode);
            BaseLibrary.sendKeysToWebElement(PartnerCode, textToSent);
        }

    }


    public void CompanyTrans(String textToSent) throws Exception {
        BaseLibrary.clearText(company);
        BaseLibrary.clickOnTextFromDropdownList(company, Pub_companyName);
    }


    public void NavigateToOfficeScreenTrans() throws Exception {

        BaseLibrary.waitAndClickElementsUsingByLocator(accountManagement);
        BaseLibrary.SetWaitTime(2000);
        BaseLibrary.waitAndClickElement(navigateOffice);
    }

    public void relogin() throws Exception {
        BaseLibrary.waitAndClickElement(By.xpath("//*[@alt='logout']"));
     //   LoginScreen.loginApplication();
    }


    public void enterOfficeCode(String textToSent) throws Exception {

        if (textToSent.contentEquals("Random_OfficeCode")) {
            BaseLibrary.clearText(officeNumber);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date) + " ");
            String data = formatter.format(date).toString().replaceAll("\\s+", " ");
            textToSent = data.replaceAll("[^a-zA-Z0-9]", "");
            // BaseLibrary.sendKeysToWebElement(officeName, textToSent);
            props.put("Office_Code", textToSent);
            BaseLibrary.sendKeysToWebElement(officeNumber, textToSent);

        } else {
            BaseLibrary.clearText(officeNumber);
            BaseLibrary.sendKeysToWebElement(officeNumber, textToSent);
        }
    }

    public void selectCompanyName(String textToSent) throws Exception {
        //   BaseLibrary.clickOnTextFromDropdownList(companyName, textToSent);
        if (textToSent.contentEquals("Random_CompanyName")) {
            BaseLibrary.clearText(TcompanyName);
            BaseLibrary.clickOnTextFromDropdownList(TcompanyName, textToSent);
        } else if (textToSent.contentEquals("CompanyName")) {
            BaseLibrary.clickOnTextFromDropdownList(TcompanyName, Pub_companyName);
        } else {
            BaseLibrary.clearText(officeNumber);
            BaseLibrary.clickOnTextFromDropdownList(officeNumber, textToSent);
        }
    }


    public void selectCorrespondentNameTrans(String textToSent) throws Exception {
        if (textToSent.contentEquals("Random_CorrespondentName")) {
            BaseLibrary.clearText(correspondentName);
            Properties prop1 = readPropertiesFile(
                    System.getProperty("user.dir") + "/src/test/resources/properties/transaction.properties");
            textToSent = prop1.getProperty("Partner_Name");
            BaseLibrary.clickOnTextFromDropdownList(correspondentName, textToSent);
        } else if (textToSent.contentEquals("Partner")) {
            BaseLibrary.clickOnTextFromDropdownList(correspondentName, Pub_partner);
        } else {
            BaseLibrary.clearText(correspondentName);
            BaseLibrary.clickOnTextFromDropdownList(correspondentName, textToSent);
        }
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


    public void enterOfficeName(String textToSent) throws Exception {
        if (textToSent.contentEquals("Random_Name")) {
            BaseLibrary.clearText(officeName);
            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date) + " ");
            String data = "Auto" + formatter.format(date).toString().replaceAll("\\s+", " ");
            textToSent = data.replaceAll("[^a-zA-Z0-9]", "");
            // BaseLibrary.sendKeysToWebElement(officeName, textToSent);
            props.put("Office_Name", textToSent);
            BaseLibrary.sendKeysToWebElement(officeName, textToSent);
            //  String path = System.getProperty("user.dir") + "/src/test/resources/properties/office.properties";
            //  FileOutputStream outputStrem = new FileOutputStream(path);
            //  props.store(outputStrem, "This is a sample properties file");
            Pub_office = textToSent;
            DataDrivenUtility dd = new DataDrivenUtility();
            dd.setExcelFile("src/test/resources/testFiles/FirstTrade.xlsx","PreReq");
            dd.setCellValue(3,1,textToSent,"src/test/resources/testFiles/FirstTrade.xlsx");

        } else {
            BaseLibrary.clearText(officeName);
            BaseLibrary.sendKeysToWebElement(officeName, textToSent);
        }
    }


    public void enterUpdatedOfficeName(String textToSent) throws Exception {
        if (textToSent.contentEquals("Random_Name")) {
            BaseLibrary.clearText(officeName);
            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date) + " ");
            String data = "Auto" + formatter.format(date).toString().replaceAll("\\s+", " ");
            textToSent = data.replaceAll("[^a-zA-Z0-9]", "");
            // BaseLibrary.sendKeysToWebElement(officeName, textToSent);
            String da = props.getProperty("Office_Code");
            props.put("Office_Code", da);
            props.put("Office_Name", textToSent);
            BaseLibrary.sendKeysToWebElement(officeName, textToSent);

        } else {
            BaseLibrary.clearText(officeName);
            BaseLibrary.sendKeysToWebElement(officeName, textToSent);
        }
    }

    public void enterDescription(String textToSent) throws Exception {

        BaseLibrary.sendKeysToWebElement(description, textToSent);
    }

    public void enterAddressLine1(String textToSent) throws Exception {

        BaseLibrary.sendKeysToWebElement(addressLine1, textToSent);
    }

    public void enterAddressLine2(String textToSent) throws Exception {

        BaseLibrary.sendKeysToWebElement(addressLine2, textToSent);
    }


    public void enterOfficeCountry(String textToSent) throws Exception {
        BaseLibrary.clearText(officecountry);
        BaseLibrary.clickOnTextFromDropdownList(officecountry, textToSent);
    }

    public void enterOfficeState(String textToSent) throws Exception {
        BaseLibrary.SetWaitTime(200);
        BaseLibrary.clearText(officeState);
        BaseLibrary.clickOnTextFromDropdownList(officeState, textToSent);
    }

    public void enterOfficeCity(String textToSent) throws Exception {
        BaseLibrary.SetWaitTime(200);
        BaseLibrary.clearText(officeCity);
        BaseLibrary.clickOnTextFromDropdownList(officeCity, textToSent);
    }

    public void enterOfficePhone(String textToSent) throws Exception {
        BaseLibrary.sendKeysToWebElement(officePhone, textToSent);
    }


    public void partnername(String textToSent) throws Exception {
        if (textToSent.contentEquals("Random_PartnerName")) {
            String generatedString = RandomStringUtils.randomAlphabetic(8);
            textToSent = "Part" + generatedString;
            props.put("Partner_Name", textToSent);
            BaseLibrary.clearText(PartnerName);
            BaseLibrary.sendKeysToWebElement(PartnerName, textToSent);
            Pub_partner = textToSent;
            DataDrivenUtility dd = new DataDrivenUtility();
            dd.setExcelFile("src/test/resources/testFiles/FirstTrade.xlsx","PreReq");
            dd.setCellValue(2,1,textToSent,"src/test/resources/testFiles/FirstTrade.xlsx");


        } else {
            BaseLibrary.clearText(PartnerName);
            BaseLibrary.sendKeysToWebElement(PartnerName, textToSent);

        }
    }


    public void clickSavePart() throws Exception {
        BaseLibrary.setFocusToElement(button_Save);
        BaseLibrary.waitAndClickElementsUsingByLocator(button_Save);
        BaseLibrary.waitAndClickElementsUsingByLocator(button_Save_Yes);
        BaseLibrary.SetWaitTime(30);
    }

    public void navigateSubOfficeScreen() throws Exception {
        BaseLibrary.waitAndClickElementsUsingByLocator(accountManagement);
        BaseLibrary.SetWaitTime(200);
        BaseLibrary.waitAndClickElement(navigateSubOffice);
    }


    public void selectCorrespondent(String textToSent) throws Exception {

        if (textToSent.contentEquals("Random_CorrespondentName")) {
            BaseLibrary.clearText(subOfficeCorrespondent);
            BaseLibrary.clickOnTextFromDropdownList(subOfficeCorrespondent, textToSent);
        } else if (textToSent.contentEquals("Partner")) {
            BaseLibrary.clickOnTextFromDropdownList(subOfficeCorrespondent, Pub_partner);
        } else {
            BaseLibrary.clearText(subOfficeCorrespondent);
            BaseLibrary.clickOnTextFromDropdownList(subOfficeCorrespondent, textToSent);
        }

    }

    public void selectOffice(String textToSelect) throws Exception {
        if (textToSelect.contentEquals("Random_OfficeName")) {

            BaseLibrary.clickOnTextFromDropdownList(subOfficeOffice, Pub_office);
        } else {
            BaseLibrary.clickOnTextFromDropdownList(subOfficeOffice, textToSelect);
        }
    }

    public void enterSubOffice(String textToSent) throws Exception {
        if (textToSent.contentEquals("Random_SubOfficeName")) {
            BaseLibrary.clearText(subOfficeName);
            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date) + " ");
            String data = "AutoSub" + formatter.format(date).toString().replaceAll("\\s+", " ");
            textToSent = data.replaceAll("[^a-zA-Z0-9]", "");
            props.put("SubOfficeName", textToSent);
            BaseLibrary.sendKeysToWebElement(subOfficeName, textToSent);
            Pub_subOffice = textToSent;
            DataDrivenUtility dd = new DataDrivenUtility();
            dd.setExcelFile("src/test/resources/testFiles/FirstTrade.xlsx","PreReq");
            dd.setCellValue(4,1,textToSent,"src/test/resources/testFiles/FirstTrade.xlsx");


        } else {
            BaseLibrary.clearText(subOfficeName);
            BaseLibrary.sendKeysToWebElement(subOfficeName, textToSent);
            Pub_subOffice = textToSent;
        }
    }

    public void enterSubOfficeCode(String textToSent) throws Exception {

        if (textToSent.contentEquals("Random_SubOfficeCode")) {
            BaseLibrary.clearText(subOfficeCode);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date) + " ");
            String data = formatter.format(date).toString().replaceAll("\\s+", " ");
            textToSent = data.replaceAll("[^a-zA-Z0-9]", "");
            props.put("SubOfficeCode", textToSent);
            BaseLibrary.sendKeysToWebElement(subOfficeCode, textToSent);

        } else {
            BaseLibrary.clearText(subOfficeCode);
            BaseLibrary.sendKeysToWebElement(subOfficeCode, textToSent);
        }

    }

    public void enterPurpose(String textToSent) throws Exception {
        BaseLibrary.clearText(subOfficePurpose);
        BaseLibrary.sendKeysToWebElement(subOfficePurpose, textToSent);
    }


    public void clickSystemMaster() throws Exception {
        BaseLibrary.waitAndClickElementsUsingByLocator(accountDataMaster);
        BaseLibrary.SetWaitTime(400);
        BaseLibrary.waitAndClickElement(accountMaster);

    }

    //-----------------------------------
    public void selectPartner(String textToSelect) throws Exception {
        if (textToSelect.contains("Random_partner")) {  //Random_Partner
            BaseLibrary.clickOnTextFromDropdownList(partner, Pub_partner);
        } else {
            BaseLibrary.clickOnTextFromDropdownList(partner, textToSelect);
        }
    }

    public void selectOfficeTra(String textToSelect) throws Exception {
        if (textToSelect.contains("Random_Office")) {
            //implement random des
            BaseLibrary.clickOnTextFromDropdownList(office, Pub_office);
        } else {

            BaseLibrary.clickOnTextFromDropdownList(office, textToSelect);
        }
    }

    public void selectSubOffice(String textToSelect) throws Exception {
        if (textToSelect.contains("Random_SubOffice")) {
            //implement random des
            BaseLibrary.clickOnTextFromDropdownList(subOffice, Pub_subOffice);
        } else {
            BaseLibrary.clickOnTextFromDropdownList(subOffice, textToSelect);
        }
    }


    public void enterDwAccountNumber(String textToSent) throws Exception {
        if (textToSent.contentEquals("Random_DwAccountNumber")) {
            BaseLibrary.clearText(DWAccountNumber);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date) + " ");
            String data = formatter.format(date).toString().replaceAll("\\s+", " ");
            textToSent = data.replaceAll("[^a-zA-Z0-9]", "");
            // BaseLibrary.sendKeysToWebElement(officeName, textToSent);
            props.put("AccountNumber", textToSent);
            BaseLibrary.sendKeysToWebElement(DWAccountNumber, textToSent);
            Pub_AccountNumber = textToSent;
            DataDrivenUtility dd = new DataDrivenUtility();
            dd.setExcelFile("src/test/resources/testFiles/FirstTrade.xlsx","PreReq");
            dd.setCellValue(6,1,textToSent,"src/test/resources/testFiles/FirstTrade.xlsx");


        } else {
            props.put("AccountNumber", textToSent);
            BaseLibrary.clearText(DWAccountNumber);
            BaseLibrary.sendKeysToWebElement(DWAccountNumber, textToSent);
            Pub_AccountNumber = textToSent;
        }
    }

    public void enterGLDwAccountNumber(String textToSent) throws Exception {
        if (textToSent.contentEquals("Random_DwAccountNumber")) {
            BaseLibrary.clearText(DWAccountNumber);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date) + " ");
            String data = formatter.format(date).toString().replaceAll("\\s+", " ");
            textToSent = data.replaceAll("[^a-zA-Z0-9]", "");
            // BaseLibrary.sendKeysToWebElement(officeName, textToSent);
            props.put("AccountNumber", textToSent);
            BaseLibrary.sendKeysToWebElement(DWAccountNumber, textToSent);
            Pub_GLAccountNumber = textToSent;
            DataDrivenUtility dd = new DataDrivenUtility();
            dd.setExcelFile("src/test/resources/testFiles/FirstTrade.xlsx","PreReq");
            dd.setCellValue(8,1,textToSent,"src/test/resources/testFiles/FirstTrade.xlsx");
        } else {
            props.put("AccountNumber", textToSent);
            BaseLibrary.clearText(DWAccountNumber);
            BaseLibrary.sendKeysToWebElement(DWAccountNumber, textToSent);
            Pub_GLAccountNumber = textToSent;
        }
    }

    public void enterCustomerAccountNumber(String textToSent) throws Exception {
        if (textToSent.contentEquals("Random_CSAccountNumber")) {
            BaseLibrary.clearText(CustomerAccount);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date) + " ");
            String data = formatter.format(date).toString().replaceAll("\\s+", " ");
            textToSent = data.replaceAll("[^a-zA-Z0-9]", "");
            // BaseLibrary.sendKeysToWebElement(officeName, textToSent);
            props.put("CustomerAccNo", textToSent);
            BaseLibrary.sendKeysToWebElement(CustomerAccount, textToSent);
            Pub_CCAccountNumber = textToSent;

        } else {
            props.put("CustomerAccNo", textToSent);
            BaseLibrary.clearText(CustomerAccount);
            BaseLibrary.sendKeysToWebElement(CustomerAccount, textToSent);
            Pub_CCAccountNumber = textToSent;
        }
    }

    public void enterGLCustomerAccountNumber(String textToSent) throws Exception {
        if (textToSent.contentEquals("Random_CSAccountNumber")) {
            BaseLibrary.clearText(CustomerAccount);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date) + " ");
            String data = formatter.format(date).toString().replaceAll("\\s+", " ");
            textToSent = data.replaceAll("[^a-zA-Z0-9]", "");
            // BaseLibrary.sendKeysToWebElement(officeName, textToSent);
            props.put("CustomerAccNo", textToSent);
            BaseLibrary.sendKeysToWebElement(CustomerAccount, textToSent);
            Pub_GLCCAccountNumber = textToSent;

        } else {
            props.put("CustomerAccNo", textToSent);
            BaseLibrary.clearText(CustomerAccount);
            BaseLibrary.sendKeysToWebElement(CustomerAccount, textToSent);
            Pub_GLCCAccountNumber = textToSent;
        }
    }

    public void enterAccountName(String textToSent) throws Exception {
        // BaseLibrary.sendKeysToWebElement(nameOfSymbol,testToSent);
        if (textToSent.contentEquals("Random_AccountName")) {
            BaseLibrary.clearText(AccountName);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date) + " ");
            textToSent = formatter.format(date).toString().replaceAll("\\s+", " ");
            String data = "AN" + textToSent.replaceAll("[^a-zA-Z0-9]", "");
            int curStamp = Integer.parseInt(data.substring(data.length() - 5, data.length()));
            BaseLibrary.sendKeysToWebElement(AccountName, data);
            props.put("AccountName", data);
            Pub_AccountName = data;
            DataDrivenUtility dd = new DataDrivenUtility();
            dd.setExcelFile("src/test/resources/testFiles/FirstTrade.xlsx","PreReq");
            dd.setCellValue(5,1,data,"src/test/resources/testFiles/FirstTrade.xlsx");

        } else {
            BaseLibrary.clearText(AccountName);
            BaseLibrary.sendKeysToWebElement(AccountName, textToSent);
            props.put("AccountName", textToSent);
            Pub_AccountName = textToSent;

        }
    }

    public void enterGLAccountName(String textToSent) throws Exception {
        // BaseLibrary.sendKeysToWebElement(nameOfSymbol,testToSent);
        if (textToSent.contentEquals("Random_AccountName")) {
            BaseLibrary.clearText(AccountName);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date) + " ");
            textToSent = formatter.format(date).toString().replaceAll("\\s+", " ");
            String data = "AN" + textToSent.replaceAll("[^a-zA-Z0-9]", "");
            int curStamp = Integer.parseInt(data.substring(data.length() - 5, data.length()));
            BaseLibrary.sendKeysToWebElement(AccountName, data);
            props.put("AccountName", data);
            Pub_GLAccountName = data;
            DataDrivenUtility dd = new DataDrivenUtility();
            dd.setExcelFile("src/test/resources/testFiles/FirstTrade.xlsx","PreReq");
            dd.setCellValue(7,1,data,"src/test/resources/testFiles/FirstTrade.xlsx");


        } else {
            BaseLibrary.clearText(AccountName);
            BaseLibrary.sendKeysToWebElement(AccountName, textToSent);
            props.put("AccountName", textToSent);
            Pub_GLAccountName = textToSent;

        }
    }

    public void navigateCostCenterScreen() throws Exception {
        BaseLibrary.waitAndClickElementsUsingByLocator(accountManagement);
        BaseLibrary.SetWaitTime(1000);
        BaseLibrary.waitAndClickElement(navigateCostCenter);
    }


    public void selectCorrespondentCostC(String textToSelect) throws Exception {
        if (textToSelect.contentEquals("Random_Correspondent")) {
            BaseLibrary.clickOnTextFromDropdownList(ccofficeCorrespondent, Pub_partner);
        } else {
            BaseLibrary.clickOnTextFromDropdownList(ccofficeCorrespondent, textToSelect);
        }
    }

    public void selectOfficeCostC(String textToSelect) throws Exception {
        if (textToSelect.contentEquals("Random_OfficeName")) {
            BaseLibrary.clickOnTextFromDropdownList(ccoffice, Pub_office);
        } else {
            BaseLibrary.clickOnTextFromDropdownList(ccoffice, textToSelect);
        }
    }

    public void selectSubOfficeCostC(String textToSelect) throws Exception {
        if (textToSelect.contentEquals("Random_SubOfficeName")) {

            BaseLibrary.clickOnTextFromDropdownList(ccsubOffice, Pub_subOffice);
        } else {
            BaseLibrary.clickOnTextFromDropdownList(ccsubOffice, textToSelect);
        }
    }

    public void enterCostCenterName(String textToSent) throws Exception {
        if (textToSent.contentEquals("Random_CostCenter")) {
            BaseLibrary.clearText(cCName);
            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date) + " ");
            String data = "AutoCC" + formatter.format(date).toString().replaceAll("\\s+", " ");
            textToSent = data.replaceAll("[^a-zA-Z0-9]", "");
            props.put("CoseCenterName", textToSent);
            BaseLibrary.sendKeysToWebElement(cCName, textToSent);
            Pub_CostCenterName = textToSent;
            DataDrivenUtility dd = new DataDrivenUtility();
            dd.setExcelFile("src/test/resources/testFiles/FirstTrade.xlsx","PreReq");
            dd.setCellValue(9,1,textToSent,"src/test/resources/testFiles/FirstTrade.xlsx");

        } else {
            BaseLibrary.clearText(cCName);
            BaseLibrary.sendKeysToWebElement(cCName, textToSent);
        }
    }

    public void enterCostCenterCode(String textToSent) throws Exception {
        if (textToSent.contentEquals("Random_CostCenterCode")) {
            BaseLibrary.clearText(cCCode);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date) + " ");
            String data = formatter.format(date).toString().replaceAll("\\s+", " ");
            textToSent = data.replaceAll("[^a-zA-Z0-9]", "");
            props.put("CostCenterCode", textToSent);
            BaseLibrary.sendKeysToWebElement(cCCode, textToSent);
            Pub_CostCenterCode = textToSent;
        } else {
            BaseLibrary.clearText(cCCode);
            BaseLibrary.sendKeysToWebElement(cCCode, textToSent);
            Pub_CostCenterCode = textToSent;
        }
    }

    public void enterPurposeCostC(String textToSent) throws Exception {
        BaseLibrary.clearText(cCPurpose);
        BaseLibrary.sendKeysToWebElement(cCPurpose, textToSent);
    }


    public void NavigateToAccountExecu() throws Exception {
        BaseLibrary.waitAndClickElementsUsingByLocator(systemMaster);
        BaseLibrary.SetWaitTime(5000);
        BaseLibrary.waitAndClickElement(navigateExecutive);
    }


    public void executionnameAE(String textToSent) throws Exception {
        if (textToSent.contentEquals("Random_AEName")) {
            BaseLibrary.clearText(execName);
            String generatedString = RandomStringUtils.randomAlphabetic(8);
            textToSent = "AE" + generatedString;
            BaseLibrary.sendKeysToWebElement(execName, textToSent);
        } else {
            BaseLibrary.clearText(execName);
            BaseLibrary.sendKeysToWebElement(execName, textToSent);
        }
    }

    public void executiveindicator(String advisors) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(ExecutiveIndicatorAE, advisors);
    }

    public void descriptionAE(String textToSent) throws Exception {

        BaseLibrary.sendKeysToWebElement(descriptionAE, textToSent);
    }

    public void executioncodeAE(String textToSent) throws Exception {
        if (textToSent.contentEquals("Random_AECode")) {
            BaseLibrary.clearText(ExecutionCodeAe);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date) + " ");
            String data = formatter.format(date).toString().replaceAll("\\s+", " ");
            textToSent = data.replaceAll("[^a-zA-Z0-9]", "");
            props.put("AECode", textToSent);
            BaseLibrary.sendKeysToWebElement(ExecutionCodeAe, textToSent);
            Pub_AccountExecutiveName = textToSent;
            DataDrivenUtility dd = new DataDrivenUtility();
            dd.setExcelFile("src/test/resources/testFiles/FirstTrade.xlsx","PreReq");
            dd.setCellValue(10,1,textToSent,"src/test/resources/testFiles/FirstTrade.xlsx");

        } else {
            BaseLibrary.clearText(ExecutionCodeAe);
            BaseLibrary.sendKeysToWebElement(ExecutionCodeAe, textToSent);
            Pub_AccountExecutiveName = textToSent;
        }
    }

    public void PartnerAE(String textToSent) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(partnerAE, Pub_partner);
    }

    public void OfficeAE(String textToSent) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(officeAE, Pub_office);
    }


    public void SubOfficeAE(String random_office) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(subofficeAE, Pub_subOffice);
    }

    public void enterFirstTrade(String firstTradeEntry) throws Exception {
        dd = new DataDrivenUtility();
        dd.setExcelFile(firstTradeEntry, "Scenario-1");
        selectCompany(Pub_companyName);
        selectPartnerForTransactions(Pub_partner);
        selectOfficeForTransactions(Pub_office);
        selectSubOfficeForTransactions(Pub_subOffice);
        selectAccountNumberForTransaction(Pub_AccountNumber);
        selectCCBrokerCode(Pub_BrockerName);
        selectCCCompany(Pub_companyName);
        selectCCPartner(Pub_partner);
        selectCCOffice(Pub_office);
        selectCCSubOffice(Pub_subOffice);
        selectCCAcountNumber(Pub_GLAccountNumber);
        selectEntryType(dd.getCellData(2, 1));
        selectTransType(dd.getCellData(2, 2));
        selectSymbol("EQIX");//need to create --> Pub_Symbol (random) --> need to add security
        selectTradeCurrency("Dollar"); // need to verify --> need to add currency
        enterTradeQuanity(dd.getCellData(2, 6));  // need to change ---> getCellNumData
        enterPrice(dd.getCellData(2, 7));
        enterSettleDate(dd.getCellData(2, 5));
        enterTradeDate(dd.getCellData(2, 4));
        clickSaveTransactions();
        verifyTransactionSuccessMessage("Trade Entry has been created successfully!");
    }

    private void verifyTransactionSuccessMessage(String sVerify) throws Exception {
        BaseLibrary.verifyText(By.xpath("//*[contains(text(),'Trade Entry  has been created successfully!')]"), sVerify);
        BaseLibrary.waitAndClickElement(By.xpath("//button[@title='Close']"));
    }

    private void clickSaveTransactions() throws Exception {
        BaseLibrary.SetWaitTime(1000);
        BaseLibrary.waitAndClickElement(By.xpath("(//span[@class='MuiButton-label'])[3]"));
    }

    private void enterTradeDate(String cellData) throws Exception {
        BaseLibrary.sendKeysToWebElement(By.xpath("(//input)[22]"), cellData);
    }

    private void enterSettleDate(String cellData) throws Exception {
        BaseLibrary.sendKeysToWebElement(By.xpath("(//input)[24]"), cellData);
    }

    private void enterPrice(String cellData) throws Exception {
        BaseLibrary.sendKeysToWebElement(By.xpath("(//input)[19]"), cellData);
    }

    private void enterTradeQuanity(String cellData) throws Exception {
        BaseLibrary.sendKeysToWebElement(By.xpath("(//input)[18]"), cellData);
    }

    private void selectTradeCurrency(String currency) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("(//input)[17]"), currency);
    }


    private void selectSymbol(String symbol) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("(//input)[16]"), symbol);
    }

    private void selectTransType(String tType) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("(//input)[15]"), tType);

    }

    private void selectEntryType(String rvp) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("(//input)[14]"), rvp);
    }

    private void selectCCAcountNumber(String ccAccountNumber) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("(//input)[12]"), ccAccountNumber);
    }

    private void selectCCSubOffice(String subOffice) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("(//input)[11]"), subOffice);
    }

    private void selectCCOffice(String pub_office) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("(//input)[10]"), pub_office);
    }

    private void selectCCPartner(String pub_partner) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("(//input)[9]"), pub_partner);
    }

    private void selectCCCompany(String pub_companyName) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("(//input)[8]"), Pub_companyName);
    }

    private void selectCCBrokerCode(String adPbe) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("(//input)[5]"), adPbe);
        BaseLibrary.pressDown(6);
    }

    private void selectAccountNumberForTransaction(String accountNumber) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("(//input)[5]"), accountNumber);
    }


    private void selectCompany(String companyName) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("(//input)[1]"), companyName);
    }

    private void selectPartnerForTransactions(String partnerTransaction) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("(//input)[2]"), partnerTransaction);
    }

    private void selectOfficeForTransactions(String office) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("(//input)[3]"), office);
    }

    private void selectSubOfficeForTransactions(String subOffice) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("(//input)[4]"), subOffice);
    }


    public void navigateTradeEntryScreen() throws Exception {
        By transactions = By.xpath("//*[@id='simple-menu']/ul/li[4]/em");
        By navigateTransactions = By.xpath("//ul[@class='sub-menu-list']//li//a[text()='Trade/Journal Entry']");
        BaseLibrary.waitAndClickElementsUsingByLocator(transactions);
        BaseLibrary.SetWaitTime(200);
        BaseLibrary.waitAndClickElement(navigateTransactions);
    }


    public void NavigateToBroker() throws Exception {
        By transactions = By.xpath("//*[@id='simple-menu']/ul/li[2]/em");
        By navigateBroker = By.xpath("//ul[@class='sub-menu-list']//li//a[text()='Broker Master']");
        BaseLibrary.waitAndClickElementsUsingByLocator(transactions);
        BaseLibrary.SetWaitTime(200);
        BaseLibrary.waitAndClickElement(navigateBroker);
    }


    public void BrokerName(String textToSent) throws Exception {
        if (textToSent.contentEquals("Random_Name")) {
            BaseLibrary.clearText(brokernameTT);
            String generatedString = RandomStringUtils.randomAlphabetic(8);
            textToSent = "BR" + generatedString;
            BaseLibrary.sendKeysToWebElement(brokernameTT, textToSent);
            Pub_BrockerName = textToSent;
            DataDrivenUtility dd = new DataDrivenUtility();
            dd.setExcelFile("src/test/resources/testFiles/FirstTrade.xlsx","PreReq");
            dd.setCellValue(11,1,textToSent,"src/test/resources/testFiles/FirstTrade.xlsx");

        } else {
            BaseLibrary.clearText(brokernameTT);
            BaseLibrary.sendKeysToWebElement(brokernameTT, textToSent);
            Pub_BrockerName = textToSent;
        }
    }

    public void Symbol(String textToSent) throws Exception {

        if (textToSent.contentEquals("Random_Number")) {
            BaseLibrary.clearText(symbolTT);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date) + " ");
            String data = formatter.format(date).toString().replaceAll("\\s+", " ");
            textToSent = data.replaceAll("[^a-zA-Z0-9]", "");
            props.put("AECode", textToSent);
            BaseLibrary.sendKeysToWebElement(symbolTT, textToSent);

        } else {
            BaseLibrary.clearText(symbolTT);
            BaseLibrary.sendKeysToWebElement(symbolTT, textToSent);

        }
    }

    public void Qsr(String textToSent) throws Exception {
        BaseLibrary.clearText(qsrTT);
        BaseLibrary.clickOnTextFromDropdownList(qsrTT, textToSent);
        BaseLibrary.SetWaitTime(40);

    }

    public void ClearingBroker(String textToSent) throws Exception {
        BaseLibrary.clearText(clearingbrokerTT);
        BaseLibrary.sendKeysToWebElement(clearingbrokerTT, textToSent);
    }

    public void Type(String textToSent) throws Exception {
        BaseLibrary.clearText(typeTT);
        BaseLibrary.clickOnTextFromDropdownList(typeTT, textToSent);
    }

    public void BrokerEntry(String textToSent) throws Exception {
        BaseLibrary.sendKeysToWebElement(brokerentryTT, textToSent);

    }


    public void BrokerNumber(String textToSent) throws Exception {
        if (textToSent.contentEquals("Random_Number")) {
            BaseLibrary.clearText(brokernumberTT);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date) + " ");
            String data = formatter.format(date).toString().replaceAll("\\s+", " ");
            textToSent = data.replaceAll("[^a-zA-Z0-9]", "");
            props.put("AECode", textToSent);
            BaseLibrary.sendKeysToWebElement(brokernumberTT, textToSent);
            Pub_CCBroker = textToSent;
        } else {
            BaseLibrary.clearText(brokernumberTT);
            BaseLibrary.sendKeysToWebElement(brokernumberTT, textToSent);
            Pub_CCBroker = textToSent;
        }
    }

    public void filterAndVerifyfirstTrade() {

        try {
            /*Pub_partner = "PartvMugeHfD";
            Pub_office = "Auto105406";
            Pub_AccountNumber = "26082021105604";
            Pub_AccountName = "AN26082021105619";
            */

            BaseLibrary.SetWaitTime(1000);
            BaseLibrary.waitAndClickElement(By.xpath("//span[contains(text(),'Filter By')]"));
            BaseLibrary.SetWaitTime(400);
            BaseLibrary.clickOnTextFromDropdownList(By.xpath("//*[@id='filter_partner']"), Pub_partner);
            BaseLibrary.waitAndClickElement(By.xpath("(//button/span[@class='MuiButton-label'])[2]"));
            BaseLibrary.verifyTableListWithColName(Pub_partner, 1, "Correspondent");

        } catch (Exception Ex) {
            Ex.printStackTrace();
        }
    }


    public void navigateStockRecordScreen() throws Exception {
        By accounting = By.xpath("//*[@id='simple-menu']/ul/li[5]/em");
        By navigateStockJournal = By.xpath("//ul[@class='sub-menu-list']//li//a[text()='Stock Record']");
        BaseLibrary.waitAndClickElementsUsingByLocator(accounting);
        BaseLibrary.SetWaitTime(200);
        BaseLibrary.waitAndClickElement(navigateStockJournal);
        BaseLibrary.SetWaitTime(200);

    }

    public void navigateTradeListScreen() throws Exception {
        BaseLibrary.waitAndClickElement(By.xpath("//*[@id='simple-menu']/ul/li[4]/em"));
        BaseLibrary.SetWaitTime(1000);
        BaseLibrary.waitAndClickElement(By.xpath("(//li)[13]"));
    }


    public void verifyStockRecord() throws Exception {
        String FirstTradeEntry = "src/test/resources/testFiles/FirstTrade.xlsx";
        dd = dd = new DataDrivenUtility();
        dd.setExcelFile(FirstTradeEntry, "Scenario-1");
        BaseLibrary.waitAndClickElement(By.xpath("//span[contains(text(),'Filter By')]"));
        BaseLibrary.SetWaitTime(1000);
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//*[@id='filter_partner']"), Pub_partner);
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//*[@id='filter_account']"), Pub_AccountName);
        BaseLibrary.waitAndClickElement(By.xpath("(//button/span[@class='MuiButton-label'])[2]"));
        String Quan = dd.getCellData(9, 8);
        String Price = dd.getCellNumData(9, 9);
        BaseLibrary.VerifyTableDynamicText(Pub_AccountName);
        BaseLibrary.VerifyTableDynamicText(Price);
        BaseLibrary.VerifyTableDynamicText(Quan);


    }


    public void navigateStockLedgerScreen() throws Exception {
        By accounting = By.xpath("//*[@id='simple-menu']/ul/li[5]/em");
        By StockLedgerScree = By.xpath("//ul[@class='sub-menu-list']//li//a[text()='Stock Ledger']");
        BaseLibrary.waitAndClickElementsUsingByLocator(accounting);
        BaseLibrary.SetWaitTime(200);
        BaseLibrary.waitAndClickElement(StockLedgerScree);
        BaseLibrary.SetWaitTime(200);
    }

    public void verifyStockLedger() throws Exception {
        String FirstTradeEntry = "src/test/resources/testFiles/FirstTrade.xlsx";
        dd = dd = new DataDrivenUtility();
        dd.setExcelFile(FirstTradeEntry, "Scenario-1");
        BaseLibrary.waitAndClickElement(By.xpath("//span[contains(text(),'Filter By')]"));
        BaseLibrary.SetWaitTime(1000);
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//*[@id='filter_partner']"), Pub_partner);
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//*[@id='filter_account']"), Pub_AccountName);
        BaseLibrary.waitAndClickElement(By.xpath("(//button/span[@class='MuiButton-label'])[2]"));
        String Quan = dd.getCellData(10, 20);
        String Runningbalance = dd.getCellData(10, 21);
        BaseLibrary.VerifyTableDynamicText(Pub_AccountName);
        BaseLibrary.VerifyTableDynamicText(Runningbalance);
        BaseLibrary.VerifyTableDynamicText(Quan);
    }

    public void navigateCashLedgerScreen() throws Exception {
        By accounting = By.xpath("//*[@id='simple-menu']/ul/li[5]/em");
        By CashLedgerScreen = By.xpath("//ul[@class='sub-menu-list']//li//a[text()='Cash Ledger']");
        BaseLibrary.waitAndClickElementsUsingByLocator(accounting);
        BaseLibrary.SetWaitTime(200);
        BaseLibrary.waitAndClickElement(CashLedgerScreen);
        BaseLibrary.SetWaitTime(200);
    }

    public void verifyCashLedger() throws Exception {
        String FirstTradeEntry = "src/test/resources/testFiles/FirstTrade.xlsx";
        dd = dd = new DataDrivenUtility();
        dd.setExcelFile(FirstTradeEntry, "Scenario-1");
        BaseLibrary.waitAndClickElement(By.xpath("//span[contains(text(),'Filter By')]"));
        BaseLibrary.SetWaitTime(1000);
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//*[@id='filter_partner']"), Pub_partner);
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//*[@id='filter_account']"), Pub_AccountName);
        BaseLibrary.waitAndClickElement(By.xpath("(//button/span[@class='MuiButton-label'])[2]"));
        String Quan = dd.getCellData(10, 20);
        String Runningbalance = dd.getCellData(10, 21);
        BaseLibrary.VerifyTableDynamicText(Pub_AccountName);
        BaseLibrary.VerifyTableDynamicText(Runningbalance);
        BaseLibrary.VerifyTableDynamicText(Quan);
    }

    public void navigateTrailBalanceScreen() throws Exception {
        By accounting = By.xpath("//*[@id='simple-menu']/ul/li[5]/em");
        By trailBalanceScreen = By.xpath("//ul[@class='sub-menu-list']//li//a[text()='Trial Balance']");
        BaseLibrary.waitAndClickElementsUsingByLocator(accounting);
        BaseLibrary.SetWaitTime(200);
        BaseLibrary.waitAndClickElement(trailBalanceScreen);
        BaseLibrary.SetWaitTime(200);
    }


    public void verifyTrailBalance() throws Exception {
        String FirstTradeEntry = "src/test/resources/testFiles/FirstTrade.xlsx";
        dd = dd = new DataDrivenUtility();
        dd.setExcelFile(FirstTradeEntry, "Scenario-1");
        // BaseLibrary.waitAndClickElement(By.xpath("//span[contains(text(),'Filter By')]"));
        BaseLibrary.SetWaitTime(900);
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//*[@id='filter_partner']"), Pub_partner);
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//*[@id='filter_account']"), Pub_AccountName);
        BaseLibrary.waitAndClickElement(By.xpath("(//button/span[@class='MuiButton-label'])[3]"));
      //  BaseLibrary.verifyDynTable("Settlement Date","0","700");

    }


    public void navigateTaxLotScreen() throws Exception {
        By accounting = By.xpath("//*[@id='simple-menu']/ul/li[5]/em");
        By TaxLots = By.xpath("//ul[@class='sub-menu-list']//li//a[text()='Tax Lots']");
        BaseLibrary.waitAndClickElementsUsingByLocator(accounting);
        BaseLibrary.SetWaitTime(200);
        BaseLibrary.waitAndClickElement(TaxLots);
        BaseLibrary.SetWaitTime(600);
    }

    public void verifyTaxLot() throws Exception {
        String FirstTradeEntry = "src/test/resources/testFiles/FirstTrade.xlsx";
        dd = dd = new DataDrivenUtility();
        dd.setExcelFile(FirstTradeEntry, "Scenario-1");
        // BaseLibrary.waitAndClickElement(By.xpath("//span[contains(text(),'Filter By')]"));
        BaseLibrary.SetWaitTime(900);
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//*[@id='filter_accountNumber']"), Pub_AccountNumber);
        BaseLibrary.waitAndClickElement(By.xpath("(//button/span[@class='MuiButton-label'])[3]"));
        String quan = dd.getCellNumData(14, 22);
        String costBasic = dd.getCellNumData(14, 23);
        String marketPrice = dd.getCellNumData(14, 24);
        String marketValue = dd.getCellNumData(14, 25);
        String unrealizedPL = dd.getCellNumData(14, 26);

        BaseLibrary.VerifyTableDynamicText(quan);
        BaseLibrary.VerifyTableDynamicText(costBasic);
        BaseLibrary.VerifyTableDynamicText(marketPrice);
        BaseLibrary.VerifyTableDynamicText(marketValue);
        BaseLibrary.VerifyTableDynamicText(unrealizedPL);

    }


    public void loadTransactionTestDataFprP2(String firstTradeEntry) throws IOException {
        dd = dd = new DataDrivenUtility();
        dd.setExcelFile(firstTradeEntry, "PreReq");
        Pub_companyName = dd.getCellData(1,1);
        Pub_partner = dd.getCellData(2,1);
        Pub_office =  dd.getCellData(3,1);
        Pub_subOffice = dd.getCellData(4,1);
    }


    public void navigateSecurityMaster() throws Exception {
        By systemMaster2 = By.xpath("//*[@id='simple-menu']/ul/li[3]/em");
        By securityMaster = By.xpath("//ul[@class='sub-menu-list']//li//a[text()='Security Master']"); //// a[contains(text(),'Holiday')]
        BaseLibrary.waitAndClickElementsUsingByLocator(systemMaster2);
        BaseLibrary.SetWaitTime(400);
        BaseLibrary.waitAndClickElement(securityMaster);
    }

    public void enterSymbol(String textToSent) throws Exception {
        By nameOfSymbol = By.xpath("(//input)[2]");

        if (textToSent.contentEquals("Random_Symbol")) {
            BaseLibrary.clearText(nameOfSymbol);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date) + " ");
            textToSent = "Sybl" + formatter.format(date).toString().replaceAll("\\s+", " ");
            String data = textToSent.replaceAll("[^a-zA-Z0-9]", "");
            int curStamp = Integer.parseInt(data.substring(data.length() - 5, data.length()));
            BaseLibrary.sendKeysToWebElement(nameOfSymbol, data);
            DataDrivenUtility dd = new DataDrivenUtility();
            dd.setExcelFile("src/test/resources/testFiles/FirstTrade.xlsx","PreReq");
            dd.setCellValue(11,1,textToSent,"src/test/resources/testFiles/FirstTrade.xlsx");


        } else {
            BaseLibrary.clearText(nameOfSymbol);
            BaseLibrary.sendKeysToWebElement(nameOfSymbol, textToSent);
            props.put("Symbol", textToSent);


        }
    }

    public void enterSecurityNumber(String textToSent) throws Exception {
        By securityNumber = By.xpath("(//input)[3]");
        if (textToSent.contentEquals("Random_SecurityNumber")) {
            BaseLibrary.clearText(securityNumber);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date) + " ");
            String data = formatter.format(date).toString().replaceAll("\\s+", " ");
            textToSent = data.replaceAll("[^a-zA-Z0-9]", "");
            BaseLibrary.sendKeysToWebElement(securityNumber, textToSent);
        } else {
            BaseLibrary.clearText(securityNumber);
            BaseLibrary.sendKeysToWebElement(securityNumber, textToSent);
        }
    }


    public void selectAssertType(String textToSelect) throws Exception {
        By assertType = By.xpath("(//input)[4]");

        BaseLibrary.clickOnTextFromDropdownList(assertType, textToSelect);
        props.put("assertType", textToSelect);
    }

    public void selectSecType(String textToSelect) throws Exception {
        By secType = By.xpath("(//input)[5]");
        BaseLibrary.clickOnTextFromDropdownList(secType, textToSelect);
        props.put("secType", textToSelect);
    }



}


//


//







