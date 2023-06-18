package pageObjects;

import baseMethods.BaseLibrary;
import baseMethods.DataDrivenUtility;
import com.github.javafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Currenyrate {

    public static String Pub_Currency = "";
    public static String Pub_Rate = "";
    public static String Pub_CurrencyAgaints = "";
    public static String Pub_Description = "";
    public static String Pub_Date = "";
    public int curStamp = 0;

    public static DataDrivenUtility dd = null;
    public String dataSheetPath = System.getProperty("user.dir") + "/src/test/resources/testFiles/TestData.xlsx";
    By systemMaster = By.xpath("//*[@id='simple-menu']/ul/li[3]/em");
    By navigateCurrencyrate = By.xpath("//ul[@class='sub-menu-list']//li//a[text()='Currency Rates']");
    By addCurrencyrate = By.xpath("//*[text()='Add New Currency Rate']");
    By currency = By.xpath("//input[@class]");
    By rate = By.xpath("//input[@class]//following::input[1]");
    By currencyagainst = By.xpath("//input[@class]//following::input[2]");
    By description = By.xpath("//input[@class]//following::input[3]");
    By ratedate = By.xpath("//input[@class]//following::input[4]");
    By button_Save = By.xpath("//*[text()='Save']");
    By searchCurrencyrate = By.xpath("//input[@id='outlined-basic']");
    By searchIcon = By.xpath("//i[@class='search-icon']");
    By currencyfilter = By.xpath("//span[text()='Filter By']");
    By filtercurrency = By.xpath("//*[@class]//following::input[4]");
    By filterrate = By.xpath("//*[@class]//following::input[5]");
    By filtercurrencyagainst = By.xpath("//*[@class]//following::input[7]");
    By filterdescription = By.xpath("//*[@class]//following::input[6]");
    By filterratedate = By.xpath("//*[@class]//following::input[8]");
    By filtersearch = By.xpath("//span[text()='Search']");
    By filterreset = By.xpath("//span[text()='Reset']");
    By button_cancel = By.xpath("//*[text()='Cancel']");
    By cancel_yes = By.xpath("//span[text()='Yes, go back']");
    By cancel_No = By.xpath("//span[text()='No, Proceed']");
    By CurrencyEditclick = By.xpath("//*[@class='MuiTableCell-root MuiTableCell-body link  MuiTableCell-sizeSmall']");
    By textTooVerify = By.xpath("//*[contains(text(),'Currency Rate has been created successfully!')]");
    By noDataOnTable = By.xpath("//*[contains(text(),'No data found')]");

    By editMessage = By.xpath("//*[contains(text(),'has been saved successfully!')]");
    By closeValidation = By.xpath("//*[@title='Close']");
    By exportlink = By.xpath("//*[@class='MuiSvgIcon-root']");
    By exportbutton = By.xpath("//li[@role='menuitem']");

    public void clickSystemMaster() throws Exception {

        BaseLibrary.waitAndClickElementsUsingByLocator(systemMaster);
        BaseLibrary.SetWaitTime(2000);
        BaseLibrary.waitAndClickElement(navigateCurrencyrate);

    }

    public void CurrencyFilter() throws Exception {

        BaseLibrary.waitAndClickElementsUsingByLocator(currencyfilter);

    }

    public void CurrencyEdit() throws Exception {

        BaseLibrary.waitAndClickElementsUsingByLocator(CurrencyEditclick);


    }

    public void addNewCurrencyrate() throws Exception {

        BaseLibrary.waitAndClickElementsUsingByLocator(addCurrencyrate);

        BaseLibrary.SetWaitTime(30);
    }

    public void FilterSearch() throws Exception {

        BaseLibrary.SetWaitTime(10);
        BaseLibrary.waitAndClickElementsUsingByLocator(filtersearch);
        BaseLibrary.SetWaitTime(70000);

    }

    public void FilterReset() throws Exception {

        BaseLibrary.SetWaitTime(10);
        BaseLibrary.waitAndClickElementsUsingByLocator(filterreset);
        BaseLibrary.SetWaitTime(30);
    }

    public void clickSave() throws Exception {

        BaseLibrary.waitAndClickElementsUsingByLocator(button_Save);
        BaseLibrary.SetWaitTime(30);


    }

    public void clickCancelYes() throws Exception {

        BaseLibrary.waitAndClickElementsUsingByLocator(button_cancel);
        BaseLibrary.waitAndClickElementsUsingByLocator(cancel_yes);
        BaseLibrary.SetWaitTime(30);

    }

    public void clickCancelNo() throws Exception {

        BaseLibrary.waitAndClickElementsUsingByLocator(button_cancel);
        BaseLibrary.waitAndClickElementsUsingByLocator(cancel_No);
        BaseLibrary.SetWaitTime(30);

    }

    public void currency(String textToSent) throws Exception {
        String generatedString = RandomStringUtils.randomAlphabetic(8);
        textToSent = "CUR" + generatedString;
        BaseLibrary.clearText(currency);
        BaseLibrary.sendKeysToWebElement(currency, textToSent);
        dd = new DataDrivenUtility();
        dd.setExcelFile(dataSheetPath, "Currency Rates");
        dd.setCellValue(1, 1, textToSent, dataSheetPath);

    }

    public void Rate(String textToSent) throws Exception {
        Random random = new Random();
        int y = random.nextInt(10000);
        textToSent = Integer.toString(y);
        BaseLibrary.clearText(rate);
        BaseLibrary.sendKeysToWebElement(rate, textToSent);
        dd = new DataDrivenUtility();
        dd.setExcelFile(dataSheetPath, "Currency Rates");
        dd.setCellValue(2, 1, textToSent, dataSheetPath);
    }

    public void CurrencyAgainst(String textToSent) throws Exception {

        BaseLibrary.clearText(currencyagainst);
        BaseLibrary.clickOnTextFromDropdownList(currencyagainst, textToSent);
        dd = new DataDrivenUtility();
        dd.setExcelFile(dataSheetPath, "Currency Rates");
        dd.setCellValue(3, 1, textToSent, dataSheetPath);

    }

    public void Description(String textToSent) throws Exception {
        BaseLibrary.clearText(description);
        BaseLibrary.sendKeysToWebElement(description, textToSent);
        dd = new DataDrivenUtility();
        dd.setExcelFile(dataSheetPath, "Currency Rates");
        dd.setCellValue(4, 1, textToSent, dataSheetPath);
    }

    public void RateDate(String textToSent) throws Exception {
        // Faker faker = new Faker();
    /*    SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
        Date date = new Date();
        System.out.println(formatter.format(date) + "Parsed Date");
        //textToSent=formatter.format(date);*/
        //BaseLibrary.clearText(ratedate);
        // BaseLibrary.sendKeysToWebElement(ratedate, textToSent);
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
                    faker.number().randomDigit() + 21 + faker.number().randomDigit() + faker.number().randomDigit());
            String newDate = sdf.format(c.getTime());
            System.out.println("Date after Addition: " + newDate);

            textToSent = newDate.replaceAll("-", "/");
            BaseLibrary.waitAndClickElement(ratedate);
            // BaseLibrary.waitAndClickElement(ratedate);
            BaseLibrary.sendKeysToWebElement(ratedate, textToSent);
            // Base_Library.Func_MainNew(holidayDate, "SETTEXT", "Holiday Date
            // ", textToSent);

            dd = new DataDrivenUtility();
            dd.setExcelFile(dataSheetPath, "Currency Rates");
            dd.setCellValue(5, 1, textToSent, dataSheetPath);

        } else {

            BaseLibrary.sentTextUsingJS(ratedate, textToSent);

        }
    }

    public void enterCurrencyInSearchBox(String textToSent) throws Exception {
        BaseLibrary.SetWaitTime(30);
        BaseLibrary.sendKeysToWebElement(searchCurrencyrate, Pub_Currency);
        BaseLibrary.waitAndClickElementsUsingByLocator(searchIcon);
        BaseLibrary.SetWaitTime(30);
       // BaseLibrary.clickOnDynText(Pub_Currency);
    }

    public void filtercurrency(String textToSent) throws Exception {
        BaseLibrary.SetWaitTime(30);
        BaseLibrary.sendKeysToWebElement(filtercurrency, Pub_Currency);
        BaseLibrary.SetWaitTime(10);
    }

    public void filtercurrencyagainst(String textToSent) throws Exception {
        BaseLibrary.SetWaitTime(30);

        BaseLibrary.clickOnTextFromDropdownList(filtercurrencyagainst, textToSent);
        BaseLibrary.SetWaitTime(10);
    }

    public void filterrate(String textToSent) throws Exception {

        BaseLibrary.clearText(filterrate);
        int sum = Integer.parseInt(textToSent);
        sum++;
        textToSent = Integer.toString(sum);
        BaseLibrary.sendKeysToWebElement(filterrate, Pub_Rate);

        BaseLibrary.SetWaitTime(30);

    }


    public void filterdescription(String textToSent) throws Exception {
        BaseLibrary.SetWaitTime(30);


        BaseLibrary.sendKeysToWebElement(filterdescription, textToSent);
        BaseLibrary.SetWaitTime(30);
    }

    public void FilterRateDate(String textToSent) throws Exception {
        // Faker faker = new Faker();
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
        Date date = new Date();
        System.out.println(formatter.format(date) + "Parsed Date");
        textToSent = formatter.format(date);
        BaseLibrary.clearText(filterratedate);

        BaseLibrary.sendKeysToWebElement(filterratedate, Pub_Date);
    }

    public void CurrencyEditClick() throws Exception {

        BaseLibrary.waitAndClickElementsUsingByLocator(CurrencyEditclick);
        BaseLibrary.SetWaitTime(30);
    }

    public void verifyValidationMessage() throws Exception {
        //*[contains(text(),'Office has been created successfully!')]
        BaseLibrary.verifyText(textTooVerify, "Currency Rate has been created successfully!");
    }

    public void verifyNoDataDisplayed(String textToVerify) throws Exception {
        BaseLibrary.SetWaitTime(3000);
        BaseLibrary.verifyText(noDataOnTable, textToVerify);
    }

    public void verifyCurrency(String name1) throws Exception {
        BaseLibrary.VerifyDynText(Pub_Currency);
    }

    public void verifyRate(String name) throws Exception {
        BaseLibrary.verifyTableListWithSingleColumnWithName(Pub_Rate, "Rate");
    }

    public void verifyCurrencyAgainst(String name) throws Exception {
        BaseLibrary.verifyTableListWithSingleColumnWithName(name, "Currency Against");
    }

    public void verifyRateDate(String name) throws Exception {
        BaseLibrary.verifyTableListWithSingleColumnWithName(Pub_Date, "Rate Date");
    }

    public void verifyDescription(String name) throws Exception {
        BaseLibrary.verifyTableListWithSingleColumnWithName(name, "Description");
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
        System.out.println("Load Test Data");
        dd = new DataDrivenUtility();
        dd.setExcelFile(dataSheetPath, "Currency Rates");
        Pub_Currency = dd.getCellData(1, 1);
        Pub_Rate = dd.getCellData(2, 1);
        Pub_CurrencyAgaints = dd.getCellData(3, 1);
        Pub_Description = dd.getCellData(4, 1);
        Pub_Date = dd.getCellData(5, 1);

    }
}



















