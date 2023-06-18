package pageObjects;

import baseMethods.BaseLibrary;
import baseMethods.DataDrivenUtility;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

public class SecurityMasterScreen {

    public int curStamp = 0;
    public static String Pub_Symbol = "";
    public static String Pub_SymNo = "";
    public static String Pub_CUSIP = "";
    public static String Pub_SEDOL = "";
    public static String Pub_ISIN = "";
    public static String Pub_AssertType = "";
    public static String Pub_SecurityType = "";
    public static DataDrivenUtility dd = null;
    public String dataSheetPath = System.getProperty("user.dir") + "/src/test/resources/testFiles/TestData.xlsx";
    Properties props = new Properties();

    By systemMaster = By.xpath("//*[@id='simple-menu']/ul/li[3]/em");
    By securityMaster = By.xpath("//ul[@class='sub-menu-list']//li//a[text()='Security Master']"); //// a[contains(text(),'Holiday')]
    By addsecurityMaster = By.xpath("//*[text()='Add New Security']");
    By textfield_Message = By.xpath("//*[@id='root']/div/div/div[1]/div/div/div[2]");
    By button_Submit = By.xpath("//span[text()='Save']");
    By nameOfSymbol = By.xpath("(//input)[2]");
    By securityNumber = By.xpath("(//input)[3]");
    By assertType = By.xpath("(//input)[4]");
    By secType = By.xpath("(//input)[5]");
    By CUSIP = By.xpath("(//input)[1]");
    By SEDOL = By.xpath("(//input)[2]");
    By ISIN = By.xpath("(//input)[3]");
    By secSubType = By.xpath("(//input)[4]");
    By exchange = By.xpath("(//input)[5]");
    By status = By.xpath("(//input)[6]");
    By country = By.xpath("(//input)[7]");
    By pmGroup = By.xpath("(//input)[8]");
    By pmVolatility = By.xpath("(//input)[9]");
    By outstandingShareDate = By.xpath("(//input)[10]");
    By issuer = By.xpath("(//input)[11]");
    By outstandingShares = By.xpath("(//input)[12]");
    By MIC = By.xpath("(//input)[13]");
    By FedTaxable = By.xpath("(//input)[14]");
    By stateTaxable = By.xpath("(//input)[15]");
    By firmSecSubType = By.xpath("(//input)[16]");
    By fixedLongRate = By.xpath("(//input)[1]");
    By fixedShortRate = By.xpath("(//input)[2]");
    By exchangeLongRate = By.xpath("(//input)[3]");
    By exchangeShortRate = By.xpath("(//input)[4]");
    By houseLongRate = By.xpath("(//input)[5]");
    By houseShortRate = By.xpath("(//input)[6]");
    By smSearchBox = By.id("outlined-basic");


    By PMhouseLongRate = By.xpath("(//input)[7]");
    By PMhouseShortRate = By.xpath("(//input)[8]");
    By PMhedgeLongRate = By.xpath("(//input)[9]");
    By PMhedgeShortRate = By.xpath("(//input)[10]");
    By PMExchnLongRate = By.xpath("(//input)[11]");
    By PMExchnShortRate = By.xpath("(//input)[12]");


    By sweepDestination = By.xpath("(//input)[1]");
    By sweepCode = By.xpath("(//input)[2]");
    By currency = By.xpath("(//input)[3]");

    By SICcd = By.xpath("(//input)[1]");
    By price = By.id("add_Price");
    By selectCurrency = By.id("add_currency");
    By contactAddress = By.xpath("(//input)[1]");
    By CCurencyType = By.xpath("(//input)[2]");
    By alternativeSymbol = By.xpath("(//input)[3]");
    By editMessage = By.xpath("//*[contains(text(),'has been saved successfully!')]");
    By closeValidation = By.xpath("//*[@title='Close']");


    By searchIcon = By.xpath("//i[@class='search-icon']");
    By filterIcon = By.xpath("//span[contains(text(),'Filter By')]");
    By filterHolidayName = By.xpath("//input[@id='filter_holidayName']");
    By filterSearch = By.xpath("//span[text()='Search']");
    By filterHolidayCountry = By.xpath("//*[@id='filter_country']");
    By filterHolidayDate = By.xpath("//input[@id='filter_holidayDate']");
    By filterHolidayAssertType = By.xpath("//input[@id='filter_assetType']");
    By filterHolidaySecurityType = By.xpath("//input[@id='filter_securityType']");
    By filterTradeHoliday = By.xpath("//input[@id='filter_isTrading']");
    By filterSettlementHoliday = By.xpath("//input[@id='filter_isSettlement']");
    By noDataOnTable = By.xpath("//*[contains(text(),'No data found')]");
    By filterSymbol = By.id("filter_symbol");
    By filterAssertType = By.xpath("//*[@id='filter_assetType']");
    By filterSecType = By.id("filter_secType");


    public void clickSystemMaster() throws Exception {
        BaseLibrary.waitAndClickElementsUsingByLocator(systemMaster);
        BaseLibrary.SetWaitTime(400);
        BaseLibrary.waitAndClickElement(securityMaster);
    }


    public void addNewSecurityMaster() throws Exception {
        BaseLibrary.SetWaitTime(1000);
        BaseLibrary.waitAndClickElement(addsecurityMaster);
    }


    public void verifyLabels() throws Exception {
        BaseLibrary.verifyText(By.xpath("//button/span[contains(text(),'Symbol')]"), "Symbol");
        BaseLibrary.verifyText(By.xpath("//button/span[contains(text(),'Security Master')]"), "Security Master");
        BaseLibrary.verifyText(By.xpath("//button/span[contains(text(),'Security Margin')]"), "Security Margin");
        BaseLibrary.verifyText(By.xpath("//button/span[contains(text(),'Security Settlement')]"), "Security Settlement");
        BaseLibrary.verifyText(By.xpath("//button/span[contains(text(),'Security Classification')]"), "Security Classification");
        BaseLibrary.verifyText(By.xpath("//button/span[contains(text(),'Security Prices')]"), "Security Prices");
        // BaseLibrary.verifyText(By.xpath("//button/span[contains(text(),'* - Mandatory Fields')]"), "* - Mandatory Fields");
        // BaseLibrary.verifyText(By.xpath("//button/span[contains(text(),' - Mandatory Fields Section')]"), " - Mandatory Fields Section");
        // BaseLibrary.verifyText(By.xpath("//button/span[contains(text(),'Note - Can fill only the mandatory fields and submit for now')]"), "Note - Can fill only the mandatory fields and submit for now");
    }


    public void enterSymbol(String textToSent) throws Exception {
        // BaseLibrary.sendKeysToWebElement(nameOfSymbol,testToSent);
        if (textToSent.contentEquals("Random_Symbol")) {
            BaseLibrary.clearText(nameOfSymbol);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date) + " ");
            textToSent = "Sybl" + formatter.format(date).toString().replaceAll("\\s+", " ");

            String data = textToSent.replaceAll("[^a-zA-Z0-9]", "");
            int curStamp = Integer.parseInt(data.substring(data.length() - 5, data.length()));
            BaseLibrary.sendKeysToWebElement(nameOfSymbol, data);
            dd = new DataDrivenUtility();
            dd.setExcelFile(dataSheetPath, "Security Master");
            dd.setCellValue(1,1,data,dataSheetPath);
        } else {
            BaseLibrary.clearText(nameOfSymbol);
            BaseLibrary.sendKeysToWebElement(nameOfSymbol, textToSent);

            props.put("Symbol", textToSent);
            textToSent = "Random_Name";

        }

    }

    public void enterSecurityNumber(String textToSent) throws Exception {
        // BaseLibrary.sendKeysToWebElement(nameOfSymbol,textToSent);
        if (textToSent.contentEquals("Random_SecurityNumber")) {
            BaseLibrary.clearText(securityNumber);
            Random r = new Random();
            int low = 100000;
            int high = 7000000;
            int result = r.nextInt(high-low) + low;
            textToSent = Integer.toString(result);
            // BaseLibrary.sendKeysToWebElement(officeName, textToSent);
            //  props.put("securityNumber", textToSent);

            dd = new DataDrivenUtility();
            dd.setExcelFile(dataSheetPath, "Security Master");
            BaseLibrary.sendKeysToWebElement(securityNumber, textToSent);
            dd.setCellValue(2,1,textToSent,dataSheetPath);
            textToSent = "";
        } else {
            BaseLibrary.clearText(securityNumber);
            BaseLibrary.sendKeysToWebElement(securityNumber, textToSent);
        }
    }

    public void selectAssertType(String textToSelect) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(assertType, textToSelect);
        props.put("assertType", textToSelect);
        dd = new DataDrivenUtility();
        dd.setExcelFile(dataSheetPath, "Security Master");
        //  textToSelect = "CR - "+textToSelect;
        dd.setCellValue(6,1,textToSelect,dataSheetPath);
    }

    public void selectSecType(String textToSelect) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(secType, textToSelect);
        props.put("secType", textToSelect);
        dd = new DataDrivenUtility();
        dd.setExcelFile(dataSheetPath, "Security Master");
        //   textToSelect = "FI - "+textToSelect;
        dd.setCellValue(7,1,textToSelect,dataSheetPath);
    }

    public void enterCUSIP(String textToSent) throws Exception {
        if (textToSent.contentEquals("Random_CUSIP")) {
            BaseLibrary.waitAndClickElement(By.xpath("//button/span[contains(text(),'Security Master')]"));
            BaseLibrary.clearText(CUSIP);
            Random r = new Random();
            int low = 100000;
            int high = 7000000;
            int result = r.nextInt(high-low) + low;
            textToSent = Integer.toString(result);
            // BaseLibrary.sendKeysToWebElement(officeName, textToSent);
            // props.put("CUSIP", textToSent);

            dd = new DataDrivenUtility();
            dd.setExcelFile(dataSheetPath, "Security Master");
            BaseLibrary.sendKeysToWebElement(CUSIP, textToSent);
            dd.setCellValue(3,1,textToSent,dataSheetPath);
            textToSent= "";

        } else {
            BaseLibrary.clearText(CUSIP);
            BaseLibrary.sendKeysToWebElement(CUSIP, textToSent);
        }
    }

    public void enterSEDOL(String textToSent) throws Exception {
        if (textToSent.contentEquals("Random_SEDOL")) {
            //  BaseLibrary.waitAndClickElement(By.xpath("//button/span[contains(text(),'Security Master')]"));
            BaseLibrary.clearText(SEDOL);
            Random r = new Random();
            int low = 100000;
            int high = 7000000;
            int result = r.nextInt(high-low) + low;
            textToSent = Integer.toString(result);
            // BaseLibrary.sendKeysToWebElement(officeName, textToSent);
            // props.put("securityNumber", textToSent);

            dd = new DataDrivenUtility();
            dd.setExcelFile(dataSheetPath, "Security Master");
            BaseLibrary.sendKeysToWebElement(SEDOL, textToSent);
            dd.setCellValue(4,1,textToSent,dataSheetPath);
            textToSent= "";
        } else {
            BaseLibrary.clearText(SEDOL);
            BaseLibrary.sendKeysToWebElement(SEDOL, textToSent);
        }
    }

    public void enterISIN(String textToSent) throws Exception {
        if (textToSent.contentEquals("Random_ISIN")) {
            //  BaseLibrary.waitAndClickElement(By.xpath("//button/span[contains(text(),'Security Master')]"));
            BaseLibrary.clearText(ISIN);
            Random r = new Random();
            int low = 100000;
            int high = 7000000;
            int result = r.nextInt(high-low) + low;
            textToSent = Integer.toString(result);
            // BaseLibrary.sendKeysToWebElement(officeName, textToSent);
            // props.put("securityNumber", textToSent);

            dd = new DataDrivenUtility();
            dd.setExcelFile(dataSheetPath, "Security Master");
            BaseLibrary.sendKeysToWebElement(ISIN, textToSent);
            dd.setCellValue(5,1,textToSent,dataSheetPath);
            textToSent= "";
        } else {
            BaseLibrary.clearText(ISIN);
            BaseLibrary.sendKeysToWebElement(ISIN, textToSent);
        }
    }

    public void selectSecSubType(String textToSelect) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(secSubType, textToSelect);
        // props.put("secSubType", textToSelect);
    }

    public void selectExchange(String textToSent) throws Exception {
        if (textToSent.contentEquals("Random_ExchangeCode")) {
            //  BaseLibrary.waitAndClickElement(By.xpath("//button/span[contains(text(),'Security Master')]"));
            //need to add prop
            BaseLibrary.clickOnTextFromDropdownList(exchange, textToSent);
            // props.put("exchange", textToSent);
        } else {

            BaseLibrary.clickOnTextFromDropdownList(exchange, textToSent);
            //  props.put("exchange", textToSent);
        }

    }

    public void selectStatus(String textToSent) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(status, textToSent);
        // props.put("status", textToSent);
    }

    public void selectCountry(String textToSent) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(country, textToSent);
        // props.put("country", textToSent);
    }

    public void selectRegFeeCharge(String textToSent) throws Exception {
        if (textToSent.toLowerCase().contentEquals("yes")) {

            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//div[@id='add_reg_fee_charge']//*[contains(text(),'Yes')]"));
            // props.put("PennyPilot", "Yes");
        } else {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//div[@id='add_reg_fee_charge']//*[contains(text(),'No')]"));
            //  props.put("PennyPilot", "No");

        }
    }


    public void enterPMGroup(String textToSent) throws Exception {
        BaseLibrary.scrollDownBy350();
        BaseLibrary.scrollDownBy350();
        BaseLibrary.setFocusToElement(firmSecSubType);
        BaseLibrary.sendKeysToWebElement(pmGroup, textToSent);
        // props.put("pmGroup", textToSent);
    }

    public void enterVolatility(String textToSent) throws Exception {
        BaseLibrary.sendKeysToWebElement(pmVolatility, textToSent);
        //  props.put("pmVolatility", textToSent);
    }


    public void enterOutstandingSharesDates(String textToSent) throws Exception {
        if (textToSent.contentEquals("Random_Date")) {
            Faker faker = new Faker();
            SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
            Date date = new Date();
            System.out.println(formatter.format(date) + "Parsed Date");

            String oldDate = formatter.format(date);
            System.out.println("Date before Addition: " + oldDate);
            SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
            Calendar c = Calendar.getInstance();
            try {
                c.setTime(sdf.parse(oldDate));
            } catch (Exception e) {
                e.printStackTrace();
            }
            c.add(Calendar.DAY_OF_MONTH,
                    faker.number().randomDigit() + curStamp + curStamp + faker.number().randomDigit());
            String newDate = sdf.format(c.getTime());
            System.out.println("Date after Addition: " + newDate);
            textToSent = newDate;
            BaseLibrary.waitAndClickElement(outstandingShareDate);
            BaseLibrary.sendKeysToWebElement(outstandingShareDate, textToSent);
            // props.put("outstandingShareDate", textToSent);
        } else {
            BaseLibrary.sentTextUsingJS(outstandingShareDate, textToSent);
        }

    }

    public void selectIssuer(String textToSent) throws Exception {

        BaseLibrary.clickOnTextFromDropdownList(issuer, textToSent);
        // props.put("issuer", textToSent);
    }


    public void selectPennyPilot(String textToSent) throws Exception {
        if (textToSent.toLowerCase().contentEquals("yes")) {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//div[@id='add_penny_pilot']//*[contains(text(),'Yes')]"));
            //  props.put("PennyPilot", "Yes");
        } else {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//div[@id='add_penny_pilot0']//*[contains(text(),'No')]"));
            //   props.put("PennyPilot", "No");

        }
    }

    public void enterOutstandingShares(String textToSent) throws Exception {
        BaseLibrary.sendKeysToWebElement(outstandingShares, textToSent);
    }

    public void enterMIC(String textToSent) throws Exception {

        BaseLibrary.sendKeysToWebElement(MIC, textToSent);
    }


    public void selectFedTaxable(String textToSent) throws Exception {
        if (textToSent.contentEquals("Random_FedTaxable")) {
            BaseLibrary.clickOnTextFromDropdownList(FedTaxable, textToSent);
            // props.put("FedTaxable", FedTaxable);
        } else {
            BaseLibrary.clickOnTextFromDropdownList(FedTaxable, textToSent);
            //   props.put("FedTaxable", FedTaxable);
        }

    }

    public void selectStateTaxable(String textToSent) throws Exception {
        if (textToSent.contentEquals("Random_StateTaxable")) {
            //  BaseLibrary.waitAndClickElement(By.xpath("//button/span[contains(text(),'Security Master')]"));
            //need to add prop
            BaseLibrary.clickOnTextFromDropdownList(stateTaxable, textToSent);
            //   props.put("stateTaxable", stateTaxable);
        } else {
            BaseLibrary.clickOnTextFromDropdownList(stateTaxable, textToSent);
            //  props.put("stateTaxable", stateTaxable);
        }
    }

    public void selectFirmSecSubType(String textToSent) throws Exception {
        if (textToSent.contentEquals("Random_firmSecSubType")) {
            //  BaseLibrary.waitAndClickElement(By.xpath("//button/span[contains(text(),'Security Master')]"));
            //need to add prop
            BaseLibrary.clickOnTextFromDropdownList(stateTaxable, textToSent);
            //   props.put("firmSecSubType", firmSecSubType);
        } else {
            BaseLibrary.clickOnTextFromDropdownList(firmSecSubType, textToSent);
            //   props.put("firmSecSubType", firmSecSubType);
        }
    }


    public void selectMarginable(String textToSent) throws Exception {
        BaseLibrary.waitAndClickElement(By.xpath("//button/span[contains(text(),'Security Margin')]"));
        if (textToSent.toLowerCase().contentEquals("yes")) {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//div[@id='add_marginable']//*[contains(text(),'Yes')]"));
            //   props.put("PennyPilot", "Yes");
        } else {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//div[@id='add_marginable']//*[contains(text(),'No')]"));
            //   props.put("PennyPilot", "No");

        }
    }

    public void enterFedLongRate(String textToSent) throws Exception {

        BaseLibrary.sendKeysToWebElement(fixedLongRate, textToSent);
    }

    public void enterFedShortRate(String textToSent) throws Exception {
        BaseLibrary.sendKeysToWebElement(fixedShortRate, textToSent);
    }


    public void enterExchangeLongRate(String textToSent) throws Exception {
        BaseLibrary.sendKeysToWebElement(exchangeLongRate, textToSent);
    }

    public void enterExchangeShortRate(String textToSent) throws Exception {
        BaseLibrary.sendKeysToWebElement(exchangeShortRate, textToSent);
    }

    public void enterHouseLongRate(String textToSent) throws Exception {
        BaseLibrary.sendKeysToWebElement(houseLongRate, textToSent);
    }

    public void enterHouseShortRate(String textToSent) throws Exception {
        BaseLibrary.sendKeysToWebElement(houseShortRate, textToSent);
    }

    public void enterPMHouseLongRate(String textToSent) throws Exception {
        BaseLibrary.sendKeysToWebElement(PMhouseLongRate, textToSent);
    }

    public void enterPMHouseShortRate(String textToSent) throws Exception {
        BaseLibrary.sendKeysToWebElement(PMhouseShortRate, textToSent);
    }


    public void enterPMHedgeLongRate(String textToSent) throws Exception {
        BaseLibrary.sendKeysToWebElement(PMhedgeLongRate, textToSent);
    }

    public void enterPMHedgeShortRate(String textToSent) throws Exception {
        BaseLibrary.sendKeysToWebElement(PMhedgeShortRate, textToSent);
    }

    public void enterExchnLongRate(String textToSent) throws Exception {
        BaseLibrary.sendKeysToWebElement(PMExchnLongRate, textToSent);
    }

    public void enterExchnShortRate(String textToSent) throws Exception {
        BaseLibrary.sendKeysToWebElement(PMExchnShortRate, textToSent);
    }


    public void selectHardToBorrow(String textToSent) throws Exception {
        BaseLibrary.waitAndClickElement(By.xpath("//button/span[contains(text(),'Security Settlement')]"));
        if (textToSent.toLowerCase().contentEquals("yes")) {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//div[@id='add_reg_fee_charge']//*[contains(text(),'Yes')]"));
            //   props.put("PennyPilot", "Yes");
        } else {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//div[@id='add_reg_fee_charge']//*[contains(text(),'No')]"));
            //    props.put("PennyPilot", "No");
        }
    }


    public void selectSweepDestination(String textToSent) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(sweepDestination, textToSent);
    }

    public void enterSweepCode(String textToSent) throws Exception {

        if (textToSent.contentEquals("Randon_SweepCode")) {
            //  BaseLibrary.waitAndClickElement(By.xpath("//button/span[contains(text(),'Security Master')]"));
            BaseLibrary.clearText(sweepCode);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date) + " ");
            String data = formatter.format(date).toString().replaceAll("\\s+", " ");
            textToSent = data.replaceAll("[^a-zA-Z0-9]", "");
            // BaseLibrary.sendKeysToWebElement(officeName, textToSent);
            // props.put("sweepCode", textToSent);
            BaseLibrary.sendKeysToWebElement(sweepCode, textToSent);

        } else {
            BaseLibrary.clearText(sweepCode);
            BaseLibrary.sendKeysToWebElement(sweepCode, textToSent);
        }

    }

    public void enterCurrency(String textToSent) throws Exception {

        if (textToSent.contentEquals("Randon_Currency")) {
            //need to addfrom prop file
        } else {
            BaseLibrary.clickOnTextFromDropdownList(currency, textToSent);
        }
    }


    public void enterSICCd(String textToSent) throws Exception {
        BaseLibrary.waitAndClickElement(By.xpath("//button/span[contains(text(),'Security Classification')]"));
        BaseLibrary.clearText(SICcd);
        BaseLibrary.sendKeysToWebElement(SICcd, textToSent);
    }

    public void selectWhenIssued(String textToSent) throws Exception {
        if (textToSent.toLowerCase().contentEquals("yes")) {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//div[@id='add_when_issued']//*[contains(text(),'Yes')]"));
            // props.put("PennyPilot", "Yes");
        } else {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//div[@id='add_when_issued']//*[contains(text(),'No')]"));
            // props.put("PennyPilot", "No");
        }
    }


    public void enterPrice(String textToSent) throws Exception {  //price
        BaseLibrary.waitAndClickElement(By.xpath("//button/span[contains(text(),'Security Prices')]"));
        BaseLibrary.clearText(price);
        BaseLibrary.sendKeysToWebElement(price, textToSent);
    }

    public void selectCurrency(String textToSent) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(selectCurrency, textToSent);
    }


    public void clickSaveButton() throws Exception {
        BaseLibrary.waitAndClickElementsUsingByLocator(button_Submit);
    }

    public void verifyValidationMessae(String verifyText) throws Exception {
        By textTooVerify = By.xpath("//*[contains(text(),'Security Master has been created successfully!')]");
        BaseLibrary.verifyText(textTooVerify, verifyText);
        String path = System.getProperty("user.dir") + "/src/test/resources/properties/securitymaster.properties";
        FileOutputStream outputStrem = new FileOutputStream(path);
        props.store(outputStrem, "This is a sample properties file");
    }

    public void enterContactAddress(String textToSent) throws Exception {
        BaseLibrary.waitAndClickElement(By.xpath("//*[contains(text(),'Crypto Profile')]"));
        BaseLibrary.clearText(contactAddress);
        BaseLibrary.sendKeysToWebElement(contactAddress, textToSent);
    }


    public void selectCryptoCurrencyType(String textToSent) throws Exception {
        BaseLibrary.clearText(CCurencyType);
        BaseLibrary.clickOnTextFromDropdownList(CCurencyType, textToSent);
    }

    public void selectAltenativeSymbols(String textToSent) throws Exception {
        BaseLibrary.clearText(alternativeSymbol);
        BaseLibrary.clickOnTextFromDropdownList(alternativeSymbol, textToSent);
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

    public void enterSecuritySearchBox(String textToSent) throws Exception {
        if (textToSent.contentEquals("Random_Symbol")) {
            Properties prop = readPropertiesFile(
                    System.getProperty("user.dir") + "/src/test/resources/properties/securitymaster.properties");
            String symbol = prop.getProperty("Symbol");
            BaseLibrary.sendKeysToWebElement(smSearchBox, Pub_Symbol);
            BaseLibrary.waitAndClickElement(searchIcon);
        } else {
            BaseLibrary.sendKeysToWebElement(smSearchBox, textToSent);
            BaseLibrary.waitAndClickElement(searchIcon);

        }

    }


    public void verifySymbol(String textToVerify) throws Exception {

        if (textToVerify.contentEquals("Random_Symbol")) {
            Properties prop = readPropertiesFile(
                    System.getProperty("user.dir") + "/src/test/resources/properties/securitymaster.properties");
            textToVerify = prop.getProperty("Symbol");
            //BaseLibrary.verifyTableListWithCellandRow(textToVerify, 1, 5);
            BaseLibrary.verifyTableListWithColName(Pub_Symbol, 1, "Symbol");
        } else {
            // BaseLibrary.verifyTableListWithCellandRow(textToVerify, 1, 5);
            BaseLibrary.verifyTableListWithColName(textToVerify, 1, "Symbol");
        }
    }

    public void verifyAssertType(String textToVerify) throws Exception {
        // BaseLibrary.verifyTableListWithCellandRow(textToVerify,1,2);
        if (textToVerify.contentEquals("Random_Assert")) {
            Properties prop = readPropertiesFile(
                    System.getProperty("user.dir") + "/src/test/resources/properties/securitymaster.properties");
            textToVerify = prop.getProperty("assertType");
            //  BaseLibrary.verifyTableListWithCellandRow(textToVerify, 1, 3);
            Pub_AssertType = "CR - "+Pub_AssertType;
            BaseLibrary.verifyTableListWithColName(Pub_AssertType, 1, "Asset Type");
        } else {
            //  BaseLibrary.verifyTableListWithCellandRow(textToVerify, 1, 3);
            BaseLibrary.verifyTableListWithColName(textToVerify, 1, "Asset Type");
        }
    }


    public void verifySecurityType(String textToVerify) throws Exception {
        // BaseLibrary.verifyTableListWithCellandRow(textToVerify,1,3);
        if (textToVerify.contentEquals("Random_Sec")) {
            Properties prop = readPropertiesFile(
                    System.getProperty("user.dir") + "/src/test/resources/properties/securitymaster.properties");
            textToVerify = prop.getProperty("secType");
            //  BaseLibrary.verifyTableListWithCellandRow(textToVerify, 1, 4);
            BaseLibrary.verifyTableListWithColName(Pub_SecurityType, 1, "Security Type");
        } else {
            //  BaseLibrary.verifyTableListWithCellandRow(textToVerify, 1, 4);
            BaseLibrary.verifyTableListWithColName(textToVerify, 1, "Security Type");
        }
    }

    public void enterSecSymbolInFilter(String textToVerify) throws Exception {
        if (textToVerify.contentEquals("Random_Symbol")) {
            Properties prop = readPropertiesFile(
                    System.getProperty("user.dir") + "/src/test/resources/properties/securitymaster.properties");
            textToVerify = prop.getProperty("Symbol");
            //filterSymbol
            BaseLibrary.sendKeysToWebElement(filterSymbol, Pub_Symbol);
        } else {
            BaseLibrary.sendKeysToWebElement(filterSymbol, textToVerify);
        }
    }


    public void enterSecAssertTypeInFilter(String textToSent) throws Exception {
        if (textToSent.contentEquals("Random_Assert")) {
            Properties prop = readPropertiesFile(
                    System.getProperty("user.dir") + "/src/test/resources/properties/securitymaster.properties");
            textToSent = prop.getProperty("assertType");
            BaseLibrary.SetWaitTime(1000);
            BaseLibrary.clickOnTextFromDropdownList(filterAssertType, Pub_AssertType);
            BaseLibrary.SetWaitTime(1000);
        } else {
            BaseLibrary.clickOnTextFromDropdownList(filterAssertType, textToSent);
        }
    }

    public void verifySecAssertTypeInFilter(String textToVerify) throws Exception {
        if (textToVerify.contentEquals("Random_Assert")) {
            Properties prop = readPropertiesFile(
                    System.getProperty("user.dir") + "/src/test/resources/properties/securitymaster.properties");
            textToVerify = prop.getProperty("assertType");
            // BaseLibrary.SecurityMaster.verifySecAssertTypeInFilter(filterAssertType,textToSent);
            //BaseLibrary.verifyTableListWithSingleColumn(textToVerify, 3);
            Pub_AssertType = "CR - "+Pub_AssertType;
            BaseLibrary.verifyTableListWithSingleColumnWithName(Pub_AssertType,"Asset Type");
        } else {
            // BaseLibrary.SecurityMaster.verifySecAssertTypeInFilter(filterAssertType,textToSent);
            //BaseLibrary.verifyTableListWithSingleColumn(textToVerify, 3);
            BaseLibrary.verifyTableListWithSingleColumnWithName(textToVerify,"Asset Type");
        }
    }

    public void enterSecTypeInFilter(String textToSent) throws Exception {
        if (textToSent.contentEquals("Random_Sec")) {
            Properties prop = readPropertiesFile(
                    System.getProperty("user.dir") + "/src/test/resources/properties/securitymaster.properties");
            textToSent = prop.getProperty("secType");
            BaseLibrary.SetWaitTime(1000);
            BaseLibrary.clickOnTextFromDropdownList(filterSecType, Pub_SecurityType);
            BaseLibrary.SetWaitTime(400);
        } else {
            BaseLibrary.clickOnTextFromDropdownList(filterSecType, textToSent);
        }
    }

    public void verifySecTypeInFilter(String textToVerify) throws Exception {
        if (textToVerify.contentEquals("Random_Sec")) {
            Properties prop = readPropertiesFile(
                    System.getProperty("user.dir") + "/src/test/resources/properties/securitymaster.properties");
            textToVerify = prop.getProperty("secType");
            // BaseLibrary.SecurityMaster.verifySecAssertTypeInFilter(filterAssertType,textToSent);
            //BaseLibrary.verifyTableListWithSingleColumn(textToVerify, 4);
            Pub_SecurityType =  "FI - "+Pub_SecurityType;
            BaseLibrary.verifyTableListWithSingleColumnWithName(Pub_SecurityType,"Security Type");
        } else {
            // BaseLibrary.SecurityMaster.verifySecAssertTypeInFilter(filterAssertType,textToSent);
            //BaseLibrary.verifyTableListWithSingleColumn(textToVerify, 4);
            BaseLibrary.verifyTableListWithSingleColumnWithName(Pub_SecurityType,"Security Type");
        }
    }

    public void verifyValidationMessaeWithText(String strVerify) throws Exception {
        BaseLibrary.verifyText(editMessage, strVerify);
        BaseLibrary.waitAndClickElement(closeValidation);
    }

    public void loadTestData() throws IOException {
        dd = new DataDrivenUtility();
        dd.setExcelFile(dataSheetPath, "Security Master");
        Pub_Symbol = dd.getCellData(1,1);
        Pub_SymNo = dd.getCellData(2,1);
        Pub_CUSIP = dd.getCellData(3,1);
        Pub_SEDOL = dd.getCellData(4,1);
        Pub_ISIN = dd.getCellData(5,1);
        Pub_AssertType = dd.getCellData(6,1);
        Pub_SecurityType = dd.getCellData(7,1);



    }

    public void clickSymbol(String symbol) throws Exception {
        BaseLibrary.waitAndClickElementUsingDynamic(Pub_Symbol);
    }

    public void enterCUSIPInFilter(String string) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(By.id("filter_cusip"), Pub_CUSIP);
    }
}
