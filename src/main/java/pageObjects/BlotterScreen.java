package pageObjects;

import baseMethods.BaseLibrary;
import org.openqa.selenium.By;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class BlotterScreen {

    Properties props = new Properties();

    By systemMaster = By.xpath("//*[@id='simple-menu']/ul/li[2]/em");
    By navigateBlotter = By.xpath("//ul[@class='sub-menu-list']//li//a[text()='Blotter Master']");
    By addBlotter = By.xpath("//*[text()='Add New Blotter']");
    By blotterNumber = By.xpath("(//input)[1]");
    By blotterName = By.xpath("(//input)[2]");
    By ContraAccount  = By.xpath("(//input)[3]");
    By BlotterExchangeCode  = By.xpath("(//input)[4]");
    By BlotterClearing  = By.xpath("(//input)[5]");
    By BlotterMethod   = By.xpath("(//input)[6]");
    By ProcessingInd   = By.xpath("(//input)[7]");
    By CompareCode  = By.xpath("(//input)[8]");
    By CompareFile  = By.xpath("(//input)[9]");
    By SettlementCode  = By.xpath("(//input)[10]");
    By SettlementCustodianNumber  = By.xpath("(//input)[11]");
    By SettlementBankNumber = By.xpath("(//input)[12]");
    By SettlementCurrency  = By.xpath("(//input)[13]");
    By BottlerSave  = By.xpath("//span[text()='Save']");
    By verifyBottlerMessage = By.xpath("//*[contains(text(),'Blotter has been created successfully!')]");
    By blotterSearchBox = By.xpath("//input[@id='outlined-basic']");
    By searchIcon = By.xpath("//i[@class='search-icon']");
    By editMessage =   By.xpath("//*[contains(text(),'has been saved successfully!')]");
    By closeValidation = By.xpath("//*[@title='Close']");
    By filterIcon = By.xpath("//span[contains(text(),'Filter By')]");
    By filterBlotterName = By.xpath("//input[@id='filter_name']");
    By filterBlotterNumber = By.xpath("//input[@id='filter_blotterNumber']");
    By filterSearch = By.xpath("//span[text()='Search']");

    public void NavigateBlotterScreen() throws Exception {
        BaseLibrary.SetWaitTime(1000);
        BaseLibrary.waitAndClickElementsUsingByLocator(systemMaster);
        BaseLibrary.SetWaitTime(1000);
        BaseLibrary.waitAndClickElement(navigateBlotter);
    }

    public void clickAddBlotter() throws Exception {
        BaseLibrary.waitAndClickElement(addBlotter);
    }

    public void enterBlotterNumber(String textToSent) throws Exception {
        if(textToSent.contentEquals("Random_Number")){
            BaseLibrary.clearText(blotterNumber);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date) + " ");
            String data = formatter.format(date).toString().replaceAll("\\s+", " ");
            textToSent = data.replaceAll("[^a-zA-Z0-9]", "");
            props.put("Blotter_Number", textToSent);
            BaseLibrary.sendKeysToWebElement(blotterNumber, textToSent);
        }else{
            BaseLibrary.clearText(blotterNumber);
            BaseLibrary.sendKeysToWebElement(blotterNumber, textToSent);
            props.put("Blotter_Number", textToSent);
        }
    }

    public void enterBlotterName(String textToSent) throws Exception {
        if(textToSent.contentEquals("Random_Name")){
            BaseLibrary.clearText(blotterName);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date) + " ");
            String data = "Auto" + formatter.format(date).toString().replaceAll("\\s+", " ");
            textToSent = data.replaceAll("[^a-zA-Z0-9]", "");
            BaseLibrary.sendKeysToWebElement(blotterName, textToSent);
            props.put("Blotter_Name", textToSent);
            String path = System.getProperty("user.dir") + "/src/test/resources/properties/blotter.properties";
            FileOutputStream outputStrem = new FileOutputStream(path);
            props.store(outputStrem, "This is a sample properties file");
        }else{
            BaseLibrary.clearText(blotterName);
            BaseLibrary.sendKeysToWebElement(blotterName, textToSent);
            props.put("Blotter_Name", textToSent);
            String path = System.getProperty("user.dir") + "/src/test/resources/properties/blotter.properties";
            FileOutputStream outputStrem = new FileOutputStream(path);
            props.store(outputStrem, "This is a sample properties file");
        }
    }


    public void selectContraAccount(String textToSent) throws Exception {

        if(textToSent.contentEquals("Random_GLCOANumber")) {
            Properties prop = readPropertiesFile(
                    System.getProperty("user.dir") + "/src/test/resources/properties/glcoa.properties");
            String glcoaName = prop.getProperty("glAccount_Number");
            BaseLibrary.setFocusToElement(ContraAccount);
            BaseLibrary.clickOnTextFromDropdownList(ContraAccount,glcoaName);
        }else{
            BaseLibrary.setFocusToElement(ContraAccount);
            BaseLibrary.clickOnTextFromDropdownList(ContraAccount,textToSent);
        }



    }

    public void selectBlotterExchangeCode(String textToSelect) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(BlotterExchangeCode,textToSelect);
    }

    public void selectBlotteClearingType(String textToSelect) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(BlotterClearing,textToSelect);
    }

    public void selectBlotterMethod(String textToSelect) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(BlotterMethod,textToSelect);
    }

    public void selectProcessingInd(String textToSelect) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(ProcessingInd,textToSelect);
    }

    public void selectCompareCode(String textToSelect) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(CompareCode,textToSelect);
    }

    public void selectCompareFile(String textToSelect) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(CompareFile,textToSelect);
    }

    public void enterSettlementCode(String textToSent) throws Exception {
        BaseLibrary.sendKeysToWebElement(SettlementCode, textToSent);
    }

    public void enterSettlementCustodianAccountNumber(String textToSent) throws Exception {
        BaseLibrary.sendKeysToWebElement(SettlementCustodianNumber, textToSent);
    }

    public void enterBankAccountNumber(String textToSent) throws Exception {
        BaseLibrary.sendKeysToWebElement(SettlementBankNumber, textToSent);
    }

    public void selectSettlementCurrency(String textToSelect) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(SettlementCurrency,textToSelect);
    }

    public void clickSaveBlotter() throws Exception {
        BaseLibrary.waitAndClickElement(BottlerSave);
    }

    public void verifyValidationMessageOnBlotterScreen() throws Exception {
        BaseLibrary.verifyText(verifyBottlerMessage,"Blotter has been created successfully!");
    }

    public void enterofficeNameInSearchBox() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/blotter.properties");
        String Loc_BlotterName = prop.getProperty("Blotter_Name");
        BaseLibrary.sendKeysToWebElement(blotterSearchBox, Loc_BlotterName);
        BaseLibrary.waitAndClickElementsUsingByLocator(searchIcon);
        BaseLibrary.highLightFirstRow(2,Loc_BlotterName);

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


        public void verifyValidationMessaeWithText(String data) throws Exception {
            //*[contains(text(),'Office has been created successfully!')]
            BaseLibrary.verifyText(editMessage,data);
            BaseLibrary.waitAndClickElement(closeValidation);

        }

    public void verifyBlotterNameOnList(String textToSent) throws Exception {

        if(textToSent.contentEquals("Random_Name")) {
            Properties prop = readPropertiesFile(
                    System.getProperty("user.dir") + "/src/test/resources/properties/blotter.properties");
            String Loc_BlotterName = prop.getProperty("Blotter_Name");
            By textVerify  = By.xpath("//*[contains(text(),'" + Loc_BlotterName + "')]");
            BaseLibrary.verifyText(textVerify, Loc_BlotterName);
        }else{
            By textVerify  = By.xpath("//*[contains(text(),'" + textToSent + "')]");
            BaseLibrary.verifyText(textVerify, textToSent);
        }
    }

    public void enterValueInSearchBox(String string) throws Exception {
        BaseLibrary.sendKeysToWebElement(blotterSearchBox, string);
        BaseLibrary.SetWaitTime(2000);
        BaseLibrary.waitAndClickElementsUsingByLocator(searchIcon);
    }

    public void verifyNoData(String textToVerify) throws Exception {
        By noDataOnTable = By.xpath("//*[contains(text(),'No data found')]");
        BaseLibrary.SetWaitTime(3000);
        BaseLibrary.verifyText(noDataOnTable,textToVerify);

    }

    public void clickFilterButtonOnBlotter() throws Exception {
        BaseLibrary.SetWaitTime(100);
        BaseLibrary.waitAndClickElementsUsingByLocator(filterIcon);
    }

    public void enterBlotterNameOnFilter(String textToSent) throws Exception {
        BaseLibrary.sendKeysToWebElement(filterBlotterName, textToSent);
    }

    public void clickBlotterFilterSearch() throws Exception {
        BaseLibrary.setFocusToElement(filterSearch);
        BaseLibrary.waitAndClickElementsUsingByLocator(filterSearch);
    }

    public void verifyAttributeValueOfBlotterName(String textToVerify) {
        BaseLibrary.verifyAttributeValue(blotterName,textToVerify);
    }

    public void verifyBlotterNumberOnList(String textToSent) throws Exception {
        if(textToSent.contentEquals("Blotter_Number")) {
            Properties prop = readPropertiesFile(
                    System.getProperty("user.dir") + "/src/test/resources/properties/blotter.properties");
            String Loc_BlotterNumber = prop.getProperty("Blotter_Number");
            By textVerify  = By.xpath("//*[contains(text(),'" + Loc_BlotterNumber + "')]");
            BaseLibrary.verifyText(textVerify, Loc_BlotterNumber);
        }else{
            By textVerify  = By.xpath("//*[contains(text(),'" + textToSent + "')]");
            BaseLibrary.verifyText(textVerify, textToSent);
        }
    }

    public void enterBlotterNumberOnFilter(String blotterNumber) throws Exception {
        BaseLibrary.sendKeysToWebElement(filterBlotterNumber, blotterNumber);
    }

    public void verifyAttributeValueOfBlotterNumber(String blotterNumber1) {
        BaseLibrary.verifyAttributeValue(blotterNumber,blotterNumber1);
    }
}
