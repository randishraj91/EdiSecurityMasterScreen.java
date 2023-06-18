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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static baseMethods.CommonUilitis.getdatabasedonsheet;

public class BrokermasterScreen {
    static WebDriver driver;


    @FindBy(xpath = "(//img[@class='normal'])[2]")
    private WebElement screen_SystemwideMasterdata;

    @FindBy(xpath = "//td[@id='longmenu-div-0']//span[@class='MuiIconButton-label']//*[name()='svg']")
    private WebElement screen_Editandviewoption;

    @FindBy(xpath = "(//li[@tabindex='-1'])[1]")
    private WebElement  screen_editbutton;

    @FindBy(xpath = "//span[normalize-space()='Save']")
    private WebElement screen_clicksaveBM;

    @FindBy(xpath = "//input[@id='outlined-basic']")
    private WebElement screen_Clickonsearchfilter;

    @FindBy(xpath = "(//*[@class='MuiSvgIcon-root'])[1]")
    private WebElement  screen_clickonpreexport;

    @FindBy(xpath = "//li[@tabindex='0'][text()='Export']")
    private WebElement  screen_clickonexport;

    @FindBy(xpath = "//span[@class='filter-icon']")
    private WebElement screen_firststepFilter;

    @FindBy(xpath = "//div[@class='view-export-option']//div/button[@aria-controls='long-menu']")
    private WebElement exportKebabButton;

    @FindBy(xpath = "//tbody/tr[1]")
    private WebElement sorttableFirstRow;

    @FindBy(xpath = "//*[contains(text(),'Export')]")
    private WebElement export;

    @FindBy(xpath = "//a[normalize-space()='Broker Master']")
    private WebElement screen_brokermasterfrommainlist;

    @FindBy(xpath = "//span[@class='MuiButton-label'][text()='Add New Broker']")
    private WebElement  screen_addnewbrokerbutton;

    @FindBy(xpath = "//input[@id='add_clearNum']")
    private WebElement  brokernumber;

    @FindBy(xpath = "//input[@id='add_brokerName']")
    private WebElement  brokername;

    @FindBy(xpath = "//input[@id='add_brokerSymbol']")
    private WebElement   symbol;

    @FindBy(xpath = "//input[@id='add_mpid']")
    private WebElement   mpid;

    @FindBy(xpath = "//input[@id='add_mpidDescription']")
    private WebElement     mpiddescription;

    @FindBy(xpath = "//input[@id='add_brokerEntryAgent']")
    private WebElement    brokerentryagent;

    @FindBy(xpath = "//input[@id='add_clearNum']")
    private WebElement    BrokerNumber1;

    @FindBy(xpath = "//input[@id='add_clearNum']")
    private WebElement   BrokerNumber2;

    @FindBy(xpath = "//input[@id='add_brokerName']")
    private WebElement   BrokerName1;

    @FindBy(xpath = "//input[@id='add_brokerSymbol']")
    private WebElement   Symbol1;

    @FindBy(xpath = "//input[@id='add_mpid']")
    private WebElement  Mpid1;

    @FindBy(xpath = "//input[@id='add_mpidDescription']")
    private WebElement   MpidDescription1;


    @FindBy(xpath = "//input[@id='add_brokerEntryAgent']")
    private WebElement BrokerEntryAgent1;

    @FindBy(xpath = "//input[@id='add_executingBroker']")
    private WebElement ExecutingBroker1;

    @FindBy(xpath = "//input[@id='add_executingBroker']")
    private WebElement    executingbroker;

    @FindBy(xpath = "(//*[text()='Clearing broker*']//following::input)[1]")
    private WebElement   clearingbroker;

    @FindBy(xpath = "(//*[text()='ContraAc*']//following::input)[1]")
    private WebElement   contraac;

    @FindBy(xpath = "(//*[text()='ContraAc*']//following::input)[1]")
    private WebElement  upcontraac;

    @FindBy(xpath = "(//*[text()='QSR*']//following::input)[1]")
    private WebElement qsr;

    @FindBy(xpath = "(//*[text()='Type*']//following::input)[1]")
    private WebElement type;

    @FindBy(xpath = "(//*[text()='Contract Type']//following::input)[1]")
    private WebElement contracttype;

    @FindBy(xpath = "//div[@id='add_bondExchangeIndicator']//span[@class='MuiToggleButton-label'][normalize-space()='Yes']")
    private WebElement   BondExchangeIndicator;

    @FindBy(xpath = "//div[@id='add_acatsIndicator']//span[@class='MuiToggleButton-label'][normalize-space()='Yes']")
    private WebElement  AcatsIndicator;

    @FindBy(xpath = "//div[@id='add_internationalIndicator']//span[@class='MuiToggleButton-label'][normalize-space()='Yes']")
    private WebElement  InternationalIndicator;

    @FindBy(xpath = "//input[@id='filter_brokerName']")
    private WebElement    filter_brokername;

    @FindBy(xpath = "//input[@id='filter_brokerSymbol']")
    private WebElement  filter_brokersymbol;

    @FindBy(xpath = "//input[@id='filter_brokerSymbol']")
    private WebElement  filter_sendBrokerSymbol;

    @FindBy(xpath = "//*[@id=\"root\"]")
    private WebElement   checkTheTable;

    @FindBy(xpath = "//div[@class='MuiAlert-message']")
    private WebElement validateMessage;

    @FindBy(xpath = "//*[@class='MuiPaper-root MuiAlert-root MuiAlert-filledError MuiPaper-elevation6']")
    private WebElement alreadyexistverifytalbe;

    @FindBy(xpath = "//div[normalize-space()='No data found']")
    private WebElement No_data_found;

    @FindBy(xpath = "//input[@id='outlined-basic']")
    private WebElement  screen_validsearch;

    @FindBy(xpath = "//input[@id='outlined-basic']")
    private WebElement search_sendvalidsearch;

    @FindBy(xpath = "//img[@alt='search']")
    private WebElement hitSearchButton;

    @FindBy(xpath = "//div[@class='MuiGrid-root main-table-section MuiGrid-item MuiGrid-grid-xs-12']")
    private WebElement seachcheckTheTable;

    @FindBy(xpath = "//td[@id='row-0-cell-0']")
    private WebElement  searchverifytalbe;

    @FindBy(xpath = "//td[@id='row-0-cell-0']")
    private WebElement   verifytalbe;

    @FindBy(xpath = "//input[@id='filter_brokerName']")
    private WebElement   filter_sendBrokerName;

    @FindBy(xpath = "//span[normalize-space()='Search']")
    private WebElement   filterSearchButton;

    @FindBy(xpath = "//div[contains(@class,'filter-section')]//img[contains(@alt,'close')]")
    private WebElement filtercloseButton;

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

    public BrokermasterScreen() {
        this.driver = Threadmanager.getdriver();
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    public void enterbrokernumber(String BrokerNumber) throws Exception {
        BaseLibrary.typetext(brokernumber, BrokerNumber);
    }

    public void enterbrokername(String BrokerName) throws Exception {
        BaseLibrary.typetext(brokername, BrokerName);
    }

    public void entersymbol(String Symbol) throws Exception {
        BaseLibrary.typetext(symbol, Symbol);
    }

    public void entermpid(String Mpid) throws Exception {
        BaseLibrary.typetext(mpid, Mpid);
    }

    public void entermpiddescription(String MpidDescription) throws Exception {
        BaseLibrary.typetext(mpiddescription, MpidDescription);
    }

    public void enterBrokerentryagent(String BrokerEntryAgent) throws Exception {
        BaseLibrary.typetext(brokerentryagent, BrokerEntryAgent);
    }

    public void enterbrokernumber1(String brokernumber1) throws Exception {
        BaseLibrary.textclear(BrokerNumber1);
        BaseLibrary.typetext(BrokerNumber1, BaseLibrary.randomnumbergenerator(7));
    }
    public void enterbrokernumber2(String brokernumber2) throws Exception {
        BaseLibrary.textclear(BrokerNumber2);
        BaseLibrary.typetext(BrokerNumber2, BaseLibrary.randomnumbergenerator(7));
    }

    public void enterbrokername1(String brokername1) throws Exception {
        BaseLibrary.textclear(BrokerName1);
        BaseLibrary.typetext(BrokerName1, BaseLibrary.randomstringgenerator(7));
    }

    public void entersymbol1(String symbol1) throws Exception {
        BaseLibrary.textclear(Symbol1);
        BaseLibrary.typetext(Symbol1, BaseLibrary.randomnumbergenerator(7));
    }

    public void entermpid12(String mpid1) throws Exception {
        BaseLibrary.textclear(Mpid1);
        BaseLibrary.typetext(Mpid1, BaseLibrary.randomstringgenerator(7));
    }

    public void entermpiddescription1(String mpiddescription1) throws Exception {
        BaseLibrary.textclear(MpidDescription1);
        BaseLibrary.typetext(MpidDescription1, BaseLibrary.randomstringgenerator(7));
    }

    public void enterBrokerentryagentupdate(String brokerentryagent1) throws Exception {
        BaseLibrary.textclear(BrokerEntryAgent1);
        BaseLibrary.typetext(BrokerEntryAgent1, BaseLibrary.randomstringgenerator(7));
    }
    public void enterexecutingbrokerupdate(String executingbroker1) throws Exception {
        BaseLibrary.textclear(ExecutingBroker1);
        BaseLibrary.typetext(ExecutingBroker1, BaseLibrary.randomstringgenerator(7));
    }
    public void enterexecutingbroker(String ExecutingBroker) throws Exception {
        BaseLibrary.typetext(executingbroker, ExecutingBroker);
    }

    public void enterclearingbroker(String ClearingBroker) throws Exception {
        BaseLibrary.typetext(clearingbroker, ClearingBroker);
    }

    public void entercontraac(String ContraAc) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(contraac, ContraAc, 1);
    }

    public void Updatecontraac(String contraac) throws Exception {
        BaseLibrary.textclear(upcontraac);
        BaseLibrary.dropdownselectionwithkeys(upcontraac, contraac,1);
    }

    public void enterqsr(String QSR) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(qsr, QSR, 1);
    }

    public void entertype(String Type) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(type, Type, 1);
    }

    public void entercontracttype(String ContractType) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(contracttype, ContractType, 1);
    }

    public void clickontheSystemwideMasterdata() throws Exception {
        BaseLibrary.actionMoveAndClick(screen_SystemwideMasterdata);
    }

    public void editandviewoption() throws Exception {
        BaseLibrary.actionMoveAndClick(screen_Editandviewoption);
    }

    public void editbutton() throws Exception {
        BaseLibrary.waitforelement(screen_editbutton);
        BaseLibrary.clickelement(screen_editbutton);
    }


    public void clicksaveBM() throws Exception {
        BaseLibrary.actionMoveAndClick(screen_clicksaveBM);
    }

    public void clickonpreexport() throws Exception {
        BaseLibrary.actionMoveAndClick(screen_clickonpreexport);
    }

    public void clickonexport() throws Exception {
        BaseLibrary.actionMoveAndClick(screen_clickonexport);
    }

    public void Clickonsearchfilter() throws Exception {
        BaseLibrary.actionMoveAndClick(screen_Clickonsearchfilter);
    }

    public void firststepFilter() throws Exception {
        BaseLibrary.actionMoveAndClick(screen_firststepFilter);
    }

    public void clickonthebrokermasterfrommainlist() throws Exception {
        BaseLibrary.waitforelement(screen_brokermasterfrommainlist);
        BaseLibrary.clickelement(screen_brokermasterfrommainlist);
    }
    public void clickontheaddnewbrokerbutton() throws Exception {
        BaseLibrary.waitforelement(screen_addnewbrokerbutton);
        BaseLibrary.clickelement(screen_addnewbrokerbutton);
    }

    public void createllfiledsBM() throws Exception {
        enterbrokernumber(BaseLibrary.randomnumbergenerator(6));
        enterbrokername(getdatabasedonsheet("Broker", 6, 1));
        entersymbol(BaseLibrary.randomnumbergenerator(5));
        entermpid(BaseLibrary.randomnumbergenerator(7));
        entermpiddescription(BaseLibrary.randomstringgenerator(7));
        entercontraac(getdatabasedonsheet("Broker", 6, 1));
        enterqsr(getdatabasedonsheet("Broker", 7, 1));
        enterclearingbroker(BaseLibrary.randomnumbergenerator(1));
        entertype(getdatabasedonsheet("Broker", 9, 1));
        entercontracttype(getdatabasedonsheet("Broker", 10, 1));
        enterBrokerentryagent(BaseLibrary.randomstringgenerator(6));
        enterexecutingbroker(BaseLibrary.randomstringgenerator(8));
        BaseLibrary.clickelement(BondExchangeIndicator);
        BaseLibrary.clickelement(AcatsIndicator);
        BaseLibrary.clickelement(InternationalIndicator);
    }

    public void createmandatoryfiledsBM() throws Exception {
        enterbrokernumber(BaseLibrary.randomnumbergenerator(7));
        enterbrokername(BaseLibrary.randomstringgenerator(7));
        entersymbol(BaseLibrary.randomnumbergenerator(7));
        entermpid(BaseLibrary.randomnumbergenerator(7));
        entercontraac(getdatabasedonsheet("Broker", 6, 1));
        enterqsr(getdatabasedonsheet("Broker", 7, 1));
        enterclearingbroker(BaseLibrary.randomnumbergenerator(1));
        entertype(getdatabasedonsheet("Broker", 9, 1));
        enterBrokerentryagent(BaseLibrary.randomstringgenerator(9));
    }

    public void updateMandatoryFields() throws Exception {
        enterbrokernumber1("Broker Number");
        entersymbol1("Symbol");
        entermpid12("Mpid");
        Updatecontraac(getdatabasedonsheet("Broker", 6, 1));

    }

    public void updateAllFields() throws Exception {
        enterbrokernumber2("Broker Number");
        entersymbol1("Symbol");
        entermpid12("Mpid");
        Updatecontraac(getdatabasedonsheet("Broker", 6, 1));
        entermpiddescription1("Mpid Description");
        enterBrokerentryagentupdate("Broker Entry Agent");
        enterexecutingbrokerupdate("Executing Broker");
    }
    public void createwiththesamebroker() throws Exception {
        enterbrokernumber(BaseLibrary.randomnumbergenerator(7));
        enterbrokername(getdatabasedonsheet("Broker", 2, 2));
        entersymbol(BaseLibrary.randomnumbergenerator(7));
        entermpid(BaseLibrary.randomnumbergenerator(7));
        entercontraac(getdatabasedonsheet("Broker", 6, 1));
        enterqsr(getdatabasedonsheet("Broker", 7, 1));
        enterclearingbroker(BaseLibrary.randomnumbergenerator(1));
        entertype(getdatabasedonsheet("Broker", 9, 1));
        enterBrokerentryagent(BaseLibrary.randomstringgenerator(9));
    }
    public void onefiltervaliddataBM( String brokerName) throws Exception {
        BaseLibrary.waitforelement(filter_brokername);
        BaseLibrary.typetext(filter_sendBrokerName, brokerName);
        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }

    public void onefilterinvaliddataBM( String brokerName) throws Exception {
        BaseLibrary.waitforelement(filter_brokername);
        BaseLibrary.typetext(filter_sendBrokerName, brokerName);
        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }

    public void MultipleinvaliddataBM( String brokerName,String brokerSymbol) throws Exception {
        BaseLibrary.waitforelement(filter_brokername);
        BaseLibrary.typetext(filter_sendBrokerName, brokerName);

        BaseLibrary.waitforelement(filter_brokersymbol);
        BaseLibrary.typetext(filter_sendBrokerSymbol, brokerSymbol);

        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }


    public void onemultiplevaliddataBM( String brokerName,String brokerSymbol) throws Exception {
        BaseLibrary.waitforelement(filter_brokername);
        BaseLibrary.typetext(filter_sendBrokerName, brokerName);

        BaseLibrary.waitforelement(filter_brokersymbol);
        BaseLibrary.typetext(filter_sendBrokerSymbol, brokerSymbol);

        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }

    public void verifyonevalidfilterBM(String brokerName) throws Exception {
        Thread.sleep(5000);
        BaseLibrary.waitforelement(checkTheTable);
        Assert.assertEquals(brokerName, verifytalbe.getText());
    }

    public void norecordonefilter() throws Exception {
        BaseLibrary.waitforelement(No_data_found);
        No_data_found.isDisplayed();
    }

    public void validsearchbroker(String brokerName) throws Exception {
        BaseLibrary.waitforelement(screen_validsearch);
        BaseLibrary.typetext(search_sendvalidsearch, brokerName);
        BaseLibrary.clickelement(hitSearchButton);
    }

    public void verifyoutcomevalidsearch(String brokerNumber) throws Exception {
        Thread.sleep(5000);
        BaseLibrary.waitforelement(seachcheckTheTable);
        Assert.assertEquals(brokerNumber, searchverifytalbe.getText());
    }

    public void verifysystemshowsthepropererrormessage() throws Exception {
        Thread.sleep(2000);
        BaseLibrary.waitforelement(checkTheTable);
        BaseLibrary.waitforelement(alreadyexistverifytalbe);
    }

    public void brokerupdatevalidationMeassage() throws Exception {
        BaseLibrary.waitforelement(checkTheTable);
        BaseLibrary.waitforelement(validateMessage);
        validateMessage.isDisplayed();

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
