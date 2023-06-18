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

public class EdiSecurityMasterScreen {

    static WebDriver driver;

    @FindBy(xpath = "(//img[@class='normal'][@alt='normal img'])[3]")
    private WebElement screen_SecurityMasterdata;

    @FindBy(xpath = "//td[@id='longmenu-div-0']//span[@class='MuiIconButton-label']//*[name()='svg']")
    private WebElement screen_editsecuritymaster;

    @FindBy(xpath = "//*[@class='filter-icon']")
    private WebElement screen_OneFilterValid;

    @FindBy(xpath = "//input[@id='outlined-basic']")
    private WebElement  screen_Searchbutton;

    @FindBy(xpath = "//div[@class='view-export-option']//span[@class='MuiIconButton-label']//*[name()='svg']")
    private WebElement  screen_dotbutton;

    @FindBy(xpath = "//td[@id='longmenu-div-0']//span[@class='MuiIconButton-label']//*[name()='svg']")
    private WebElement  screen_firsteditoption;

    @FindBy(xpath = "//li[@tabindex='0'][text()='Export']")
    private WebElement  screen_exportbutton;

    @FindBy(xpath = "//input[@id='filter_symbol']")
    private WebElement screen_OneFilterFeiled;

    @FindBy(xpath = "//a[text()='EDI Security Master']")
    private WebElement screen_EDIsecuritymaster;

    @FindBy(xpath = "//*[text()='Add New Security']")
    private WebElement screen_addsecuritymaster;

    @FindBy(xpath = "(//li[@tabindex='-1'])[1]")
    private WebElement  screen_secondeditoption;


    @FindBy(xpath = "//*[text()='Save']")
    private WebElement securityMasterSave;

    @FindBy(xpath = "//*[text()='Security Master has been created successfully!']")
    private WebElement CreatedMessage;

    @FindBy(xpath = "//*[@type='text'][@maxlength='50']")
    private WebElement symbol;

    @FindBy(xpath = "//*[@type='text'][@maxlength='9']")
    private WebElement securitynumber;

    @FindBy(xpath = "(//*[text()='Sec Type*']//following::input)[1]")
    private WebElement sectype;

    @FindBy(xpath = "//*[@id=\"scrollable-auto-tabpanel-0\"]/div/p/div/div/div/div/div[1]/div[2]/div/div[5]/div/div/div/input")
    private WebElement secid;

    @FindBy(xpath = "//*[@id=\"scrollable-auto-tabpanel-0\"]/div/p/div/div/div/div/div[1]/div[2]/div/div[5]/div/div/div/input")
    private WebElement  upsecid;

    @FindBy(xpath = "//*[@id=\"scrollable-auto-tabpanel-0\"]/div/p/div/div/div/div/div[1]/div[2]/div/div[6]/div/div/div/input")
    private WebElement isserid;

    @FindBy(xpath = "//*[@id=\"scrollable-auto-tabpanel-0\"]/div/p/div/div/div/div/div[1]/div[2]/div/div[6]/div/div/div/input")
    private WebElement  UPisserid;
    @FindBy(xpath = "//div[@class='view-export-option']//div/button[@aria-controls='long-menu']")
    private WebElement exportKebabButton;

    @FindBy(xpath = "//*[contains(text(),'Export')]")
    private WebElement export;

    @FindBy(xpath = "//tbody/tr[1]")
    private WebElement sorttableFirstRow;

    @FindBy(xpath = "(//*[text()='Sec Sub Type*']//following::input)[1]")
    private WebElement secsubtype;

    @FindBy(xpath = "(//*[text()='Exchange*']//following::input)[1]")
    private WebElement exchange;

    @FindBy(xpath = "(//*[text()='Global Status*']//following::input)[1]")
    private WebElement status;

    @FindBy(xpath = "(//*[@type='text'])[7]")
    private WebElement country;

    @FindBy(xpath = "//div[@id='add_reg_fee_charge']//span[@class='MuiToggleButton-label'][normalize-space()='Yes']")
    private WebElement RegFeeCharge;

    @FindBy(xpath = "//div[@id='add_penny_pilot']//span[@class='MuiToggleButton-label'][normalize-space()='Yes']")
    private WebElement PennyPilot;

    @FindBy(xpath = "//div[@id='Multi Currency Flag']//span[@class='MuiToggleButton-label'][normalize-space()='Yes']")
    private WebElement MultiCurrencyFlag;

    @FindBy(xpath = "//button[@value='Yes']")
    private WebElement marginable;

    @FindBy(xpath = "(//*[@tabindex='0'][@value='No'])[1]")
    private WebElement HardtoBorrow;

    @FindBy(xpath = "//div[@id='add_dtc_flag']//span[@class='MuiToggleButton-label'][normalize-space()='Yes']")
    private WebElement DtcFlag;

    @FindBy(xpath = "//span[normalize-space()='Yes']")
    private WebElement WhenIssued;

    @FindBy(xpath = "//input[@id='add_Price']")
    private WebElement price;

    @FindBy(xpath = "//input[@id='add_Price']")
    private WebElement UPprice;

    @FindBy(xpath = "(//*[text()='Currency*']//following::input)[1]")
    private WebElement currency;

    @FindBy(xpath = "//*[@id='filter_symbol']")
    private WebElement filtersymbolonevalid;

    @FindBy(xpath = "//span[normalize-space()='Search']")
    private WebElement search;

    @FindBy(xpath = "//input[@id='filter_symbol']")
    private WebElement filterSymbolbutton;

    @FindBy(xpath = "//span[@class='MuiTab-wrapper'][normalize-space()='Security Master']")
    private WebElement ClickOnSecurityMasterPage2;

    @FindBy(xpath = "//span[normalize-space()='Security Margin']")
    private WebElement ClickOnSecurityMarginPage3;

    @FindBy(xpath = "//span[normalize-space()='Security Settlement']")
    private WebElement ClickOnSecuritySettlementPage5;

    @FindBy(xpath = "//span[normalize-space()='Security Classification']")
    private WebElement ClickOnSecurityClassificationPage6;

    @FindBy(xpath = "//span[normalize-space()='ADR Profile']")
    private WebElement ClickADRProfilesPage7;

    @FindBy(xpath = "//span[normalize-space()='ETF Profile']")
    private WebElement ClickETFProfilesPage8;

    @FindBy(xpath = "//span[normalize-space()='Security Prices']")
    private WebElement ClickOnSecurityPricePage4;


    @FindBy(xpath = "//span[normalize-space()='Save']")
    private WebElement ClickOnSave;

    @FindBy(xpath = "//input[@id='filter_symbol']")
    private WebElement  filter_symbol;

    @FindBy(xpath = "//input[@id='filter_symNo']")
    private WebElement  filter_symno;

    @FindBy(xpath = "//input[@id='filter_symNo']")
    private WebElement  filter_sendsymNo;

    @FindBy(xpath = "//input[@id='filter_symbol']")
    private WebElement    mulifilter_invalidsymbol;

    @FindBy(xpath = "//input[@id='filter_symbol']")
    private WebElement   filter_mulifilter_invalidsymbol;

    @FindBy(xpath = "//input[@id='filter_cusip']")
    private WebElement    filter_cusip;

    @FindBy(xpath = "//input[@id='filter_isin']")
    private WebElement   filter_isin;

    @FindBy(xpath = "//input[@id='filter_isin']")
    private WebElement    multifilter_invalidisin;

    @FindBy(xpath = "//input[@id='filter_isin']")
    private WebElement    filter_multifilter_invalidisin;

    @FindBy(xpath = "//input[@id='filter_isin']")
    private WebElement  filter_sendIsinValue;

    @FindBy(xpath = "//input[@id='filter_cusip']")
    private WebElement    filter_sendCusipValue;

    @FindBy(xpath = "//input[@id='filter_symbol']")
    private WebElement  filter_sendSymbolValue;

    @FindBy(xpath = "//span[normalize-space()='Search']")
    private WebElement filterSearchButton;

    @FindBy(xpath = "//div[contains(@class,'filter-section')]//img[contains(@alt,'close')]")
    private WebElement filtercloseButton;

    @FindBy(xpath = "//input[@id='outlined-basic']")
    private WebElement  screen_validsearch;

    @FindBy(xpath = "//img[@alt='search']")
    private WebElement  hitSearchButton;

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

    @FindBy(xpath = "//input[@id='outlined-basic']")
    private WebElement   search_sendvalidsearch;



    @FindBy(xpath = "(//*[text()='Security Type']//following::input)[1]")
    private WebElement filter_securityTypeValue;

    @FindBy(xpath = "//*[@id=\"root\"]")
    private WebElement  checkTheTable;

    @FindBy(xpath = "//div[normalize-space()='No data found']")
    private WebElement  No_data_found;

    @FindBy(xpath = "//div[@class='MuiAlert-message']")
    private WebElement validateMessage;

    @FindBy(xpath = "//button[@title='Close']")
    private WebElement close;

    @FindBy(xpath = "//*[@id='row-0-cell-0']")
    private WebElement  verifytalbe;

    @FindBy(xpath = "//td[@id='row-0-cell-5']")
    private WebElement  securitytype_Value;

    @FindBy(xpath = "//td[@id='row-0-cell-5']")
    private WebElement securitytypeverifytalbe;


    @FindBy(xpath = "//td[@id='row-0-cell-1']")
    private WebElement   symNo_searchValue;


    @FindBy(xpath = "//td[@id='row-0-cell-0']")
    private WebElement  multi_symbol_verifytalbe;

    @FindBy(xpath = "//td[@id='row-0-cell-4']")
    private WebElement   multi_isin_verifytalbe;

    @FindBy(xpath = "//td[@id='row-0-cell-1']")
    private WebElement   samesecuritynumberverifytalbe;

    @FindBy(xpath = "//*[@class='jss505']")
    private WebElement   securitynumbercheckTheTable;

    @FindBy(xpath = "//div[normalize-space()='No data found']")
    private WebElement nodatafoundverifytalbe;


    @FindBy(xpath = "//*[@class='MuiInputBase-input MuiOutlinedInput-input'][@maxlength='9']")
    private WebElement cusip;

    @FindBy(xpath = "//*[@class='MuiInputBase-input MuiOutlinedInput-input'][@maxlength='9']")
    private WebElement UPcusip;

    @FindBy(xpath = "//*[@type='text'][@maxlength='7']")
    private WebElement sedol;

    @FindBy(xpath = "//*[@type='text'][@maxlength='7']")
    private WebElement  UPsedol;

    @FindBy(xpath = "(//*[text()='ISIN']//following::input)[1]")
    private WebElement isin;

    @FindBy(xpath = "(//*[text()='ISIN']//following::input)[1]")
    private WebElement UPisin;

    @FindBy(xpath = "//textarea[@rows='1']")
    private WebElement description;

    @FindBy(xpath = "//textarea[@rows='1']")
    private WebElement UPdescription;

    @FindBy(xpath = "(//*[text()='Outstanding Shares Date']//following::input)[1]")
    private WebElement outstandingsharesdate;

    @FindBy(xpath = "(//*[text()='Issuer']//following::input)[1]")
    private WebElement issuer;

    @FindBy(xpath = "(//*[text()='Outstanding Shares']//following::input)[1]")
    private WebElement outstandingshares;

    @FindBy(xpath = "(//*[text()='Sedol Mic']//following::input)[1]")
    private WebElement mic;

    @FindBy(xpath = "(//*[text()='Security Description']//following::input)[1]")
    private WebElement securitydescription;

    @FindBy(xpath = "(//*[text()='Sedol Defunct']//following::input)[1]")
    private WebElement sedoldefunct;

    @FindBy(xpath = "(//*[text()='Sedol Mic']//following::input)[1]")
    private WebElement sedolmic;

    @FindBy(xpath = "(//*[text()='List Unique Id*']//following::input)[1]")
    private WebElement listuniqueid;

    @FindBy(xpath = "(//*[text()='List Action Code']//following::input)[1]")
    private WebElement listactioncode;

    @FindBy(xpath = "(//*[text()='List Change Date']//following::input)[1]")
    private WebElement listchangedate;

    @FindBy(xpath = "(//*[text()='List Change Date']//following::input)[1]")
    private WebElement listchangetime;


    @FindBy(xpath = "(//*[text()='List Create Date']//following::input)[1]")
    private WebElement listcreatedate;

    @FindBy(xpath = "(//*[text()='List Source Flag']//following::input)[1]")
    private WebElement listsourceflag;

    @FindBy(xpath = "(//*[@maxlength='8'])[3]")
    private WebElement scexhid;

    @FindBy(xpath = "(//*[@maxlength='8'])[3]")
    private WebElement  UPscexhid;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/p[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[15]/div[1]/div[1]/div[1]/div[1]/input[1]")
    private WebElement exchangecode;

    @FindBy(xpath = "(//*[text()='In active date']//following::input)[1]")
    private WebElement inactivedate;

    @FindBy(xpath = "(//*[text()='Active date']//following::input)[1]")
    private WebElement activedate;

    @FindBy(xpath = "//*[@maxlength='25']")
    private WebElement unlistedclassessos;

    @FindBy(xpath = "//*[@maxlength='25']")
    private WebElement  UPunlistedclassessos;

    @FindBy(xpath = "(//*[text()='Un Listed Classes Sos Date']//following::input)[1]")
    private WebElement unlistedclassessosdate;

    @FindBy(xpath = "(//*[text()='Un Listed Classes Sos Date']//following::input)[1]")
    private WebElement  UPsegmentmicname;

    @FindBy(xpath = "//input[@maxlength='50']")
    private WebElement segmentmicname;

    @FindBy(xpath = "(//*[text()='Segment Mic']//following::input)[1]")
    private WebElement segmentmic;

    @FindBy(xpath = "(//*[@maxlength='12'])[2]")
    private WebElement figi;

    @FindBy(xpath = "(//*[@maxlength='12'])[2]")
    private WebElement UPfigi;

    @FindBy(xpath = "(//*[@maxlength='40'])[1]")
    private WebElement figiticker;

    @FindBy(xpath = "(//*[@maxlength='40'])[1]")
    private WebElement  UPfigiticker;

    @FindBy(xpath = "(//*[text()='Bloomberg Composite Id']//following::input)[1]")
    private WebElement bloombergcompositeid;

    @FindBy(xpath = "(//*[text()='Bloomberg Composite Id']//following::input)[1]")
    private WebElement UPbloombergcompositeid;

    @FindBy(xpath = "(//*[text()='Bloomberg Composite Ticker']//following::input)[1]")
    private WebElement bloombergcompositeticker;

    @FindBy(xpath = "(//*[text()='Bloomberg Composite Ticker']//following::input)[1]")
    private WebElement UPbloombergcompositeticker;

    @FindBy(xpath = "(//*[text()='Lot Size']//following::input)[1]")
    private WebElement lotsize;

    @FindBy(xpath = "(//*[text()='Lot Size']//following::input)[1]")
    private WebElement  UPlotsize;

    @FindBy(xpath = "(//*[text()='List Status Code']//following::input)[1]")
    private WebElement liststatuscode;

    @FindBy(xpath = "(//input[@type='text'])[32]")
    private WebElement voting;

    @FindBy(xpath = "//input[@maxlength='20']")
    private WebElement votepersec;

    @FindBy(xpath = "//input[@maxlength='20']")
    private WebElement  UPvotepersec;

    @FindBy(xpath = "(//*[text()='Registered Country']//following::input)[1]")
    private WebElement registercountry;

    @FindBy(xpath = "(//*[text()='Trading Currency']//following::input)[1]")
    private WebElement tradingcurrency;

    @FindBy(xpath = "(//*[@type='text'])[36]")
    private WebElement  listingcountry;

    @FindBy(xpath = "//input[@maxlength='15']")
    private WebElement requiremntratesource;

    @FindBy(xpath = "//input[@maxlength='15']")
    private WebElement  UPrequiremntratesource;

    @FindBy(xpath = "(//*[text()='MfOcFlag']//following::input)[1]")
    private WebElement mfocflag;

    @FindBy(xpath = "(//*[text()='MfOcFlag']//following::input)[1]")
    private WebElement UPmfocflag;

    @FindBy(xpath = "(//*[text()='IDC Asset']//following::input)[1]")
    private WebElement idcasset;

    @FindBy(xpath = "(//*[text()='IDC Asset']//following::input)[1]")
    private WebElement  UPidcasset;

    @FindBy(xpath = "(//*[text()='Special rate overide']//following::input)[1]")
    private WebElement specialrateoveride;

    @FindBy(xpath = "(//*[text()='Special rate overide']//following::input)[1]")
    private WebElement  UPspecialrateoveride;

    @FindBy(xpath = "//*[@id='add_fed_long_rate']")
    private WebElement fedlongrate;

    @FindBy(xpath = "//*[@id='add_fed_short_rate']")
    private WebElement fedshortrate;

    @FindBy(xpath = "//*[@id='add_exchange_long_rate']")
    private WebElement exchangelongrate;

    @FindBy(xpath = "//*[@id='add_exchange_short_rate']")
    private WebElement exchangeshortrate;

    @FindBy(xpath = "//*[@id='add_house_long_rate']")
    private WebElement houselongrate;

    @FindBy(xpath = "//input[@maxlength='50']")
    private WebElement  Symbol1;

    @FindBy(xpath = "//input[@maxlength='9']")
    private WebElement  SecurityMaster1;

    @FindBy(xpath = "(//input[@maxlength='8'])[1]")
    private WebElement  SecId1;

    @FindBy(xpath = "(//input[@maxlength='8'])[2]")
    private WebElement   IsserId1;

    @FindBy(xpath = "//input[@id='add_Price']")
    private WebElement   Price1;

    @FindBy(xpath = "//*[@id='add_house_short_rate']")
    private WebElement houseshortrate;

    @FindBy(xpath = "//*[@id='add_PM_house_long_rate']")
    private WebElement pmhouselongrate;

    @FindBy(xpath = "//*[@id='add_PM_house_short_rate']")
    private WebElement pmhouseshortrate;

    @FindBy(xpath = "//*[@id='add_PM_hedge_long_rate']")
    private WebElement pmhedgelongrate;

    @FindBy(xpath = "//*[@id='add_PM_hedge_short_rate']")
    private WebElement pmhedgeshortrate;

    @FindBy(xpath = "//*[@id='add_PM_exchn_long_rate']")
    private WebElement pmexchnlongrate;

    @FindBy(xpath = "//*[@id='add_PM_exchn_short_rate']")
    private WebElement pmexchnshortrate;

    @FindBy(xpath = "(//*[text()='Sweep Destination']//following::input)[1]")
    private WebElement sweepdestination;

    @FindBy(xpath = "//*[@maxlength='15']")
    private WebElement sweepcode;

    @FindBy(xpath = "(//*[text()='Currency']//following::input)[1]")
    private WebElement securitysettlementcurrency;

    @FindBy(xpath = "//*[@maxlength='8']")
    private WebElement parvalue;

    @FindBy(xpath = "//*[@id='add_sic_id']")
    private WebElement siccd;

    @FindBy(xpath = "//*[@id='add_cik_id']")
    private WebElement cik;

    @FindBy(xpath = "//*[@id='add_gics_id']")
    private WebElement gics;

    @FindBy(xpath = "//*[@id='add_lei_id']")
    private WebElement lei;

    @FindBy(xpath = "//*[@id='add_naics_id']")
    private WebElement naics;

    @FindBy(xpath = "(//*[text()='Indus ID']//following::input)[1]")
    private WebElement indusid;

    @FindBy(xpath = "//*[@id='Figi Global Share Class Id']")
    private WebElement figiglobalshareclassid;

    @FindBy(xpath = "//*[@id='cfi_id']")
    private WebElement cfi;

    @FindBy(xpath = "//*[@id='add_cic_id']")
    private WebElement cic;

    @FindBy(xpath = "//*[@id='add_fisn_id']")
    private WebElement fisn;

    @FindBy(xpath = "//*[@maxlength='12']")
    private WebElement undsedol;

    @FindBy(xpath = "(//*[@aria-invalid='false'][@type='text'])[2]")
    private WebElement undsymbol;

    @FindBy(xpath = "(//*[text()='ADR Qty']//following::input)[1]")
    private WebElement adrqty;

    @FindBy(xpath = "(//*[text()='ORD Qty']//following::input)[1]")
    private WebElement ordqty;

    @FindBy(xpath = "(//*[text()='Ratio']//following::input)[1]")
    private WebElement ratio;

    @FindBy(xpath = "(//*[text()='Index/Benchmark']//following::input)[1]")
    private WebElement benchmark;

    @FindBy(xpath = "(//*[text()='Security Type']//following::input)[1]")
    private WebElement ffilterSecurityType;

    @FindBy(xpath = "//input[@class='MuiInputBase-input MuiOutlinedInput-input']")
    private WebElement leveragefactor;

    public static String symbolValue;
    public static String  isinValue;


    public EdiSecurityMasterScreen() {
        this.driver = Threadmanager.getdriver();
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    public void clicksecuritymasterdata() throws Exception {
        BaseLibrary.actionMoveAndClick(screen_SecurityMasterdata);
    }


    public void Chooseedisecuritymaster() throws Exception {
        BaseLibrary.waitforelement(screen_EDIsecuritymaster);
        BaseLibrary.clickelement(screen_EDIsecuritymaster);
    }

    public void Addedisecuritymaster() throws Exception {
        BaseLibrary.waitforelement(screen_addsecuritymaster);
        BaseLibrary.clickelement(screen_addsecuritymaster);
    }

    public void updateallsecuritymaster() throws Exception {
        BaseLibrary.waitforelement(screen_addsecuritymaster);
        BaseLibrary.clickelement(screen_addsecuritymaster);
    }

    public void Addupdatesecuritymaster() throws Exception {
        BaseLibrary.waitforelement(screen_addsecuritymaster);
        BaseLibrary.clickelement(screen_addsecuritymaster);
    }

    public void secondeditoption() throws Exception {
        BaseLibrary.waitforelement(screen_secondeditoption);
        BaseLibrary.clickelement(screen_secondeditoption);
    }

    public void Threedotbutton() throws Exception {
        BaseLibrary.actionMoveAndClick(screen_editsecuritymaster);

    }
    public void Filterbutton() throws Exception {
        BaseLibrary.actionMoveAndClick(screen_OneFilterValid);
    }

    public void Searchbutton() throws Exception {
        BaseLibrary.actionMoveAndClick(screen_Searchbutton);
    }

    public void threedotbutton() throws Exception {
        BaseLibrary.actionMoveAndClick(screen_dotbutton);
    }

    public void firsteditoption() throws Exception {
        BaseLibrary.actionMoveAndClick(screen_firsteditoption);
    }

    public void exportbutton() throws Exception {
        BaseLibrary.actionMoveAndClick(screen_exportbutton);
    }

    public void FilterFiled() throws Exception {
        BaseLibrary.actionMoveAndClick(screen_OneFilterFeiled);
    }

    public void entersymbol(String Symbol) throws Exception {
        BaseLibrary.typetext(symbol, Symbol);
    }

    public void entersecuritynumber(String SecurityNumber) throws Exception {
        BaseLibrary.typetext(securitynumber, SecurityNumber);
    }

    public void entersectype(String SecType) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(sectype, SecType, 1);
    }
    public void entersecid(String SecId) throws Exception {
        BaseLibrary.typetext(secid, SecId);
    }

    public void updateentersecid(String secid) throws Exception {
        BaseLibrary.textclear(upsecid);
        BaseLibrary.typetext(upsecid, BaseLibrary.randomnumbergenerator(7));
    }

    public void enterisserid(String IsserId) throws Exception {
        BaseLibrary.typetext(isserid, IsserId);
    }

    public void updateisserid(String isserid) throws Exception {
        BaseLibrary.textclear(UPisserid);
        BaseLibrary.typetext(UPisserid, BaseLibrary.randomnumbergenerator(7));
    }


    public void entersecsubtype(String SecSubType) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(secsubtype, SecSubType, 1);
    }

    public void enterexchange(String Exchange) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(exchange, Exchange, 1);
    }

    public void enterstatus(String Status) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(status, Status, 1);
    }

    public void entercountry(String Country) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(country, Country, 1);
    }

    public void entermarginable(String Marginable) throws Exception {
        BaseLibrary.typetext(marginable, Marginable);
    }

    public void enterprice(String Price) throws Exception {
        BaseLibrary.typetext(price, Price);
    }

    public void entercurrency(String Currency) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(currency, Currency, 1);
    }
    public void filtersymbol(String Symbol) throws Exception {
        BaseLibrary.typetext(filtersymbolonevalid,Symbol);
    }
    public void clicksavebutton() throws Exception {
        BaseLibrary.waitforelement(securityMasterSave);
        BaseLibrary.clickelement(securityMasterSave);
    }

    public void entercusip(String CUSIP) throws Exception {
        BaseLibrary.typetext(cusip, CUSIP);
    }

    public void updatcusip(String cusip) throws Exception {
        BaseLibrary.textclear(UPcusip);
        BaseLibrary.typetext(UPcusip, BaseLibrary.randomstringgenerator(7));
    }

    public void entersedol(String SEDOL) throws Exception {
        BaseLibrary.typetext(sedol, SEDOL);
    }

    public void updatesedol(String sedol) throws Exception {
        BaseLibrary.textclear(UPsedol);
        BaseLibrary.typetext(UPsedol, BaseLibrary.randomstringgenerator(7));
    }

    public void enterisin(String ISIN) throws Exception {
        BaseLibrary.typetext(isin, ISIN);
    }

    public void updateisin(String isin) throws Exception {
        BaseLibrary.textclear(UPisin);
        BaseLibrary.typetext(UPisin, BaseLibrary.randomstringgenerator(7));
    }

    public void enterdescription(String Description) throws Exception {
        BaseLibrary.typetext(description, Description);
    }

    public void updatedescription(String description) throws Exception {
        BaseLibrary.textclear(UPdescription);
        BaseLibrary.typetext(UPdescription, BaseLibrary.randomstringgenerator(7));
    }

    public void updatedoutstandingshares(String description) throws Exception {
        BaseLibrary.textclear(UPdescription);
        BaseLibrary.typetext(UPdescription, BaseLibrary.randomstringgenerator(7));
    }

    public void enteroutstandingsharesdate(String OutstandingSharesDate) throws Exception {
        BaseLibrary.typetext(outstandingsharesdate, OutstandingSharesDate);
    }

    public void enterissuer(String Issuer) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(issuer, Issuer, 1);
    }

    public void enteroutstandingshares(String OutstandingShares) throws Exception {
        BaseLibrary.typetext(outstandingshares, OutstandingShares);
    }

    public void entermic(String MIC) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(mic, MIC, 1);
    }

    public void entersecuritydescription(String SecurityDescription) throws Exception {
        BaseLibrary.typetext(securitydescription, SecurityDescription);
    }

    public void entersedoldefunct(String SedolDefunct) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(sedoldefunct, SedolDefunct, 1);
    }

    public void entersedolmic(String SedolMic) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(sedolmic, SedolMic, 1);
    }

    public void enterlistuniqueid(String ListUniqueId) throws Exception {
        BaseLibrary.typetext(listuniqueid, ListUniqueId);
    }

    public void enterlistactioncode(String ListActionCode) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(listactioncode, ListActionCode,1);
    }

    public void enterlistchangedate(String ListChangeDate) throws Exception {
        BaseLibrary.typetext(listchangedate, ListChangeDate);
    }

    public void enterlistchangedatetime(String ListChangeTime) throws Exception {
        BaseLibrary.typetext(listchangetime, ListChangeTime);
    }

    public void enterlistcreatedate(String ListCreateDate) throws Exception {
        BaseLibrary.typetext(listcreatedate, ListCreateDate);
    }

    public void enterlistsourceflag(String ListSourceFlag) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(listsourceflag, ListSourceFlag, 1);
    }

    public void enterscexhid(String scexhId) throws Exception {
        BaseLibrary.typetext(scexhid, scexhId);
    }


    public void updatescexhid(String scexhid) throws Exception {
        BaseLibrary.textclear(UPscexhid);
        BaseLibrary.typetext(UPscexhid, BaseLibrary.randomnumbergenerator(7));
    }

    public void enterexchangecode(String ExchangeCode) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(exchangecode, ExchangeCode, 1);
    }

    public void enterinactivedate(String Inactivedate) throws Exception {
        BaseLibrary.typetext(inactivedate, Inactivedate);
    }

    public void enteractivedate(String Activedate) throws Exception {
        BaseLibrary.typetext(activedate, Activedate);
    }

    public void enterunlistedclassessos(String UnListedClassesSos) throws Exception {
        BaseLibrary.typetext(unlistedclassessos, UnListedClassesSos);
    }

    public void updateunlistedclassessos(String unlistedclassessos) throws Exception {
        BaseLibrary.textclear(UPunlistedclassessos);
        BaseLibrary.typetext(UPunlistedclassessos, BaseLibrary.randomstringgenerator(7));
    }

    public void enterunlistedclassessosdate(String UnListedClassesSosDate) throws Exception {
        BaseLibrary.typetext(unlistedclassessosdate, UnListedClassesSosDate);
    }

    public void updatesegmentmicname(String segmentmicname) throws Exception {
        BaseLibrary.textclear(UPsegmentmicname);
        BaseLibrary.typetext(UPsegmentmicname, BaseLibrary.randomstringgenerator(7));
    }

    public void entersegmentmicname(String SegmentMicName) throws Exception {
        BaseLibrary.typetext(segmentmicname, SegmentMicName);
    }

    public void entersegmentmic(String SegmentMic) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(segmentmic, SegmentMic, 1);
    }

    public void enterFigi(String Figi) throws Exception {
        BaseLibrary.typetext(figi, Figi);
    }

    public void updateFigi(String figi) throws Exception {
        BaseLibrary.textclear(UPfigi);
        BaseLibrary.typetext(UPfigi, BaseLibrary.randomstringgenerator(7));
    }

    public void enterfigiticker(String FigiTicker) throws Exception {
        BaseLibrary.typetext(figiticker, FigiTicker);
    }

    public void updatefigiticker(String figiticker) throws Exception {
        BaseLibrary.textclear(UPfigiticker);
        BaseLibrary.typetext(UPfigiticker, BaseLibrary.randomnumbergenerator(7));
    }

    public void enterbloombergcompositeid(String BloombergCompositeId) throws Exception {
        BaseLibrary.typetext(bloombergcompositeid, BloombergCompositeId);
    }


    public void updatebloombergcompositeid(String bloombergcompositeid) throws Exception {
        BaseLibrary.textclear(UPbloombergcompositeid);
        BaseLibrary.typetext(UPbloombergcompositeid, BaseLibrary.randomnumbergenerator(7));

    }
    public void enterbloombergcompositeticker(String BloombergCompositeTicker) throws Exception {
        BaseLibrary.typetext(bloombergcompositeticker, BloombergCompositeTicker);
    }

    public void updatebloombergcompositeticker(String bloombergcompositeticker) throws Exception {
        BaseLibrary.textclear(UPbloombergcompositeticker);
        BaseLibrary.typetext(UPbloombergcompositeticker, BaseLibrary.randomnumbergenerator(7));
    }

    public void enterlotsize(String LotSize) throws Exception {
        BaseLibrary.typetext(lotsize, LotSize);
    }

    public void updatelotsize(String lotsize) throws Exception {
        BaseLibrary.textclear(UPlotsize);
        BaseLibrary.typetext(UPlotsize, BaseLibrary.randomnumbergenerator(4));
    }
    public void enterliststatuscode(String ListStatusCode) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(liststatuscode, ListStatusCode, 1);
    }

    public void entervoting(String Voting) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(voting, Voting, 1);
    }

    public void entervotepersec(String VotePerSec) throws Exception {
        BaseLibrary.typetext(votepersec, VotePerSec);
    }
    public void updatevotepersec(String votepersec) throws Exception {
        BaseLibrary.textclear(UPvotepersec);
        BaseLibrary.typetext(UPvotepersec, BaseLibrary.randomnumbergenerator(7));
    }
    public void enterregistercountry(String RegisterCountry) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(registercountry, RegisterCountry, 1);
    }

    public void entertradingcurrency(String TradingCurrency) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(tradingcurrency, TradingCurrency, 1);
    }

    public void enterListingcountry(String ListingCountry) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(listingcountry, ListingCountry, 1);
    }

    public void enterrequiremntratesource(String RequiremntRateSource) throws Exception {
        BaseLibrary.typetext(requiremntratesource, RequiremntRateSource);
    }

    public void updaterequiremntratesource(String requiremntratesource) throws Exception {
        BaseLibrary.textclear(UPrequiremntratesource);
        BaseLibrary.typetext(UPrequiremntratesource, BaseLibrary.randomnumbergenerator(7));
    }

    public void entermfocflag(String MfOcFlag) throws Exception {
        BaseLibrary.typetext(mfocflag, MfOcFlag);
    }

    public void updatemfocflag(String mfocflag) throws Exception {
        BaseLibrary.textclear(UPmfocflag);
        BaseLibrary.typetext(UPmfocflag, BaseLibrary.randomnumbergenerator(1));
    }

    public void enteridcasset(String IDCAsset) throws Exception {
        BaseLibrary.typetext(idcasset, IDCAsset);
    }
    public void updateidcasset(String mfocflag) throws Exception {
        BaseLibrary.textclear(UPidcasset);
        BaseLibrary.typetext(UPidcasset, BaseLibrary.randomnumbergenerator(1));
    }
    public void enterspecialrateoveride(String Specialrateoveride) throws Exception {
        BaseLibrary.typetext(specialrateoveride, Specialrateoveride);
    }

    public void updatespecialrateoveride(String specialrateoveride) throws Exception {
        BaseLibrary.textclear(UPspecialrateoveride);
        BaseLibrary.typetext(UPspecialrateoveride, BaseLibrary.randomnumbergenerator(4));
    }

    public void enterfedlongrate(String FedLongRate) throws Exception {
        BaseLibrary.typetext(fedlongrate, FedLongRate);
    }

    public void enterfedshortrate(String FedShortRate) throws Exception {
        BaseLibrary.typetext(fedshortrate, FedShortRate);
    }

    public void enterexchangelongrate(String ExchangeLongRate) throws Exception {
        BaseLibrary.typetext(exchangelongrate, ExchangeLongRate);
    }

    public void enterexchangeshortrate(String ExchangeShortRate) throws Exception {
        BaseLibrary.typetext(exchangeshortrate, ExchangeShortRate);
    }

    public void enterhouselongrate(String HouseLongRate) throws Exception {
        BaseLibrary.typetext(houselongrate, HouseLongRate);
    }

    public void enterupdatesymbol(String symbol1) throws Exception {
        BaseLibrary.textclear(Symbol1);
        BaseLibrary.typetext(Symbol1, BaseLibrary.randomnumbergenerator(7));
    }

    public void enterupdatesecuritymaster(String securitymaster1) throws Exception {
        BaseLibrary.textclear(SecurityMaster1);
        BaseLibrary.typetext(SecurityMaster1, BaseLibrary.randomnumbergenerator(7));
    }

    public void enterupdatesecid(String secid1) throws Exception {
        BaseLibrary.textclear(SecId1);
        BaseLibrary.typetext(SecId1, BaseLibrary.randomnumbergenerator(7));
    }

    public void enterupdateisserid(String isserid1) throws Exception {
        BaseLibrary.textclear(IsserId1);
        BaseLibrary.typetext(IsserId1, BaseLibrary.randomnumbergenerator(7));
    }

    public void updateprice(String price) throws Exception {
        BaseLibrary.textclear(UPprice);
        BaseLibrary.typetext(UPprice, BaseLibrary.randomnumbergenerator(7));
    }

    public void enterhouseshortrate(String HouseShortRate) throws Exception {
        BaseLibrary.typetext(houseshortrate, HouseShortRate);
    }

    public void enterpmhouselongrate(String PMHouseLongRate) throws Exception {
        BaseLibrary.typetext(pmhouselongrate, PMHouseLongRate);
    }

    public void enterpmhouseshortrate(String PMHouseShortRate) throws Exception {
        BaseLibrary.typetext(pmhouseshortrate, PMHouseShortRate);
    }

    public void enterpmhedgelongrate(String PMHedgeLongRate) throws Exception {
        BaseLibrary.typetext(pmhedgelongrate, PMHedgeLongRate);
    }

    public void enterpmhedgeshortrate(String PMHedgeShortRate) throws Exception {
        BaseLibrary.typetext(pmhedgeshortrate, PMHedgeShortRate);
    }

    public void enterpmexchnlongrate(String PMExchnLongRate) throws Exception {
        BaseLibrary.typetext(pmexchnlongrate, PMExchnLongRate);
    }

    public void enterpmexchnshortrate(String PMExchnShortRate) throws Exception {
        BaseLibrary.typetext(pmexchnshortrate, PMExchnShortRate);
    }

    public void entersweepdestination(String SweepDestination) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(sweepdestination, SweepDestination, 1);
    }

    public void entersweepcode(String SweepCode) throws Exception {
        BaseLibrary.typetext(sweepcode, SweepCode);
    }

    public void entersecuritysettlementcurrency(String Currency) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(securitysettlementcurrency, Currency, 1);
    }

    public void enterparvalue(String ParValue) throws Exception {
        BaseLibrary.typetext(parvalue, ParValue);
    }

    public void entersiccd(String SICCd) throws Exception {
        BaseLibrary.typetext(siccd, SICCd);
    }

    public void entercik(String CIK) throws Exception {
        BaseLibrary.typetext(cik, CIK);
    }

    public void entergics(String GICS) throws Exception {
        BaseLibrary.typetext(gics, GICS);
    }

    public void enterlei(String LEI) throws Exception {
        BaseLibrary.typetext(lei, LEI);
    }

    public void enternaics(String NAICS) throws Exception {
        BaseLibrary.typetext(naics, NAICS);
    }

    public void enterindusid(String IndusID) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(indusid, IndusID, 1);
    }

    public void enterfigiglobalshareclassid(String FigiGlobalShareClassId) throws Exception {
        BaseLibrary.typetext(figiglobalshareclassid, FigiGlobalShareClassId);
    }

    public void entercfi(String CFI) throws Exception {
        BaseLibrary.typetext(cfi, CFI);
    }

    public void entercic(String CIC) throws Exception {
        BaseLibrary.typetext(cic, CIC);
    }

    public void enterfisn(String FISN) throws Exception {
        BaseLibrary.typetext(fisn, FISN);
    }

    public void enterundsedol(String UndSedol) throws Exception {
        BaseLibrary.typetext(undsedol, UndSedol);
    }

    public void enterundsymbol(String UndSymbol) throws Exception {
        BaseLibrary.typetext(undsymbol, UndSymbol);
    }

    public void enteradrqty(String ADRQty) throws Exception {
        BaseLibrary.typetext(adrqty, ADRQty);
    }

    public void enterordqty(String ORDQty) throws Exception {
        BaseLibrary.typetext(ordqty, ORDQty);
    }

    public void enterratio(String Ratio) throws Exception {
        BaseLibrary.typetext(ratio, Ratio);
    }

    public void enterbenchmark(String Benchmark) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(benchmark, Benchmark, 1);
    }

    public void entersecuritytypefilter(String SecurityType) throws Exception {
        BaseLibrary.dropdownselectionwithkeys(ffilterSecurityType, SecurityType, 1);
    }

    public void enterleveragefactor(String LeverageFactor) throws Exception {
        BaseLibrary.typetext(leveragefactor, LeverageFactor);
    }

    public void createedisecuritymasterwithmandatory() throws Exception {
        entersymbol(BaseLibrary.randomsymbolgenerator(4));
        entersecuritynumber(BaseLibrary.randomnumbergenerator(7));
        entersectype(BaseLibrary.getdatabasedonsheet("EDI Security Master", 3, 1));
        entersecid(BaseLibrary.randomnumbergenerator(7));
        enterisserid(BaseLibrary.randomnumbergenerator(7));
        BaseLibrary.clickelement(ClickOnSecurityMasterPage2);
        entercusip(BaseLibrary.randomstringgenerator(7));
        entersedol(BaseLibrary.randomstringgenerator(7));
        enterisin(BaseLibrary.randomstringgenerator(7));
        entersecsubtype(BaseLibrary.getdatabasedonsheet("EDI Security Master", 6, 1));
        enterexchange(BaseLibrary.getdatabasedonsheet("EDI Security Master", 7, 1));
        enterstatus(BaseLibrary.getdatabasedonsheet("EDI Security Master", 8, 1));
        entercountry(BaseLibrary.getdatabasedonsheet("EDI Security Master", 9, 1));
        BaseLibrary.clickelement(RegFeeCharge);
        enterlistuniqueid(BaseLibrary.randomstringgenerator(7));
        BaseLibrary.clickelement(ClickOnSecurityMarginPage3);
        BaseLibrary.clickelement(marginable);
        BaseLibrary.clickelement(ClickOnSecurityPricePage4);
        enterprice(BaseLibrary.randomnumbergenerator(7));
        entercurrency(BaseLibrary.getdatabasedonsheet("EDI Security Master", 11, 1));
    }

    public void updatesecuritymasterwithmandatory() throws Exception {
        updateentersecid("Sec Id");
        updateisserid("Isser Id");
        BaseLibrary.clickelement(ClickOnSecurityMasterPage2);
        updatcusip("CUSIP");
        updatesedol("SEDOL");
        updateisin("ISIN");
        BaseLibrary.clickelement(ClickOnSecurityPricePage4);
        updateprice("Price");

    }

    public void createdsymbolfield() throws Exception {
        entersymbol(BaseLibrary.randomsymbolgenerator(4));
        entersecuritynumber(BaseLibrary.randomnumbergenerator(7));
        entersectype(BaseLibrary.getdatabasedonsheet("EDI Security Master", 3, 1));
        entersecid(BaseLibrary.randomnumbergenerator(7));
        enterisserid(BaseLibrary.randomnumbergenerator(7));
        BaseLibrary.clickelement(ClickOnSecurityMasterPage2);
        entercusip(BaseLibrary.randomstringgenerator(7));
        entersedol(BaseLibrary.randomstringgenerator(7));
        enterisin(BaseLibrary.randomstringgenerator(7));
        entersecsubtype(BaseLibrary.getdatabasedonsheet("EDI Security Master", 6, 1));
        enterexchange(BaseLibrary.getdatabasedonsheet("EDI Security Master", 7, 1));
        enterstatus(BaseLibrary.getdatabasedonsheet("EDI Security Master", 8, 1));
        entercountry(BaseLibrary.getdatabasedonsheet("EDI Security Master", 9, 1));
        BaseLibrary.clickelement(RegFeeCharge);
        enterlistuniqueid(BaseLibrary.randomstringgenerator(7));
        BaseLibrary.clickelement(ClickOnSecurityMarginPage3);
        BaseLibrary.clickelement(marginable);
        BaseLibrary.clickelement(ClickOnSecurityPricePage4);
        enterprice(BaseLibrary.randomnumbergenerator(7));
        entercurrency(BaseLibrary.getdatabasedonsheet("EDI Security Master", 11, 1));
    }

    public void createdmaxvalidinputs() throws Exception {
        entersymbol(BaseLibrary.randomsymbolgenerator(4));
        entersecuritynumber(BaseLibrary.randomnumbergenerator(7));
        entersectype(BaseLibrary.getdatabasedonsheet("EDI Security Master", 3, 1));
        entersecid(BaseLibrary.randomnumbergenerator(7));
        enterisserid(BaseLibrary.randomnumbergenerator(7));
        BaseLibrary.clickelement(ClickOnSecurityMasterPage2);
        entercusip(BaseLibrary.randomstringgenerator(7));
        entersedol(BaseLibrary.randomstringgenerator(7));
        enterisin(BaseLibrary.randomstringgenerator(7));
        entersecsubtype(BaseLibrary.getdatabasedonsheet("EDI Security Master", 6, 1));
        enterexchange(BaseLibrary.getdatabasedonsheet("EDI Security Master", 7, 1));
        enterstatus(BaseLibrary.getdatabasedonsheet("EDI Security Master", 8, 1));
        entercountry(BaseLibrary.getdatabasedonsheet("EDI Security Master", 9, 1));
        BaseLibrary.clickelement(RegFeeCharge);
        enterlistuniqueid(BaseLibrary.randomstringgenerator(7));
        BaseLibrary.clickelement(ClickOnSecurityMarginPage3);
        BaseLibrary.clickelement(marginable);
        BaseLibrary.clickelement(ClickOnSecurityPricePage4);
        enterprice(BaseLibrary.randomnumbergenerator(7));
        entercurrency(BaseLibrary.getdatabasedonsheet("EDI Security Master", 11, 1));
    }

    public void samesymbol() throws Exception {
        entersymbol(BaseLibrary.getdatabasedonsheet("EDI Security Master", 2, 2));
        entersecuritynumber(BaseLibrary.randomnumbergenerator(7));
        entersectype(BaseLibrary.getdatabasedonsheet("EDI Security Master", 3, 1));
        entersecid(BaseLibrary.randomnumbergenerator(7));
        enterisserid(BaseLibrary.randomnumbergenerator(7));
        BaseLibrary.clickelement(ClickOnSecurityMasterPage2);
        entercusip(BaseLibrary.randomstringgenerator(7));
        entersedol(BaseLibrary.randomstringgenerator(7));
        enterisin(BaseLibrary.randomstringgenerator(7));
        entersecsubtype(BaseLibrary.getdatabasedonsheet("EDI Security Master", 6, 1));
        enterexchange(BaseLibrary.getdatabasedonsheet("EDI Security Master", 7, 1));
        enterstatus(BaseLibrary.getdatabasedonsheet("EDI Security Master", 8, 1));
        entercountry(BaseLibrary.getdatabasedonsheet("EDI Security Master", 9, 1));
        BaseLibrary.clickelement(RegFeeCharge);
        enterlistuniqueid(BaseLibrary.randomstringgenerator(7));
        BaseLibrary.clickelement(ClickOnSecurityMarginPage3);
        BaseLibrary.clickelement(marginable);
        BaseLibrary.clickelement(ClickOnSecurityPricePage4);
        enterprice(BaseLibrary.randomnumbergenerator(7));
        entercurrency(BaseLibrary.getdatabasedonsheet("EDI Security Master", 11, 1));
    }

    public void fieldsleftemptyvalidaiton() throws Exception {
        entersymbol(BaseLibrary.randomsymbolgenerator(4));
        entersecuritynumber(BaseLibrary.randomnumbergenerator(7));
        entersectype(BaseLibrary.getdatabasedonsheet("EDI Security Master", 3, 1));
        entersecid(BaseLibrary.randomnumbergenerator(7));
        enterisserid(BaseLibrary.randomnumbergenerator(7));
        BaseLibrary.clickelement(ClickOnSecurityMasterPage2);
        entersecsubtype(BaseLibrary.getdatabasedonsheet("EDI Security Master", 6, 1));
        enterexchange(BaseLibrary.getdatabasedonsheet("EDI Security Master", 7, 1));
        enterstatus(BaseLibrary.getdatabasedonsheet("EDI Security Master", 8, 1));
        entercountry(BaseLibrary.getdatabasedonsheet("EDI Security Master", 9, 1));
        BaseLibrary.clickelement(RegFeeCharge);
        enterlistuniqueid(BaseLibrary.randomstringgenerator(7));
        BaseLibrary.clickelement(ClickOnSecurityMarginPage3);
        BaseLibrary.clickelement(marginable);
        BaseLibrary.clickelement(ClickOnSecurityPricePage4);
        enterprice(BaseLibrary.randomnumbergenerator(7));
        entercurrency(BaseLibrary.getdatabasedonsheet("EDI Security Master", 11, 1));
    }


    public void updateedisecuritymasterallfield() throws Exception {
        updateentersecid("Sec Id");
        updateisserid("Isser Id");
        BaseLibrary.clickelement(ClickOnSecurityMasterPage2);
        updatcusip("CUSIP");
        updatesedol("SEDOL");
        updateisin("ISIN");
        updatedescription("Description");
        updatedoutstandingshares("Outstanding Shares");

        updatescexhid("scexhId");
        updateunlistedclassessos("Un Listed Classes Sos");
        updatesegmentmicname("Segment Mic Name");
        updateFigi("Figi");
        updatefigiticker("Figi Ticker");
        updatebloombergcompositeid("Bloomberg Composite Id");
        updatebloombergcompositeticker("Bloomberg Composite Ticker");
        updatelotsize("Lot Size");
        updatevotepersec("Vote Per Sec");
        updaterequiremntratesource("Requiremnt Rate Source");
        updatemfocflag("MfOcFlag");
        updateidcasset("IDC Asset");
        updatespecialrateoveride("Special rate overide\n");
        BaseLibrary.clickelement(ClickOnSecurityMarginPage3);
        BaseLibrary.clickelement(marginable);
        BaseLibrary.clickelement(ClickOnSecurityPricePage4);
        updateprice("Price");
    }

    public void createedisecuritymasterwithallfield() throws Exception {
        entersymbol(BaseLibrary.randomsymbolgenerator(3));
        entersecuritynumber(BaseLibrary.getdatabasedonsheet("EDI Security Master", 100, 1));
        entersectype(BaseLibrary.getdatabasedonsheet("EDI Security Master", 3, 1));
        entersecid(BaseLibrary.randomnumbergenerator(7));
        enterisserid(BaseLibrary.randomnumbergenerator(7));

        BaseLibrary.clickelement(ClickOnSecurityMasterPage2);
        entercusip(BaseLibrary.randomstringgenerator(7));
        entersedol(BaseLibrary.randomstringgenerator(7));
        enterisin(BaseLibrary.randomstringgenerator(7));
        entersecsubtype(BaseLibrary.getdatabasedonsheet("EDI Security Master", 6, 1));
        enterexchange(BaseLibrary.getdatabasedonsheet("EDI Security Master", 7, 1));
        enterstatus(BaseLibrary.getdatabasedonsheet("EDI Security Master", 8, 1));
        entercountry(BaseLibrary.getdatabasedonsheet("EDI Security Master", 9, 1));
        BaseLibrary.clickelement(RegFeeCharge);
        enterdescription(BaseLibrary.randomstringgenerator(7));
        enteroutstandingsharesdate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 18, 1));
//        enterissuer(BaseLibrary.getdatabasedonsheet("EDI Security Master", 19, 1));
       BaseLibrary.clickelement(PennyPilot);
        enteroutstandingshares(BaseLibrary.randomnumbergenerator(7));
     entersecuritydescription(BaseLibrary.randomstringgenerator(7));
        entersedoldefunct(BaseLibrary.getdatabasedonsheet("EDI Security Master", 24, 1));
        entermic(BaseLibrary.getdatabasedonsheet("EDI Security Master", 22, 1));
        enterlistuniqueid(BaseLibrary.randomnumbergenerator(7));
        enterlistactioncode(BaseLibrary.getdatabasedonsheet("EDI Security Master", 27, 1));

//        enterlistchangedate(BaseLibrary.GetDateandTime());
        enterlistcreatedate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 29, 1));
//  enterlistsourceflag(BaseLibrary.getdatabasedonsheet("EDI Security Master", 30, 1));

        enterscexhid(BaseLibrary.randomnumbergenerator(7));
        enterinactivedate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 33, 1));
        enteractivedate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 34, 1));
        enterunlistedclassessos(BaseLibrary.randomstringgenerator(7));
        enterunlistedclassessosdate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 36, 1));
        entersegmentmicname(BaseLibrary.randomstringgenerator(7));
        entersegmentmic(BaseLibrary.getdatabasedonsheet("EDI Security Master", 103, 1));
        enterFigi(BaseLibrary.randomstringgenerator(7));
        enterfigiticker(BaseLibrary.randomnumbergenerator(7));
        enterbloombergcompositeid(BaseLibrary.randomnumbergenerator(7));
        enterbloombergcompositeticker(BaseLibrary.randomnumbergenerator(7));
        enterlotsize(BaseLibrary.randomnumbergenerator(7));
        enterliststatuscode(BaseLibrary.getdatabasedonsheet("EDI Security Master", 44, 1));
        entervoting(BaseLibrary.getdatabasedonsheet("EDI Security Master", 45, 1));
        entervotepersec(BaseLibrary.randomnumbergenerator(7));

        enterregistercountry(BaseLibrary.getdatabasedonsheet("EDI Security Master", 47, 1));
        entertradingcurrency(BaseLibrary.getdatabasedonsheet("EDI Security Master", 48, 1));
        BaseLibrary.clickelement(MultiCurrencyFlag);

      enterListingcountry(BaseLibrary.getdatabasedonsheet("EDI Security Master", 50, 1));

        enterrequiremntratesource(BaseLibrary.randomnumbergenerator(7));
        entermfocflag(BaseLibrary.randomnumbergenerator(1));
        enteridcasset(BaseLibrary.randomnumbergenerator(1));
        enterspecialrateoveride(BaseLibrary.randomnumbergenerator(4));

        BaseLibrary.clickelement(ClickOnSecurityMarginPage3);
        BaseLibrary.clickelement(marginable);
        enterfedlongrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 55, 1));
        enterfedshortrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 55, 1));
        enterexchangelongrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 55, 1));
        enterexchangeshortrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 55, 1));
        enterhouselongrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 55, 1));
        enterhouseshortrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 55, 1));
        enterpmhouselongrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 55, 1));
        enterpmhouseshortrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 55, 1));
        enterpmhedgelongrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 55, 1));
        enterpmhedgeshortrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 55, 1));
        enterpmexchnlongrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 55, 1));
        enterpmexchnshortrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 55, 1));


//        BaseLibrary.clickelement(ClickOnSecuritySettlementPage5);
//        BaseLibrary.clickelement(HardtoBorrow);
//        entersweepdestination(BaseLibrary.getdatabasedonsheet("EDI Security Master", 68, 1));
//       entersweepcode(BaseLibrary.randomnumbergenerator(7));
//        entersecuritysettlementcurrency(BaseLibrary.getdatabasedonsheet("EDI Security Master", 70, 1));
//        enterparvalue(BaseLibrary.randomnumbergenerator(7));
//        BaseLibrary.clickelement(DtcFlag);

        BaseLibrary.clickelement(ClickOnSecurityClassificationPage6);
        entersiccd(BaseLibrary.randomnumbergenerator(7));
        BaseLibrary.clickelement(WhenIssued);
        entercik(BaseLibrary.randomstringgenerator(7));
        entergics(BaseLibrary.randomstringgenerator(7));
        enterlei(BaseLibrary.randomstringgenerator(7));
        enternaics(BaseLibrary.randomstringgenerator(7));
        enterindusid(BaseLibrary.getdatabasedonsheet("EDI Security Master", 79, 1));
        enterfigiglobalshareclassid(BaseLibrary.randomnumbergenerator(7));
        entercfi(BaseLibrary.randomstringgenerator(7));
        entercic(BaseLibrary.randomstringgenerator(7));
        enterfisn(BaseLibrary.randomstringgenerator(7));

        BaseLibrary.clickelement(ClickADRProfilesPage7);
        enterundsedol(BaseLibrary.randomstringgenerator(5));
        enterundsymbol(BaseLibrary.randomstringgenerator(5));
        enteradrqty(BaseLibrary.randomnumbergenerator(4));
        enterordqty(BaseLibrary.randomnumbergenerator(5));
        enterratio(BaseLibrary.randomnumbergenerator(2));

//        BaseLibrary.clickelement(ClickETFProfilesPage8);
//        enterbenchmark(BaseLibrary.getdatabasedonsheet("EDI Security Master", 89, 1));
//        enterleveragefactor(BaseLibrary.randomnumbergenerator(7));

        BaseLibrary.clickelement(ClickOnSecurityPricePage4);
        enterprice(BaseLibrary.randomnumbergenerator(7));
        entercurrency(BaseLibrary.getdatabasedonsheet("EDI Security Master", 11, 1));
    }

    public void createedverifythenewlycreatedsymbol() throws Exception {
        entersymbol(BaseLibrary.getdatabasedonsheet("EDI Security Master", 1, 1));
        entersecuritynumber(BaseLibrary.getdatabasedonsheet("EDI Security Master", 2, 1));
        entersectype(BaseLibrary.getdatabasedonsheet("EDI Security Master", 3, 1));
        entersecid(BaseLibrary.getdatabasedonsheet("EDI Security Master", 4, 1));
        enterisserid(BaseLibrary.getdatabasedonsheet("EDI Security Master", 5, 1));
        BaseLibrary.clickelement(ClickOnSecurityMasterPage2);
        entersecsubtype(BaseLibrary.getdatabasedonsheet("EDI Security Master", 6, 1));
        enterexchange(BaseLibrary.getdatabasedonsheet("EDI Security Master", 7, 1));
        enterstatus(BaseLibrary.getdatabasedonsheet("EDI Security Master", 8, 1));
        entercountry(BaseLibrary.getdatabasedonsheet("EDI Security Master", 9, 1));
        BaseLibrary.clickelement(RegFeeCharge);
        BaseLibrary.clickelement(ClickOnSecurityMarginPage3);
        BaseLibrary.clickelement(marginable);
        BaseLibrary.clickelement(ClickOnSecurityPricePage4);
        enterprice(BaseLibrary.getdatabasedonsheet("EDI Security Master", 11, 1));
        entercurrency(BaseLibrary.getdatabasedonsheet("EDI Security Master", 12, 1));
        BaseLibrary.clickelement(ClickOnSave);
    }

    public void verifythenewlycreatededismsymbol() throws Exception {
        entersymbol(BaseLibrary.getdatabasedonsheet("EDI Security Master", 93, 1));
        entersecuritynumber(BaseLibrary.getdatabasedonsheet("EDI Security Master", 2, 1));
        entersectype(BaseLibrary.getdatabasedonsheet("EDI Security Master", 3, 1));
        entersecid(BaseLibrary.getdatabasedonsheet("EDI Security Master", 4, 1));
        enterisserid(BaseLibrary.getdatabasedonsheet("EDI Security Master", 5, 1));
        BaseLibrary.clickelement(ClickOnSecurityMasterPage2);
        entercusip(BaseLibrary.getdatabasedonsheet("EDI Security Master", 14, 1));
        entersedol(BaseLibrary.getdatabasedonsheet("EDI Security Master", 15, 1));
        enterisin(BaseLibrary.getdatabasedonsheet("EDI Security Master", 16, 1));
        entersecsubtype(BaseLibrary.getdatabasedonsheet("EDI Security Master", 6, 1));
        enterexchange(BaseLibrary.getdatabasedonsheet("EDI Security Master", 7, 1));
        enterstatus(BaseLibrary.getdatabasedonsheet("EDI Security Master", 8, 1));
        entercountry(BaseLibrary.getdatabasedonsheet("EDI Security Master", 9, 1));
        BaseLibrary.clickelement(RegFeeCharge);
        enterdescription(BaseLibrary.getdatabasedonsheet("EDI Security Master", 17, 1));
        enteroutstandingsharesdate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 18, 1));
        enterissuer(BaseLibrary.getdatabasedonsheet("EDI Security Master", 19, 1));
        BaseLibrary.clickelement(PennyPilot);
        enteroutstandingshares(BaseLibrary.getdatabasedonsheet("EDI Security Master", 21, 1));
        entermic(BaseLibrary.getdatabasedonsheet("EDI Security Master", 22, 1));
        entersecuritydescription(BaseLibrary.getdatabasedonsheet("EDI Security Master", 23, 1));
        entersedoldefunct(BaseLibrary.getdatabasedonsheet("EDI Security Master", 24, 1));
        entersedolmic(BaseLibrary.getdatabasedonsheet("EDI Security Master", 25, 1));
        enterlistuniqueid(BaseLibrary.getdatabasedonsheet("EDI Security Master", 26, 1));
        enterlistactioncode(BaseLibrary.getdatabasedonsheet("EDI Security Master", 27, 1));
        enterlistchangedate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 28, 1));
        enterlistcreatedate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 29, 1));
        enterlistsourceflag(BaseLibrary.getdatabasedonsheet("EDI Security Master", 30, 1));
        enterscexhid(BaseLibrary.getdatabasedonsheet("EDI Security Master", 31, 1));
        enterexchangecode(BaseLibrary.getdatabasedonsheet("EDI Security Master", 32, 1));
        enterinactivedate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 33, 1));
        enteractivedate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 34, 1));
        enterunlistedclassessos(BaseLibrary.getdatabasedonsheet("EDI Security Master", 35, 1));
        enterunlistedclassessosdate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 36, 1));
        entersegmentmicname(BaseLibrary.getdatabasedonsheet("EDI Security Master", 37, 1));
        entersegmentmic(BaseLibrary.getdatabasedonsheet("EDI Security Master", 38, 1));
        enterFigi(BaseLibrary.getdatabasedonsheet("EDI Security Master", 39, 1));
        enterfigiticker(BaseLibrary.getdatabasedonsheet("EDI Security Master", 40, 1));
        enterbloombergcompositeid(BaseLibrary.getdatabasedonsheet("EDI Security Master", 41, 1));
        enterbloombergcompositeticker(BaseLibrary.getdatabasedonsheet("EDI Security Master", 42, 1));
        enterlotsize(BaseLibrary.getdatabasedonsheet("EDI Security Master", 43, 1));
        enterliststatuscode(BaseLibrary.getdatabasedonsheet("EDI Security Master", 44, 1));
        entervoting(BaseLibrary.getdatabasedonsheet("EDI Security Master", 45, 1));
        entervotepersec(BaseLibrary.getdatabasedonsheet("EDI Security Master", 46, 1));
        enterregistercountry(BaseLibrary.getdatabasedonsheet("EDI Security Master", 47, 1));
        entertradingcurrency(BaseLibrary.getdatabasedonsheet("EDI Security Master", 48, 1));
        BaseLibrary.clickelement(MultiCurrencyFlag);
//        enterparentcountry(BaseLibrary.getdatabasedonsheet("EDI Security Master", 50, 1));
        enterrequiremntratesource(BaseLibrary.getdatabasedonsheet("EDI Security Master", 51, 1));
        entermfocflag(BaseLibrary.getdatabasedonsheet("EDI Security Master", 52, 1));
        enteridcasset(BaseLibrary.getdatabasedonsheet("EDI Security Master", 53, 1));
        enterspecialrateoveride(BaseLibrary.getdatabasedonsheet("EDI Security Master", 54, 1));
        BaseLibrary.clickelement(ClickOnSecurityMarginPage3);
        BaseLibrary.clickelement(marginable);
        enterfedlongrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 55, 1));
        enterfedshortrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 56, 1));
        enterexchangelongrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 57, 1));
        enterexchangeshortrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 58, 1));
        enterhouselongrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 59, 1));
        enterhouseshortrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 60, 1));
        enterpmhouselongrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 61, 1));
        enterpmhouseshortrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 62, 1));
        enterpmhedgelongrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 63, 1));
        enterpmhedgeshortrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 64, 1));
        enterpmexchnlongrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 65, 1));
        enterpmexchnshortrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 66, 1));
        BaseLibrary.clickelement(ClickOnSecuritySettlementPage5);
        BaseLibrary.clickelement(HardtoBorrow);
        entersweepdestination(BaseLibrary.getdatabasedonsheet("EDI Security Master", 68, 1));
        entersweepcode(BaseLibrary.getdatabasedonsheet("EDI Security Master", 69, 1));
        entersecuritysettlementcurrency(BaseLibrary.getdatabasedonsheet("EDI Security Master", 70, 1));
        enterparvalue(BaseLibrary.getdatabasedonsheet("EDI Security Master", 71, 1));
        BaseLibrary.clickelement(DtcFlag);
        BaseLibrary.clickelement(ClickOnSecurityClassificationPage6);
        entersiccd(BaseLibrary.getdatabasedonsheet("EDI Security Master", 73, 1));
        BaseLibrary.clickelement(WhenIssued);
        entercik(BaseLibrary.getdatabasedonsheet("EDI Security Master", 75, 1));
        entergics(BaseLibrary.getdatabasedonsheet("EDI Security Master", 76, 1));
        enterlei(BaseLibrary.getdatabasedonsheet("EDI Security Master", 77, 1));
        enternaics(BaseLibrary.getdatabasedonsheet("EDI Security Master", 78, 1));
        enterindusid(BaseLibrary.getdatabasedonsheet("EDI Security Master", 79, 1));
        enterfigiglobalshareclassid(BaseLibrary.getdatabasedonsheet("EDI Security Master", 80, 1));
        entercfi(BaseLibrary.getdatabasedonsheet("EDI Security Master", 81, 1));
        entercic(BaseLibrary.getdatabasedonsheet("EDI Security Master", 82, 1));
        enterfisn(BaseLibrary.getdatabasedonsheet("EDI Security Master", 83, 1));
        BaseLibrary.clickelement(ClickADRProfilesPage7);
        enterundsedol(BaseLibrary.getdatabasedonsheet("EDI Security Master", 84, 1));
        enterundsymbol(BaseLibrary.getdatabasedonsheet("EDI Security Master", 85, 1));
        enteradrqty(BaseLibrary.getdatabasedonsheet("EDI Security Master", 86, 1));
        enterordqty(BaseLibrary.getdatabasedonsheet("EDI Security Master", 87, 1));
        enterratio(BaseLibrary.getdatabasedonsheet("EDI Security Master", 88, 1));
        BaseLibrary.clickelement(ClickETFProfilesPage8);
        enterbenchmark(BaseLibrary.getdatabasedonsheet("EDI Security Master", 89, 1));
        enterleveragefactor(BaseLibrary.getdatabasedonsheet("EDI Security Master", 90, 1));
        BaseLibrary.clickelement(ClickOnSecurityPricePage4);
        enterprice(BaseLibrary.getdatabasedonsheet("EDI Security Master", 11, 1));
        entercurrency(BaseLibrary.getdatabasedonsheet("EDI Security Master", 12, 1));
        BaseLibrary.clickelement(ClickOnSave);
    }

    public void verifytheSamesecurityCode() throws Exception {
        entersymbol(BaseLibrary.getdatabasedonsheet("EDI Security Master", 1, 2));
        entersecuritynumber(BaseLibrary.getdatabasedonsheet("EDI Security Master", 2, 1));
        entersectype(BaseLibrary.getdatabasedonsheet("EDI Security Master", 3, 1));
        entersecid(BaseLibrary.getdatabasedonsheet("EDI Security Master", 4, 1));
        enterisserid(BaseLibrary.getdatabasedonsheet("EDI Security Master", 5, 1));
        BaseLibrary.clickelement(ClickOnSecurityMasterPage2);
        entercusip(BaseLibrary.getdatabasedonsheet("EDI Security Master", 14, 1));
        entersedol(BaseLibrary.getdatabasedonsheet("EDI Security Master", 15, 1));
        enterisin(BaseLibrary.getdatabasedonsheet("EDI Security Master", 16, 1));
        entersecsubtype(BaseLibrary.getdatabasedonsheet("EDI Security Master", 6, 1));
        enterexchange(BaseLibrary.getdatabasedonsheet("EDI Security Master", 7, 1));
        enterstatus(BaseLibrary.getdatabasedonsheet("EDI Security Master", 8, 1));
        entercountry(BaseLibrary.getdatabasedonsheet("EDI Security Master", 9, 1));
        BaseLibrary.clickelement(RegFeeCharge);
        enterdescription(BaseLibrary.getdatabasedonsheet("EDI Security Master", 17, 1));
        enteroutstandingsharesdate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 18, 1));
//        enterissuer(BaseLibrary.getdatabasedonsheet("EDI Security Master", 19, 1));
        BaseLibrary.clickelement(PennyPilot);
        enteroutstandingshares(BaseLibrary.getdatabasedonsheet("EDI Security Master", 21, 1));
        entermic(BaseLibrary.getdatabasedonsheet("EDI Security Master", 22, 1));
        entersecuritydescription(BaseLibrary.getdatabasedonsheet("EDI Security Master", 23, 1));
        entersedoldefunct(BaseLibrary.getdatabasedonsheet("EDI Security Master", 24, 1));
        entersedolmic(BaseLibrary.getdatabasedonsheet("EDI Security Master", 25, 1));
        enterlistuniqueid(BaseLibrary.getdatabasedonsheet("EDI Security Master", 26, 1));
        enterlistactioncode(BaseLibrary.getdatabasedonsheet("EDI Security Master", 27, 1));
        enterlistchangedate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 28, 1));
        enterlistcreatedate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 29, 1));
        enterlistsourceflag(BaseLibrary.getdatabasedonsheet("EDI Security Master", 30, 1));
        enterscexhid(BaseLibrary.getdatabasedonsheet("EDI Security Master", 31, 1));
        enterexchangecode(BaseLibrary.getdatabasedonsheet("EDI Security Master", 32, 1));
        enterinactivedate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 33, 1));
        enteractivedate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 34, 1));
        enterunlistedclassessos(BaseLibrary.getdatabasedonsheet("EDI Security Master", 35, 1));
        enterunlistedclassessosdate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 36, 1));
        entersegmentmicname(BaseLibrary.getdatabasedonsheet("EDI Security Master", 37, 1));
        entersegmentmic(BaseLibrary.getdatabasedonsheet("EDI Security Master", 38, 1));
        enterFigi(BaseLibrary.getdatabasedonsheet("EDI Security Master", 39, 1));
        enterfigiticker(BaseLibrary.getdatabasedonsheet("EDI Security Master", 40, 1));
        enterbloombergcompositeid(BaseLibrary.getdatabasedonsheet("EDI Security Master", 41, 1));
        enterbloombergcompositeticker(BaseLibrary.getdatabasedonsheet("EDI Security Master", 42, 1));
        enterlotsize(BaseLibrary.getdatabasedonsheet("EDI Security Master", 43, 1));
        enterliststatuscode(BaseLibrary.getdatabasedonsheet("EDI Security Master", 44, 1));
        entervoting(BaseLibrary.getdatabasedonsheet("EDI Security Master", 45, 1));
        entervotepersec(BaseLibrary.getdatabasedonsheet("EDI Security Master", 46, 1));
        enterregistercountry(BaseLibrary.getdatabasedonsheet("EDI Security Master", 47, 1));
        entertradingcurrency(BaseLibrary.getdatabasedonsheet("EDI Security Master", 48, 1));
        BaseLibrary.clickelement(MultiCurrencyFlag);
//        enterparentcountry(BaseLibrary.getdatabasedonsheet("EDI Security Master", 50, 1));
        enterrequiremntratesource(BaseLibrary.getdatabasedonsheet("EDI Security Master", 51, 1));
        entermfocflag(BaseLibrary.getdatabasedonsheet("EDI Security Master", 52, 1));
        enteridcasset(BaseLibrary.getdatabasedonsheet("EDI Security Master", 53, 1));
        enterspecialrateoveride(BaseLibrary.getdatabasedonsheet("EDI Security Master", 54, 1));
        BaseLibrary.clickelement(ClickOnSecurityMarginPage3);
        BaseLibrary.clickelement(marginable);
        enterfedlongrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 55, 1));
        enterfedshortrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 56, 1));
        enterexchangelongrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 57, 1));
        enterexchangeshortrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 58, 1));
        enterhouselongrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 59, 1));
        enterhouseshortrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 60, 1));
        enterpmhouselongrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 61, 1));
        enterpmhouseshortrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 62, 1));
        enterpmhedgelongrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 63, 1));
        enterpmhedgeshortrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 64, 1));
        enterpmexchnlongrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 65, 1));
        enterpmexchnshortrate(BaseLibrary.getdatabasedonsheet("EDI Security Master", 66, 1));
        BaseLibrary.clickelement(ClickOnSecuritySettlementPage5);
        BaseLibrary.clickelement(HardtoBorrow);
        entersweepdestination(BaseLibrary.getdatabasedonsheet("EDI Security Master", 68, 1));
        entersweepcode(BaseLibrary.getdatabasedonsheet("EDI Security Master", 69, 1));
        entersecuritysettlementcurrency(BaseLibrary.getdatabasedonsheet("EDI Security Master", 70, 1));
        enterparvalue(BaseLibrary.getdatabasedonsheet("EDI Security Master", 71, 1));
        BaseLibrary.clickelement(DtcFlag);
        BaseLibrary.clickelement(ClickOnSecurityClassificationPage6);
        entersiccd(BaseLibrary.getdatabasedonsheet("EDI Security Master", 73, 1));
        BaseLibrary.clickelement(WhenIssued);
        entercik(BaseLibrary.getdatabasedonsheet("EDI Security Master", 75, 1));
        entergics(BaseLibrary.getdatabasedonsheet("EDI Security Master", 76, 1));
        enterlei(BaseLibrary.getdatabasedonsheet("EDI Security Master", 77, 1));
        enternaics(BaseLibrary.getdatabasedonsheet("EDI Security Master", 78, 1));
        enterindusid(BaseLibrary.getdatabasedonsheet("EDI Security Master", 79, 1));
        enterfigiglobalshareclassid(BaseLibrary.getdatabasedonsheet("EDI Security Master", 80, 1));
        entercfi(BaseLibrary.getdatabasedonsheet("EDI Security Master", 81, 1));
        entercic(BaseLibrary.getdatabasedonsheet("EDI Security Master", 82, 1));
        enterfisn(BaseLibrary.getdatabasedonsheet("EDI Security Master", 83, 1));
        BaseLibrary.clickelement(ClickADRProfilesPage7);
        enterundsedol(BaseLibrary.getdatabasedonsheet("EDI Security Master", 84, 1));
        enterundsymbol(BaseLibrary.getdatabasedonsheet("EDI Security Master", 85, 1));
        enteradrqty(BaseLibrary.getdatabasedonsheet("EDI Security Master", 86, 1));
        enterordqty(BaseLibrary.getdatabasedonsheet("EDI Security Master", 87, 1));
        enterratio(BaseLibrary.getdatabasedonsheet("EDI Security Master", 88, 1));
        BaseLibrary.clickelement(ClickETFProfilesPage8);
        enterbenchmark(BaseLibrary.getdatabasedonsheet("EDI Security Master", 89, 1));
        enterleveragefactor(BaseLibrary.getdatabasedonsheet("EDI Security Master", 90, 1));
        BaseLibrary.clickelement(ClickOnSecurityPricePage4);
        enterprice(BaseLibrary.getdatabasedonsheet("EDI Security Master", 11, 1));
        entercurrency(BaseLibrary.getdatabasedonsheet("EDI Security Master", 12, 1));
        BaseLibrary.clickelement(ClickOnSave);
    }

    public void onefiltervaliddata(String symbolValue) throws Exception {
        BaseLibrary.waitforelement(filter_symbol);
        BaseLibrary.typetext(filter_sendSymbolValue, symbolValue);
        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }

    public void multiplevaliddata(String symbolValue, String symNO) throws Exception {
        BaseLibrary.waitforelement(filter_symbol);
        BaseLibrary.typetext(filter_sendSymbolValue, symbolValue);
        BaseLibrary.waitforelement(filter_symno);
        BaseLibrary.typetext(filter_sendsymNo, symNO);
        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }


    public void validsearchoperation(String symNo) throws Exception {
        BaseLibrary.waitforelement(screen_validsearch);
        BaseLibrary.typetext(search_sendvalidsearch, symNo);
        BaseLibrary.clickelement(hitSearchButton);
    }

    public void invalidsearchoperation(String symNo) throws Exception {
        BaseLibrary.waitforelement(screen_validsearch);
        BaseLibrary.typetext(search_sendvalidsearch, symNo);
        BaseLibrary.clickelement(hitSearchButton);
    }

    public void securitytypefilter(String securityTypeValue) throws Exception {
        BaseLibrary.waitforelement(filter_securityTypeValue);
        entersecuritytypefilter(BaseLibrary.getdatabasedonsheet("EDI Security Master", 98, 1));
        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }


    public void applymultiplefiltervaliddata(String symbolValue,String isinValue) throws Exception {
        BaseLibrary.waitforelement(filter_symbol);
        BaseLibrary.typetext(filter_sendSymbolValue, symbolValue);
        BaseLibrary.waitforelement(filter_isin);
        BaseLibrary.typetext(filter_sendIsinValue, isinValue);
        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }
    public void Multiplefilterinvaliddata(String symbolValue,String isinValue) throws Exception {
        BaseLibrary.waitforelement(mulifilter_invalidsymbol);
        BaseLibrary.typetext(filter_mulifilter_invalidsymbol, symbolValue);
        BaseLibrary.waitforelement(multifilter_invalidisin);
        BaseLibrary.typetext(filter_multifilter_invalidisin, isinValue);
        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }

    public void onefilterinvaliddata(String invalidSymbolValue) throws Exception {
        BaseLibrary.waitforelement(filter_symbol);
        BaseLibrary.typetext(filter_sendSymbolValue, invalidSymbolValue);
        BaseLibrary.clickelement(filterSearchButton);
        BaseLibrary.clickelement(filtercloseButton);
    }

    public void verifymultiplefiltervaliddata(String symbolValue) throws Exception {
        Thread.sleep(5000);
        BaseLibrary.waitforelement(checkTheTable);
        Assert.assertEquals(symbolValue, verifytalbe.getText());
    }

    public void verifysymboloutput(String Symbol_value) throws Exception {
        Thread.sleep(5000);
        BaseLibrary.waitforelement(checkTheTable);
        Assert.assertEquals(Symbol_value, verifytalbe.getText());
    }


    public void verifysecuritytypefilter(String securitytypeValue) throws Exception {
        Thread.sleep(5000);
        BaseLibrary.waitforelement(checkTheTable);
        Assert.assertEquals(securitytypeValue, securitytypeverifytalbe.getText());
    }


    public void verifysvalidSearchdata(String symNo) throws Exception {
        Thread.sleep(5000);
        BaseLibrary.waitforelement(checkTheTable);
        Assert.assertEquals(symNo, symNo_searchValue.getText());
    }

    public void ouputmultiplefiltervaliddata(String symbolValue,String isinValue) throws Exception {
        Thread.sleep(5000);
        BaseLibrary.waitforelement(checkTheTable);
        Assert.assertEquals(symbolValue, multi_symbol_verifytalbe.getText());
        Assert.assertEquals(isinValue, multi_isin_verifytalbe.getText());
    }



    public void verifysamesecuritynumber(String securityNumber_value) throws Exception {
        Thread.sleep(5000);
        BaseLibrary.waitforelement(securitynumbercheckTheTable);
        Assert.assertEquals(securityNumber_value, samesecuritynumberverifytalbe.getText());
    }


    public void norecordfoundedionefilter() throws Exception {
        BaseLibrary.waitforelement(No_data_found);
        No_data_found.isDisplayed();
    }


    public void norecordfoundedionesearch() throws Exception {
        BaseLibrary.waitforelement(No_data_found);
        No_data_found.isDisplayed();
    }

    public void throwsvalidationMeassage(String expected_textMessage) throws Exception {
        BaseLibrary.waitforelement(validateMessage);
        String actual_textMessage = validateMessage.getText();
        Assert.assertEquals(expected_textMessage, actual_textMessage);
        BaseLibrary.waitforelement(close);
        BaseLibrary.clickelement(close);
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













