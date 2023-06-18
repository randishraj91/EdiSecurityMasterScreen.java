package pageObjects;

import baseMethods.BaseLibrary;
import baseMethods.Threadmanager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class HolidayScreen {
    static WebDriver driver;

    static WebDriver  drpDwnList;


    @FindBy(xpath = "(//img[@class='normal'])[2]")
    private WebElement screen_clickonsystemwidemasterdataholiday;


    @FindBy(xpath = "//input[@id='outlined-basic']")
    private WebElement screen_clickonholidaysearchbutton;


    @FindBy(xpath = "//td[@id='row-0-cell-0']")
    private WebElement holidaynametable;

    @FindBy(xpath = "//input[@id='outlined-basic']")
    private WebElement screen_validsearch;

    @FindBy(xpath = "//input[@id='outlined-basic']")
    private WebElement search_sendvalidsearch;

    @FindBy(xpath = "//img[@alt='search']")
    private WebElement glhitsearchbutton;

    @FindBy(xpath = "//div[@class='MuiGrid-root main-table-section MuiGrid-item MuiGrid-grid-xs-12']")
    private WebElement seachcheckTheTable;

    @FindBy(xpath = "//td[@id='row-0-cell-0']")
    private WebElement searchverifytalbe;

    @FindBy(xpath = "//*[text()='Filter By'][@class='filter-icon']")
    private WebElement screen_clickonholidayfilter;

    @FindBy(xpath = "(//*[@class='MuiSvgIcon-root'])[8]")
    private WebElement screen_clickonthethreedotholiday;

    @FindBy(xpath = "(//li[text()='Edit'])[1]")
    private WebElement screen_clickontheholidayedit;

    @FindBy(xpath = "//li[text()='Export']")
    private WebElement screen_clickontheexportfunctionality;

    @FindBy(xpath = "//a[text()='Holidays']")
    private WebElement screen_clickonholiday;

    @FindBy(xpath = "//span[normalize-space()='Save']")
    private WebElement screen_savehholiday;

    @FindBy(xpath = "//div[@class='MuiAlert-message']")
    private WebElement validateMessage;

    @FindBy(xpath = "//button[@title='Close']")
    private WebElement close;

    @FindBy(xpath = "//span[normalize-space()='Add New Holiday']")
    private WebElement screen_clickonaddnewholidaybutton;

    @FindBy(xpath = "//*[@id='add_holidayName']")
    private WebElement nameofholiday;


    @FindBy(xpath = "(//*[text()='Date *']//following::input)[1]")
    private WebElement date;

    @FindBy(xpath = "(//*[text()='Date *']//following::input)[1]")
    private WebElement DateUP;

    @FindBy(xpath = "//*[@id='add_countryName']")
    private WebElement country;

    @FindBy(xpath = "//*[@id='add_countryName']")
    private WebElement countryLine1;

    @FindBy(xpath = "//*[@id='add_countryName']")
    private WebElement CountryUP;

    @FindBy(xpath = "//*[@id='add_assetType']")
    private WebElement assettype;

    @FindBy(xpath = "(//*[text()='Asset Type *']//following::input)[1]")
    private WebElement AssetTypeUP;

    @FindBy(xpath = "//*[@id='add_securityType']")
    private WebElement securitytype;

    @FindBy(xpath = "//*[@id='add_securityType']")
    private WebElement SecurityTypeUP;

    @FindBy(xpath = "//div[@id='add_Settlement']//span[@class='MuiToggleButton-label'][normalize-space()='Yes']")
    private WebElement settlementholiday;

    @FindBy(xpath = "(//*[@class='MuiToggleButton-label'][text()='Yes'])[2]")
    private WebElement tradingholiday;

    @FindBy(xpath = "//*[@id=\"root\"]")
    private WebElement checkTheTable;

    @FindBy(xpath = "//td[@id='row-0-cell-0']")
    private WebElement verifytalbe;

    @FindBy(xpath = "//*[contains(text(),'Export')]")
    private WebElement export;

    @FindBy(xpath = "//div[@class='view-export-option']//div/button[@aria-controls='long-menu']")
    private WebElement exportKebabButton;

    @FindBy(xpath = "//*[@class='MuiPaper-root MuiAlert-root MuiAlert-filledError MuiPaper-elevation6']")
    private WebElement alreadyexistverifytalbe;

    @FindBy(xpath = "(//*[@class='MuiToggleButton-label'][text()='No'])[1]")
    private WebElement settlementholidayno;

    @FindBy(xpath = "(//*[@class='MuiToggleButton-label'][text()='No'])[2]")
    private WebElement tradingholidayno;

    @FindBy(xpath = "//*[@id='filter_holidayName']")
    private WebElement filter_nameofholiday;

    @FindBy(xpath = "//*[@id='filter_country']")
    private WebElement filter_country;

    @FindBy(xpath = "//*[@id='filter_country']")
    private WebElement filter_sendcountry;

    @FindBy(xpath = "//*[@id='filter_holidayName']")
    private WebElement filter_sendnameofholiday;

    @FindBy(xpath = "//span[@class='MuiButton-label'][text()='Search']")
    private WebElement filterSearchButton;

    @FindBy(xpath = "(//i[@class='close-icon'])[2]")
    private WebElement filtercloseButton;

    @FindBy(xpath = "//div[normalize-space()='No data found']")
    private WebElement No_data_found;

    @FindBy(xpath = "//tbody/tr[1]")
    private WebElement tableFirstRow;

    @FindBy(xpath = "//span[@class='column-sort']")
    private WebElement sortcolumnholiday;

    @FindBy(xpath = "//tbody/tr[1]")
    private WebElement sorttableFirstRow;

    @FindBy(xpath = "//td[@id='row-0-cell-0']")
    private WebElement holidayhyperlink;

    @FindBy(xpath = "//*[contains(text(),'successfully!')]")
    private WebElement editsuccessfullMessage;

    @FindBy(xpath = "//tbody[@id='table-body-key']")
    public static WebElement tablerow;
    @FindBy(xpath = "//table/tbody/tr")
    public static List<WebElement> existingRow;
    @FindBy(xpath = "//button[@aria-label='Go to next page']")
    public static  WebElement nextPage;
    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiPaginationItem-root MuiPaginationItem-page MuiPaginationItem-textPrimary Mui-selected']")
    public static WebElement currentpage;
    @FindBy(xpath = "//table/tbody/tr[1]/td")
    public static List<WebElement> no_of_colummn;

    public static String createHoliday;
    public static String holidayName;
    public static String nameofHoliday;

    public HolidayScreen() {
        this.driver = Threadmanager.getdriver();
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    public void clickonsystemwidemasterdataholiday() throws Exception {
        BaseLibrary.actionMoveAndClick(screen_clickonsystemwidemasterdataholiday);
    }

    public void clickonholidaysearchbutton() throws Exception {
        BaseLibrary.actionMoveAndClick(screen_clickonholidaysearchbutton);
    }

    public void clickonholidayfilter() throws Exception {
        BaseLibrary.actionMoveAndClick(screen_clickonholidayfilter);
    }

    public void clickonthethreedotholiday() throws Exception {
        BaseLibrary.actionMoveAndClick(screen_clickonthethreedotholiday);
    }

    public void clickontheholidayedit() throws Exception {
        BaseLibrary.waitforelement(screen_clickontheholidayedit);
        BaseLibrary.clickelement(screen_clickontheholidayedit);
    }

    public void clickontheexportfunctionality() throws Exception {
        BaseLibrary.waitforelement(screen_clickontheexportfunctionality);
        BaseLibrary.clickelement(screen_clickontheexportfunctionality);
    }

    public void clickonholiday() throws Exception {
        BaseLibrary.waitforelement(screen_clickonholiday);
        BaseLibrary.clickelement(screen_clickonholiday);
    }

    public void savehholiday() throws Exception {
        BaseLibrary.waitforelement(screen_savehholiday);
        BaseLibrary.clickelement(screen_savehholiday);
    }

    public void enterCountry1(String countryline1) throws Exception {
        BaseLibrary.textclear(countryLine1);
        BaseLibrary.typetext(countryLine1, countryline1);
    }

    public void clickonaddnewholidaybutton() throws Exception {
        BaseLibrary.waitforelement(screen_clickonaddnewholidaybutton);
        BaseLibrary.clickelement(screen_clickonaddnewholidaybutton);
    }

    public void enternameofholiday(String NameofHoliday) throws Exception {
        BaseLibrary.typetext(nameofholiday, NameofHoliday);
    }

    public void enterdate(String Date) throws Exception {
        BaseLibrary.typetext(date, Date);
    }

    public void entercountry(String Country) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(country, Country, 1);
    }

    public void enterassettype(String AssetType) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(assettype, AssetType, 1);
    }

    public void entersecuritytype(String SecurityType) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(securitytype, SecurityType, 1);
    }



    public void validationMeassage(String expected_textMessage) throws Exception {
        Thread.sleep(1000);
        BaseLibrary.waitforelement(validateMessage);
        String actual_textMessage = validateMessage.getText();
        Assert.assertEquals(expected_textMessage, actual_textMessage);
        BaseLibrary.waitforelement(close);
        BaseLibrary.clickelement(close);
    }

    public void updatedate(String date) throws Exception {
        BaseLibrary.textclear(DateUP);
        BaseLibrary.dropdownselectionwithkeys(DateUP, date,1);
    }

    public void updatecountry(String country) throws Exception {
        BaseLibrary.textclear(CountryUP);
     BaseLibrary.dropdownselectionwithkeys(CountryUP, country,1);

    }
    public void updateholidayassettype(String assettype) throws Exception {
        BaseLibrary.textclear(AssetTypeUP);
        BaseLibrary.dropdownselectionwithkeys(AssetTypeUP, assettype, 1);
    }

    public void updatesecuritytype(String securitytype) throws Exception {
        BaseLibrary.textclear(SecurityTypeUP);
        BaseLibrary.dropdownselectionwithkeys(SecurityTypeUP, securitytype,1);
    }

    public void enterallfieldsholiday() throws Exception {

        enternameofholiday(BaseLibrary.randomstringgenerator(9));
        enterdate(BaseLibrary.getdatabasedonsheet("Holiday", 2, 3));
        entercountry(BaseLibrary.getdatabasedonsheet("Holiday", 3, 5));
        enterassettype(BaseLibrary.getdatabasedonsheet("Holiday", 4, 1));
        entersecuritytype(BaseLibrary.getdatabasedonsheet("Holiday", 5, 5));
        BaseLibrary.clickelement(settlementholiday);
        BaseLibrary.clickelement(tradingholiday);


    }

    public void recordsonholiday() throws Exception {
        Thread.sleep(5000);
        BaseLibrary.waitforelement(tableFirstRow);
        Assert.assertEquals(holidayName, holidaynametable.getText());
    }

    public void enterwithdifferentsecuritytype() throws Exception {
        enternameofholiday(BaseLibrary.randomstringgenerator(9));
        enterdate(BaseLibrary.getdatabasedonsheet("Holiday", 2, 3));
        entercountry(BaseLibrary.getdatabasedonsheet("Holiday", 3, 5));
        enterassettype(BaseLibrary.getdatabasedonsheet("Holiday", 4, 1));
        entersecuritytype(BaseLibrary.getdatabasedonsheet("Holiday", 5, 5));
        BaseLibrary.clickelement(settlementholiday);
        BaseLibrary.clickelement(tradingholiday);
    }

    public void enterMandatoryfieldsholiday() throws Exception {
        enternameofholiday(BaseLibrary.randomstringgenerator(10));
        enterdate(BaseLibrary.getdatabasedonsheet("Holiday", 2, 3));
        entercountry(BaseLibrary.getdatabasedonsheet("Holiday", 3, 5));
        enterassettype(BaseLibrary.getdatabasedonsheet("Holiday", 4, 2));
        entersecuritytype(BaseLibrary.getdatabasedonsheet("Holiday", 5, 5));
    }

    public void entersameholidayname() throws Exception {
        enternameofholiday(BaseLibrary.getdatabasedonsheet("Holiday", 1, 4));
        enterdate(BaseLibrary.getdatabasedonsheet("Holiday", 2, 4));
        entercountry(BaseLibrary.getdatabasedonsheet("Holiday", 3, 4));
        enterassettype(BaseLibrary.getdatabasedonsheet("Holiday", 4, 4));
        entersecuritytype(BaseLibrary.getdatabasedonsheet("Holiday", 5, 4));
        BaseLibrary.clickelement(settlementholiday);
        BaseLibrary.clickelement(tradingholiday);
    }

    public void holidayvalidationMeassage() throws Exception {
        BaseLibrary.waitforelement(checkTheTable);
        BaseLibrary.waitforelement(validateMessage);
        validateMessage.isDisplayed();
    }

    public void holidayupdatevalidationMeassage() throws Exception {
        BaseLibrary.waitforelement(checkTheTable);
        BaseLibrary.waitforelement(validateMessage);
        validateMessage.isDisplayed();

    }

    public void verifysystemshowsthepropererrormessage() throws Exception {
        Thread.sleep(2000);
        BaseLibrary.waitforelement(checkTheTable);
        BaseLibrary.waitforelement(alreadyexistverifytalbe);
    }

    public void updateholidayallthefields() throws Exception {
        updatedate(BaseLibrary.getdatabasedonsheet("Holiday", 2, 3));
        updatecountry(BaseLibrary.getdatabasedonsheet("Holiday", 3, 4));
        updateholidayassettype(BaseLibrary.getdatabasedonsheet("Holiday", 4, 2));
        updatesecuritytype(BaseLibrary.getdatabasedonsheet("Holiday", 5, 5));
        BaseLibrary.clickelement(settlementholidayno);
        BaseLibrary.clickelement(tradingholidayno);

    }

    public void updateholidayMandatoryfields() throws Exception {
        updatedate(BaseLibrary.getdatabasedonsheet("Holiday", 2, 3));
        updatecountry(BaseLibrary.getdatabasedonsheet("Holiday", 3, 3));
        updateholidayassettype(BaseLibrary.getdatabasedonsheet("Holiday", 4, 3));
        updatesecuritytype(BaseLibrary.getdatabasedonsheet("Holiday", 5, 5));
        BaseLibrary.clickelement(settlementholidayno);
        BaseLibrary.clickelement(tradingholiday);

    }


    public void onefiltervalidholiday() throws Exception {
        BaseLibrary.waitforelement(filter_nameofholiday);
        BaseLibrary.typetext(filter_sendnameofholiday, nameofHoliday);
        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }

    public void onefiltervalidholidaydata(String nameofHoliday) throws Exception {
        BaseLibrary.waitforelement(filter_nameofholiday);
        BaseLibrary.typetext(filter_sendnameofholiday, nameofHoliday);
        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }

    public void onefilterinvalidholidaydata(String nameofHoliday) throws Exception {
        BaseLibrary.waitforelement(filter_nameofholiday);
        BaseLibrary.typetext(filter_sendnameofholiday, nameofHoliday);
        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }

    public void Multiplefiltervalidholidaydata(String nameofHoliday, String Country) throws Exception {
        BaseLibrary.waitforelement(filter_nameofholiday);
        BaseLibrary.typetext(filter_sendnameofholiday, nameofHoliday);

        BaseLibrary.waitforelement(filter_country);
        BaseLibrary.typetext(filter_sendcountry, Country);

        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }

    public void onevalidoneinvalidfilter(String nameofHoliday, String Country) throws Exception {
        BaseLibrary.waitforelement(filter_nameofholiday);
        BaseLibrary.typetext(filter_sendnameofholiday, nameofHoliday);

        BaseLibrary.waitforelement(filter_country);
        BaseLibrary.typetext(filter_sendcountry, Country);

        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }

    public void Multiplefilterinvalidholidaydata(String nameofHoliday, String Country) throws Exception {
        BaseLibrary.waitforelement(filter_nameofholiday);
        BaseLibrary.typetext(filter_sendnameofholiday, nameofHoliday);

        BaseLibrary.waitforelement(filter_country);
        BaseLibrary.typetext(filter_sendcountry, Country);

        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }

    public void verifyholidaydata(String nameofHoliday) throws Exception {
        Thread.sleep(5000);
        BaseLibrary.waitforelement(checkTheTable);
        Assert.assertEquals(nameofHoliday, verifytalbe.getText());
    }

    public void holidaynodatafound() throws Exception {
        BaseLibrary.waitforelement(No_data_found);
        No_data_found.isDisplayed();
    }

    public void entervalidsearchholiday(String nameofHoliday) throws Exception {
        BaseLibrary.waitforelement(screen_validsearch);
        BaseLibrary.typetext(search_sendvalidsearch, nameofHoliday);
        BaseLibrary.clickelement(glhitsearchbutton);
    }

    public void enterinvalidsearchholiday(String nameofHoliday) throws Exception {
        BaseLibrary.waitforelement(screen_validsearch);
        BaseLibrary.typetext(search_sendvalidsearch, nameofHoliday);
        BaseLibrary.clickelement(glhitsearchbutton);
    }

    public void verifyoutcomevalidsearch(String nameofHoliday) throws Exception {
        Thread.sleep(5000);
        BaseLibrary.waitforelement(seachcheckTheTable);
        Assert.assertEquals(nameofHoliday, searchverifytalbe.getText());
    }

    public void verifyinvalidsearchholiday() throws Exception {
        BaseLibrary.waitforelement(No_data_found);
        No_data_found.isDisplayed();
    }

    public void clickonsortcolumn() throws Exception {
        Thread.sleep(3000);
        BaseLibrary.waitforelement(sortcolumnholiday);
        BaseLibrary.clickelement(sortcolumnholiday);
        Thread.sleep(2000);
    }

    public void verifyonsortcolumn() throws Exception {
        BaseLibrary.waitforelement(sorttableFirstRow);
        ArrayList<String> obtainedList = new ArrayList<>();
        List<WebElement> elementList = driver.findElements(By.xpath("//table/tbody/tr"));
        WebElement celldata;
        for (int row = 0; row < elementList.size() - 1; row++) {
            celldata = driver.findElement(By.xpath("//td[@id='row-" + row + "-cell-0']"));
            Actions actions = new Actions(driver);
            actions.moveToElement(celldata).perform();
            obtainedList.add(celldata.getText());
        }

        ArrayList<String> sortedList = new ArrayList<>();
        for (String s : obtainedList) {
            sortedList.add(s);
        }
    }

        public void clickontheexportholidaythreedot () throws Exception {
            BaseLibrary.waitforelement(exportKebabButton);
            BaseLibrary.clickelement(exportKebabButton);
            Thread.sleep(3000);
            Actions VC = new Actions((Threadmanager.getdriver()));
            VC.moveToElement(export).click().build().perform();
            Thread.sleep(1000);
            VC.moveToElement(exportKebabButton).click().build().perform();
        }

    public static String CompanyTable() throws InterruptedException {

        String column_cellvalue = "";
        String columnValues = "";
        WebElement celldata;
        Thread.sleep(1000);
        WebElement t = tablerow;
        List<WebElement> rws = t.findElements(By.tagName("tr"));
        boolean flag = true;

        while (flag) {
            int Table_row_size = existingRow.size();
            int Table_column_size = no_of_colummn.size();
            System.out.println("row:"+Table_row_size);
            System.out.println("column:"+Table_column_size);
            for (int row = 1; row <= Table_row_size; row++) {
                for (int column = 2; column <= Table_column_size; column++) {
                    WebDriverWait wait = new WebDriverWait(driver, 200);
                    celldata = driver.findElement(By.xpath("//table/tbody/tr["+row+"]/td["+column+"]"));
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table/tbody/tr["+row+"]/td["+column+"]")));
                    Boolean isdisplayed= celldata.isDisplayed();
                    if(!isdisplayed){
                        Actions actions = new Actions(driver);
                        actions.moveToElement(celldata).perform();
                        isdisplayed= celldata.isDisplayed();
                    }
                    column_cellvalue = celldata.getText();
                    columnValues = columnValues + "," + column_cellvalue;

                }
            }

            if (nextPage.getAttribute("class").contains("disabled")) {
                flag = false;
                System.out.println("This is the last page");
                break;
            } else {
                String Pagenumber = currentpage.getText();
                int currentPage = Integer.parseInt(Pagenumber);
                System.out.println("We are at page " + currentPage + " now.");
                nextPage.click();
                Thread.sleep(5000);
                String customLoc = "//button[@class='MuiButtonBase-root MuiPaginationItem-root MuiPaginationItem-page MuiPaginationItem-textPrimary Mui-selected'][@aria-label='page " + (currentPage + 1) + "']";
                WebElement NextPageload = driver.findElement(By.xpath(customLoc));
                int PageNo = Integer.parseInt(driver.findElement(By.xpath(customLoc)).getText());
                System.out.println("Page No:"+PageNo);
                BaseLibrary.waitforelement(NextPageload);
            }
        }
        return columnValues;
    }

    // Mapping the Webtable data
    public static Object getApplicationFitTableRowValues() throws InterruptedException {
        HashMap<String, String> Tablevalue = new HashMap<String, String>();
        Tablevalue.put("TableValue", CompanyTable());
        System.out.println("WebTable:" + Tablevalue);
        return Tablevalue;
    }
    //  Reading the CSV file data
    public static String CSVfiletable(String filename) throws IOException, InterruptedException, IOException {
        String file = getSystemDownloadPath() + getFilename(filename);
        System.out.println(file);
        String headers;
        String line;
        String Values = "";
        Thread.sleep(5000);
        BufferedReader br = new BufferedReader(new FileReader(file));
        headers = br.readLine();
        if(filename.contains("ledger")) {
            while ((line = br.readLine()) != null) {
                Values = Values + "," + line + ",";
            }
        }
        else {
            while ((line = br.readLine()) != null) {
                Values = Values+","+line;
            }
        }
        return Values;
    }

    //mapping the csv data
    public static Object getCSVFitTableRowValues(String filename) throws InterruptedException, IOException {
        HashMap<String, String> Tablevalue = new HashMap<String, String>();
        Tablevalue.put("TableValue", CSVfiletable(filename));
        System.out.println("csvvalue:" + Tablevalue);
        return Tablevalue;
    }

    private static String getSystemDownloadPath() {
//        String home = System.getProperty("user.home");
        String file = System.getProperty("user.dir") + "//src//test//resources//Downloads//";
//                home + "/Downloads/";
        return file;
    }

    public static String getFilename(String filename) throws InterruptedException {
        String downloadPath = getSystemDownloadPath();
        File dir = new File(downloadPath);
        File[] dirContents = dir.listFiles();
        boolean flag = false;
        String Expected = "";
        int totalFileCount = dirContents.length;
        for (int file = 0; file < totalFileCount; file++) {
            System.out.println(dirContents[file].getName());
            if (dirContents[file].getName().contains(filename)) {
                flag = true;
//                System.out.println("found:" + dirContents[file].getName());
                Expected = dirContents[file].getName();
            } else {
                Thread.sleep(300);
            }
        }
        return Expected;
    }
    public static boolean waitForTheExcelFileToDownload(String fileName, int timeWait)
            throws IOException, InterruptedException {
        String downloadPath = getSystemDownloadPath();
        File dir = new File(downloadPath);
        File[] dirContents = dir.listFiles();
        boolean flag = false;
        int totalFileCount = dirContents.length;
        for (int i = 0; i < totalFileCount; i++) {
            System.out.println(dirContents[i].getName());
            if (dirContents[i].getName().contains(fileName)) {
                dirContents[i].delete();
                flag = true;
                return flag;
            } else {
                Thread.sleep(timeWait);
            }
        }
        return flag;
    }
    public static boolean verifyExportFileDownload(String fileName) throws IOException, InterruptedException {
        return waitForTheExcelFileToDownload(fileName, 80);
    }

}




