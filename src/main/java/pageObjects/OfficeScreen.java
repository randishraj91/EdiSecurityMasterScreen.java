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
import java.util.HashMap;
import java.util.List;

import static baseMethods.BaseLibrary.findElement;


public class OfficeScreen {

    static WebDriver driver;

    public OfficeScreen() {
        this.driver = Threadmanager.getdriver();
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }

    @FindBy(xpath = "//button/span[text()='Add New Office']")
    private WebElement addNewOffice;

    @FindBy(xpath = "//input[@id='add_officeNumber']")
    private WebElement officeCode;

    @FindBy(xpath = "//input[@id ='add_correspondentName']")
    private WebElement correspondent;

    @FindBy(xpath = "(//label[text()='Entity*']//following::input)[1]")
    private WebElement entity;
    @FindBy(xpath = "//input[@id='add_officeName']")
    private WebElement officeName;

    @FindBy(xpath = "//input[@id='add_description']")
    private WebElement officeDescription;

    @FindBy(xpath = "//input[@id='add_country']")
    private WebElement country;

    @FindBy(xpath = "//input[@id='add_statename']")
    private WebElement state;

    @FindBy(xpath = "//input[@id='add_cityname']")
    private WebElement city;

    @FindBy(xpath = "(//*[@id='demo-simple-select'])[2]")
    private WebElement  phonecountrycode;

    @FindBy(xpath = "//input[@id='add_zipcode']")
    private WebElement zipcode;

    @FindBy(xpath = "//input[@id ='add_addressLine1']")
    private WebElement addressLine1;

    @FindBy(xpath = "//input[@id ='add_addressLine2']")
    private WebElement addressLine2;

    @FindBy(xpath = "//input[@id ='add_phoneMobile']")
    private WebElement phoneNumber;

    @FindBy(xpath = "//input[@id = 'add_fax']")
    private WebElement fax;


    @FindBy(xpath = "//tbody/tr[1]")
    private WebElement tableFirstRow;

    @FindBy(xpath = "//span[text()='Search']")
    private WebElement filterSearchButton;

    @FindBy(xpath = "//div[@class='filter-section']//i[@class='close-icon']")
    private WebElement filtercloseButton;

    @FindBy(xpath = "//button[@type='reset']")
    private WebElement filterReset;

    @FindBy(xpath = "//input[@id = 'filter_name']")
    private WebElement filterOfficeName;

    @FindBy(xpath = "//input[@id = 'filter_officeNumber']")
    private WebElement filterOfficeNumber;

    @FindBy(xpath = "//input[@id = 'add_zipcode']")
    private WebElement zipCode;

    @FindBy(xpath = "//input[@id = 'add_email']")
    private WebElement email;

    @FindBy(xpath = "//*[@type='file'])[1]")
    private WebElement fileUpload;

    @FindBy(xpath = "//a[text()='Office']")
    private WebElement office_submenu;

    @FindBy(xpath = "//td[@id='row-0-cell-0']")
    private WebElement officenamehyperlink;

    @FindBy(xpath = "//td[@id='row-0-cell-1']")
    private WebElement officecodetable;

    @FindBy(xpath = "//*[contains(text(),'successfully!')]")
    private WebElement editsuccessfullMessage;

    @FindBy(xpath = "//button[@title='Close']")
    private WebElement close;

    @FindBy(xpath = "//button//span[text()='Edit']")
    private WebElement editbutton;

    @FindBy(xpath = "//input[@id='outlined-basic']")
    private WebElement universalsearch;

    @FindBy(xpath = "//i[@title='Delete File']")
    private WebElement filedelete;

    @FindBy(xpath = "//input[@type='file']")
    private WebElement reportdocument;

    @FindBy(xpath = "//*[@id='demo-mutiple-checkbox']")
    private WebElement viewcolumn;

    public static String officeCOde;

    public static String officeNAme;

    public void clickofficesubmenu() throws Exception {
        BaseLibrary.waitforelement(office_submenu);
        BaseLibrary.jsclickelement(office_submenu);
        BaseLibrary.waitforelement(addNewOffice);
    }

    public void enterOfficeCode(String Officecode) throws Exception {
        BaseLibrary.typetext(officeCode,Officecode);
        officeCOde= Officecode;
    }
    public void enterEntity(String Entity) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(entity,Entity,1);
    }

    public void enterPhonenumber(String PhoneNumber) throws Exception {
        BaseLibrary.typetext(phoneNumber,PhoneNumber);
    }

    public void enterCorrespondent(String Correspondent) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(correspondent, Correspondent,1);
    }

    public void enterOfficeName(String OfficeName) throws Exception {
        BaseLibrary.typetext(officeName,OfficeName);
        officeNAme=OfficeName;
    }

    public void enterDescription(String Description) throws Exception {
        BaseLibrary.typetext(officeDescription,Description);
    }
    public void enterAddressLine1(String addressline1) throws Exception {
        BaseLibrary.textclear(addressLine1);
        BaseLibrary.typetext(addressLine1, addressline1);
    }

    public void enterAddressLine2(String addressline2) throws Exception {
        BaseLibrary.textclear(addressLine2);
        BaseLibrary.typetext(addressLine2, addressline2);
    }

    public void enterCity(String City) throws Exception {
        BaseLibrary.typetext(city, City);
    }
    public void enterphonecountrycode(String phonecode) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(phonecountrycode, phonecode,1);
    }

    public void enterState(String State) throws Exception {
        BaseLibrary.typetext(state, State);
    }

    public void eenterCountry(String Country) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(country, Country, 1);
    }

    public void enterZipcode(String Zipcode) throws Exception {
        BaseLibrary.typetext(zipcode, Zipcode);
    }

    public void enterEmail(String Email) throws Exception {
        BaseLibrary.typetext(email, Email);
    }

    public void enterFax(String Fax) throws Exception {
        BaseLibrary.typetext(fax, Fax);
    }

    public void clickAddNewOffice() throws Exception {
        BaseLibrary.clickelement(addNewOffice);
        BaseLibrary.waitforelement(officeCode);
    }

    public void wrongfileupload(String inputfile) throws Exception {
        if(inputfile.equalsIgnoreCase("wrong"))
        BaseLibrary.fileupload(reportdocument,
                System.getProperty("user.dir") + "/src/test/resources/TestData/DEV_inputdata.xlsx");
        else
            BaseLibrary.fileupload(reportdocument,
                    System.getProperty("user.dir") + "/src/test/resources/TestData/Sample zero KB.pdf");
    }

    public void deleteuploadedfile() throws Exception {
        BaseLibrary.waitforelement(filedelete);
        BaseLibrary.clickelement(filedelete);
    }

    public void ViewColumn(String ColumnName) throws Exception {
//        Thread.sleep(3000);
        BaseLibrary.waitforelement(officenamehyperlink);
        Actions VC = new Actions((Threadmanager.getdriver()));
        VC.moveToElement(viewcolumn).click().build().perform();
        VC.moveToElement(findElement(By.xpath("//*[@data-value='"+ColumnName+"']"))).click().build().perform();
        VC.moveToElement(viewcolumn).click().build().perform();
    }

    public void notdisplaycolumn(String ColumnName) throws Exception {
        BaseLibrary.waitforelement(officenamehyperlink);
//        Thread.sleep(10000);
        Assert.assertTrue(driver.findElements(By.xpath("//em[text()='" + ColumnName + "']")).size()<1);
    }

    public void displaycolumn(String ColumnName) throws Exception {
        BaseLibrary.waitforelement(officenamehyperlink);
        BaseLibrary.waitforelement(driver.findElement(By.xpath("//em[text()='" + ColumnName + "']")));
    }

    public void creteOfficeWithallFields() throws Exception {
        enterOfficeCode(BaseLibrary.getdatabasedonsheet("Office", 6, 1));
        enterEntity(BaseLibrary.getdatabasedonsheet("Office", 0, 1));
        enterCorrespondent(BaseLibrary.getdatabasedonsheet("Office", 3, 1));
        enterOfficeName(BaseLibrary.getdatabasedonsheet("Office", 7, 1));
        enterDescription(BaseLibrary.getdatabasedonsheet("Office", 8, 1));
        enterAddressLine1(BaseLibrary.getdatabasedonsheet("Office", 9, 1));
        enterAddressLine2(BaseLibrary.getdatabasedonsheet("Office", 10, 1));
        eenterCountry(BaseLibrary.getdatabasedonsheet("Office", 11, 1));
        enterState(BaseLibrary.getdatabasedonsheet("Office", 12, 1));
        enterCity(BaseLibrary.getdatabasedonsheet("Office", 13, 1));
        enterZipcode(BaseLibrary.getdatabasedonsheet("Office", 14, 1));
        enterPhonenumber(BaseLibrary.getdatabasedonsheet("Office", 15, 1));
        enterEmail(BaseLibrary.getdatabasedonsheet("Office", 16, 1));
        enterFax(BaseLibrary.getdatabasedonsheet("Office", 17, 1));
    }

    public void creteOfficeWithmandatoryields(String officecode,String entity,String partner, String officeName) throws Exception {
        enterOfficeCode(officecode);
        enterEntity(entity);
        enterCorrespondent(partner);
        enterOfficeName(officeName);
        enterDescription(BaseLibrary.getdatabasedonsheet("Office", 8, 1));
        enterAddressLine1(BaseLibrary.getdatabasedonsheet("Office", 9, 1));
        eenterCountry(BaseLibrary.getdatabasedonsheet("Office", 11, 1));
        enterState(BaseLibrary.getdatabasedonsheet("Office", 12, 1));
        enterCity(BaseLibrary.getdatabasedonsheet("Office", 13, 1));
        enterphonecountrycode(BaseLibrary.getdatabasedonsheet("Partner", 169, 1));
        enterPhonenumber(BaseLibrary.getdatabasedonsheet("Office", 15, 1));
    }

    public void searchwithvaildonefilter(String officename) throws Exception {
        Thread.sleep(2000);
        BaseLibrary.waitforelement(filterOfficeName);
        BaseLibrary.typetext(filterOfficeName, officename);
        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }


    public void searchwithonefilter() throws Exception {
        Thread.sleep(2000);
        BaseLibrary.waitforelement(filterOfficeName);
        BaseLibrary.textclear(filterOfficeName);
        BaseLibrary.typetext(filterOfficeName,officeNAme);
        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }

    public void Update_office() throws Exception {
        BaseLibrary.waitforelement(officenamehyperlink);
        BaseLibrary.clickelement(officenamehyperlink);
        enterAddressLine1("Address Updated");
    }

    public void recordsonoffice() throws Exception {
        Thread.sleep(5000);
        BaseLibrary.waitforelement(tableFirstRow);
        Assert.assertEquals(officeCOde, officecodetable.getText());
    }

    public void recordsonvalidoffice(String officeCODe) throws Exception {
        Thread.sleep(5000);
        BaseLibrary.waitforelement(tableFirstRow);
        Assert.assertEquals(officeCODe, officecodetable.getText());
    }

    public void Verifysuccessfullymessage()throws Exception {
        BaseLibrary.waitforelement(editsuccessfullMessage);
        BaseLibrary.waitforelement(close);
        BaseLibrary.clickelement(close);
        Thread.sleep(2000);
    }
    public void searchwithoneinvalidfilter() throws Exception {
        Thread.sleep(5000);
        BaseLibrary.waitforelement(filterOfficeName);
        BaseLibrary.typetext(filterOfficeName, BaseLibrary.randomnumbergenerator(7));
        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }

    public void searchwithmultiplefilter(String searchone,String searchtwo) throws Exception {
        Thread.sleep(5000);
        BaseLibrary.waitforelement(filterOfficeName);
        BaseLibrary.typetext(filterOfficeName, searchone);
        BaseLibrary.waitforelement(filterOfficeNumber);
        BaseLibrary.typetext(filterOfficeNumber, searchtwo);
        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }

    public void searchwithmultipleinvalidfilter() throws Exception {
        Thread.sleep(5000);
        BaseLibrary.waitforelement(filterOfficeName);
        BaseLibrary.typetext(filterOfficeName, BaseLibrary.randomnumbergenerator(7));
        BaseLibrary.waitforelement(filterOfficeNumber);
        BaseLibrary.typetext(filterOfficeNumber, BaseLibrary.randomnumbergenerator(7));
        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }

    public void searchwithmultiplevalidandinvalidfilter(String searchone) throws Exception {
        Thread.sleep(5000);
        BaseLibrary.waitforelement(filterOfficeName);
        BaseLibrary.typetext(filterOfficeName, searchone);
        BaseLibrary.waitforelement(filterOfficeNumber);
        BaseLibrary.typetext(filterOfficeNumber, BaseLibrary.randomnumbergenerator(7));
        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }

    public void officeuniversalsearch(String input,String officename) throws Exception {
        Thread.sleep(2000);
        BaseLibrary.waitforelement(tableFirstRow);
        BaseLibrary.waitforelement(universalsearch);
        if (input.equalsIgnoreCase("valid")) {
            BaseLibrary.typetext(universalsearch, officename);
            BaseLibrary.waitforelement(tableFirstRow);
        } else {
            BaseLibrary.typetext(universalsearch, BaseLibrary.randomstringgenerator(5));
        }
    }

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

    @FindBy(xpath = "//*[contains(text(),'Export')]")
    private WebElement export;

//    public static List<WebElement> No_of_colummn() {
//        return No_of_colummn;
//    }
//    public static WebElement getTablerow() {
//        return tablerow;
//    }
//
//    public static List<WebElement> getExistingRow() {
//        return existingRow;
//    }
//
//    public static WebElement getNextPage() {
//        return NextPage;
//    }
//
//    public static WebElement getcurrentpage() {
//        return currentpage;
//    }

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

    //Reading webTable data
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


    public static String  getrowvisible() throws InterruptedException {
        String column_cellvalue = "";
        String row_cellvalue = "";
        String columnValues = "";
        WebElement celldata;
        Thread.sleep(5000);
        WebElement t = tablerow;
        List<WebElement> rws = t.findElements(By.tagName("tr"));
        BaseLibrary.waitforelement((WebElement) rws);
        int Table_row_size = rws.size();
        int Table_column_size = no_of_colummn.size();
        System.out.println("row:"+Table_row_size);
        System.out.println("column:"+Table_column_size);
        for (int row = rws.size(); row <= rws.size()-1; row++) {
            System.out.print(row +"rowno");
            for (int column = 2; column <= Table_column_size; column++) {
                WebDriverWait wait = new WebDriverWait(driver, 200);
                celldata = driver.findElement(By.xpath("//table/tbody/tr["+row+"]/td["+column+"]"));
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table/tbody/tr["+row+"]/td["+column+"]")));
                column_cellvalue = celldata.getText();
                Boolean isdisplayed= celldata.isDisplayed();
                if(!isdisplayed){
                    Actions actions = new Actions(driver);
                    actions.moveToElement(celldata).perform();
                    isdisplayed= celldata.isDisplayed();
                }
                System.out.print(celldata.getText() +',');
            }
        }
        return columnValues;
    }

    @FindBy(xpath = "//div[@class='view-export-option']//div/button[@aria-controls='long-menu']")
    private WebElement exportKebabButton;
    public void ClickOnExportButton() throws Exception {
        BaseLibrary.waitforelement(exportKebabButton);
        BaseLibrary.clickelement(exportKebabButton);
        Thread.sleep(3000);
        Actions VC = new Actions((Threadmanager.getdriver()));
        VC.moveToElement(export).click().build().perform();
        Thread.sleep(1000);
        VC.moveToElement(exportKebabButton).click().build().perform();
    }

}