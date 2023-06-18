package pageObjects;

import baseMethods.BaseLibrary;
import baseMethods.DataDrivenUtility;
import baseMethods.Threadmanager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class CostCenterScreen {

    static WebDriver driver;

    public CostCenterScreen() {
        this.driver = Threadmanager.getdriver();
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }

    @FindBy(xpath = "//a[text()='Cost Center']")
    private WebElement costCenter_submenu;

    @FindBy(xpath = "//button/span[text()='Add New Cost Center']")
    private WebElement addNewcostcenter;

    @FindBy(xpath = "(//label[text()='Correspondent*']//following::input)[1]")
    private WebElement correspondent;

    @FindBy(xpath = "(//label[text()='Office*']//following::input)[1]")
    private WebElement office;

    @FindBy(xpath = "(//label[text()='Sub Office*']//following::input)[1]")
    private WebElement subOffice;

    @FindBy(xpath = "(//label[text()='Cost Center Name*']//following::input)[1]")
    private WebElement costCenterName;

    @FindBy(xpath = "(//label[text()='Cost Center Code*']//following::input)[1]")
    private WebElement costCenterCode;

    @FindBy(xpath = "(//label[text()='Purpose*']//following::input)[1]")
    private WebElement purpose;

    @FindBy(xpath = "//tbody/tr[1]")
    private WebElement tableFirstRow;

    @FindBy(xpath = "//input[@id='outlined-basic']")
    private WebElement universalsearch;

    @FindBy(id = "filter_costCenterName")
    private WebElement filtercostCenterName;

    @FindBy(id = "filter_costCenterCode")
    private WebElement filtercostCenterCode;

    @FindBy(xpath = "//span[text()='Search']")
    private WebElement filterSearchButton;

    @FindBy(xpath = "//div[@class='filter-section']//i[@class='close-icon']")
    private WebElement filtercloseButton;

    @FindBy(xpath = "//button[@type='reset']")
    private WebElement filterReset;

    @FindBy(xpath = "//td[@id='row-0-cell-0']")
    private WebElement costcenternamehyperlink;


    public static String costcenterName;
    public static String costcenterCode;


    public void clickcostcentersubmenu() throws Exception {
        BaseLibrary.waitforelement(costCenter_submenu);
        BaseLibrary.jsclickelement(costCenter_submenu);
        BaseLibrary.waitforelement(addNewcostcenter);
    }

    public void clickAddNewcostcenter() throws Exception {
        BaseLibrary.clickelement(addNewcostcenter);
        BaseLibrary.waitforelement(correspondent);
    }

    public void createCostCenterWithallFields() throws Exception {
        enterCorrespondent(BaseLibrary.getdatabasedonsheet("CostCenter", 3, 1));
        enterOffice(BaseLibrary.getdatabasedonsheet("CostCenter", 7, 1));
        enterSubOffice(BaseLibrary.getdatabasedonsheet("CostCenter", 8, 1));
        enterCostCenterName(BaseLibrary.getdatabasedonsheet("CostCenter", 10, 1));
        enterCostCenterCode(BaseLibrary.getdatabasedonsheet("CostCenter", 11, 1));
        enterPurpose(BaseLibrary.getdatabasedonsheet("CostCenter", 12, 1));

    }

    public void createCostCenterWithmandatoryFields(String costcentername, String costcentercode) throws Exception {
        enterCorrespondent(BaseLibrary.getdatabasedonsheet("CostCenter", 3, 1));
        enterOffice(BaseLibrary.getdatabasedonsheet("CostCenter", 7, 1));
        enterSubOffice(BaseLibrary.getdatabasedonsheet("CostCenter", 8, 1));
        enterCostCenterName(costcentername);
        enterCostCenterCode(costcentercode);
        enterPurpose(BaseLibrary.getdatabasedonsheet("CostCenter", 12, 1));
    }

    public void createCostCenterglcoaWithmandatoryFields(String correspondant, String office,String suboffice,String costcentername, String costcentercode) throws Exception {
        enterCorrespondent(correspondant);
        enterOffice(office);
        enterSubOffice(suboffice);
        enterCostCenterName(costcentername);
        enterCostCenterCode(costcentercode);
        enterPurpose(BaseLibrary.getdatabasedonsheet("CostCenter", 12, 1));
    }

    public void enterCorrespondent(String Correspondent) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(correspondent, Correspondent,1);
    }

    public void enterOffice(String Office) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(office, Office,1);
    }

    public void enterSubOffice(String Suboffice) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(subOffice, Suboffice,1);
    }

    public void enterCostCenterName(String Costcentername) throws Exception {
        BaseLibrary.typetext(costCenterName,Costcentername);
        costcenterName=Costcentername;
    }

    public void enterCostCenterCode(String costcentercode) throws Exception {
        BaseLibrary.typetext(costCenterCode,costcentercode);
        costcenterCode=costcentercode;
    }

    public void enterPurpose(String Purpose) throws Exception {
        BaseLibrary.typetext(purpose, Purpose);
    }

    public void searchwithonefilter() throws Exception {
        Thread.sleep(2000);
        BaseLibrary.waitforelement(filtercostCenterName);
        BaseLibrary.textclear(filtercostCenterName);
        BaseLibrary.typetext(filtercostCenterName,costcenterName);
        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }

    public void Update_costcenter() throws Exception {
        BaseLibrary.waitforelement(costcenternamehyperlink);
        BaseLibrary.clickelement(costcenternamehyperlink);
        enterPurpose(" Updated");
    }

    public void recordsoncostcenter() throws Exception {
        Thread.sleep(5000);
        BaseLibrary.waitforelement(tableFirstRow);
        Assert.assertEquals(costcenterName, costcenternamehyperlink.getText());
    }

    public void searchwithvaildonefilter(String costCenterName) throws Exception {
        Thread.sleep(2000);
        BaseLibrary.waitforelement(filtercostCenterName);
        BaseLibrary.textclear(filtercostCenterName);
        BaseLibrary.typetext(filtercostCenterName,costCenterName);
        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }

    public void searchwithoneinvalidfilter() throws Exception {
        Thread.sleep(5000);
        BaseLibrary.waitforelement(filtercostCenterName);
        BaseLibrary.typetext(filtercostCenterName, BaseLibrary.randomnumbergenerator(7));
        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }

    public void searchwithmultiplefilter(String searchone,String searchtwo) throws Exception {
        Thread.sleep(5000);
        BaseLibrary.waitforelement(filtercostCenterName);
        BaseLibrary.typetext(filtercostCenterName, searchone);
        BaseLibrary.waitforelement(filtercostCenterCode);
        BaseLibrary.typetext(filtercostCenterCode, searchtwo);
        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }

    public void searchwithmultipleinvalidfilter() throws Exception {
        Thread.sleep(5000);
        BaseLibrary.waitforelement(filtercostCenterName);
        BaseLibrary.typetext(filtercostCenterName, BaseLibrary.randomnumbergenerator(7));
        BaseLibrary.waitforelement(filtercostCenterCode);
        BaseLibrary.typetext(filtercostCenterCode, BaseLibrary.randomnumbergenerator(7));
        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }

    public void searchwithmultiplevalidandinvalidfilter(String searchone) throws Exception {
        Thread.sleep(5000);
        BaseLibrary.waitforelement(filtercostCenterName);
        BaseLibrary.typetext(filtercostCenterName, searchone);
        BaseLibrary.waitforelement(filtercostCenterCode);
        BaseLibrary.typetext(filtercostCenterCode, BaseLibrary.randomnumbergenerator(7));
        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }

    public void costcenteruniversalsearch(String input,String subofficename) throws Exception {
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

    public void recordsonvalidcostcenter(String officeCODe) throws Exception {
        Thread.sleep(5000);
        BaseLibrary.waitforelement(tableFirstRow);
        Assert.assertEquals(officeCODe, costcenternamehyperlink.getText());
    }

    public void createCostCenterforotherscreen(String correspendent, String office, String suboffice, String ccname, String cccode) throws Exception {
        enterCorrespondent(correspendent);
        enterOffice(office);
        enterSubOffice(suboffice);
        enterCostCenterName(ccname);
        enterCostCenterCode(cccode);
        enterPurpose(BaseLibrary.getdatabasedonsheet("CostCenter", 12, 1));
    }


}