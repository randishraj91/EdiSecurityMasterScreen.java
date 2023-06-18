package pageObjects;


import baseMethods.BaseLibrary;
import baseMethods.Threadmanager;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;


public class SubOfficeScreen {

    static WebDriver driver;

    public SubOfficeScreen() {
        this.driver = Threadmanager.getdriver();
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }


    @FindBy(xpath = "//button/span[text()='Add New Sub Office']")
    private WebElement addNewSubOffice;

    @FindBy(xpath = "//button[@title='Close']")
    private WebElement close;

    @FindBy(xpath = "//*[contains(text(),'successfully!')]")
    private WebElement editsuccessfullMessage;

    @FindBy(xpath = "//*[contains(text(),'Correspondent*')]/..//input")
    private WebElement Correspondent;

    @FindBy(xpath = "//*[contains(text(),'Office*')]/..//input")
    private WebElement office;

    @FindBy(xpath = "//*[contains(text(),'Sub Office Name*')]/..//input")
    private WebElement subOfficename;

    @FindBy(xpath = "//*[contains(text(),'Sub Office Code*')]/..//input")
    private WebElement subOfficeCode;

    @FindBy(xpath = "//*[contains(text(),'Purpose*')]/..//input")
    private WebElement subOfficePurpose;

    @FindBy(id = "outlined-basic")
    private WebElement searchBox;

    @FindBy(xpath = "//i[@class='search-icon']")
    private WebElement searchIcon;

    @FindBy(xpath = "//tbody/tr[1]")
    private WebElement tableFirstRow;

    @FindBy(xpath = "//input[@id='outlined-basic']")
    private WebElement universalsearch;

    @FindBy(xpath = "//*[contains(text(),'No data found')]")
    private WebElement noData;

    @FindBy(id = "filter_subOfficeName")
    private WebElement filtersubOfficeName;

    @FindBy(id = "filter_subOfficeCode")
    private WebElement filtersubOfficeCode;


    @FindBy(id = "filter_office")
    private WebElement filterOffice;

    @FindBy(xpath = "//span[text()='Search']")
    private WebElement filterSearchButton;

    @FindBy(xpath = "//div[@class='filter-section']//i[@class='close-icon']")
    private WebElement filtercloseButton;

    @FindBy(xpath = "//button[@type='reset']")
    private WebElement filterReset;

    @FindBy(xpath = "//div[@class='filter-section']//i[@class='close-icon']")
    private WebElement filterClose;

    @FindBy(xpath = "//a[text()='Sub Office']")
    private WebElement suboffice_submenu;

    @FindBy(xpath = "//td[@id='row-0-cell-0']")
    private WebElement subofficenamehyperlink;

    public static String subofficeCOde;

    public static String subofficeNAme;
    public void enterOffice(String Office) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(office,Office,1);
    }

    public void enterCorrespondent(String correspondant) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(Correspondent,correspondant,1);
    }

    public void enterSubofficename(String subOfficeName) throws Exception {
        BaseLibrary.typetext(subOfficename,subOfficeName);
        subofficeNAme=subOfficeName;
    }

    public void enterSubofficecode(String subofficecode) throws Exception {
        BaseLibrary.typetext(subOfficeCode,subofficecode);
        subofficeCOde=subofficecode;
    }

    public void enterPurpose(String purpose) throws Exception {
        BaseLibrary.typetext(subOfficePurpose,purpose);
    }

    public void clicksubofficesubmenu() throws Exception {

        BaseLibrary.waitforelement(suboffice_submenu);
        BaseLibrary.jsclickelement(suboffice_submenu);
        BaseLibrary.waitforelement(addNewSubOffice);
    }

    public void clickAddNewOffice() throws Exception {
        BaseLibrary.clickelement(addNewSubOffice);
        BaseLibrary.waitforelement(subOfficeCode);
    }
    public void Verifysuccessfullymessage()throws Exception {
        BaseLibrary.waitforelement(editsuccessfullMessage);
        BaseLibrary.waitforelement(close);
        BaseLibrary.clickelement(close);
        Thread.sleep(2000);
    }

    public void cretesubOfficeWithallFields(String correspondant, String office, String subofficename, String subofficecode) throws Exception {
        enterCorrespondent(correspondant);
        enterOffice(office);
        enterSubofficename(subofficename);
        enterSubofficecode(subofficecode);
        enterPurpose(BaseLibrary.getdatabasedonsheet("SubOffice", 10, 1));
    }

    public void searchwithonefilter() throws Exception {
        Thread.sleep(2000);
        BaseLibrary.waitforelement(filtersubOfficeName);
        BaseLibrary.textclear(filtersubOfficeName);
        BaseLibrary.typetext(filtersubOfficeName,subofficeNAme);
        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }

    public void recordsonsuboffice() throws Exception {
        Thread.sleep(5000);
        BaseLibrary.waitforelement(tableFirstRow);
        Assert.assertEquals(subofficeNAme, subofficenamehyperlink.getText());
    }

    public void recordsonvalidsuboffice(String officeCODe) throws Exception {
        Thread.sleep(5000);
        BaseLibrary.waitforelement(tableFirstRow);
        Assert.assertEquals(officeCODe, subofficenamehyperlink.getText());
    }

    public void searchwithvaildonefilter(String subofficename) throws Exception {
        Thread.sleep(2000);
        BaseLibrary.waitforelement(filtersubOfficeName);
        BaseLibrary.textclear(filtersubOfficeName);
        BaseLibrary.typetext(filtersubOfficeName,subofficename);
        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }

    public void searchwithoneinvalidfilter() throws Exception {
        Thread.sleep(5000);
        BaseLibrary.waitforelement(filtersubOfficeName);
        BaseLibrary.typetext(filtersubOfficeName, BaseLibrary.randomnumbergenerator(7));
        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }

    public void searchwithmultiplefilter(String searchone,String searchtwo) throws Exception {
        Thread.sleep(5000);
        BaseLibrary.waitforelement(filtersubOfficeName);
        BaseLibrary.typetext(filtersubOfficeName, searchone);
        BaseLibrary.waitforelement(filtersubOfficeCode);
        BaseLibrary.typetext(filtersubOfficeCode, searchtwo);
        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }

    public void searchwithmultipleinvalidfilter() throws Exception {
        Thread.sleep(5000);
        BaseLibrary.waitforelement(filtersubOfficeName);
        BaseLibrary.typetext(filtersubOfficeName, BaseLibrary.randomnumbergenerator(7));
        BaseLibrary.waitforelement(filtersubOfficeCode);
        BaseLibrary.typetext(filtersubOfficeCode, BaseLibrary.randomnumbergenerator(7));
        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }

    public void searchwithmultiplevalidandinvalidfilter(String searchone) throws Exception {
        Thread.sleep(5000);
        BaseLibrary.waitforelement(filtersubOfficeName);
        BaseLibrary.typetext(filtersubOfficeName, searchone);
        BaseLibrary.waitforelement(filtersubOfficeCode);
        BaseLibrary.typetext(filtersubOfficeCode, BaseLibrary.randomnumbergenerator(7));
        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }

    public void subofficeuniversalsearch(String input,String subofficename) throws Exception {
        Thread.sleep(2000);
        BaseLibrary.waitforelement(tableFirstRow);
        BaseLibrary.waitforelement(universalsearch);
        if (input.equalsIgnoreCase("valid")) {
            BaseLibrary.typetext(universalsearch, subofficename);
            BaseLibrary.waitforelement(tableFirstRow);
        } else {
            BaseLibrary.typetext(universalsearch, BaseLibrary.randomstringgenerator(5));
        }
    }
    public void Update_office() throws Exception {
        BaseLibrary.waitforelement(subofficenamehyperlink);
        BaseLibrary.clickelement(subofficenamehyperlink);
        enterPurpose("updated purpose");
    }
}