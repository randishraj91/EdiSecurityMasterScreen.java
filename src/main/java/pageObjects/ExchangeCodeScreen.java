package pageObjects;

import baseMethods.BaseLibrary;
import baseMethods.DataDrivenUtility;
import org.openqa.selenium.By;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class ExchangeCodeScreen {

    public static DataDrivenUtility dd = null;
    public String dataSheetPath = System.getProperty("user.dir") + "/src/test/resources/testFiles/TestData.xlsx";

    public static String Pub_ExchangeCode = "";
    public static String Pub_ExchangeName = "";
    public static String Pub_MIC = "";
    public static String Pub_ExchangeEDI = "";
    public static String Pub_ExchangeDTC = "";
    public static String Pub_ExchangeOCC = "";
    public static String Pub_ExchangeIDSI = "";
    public static String Pub_ExchangeBS = "";


    By systemMaster = By.xpath("//*[@id='simple-menu']/ul/li[3]/em");
    By navigateExchange = By.xpath("//ul[@class='sub-menu-list']//li//a[text()='Exchange Codes']");
    By addNewExchange = By.xpath("//*[text()='Add New Exchange']");
    By ExchangeCode = By.xpath("//input[@class]");
    By ExchangeName = By.xpath("//input[@class]//following::input[1]");
    By MicCode = By.xpath("//input[@class]//following::input[2]");
    By EdiCode = By.xpath("//input[@class]//following::input[3]");
    By DtcMarketCode = By.xpath("//input[@class]//following::input[4]");
    By OccAcronym = By.xpath("//input[@class]//following::input[5]");
    By Idsi = By.xpath("//input[@class]//following::input[6]");
    By BlueSheet = By.xpath("//input[@class]//following::input[7]");

    By button_Save = By.xpath("//*[text()='Save']");
    By searchSettlement = By.xpath("//input[@id='outlined-basic']");
    By searchIcon = By.xpath("//i[@class='search-icon']");
    By exchangefilter = By.xpath("//span[text()='Filter By']");
    By filtercode = By.id("filter_exchangeCode");
    By filteridsi = By.id("filter_idsi");
    By filtername = By.id("filter_exchangeName");
    By filtermic = By.id("filter_micCode");
    By filterdtcmarket = By.id("filter_dtcMarketCode");
    By filteroccmarket = By.id("filter_occAcronym");
    By filterbluesheet = By.id("filter_blueSheet");
    By filteredi = By.id("filter_ediCode");

    By filtersearch = By.xpath("//span[text()='Search']");
    By filterreset = By.xpath("//span[text()='Reset']");
    By button_cancel = By.xpath("//*[text()='Cancel']");
    By cancel_yes = By.xpath("//span[text()='Yes, go back']");
    By cancel_No = By.xpath("//span[text()='No, Proceed']");
    By ExchangeEditclick = By.xpath("//*[@class='MuiTableCell-root MuiTableCell-body link  MuiTableCell-sizeSmall']");

    By listcode = By.xpath("//em[text()='Exchange Code']");
    By listname = By.xpath("//em[text()='Exchange Name']");
    By listmic = By.xpath("//em[text()='Mic Code']");
    By listdtc = By.xpath("//em[text()='DTC Market Code']");
    By listocc = By.xpath("//em[text()='Occ Acronym']");
    By listblue = By.xpath("//em[text()='Blue Sheet']");
    By listidsi = By.xpath("//em[text()='IDSI']");
    By textTooVerify = By.xpath("//*[contains(text(),'Exchange code has been created successfully!')]");
    By noDataOnTable = By.xpath("//*[contains(text(),'No data found')]");

    By editMessage = By.xpath("//*[contains(text(),'has been saved successfully!')]");
    By closeValidation = By.xpath("//*[@title='Close']");
    By exportlink = By.xpath("//*[@class='MuiSvgIcon-root']");
    By exportbutton = By.xpath("//li[@role='menuitem']");

    public void clickSystemMaster() throws Exception {

        BaseLibrary.waitAndClickElementsUsingByLocator(systemMaster);
        BaseLibrary.SetWaitTime(2000);
        BaseLibrary.waitAndClickElement(navigateExchange);
    }

    public void addNewExecutive() throws Exception {

        BaseLibrary.waitAndClickElementsUsingByLocator(addNewExchange);


    }

    public void exchangecode(String textToSent) throws Exception {
        if (textToSent.contentEquals("Random_Code")) {

            Random r = new Random();
            int low = 10000;
            int high = 10000000;
            int result = r.nextInt(high - low) + low;
            textToSent = Integer.toString(result);
            BaseLibrary.clearText(ExchangeCode);
            BaseLibrary.sendKeysToWebElement(ExchangeCode, textToSent);
            DataDrivenUtility dd = new DataDrivenUtility();
            dd.setExcelFile(dataSheetPath, "Exchange Code");
            dd.setCellValue(1, 1, textToSent, dataSheetPath);

        } else {
            BaseLibrary.clearText(ExchangeCode);
            BaseLibrary.sendKeysToWebElement(ExchangeCode, textToSent);
        }
    }

    public void exchangename(String textToSent) throws Exception {

        if (textToSent.contentEquals("Random_ExchangeName")) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date) + " ");
            String data = formatter.format(date).toString().replaceAll("\\s+", " ");
            textToSent = "EN" + data.replaceAll("[^a-zA-Z0-9]", "");
            BaseLibrary.clearText(ExchangeName);
            BaseLibrary.sendKeysToWebElement(ExchangeName, textToSent);
            DataDrivenUtility dd = new DataDrivenUtility();
            dd.setExcelFile(dataSheetPath, "Exchange Code");
            dd.setCellValue(2, 1, textToSent, dataSheetPath);

        } else {
            BaseLibrary.clearText(ExchangeName);
            BaseLibrary.sendKeysToWebElement(ExchangeName, textToSent);
        }

    }

    public void miccode(String textToSent) throws Exception {

        if (textToSent.contentEquals("Random_ExchangeMIC")) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date) + " ");
            String data = formatter.format(date).toString().replaceAll("\\s+", " ");
            textToSent = "MIC" + data.replaceAll("[^a-zA-Z0-9]", "");
            BaseLibrary.clearText(MicCode);
            BaseLibrary.sendKeysToWebElement(MicCode, textToSent);
            DataDrivenUtility dd = new DataDrivenUtility();
            dd.setExcelFile(dataSheetPath, "Exchange Code");
            dd.setCellValue(3, 1, textToSent, dataSheetPath);

        } else {
            BaseLibrary.clearText(MicCode);
            BaseLibrary.sendKeysToWebElement(MicCode, textToSent);
        }
    }

    public void edicode(String textToSent) throws Exception {

        if (textToSent.contentEquals("Random_ExchangeEDI")) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date) + " ");
            String data = formatter.format(date).toString().replaceAll("\\s+", " ");
            textToSent = "EDI" + data.replaceAll("[^a-zA-Z0-9]", "");
            BaseLibrary.clearText(EdiCode);
            BaseLibrary.sendKeysToWebElement(EdiCode, textToSent);
            DataDrivenUtility dd = new DataDrivenUtility();
            dd.setExcelFile(dataSheetPath, "Exchange Code");
            dd.setCellValue(4, 1, textToSent, dataSheetPath);

        } else {
            BaseLibrary.clearText(EdiCode);
            BaseLibrary.sendKeysToWebElement(EdiCode, textToSent);
        }

    }

    public void dtcmarket(String textToSent) throws Exception {

        if (textToSent.contentEquals("Random_ExchangeDTC")) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date) + " ");
            String data = formatter.format(date).toString().replaceAll("\\s+", " ");
            textToSent = "DTC" + data.replaceAll("[^a-zA-Z0-9]", "");
            BaseLibrary.clearText(DtcMarketCode);
            BaseLibrary.sendKeysToWebElement(DtcMarketCode, textToSent);
            DataDrivenUtility dd = new DataDrivenUtility();
            dd.setExcelFile(dataSheetPath, "Exchange Code");
            dd.setCellValue(5, 1, textToSent, dataSheetPath);

        } else {
            BaseLibrary.clearText(DtcMarketCode);
            BaseLibrary.sendKeysToWebElement(DtcMarketCode, textToSent);
        }

    }

    public void occacronym(String textToSent) throws Exception {

        //BaseLibrary.sendKeysToWebElement(OccAcronym, textToSent);
        if (textToSent.contentEquals("Random_ExchangeOCC")) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date) + " ");
            String data = formatter.format(date).toString().replaceAll("\\s+", " ");
            textToSent = "Occ" + data.replaceAll("[^a-zA-Z0-9]", "");
            BaseLibrary.clearText(OccAcronym);
            BaseLibrary.sendKeysToWebElement(OccAcronym, textToSent);
            DataDrivenUtility dd = new DataDrivenUtility();
            dd.setExcelFile(dataSheetPath, "Exchange Code");
            dd.setCellValue(6, 1, textToSent, dataSheetPath);

        } else {
            BaseLibrary.clearText(OccAcronym);
            BaseLibrary.sendKeysToWebElement(OccAcronym, textToSent);
        }

    }

    public void idsi(String textToSent) throws Exception {

        //BaseLibrary.clearText(Idsi);
        //BaseLibrary.clickOnTextFromDropdownList(Idsi, textToSent);

        if (textToSent.contentEquals("Random_ExchangeIDSI")) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date) + " ");
            String data = formatter.format(date).toString().replaceAll("\\s+", " ");
            textToSent = "IDSI" + data.replaceAll("[^a-zA-Z0-9]", "");
            BaseLibrary.clearText(Idsi);
            BaseLibrary.sendKeysToWebElement(Idsi, textToSent);
            DataDrivenUtility dd = new DataDrivenUtility();
            dd.setExcelFile(dataSheetPath, "Exchange Code");
            dd.setCellValue(7, 1, textToSent, dataSheetPath);

        } else {
            BaseLibrary.clearText(Idsi);
            BaseLibrary.sendKeysToWebElement(Idsi, textToSent);
        }

    }

    public void BlueSheet(String textToSent) throws Exception {


        //	BaseLibrary.clickOnTextFromDropdownList(BlueSheet, textToSent);

        if (textToSent.contentEquals("Random_ExchangeBS")) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date) + " ");
            String data = formatter.format(date).toString().replaceAll("\\s+", " ");
            textToSent = "BS" + data.replaceAll("[^a-zA-Z0-9]", "");
            BaseLibrary.clearText(BlueSheet);
            BaseLibrary.sendKeysToWebElement(BlueSheet, textToSent);
            DataDrivenUtility dd = new DataDrivenUtility();
            dd.setExcelFile(dataSheetPath, "Exchange Code");
            dd.setCellValue(8, 1, textToSent, dataSheetPath);

        } else {
            BaseLibrary.clearText(BlueSheet);
            BaseLibrary.sendKeysToWebElement(BlueSheet, textToSent);
        }

    }


    public void clickSave() throws Exception {

        BaseLibrary.waitAndClickElementsUsingByLocator(button_Save);
        BaseLibrary.SetWaitTime(30);


    }

    public void enterInSearchBox(String textToSent) throws Exception {
        BaseLibrary.SetWaitTime(10);

        BaseLibrary.sendKeysToWebElement(searchSettlement, Pub_ExchangeIDSI);
        BaseLibrary.waitAndClickElementsUsingByLocator(searchIcon);
    }

    public void enterInSearchBoxforNoData(String textToSent) throws Exception {
        BaseLibrary.SetWaitTime(10);

        BaseLibrary.sendKeysToWebElement(searchSettlement, textToSent);
        BaseLibrary.waitAndClickElementsUsingByLocator(searchIcon);
    }

    public void ExchangeFilter() throws Exception {

        BaseLibrary.waitAndClickElementsUsingByLocator(exchangefilter);


    }

    public void filterexecode(String textToSent) throws Exception {
        BaseLibrary.SetWaitTime(30);
        BaseLibrary.sendKeysToWebElement(filtercode, textToSent);
        BaseLibrary.setFocusToElement(filtersearch);
        BaseLibrary.SetWaitTime(10);
    }

    public void filterdtcmarket(String textToSent) throws Exception {
        BaseLibrary.SetWaitTime(1000);
        BaseLibrary.sendKeysToWebElement(filterdtcmarket, Pub_ExchangeDTC);
        BaseLibrary.setFocusToElement(filtersearch);
        BaseLibrary.SetWaitTime(1000);
    }

    public void filterocc(String textToSent) throws Exception {
        BaseLibrary.SetWaitTime(1000);
        BaseLibrary.sendKeysToWebElement(filteroccmarket, Pub_ExchangeOCC);
        BaseLibrary.setFocusToElement(filtersearch);
        BaseLibrary.SetWaitTime(1000);
    }

    public void filterbluesheet(String textToSent) throws Exception {
        BaseLibrary.SetWaitTime(1000);
        BaseLibrary.sendKeysToWebElement(filterbluesheet, Pub_ExchangeBS);
        BaseLibrary.setFocusToElement(filtersearch);
        BaseLibrary.SetWaitTime(1000);
    }

    public void filtername(String textToSent) throws Exception {
        BaseLibrary.SetWaitTime(10);
        BaseLibrary.sendKeysToWebElement(filtername, Pub_ExchangeName);
        BaseLibrary.setFocusToElement(filtersearch);
        BaseLibrary.SetWaitTime(10);
    }

    public void filtermic(String textToSent) throws Exception {
        BaseLibrary.SetWaitTime(1000);
        BaseLibrary.sendKeysToWebElement(filtermic, Pub_MIC);
        BaseLibrary.setFocusToElement(filtersearch);
        BaseLibrary.SetWaitTime(1000);
    }

    public void filteredi(String textToSent) throws Exception {
        BaseLibrary.SetWaitTime(1000);
        BaseLibrary.sendKeysToWebElement(filteredi, textToSent);
        BaseLibrary.setFocusToElement(filtersearch);
        BaseLibrary.SetWaitTime(1000);
    }

    public void filteridsi(String textToSent) throws Exception {
        BaseLibrary.SetWaitTime(10);
        BaseLibrary.sendKeysToWebElement(filteridsi, Pub_ExchangeIDSI);
        BaseLibrary.setFocusToElement(filtersearch);
        BaseLibrary.SetWaitTime(10);
    }

    public void FilterSearch() throws Exception {

        BaseLibrary.SetWaitTime(10);
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

    public void ExchangeEdit() throws Exception {

       BaseLibrary.clickOnDynText(Pub_ExchangeName);
        BaseLibrary.SetWaitTime(30);

    }

    public void verifyIdsi(String name1) throws Exception {

        BaseLibrary.setFocusToElement(listidsi);
        BaseLibrary.verifyTableListWithSingleColumnWithName(Pub_ExchangeIDSI, "IDSI");

    }

    public void verifyDtc(String name1) throws Exception {

        BaseLibrary.setFocusToElement(listdtc);
        BaseLibrary.verifyTableListWithSingleColumnWithName(Pub_ExchangeDTC, "DTC Market Code");

    }

    public void verifyOcc(String name) throws Exception {
        BaseLibrary.SetWaitTime(1500);
        BaseLibrary.verifyTableListWithSingleColumnWithName(Pub_ExchangeOCC, "OCC Acronym");

    }

    public void verifyBluesheet(String name) throws Exception {

        BaseLibrary.SetWaitTime(1500);
        BaseLibrary.verifyTableListWithSingleColumnWithName(Pub_ExchangeBS, "Blue Sheet");

    }

    public void verifyExchangeCode(String name) throws Exception {

        BaseLibrary.setFocusToElement(listcode);
        BaseLibrary.verifyTableListWithSingleColumnWithName(name, "Exchange Code");

    }

    public void verifyExchangename(String name1) throws Exception {

        BaseLibrary.SetWaitTime(1500);
        BaseLibrary.VerifyDynText(Pub_ExchangeName);
    }

    public void verifyMiccode(String name) throws Exception {

        BaseLibrary.SetWaitTime(1500);
        BaseLibrary.verifyTableListWithSingleColumnWithName(Pub_MIC, "MIC Code");

    }

    public void verifyValidationMessage() throws Exception {
        //*[contains(text(),'Office has been created successfully!')]
        BaseLibrary.verifyText(textTooVerify, "Exchange code has been created successfully!");
    }

    public void verifyNoDataDisplayed(String textToVerify) throws Exception {
        BaseLibrary.SetWaitTime(3000);
        BaseLibrary.verifyText(noDataOnTable, textToVerify);
    }

    public void verifyValidationMessaeWithText(String strVerify) throws Exception {
        BaseLibrary.verifyText(editMessage, strVerify);
        BaseLibrary.waitAndClickElement(closeValidation);
    }

    public void Export() throws Exception {
        BaseLibrary.waitAndClickElementsUsingByLocator(exportlink);
        BaseLibrary.waitAndClickElementsUsingByLocator(exportbutton);
        BaseLibrary.SetWaitTime(1000);

    }

    public void loadTestData() throws IOException {
        dd = new DataDrivenUtility();
        dd.setExcelFile(dataSheetPath, "Exchange Code");
        Pub_ExchangeCode = dd.getCellData(1, 1);
        Pub_ExchangeName = dd.getCellData(2, 1);
        Pub_MIC = dd.getCellData(3, 1);
        Pub_ExchangeEDI = dd.getCellData(4, 1);
        Pub_ExchangeDTC = dd.getCellData(5, 1);
        Pub_ExchangeOCC = dd.getCellData(6, 1);
        Pub_ExchangeIDSI = dd.getCellData(7, 1);
        Pub_ExchangeBS = dd.getCellData(8, 1);
    }


}