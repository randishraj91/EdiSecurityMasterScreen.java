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

public class AccountMasterScreen {

    public static DataDrivenUtility dd = null;
    public String dataSheetPath = System.getProperty("user.dir") + "/src/test/resources/testFiles/TestData.xlsx";
    Properties props = new Properties();
    public int curStamp = 0;
    public static String Pub_Partner = "";
    public static String Pub_Office = "";
    public static String Pub_SubOffice = "";
    public static String Pub_SubOfficeCode = "";
    public static String Pub_DwAccountNumber = "";
    public static String Pub_CustomerAccountNumber = "";
    public static String Pub_AccountName = "";


    By accountDataMaster = By.xpath("//*[@id='simple-menu']/ul/li[1]/em");
    By accountMaster = By.xpath("//ul[@class='sub-menu-list']//li//a[text()='Account Master']"); //// a[contains(text(),'Holiday')]
    By addAccountMaster = By.xpath("//*[text()='Add New Account']");
    By button_Submit = By.xpath("//span[text()='Save']");
    By designator = By.id("add_account_profile_designator");
    By legalInformation = By.id("add_account_profile_legalEntity");
    By partner = By.xpath("(//input)[3]");
    By office = By.xpath("(//input)[4]");
    By subOffice = By.xpath("(//input)[5]");
    By DWAccountNumber = By.xpath("//label[contains(text(),('DW Account Number*'))]/..//div/input");
    By CustomerAccount = By.xpath("//label[contains(text(),('Customer Account Number*'))]/..//div/input");
    By AccountName = By.xpath("//label[contains(text(),('Account Name*'))]/..//div/input");
    By AccountType = By.xpath("//label[contains(text(),('Account Type*'))]/..//div/input");
    By status = By.xpath("//label[contains(text(),('Status*'))]/..//div/input");
    By StatusReasonCode = By.xpath("//label[contains(text(),('Status Reason Code*'))]/..//div/input");
    By GroupID = By.xpath("//label[contains(text(),('Group ID*'))]/..//div/input");
    By regRep = By.xpath("//label[contains(text(),('Reg.Rep*'))]/..//div/input");
    By Advisor = By.xpath("//label[contains(text(),('Advisor*'))]/..//div/input");
    By Analyst = By.xpath("//label[contains(text(),('Analyst*'))]/..//div/input");
    By PortfolioManager = By.xpath("//label[contains(text(),('Portfolio Manager*'))]/..//div/input");
    By AccountBaseCurrenc = By.xpath("//label[contains(text(),('Account Base Currency*'))]/..//div/input");
    By StartDT = By.xpath("//label[contains(text(),('Start DT'))]/..//div/input");
    By AccountClosedDate = By.xpath("//label[contains(text(),('Account Closed Date '))]/..//div/input");
    By AccountrestrictedDate = By.xpath("//label[contains(text(),('Account restricted Date'))]/..//div/input");
    By tag1 = By.xpath("//label[contains(text(),('Tag 1'))]/..//div/input");
    By noteTag = By.xpath("//label[contains(text(),('Note For Tag 1'))]/..//div/textarea[@rows=1]");
    By internalTagYes = By.xpath("//label[contains(text(),('Internal Note'))]/..//div/button/span[contains(text(),'Yes')]");


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
    By filterAssertType = By.id("filter_assetType");
    By filterSecType = By.id("filter_secType");


    public void clickSystemMaster() throws Exception {

        BaseLibrary.waitAndClickElementsUsingByLocator(accountDataMaster);
        BaseLibrary.SetWaitTime(400);
        BaseLibrary.waitAndClickElement(accountMaster);
    }


    public void addNewSecurityMaster() throws Exception {
        BaseLibrary.SetWaitTime(1000);
        BaseLibrary.waitAndClickElement(addAccountMaster);
    }

    public void verifyLabel() throws Exception {
        BaseLibrary.verifyText(By.xpath("//button/span[contains(text(),'Account Profile')]"), "Account Profile");
        BaseLibrary.verifyText(By.xpath("//button/span[contains(text(),'Customer Information')]"), "Customer Information");
        BaseLibrary.verifyText(By.xpath("//button/span[contains(text(),'Address')]"), "Address");
        BaseLibrary.verifyText(By.xpath("//button/span[contains(text(),'Tax')]"), "Tax");
        BaseLibrary.verifyText(By.xpath("//button/span[contains(text(),'Interested Party')]"), "Interested Party");
        BaseLibrary.verifyText(By.xpath("//button/span[contains(text(),'Investment Profile')]"), "Investment Profile");
        BaseLibrary.verifyText(By.xpath("//button/span[contains(text(),'Instructions & Permissions')]"), "Instructions & Permissions");
        //   BaseLibrary.waitAndClickElement(By.xpath("//*[@id='root']/div/div[2]/div[1]/div[3]/div/header/div/div[4]"));
        //  BaseLibrary.verifyText(By.xpath("//button/span[contains(text(),'Document')]"), "Document");
    }

    public void selectDesignator(String trader) throws Exception {
        BaseLibrary.SetWaitTime(1000);
        if (trader.contains("Random")) {
            //implement random des
        } else {

            BaseLibrary.clickOnTextFromDropdownList(designator, trader);
        }
    }

    public void selectLegalFormation(String textToSelect) throws Exception {
        if (textToSelect.contains("Random")) {
            //implement random des
        } else {
            BaseLibrary.clickOnTextFromDropdownList(legalInformation, textToSelect);
        }
    }

    public void selectPartner(String textToSelect) throws Exception {
        if (textToSelect.contains("Random_Partner")) {
            BaseLibrary.clickOnTextFromDropdownList(partner, Pub_Partner);
        } else {

            props.put("Partner", textToSelect);
            BaseLibrary.clickOnTextFromDropdownList(partner, textToSelect);
        }
    }

    public void selectOffice(String textToSelect) throws Exception {
        if (textToSelect.contains("Random_Office")) {
            BaseLibrary.clickOnTextFromDropdownList(office, Pub_Office);
        } else {
            props.put("Office", textToSelect);
            BaseLibrary.clickOnTextFromDropdownList(office, textToSelect);
        }
    }

    public void selectSubOffice(String textToSelect) throws Exception {
        if (textToSelect.contains("Random_SubOffice")) {
            BaseLibrary.clickOnTextFromDropdownList(subOffice, Pub_SubOffice);
        } else {
            props.put("SubOffice", textToSelect);
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
            dd = new DataDrivenUtility();
            dd.setExcelFile(dataSheetPath, "Account Master");
            dd.setCellValue(1, 1, textToSent, dataSheetPath);

        } else {
            props.put("AccountNumber", textToSent);
            BaseLibrary.clearText(DWAccountNumber);
            BaseLibrary.sendKeysToWebElement(DWAccountNumber, textToSent);
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
            dd = new DataDrivenUtility();
            dd.setExcelFile(dataSheetPath, "Account Master");
            dd.setCellValue(2, 1, textToSent, dataSheetPath);

        } else {
            props.put("CustomerAccNo", textToSent);
            BaseLibrary.clearText(CustomerAccount);
            BaseLibrary.sendKeysToWebElement(CustomerAccount, textToSent);
        }
    }


    public void enterAccountName(String textToSent) throws Exception {
        // BaseLibrary.sendKeysToWebElement(nameOfSymbol,testToSent);
        if (textToSent.contentEquals("Random_AccountNumber")) {
            BaseLibrary.clearText(AccountName);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date) + " ");
            textToSent = formatter.format(date).toString().replaceAll("\\s+", " ");
            String data = "AN" + textToSent.replaceAll("[^a-zA-Z0-9]", "");
            int curStamp = Integer.parseInt(data.substring(data.length() - 5, data.length()));
            BaseLibrary.sendKeysToWebElement(AccountName, data);
            props.put("AccountName", data);
            dd = new DataDrivenUtility();
            dd.setExcelFile(dataSheetPath, "Account Master");
            dd.setCellValue(3, 1, data, dataSheetPath);
        } else {
            BaseLibrary.clearText(AccountName);
            BaseLibrary.sendKeysToWebElement(AccountName, textToSent);
            props.put("AccountName", textToSent);
            textToSent = "Random_Name";

        }
        BaseLibrary.pressDown(4);
    }

    public void selectAccoutType(String textToSelect) throws Exception {
        if (textToSelect.contains("Random_Accounttype")) {
            //implement random des
            props.put("AccountType", textToSelect);
        } else {
            props.put("AccountType", textToSelect);
            BaseLibrary.setFocusToElement(AccountType);
            BaseLibrary.clickOnTextFromDropdownList(AccountType, textToSelect);
        }
    }

    public void selectStatus(String textToSelect) throws Exception {
        if (textToSelect.contains("Random_status")) {
            //implement random des
            props.put("Status", textToSelect);
            String path = System.getProperty("user.dir") + "/src/test/resources/properties/accountmaster.properties";
            FileOutputStream outputStrem = new FileOutputStream(path);
            props.store(outputStrem, "This is a sample properties file");
        } else {
            props.put("Status", textToSelect);
            String path = System.getProperty("user.dir") + "/src/test/resources/properties/accountmaster.properties";
            FileOutputStream outputStrem = new FileOutputStream(path);
            props.store(outputStrem, "This is a sample properties file");
            BaseLibrary.clickOnTextFromDropdownList(status, textToSelect);
        }
    }

    public void selectStatusReasonCode(String textToSelect) throws Exception {
        if (textToSelect.contains("Random_statusReasonCode")) {
            //implement random des
        } else {
            BaseLibrary.clickOnTextFromDropdownList(StatusReasonCode, textToSelect);
        }
    }

    public void selectGroupId(String textToSelect) throws Exception {
        if (textToSelect.contains("Random_GroupId")) {
            BaseLibrary.setFocusToElement(Analyst);
            BaseLibrary.setFocusToElement(Analyst);
            //implement random des
        } else {
            BaseLibrary.setFocusToElement(Analyst);
            BaseLibrary.clickOnTextFromDropdownList(GroupID, textToSelect);
        }
    }


    public void selectRegRep(String textToSelect) throws Exception {
        if (textToSelect.contains("Random_RegRep")) {
            //implement random des
        } else {
            BaseLibrary.clickOnTextFromDropdownList(regRep, textToSelect);
        }
    }

    public void selectAdvisor(String textToSelect) throws Exception {
        if (textToSelect.contains("Random_Advisor")) {
            //implement random des
        } else {
            BaseLibrary.clickOnTextFromDropdownList(Advisor, textToSelect);
        }
    }

    public void selectAnalyst(String textToSelect) throws Exception {
        BaseLibrary.scrollDownBy350();
        if (textToSelect.contains("Random_Analyst")) {
            //implement random des
        } else {
            BaseLibrary.setFocusToElement(tag1);
            BaseLibrary.clickOnTextFromDropdownList(Analyst, textToSelect);
        }
    }

    public void selectPortfolioManager(String textToSelect) throws Exception {
        if (textToSelect.contains("Random_PortfolioManager")) {
            //implement random des
        } else {
            BaseLibrary.clickOnTextFromDropdownList(PortfolioManager, textToSelect);
        }
    }

    public void selectAccountBaseCurrency(String textToSelect) throws Exception {
        BaseLibrary.scrollDownBy350();
        if (textToSelect.contains("Random_BaseCurrency")) {

            //implement random des
        } else {
            BaseLibrary.setFocusToElement(AccountBaseCurrenc);
            BaseLibrary.clickOnTextFromDropdownList(AccountBaseCurrenc, textToSelect);
        }
    }

    public void enterStartDT(String textToSent) throws Exception {
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
                    faker.number().randomDigit() - curStamp + faker.number().randomDigit());
            String newDate = sdf.format(c.getTime());
            System.out.println("Date after Addition: " + newDate);

            textToSent = newDate;
            BaseLibrary.waitAndClickElement(StartDT);
            // BaseLibrary.waitAndClickElement(StartDT);
            BaseLibrary.sendKeysToWebElement(StartDT, textToSent);
            props.put("StartDT", textToSent);
        } else {
            BaseLibrary.sentTextUsingJS(StartDT, textToSent);
        }

    }

    public void enterAccountClosedDate(String textToSent) throws Exception {
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
                    faker.number().randomDigit() + curStamp + 251 + curStamp + faker.number().randomDigit());
            String newDate = sdf.format(c.getTime());
            System.out.println("Date after Addition: " + newDate);

            textToSent = newDate;
            BaseLibrary.waitAndClickElement(AccountClosedDate);
            // BaseLibrary.waitAndClickElement(StartDT);
            BaseLibrary.sendKeysToWebElement(AccountClosedDate, textToSent);
            props.put("AccountClosedDate", textToSent);

            // Base_Library.Func_MainNew(holidayDate, "SETTEXT", "Holiday Date
            // ", textToSent);
        } else {
            BaseLibrary.sentTextUsingJS(AccountClosedDate, textToSent);
        }
    }

    public void enterAccountRestrictedDate(String textToSent) throws Exception {
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
                    faker.number().randomDigit() + curStamp + 10 + curStamp + faker.number().randomDigit());
            String newDate = sdf.format(c.getTime());
            System.out.println("Date after Addition: " + newDate);

            textToSent = newDate;
            BaseLibrary.waitAndClickElement(AccountrestrictedDate);
            // BaseLibrary.waitAndClickElement(StartDT);
            BaseLibrary.sendKeysToWebElement(AccountrestrictedDate, textToSent);
            props.put("AccountrestrictedDate", textToSent);

            // Base_Library.Func_MainNew(holidayDate, "SETTEXT", "Holiday Date
            // ", textToSent);
        } else {
            BaseLibrary.sentTextUsingJS(AccountrestrictedDate, textToSent);
            props.put("AccountrestrictedDate", textToSent);
        }
    }

    public void selectTag1(String textToSent) throws Exception {
        if (textToSent.contentEquals("Random_Tag")) {
            //  BaseLibrary.waitAndClickElement(By.xpath("//button/span[contains(text(),'Security Master')]"));
            //need to add prop
            BaseLibrary.pressDown(5);
            BaseLibrary.setFocusToElement(tag1);
            BaseLibrary.clickOnTextFromDropdownList(tag1, textToSent);
            //   props.put("stateTaxable", stateTaxable);
        } else {
            BaseLibrary.pressDown(5);
            BaseLibrary.setFocusToElement(tag1);
            BaseLibrary.clickOnTextFromDropdownList(tag1, textToSent);
            //  props.put("stateTaxable", stateTaxable);
        }
    }

    public void enterNotForTag1(String textToSent) throws Exception {
        if (textToSent.contentEquals("Random_Text")) {
            //  BaseLibrary.waitAndClickElement(By.xpath("//button/span[contains(text(),'Security Master')]"));
            //need to add prop
            BaseLibrary.clickOnTextFromDropdownList(noteTag, textToSent);
            //   props.put("stateTaxable", stateTaxable);
        } else {
            BaseLibrary.clickOnTextFromDropdownList(noteTag, textToSent);
            //  props.put("stateTaxable", stateTaxable);
        }
    }

    public void selectInternalNote(String textToSent) throws Exception {
        if (textToSent.toLowerCase().contentEquals("yes")) {
            BaseLibrary.waitAndClickElementsUsingByLocator(internalTagYes);
            //   props.put("PennyPilot", "Yes");
        } else {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//div[@id='add_marginable']//*[contains(text(),'No')]"));
            //   props.put("PennyPilot", "No");

        }
    }


    public void enterFirstNane(String textToSent) throws Exception {
        BaseLibrary.waitAndClickElement(By.xpath("//button/span[contains(text(),'Customer Information')]"));
        if (textToSent.contentEquals("Random_FirstNane")) {
            //  BaseLibrary.waitAndClickElement(By.xpath("//button/span[contains(text(),'Security Master')]"));
            //need to add prop
            BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('First Name*'))]/..//div/input"), textToSent);
            //   props.put("stateTaxable", stateTaxable);
        } else {
            BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('First Name*'))]/..//div/input"), textToSent);
            //  props.put("stateTaxable", stateTaxable);
        }


    }


    public void enterMiddleName(String textToSent) throws Exception {
        By midname = By.xpath("//label[contains(text(),('Middle Name'))]/..//div/input");
        if (textToSent.contentEquals("Random_MiddleName")) {
            //  BaseLibrary.waitAndClickElement(By.xpath("//button/span[contains(text(),'Security Master')]"));
            //need to add prop
            BaseLibrary.sendKeysToWebElement(midname, textToSent);
            //   props.put("stateTaxable", stateTaxable);
        } else {
            BaseLibrary.sendKeysToWebElement(midname, textToSent);
            //  props.put("stateTaxable", stateTaxable);
        }
    }

    public void enterLastNane(String textToSent) throws Exception {
        By lastName = By.xpath("//label[contains(text(),('Last Name'))]/..//div/input");
        if (textToSent.contentEquals("Random_LastNane")) {
            //  BaseLibrary.waitAndClickElement(By.xpath("//button/span[contains(text(),'Security Master')]"));
            //need to add prop
            BaseLibrary.sendKeysToWebElement(lastName, textToSent);
            //   props.put("stateTaxable", stateTaxable);
        } else {
            BaseLibrary.sendKeysToWebElement(lastName, textToSent);
            //  props.put("stateTaxable", stateTaxable);
        }
    }

    public void enterShortName(String textToSent) throws Exception {
        By shortName = By.xpath("//label[contains(text(),('Short Name'))]/..//div/input");
        if (textToSent.contentEquals("Random_ShortName")) {
            BaseLibrary.sendKeysToWebElement(shortName, textToSent);
            //   props.put("stateTaxable", stateTaxable);
        } else {
            BaseLibrary.sendKeysToWebElement(shortName, textToSent);
            //  props.put("stateTaxable", stateTaxable);
        }
    }

    public void enterSalutation(String textToSent) throws Exception {
        By Salutation = By.xpath("//label[contains(text(),('Salutation'))]/..//div/input");
        BaseLibrary.sendKeysToWebElement(Salutation, textToSent);

    }

    public void enterLEI(String textToSent) throws Exception {
        By LEI = By.xpath("//label[contains(text(),('LEI (Legal Entity Identifier)'))]/..//div/input");
        if (textToSent.contentEquals("Random_SecurityNumber")) {
            BaseLibrary.clearText(LEI);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date) + " ");
            String data = formatter.format(date).toString().replaceAll("\\s+", " ");
            textToSent = data.replaceAll("[^a-zA-Z0-9]", "");
            // BaseLibrary.sendKeysToWebElement(officeName, textToSent);
            //  props.put("securityNumber", textToSent);
            BaseLibrary.sendKeysToWebElement(LEI, textToSent);

        } else {
            BaseLibrary.clearText(LEI);
            BaseLibrary.sendKeysToWebElement(LEI, textToSent);
        }
    }

    public void enterDOB(String textToSent) throws Exception {
        By DOB = By.xpath("//label[contains(text(),('Date Of Birth'))]/..//div/input");
        if (textToSent.contentEquals("Random_Date")) {
            Faker faker = new Faker();
            SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
            Date date = new Date();
            System.out.println(formatter.format(date) + "Parsed Date");
            String oldDate = formatter.format(date);
            System.out.println("Date before Addition: " + oldDate);
            SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
            Calendar c = Calendar.getInstance();
            faker.date().birthday();
            String newDate = sdf.format(faker.date().birthday());
            System.out.println("Date after Addition: " + newDate);
            textToSent = newDate;
            BaseLibrary.waitAndClickElement(DOB);
            BaseLibrary.waitAndClickElement(DOB);
            BaseLibrary.sendKeysToWebElement(DOB, textToSent);

        } else {
            BaseLibrary.sendKeysToWebElement(DOB, textToSent);
        }


    }

    public void selectSNNType(String textToSelect) throws Exception {
        By SSNType = By.xpath("//label[contains(text(),('SSN Type'))]/..//div/input");
        BaseLibrary.clickOnTextFromDropdownList(SSNType, textToSelect);
    }

    public void enterSNNTax(String textToSent) throws Exception {
        By SNNTax = By.xpath("//label[contains(text(),('SSN/Tax'))]/..//div/input");
        if (textToSent.contentEquals("Random_SSN")) {
            BaseLibrary.clearText(SNNTax);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date) + " ");
            String data = formatter.format(date).toString().replaceAll("\\s+", " ");
            textToSent = data.replaceAll("[^a-zA-Z0-9]", "");
            // BaseLibrary.sendKeysToWebElement(officeName, textToSent);
            //  props.put("securityNumber", textToSent);
            BaseLibrary.sendKeysToWebElement(SNNTax, textToSent);

        } else {
            BaseLibrary.clearText(SNNTax);
            BaseLibrary.sendKeysToWebElement(SNNTax, textToSent);
        }
    }

    public void enterIDType(String textToSent) throws Exception {
        BaseLibrary.clearText(By.xpath("//label[contains(text(),('ID Type'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('ID Type'))]/..//div/input"), textToSent);
    }

    public void enterPlaceOfIssue(String textToSent) throws Exception {
        BaseLibrary.clearText(By.xpath("//label[contains(text(),('Place of Issue'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Place of Issue'))]/..//div/input"), textToSent);
    }

    public void selectNasadEmp(String textToSent) throws Exception {
        BaseLibrary.pressDown(5);
        if (textToSent.toLowerCase().contentEquals("yes")) {
            BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('NASD Emp'))]/..//div/button/span[contains(text(),'Yes')]"));
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('NASD Emp'))]/..//div/button/span[contains(text(),'Yes')]"));
        } else {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('NASD Emp'))]/..//div/button/span[contains(text(),'No')]"));
        }

    }

    public void selectNasadSpouse(String textToSent) throws Exception {
        if (textToSent.toLowerCase().contentEquals("yes")) {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('NASD Spouse'))]/..//div/button/span[contains(text(),'Yes')]"));
            //   props.put("PennyPilot", "Yes");
        } else {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('NASD Spouse'))]/..//div/button/span[contains(text(),'No')]"));
            //   props.put("PennyPilot", "No");

        }
    }

    public void selectDirectorOfBrokerDealer(String textToSent) throws Exception {
        if (textToSent.toLowerCase().contentEquals("yes")) {

            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('Director of Broker Dealer'))]/..//div/button/span[contains(text(),'Yes')]"));
            //   props.put("PennyPilot", "Yes");
        } else {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('Director of Broker Dealer'))]/..//div/button/span[contains(text(),'No')]"));
            //   props.put("PennyPilot", "No");

        }
    }

    public void enterBrokerFirmName(String textToSent) throws Exception {
        By BFNM = By.xpath("//label[contains(text(),('Broker Firm Name'))]/..//div/input");
        By DesDate = By.xpath("//label[contains(text(),('Deceased Date'))]/..//div/input");
        BaseLibrary.setFocusToElement(DesDate);
        BaseLibrary.sendKeysToWebElement(BFNM, textToSent);
    }

    public void selectDirectorOfBrokerCompany(String textToSent) throws Exception {
        if (textToSent.toLowerCase().contentEquals("yes")) {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('Director of Public Company'))]/..//div/button/span[contains(text(),'Yes')]"));
            //   props.put("PennyPilot", "Yes");
        } else {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('Director of Public Company'))]/..//div/button/span[contains(text(),'No')]"));
            //   props.put("PennyPilot", "No");
        }

    }

    public void selectSymbolOfPublicCompany(String textToSent) throws Exception {
        BaseLibrary.pressDown(5);
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Deceased Date'))]/..//div/input"));
        By SPC = By.xpath("//label[contains(text(),('Symbol of Public Company'))]/..//div/input");
        BaseLibrary.clickOnTextFromDropdownList(SPC, textToSent);
    }

    public void selectPoliticallyExposed(String textToSent) throws Exception {
        if (textToSent.toLowerCase().contentEquals("yes")) {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('Politically Exposed'))]/..//div/button/span[contains(text(),'Yes')]"));
            //   props.put("PennyPilot", "Yes");
        } else {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('Politically Exposed'))]/..//div/button/span[contains(text(),'No')]"));
            //   props.put("PennyPilot", "No");
        }
    }

    public void enterPoliticallyExposedName(String textToSent) throws Exception {
        By ExpName = By.xpath("//label[contains(text(),('Politically Exposed Names'))]/..//div/input");
        BaseLibrary.sendKeysToWebElement(ExpName, textToSent);
    }

    public void selectAccountOfAnotherFirm(String textToSent) throws Exception {
        if (textToSent.toLowerCase().contentEquals("yes")) {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('Account of Another Firm'))]/..//div/button/span[contains(text(),'Yes')]"));
            //   props.put("PennyPilot", "Yes");
        } else {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('Account of Another Firm'))]/..//div/button/span[contains(text(),'No')]"));
            //   props.put("PennyPilot", "No");
        }
    }

    public void selectMartialStatus(String textToSent) throws Exception {
        By Mstatus = By.xpath("//label[contains(text(),('Marital Status'))]/..//div/input");
        if (textToSent.contentEquals("Random_MartialStatus")) {
            //  BaseLibrary.waitAndClickElement(By.xpath("//button/span[contains(text(),'Security Master')]"));
            //need to add prop
            BaseLibrary.clickOnTextFromDropdownList(Mstatus, textToSent);
            //   props.put("stateTaxable", stateTaxable);
        } else {
            BaseLibrary.clickOnTextFromDropdownList(Mstatus, textToSent);
            //  props.put("stateTaxable", stateTaxable);
        }
    }

    public void enterDependants(String textToSent) throws Exception {

        BaseLibrary.clearText(By.xpath("//label[contains(text(),('Dependants'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Dependants'))]/..//div/input"), textToSent);
    }

    public void enterDeceasedDate(String textToSent) throws Exception {
        By DesDate = By.xpath("//label[contains(text(),('Deceased Date'))]/..//div/input");
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
            BaseLibrary.waitAndClickElement(DesDate);
            BaseLibrary.sendKeysToWebElement(DesDate, textToSent);

        } else {
            BaseLibrary.sentTextUsingJS(DesDate, textToSent);
        }

    }


    public void enterAddressLine1(String textToSent) throws Exception {
        BaseLibrary.pressF5();
        BaseLibrary.waitAndClickElement(By.xpath("//button/span[contains(text(),'Address')]"));
        BaseLibrary.clearText(By.xpath("//label[contains(text(),('Address Line 1*'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Address Line 1*'))]/..//div/input"), textToSent);
    }

    public void enterAddressLine2(String textToSent) throws Exception {
        BaseLibrary.waitAndClickElement(By.xpath("//button/span[contains(text(),'Address')]"));
        BaseLibrary.clearText(By.xpath("//label[contains(text(),('Address Line 2*'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Address Line 2*'))]/..//div/input"), textToSent);
    }

    public void enterAddressLine3(String textToSent) throws Exception {
        BaseLibrary.waitAndClickElement(By.xpath("//button/span[contains(text(),'Address')]"));
        BaseLibrary.clearText(By.xpath("//label[contains(text(),('Address Line 3'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Address Line 3'))]/..//div/input"), textToSent);
    }

    public void selectCountry(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('country*'))]/..//div/input"));
        BaseLibrary.SetWaitTime(2000);
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//label[contains(text(),('country*'))]/..//div/input"), textToSent);
    }

    public void selectState(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('state*'))]/..//div/input"));
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//label[contains(text(),('state*'))]/..//div/input"), textToSent);
    }

    public void selectCity(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('city*'))]/..//div/input"));
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//label[contains(text(),('city*'))]/..//div/input"), textToSent);

    }

    public void enterZipCode(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('zipcode*'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('zipcode*'))]/..//div/input"), textToSent);
    }

    public void enterPhoneNumber(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Phone*'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Phone*'))]/..//div/input"), textToSent);
    }

    public void enterEmail(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Email*'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Email*'))]/..//div/input"), textToSent);
    }

    public void enterFax(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Fax*'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Fax*'))]/..//div/input"), textToSent);
    }

    public void selectMaillingAddress(String textToSent) throws Exception {

        if (textToSent.toLowerCase().contentEquals("yes")) {
            BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('use the same legal address for mailing?*'))]/..//div/button/span[contains(text(),'Yes')]"));
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('use the same legal address for mailing?*'))]/..//div/button/span[contains(text(),'Yes')]"));
            //   props.put("PennyPilot", "Yes");
        } else {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('use the same legal address for mailing?*'))]/..//div/button/span[contains(text(),'No')]"));
            //   props.put("PennyPilot", "No");
        }
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('use the same legal address for Custodial?*'))]/..//div/button/span[contains(text(),'Yes')]"));
    }

    public void selectInTradyNotice(String textToSent) throws Exception {
        if (textToSent.toLowerCase().contentEquals("yes")) {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('use the same legal address for Intraday notices?*'))]/..//div/button/span[contains(text(),'Yes')]"));
            //   props.put("PennyPilot", "Yes");
        } else {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('use the same legal address for Intraday notices?*'))]/..//div/button/span[contains(text(),'No')]"));
            //   props.put("PennyPilot", "No");
        }
    }

    public void enterEmployeeStatus(String text) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Employment status'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Employment status'))]/..//div/input"), text);
    }

    public void enterJobTitle(String text) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Job Title'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Job Title'))]/..//div/input"), text);
    }

    public void selectEmpLegalAddress(String textToSent) throws Exception {
        if (textToSent.toLowerCase().contentEquals("yes")) {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('use the same legal address for Employer?*'))]/..//div/button/span[contains(text(),'Yes')]"));
            //   props.put("PennyPilot", "Yes");
        } else {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('use the same legal address for Employer?*'))]/..//div/button/span[contains(text(),'No')]"));
            //   props.put("PennyPilot", "No");
        }
    }

    public void selectCudotialAddress(String textToSent) throws Exception {
        if (textToSent.toLowerCase().contentEquals("yes")) {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('use the same legal address for Custodial?*'))]/..//div/button/span[contains(text(),'Yes')]"));
            //   props.put("PennyPilot", "Yes");
        } else {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('use the same legal address for Custodial?*'))]/..//div/button/span[contains(text(),'No')]"));
            //   props.put("PennyPilot", "No");
        }

    }

    public void SelectTEFRA(String textToSent) throws Exception {
        BaseLibrary.pressF5();
        BaseLibrary.waitAndClickElement(By.xpath("//button/span[contains(text(),'Tax')]"));
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('TEFRA*'))]/..//div/input"));
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//label[contains(text(),('TEFRA*'))]/..//div/input"), textToSent);
        //  props.put("stateTaxable", stateTaxable);

    }

    public void selectCitizenship(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Citizenship*'))]/..//div/input"));
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//label[contains(text(),('Citizenship*'))]/..//div/input"), textToSent);
        //  props.put("stateTaxable", stateTaxable);
    }

    public void selectTaxCountry(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Tax Country*'))]/..//div/input"));
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//label[contains(text(),('Tax Country*'))]/..//div/input"), textToSent);
        //  props.put("stateTaxable", stateTaxable);
    }

    public void selectCostBasic(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Cost Basis'))]/..//div/input"));
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//label[contains(text(),('Cost Basis'))]/..//div/input"), textToSent);
        //  props.put("stateTaxable", stateTaxable);
    }

    public void selectTaxLot(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Tax Lot'))]/..//div/input"));
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//label[contains(text(),('Tax Lot'))]/..//div/input"), textToSent);
        //  props.put("stateTaxable", stateTaxable);
    }

    public void selectw8w9exempt(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('W8/W9/Exempt*'))]/..//div/input"));
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//label[contains(text(),('W8/W9/Exempt*'))]/..//div/input"), textToSent);
        //  props.put("stateTaxable", stateTaxable);
    }

    public void selectw8w9(String textToSent) throws Exception {
        if (textToSent.toLowerCase().contentEquals("yes")) {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('Valid (If W8 or W9)'))]/..//div/button/span[contains(text(),'Yes')]"));
            //   props.put("PennyPilot", "Yes");
        } else {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('Valid (If W8 or W9)'))]/..//div/button/span[contains(text(),'No')]"));
            //   props.put("PennyPilot", "No");
        }

    }


    public void selectTaxStatus(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Tax Status'))]/..//div/input"));
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//label[contains(text(),('Tax Status'))]/..//div/input"), textToSent);
    }

    public void selectReceipentCode(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Receipent Code'))]/..//div/input"));
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//label[contains(text(),('Receipent Code'))]/..//div/input"), textToSent);

    }

    public void selectFACTA(String textToSent) throws Exception {
        if (textToSent.toLowerCase().contentEquals("yes")) {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('FATCA'))]/..//div/button/span[contains(text(),'Yes')]"));
            //   props.put("PennyPilot", "Yes");
        } else {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('FATCA'))]/..//div/button/span[contains(text(),'No')]"));
            //   props.put("PennyPilot", "No");
        }
    }


    public void selectType(String textToSent) throws Exception {
        BaseLibrary.pressF5();
        BaseLibrary.waitAndClickElement(By.xpath("//button/span[contains(text(),'Interested Party')] "));
        By seleAccType = By.xpath("//label[contains(text(),('Type*'))]/..//div/input");
        if (textToSent.contentEquals("Random_StateTaxable")) {
            //  BaseLibrary.waitAndClickElement(By.xpath("//button/span[contains(text(),'Security Master')]"));
            //need to add prop
            BaseLibrary.clickOnTextFromDropdownList(seleAccType, textToSent);
            //   props.put("stateTaxable", stateTaxable);
        } else {
            BaseLibrary.clickOnTextFromDropdownList(seleAccType, textToSent);
            //  props.put("stateTaxable", stateTaxable);
        }
    }

    public void selectReceiveConfirms(String textToSent) throws Exception {
        if (textToSent.toLowerCase().contentEquals("yes")) {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('Receive Confirms'))]/..//div/button/span[contains(text(),'Yes')]"));
            //   props.put("PennyPilot", "Yes");
        } else {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('Receive Confirms'))]/..//div/button/span[contains(text(),'No')]"));
            //   props.put("PennyPilot", "No");
        }
    }

    public void selectReceiveStatement(String textToSent) throws Exception {
        if (textToSent.toLowerCase().contentEquals("yes")) {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('Receive Statement'))]/..//div/button/span[contains(text(),'Yes')]"));
            //   props.put("PennyPilot", "Yes");
        } else {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('Receive Statement'))]/..//div/button/span[contains(text(),'No')]"));
            //   props.put("PennyPilot", "No");
        }
    }

    public void enterName(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath(" //label[contains(text(),('Name*'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath(" //label[contains(text(),('Name*'))]/..//div/input"), textToSent);
    }

    public void enterIPAAddressLine1(String textToSent) throws Exception {
        BaseLibrary.clearText(By.xpath("//label[contains(text(),('Address Line 1*'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Address Line 1*'))]/..//div/input"), textToSent);
    }

    public void enterIPAAddressLine2(String textToSent) throws Exception {
        BaseLibrary.clearText(By.xpath("//label[contains(text(),('Address Line 2*'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Address Line 2*'))]/..//div/input"), textToSent);

    }

    public void enterIPAAddressLine3(String textToSent) throws Exception {
        BaseLibrary.clearText(By.xpath("//label[contains(text(),('Address Line 3'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Address Line 3'))]/..//div/input"), textToSent);

    }

    public void selectIPACountry(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('country*'))]/..//div/input"));
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//label[contains(text(),('country*'))]/..//div/input"), textToSent);
        //  props.put("stateTaxable", stateTaxable);
    }

    public void selectIPAState(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('state*'))]/..//div/input"));
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//label[contains(text(),('state*'))]/..//div/input"), textToSent);
        //  props.put("stateTaxable", stateTaxable);
    }

    public void selectIPACity(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('city*'))]/..//div/input"));
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//label[contains(text(),('city*'))]/..//div/input"), textToSent);
        //  props.put("stateTaxable", stateTaxable);
    }

    public void enterIPAZipCode(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Zip*'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Zip*'))]/..//div/input"), textToSent);
        BaseLibrary.pressDown(6);
    }

    public void enterIPAPhoneHome(String textToSent) throws Exception {
        // BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Phone Home*'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Phone Home*'))]/..//div/input"), textToSent);
    }

    public void enterIPAPhoneWork(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Phone Work*'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Phone Work*'))]/..//div/input"), textToSent);
    }

    public void enterIPAPhoneNumber(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Phone Mobile*'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Phone Mobile*'))]/..//div/input"), textToSent);
    }

    public void enterIPAEmail(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Email*'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Email*'))]/..//div/input"), textToSent);
    }

    public void enterIPAFax(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Fax'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Fax'))]/..//div/input"), textToSent);

    }

    public void selectInvertmentObjective(String textToSent) throws Exception {
        BaseLibrary.waitAndClickElement(By.xpath("//button/span[contains(text(),'Investment Profile')]"));
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Investment Objective'))]/..//div/input"));
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//label[contains(text(),('Investment Objective'))]/..//div/input"), textToSent);

    }

    public void selectRiskTolerance(String textToSent) throws Exception {

        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Risk Tolerance'))]/..//div/input"));
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//label[contains(text(),('Risk Tolerance'))]/..//div/input"), textToSent);

    }

    public void enterAnnualIncome(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Annual Income ($)'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Annual Income ($)'))]/..//div/input"), textToSent);
    }


    public void enterNetWorth(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Net Worth ($)'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Net Worth ($)'))]/..//div/input"), textToSent);

    }

    public void enterLiquidity(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Liquidity ($)'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Liquidity ($)'))]/..//div/input"), textToSent);

    }

    public void selectFixedIncomeExperience(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Fixed Income Experience'))]/..//div/input"));
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//label[contains(text(),('Fixed Income Experience'))]/..//div/input"), textToSent);
    }


    public void selectStockExperiene(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Stocks Experience'))]/..//div/input"));
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//label[contains(text(),('Stocks Experience'))]/..//div/input"), textToSent);
    }


    public void selectOptionsExperience(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Options Experience'))]/..//div/input"));
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//label[contains(text(),('Options Experience'))]/..//div/input"), textToSent);
    }

    public void enterYOEinFixedIncome(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Years of Experience in Fixed Income'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Years of Experience in Fixed Income'))]/..//div/input"), textToSent);
    }


    public void enterYOEinStock(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Years of Experience in Stocks'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Years of Experience in Stocks'))]/..//div/input"), textToSent);
    }


    public void enterYOEinOptions(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Years of Experience in Options'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Years of Experience in Options'))]/..//div/input"), textToSent);
        BaseLibrary.pressDown(6);
    }


    public void enterTimeHorizon(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Time Horizon'))]/..//div/input"));
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//label[contains(text(),('Time Horizon'))]/..//div/input"), textToSent);
    }


    public void selectLiquidity(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Liquidity Needs'))]/..//div/input"));
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//label[contains(text(),('Liquidity Needs'))]/..//div/input"), textToSent);
    }

    public void enterRule2111(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Rule 2111'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Rule 2111'))]/..//div/input"), textToSent);

    }


    public void selectBusinessNeeds(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Business Needs'))]/..//div/input"));
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//label[contains(text(),('Business Needs'))]/..//div/input"), textToSent);

    }

    public void selectDIVReInvent(String textToSent) throws Exception {
        BaseLibrary.waitAndClickElement(By.xpath("//button/span[contains(text(),'Instructions & Permissions')]"));
        if (textToSent.toLowerCase().contentEquals("yes")) {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('Div ReInvest'))]/..//div/button/span[contains(text(),'Yes')]"));
        } else {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('Div ReInvest'))]/..//div/button/span[contains(text(),'No')]"));
        }
    }

    public void selectCorpBuyBack(String textToSent) throws Exception {
        if (textToSent.toLowerCase().contentEquals("yes")) {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('Corp BuyBack'))]/..//div/button/span[contains(text(),'Yes')]"));
        } else {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('Corp BuyBack'))]/..//div/button/span[contains(text(),'No')]"));
        }
    }

    public void selectDayTrader(String textToSent) throws Exception {
        if (textToSent.toLowerCase().contentEquals("yes")) {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('Day Trader?'))]/..//div/button/span[contains(text(),'Yes')]"));
        } else {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('Day Trader?'))]/..//div/button/span[contains(text(),'No')]"));
        }
    }

    public void selectProductPermissions(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Product Permissions'))]/..//div/input"));
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//label[contains(text(),('Product Permissions'))]/..//div/input"), textToSent);
    }

    public void enterMINNetEQ(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Min Net Eq'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Min Net Eq'))]/..//div/input"), textToSent);
    }


    public void selectCapacity(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Capacity'))]/..//div/input"));
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//label[contains(text(),('Capacity'))]/..//div/input"), textToSent);

    }

    public void selectSolicitated(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Solicitated'))]/..//div/input"));
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//label[contains(text(),('Solicitated'))]/..//div/input"), textToSent);
    }


    public void selectRegFee(String textToSent) throws Exception {
        if (textToSent.toLowerCase().contentEquals("yes")) {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('Reg Fee'))]/..//div/button/span[contains(text(),'Yes')]"));
        } else {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('Reg Fee'))]/..//div/button/span[contains(text(),'No')]"));
        }
    }

    public void selectMoneyMarketSweep(String textToSent) throws Exception {
        if (textToSent.toLowerCase().contentEquals("yes")) {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('Money Market Sweep'))]/..//div/button/span[contains(text(),'Yes')]"));
        } else {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('Money Market Sweep'))]/..//div/button/span[contains(text(),'No')]"));
        }
    }

    public void selectSweepDestination(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Sweep Destination'))]/..//div/input"));
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//label[contains(text(),('Sweep Destination'))]/..//div/input"), textToSent);

    }

    public void selectSweepSymbol(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Sweep Symbol'))]/..//div/input"));
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//label[contains(text(),('Sweep Symbol'))]/..//div/input"), textToSent);
        BaseLibrary.pressDown(6);
    }

    public void selectOptionDesig(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('OptionDesig'))]/..//div/input"));
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//label[contains(text(),('OptionDesig'))]/..//div/input"), textToSent);

    }

    public void enterLargeTraderID1(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Large Trader ID 1'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Large Trader ID 1'))]/..//div/input"), textToSent);

    }

    public void enterLargeTraderID2(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Large Trader ID 2'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Large Trader ID 2'))]/..//div/input"), textToSent);

    }

    public void enterLargeTraderID3(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Large Trader ID 3'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Large Trader ID 3'))]/..//div/input"), textToSent);

    }

    public void selectProxyOptout(String textToSent) throws Exception {
        if (textToSent.toLowerCase().contentEquals("yes")) {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('Proxy Optout'))]/..//div/button/span[contains(text(),'Yes')]"));
        } else {
            BaseLibrary.waitAndClickElementsUsingByLocator(By.xpath("//label[contains(text(),('Proxy Optout'))]/..//div/button/span[contains(text(),'No')]"));
        }
    }

    public void enterEscrowType(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Escrow Type'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Escrow Type'))]/..//div/input"), textToSent);

    }


    public void enterdocumentforNewAccount(String s) throws Exception {
        BaseLibrary.actionMoveAndClickByLocator(By.xpath("//button/span[contains(text(),'Document')]"));
        BaseLibrary.SetWaitTime(3000);
        BaseLibrary.waitAndClickElement(By.xpath("(//*[@id='add_fileUploadData'])[1]"));

    }

    public void uploadFileNAF(String fileName) {

        BaseLibrary.SetWaitTime(2000);
        String filePath = System.getProperty("user.dir") + fileName;
        BaseLibrary.uploadWithGivenFile(filePath);
        BaseLibrary.SetWaitTime(3000);

    }


    public void SFselectCountry(String textToSent) throws Exception {
      BaseLibrary.pressF5();
        BaseLibrary.waitAndClickElement(By.xpath("//*[@id='root']/div/div[2]/div[1]/div[3]/div/header/div/div[4]"));
        BaseLibrary.waitAndClickElement(By.xpath("//button/span[contains(text(),'SWIFTS')]"));
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Country*'))]/..//div/input"));
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//label[contains(text(),('Country*'))]/..//div/input"), textToSent);
    }


    public void selectCurrencySWIFT(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Currency*'))]/..//div/input"));
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//label[contains(text(),('Currency*'))]/..//div/input"), textToSent);
    }

    public void enterEuroClear(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Euro Clear'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Euro Clear'))]/..//div/input"), textToSent);
    }


    public void enterCedel(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Cedel'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Cedel'))]/..//div/input"), textToSent);

    }

    public void enterKass(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Kass'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Kass'))]/..//div/input"), textToSent);

    }


    public void enterLocal(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Local'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Local'))]/..//div/input"), textToSent);

    }

    public void selectAgentBank(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Agent Bank'))]/..//div/input"));
        BaseLibrary.clickOnTextFromDropdownList(By.xpath("//label[contains(text(),('Agent Bank'))]/..//div/input"), textToSent);

    }

    public void enterAgentAccount(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Agent Account'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Agent Account'))]/..//div/input"), textToSent);

    }

    public void enterAgentBIC(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Agent BIC'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Agent BIC'))]/..//div/input"), textToSent);

    }

    public void enterClientBIC(String textToSent) throws Exception {
        BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Client BIC'))]/..//div/input"));
        BaseLibrary.sendKeysToWebElement(By.xpath("//label[contains(text(),('Client BIC'))]/..//div/input"), textToSent);

    }

    public void verifyValidationMessae(String verifyText) throws Exception {
        By textTooVerify = By.xpath("//*[contains(text(),'Account Master has been created successfully!')]");
        BaseLibrary.verifyText(textTooVerify, verifyText);
        BaseLibrary.waitAndClickElement(By.xpath("//button[@title='Close']"));
    }

    public void verifyUpdateValidationMessae(String verifyText) throws Exception {
        By textTooVerify = By.xpath("//*[contains(text(),'The changes for the Account Master  has been saved successfully!')]");
        BaseLibrary.verifyText(textTooVerify, verifyText);
        BaseLibrary.waitAndClickElement(By.xpath("//button[@title='Close']"));
    }

    public void clickSaveButton() throws Exception {
        BaseLibrary.waitAndClickElementsUsingByLocator(button_Submit);

    }

    public void enterAccountMasterDetailsInSearchBox(String textToSent) throws Exception {
        loadTestData();
        // BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Client BIC'))]/..//div/input"));
        if (textToSent.contentEquals("AccountNumber")) {
            BaseLibrary.SetWaitTime(1000);
            Properties prop = readPropertiesFile(
                    System.getProperty("user.dir") + "/src/test/resources/properties/accountmaster.properties");
            String AccountNumber = prop.getProperty("AccountNumber");
            BaseLibrary.sendKeysToWebElement(By.xpath("//*[@id='outlined-basic']"), Pub_DwAccountNumber);


        } else if (textToSent.contentEquals("AccountName")) {
            BaseLibrary.SetWaitTime(1000);
            Properties prop = readPropertiesFile(
                    System.getProperty("user.dir") + "/src/test/resources/properties/accountmaster.properties");
            String AccountName = prop.getProperty("AccountName");
            BaseLibrary.sendKeysToWebElement(By.xpath("//*[@id='outlined-basic']"), Pub_AccountName);
        } else if (textToSent.contentEquals("AccountType")) {
            BaseLibrary.SetWaitTime(1000);
            Properties prop = readPropertiesFile(
                    System.getProperty("user.dir") + "/src/test/resources/properties/accountmaster.properties");
            String AccountType = prop.getProperty("AccountType");
            BaseLibrary.sendKeysToWebElement(By.xpath("//*[@id='outlined-basic']"), AccountType);

        }

        BaseLibrary.waitAndClickElement(By.xpath("//i[@class='search-icon']"));
    }

    public void enterDetailsInSearchBox(String textToSent) throws Exception {
        // BaseLibrary.setFocusToElement(By.xpath("//label[contains(text(),('Client BIC'))]/..//div/input"));

        BaseLibrary.sendKeysToWebElement(By.xpath("//*[@id='outlined-basic']"), textToSent);
        BaseLibrary.waitAndClickElement(By.xpath("//i[@class='search-icon']"));
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


    public void verifyTableValue(String sValue, String s1Value) throws Exception {
        if (sValue.contentEquals("Account Master name")) {

            BaseLibrary.SetWaitTime(1000);
            BaseLibrary.verifyTableListWithSingleColumnWithName(Pub_DwAccountNumber,"Acc. No");
            BaseLibrary.verifyTableListWithSingleColumnWithName(Pub_AccountName,"Acc. Name");
            BaseLibrary.waitAndClickElementUsingDynamic(Pub_AccountName);
            BaseLibrary.SetWaitTime(1000);
        }
    }

    public void loadTestData() throws IOException {
        dd = new DataDrivenUtility();
        dd.setExcelFile(dataSheetPath, "Partner");
        Pub_Partner = dd.getCellData(3, 1);
        dd.setExcelFile(dataSheetPath, "Office");
        Pub_Office = dd.getCellData(2, 1);
        dd.setExcelFile(dataSheetPath, "Office");
        Pub_Office = dd.getCellData(2, 1);
        dd.setExcelFile(dataSheetPath, "Sub Office");
        Pub_SubOffice = dd.getCellData(1, 1);
        Pub_SubOfficeCode = dd.getCellData(2, 1);
        dd = new DataDrivenUtility();
        dd.setExcelFile(dataSheetPath, "Account Master");
        Pub_DwAccountNumber = dd.getCellData(1, 1);
        Pub_CustomerAccountNumber = dd.getCellData(2, 1);
        Pub_AccountName = dd.getCellData(3, 1);
    }

    public void enterAccountMasterTypeInFilter(String string) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(By.id("filter_accountType"),string);
    }

    public void verifyAccountType(String type) {
        BaseLibrary.verifyTableListWithSingleColumnWithName(type,"Acc. Type");
    }

    public void filterAccountName(String ac_name) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(By.id("filter_accountName"),Pub_AccountName);
    }

    public void verifyAccountName(String account_name) {
        BaseLibrary.verifyTableListWithColName(Pub_AccountName,1,"Acc. Name");
    }

    public void filterPartner(String partner) throws Exception {
        BaseLibrary.clickOnTextFromDropdownList(By.id("filter_partner"),Pub_Partner);
    }

    public void verifyAccountPartner(String partner) {
        BaseLibrary.verifyTableListWithSingleColumnWithName(Pub_Partner,"Partner");
    }
}












