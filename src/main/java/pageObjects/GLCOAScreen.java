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

import java.io.*;
import java.util.HashMap;
import java.util.List;

public class GLCOAScreen {

    static WebDriver driver;


    @FindBy(xpath = "//li[contains(@class,'active')]")
    private WebElement screen_AccountMasterData;

    @FindBy(xpath = "(//*[@class='MuiSvgIcon-root'])[9]")
    private WebElement  screen_clickoneditfirst;

    @FindBy(xpath = "//div[@class='view-export-option']")
    private WebElement    screen_clickonexportthreebutton;

    @FindBy(xpath = "//*[@id='outlined-basic']")
    private WebElement   screen_searchoperationgl;

    @FindBy(xpath = "//*[@class='filter-icon']")
    private WebElement   screen_glcoafilterclick;

    @FindBy(xpath = "//*[@id='outlined-basic']")
    private WebElement   screen_validsearch;

    @FindBy(xpath = "//*[@id='outlined-basic']")
    private WebElement search_sendvalidsearch;

    @FindBy(xpath = "//*[@class='search-icon']")
    private WebElement glhitsearchbutton;

    @FindBy(xpath = "//div[@class='MuiGrid-root main-table-section MuiGrid-item MuiGrid-grid-xs-12']")
    private WebElement tableFirstRow;

    @FindBy(xpath = "//input[@id='filter_glNumber']")
    private WebElement  filter_glnumber;

    @FindBy(xpath = "//input[@id='filter_glNumber']")
    private WebElement filter_sendglnumber;

    @FindBy(xpath = "//input[@id='filter_office']")
    private WebElement  filter_office;

    @FindBy(xpath = "//input[@id='filter_office']")
    private WebElement filter_sendoffice;

    @FindBy(xpath = "//input[@id='filter_glName']")
    private WebElement filter_glname;

    @FindBy(xpath = "//input[@id='filter_glName']")
    private WebElement  filter_sendglname;

    @FindBy(xpath = "//span[text()='Search']")
    private WebElement  filterSearchButton;

    @FindBy(xpath = "(//img[@alt='close'])[2]")
    private WebElement   filtercloseButton;

    @FindBy(xpath = "//*[@id=\"root\"]")
    private WebElement   checkTheTable;

    @FindBy(xpath = "//div[@class='MuiAlert-message']")
    private WebElement validateMessage;

    @FindBy(xpath = "//*[@class='MuiPaper-root MuiAlert-root MuiAlert-filledError MuiPaper-elevation6']")
    private WebElement alreadyexistverifytalbe;

    @FindBy(xpath = "//td[@id='row-0-cell-0']")
    private WebElement  verifytalbe;

    @FindBy(xpath = "//td[@id='row-2-cell-0']")
    private WebElement verifytalbeoffice;

    @FindBy(xpath = "//div[normalize-space()='No data found']")
    private WebElement   No_data_found;

    @FindBy(xpath = "//li[text()='Export']")
    private WebElement   screen_clickonexport;

    @FindBy(xpath = "(//li[@tabindex=-1][text()='Edit'])[1]")
    private WebElement  screen_clickoneditsecond;

    @FindBy(xpath = "//a[text()='GL Chart of Account']")
    private WebElement  screen_glcoafromthelist;

    @FindBy(xpath = "//span[normalize-space()='Add New GLCOA']")
    private WebElement  screen_addnewglcoa;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement  screen_saveglcoa;

    @FindBy(xpath = "//input[@id='add_glNumber']")
    private WebElement   glaccountnumber;

    @FindBy(xpath = "//input[@id='add_glNumber']")
    private WebElement  GLAccountNumberUP;

    @FindBy(xpath = "//input[@id='add_glName']")
    private WebElement    glaccountname;

    @FindBy(xpath = "//input[@id='add_glName']")
    private WebElement    GLAccountNameUP;

    @FindBy(xpath = "//span[@class='error-msg'][ text()='GL number required']")
    private WebElement   error_glaccnumber;

    @FindBy(xpath = "//input[@id='add_assetType']")
    private WebElement  gltype;

    @FindBy(xpath = "//input[@id='add_company']")
    private WebElement   companyname;

    @FindBy(xpath = "(//*[text()='Correspondent*']//following::input)[1]")
    private WebElement  correspondent;

    @FindBy(xpath = "(//*[text()='Office*']//following::input)[1]")
    private WebElement  office;

    @FindBy(xpath = "(//*[text()='SubOffice*']//following::input)[1]")
    private WebElement   suboffice;

    @FindBy(xpath = "(//*[text()='Account Number*']//following::input)[1]")
    private WebElement  accountnumber;

    @FindBy(xpath = "(//*[text()='Account Type*']//following::input)[1]")
    private WebElement  Accounttype;

    @FindBy(xpath = "(//*[text()='15c3 Line*']//following::input)[1]")
    private WebElement   line;

    @FindBy(xpath = "(//*[text()='Processing Ind*']//following::input)[1]")
    private WebElement   processingind;

    @FindBy(xpath = "//*[@id='add_costCenter']")
    private WebElement  costcenter;

    @FindBy(xpath = "//div[@class='MuiGrid-root main-table-section MuiGrid-item MuiGrid-grid-xs-12']")
    private WebElement seachcheckTheTable;

    @FindBy(xpath = "//td[@id='row-0-cell-0']")
    private WebElement searchverifytalbe;

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


    public static String GLaccountNumber;

    public GLCOAScreen() {
        this.driver = Threadmanager.getdriver();
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }
    public void clickontheaccountdatamanagement() throws Exception {
        BaseLibrary.actionMoveAndClick(screen_AccountMasterData);
    }

    public void clickoneditfirst() throws Exception {
        BaseLibrary.actionMoveAndClick(screen_clickoneditfirst);
    }

    public void clickonexportthreebutton() throws Exception {
        BaseLibrary.actionMoveAndClick(screen_clickonexportthreebutton);
    }

    public void searchoperationgl() throws Exception {
        BaseLibrary.actionMoveAndClick(screen_searchoperationgl);
    }

    public void glcoafilterclick() throws Exception {
        BaseLibrary.actionMoveAndClick(screen_glcoafilterclick);
    }

    public void clickonexport() throws Exception {
        BaseLibrary.waitforelement(screen_clickonexport);
        BaseLibrary.clickelement(screen_clickonexport);
    }

    public void clickoneditsecond() throws Exception {
        BaseLibrary.waitforelement(screen_clickoneditsecond);
        BaseLibrary.clickelement(screen_clickoneditsecond);
    }

    public void clickonglcoafromthelist() throws Exception {
        BaseLibrary.waitforelement(screen_glcoafromthelist);
        BaseLibrary.clickelement(screen_glcoafromthelist);
    }

    public void clickonaddnewglcoa() throws Exception {
        BaseLibrary.waitforelement(screen_addnewglcoa);
        BaseLibrary.clickelement(screen_addnewglcoa);
    }

    public void saveglcoa() throws Exception {
        BaseLibrary.waitforelement(screen_saveglcoa);
        BaseLibrary.clickelement(screen_saveglcoa);
    }
    public void enterglaccountnumber(String GLAccountNumber) throws Exception {
        BaseLibrary.typetext(glaccountnumber, GLAccountNumber);
    }

    public void updateglaccountnumber(String glaccountnumber2) throws Exception {
        BaseLibrary.textclear(GLAccountNumberUP);
        BaseLibrary.typetext(GLAccountNumberUP, BaseLibrary.randomnumbergenerator(7));
    }

    public void updateglaccountname(String glaccountname2) throws Exception {
        BaseLibrary.textclear(GLAccountNameUP);
        BaseLibrary.typetext(GLAccountNameUP, BaseLibrary.randomnumbergenerator(7));
    }

    public void enterglaccountname(String GLAccountName) throws Exception {
        BaseLibrary.typetext(glaccountname, GLAccountName);
    }
    public void entergltype(String GLType) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(gltype, GLType, 1);
    }

    public void enterentityname(String CompanyName) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(companyname, CompanyName, 1);
    }

    public void entercorrespondent(String Correspondent) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(correspondent, Correspondent, 1);
    }

    public void enteroffice(String Office) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(office, Office, 1);
    }

    public void entersuboffice(String SubOffice) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(suboffice, SubOffice, 1);
    }

    public void enteraccountnumber(String AccountNumber) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(accountnumber, AccountNumber, 1);
    }

    public void enteraccounttype(String AccountType) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(Accounttype, AccountType, 1);
    }

    public void enterline(String Line) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(line, Line, 1);
    }

    public void enterprocessingind(String ProcessingInd) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(processingind, ProcessingInd, 1);
    }

    public void entercostcenter(String CostCenter) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(costcenter, CostCenter, 1);
    }

    public void enterallglcoamandatory(String glaccountnumber,String glname) throws Exception {
        enterglaccountnumber(glaccountnumber);
        enterglaccountname(glname);
        entergltype(BaseLibrary.getdatabasedonsheet("GL COA", 3, 1));
        enterentityname(BaseLibrary.getdatabasedonsheet("GL COA", 4, 1));
        entercorrespondent(BaseLibrary.getdatabasedonsheet("GL COA", 7, 1));
        enteroffice(BaseLibrary.getdatabasedonsheet("GL COA", 11, 1));
        entersuboffice(BaseLibrary.getdatabasedonsheet("GL COA", 12, 1));
        enteraccountnumber(BaseLibrary.getdatabasedonsheet("GL COA", 14, 3));
        enteraccounttype(BaseLibrary.getdatabasedonsheet("GL COA", 15, 1));
        enterline(BaseLibrary.getdatabasedonsheet("GL COA", 16, 1));
        enterprocessingind(BaseLibrary.getdatabasedonsheet("GL COA", 17, 1));
        entercostcenter(BaseLibrary.getdatabasedonsheet("GL COA", 18, 1));
    }

    public void enterglcoasameGLaccountnumber() throws Exception {
        enterglaccountnumber(BaseLibrary.getdatabasedonsheet("GL COA", 20, 1));
        enterglaccountname(BaseLibrary.randomstringgenerator(7));
        entergltype(BaseLibrary.getdatabasedonsheet("GL COA", 3, 1));
        enterentityname(BaseLibrary.getdatabasedonsheet("GL COA", 4, 2));
        entercorrespondent(BaseLibrary.getdatabasedonsheet("GL COA", 7, 2));
        enteroffice(BaseLibrary.getdatabasedonsheet("GL COA", 11, 2));
        entersuboffice(BaseLibrary.getdatabasedonsheet("GL COA", 12, 2));
        enteraccountnumber(BaseLibrary.getdatabasedonsheet("GL COA", 14, 2));
        enteraccounttype(BaseLibrary.getdatabasedonsheet("GL COA", 15, 2));
        enterline(BaseLibrary.getdatabasedonsheet("GL COA", 16, 1));
        enterprocessingind(BaseLibrary.getdatabasedonsheet("GL COA", 17, 2));
        entercostcenter(BaseLibrary.getdatabasedonsheet("GL COA", 18, 2));
        BaseLibrary.clickelement(screen_saveglcoa);
    }

    public void createmaxvalidinputs() throws Exception {
        enterglaccountnumber(BaseLibrary.getdatabasedonsheet("GL COA", 1, 1));
        enterglaccountname(BaseLibrary.getdatabasedonsheet("GL COA", 2, 1));
        entergltype(BaseLibrary.getdatabasedonsheet("GL COA", 3, 2));
        enterentityname(BaseLibrary.getdatabasedonsheet("GL COA", 4, 2));
        entercorrespondent(BaseLibrary.getdatabasedonsheet("GL COA", 7, 2));
        enteroffice(BaseLibrary.getdatabasedonsheet("GL COA", 11, 2));
        entersuboffice(BaseLibrary.getdatabasedonsheet("GL COA", 12, 2));
        enteraccountnumber(BaseLibrary.getdatabasedonsheet("GL COA", 14, 2));
        enteraccounttype(BaseLibrary.getdatabasedonsheet("GL COA", 15, 2));
        enterline(BaseLibrary.getdatabasedonsheet("GL COA", 16, 1));
        enterprocessingind(BaseLibrary.getdatabasedonsheet("GL COA", 17, 2));
        entercostcenter(BaseLibrary.getdatabasedonsheet("GL COA", 18, 2));

    }
    public void Updateglcoamandatoryfields() throws Exception {

        updateglaccountname("GL Account Name");
    }
    public void Updatemaximumvalidinputs() throws Exception {

        updateglaccountname("GL Account Name");
    }

    public void glcoaupdatevalidationMeassage() throws Exception {
        BaseLibrary.waitforelement(checkTheTable);
        BaseLibrary.waitforelement(validateMessage);
        validateMessage.isDisplayed();

    }
    public void enterinvalidsearch(String glaccountNumber) throws Exception {
        BaseLibrary.waitforelement(screen_validsearch);
        BaseLibrary.typetext(search_sendvalidsearch, glaccountNumber);
        BaseLibrary.clickelement(glhitsearchbutton);
    }
    public void recordsonglcoa(String GLaccountNumber) throws Exception {
        Thread.sleep(5000);
        BaseLibrary.waitforelement(tableFirstRow);
        Assert.assertEquals(GLaccountNumber, verifytalbe.getText());
    }

    public void entervalidsearch(String costCenter) throws Exception {
        BaseLibrary.waitforelement(screen_validsearch);
        BaseLibrary.typetext(search_sendvalidsearch, costCenter);
        BaseLibrary.clickelement(glhitsearchbutton);
    }

    public void verifyvalidsearch(String nameofHoliday) throws Exception {
        Thread.sleep(5000);
        BaseLibrary.waitforelement(seachcheckTheTable);
        Assert.assertEquals(nameofHoliday, searchverifytalbe.getText());
    }
    public void glnodatafound() throws Exception {
        BaseLibrary.waitforelement(No_data_found);
        No_data_found.isDisplayed();
    }

    public void onefiltervalidgldata( String glaccountNumber) throws Exception {
        BaseLibrary.waitforelement(filter_glnumber);
        BaseLibrary.typetext(filter_sendglnumber, glaccountNumber);
        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }
    public void applyingonofficeFilter(String glaccountNumber,String glName) throws Exception {
        BaseLibrary.waitforelement(filter_glnumber);
        BaseLibrary.typetext(filter_sendglnumber, glaccountNumber);

        BaseLibrary.waitforelement(filter_glname);
        BaseLibrary.typetext(filter_sendglname, glName);

        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }

    public void onefilterinvalidgldata( String glaccountNumber) throws Exception {
        BaseLibrary.waitforelement(filter_glnumber);
        BaseLibrary.typetext(filter_sendglnumber, glaccountNumber);
        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }

    public void multiplevalidgldata( String glaccountNumber,String glName) throws Exception {
        BaseLibrary.waitforelement(filter_glnumber);
        BaseLibrary.typetext(filter_sendglnumber, glaccountNumber);

        BaseLibrary.waitforelement(filter_glname);
        BaseLibrary.typetext(filter_sendglname, glName);

        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }

    public void multipleinvalidgldata( String glaccountNumber,String glName) throws Exception {
        BaseLibrary.waitforelement(filter_glnumber);
        BaseLibrary.typetext(filter_sendglnumber, glaccountNumber);

        BaseLibrary.waitforelement(filter_glname);
        BaseLibrary.typetext(filter_sendglname, glName);

        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }

    public void verifyvalidfilter(String glaccountNumber) throws Exception {
        Thread.sleep(5000);
        BaseLibrary.waitforelement(checkTheTable);
        Assert.assertEquals(glaccountNumber, verifytalbe.getText());
    }

    public void verifyofficefilter(String Office) throws Exception {
        Thread.sleep(5000);
        BaseLibrary.waitforelement(checkTheTable);
        Assert.assertEquals(Office, verifytalbeoffice.getText());
    }

    public void verifysameglnumber() throws Exception {
        Thread.sleep(2000);
        BaseLibrary.waitforelement(checkTheTable);
        BaseLibrary.waitforelement(alreadyexistverifytalbe);
    }
    public static Object getApplicationFitTableRowValues() throws InterruptedException {
        HashMap<String, String> Tablevalue = new HashMap<String, String>();
        Tablevalue.put("TableValue", CompanyTable());
        System.out.println("WebTable:" + Tablevalue);
        return Tablevalue;
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
    public static Object getCSVFitTableRowValues(String filename) throws InterruptedException, IOException {
        HashMap<String, String> Tablevalue = new HashMap<String, String>();
        Tablevalue.put("TableValue", CSVfiletable(filename));
        System.out.println("csvvalue:" + Tablevalue);
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
    public static boolean verifyExportFileDownload(String fileName) throws IOException, InterruptedException {
        return waitForTheExcelFileToDownload(fileName, 80);
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

}

