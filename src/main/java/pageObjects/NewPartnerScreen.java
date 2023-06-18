package pageObjects;

import baseMethods.BaseLibrary;
import baseMethods.Threadmanager;
import baseMethods.UIUtilis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class NewPartnerScreen {

	WebDriver driver;

	@FindBy(xpath = "(//label[text()='Entity*']//following::input)[1]")
	private WebElement selectentity;

	// Partner Information
	@FindBy(xpath = "(//label[text()='Partner Name*']//following::input)[1]")
	private WebElement PartnerName;

	@FindBy(xpath = "(//label[text()='Partner Type*']//following::input)[1]")
	private WebElement PartnerType;

	@FindBy(xpath = "(//label[text()='KYC Mode*']//following::input)[1]")
	private WebElement KYCMode;

	@FindBy(xpath = "(//label[text()='Partner Website*']//following::input)[1]")
	private WebElement PartnerWebsite;

	@FindBy(xpath = "(//label[text()='Business Entity*']//following::input)[1]")
	private WebElement BusinessEntity;

	@FindBy(xpath = "(//label[text()='Address Type*']//following::input)[1]")
	private WebElement AddressType;

	@FindBy(xpath = "(//label[text()='Address Line 1*']//following::input)[1]")
	private WebElement AddressLine1;

	@FindBy(xpath = "(//label[text()='Address Line 2']//following::input)[1]")
	private WebElement AddressLine2;

	@FindBy(xpath = "(//label[text()='City*']//following::input)[1]")
	private WebElement City;

	@FindBy(xpath = "(//label[text()='State*']//following::input)[1]")
	private WebElement State;

	@FindBy(xpath = "(//label[text()='Country*']//following::input)[1]")
	private WebElement Partnerinfo_Country;

	@FindBy(xpath = "(//label[text()='Zipcode*']//following::input)[1]")
	private WebElement Zipcode;

	@FindBy(xpath = "(//label[text()='Email*']//following::input)[1]")
	private WebElement Email;

	@FindBy(xpath = "(//label[text()='Alternative Email']//following::input)[1]")
	private WebElement AlternativeEmail;

	@FindBy(xpath = "(//label[text()='Phone*']//following::input)[1]")
	private WebElement Phone;

	@FindBy(xpath = "//*[@id='demo-simple-select'][@type='text']")
	private WebElement  phonecountrycode;

	@FindBy(xpath = "(//*[@id='demo-simple-select'])[2]")
	private WebElement entercontactchoneworkphonecountrycode;

	@FindBy(xpath = "(//*[@id='demo-simple-select'])[3]")
	private WebElement  entercontactphonemobilecountrycode;

	@FindBy(xpath = "(//*[@id='demo-simple-select'])[4]")
	private WebElement  enterirscontactphonecountrycode;

	@FindBy(xpath = "//*[@id='demo-simple-select'][@type='text']")
	private WebElement  ContactPhoneMobile_code;

	@FindBy(xpath = "(//label[text()='Prospectus']//following::input)[1]")
	private WebElement Prospectus;

	@FindBy(xpath = "(//label[text()='Industry']//following::input)[1]")
	private WebElement Industry;

	@FindBy(xpath = "(//label[text()='Stock Ticker*']//following::input)[1]")
	private WebElement StockTicker;

	@FindBy(xpath = "(//label[text()='Cool Down Period']//following::input)[1]")
	private WebElement CoolDownPeriod;

	@FindBy(xpath = "(//label[text()='FPSL Enrolled']//following::input)[1]")
	private WebElement FPSLEnrolled;

	@FindBy(xpath = "(//label[text()='OTC Market Data Type']//following::input)[1]")
	private WebElement OTCMarketPeriod;

	@FindBy(xpath = "(//label[text()='Omnibus Account ID(s)']//following::input)[1]")
	private WebElement OmnibusAccountID;

	@FindBy(xpath = "(//label[text()='Subscription Default Trial Period Days']//following::input)[1]")
	private WebElement SubscriptionDefaultTrialPeriodDays;

	@FindBy(xpath = "(//label[text()='Business Structure Type*']//following::input)[1]")
	private WebElement BusinessStructureType;

	@FindBy(xpath = "(//label[text()='USA Branch*']//following::input)[1]")
	private WebElement USABranch;

	@FindBy(xpath = "(//label[text()='Foreign Bank*']//following::input)[1]")
	private WebElement ForeignBank;

	@FindBy(xpath = "(//label[text()='Foreign Financial Institution*']//following::input)[1]")
	private WebElement ForeignFinancialInstitution;

	@FindBy(xpath = "(//label[text()='Director Count*']//following::input)[1]")
	private WebElement DirectorCount;

	@FindBy(xpath = "(//label[text()='MPID*']//following::input)[1]")
	private WebElement MPID;

	@FindBy(xpath = "(//label[text()='Finra Num*']//following::input)[1]")
	private WebElement FinraNum;

	@FindBy(xpath = "(//label[text()='SEC Reg Num*']//following::input)[1]")
	private WebElement SECRegNum;

	@FindBy(xpath = "(//label[text()='Status*']//following::input)[1]")
	private WebElement Partnerinfo_Status;

	@FindBy(xpath = "(//label[text()='SPL Alloy Logic*']//following::input)[1]")
	private WebElement SPLAlloyLogic;

	@FindBy(xpath = "(//label[text()='KYC Doc Required*']//following::input)[1]")
	private WebElement KYCDocRequired;

	@FindBy(xpath = "(//label[text()='Part Scy Lending Pgm*']//following::input)[1]")
	private WebElement PartScyLendingPgm;

	// Legal Risk

	@FindBy(xpath = "(//label[text()='CP Trading Limit*']//following::input)[1]")
	private WebElement CPTradingLimit;

	@FindBy(xpath = "(//label[text()='CP Funding Limit*']//following::input)[1]")
	private WebElement CPFundingLimit;

	@FindBy(xpath = "(//label[text()='Line Of Credit*']//following::input)[1]")
	private WebElement LineOfCredit;

	@FindBy(xpath = "(//label[text()='Initial Clearing Deposit*']//following::input)[1]")
	private WebElement InitialClearingDeposit;

	@FindBy(xpath = "(//label[text()='Rate Card*']//following::input)[1]")
	private WebElement RateCard;

	@FindBy(xpath = "(//label[text()='Country*']//following::input)[1]")
	private WebElement LegalRisk_Country;

	@FindBy(xpath = "(//label[text()='Status*']//following::input)[1]")
	private WebElement LegalRisk_Status;

	@FindBy(xpath = "(//label[text()='Jurisdiction List*']//following::input)[1]")
	private WebElement JurisdictionList;

	@FindBy(xpath = "(//label[text()='Registration Type*']//following::input)[1]")
	private WebElement RegistrationType;

	@FindBy(xpath = "(//label[text()='Regulatory Licence No*']//following::input)[1]")
	private WebElement RegulatoryLicenceNo;

	@FindBy(xpath = "(//label[text()='Registration Date*']//following::input)[1]")
	private WebElement RegistrationDate;

	// Product & Services

	@FindBy(xpath = "(//label[text()='Product ID*']//following::input)[1]")
	private WebElement ProductID;

	@FindBy(xpath = "(//label[text()='Commission Description']//following::input)[1]")
	private WebElement CommissionDescription;

	@FindBy(xpath = "(//label[text()='Commission Group Description*']//following::input)[1]")
	private WebElement CommissionGroupDescription;

	@FindBy(xpath = "(//label[text()='Commission Details']//following::input)[1]")
	private WebElement CommissionDetails;

	@FindBy(xpath = "(//label[text()='Fractional Details*']//following::input)[1]")
	private WebElement FractionalDetails;

	@FindBy(xpath = "(//label[text()='Country']//following::input)[1]")
	private WebElement Product_Country;

	@FindBy(xpath = "(//label[text()='Account Management Type*']//following::input)[1]")
	private WebElement AccountManagementType;

	@FindBy(xpath = "(//label[text()='Status']//following::input)[1]")
	private WebElement Product_Status;

	@FindBy(xpath = "(//label[text()='Default Ind*']//following::input)[1]")
	private WebElement DefaultInd;

	@FindBy(xpath = "(//label[text()='Subscription']//following::input)[1]")
	private WebElement Subscription;

	@FindBy(xpath = "(//label[text()='Basket Details*']//following::input)[1]")
	private WebElement BasketDetails;

	@FindBy(xpath = "(//label[text()='Basket Schedule*']//following::input)[1]")
	private WebElement BasketSchedule;

	@FindBy(xpath = "(//label[text()='Managed Account Details*']//following::input)[1]")
	private WebElement ManagedAccountDetails;

	@FindBy(xpath = "(//label[text()='OTC commission Detail*']//following::input)[1]")
	private WebElement OTCcommissionDetail;

	@FindBy(xpath = "(//label[text()='Pass Through Fees*']//following::input)[1]")
	private WebElement PassThroughFees;

	@FindBy(xpath = "(//label[text()='Description*']//following::input)[1]")
	private WebElement Description;

	@FindBy(xpath = "(//label[text()='Status']//following::input)[1]")
	private WebElement ProductInstStatus;

	// Funding

	@FindBy(xpath = "(//label[text()='Funding Type*']//following::input)[1]")
	private WebElement fundingType;

	@FindBy(xpath = "(//label[text()='Payment ID*']//following::input)[1]")
	private WebElement paymentID;

	@FindBy(xpath = "(//label[text()='Category*']//following::input)[1]")
	private WebElement category;

	@FindBy(xpath = "(//label[text()='Currency code*']//following::input)[1]")
	private WebElement currencyCode;

	@FindBy(xpath = "(//label[text()='Status*']//following::input)[1]")
	private WebElement status;

	@FindBy(xpath = "(//label[text()='Payment Rail*']//following::input)[1]")
	private WebElement paymentRail;

	@FindBy(xpath = "(//label[text()='LIC Handle Funds']//following::button[@value='Yes'])")
	private WebElement lICHandleFunds_Yes;

	@FindBy(xpath = "(//label[text()='LIC Handle Funds']//following::button[@value='No'])")
	private WebElement lICHandleFunds_No;

	@FindBy(xpath = "(//label[text()='LIC Partner Handle Funds*']//following::input)[1]")
	private WebElement lICPartnerHandleFunds;

	@FindBy(xpath = "(//label[text()='Cash Management Election*']//following::input)[1]")
	private WebElement cashManagementElection;

	@FindBy(xpath = "(//label[text()='Beneficiary Name*']//following::input)[1]")
	private WebElement beneficiaryName;

	@FindBy(xpath = "(//label[text()='Beneficiary Account No*']//following::input)[1]")
	private WebElement beneficiaryAccountNo;

	@FindBy(xpath = "(//label[text()='Beneficiary Account Type*']//following::input)[1]")
	private WebElement beneficiaryAccountType;

	@FindBy(xpath = "(//label[text()='Beneficiary Bank Name*']//following::input)[1]")
	private WebElement beneficiaryBankName;

	@FindBy(xpath = "(//label[text()='Address Line 1*']//following::input)[1]")
	private WebElement addressLine1;

	@FindBy(xpath = "(//label[text()='Address Line 2']//following::input)[1]")
	private WebElement addressLine2;

	@FindBy(xpath = "(//label[text()='Address Line 3']//following::input)[1]")
	private WebElement addressLine3;

	@FindBy(xpath = "(//label[text()='Country*']//following::input)[1]")
	private WebElement country;

	@FindBy(xpath = "(//label[text()='State*']//following::input)[1]")
	private WebElement state;

	@FindBy(xpath = "(//label[text()='City*']//following::input)[1]")
	private WebElement city;

	@FindBy(xpath = "(//label[text()='zipcode*']//following::input)[1]")
	private WebElement zipcode;

	@FindBy(xpath = "(//label[text()='Phone*']//following::input)[1]")
	private WebElement phone;

	@FindBy(xpath = "(//label[text()='Email*']//following::input)[1]")
	private WebElement email;

	@FindBy(xpath = "(//label[text()='Alternative Email']//following::input)[1]")
	private WebElement alternativeEmail;

	@FindBy(xpath = "(//label[text()='Intermediary SWIFT*']//following::input)[1]")
	private WebElement intermediarySWIFT;

	@FindBy(xpath = "(//label[text()='Intermediary Bank Name*']//following::input)[1]")
	private WebElement intermediaryBankName;

	@FindBy(xpath = "(//label[text()='Intermediary Bank Country*']//following::input)[1]")
	private WebElement intermediaryBankCountry;

	@FindBy(xpath = "(//label[text()='Escrow Account ID']//following::input)[1]")
	private WebElement escrowAccountID;

	@FindBy(xpath = "(//label[text()='Escrow Account No']//following::input)[1]")
	private WebElement escrowAccountNo;

	@FindBy(xpath = "(//label[text()='IFA Account ID']//following::input)[1]")
	private WebElement iFAAccountID;

	@FindBy(xpath = "(//label[text()='IFA Account No']//following::input)[1]")
	private WebElement iFAAccountNo;

	@FindBy(xpath = "(//label[text()='House Account ID']//following::input)[1]")
	private WebElement houseAccountID;

	@FindBy(xpath = "(//label[text()='House Account No']//following::input)[1]")
	private WebElement houseAccountNO;

	@FindBy(xpath = "(//label[text()='Suspense Account ID']//following::input)[1]")
	private WebElement suspenseAccountID;

	@FindBy(xpath = "(//label[text()='Suspense Account No']//following::input)[1]")
	private WebElement suspenseAccountNO;

//Settlement, Accounting & Statements

	@FindBy(xpath = "(//label[text()='Prefix*']//following::input)[1]")
	private WebElement prefix;

	@FindBy(xpath = "(//label[text()='Language*']//following::input)[1]")
	private WebElement language;

	@FindBy(xpath = "(//label[text()='Clearing Code*']//following::input)[1]")
	private WebElement clearingCode;

	@FindBy(xpath = "(//label[text()='Company Name*']//following::input)[1]")
	private WebElement companyName;

	@FindBy(xpath = "(//label[text()='Financing Spread Tier 3*']//following::input)[1]")
	private WebElement financing_Spread_Tier_3;

	@FindBy(xpath = "(//label[text()='Regulator ID*']//following::input)[1]")
	private WebElement regulator_ID;

	@FindBy(xpath = "(//label[text()='Active?*']//following::button[@value='No'])")
	private WebElement active_No;

	@FindBy(xpath = "(//label[text()='Active?*']//following::button[@value='Yes'])")
	private WebElement active_Yes;

	@FindBy(xpath = "(//label[text()='Country ID*']//following::input)[1]")
	private WebElement country_ID;

	@FindBy(xpath = "(//label[text()='Prefix Practice*']//following::input)[1]")
	private WebElement prefix_Practice;

	@FindBy(xpath = "(//label[text()='WLP Id*']//following::input)[1]")
	private WebElement wLPId;

	@FindBy(xpath = "(//label[text()='WLP Hash*']//following::input)[1]")
	private WebElement wLPHash;
	@FindBy(xpath = "(//label[text()='Currencies*']//following::input)[1]")
	private WebElement Currencies;

	@FindBy(xpath = "(//label[text()='Margin Min*']//following::input)[1]")
	private WebElement MarginMin;

	@FindBy(xpath = "(//label[text()='Risk owned by ID*']//following::input)[1]")
	private WebElement riskownedbyID;

	@FindBy(xpath = "(//label[text()='Contact Phone Work*']//following::input)[1]")
	private WebElement contactPhoneWork;

	@FindBy(xpath = "(//label[text()='Contact Phone Mobile*']//following::input)[1]")
	private WebElement contactPhoneMobile;

	@FindBy(xpath = "(//label[text()='Contra Sub Account*']//following::input)[1]")
	private WebElement contraSubAccount;

	@FindBy(xpath = "(//label[text()='Allowed Country List*']//following::input)[1]")
	private WebElement allowedCountryList;

	@FindBy(xpath = "(//label[text()='Default WatchList*']//following::input)[1]")
	private WebElement defaultWatchList;

	@FindBy(xpath = "(//label[text()='Default Favorites']//following::input)[1]")
	private WebElement defaultFavorites;

	@FindBy(xpath = "(//label[text()='Default Recent Instruments']//following::input)[1]")
	private WebElement defaultRecentInstruments;

	@FindBy(xpath = "(//label[text()='Tax ID*']//following::input)[1]")
	private WebElement taxID;

	@FindBy(xpath = "(//label[text()='IRS TXM Control*']//following::input)[1]")
	private WebElement iRSTXMControl;

	@FindBy(xpath = "(//label[text()='IRS Contact Title*']//following::input)[1]")
	private WebElement iRSTaxContactTitle;

	@FindBy(xpath = "(//label[text()='IRS Contact Phone*']//following::input)[1]")
	private WebElement iRSContactPhone;

	@FindBy(xpath = "(//label[text()='IRS Contact Name*']//following::input)[1]")
	private WebElement iRSContactName;

	@FindBy(xpath = "(//label[text()='Footer*']//following::textarea)[1]")
	private WebElement footer;

	@FindBy(xpath = "(//label[text()='Disclaimer*']//following::textarea)[1]")
	private WebElement disclaimer;

	@FindBy(xpath = "(//label[text()='Footer*']//following::textarea)[5]")
	private WebElement footer_two;

	@FindBy(xpath = "(//label[text()='Disclaimer*']//following::textarea)[5]")
	private WebElement disclaimer_two;

	// office and sub office
	@FindBy(xpath = "(//label[text()='Office Name*']//following::input)[1]")
	private WebElement officeName;

	@FindBy(xpath = "(//label[text()='Office Code*']//following::input)[1]")
	private WebElement officeCode;

	@FindBy(xpath = "(//label[text()='Description']//following::input)[1]")
	private WebElement description;

	@FindBy(xpath = "(//label[text()='Sub Office Name']//following::input)[1]")
	private WebElement subOfficeName;
	

	@FindBy(xpath = "((//label[text()='Sub Office Name'])[2]//following::input)[1]")
	private WebElement subOfficeName2;

	@FindBy(xpath = "(//label[text()='Code*']//following::input)[1]")
	private WebElement code;
	
	@FindBy(xpath = "((//label[text()='Code'])[2]//following::input)[1]")
	private WebElement code2;

	@FindBy(xpath = "//span[text()='Add Another Sub-Office']//parent::button")
	private WebElement addAnotherSubOffice;

	@FindBy(xpath = "(//span[text()='Add Another Office']//parent::button")
	private WebElement addAnotherOffice;

	@FindBy(xpath = "(//label[text()='CAT Reporting?*']//following::button[@value='Yes'])")
	private WebElement cATReporting_Yes;

	@FindBy(xpath = "(//label[text()='CAT Reporting?*']//following::button[@value='No'])")
	private WebElement cATReporting_No;

	@FindBy(xpath = "(//label[text()='Flag to generate Daily Buy/Sell Report']//following::button[@value='Yes'])")
	private WebElement flagtogenerateDailyBuySellReport_Yes;

	@FindBy(xpath = "(//label[text()='CAT Reporting?*']//following::button[@value='No'])")
	private WebElement flagtogenerateDailyBuySellReport_No;

	@FindBy(xpath = "(//label[text()='Flag for Reconciliation Report']//following::button[@value='Yes'])")
	private WebElement flagforReconciliationReport_Yes;

	@FindBy(xpath = "(//label[text()='Flag for Reconciliation Report']//following::button[@value='No'])")
	private WebElement flagforReconciliationReport_No;

	@FindBy(xpath = "(//label[text()='Flag for Reconciliation Summary']//following::button[@value='Yes'])")
	private WebElement flagforReconciliationSummary_Yes;

	@FindBy(xpath = "(//label[text()='Flag for Reconciliation Summary]//following::button[@value='No'])")
	private WebElement flagforReconciliationSummary_No;

	@FindBy(xpath = "(//label[text()='InteliClear Reports*']//following::button[@value='Yes'])")
	private WebElement inteliClearReports_Yes;

	@FindBy(xpath = "(//label[text()='InteliClear Reports*']//following::button[@value='No'])")
	private WebElement inteliClearReports_No;

	@FindBy(xpath = "(//label[text()='Generate IFA withdrawal settlement report']//following::button[@value='Yes'])")
	private WebElement generateIFAwithdrawalsettlementreport_Yes;

	@FindBy(xpath = "(//label[text()='Generate IFA withdrawal settlement report']//following::button[@value='No'])")
	private WebElement generateIFAwithdrawalsettlementreport_No;

	@FindBy(xpath = "(//label[text()='Allow 15 min Delayed Charting']//following::button[@value='Yes'])")
	private WebElement allow15minDelayedCharting_Yes;

	@FindBy(xpath = "(//label[text()='Allow 15 min Delayed Charting']//following::button[@value='No'])")
	private WebElement allow15minDelayedCharting_No;

	@FindBy(xpath = "(//label[text()='Allow 15 min Delayed Market Data']//following::button[@value='Yes'])")
	private WebElement allow15minDelayedMarketData_Yes;

	@FindBy(xpath = "(//label[text()='Allow 15 min Delayed Market Data']//following::button[@value='No'])")
	private WebElement allow15minDelayedMarketData_No;

	@FindBy(xpath = "(//label[text()='Document Code*']//following::input)[1]")
	private WebElement documentCode;

	@FindBy(xpath = "(//label[text()='Document Name*']//following::input)[1]")
	private WebElement documentName;

	@FindBy(xpath = "(//label[text()='Entry Date*']//following::input)[1]")
	private WebElement entryDate;

	@FindBy(xpath = "(//label[text()='Due Date*']//following::input)[1]")
	private WebElement dueDate;

	@FindBy(xpath = "(//label[text()='Exp Date*']//following::input)[1]")
	private WebElement expDate;

	@FindBy(xpath = "(//span[text()='Add Another Document']//parent::button")
	private WebElement addAnotherDocument;

	@FindBy(xpath = "//a[text()='Partner']")
	private WebElement partner_submenu;

	@FindBy(xpath = "//span[text()='Add New Partner']//parent::button")
	private WebElement addnewpartner;

	@FindBy(xpath = "//span[text()='Partner Information']")
	private WebElement partnerinformation;

	@FindBy(xpath = "//span[text()='Legal Risk & Compliance']")
	private WebElement Legalrisk;

	@FindBy(xpath = "//span[text()='Products & Services']")
	private WebElement Productinfo;

	@FindBy(xpath = "//span[text()='Create Partner']")
	private WebElement createpartner;

	@FindBy(xpath = "//span[text()='Next']")
	private WebElement Nextbutton;

	@FindBy(xpath = "(//span[text()='Funding'])")
	private WebElement FundingTab;

	@FindBy(xpath = "(//span[text()='Settlement, Accounting & Statements'])")
	private WebElement SettlemenTAccountingStatementsTab;

	@FindBy(xpath = "(//span[text()='Office & Sub-Office'])")
	private WebElement OfficeSubOfficeTab;

	@FindBy(xpath = "(//span[text()='Reports & Documents'])")
	private WebElement ReportsDocumentsTab;

	@FindBy(xpath = "(//label[text()='Instrument WhiteList*']//following::input)[1]")
	private WebElement instrumentWhiteList;

	@FindBy(xpath = "(//label[text()='Beneficiary Routing Number*']//following::input)[1]")
	private WebElement beneficiaryRountingNumber;

	@FindBy(xpath = "(//label[text()='Margin Default*']//following::input)[1]")
	private WebElement margin_Default;

	@FindBy(xpath = "(//label[text()='Instrument List Type*']//following::input)[1]")
	private WebElement InstrumentListType;

	@FindBy(xpath = "(//label[text()='Purpose*']//following::input)[1]")
	private WebElement purpose;
	
	@FindBy(xpath = "((//label[text()='Purpose'])[2]//following::input)[1]")
	private WebElement purpose2;

	@FindBy(xpath = "(//label[text()='Remarks']//following::textarea)[1]")
	private WebElement remarks;

	@FindBy(xpath = "//input[@type='file']")
	private WebElement reportdocument;
	
	@FindBy(xpath = "(//input[@type='file'])[1]")
	private WebElement officedocument;

	@FindBy(xpath = "//button[@tabindex='0']//span[text()='Save']")
	private WebElement partnerSave;

	@FindBy(xpath = "//*[contains(text(),'has been saved successfully!')]")
	private WebElement CreatedMessage;

	@FindBy(xpath = "//input[@id='filter_partnerName']")
	private WebElement filter_partnerName;

	@FindBy(xpath = "//input[@id='filter_wlpId']")
	private WebElement filter_wlpId;

	@FindBy(xpath = "//span[text()='Search']")
	private WebElement filterSearchButton;

	@FindBy(xpath = "//div[@class='filter-section']//i[@class='close-icon']")
	private WebElement filtercloseButton;

	@FindBy(xpath = "//td[@id='row-0-cell-1']")
	private WebElement partnernamehyperlink;

	@FindBy(xpath = "//tbody/tr[1]")
	private WebElement tableFirstRow;
	
	@FindBy(xpath = "//tbody/tr[2]")
	private WebElement tableSecondRow;

	@FindBy(xpath = "(//tbody/tr[1]//td)[3]")
	private WebElement partnercolumn;

	@FindBy(xpath = "//span[text()='Edit']//parent::button")
	private WebElement editicon;

	@FindBy(xpath = "//span[text()='Delete']")
	private WebElement delete;

	@FindBy(xpath = "//button[@tabindex='-1']//span[text()='Save']")
	private WebElement disablesavebutton;
	
	@FindBy(xpath = "//input[@id='outlined-basic']")
	private WebElement universalsearch;	

	@FindBy(xpath = "//i[@class='search-icon']")
	private WebElement searchicon;
	
	public static String WlPID;
	public static String partnerName,Sub_Office;

	public NewPartnerScreen() {
		this.driver = Threadmanager.getdriver();
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
	}

	public void Update_partner() throws Exception {
		BaseLibrary.waitforelement(partnercolumn);
		BaseLibrary.clickelement(partnercolumn);
		BaseLibrary.waitforelement(editicon);
		BaseLibrary.clickelement(editicon);
		enterAddressLine1("Address Updated");
	}

	public void enterPartnerType(String partnertype) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(PartnerType, partnertype, 1);
	}

	public void enterKYCMode(String kycmode) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(KYCMode, kycmode, 1);
	}

	public void enterPartnerWebsite(String partnerwebsite) throws Exception {
		BaseLibrary.typetext(PartnerWebsite, partnerwebsite);
	}

	public void enterBusinessEntity(String businessentity) throws Exception {
		BaseLibrary.typetext(BusinessEntity, businessentity);
	}

	public void enterAddressType(String addresstype) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(AddressType, addresstype, 1);
	}

	public void enterAddressLine1(String addressline1) throws Exception {
		BaseLibrary.textclear(AddressLine1);
		BaseLibrary.typetext(AddressLine1, addressline1);
	}

	public void enterAddressLine2(String addressline2) throws Exception {
		BaseLibrary.typetext(AddressLine2, addressline2);
	}

	public void enterCity(String city) throws Exception {
		BaseLibrary.typetext(City, city);
	}

	public void enterState(String state) throws Exception {
		BaseLibrary.typetext(State, state);
	}

	public void enterPartnerinfo_Country(String country) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(Partnerinfo_Country, country, 1);
	}

	public void enterZipcode(String zipcode) throws Exception {
		BaseLibrary.typetext(Zipcode, zipcode);
	}

	public void enterEmail(String email) throws Exception {
		BaseLibrary.typetext(Email, email);
	}

	public void enterAlternativeEmail(String alternativeemail) throws Exception {
		BaseLibrary.typetext(AlternativeEmail, alternativeemail);
	}

	public void enterPhone(String phone) throws Exception {
		BaseLibrary.typetext(Phone, phone);
	}

	public void enterphonecountrycode(String phonecode) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(phonecountrycode, phonecode,1);
	}

	public void enterContactPhoneWorkphonecountrycode(String phonecode) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(entercontactchoneworkphonecountrycode, phonecode,1);
	}

	public void enterContactPhoneMobilecountrycode(String phonecode) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(entercontactphonemobilecountrycode, phonecode,1);
	}


	public void enterIRSContactPhonecountrycode(String phonecode) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(enterirscontactphonecountrycode, phonecode,1);
	}




	public void enterProspectus(String prospectus) throws Exception {
		BaseLibrary.typetext(Prospectus, prospectus);
	}

	public void enterIndustry(String industry) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(Industry, industry, 1);
	}

	public void enterStockTicker(String stockticker) throws Exception {
		BaseLibrary.typetext(StockTicker, stockticker);
	}

	public void enterCoolDownPeriod(String cooldownperiod) throws Exception {
		BaseLibrary.typetext(CoolDownPeriod, cooldownperiod);
	}

	public void enterFPSLEnrolled(String fpslenrolled) throws Exception {
		BaseLibrary.typetext(FPSLEnrolled, fpslenrolled);
	}

	public void enterOTCMarketPeriod(String otcmarketperiod) throws Exception {
		BaseLibrary.typetext(OTCMarketPeriod, otcmarketperiod);
	}

	public void enterOmnibusAccountID(String omnibusaccountid) throws Exception {
		BaseLibrary.typetext(OmnibusAccountID, omnibusaccountid);
	}

	public void enterSubscriptionDefaultTrialPeriodDays(String subscriptiondefaulttrialperioddays) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(SubscriptionDefaultTrialPeriodDays, subscriptiondefaulttrialperioddays,
				1);
	}

	public void enterBusinessStructureType(String businessstructuretype) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(BusinessStructureType, businessstructuretype, 1);
	}

	public void enterUSABranch(String usabranch) throws Exception {
		BaseLibrary.typetext(USABranch, usabranch);
	}

	public void enterForeignBank(String foreignbank) throws Exception {
		BaseLibrary.typetext(ForeignBank, foreignbank);
	}

	public void enterForeignFinancialInstitution(String foreignfinancialinstitution) throws Exception {
		BaseLibrary.typetext(ForeignFinancialInstitution, foreignfinancialinstitution);
	}

	public void enterDirectorCount(String directorcount) throws Exception {
		BaseLibrary.typetext(DirectorCount, directorcount);
	}

	public void enterMPID(String mpid) throws Exception {
		BaseLibrary.typetext(MPID, mpid);
	}

	public void enterFinraNum(String finranum) throws Exception {
		BaseLibrary.typetext(FinraNum, finranum);
	}

	public void enterSECRegNum(String secregnum) throws Exception {
		BaseLibrary.typetext(SECRegNum, secregnum);
	}

	public void enterPArtnerinfo_Status(String status) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(Partnerinfo_Status, status, 1);
	}

	public void enterSPLAlloyLogic(String splalloylogic) throws Exception {
		BaseLibrary.typetext(SPLAlloyLogic, splalloylogic);
	}

	public void enterKYCDocRequired(String kycdocrequired) throws Exception {
		BaseLibrary.typetext(KYCDocRequired, kycdocrequired);
	}

	public void enterPartScyLendingPgm(String partscylendingpgm) throws Exception {
		BaseLibrary.typetext(PartScyLendingPgm, partscylendingpgm);
	}

	public void enterCPTradingLimit(String cptradinglimit) throws Exception {
		BaseLibrary.typetext(CPTradingLimit, cptradinglimit);
	}

	public void enterCPFundingLimit(String cpfundinglimit) throws Exception {
		BaseLibrary.typetext(CPFundingLimit, cpfundinglimit);
	}

	public void enterLineOfCredit(String lineofcredit) throws Exception {
		BaseLibrary.typetext(LineOfCredit, lineofcredit);
	}

	public void enterInitialClearingDeposit(String initialclearingdeposit) throws Exception {
		BaseLibrary.typetext(InitialClearingDeposit, initialclearingdeposit);
	}

	public void enterRateCard(String ratecard) throws Exception {
		BaseLibrary.typetext(RateCard, ratecard);
	}

	public void enterLegal_Country(String country) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(LegalRisk_Country, country, 1);
	}

	public void enterLegal_Status(String status) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(LegalRisk_Status, status, 1);
	}

	public void enterJurisdictionList(String jurisdictionlist) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(JurisdictionList, jurisdictionlist, 1);
	}

	public void enterRegistrationType(String registrationtype) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(RegistrationType, registrationtype, 1);
	}

	public void enterRegulatoryLicenceNo(String regulatorylicenceno) throws Exception {
		BaseLibrary.typetext(RegulatoryLicenceNo, regulatorylicenceno);
	}

	public void enterRegistrationDate(String registrationdate) throws Exception {
		BaseLibrary.typetext(RegistrationDate, registrationdate);
	}

	public void enterProductID(String productid) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(ProductID, productid, 1);
	}

	public void enterCommissionDescription(String commissiondescription) throws Exception {
		BaseLibrary.typetext(CommissionDescription, commissiondescription);
	}

	public void enterCommissionGroupDescription(String commissiongroupdescription) throws Exception {
		BaseLibrary.typetext(CommissionGroupDescription, commissiongroupdescription);
	}

	public void enterCommissionDetails(String commissiondetails) throws Exception {
		BaseLibrary.typetext(CommissionDetails, commissiondetails);
	}

	public void enterFractionalDetails(String fractionaldetails) throws Exception {
		BaseLibrary.typetext(FractionalDetails, fractionaldetails);
	}

	public void enterProduct_Country(String country) throws Exception {
		BaseLibrary.typetext(Product_Country, country);
	}

	public void enterAccountManagementType(String accountmanagementtype) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(AccountManagementType, accountmanagementtype, 1);
	}

	public void enterProduct_Status(String status) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(Product_Status, status, 1);
	}

	public void enterDefaultInd(String defaultind) throws Exception {
		BaseLibrary.typetext(DefaultInd, defaultind);
	}

	public void enterSubscription(String subscription) throws Exception {
		BaseLibrary.typetext(Subscription, subscription);
	}

	public void enterBasketDetails(String basketdetails) throws Exception {
		BaseLibrary.typetext(BasketDetails, basketdetails);
	}

	public void enterBasketSchedule(String basketschedule) throws Exception {
		BaseLibrary.typetext(BasketSchedule, basketschedule);
	}

	public void enterManagedAccountDetails(String managedaccountdetails) throws Exception {
		BaseLibrary.typetext(ManagedAccountDetails, managedaccountdetails);
	}

	public void enterOTCcommissionDetail(String otccommissiondetail) throws Exception {
		BaseLibrary.typetext(OTCcommissionDetail, otccommissiondetail);
	}

	public void enterPassThroughFees(String passthroughfees) throws Exception {
		BaseLibrary.typetext(PassThroughFees, passthroughfees);
	}

	public void enterInstrumentListType(String instrumentlisttype) throws Exception {
		BaseLibrary.typetext(InstrumentListType, instrumentlisttype);
	}

	public void enterDescription(String description) throws Exception {
		BaseLibrary.typetext(Description, description);
	}

	public void enterProductInst_Status(String status) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(ProductInstStatus, status, 1);
	}

	public void enterFundingType(String FundingType) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(fundingType, FundingType, 1);
	}

	public void enterPaymentID(String PaymentID) throws Exception {
		BaseLibrary.typetext(paymentID, PaymentID);
	}

	public void entercategory(String Category) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(category, Category, 1);
	}

	public void enterCurrencyCode(String CurrencyCode) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(currencyCode, CurrencyCode, 1);
	}

	public void enterStatus(String Status) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(status, Status, 1);
	}

	public void enterPaymentRail(String PaymentRail) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(paymentRail, PaymentRail, 1);
	}

	public void enterLICPartnerHandleFunds(String LICPartnerHandleFunds) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(lICPartnerHandleFunds, LICPartnerHandleFunds, 1);
	}

	public void enterCashManagementElection(String CashManagementElection) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(cashManagementElection, CashManagementElection, 1);
	}

	public void enterBeneficiaryName(String BeneficiaryName) throws Exception {
		BaseLibrary.typetext(beneficiaryName, BeneficiaryName);
	}

	public void enterbeneficiaryAccountNo(String BeneficiaryAccountNo) throws Exception {
		BaseLibrary.typetext(beneficiaryAccountNo, BeneficiaryAccountNo);
	}

	public void enterbeneficiaryAccountType(String BeneficiaryAccountType) throws Exception {
		BaseLibrary.typetext(beneficiaryAccountType, BeneficiaryAccountType);
	}

	public void enterBeneficiaryRountingNumber(String BeneficiaryRountingNumber) throws Exception {
		BaseLibrary.typetext(beneficiaryRountingNumber, BeneficiaryRountingNumber);
	}

	public void enterBeneficiaryBankName(String BeneficiaryBankName) throws Exception {
		BaseLibrary.typetext(beneficiaryBankName, BeneficiaryBankName);
	}

	public void enterFundingAddressLine1(String Addressline1) throws Exception {
		BaseLibrary.typetext(addressLine1, Addressline1);
	}

	public void enterFundingAddressLine2(String Addressline2) throws Exception {
		BaseLibrary.typetext(addressLine2, Addressline2);
	}

	public void enterFundingAddressLine3(String Addressline3) throws Exception {
		BaseLibrary.typetext(addressLine3, Addressline3);
	}

	public void enterCountry(String Country) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(country, Country, 1);
	}

	public void enterFundingState(String State) throws Exception {
		BaseLibrary.typetext(state, State);
	}

	public void entercity(String City) throws Exception {
		BaseLibrary.typetext(city, City);
	}

	public void enterFundingZipcode(String ZipCode) throws Exception {
		BaseLibrary.typetext(zipcode, ZipCode);
	}

	public void enterFundingPhone(String Phone) throws Exception {
		BaseLibrary.typetext(phone, Phone);
	}

	public void enterFundingEmail(String Email) throws Exception {
		BaseLibrary.typetext(email, Email);
	}

	public void enterFundingAlternativeEmail(String AlternativeEmail) throws Exception {
		BaseLibrary.typetext(alternativeEmail, AlternativeEmail);
	}

	public void enterIntermediarySWIFT(String IntermediarySWIFT) throws Exception {
		BaseLibrary.typetext(intermediarySWIFT, IntermediarySWIFT);
	}

	public void enterIntermediaryBankName(String IntermediaryBankName) throws Exception {
		BaseLibrary.typetext(intermediaryBankName, IntermediaryBankName);
	}

	public void enterIntermediaryBankCountry(String IntermediaryBankCountry) throws Exception {
		BaseLibrary.typetext(intermediaryBankCountry, IntermediaryBankCountry);
	}

	public void enterEscrowAccountID(String EscrowAccountID) throws Exception {
		BaseLibrary.typetext(escrowAccountID, EscrowAccountID);
	}

	public void enterEscrowAccountNo(String EscrowAccountNo) throws Exception {
		BaseLibrary.typetext(escrowAccountNo, EscrowAccountNo);
	}

	public void enterIFAAccountID(String IFAAccountID) throws Exception {
		BaseLibrary.typetext(iFAAccountID, IFAAccountID);
	}

	public void enterIFAAccountNo(String IFAAccountNo) throws Exception {
		BaseLibrary.typetext(iFAAccountNo, IFAAccountNo);
	}

	public void enterHouseAccountID(String HouseAccountID) throws Exception {
		BaseLibrary.typetext(houseAccountID, HouseAccountID);
	}

	public void enterHouseAccountNO(String HouseAccountNO) throws Exception {
		BaseLibrary.typetext(houseAccountNO, HouseAccountNO);
	}

	public void enterSuspenseAccountID(String SuspenseAccountID) throws Exception {
		BaseLibrary.typetext(suspenseAccountID, SuspenseAccountID);
	}

	public void enterSuspenseAccountNO(String SuspenseAccountNO) throws Exception {
		BaseLibrary.typetext(suspenseAccountNO, SuspenseAccountNO);
	}

	public void enterPrefix(String Prefix) throws Exception {
		BaseLibrary.typetext(prefix, Prefix);
	}

	public void enterLanguage(String Language) throws Exception {
		BaseLibrary.typetext(language, Language);
	}

	public void enterClearingCode(String ClearingCode) throws Exception {
		BaseLibrary.typetext(clearingCode, ClearingCode);
	}

	public void enterCompanyName(String CompanyName) throws Exception {
		BaseLibrary.typetext(companyName, CompanyName);
	}

	public void enterFinancing_Spread_Tier_3(String Financing_Spread_Tier_3) throws Exception {
		BaseLibrary.typetext(financing_Spread_Tier_3, Financing_Spread_Tier_3);
	}

	public void enterRegulatorID(String RegulatorID) throws Exception {
		BaseLibrary.typetext(regulator_ID, RegulatorID);
	}

	public void enterCountryID(String CountryID) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(country_ID, CountryID, 1);
	}

	public void enterMarginDefault(String MarginDefault) throws Exception {
		BaseLibrary.typetext(margin_Default, MarginDefault);
	}

	public void enterPrefixPractice(String PrefixPractice) throws Exception {
		BaseLibrary.typetext(prefix_Practice, PrefixPractice);
	}

	public void enterWLPHash(String WLPHash) throws Exception {
		BaseLibrary.typetext(wLPHash, WLPHash);
	}

	public void enterCurrencies(String currencies) throws Exception {
		BaseLibrary.typetext(Currencies, currencies);
	}

	public void enterMarginMin(String marginMin) throws Exception {
		BaseLibrary.typetext(MarginMin, marginMin);
	}

	public void enterRiskownedbyID(String RiskownedbyID) throws Exception {
		BaseLibrary.typetext(riskownedbyID, RiskownedbyID);
	}

	public void enterContactPhoneWork(String ContactPhoneWork) throws Exception {
		BaseLibrary.typetext(contactPhoneWork, ContactPhoneWork);
	}

	public void enterContactPhoneMobile(String ContactPhoneMobile) throws Exception {
		BaseLibrary.typetext(contactPhoneMobile, ContactPhoneMobile);
	}

	public void enterContraSubAccount(String ContraSubAccount) throws Exception {
		BaseLibrary.typetext(contraSubAccount, ContraSubAccount);
	}

	public void enterAllowedCountryList(String AllowedCountryList) throws Exception {
		BaseLibrary.typetext(allowedCountryList, AllowedCountryList);
	}

	public void enterDefaultWatchList(String DefaultWatchList) throws Exception {
		BaseLibrary.typetext(defaultWatchList, DefaultWatchList);
	}

	public void enterDefaultFavorites(String DefaultFavorites) throws Exception {
		BaseLibrary.typetext(defaultFavorites, DefaultFavorites);
	}

	public void enterDefaultRecentInstruments(String DefaultRecentInstruments) throws Exception {
		BaseLibrary.typetext(defaultRecentInstruments, DefaultRecentInstruments);
	}

	public void enterTaxID(String TaxID) throws Exception {
		BaseLibrary.typetext(taxID, TaxID);
	}

	public void enterIRSTXMControl(String IRSTXMControl) throws Exception {
		BaseLibrary.typetext(iRSTXMControl, IRSTXMControl);
	}

	public void enterIRSTaxContactTitle(String IRSTaxContactTitle) throws Exception {
		BaseLibrary.typetext(iRSTaxContactTitle, IRSTaxContactTitle);
	}

	public void enterIRSContactPhone(String IRSContactPhone) throws Exception {
		BaseLibrary.typetext(iRSContactPhone, IRSContactPhone);
	}

	public void enterIRSContactName(String IRSContactName) throws Exception {
		BaseLibrary.typetext(iRSContactName, IRSContactName);
	}

	public void enterFooter(String Footer) throws Exception {
		BaseLibrary.typetext(footer, Footer);
	}

	public void enterDisclaimer(String Disclaimer) throws Exception {
		BaseLibrary.typetext(disclaimer, Disclaimer);
	}

	public void enterFooter_two(String Footer_two) throws Exception {
		BaseLibrary.typetext(footer_two, Footer_two);
	}

	public void enterDisclaimer_two(String Disclaimer_two) throws Exception {
		BaseLibrary.typetext(disclaimer_two, Disclaimer_two);
	}

	public void enterOfficeName(String OfficeName) throws Exception {
		BaseLibrary.typetext(officeName, OfficeName);
	}

	public void enterOfficeCode(String OfficeCode) throws Exception {
		BaseLibrary.typetext(officeCode, OfficeCode);
	}

	public void enterOfficeDescription(String Description) throws Exception {
		BaseLibrary.typetext(description, Description);
	}

	public void enterSubOfficeName(String SubOfficeName) throws Exception {
		BaseLibrary.typetext(subOfficeName, SubOfficeName);
		Sub_Office=SubOfficeName;
	}

	public void enterCode(String Code) throws Exception {
		BaseLibrary.typetext(code, Code);
	}
	

	public void enterSubOfficeName2(String SubOfficeName) throws Exception {
		BaseLibrary.typetext(subOfficeName2, SubOfficeName);
	}

	public void enterCode2(String Code) throws Exception {
		BaseLibrary.typetext(code2, Code);
	}

	public void enterPurpose(String Purpose) throws Exception {
		BaseLibrary.typetext(purpose, Purpose);
	}
	
	public void enterPurpose2(String Purpose) throws Exception {
		BaseLibrary.typetext(purpose2, Purpose);
	}

	public void enterDocumentCode(String DocumentCode) throws Exception {
		BaseLibrary.typetext(documentCode, DocumentCode);
	}

	public void enterDocumentName(String DocumentName) throws Exception {
		BaseLibrary.typetext(documentName, DocumentName);
	}

	public void enterEntryDate(String EntryDate) throws Exception {
		BaseLibrary.typetext(entryDate, EntryDate);
	}

	public void enterDueDate(String DueDate) throws Exception {
		BaseLibrary.typetext(dueDate, DueDate);
	}

	public void enterExpDate(String ExpDate) throws Exception {
		BaseLibrary.typetext(expDate, ExpDate);
	}

	public void enterRemarks(String Remarks) throws Exception {
		BaseLibrary.typetext(remarks, Remarks);
	}

	public void enterInstrumentWhiteList(String InstrumentWhiteList) throws Exception {
		BaseLibrary.typetext(instrumentWhiteList, InstrumentWhiteList);
	}

	public void clickpartnersubmenu() throws Exception {
		BaseLibrary.waitforelement(partner_submenu);
		BaseLibrary.clickelement(partner_submenu);
		BaseLibrary.waitforelement(addnewpartner);
	}

	public void clicknext() throws Exception {
		BaseLibrary.waitforelement(Nextbutton);
		BaseLibrary.clickelement(Nextbutton);
	}

	public void reportfileupload() throws Exception {
		BaseLibrary.fileupload(reportdocument,
				System.getProperty("user.dir") + "/src/test/resources/TestData/sample.pdf");
	}
	
	public void officefileupload() throws Exception {
		BaseLibrary.fileupload(officedocument,
				System.getProperty("user.dir") + "/src/test/resources/TestData/sample.pdf");
	}

	public void clickaddnewpartner(String Entityname) throws Exception {
		BaseLibrary.clickelement(addnewpartner);
		Thread.sleep(1000);
		BaseLibrary.waitforelement(selectentity);
		BaseLibrary.dropdownselectionwithkeys(selectentity, Entityname, 1);
		Thread.sleep(1000);
		BaseLibrary.clickelement(createpartner);
		BaseLibrary.waitforelement(partnerinformation);

	}

	public void clicksavebutton() throws Exception {
		BaseLibrary.waitforelement(partnerSave);
		BaseLibrary.clickelement(partnerSave);
	}
	
	public void checksavebutton() throws Exception {
		BaseLibrary.waitforelement(disablesavebutton);
	}

	public void creationmessage() throws Exception {
		BaseLibrary.waitforelement(CreatedMessage);
	}

	public void feedvailddatatoallpartnerinformationfields() throws Exception {
		enterPartnerName(BaseLibrary.getdatabasedonsheet("Partner", 4, 1));
		enterPartnerType(BaseLibrary.getdatabasedonsheet("Partner", 5, 1));
		enterKYCMode(BaseLibrary.getdatabasedonsheet("Partner", 6, 1));
		enterPartnerWebsite(BaseLibrary.getdatabasedonsheet("Partner", 7, 1));
		enterWLPId(BaseLibrary.getdatabasedonsheet("Partner", 113, 1));
		enterAddressType(BaseLibrary.getdatabasedonsheet("Partner", 9, 1));
		enterAddressLine1(BaseLibrary.getdatabasedonsheet("Partner", 10, 1));
		enterAddressLine2(BaseLibrary.getdatabasedonsheet("Partner", 11, 1));
		enterCity(BaseLibrary.getdatabasedonsheet("Partner", 12, 1));
		enterState(BaseLibrary.getdatabasedonsheet("Partner", 13, 1));
		enterCountry(BaseLibrary.getdatabasedonsheet("Partner", 14, 1));
		enterZipcode(BaseLibrary.getdatabasedonsheet("Partner", 15, 1));
		enterEmail(BaseLibrary.getdatabasedonsheet("Partner", 16, 1));
		enterAlternativeEmail(BaseLibrary.getdatabasedonsheet("Partner", 17, 1));
		enterPhone(BaseLibrary.getdatabasedonsheet("Partner", 18, 1));
		enterProspectus(BaseLibrary.getdatabasedonsheet("Partner", 19, 1));
		enterIndustry(BaseLibrary.getdatabasedonsheet("Partner", 20, 1));
		enterStockTicker(BaseLibrary.getdatabasedonsheet("Partner", 21, 1));
		enterCoolDownPeriod(BaseLibrary.getdatabasedonsheet("Partner", 22, 1));
		enterOTCMarketPeriod(BaseLibrary.getdatabasedonsheet("Partner", 24, 1));
		enterOmnibusAccountID(BaseLibrary.getdatabasedonsheet("Partner", 25, 1));
		enterSubscriptionDefaultTrialPeriodDays(BaseLibrary.getdatabasedonsheet("Partner", 26, 1));
		enterBusinessStructureType(BaseLibrary.getdatabasedonsheet("Partner", 27, 1));
		enterDirectorCount(BaseLibrary.getdatabasedonsheet("Partner", 31, 1));
		enterMPID(BaseLibrary.getdatabasedonsheet("Partner", 32, 1));
		enterFinraNum(BaseLibrary.getdatabasedonsheet("Partner", 33, 1));
		enterSECRegNum(BaseLibrary.getdatabasedonsheet("Partner", 34, 1));
		enterStatus(BaseLibrary.getdatabasedonsheet("Partner", 35, 1));

	}

	public void feedvailddatatoalllegalriskfields(String regtype) throws Exception {
		BaseLibrary.waitforelement(Legalrisk);
		BaseLibrary.clickelement(Legalrisk);
		BaseLibrary.waitforelement(CPTradingLimit);
		enterCPTradingLimit(BaseLibrary.getdatabasedonsheet("Partner", 40, 1));
		enterCPFundingLimit(BaseLibrary.getdatabasedonsheet("Partner", 41, 1));
		enterLineOfCredit(BaseLibrary.getdatabasedonsheet("Partner", 42, 1));
		enterInitialClearingDeposit(BaseLibrary.getdatabasedonsheet("Partner", 43, 1));
		enterRateCard(BaseLibrary.getdatabasedonsheet("Partner", 44, 1));
		enterCountry(BaseLibrary.getdatabasedonsheet("Partner", 45, 1));
		enterStatus(BaseLibrary.getdatabasedonsheet("Partner", 46, 1));
		enterJurisdictionList(BaseLibrary.getdatabasedonsheet("Partner", 47, 1));
		enterRegistrationType(regtype);
		enterRegulatoryLicenceNo(BaseLibrary.getdatabasedonsheet("Partner", 49, 1));
		enterRegistrationDate(BaseLibrary.getdatabasedonsheet("Partner", 50, 1));
	}

	public void feedvailddatatoallProductinfofields(String prodid) throws Exception {
		BaseLibrary.waitforelement(Productinfo);
		BaseLibrary.clickelement(Productinfo);
		BaseLibrary.waitforelement(ProductID);
		enterProductID(prodid);
//		enterCommissionDescription(BaseLibrary.getdatabasedonsheet("Partner", 53, 1));
//		enterCommissionGroupDescription(BaseLibrary.getdatabasedonsheet("Partner", 54, 1));
//		enterCommissionDetails(BaseLibrary.getdatabasedonsheet("Partner", 55, 1));
//		enterFractionalDetails(BaseLibrary.getdatabasedonsheet("Partner", 56, 1));
//		enterCountry(BaseLibrary.getdatabasedonsheet("Partner", 15, 1)); 
//		enterAccountManagementType(BaseLibrary.getdatabasedonsheet("Partner", 57, 1));
//		enterStatus(BaseLibrary.getdatabasedonsheet("Partner", 35, 1)); 
//		enterDefaultInd(BaseLibrary.getdatabasedonsheet("Partner", 58, 1));
//		enterSubscription(BaseLibrary.getdatabasedonsheet("Partner", 59, 1));
//		enterBasketDetails(BaseLibrary.getdatabasedonsheet("Partner", 60, 1));
//		enterBasketSchedule(BaseLibrary.getdatabasedonsheet("Partner", 61, 1));
//		enterManagedAccountDetails(BaseLibrary.getdatabasedonsheet("Partner", 62, 1));
//		enterOTCcommissionDetail(BaseLibrary.getdatabasedonsheet("Partner", 63, 1));
//		enterPassThroughFees(BaseLibrary.getdatabasedonsheet("Partner", 64, 1));
//		enterInstrumentListType(BaseLibrary.getdatabasedonsheet("Partner", 64, 1));
//		enterDescription(BaseLibrary.getdatabasedonsheet("Partner", 65, 1));
//		enterStatus(BaseLibrary.getdatabasedonsheet("Partner", 35, 1));

	}

	public void feedvailddatatoallfundingfields() throws Exception {
		BaseLibrary.waitforelement(FundingTab);
		BaseLibrary.clickelement(FundingTab);
		BaseLibrary.waitforelement(fundingType);
		enterFundingType(BaseLibrary.getdatabasedonsheet("Partner", 68, 1));
		enterPaymentID(BaseLibrary.getdatabasedonsheet("Partner", 69, 1));
		entercategory(BaseLibrary.getdatabasedonsheet("Partner", 70, 1));
		enterCurrencyCode(BaseLibrary.getdatabasedonsheet("Partner", 71, 1));
		enterStatus(BaseLibrary.getdatabasedonsheet("Partner", 72, 1));
		enterPaymentRail(BaseLibrary.getdatabasedonsheet("Partner", 73, 1));
		enterLICPartnerHandleFunds(BaseLibrary.getdatabasedonsheet("Partner", 75, 1));
		enterCashManagementElection(BaseLibrary.getdatabasedonsheet("Partner", 76, 1));
		enterBeneficiaryName(BaseLibrary.getdatabasedonsheet("Partner", 77, 1));
		enterbeneficiaryAccountNo(BaseLibrary.getdatabasedonsheet("Partner", 78, 1));
		enterbeneficiaryAccountType(BaseLibrary.getdatabasedonsheet("Partner", 79, 1));
		enterBeneficiaryRountingNumber(BaseLibrary.getdatabasedonsheet("Partner", 80, 1));
		enterBeneficiaryBankName(BaseLibrary.getdatabasedonsheet("Partner", 81, 1));
		enterAddressLine1(BaseLibrary.getdatabasedonsheet("Partner", 82, 1));
		enterAddressLine2(BaseLibrary.getdatabasedonsheet("Partner", 83, 1));
		enterCountry(BaseLibrary.getdatabasedonsheet("Partner", 84, 1));
		enterState(BaseLibrary.getdatabasedonsheet("Partner", 85, 1));
		entercity(BaseLibrary.getdatabasedonsheet("Partner", 86, 1));
		enterZipcode(BaseLibrary.getdatabasedonsheet("Partner", 87, 1));
		enterPhone(BaseLibrary.getdatabasedonsheet("Partner", 88, 1));
		enterEmail(BaseLibrary.getdatabasedonsheet("Partner", 89, 1));
		enterAlternativeEmail(BaseLibrary.getdatabasedonsheet("Partner", 90, 1));
		Actions actions = new Actions(driver);
		actions.moveToElement(intermediarySWIFT).perform();
		enterIntermediarySWIFT(BaseLibrary.getdatabasedonsheet("Partner", 91, 1));
		enterIntermediaryBankName(BaseLibrary.getdatabasedonsheet("Partner", 92, 1));
		enterIntermediaryBankCountry(BaseLibrary.getdatabasedonsheet("Partner", 93, 1));
		actions.moveToElement(escrowAccountID).perform();
		enterEscrowAccountID(BaseLibrary.getdatabasedonsheet("Partner", 94, 1));
		enterEscrowAccountNo(BaseLibrary.getdatabasedonsheet("Partner", 95, 1));
		actions.moveToElement(iFAAccountNo).perform();
		enterIFAAccountID(BaseLibrary.getdatabasedonsheet("Partner", 96, 1));
		enterIFAAccountNo(BaseLibrary.getdatabasedonsheet("Partner", 97, 1));
		enterHouseAccountNO(BaseLibrary.getdatabasedonsheet("Partner", 98, 1));
		enterHouseAccountID(BaseLibrary.getdatabasedonsheet("Partner", 99, 1));
		actions.moveToElement(suspenseAccountID).perform();
		enterSuspenseAccountID(BaseLibrary.getdatabasedonsheet("Partner", 100, 1));
		enterSuspenseAccountNO(BaseLibrary.getdatabasedonsheet("Partner", 101, 1));
	}

	public void feedvailddatatoallsettlementfields() throws Exception {
		BaseLibrary.waitforelement(SettlemenTAccountingStatementsTab);
		BaseLibrary.clickelement(SettlemenTAccountingStatementsTab);
		BaseLibrary.waitforelement(prefix);
		enterPrefix(BaseLibrary.getdatabasedonsheet("Partner", 103, 1));
		enterLanguage(BaseLibrary.getdatabasedonsheet("Partner", 104, 1));
		enterClearingCode(BaseLibrary.getdatabasedonsheet("Partner", 105, 1));
		enterCompanyName(BaseLibrary.getdatabasedonsheet("Partner", 106, 1));
		enterFinancing_Spread_Tier_3(BaseLibrary.getdatabasedonsheet("Partner", 107, 1));
		enterRegulatorID(BaseLibrary.getdatabasedonsheet("Partner", 108, 1));
		enterCountryID(BaseLibrary.getdatabasedonsheet("Partner", 110, 1));
		enterMarginDefault(BaseLibrary.getdatabasedonsheet("Partner", 111, 1));
		enterPrefixPractice(BaseLibrary.getdatabasedonsheet("Partner", 112, 1));
		// enterWLPId(BaseLibrary.getdatabasedonsheet("Partner", 113, 1));
		enterWLPHash(BaseLibrary.getdatabasedonsheet("Partner", 114, 1));
		enterCurrencies(BaseLibrary.getdatabasedonsheet("Partner", 115, 1));
		enterMarginMin(BaseLibrary.getdatabasedonsheet("Partner", 116, 1));
		enterRiskownedbyID(BaseLibrary.getdatabasedonsheet("Partner", 117, 1));
		enterContactPhoneWork(BaseLibrary.getdatabasedonsheet("Partner", 118, 1));
		enterContactPhoneMobile(BaseLibrary.getdatabasedonsheet("Partner", 119, 1));
		enterContraSubAccount(BaseLibrary.getdatabasedonsheet("Partner", 120, 1));
		enterAllowedCountryList(BaseLibrary.getdatabasedonsheet("Partner", 121, 1));
		enterDefaultWatchList(BaseLibrary.getdatabasedonsheet("Partner", 122, 1));
		enterInstrumentWhiteList(BaseLibrary.getdatabasedonsheet("Partner", 123, 1));
		enterDefaultFavorites(BaseLibrary.getdatabasedonsheet("Partner", 124, 1));
		enterDefaultRecentInstruments(BaseLibrary.getdatabasedonsheet("Partner", 125, 1));
		enterTaxID(BaseLibrary.getdatabasedonsheet("Partner", 126, 1));
		enterIRSTXMControl(BaseLibrary.getdatabasedonsheet("Partner", 127, 1));
		enterIRSContactName(BaseLibrary.getdatabasedonsheet("Partner", 128, 1));
		enterIRSTaxContactTitle(BaseLibrary.getdatabasedonsheet("Partner", 129, 1));
		enterIRSContactPhone(BaseLibrary.getdatabasedonsheet("Partner", 130, 1));
		Actions actions = new Actions(driver);
		actions.moveToElement(footer_two).perform();
		enterFooter(BaseLibrary.getdatabasedonsheet("Partner", 131, 1));
		enterDisclaimer(BaseLibrary.getdatabasedonsheet("Partner", 132, 1));
		enterFooter_two(BaseLibrary.getdatabasedonsheet("Partner", 133, 1));
		enterDisclaimer_two(BaseLibrary.getdatabasedonsheet("Partner", 134, 1));
//		File upload yet to add
	}

	public void feedvailddatatoallofficefields() throws Exception {
		BaseLibrary.waitforelement(OfficeSubOfficeTab);
		BaseLibrary.clickelement(OfficeSubOfficeTab);
		BaseLibrary.waitforelement(officeName);
		enterOfficeName(BaseLibrary.getdatabasedonsheet("Partner", 136, 1));
		enterOfficeCode(BaseLibrary.getdatabasedonsheet("Partner", 137, 1));
		enterDescription(BaseLibrary.getdatabasedonsheet("Partner", 138, 1));
		enterFundingAddressLine1(BaseLibrary.getdatabasedonsheet("Partner", 139, 1));
		enterFundingAddressLine2(BaseLibrary.getdatabasedonsheet("Partner", 140, 1));
		enterFundingAddressLine3(BaseLibrary.getdatabasedonsheet("Partner", 141, 1));
		enterCountry(BaseLibrary.getdatabasedonsheet("Partner", 142, 1));
		enterState(BaseLibrary.getdatabasedonsheet("Partner", 143, 1));
		entercity(BaseLibrary.getdatabasedonsheet("Partner", 144, 1));
		enterZipcode(BaseLibrary.getdatabasedonsheet("Partner", 145, 1));
		enterPhone(BaseLibrary.getdatabasedonsheet("Partner", 146, 1));
		enterEmail(BaseLibrary.getdatabasedonsheet("Partner", 147, 1));
		Actions actions = new Actions(driver);
		actions.moveToElement(subOfficeName).perform();
		enterSubOfficeName(BaseLibrary.getdatabasedonsheet("Partner", 148, 1));
		enterCode(BaseLibrary.getdatabasedonsheet("Partner", 149, 1));
		enterPurpose(BaseLibrary.getdatabasedonsheet("Partner", 150, 1));
		officefileupload();
//		file upload yet to update
	}

	public void feedvailddatatoallreportfields() throws Exception {
		BaseLibrary.waitforelement(ReportsDocumentsTab);
		BaseLibrary.clickelement(ReportsDocumentsTab);
		BaseLibrary.waitforelement(documentCode);
		enterDocumentCode(BaseLibrary.getdatabasedonsheet("Partner", 161, 1));
		enterDocumentName(BaseLibrary.getdatabasedonsheet("Partner", 162, 1));
		enterEntryDate(BaseLibrary.getdatabasedonsheet("Partner", 163, 1));
		enterDueDate(BaseLibrary.getdatabasedonsheet("Partner", 164, 1));
		enterExpDate(BaseLibrary.getdatabasedonsheet("Partner", 165, 1));
		enterRemarks(BaseLibrary.getdatabasedonsheet("Partner", 166, 1));
		reportfileupload();
	}

	public void feedvailddatatomandatoryofficefields(String upload,String suboffice) throws Exception {
		BaseLibrary.waitforelement(OfficeSubOfficeTab);
		BaseLibrary.clickelement(OfficeSubOfficeTab);
		BaseLibrary.waitforelement(officeName);
		enterOfficeName(BaseLibrary.randomstringgenerator(7));
		enterOfficeCode(BaseLibrary.randomnumbergenerator(8));
		enterDescription(BaseLibrary.getdatabasedonsheet("Partner", 138, 1));
		enterFundingAddressLine1(BaseLibrary.getdatabasedonsheet("Partner", 139, 1));
		enterCountry(BaseLibrary.getdatabasedonsheet("Partner", 142, 1));
		enterState(BaseLibrary.getdatabasedonsheet("Partner", 143, 1));
		entercity(BaseLibrary.getdatabasedonsheet("Partner", 144, 1));
		enterZipcode(BaseLibrary.getdatabasedonsheet("Partner", 145, 1));
		enterPhone(BaseLibrary.getdatabasedonsheet("Partner", 146, 1));
		enterEmail(BaseLibrary.getdatabasedonsheet("Partner", 147, 1));
		enterSubOfficeName(suboffice);
		enterCode(BaseLibrary.randomnumbergenerator(8));
		enterPurpose(BaseLibrary.randomstringgenerator(9));
		if(upload.equalsIgnoreCase("yes"))
		{
		officefileupload();
		}
	}
	
	
	public void addsuboffice() throws Exception
	{
		enterSubOfficeName(BaseLibrary.randomstringgenerator(9));
		enterCode(BaseLibrary.randomnumbergenerator(8));
		enterPurpose(BaseLibrary.randomstringgenerator(9));
		BaseLibrary.clickelement(addAnotherSubOffice);
		enterSubOfficeName2(BaseLibrary.randomstringgenerator(9));
		enterCode2(BaseLibrary.randomnumbergenerator(8));
		enterPurpose2(BaseLibrary.randomstringgenerator(9));
		
	}
	
	public void feedvailddatatomandatoryofficefieldswithmultiplesuboff(String upload) throws Exception {
		BaseLibrary.waitforelement(OfficeSubOfficeTab);
		BaseLibrary.clickelement(OfficeSubOfficeTab);
		BaseLibrary.waitforelement(officeName);
		enterOfficeName(BaseLibrary.randomstringgenerator(7));
		enterOfficeCode(BaseLibrary.randomnumbergenerator(8));
		enterDescription(BaseLibrary.getdatabasedonsheet("Partner", 138, 1));
		enterFundingAddressLine1(BaseLibrary.getdatabasedonsheet("Partner", 139, 1));
		enterCountry(BaseLibrary.getdatabasedonsheet("Partner", 142, 1));
		enterState(BaseLibrary.getdatabasedonsheet("Partner", 143, 1));
		entercity(BaseLibrary.getdatabasedonsheet("Partner", 144, 1));
		enterZipcode(BaseLibrary.getdatabasedonsheet("Partner", 145, 1));
		enterPhone(BaseLibrary.getdatabasedonsheet("Partner", 146, 1));
		enterEmail(BaseLibrary.getdatabasedonsheet("Partner", 147, 1));
		if(upload.equalsIgnoreCase("yes"))
		{
		officefileupload();
		}
		addsuboffice();		
		
	}

	public void feedvailddatatomandatoryreportfields(String upload) throws Exception {
		BaseLibrary.waitforelement(ReportsDocumentsTab);
		BaseLibrary.clickelement(ReportsDocumentsTab);
		BaseLibrary.waitforelement(documentCode);
		enterDocumentCode(BaseLibrary.getdatabasedonsheet("Partner", 161, 1));
		enterDocumentName(BaseLibrary.getdatabasedonsheet("Partner", 162, 1));
		enterEntryDate(BaseLibrary.getdatabasedonsheet("Partner", 163, 1));
		enterDueDate(BaseLibrary.getdatabasedonsheet("Partner", 164, 1));
		enterExpDate(BaseLibrary.getdatabasedonsheet("Partner", 165, 1));
		if(upload.equalsIgnoreCase("yes"))
		{
		reportfileupload();
		}
	}

	public void feedvailddatatomandatorysettlementfields() throws Exception {
		BaseLibrary.waitforelement(SettlemenTAccountingStatementsTab);
		BaseLibrary.clickelement(SettlemenTAccountingStatementsTab);
		BaseLibrary.waitforelement(prefix);
		enterPrefix(BaseLibrary.getdatabasedonsheet("Partner", 103, 1));
		enterLanguage(BaseLibrary.getdatabasedonsheet("Partner", 104, 1));
		enterClearingCode(BaseLibrary.getdatabasedonsheet("Partner", 105, 1));
		enterCompanyName(BaseLibrary.getdatabasedonsheet("Partner", 106, 1));
		enterFinancing_Spread_Tier_3(BaseLibrary.getdatabasedonsheet("Partner", 107, 1));
		enterRegulatorID(BaseLibrary.getdatabasedonsheet("Partner", 108, 1));
		enterCountryID(BaseLibrary.getdatabasedonsheet("Partner", 110, 1));
		enterMarginDefault(BaseLibrary.getdatabasedonsheet("Partner", 111, 1));
		enterPrefixPractice(BaseLibrary.getdatabasedonsheet("Partner", 112, 1));
		enterWLPHash(BaseLibrary.getdatabasedonsheet("Partner", 114, 1));
		enterCurrencies(BaseLibrary.getdatabasedonsheet("Partner", 115, 1));
		enterMarginMin(BaseLibrary.getdatabasedonsheet("Partner", 116, 1));
		enterRiskownedbyID(BaseLibrary.getdatabasedonsheet("Partner", 117, 1));

		enterContactPhoneWorkphonecountrycode(BaseLibrary.getdatabasedonsheet("Partner", 169, 1));
		enterContactPhoneWork(BaseLibrary.getdatabasedonsheet("Partner", 118, 1));
		enterContactPhoneMobilecountrycode(BaseLibrary.getdatabasedonsheet("Partner", 169, 1));
		enterContactPhoneMobile(BaseLibrary.getdatabasedonsheet("Partner", 119, 1));

		enterContraSubAccount(BaseLibrary.getdatabasedonsheet("Partner", 120, 1));
		enterAllowedCountryList(BaseLibrary.getdatabasedonsheet("Partner", 121, 1));
		enterDefaultWatchList(BaseLibrary.getdatabasedonsheet("Partner", 122, 1));
		enterInstrumentWhiteList(BaseLibrary.getdatabasedonsheet("Partner", 123, 1));
		enterTaxID(BaseLibrary.getdatabasedonsheet("Partner", 126, 1));
		enterIRSTXMControl(BaseLibrary.getdatabasedonsheet("Partner", 127, 1));

		//enterphonecountrycode(BaseLibrary.getdatabasedonsheet("Partner", 169, 1));
		enterIRSContactName(BaseLibrary.getdatabasedonsheet("Partner", 128, 1));
		enterIRSTaxContactTitle(BaseLibrary.getdatabasedonsheet("Partner", 129, 1));
		enterIRSContactPhonecountrycode(BaseLibrary.getdatabasedonsheet("Partner", 169, 1));
		enterIRSContactPhone(BaseLibrary.getdatabasedonsheet("Partner", 130, 1));
		Actions actions = new Actions(driver);
		actions.moveToElement(footer_two).perform();
		enterFooter(BaseLibrary.getdatabasedonsheet("Partner", 131, 1));
		enterDisclaimer(BaseLibrary.getdatabasedonsheet("Partner", 132, 1));
		enterFooter_two(BaseLibrary.getdatabasedonsheet("Partner", 133, 1));
		enterDisclaimer_two(BaseLibrary.getdatabasedonsheet("Partner", 134, 1));
	}



	public void enterWLPId(String WLPId) throws Exception {
		BaseLibrary.typetext(wLPId, WLPId);
		WlPID = WLPId;
	}

	public void enterPartnerName(String partnername) throws Exception {
		BaseLibrary.typetext(PartnerName, partnername);
		partnerName = partnername;
	}

	public void feedvailddatatomandatorypartnerinformationfields(String partnername,String brokerpartner, String businessstructure,String wipid) throws Exception {
		enterPartnerName(partnername);
		enterPartnerType(brokerpartner);
		enterKYCMode(BaseLibrary.getdatabasedonsheet("Partner", 6, 1));
		enterPartnerWebsite(BaseLibrary.getdatabasedonsheet("Partner", 7, 1));
		enterWLPId(wipid);
		enterAddressType(BaseLibrary.getdatabasedonsheet("Partner", 9, 1));
		enterAddressLine1(BaseLibrary.getdatabasedonsheet("Partner", 10, 1));
		enterCity(BaseLibrary.getdatabasedonsheet("Partner", 12, 1));
		enterState(BaseLibrary.getdatabasedonsheet("Partner", 13, 1));
		enterCountry(BaseLibrary.getdatabasedonsheet("Partner", 14, 1));
		enterZipcode(BaseLibrary.getdatabasedonsheet("Partner", 15, 1));
		enterEmail(BaseLibrary.getdatabasedonsheet("Partner", 16, 1));
		enterphonecountrycode(BaseLibrary.getdatabasedonsheet("Partner", 169, 1));
		enterPhone(BaseLibrary.getdatabasedonsheet("Partner", 18, 1));
		enterStockTicker(BaseLibrary.getdatabasedonsheet("Partner", 21, 1));
		enterBusinessStructureType(businessstructure);
		enterDirectorCount(BaseLibrary.getdatabasedonsheet("Partner", 31, 1));
		enterMPID(BaseLibrary.getdatabasedonsheet("Partner", 32, 1));
		enterFinraNum(BaseLibrary.getdatabasedonsheet("Partner", 33, 1));
		enterSECRegNum(BaseLibrary.getdatabasedonsheet("Partner", 34, 1));
		enterStatus(BaseLibrary.getdatabasedonsheet("Partner", 35, 1));
	}

	public void feedvailddatatomandatorypartnerinformationfieldswithdiffbrokertype() throws Exception {
		enterPartnerName(BaseLibrary.randomstringgenerator(9));
		enterPartnerType("Broker");
		enterKYCMode(BaseLibrary.getdatabasedonsheet("Partner", 6, 1));
		enterPartnerWebsite(BaseLibrary.getdatabasedonsheet("Partner", 7, 1));
		enterWLPId(BaseLibrary.randomstringgenerator(6));
		enterAddressType(BaseLibrary.getdatabasedonsheet("Partner", 9, 1));
		enterAddressLine1(BaseLibrary.getdatabasedonsheet("Partner", 10, 1));
		enterCity(BaseLibrary.getdatabasedonsheet("Partner", 12, 1));
		enterState(BaseLibrary.getdatabasedonsheet("Partner", 13, 1));
		enterCountry(BaseLibrary.getdatabasedonsheet("Partner", 14, 1));
		enterZipcode(BaseLibrary.getdatabasedonsheet("Partner", 15, 1));
		enterEmail(BaseLibrary.getdatabasedonsheet("Partner", 16, 1));
		enterPhone(BaseLibrary.getdatabasedonsheet("Partner", 18, 1));
		enterStockTicker(BaseLibrary.getdatabasedonsheet("Partner", 21, 1));
		enterBusinessStructureType(BaseLibrary.getdatabasedonsheet("Partner", 27, 1));
		enterDirectorCount(BaseLibrary.getdatabasedonsheet("Partner", 31, 1));
		enterMPID(BaseLibrary.getdatabasedonsheet("Partner", 32, 1));
		enterFinraNum(BaseLibrary.getdatabasedonsheet("Partner", 33, 1));
		enterSECRegNum(BaseLibrary.getdatabasedonsheet("Partner", 34, 1));
		enterStatus(BaseLibrary.getdatabasedonsheet("Partner", 35, 1));
	}

	public void feedvailddatatomandatorypartnerinformationfieldswithdiffbusinesstype() throws Exception {
		enterPartnerName(BaseLibrary.randomstringgenerator(9));
		enterPartnerType("Broker");
		enterKYCMode(BaseLibrary.getdatabasedonsheet("Partner", 6, 1));
		enterPartnerWebsite(BaseLibrary.getdatabasedonsheet("Partner", 7, 1));
		enterWLPId(BaseLibrary.randomstringgenerator(6));
		enterAddressType(BaseLibrary.getdatabasedonsheet("Partner", 9, 1));
		enterAddressLine1(BaseLibrary.getdatabasedonsheet("Partner", 10, 1));
		enterCity(BaseLibrary.getdatabasedonsheet("Partner", 12, 1));
		enterState(BaseLibrary.getdatabasedonsheet("Partner", 13, 1));
		enterCountry(BaseLibrary.getdatabasedonsheet("Partner", 14, 1));
		enterZipcode(BaseLibrary.getdatabasedonsheet("Partner", 15, 1));
		enterEmail(BaseLibrary.getdatabasedonsheet("Partner", 16, 1));
		enterPhone(BaseLibrary.getdatabasedonsheet("Partner", 18, 1));
		enterStockTicker(BaseLibrary.getdatabasedonsheet("Partner", 21, 1));
		enterBusinessStructureType("DBA");
		enterDirectorCount(BaseLibrary.getdatabasedonsheet("Partner", 31, 1));
		enterMPID(BaseLibrary.getdatabasedonsheet("Partner", 32, 1));
		enterFinraNum(BaseLibrary.getdatabasedonsheet("Partner", 33, 1));
		enterSECRegNum(BaseLibrary.getdatabasedonsheet("Partner", 34, 1));
		enterStatus(BaseLibrary.getdatabasedonsheet("Partner", 35, 1));
	}

	public void feedvailddatato_differentbusinessstructure_ypartnerinformationfields() throws Exception {
		enterPartnerName(BaseLibrary.randomstringgenerator(9));
		enterPartnerType(BaseLibrary.getdatabasedonsheet("Partner", 5, 1));
		enterKYCMode(BaseLibrary.getdatabasedonsheet("Partner", 6, 1));
		enterPartnerWebsite(BaseLibrary.getdatabasedonsheet("Partner", 7, 1));
		enterAddressType(BaseLibrary.getdatabasedonsheet("Partner", 9, 1));
		enterAddressLine1(BaseLibrary.getdatabasedonsheet("Partner", 10, 1));
		enterCity(BaseLibrary.getdatabasedonsheet("Partner", 12, 1));
		enterState(BaseLibrary.getdatabasedonsheet("Partner", 13, 1));
		enterCountry(BaseLibrary.getdatabasedonsheet("Partner", 14, 1));
		enterZipcode(BaseLibrary.getdatabasedonsheet("Partner", 15, 1));
		enterEmail(BaseLibrary.getdatabasedonsheet("Partner", 16, 1));
		enterPhone(BaseLibrary.getdatabasedonsheet("Partner", 18, 1));
		enterStockTicker(BaseLibrary.getdatabasedonsheet("Partner", 21, 1));
		enterBusinessStructureType(BaseLibrary.getdatabasedonsheet("Partner", 27, 2));
		enterDirectorCount(BaseLibrary.getdatabasedonsheet("Partner", 31, 1));
		enterMPID(BaseLibrary.getdatabasedonsheet("Partner", 32, 1));
		enterFinraNum(BaseLibrary.getdatabasedonsheet("Partner", 33, 1));
		enterSECRegNum(BaseLibrary.getdatabasedonsheet("Partner", 34, 1));
		enterStatus(BaseLibrary.getdatabasedonsheet("Partner", 35, 1));
	}

	public void feedvailddatato_differentpartnertype_ypartnerinformationfields() throws Exception {
		enterPartnerName(BaseLibrary.randomstringgenerator(9));
		enterPartnerType(BaseLibrary.getdatabasedonsheet("Partner", 5, 2));
		enterKYCMode(BaseLibrary.getdatabasedonsheet("Partner", 6, 1));
		enterPartnerWebsite(BaseLibrary.getdatabasedonsheet("Partner", 7, 1));
		enterAddressType(BaseLibrary.getdatabasedonsheet("Partner", 9, 1));
		enterAddressLine1(BaseLibrary.getdatabasedonsheet("Partner", 10, 1));
		enterCity(BaseLibrary.getdatabasedonsheet("Partner", 12, 1));
		enterState(BaseLibrary.getdatabasedonsheet("Partner", 13, 1));
		enterCountry(BaseLibrary.getdatabasedonsheet("Partner", 14, 1));
		enterZipcode(BaseLibrary.getdatabasedonsheet("Partner", 15, 1));
		enterEmail(BaseLibrary.getdatabasedonsheet("Partner", 16, 1));
		enterPhone(BaseLibrary.getdatabasedonsheet("Partner", 18, 1));
		enterStockTicker(BaseLibrary.getdatabasedonsheet("Partner", 21, 1));
		enterBusinessStructureType(BaseLibrary.getdatabasedonsheet("Partner", 27, 1));
		enterDirectorCount(BaseLibrary.getdatabasedonsheet("Partner", 31, 1));
		enterMPID(BaseLibrary.getdatabasedonsheet("Partner", 32, 1));
		enterFinraNum(BaseLibrary.getdatabasedonsheet("Partner", 33, 1));
		enterSECRegNum(BaseLibrary.getdatabasedonsheet("Partner", 34, 1));
		enterStatus(BaseLibrary.getdatabasedonsheet("Partner", 35, 1));
	}

	public void feedvailddatatoRegistrationTYpelegalriskfields() throws Exception {
		BaseLibrary.waitforelement(Legalrisk);
		BaseLibrary.clickelement(Legalrisk);
		BaseLibrary.waitforelement(CPTradingLimit);
		enterCPTradingLimit(BaseLibrary.getdatabasedonsheet("Partner", 40, 1));
		enterCPFundingLimit(BaseLibrary.getdatabasedonsheet("Partner", 41, 1));
		enterLineOfCredit(BaseLibrary.getdatabasedonsheet("Partner", 42, 1));
		enterInitialClearingDeposit(BaseLibrary.getdatabasedonsheet("Partner", 43, 1));
		enterRateCard(BaseLibrary.getdatabasedonsheet("Partner", 44, 1));
		enterCountry(BaseLibrary.getdatabasedonsheet("Partner", 45, 1));
		enterStatus(BaseLibrary.getdatabasedonsheet("Partner", 46, 1));
		enterJurisdictionList(BaseLibrary.getdatabasedonsheet("Partner", 47, 1));
		enterRegistrationType(BaseLibrary.getdatabasedonsheet("Partner", 48, 2));
		enterRegulatoryLicenceNo(BaseLibrary.getdatabasedonsheet("Partner", 49, 1));
		enterRegistrationDate(BaseLibrary.getdatabasedonsheet("Partner", 50, 1));
	}

	public void feedvailddata_differentprodctid_Productinfofields() throws Exception {
		BaseLibrary.waitforelement(Productinfo);
		BaseLibrary.clickelement(Productinfo);
		BaseLibrary.waitforelement(ProductID);
		enterProductID(BaseLibrary.getdatabasedonsheet("Partner", 52, 2));
//		enterCommissionDescription(BaseLibrary.getdatabasedonsheet("Partner", 53, 1));
//		enterCommissionGroupDescription(BaseLibrary.getdatabasedonsheet("Partner", 54, 1));
//		enterCommissionDetails(BaseLibrary.getdatabasedonsheet("Partner", 55, 1));
//		enterFractionalDetails(BaseLibrary.getdatabasedonsheet("Partner", 56, 1));
//		enterCountry(BaseLibrary.getdatabasedonsheet("Partner", 15, 1));
//		enterAccountManagementType(BaseLibrary.getdatabasedonsheet("Partner", 57, 1));
//		enterStatus(BaseLibrary.getdatabasedonsheet("Partner", 35, 1));
//		enterDefaultInd(BaseLibrary.getdatabasedonsheet("Partner", 58, 1));
//		enterSubscription(BaseLibrary.getdatabasedonsheet("Partner", 59, 1));
//		enterBasketDetails(BaseLibrary.getdatabasedonsheet("Partner", 60, 1));
//		enterBasketSchedule(BaseLibrary.getdatabasedonsheet("Partner", 61, 1));
//		enterManagedAccountDetails(BaseLibrary.getdatabasedonsheet("Partner", 62, 1));
//		enterOTCcommissionDetail(BaseLibrary.getdatabasedonsheet("Partner", 63, 1));
//		enterPassThroughFees(BaseLibrary.getdatabasedonsheet("Partner", 64, 1));
//		enterInstrumentListType(BaseLibrary.getdatabasedonsheet("Partner", 64, 1));
//		enterDescription(BaseLibrary.getdatabasedonsheet("Partner", 65, 1));
//		enterStatus(BaseLibrary.getdatabasedonsheet("Partner", 35, 1));

	}

	public void feedvailddatatomandatoryfundingfields(String Fundtype) throws Exception {
		BaseLibrary.waitforelement(FundingTab);
		BaseLibrary.clickelement(FundingTab);
		BaseLibrary.waitforelement(fundingType);
		enterFundingType(Fundtype);
		enterPaymentID(BaseLibrary.getdatabasedonsheet("Partner", 69, 1));
		entercategory(BaseLibrary.getdatabasedonsheet("Partner", 70, 1));
		enterCurrencyCode(BaseLibrary.getdatabasedonsheet("Partner", 71, 1));
		enterStatus(BaseLibrary.getdatabasedonsheet("Partner", 72, 1));
		enterPaymentRail(BaseLibrary.getdatabasedonsheet("Partner", 73, 1));
		enterLICPartnerHandleFunds(BaseLibrary.getdatabasedonsheet("Partner", 75, 1));
		enterCashManagementElection(BaseLibrary.getdatabasedonsheet("Partner", 76, 1));
		enterBeneficiaryName(BaseLibrary.getdatabasedonsheet("Partner", 77, 1));
		enterbeneficiaryAccountNo(BaseLibrary.getdatabasedonsheet("Partner", 78, 1));
		enterbeneficiaryAccountType(BaseLibrary.getdatabasedonsheet("Partner", 79, 1));
		enterBeneficiaryRountingNumber(BaseLibrary.getdatabasedonsheet("Partner", 80, 1));
		enterBeneficiaryBankName(BaseLibrary.getdatabasedonsheet("Partner", 81, 1));
		enterAddressLine1(BaseLibrary.getdatabasedonsheet("Partner", 82, 1));
		enterCountry(BaseLibrary.getdatabasedonsheet("Partner", 84, 1));
		enterState(BaseLibrary.getdatabasedonsheet("Partner", 85, 1));
		entercity(BaseLibrary.getdatabasedonsheet("Partner", 86, 1));
		enterZipcode(BaseLibrary.getdatabasedonsheet("Partner", 87, 1));
		enterphonecountrycode(BaseLibrary.getdatabasedonsheet("Partner", 169, 1));
		enterPhone(BaseLibrary.getdatabasedonsheet("Partner", 88, 1));
		enterEmail(BaseLibrary.getdatabasedonsheet("Partner", 89, 1));
		Actions actions = new Actions(driver);
		actions.moveToElement(intermediarySWIFT).perform();
		enterIntermediarySWIFT(BaseLibrary.getdatabasedonsheet("Partner", 91, 1));
		enterIntermediaryBankName(BaseLibrary.getdatabasedonsheet("Partner", 92, 1));
		enterIntermediaryBankCountry(BaseLibrary.getdatabasedonsheet("Partner", 93, 1));
	}

	public void feedvailddatato_fundingtype_fundingfields() throws Exception {
		BaseLibrary.waitforelement(FundingTab);
		BaseLibrary.clickelement(FundingTab);
		BaseLibrary.waitforelement(fundingType);
		enterFundingType(BaseLibrary.getdatabasedonsheet("Partner", 68, 2));
		enterPaymentID(BaseLibrary.getdatabasedonsheet("Partner", 69, 1));
		entercategory(BaseLibrary.getdatabasedonsheet("Partner", 70, 1));
		enterCurrencyCode(BaseLibrary.getdatabasedonsheet("Partner", 71, 1));
		enterStatus(BaseLibrary.getdatabasedonsheet("Partner", 72, 1));
		enterPaymentRail(BaseLibrary.getdatabasedonsheet("Partner", 73, 1));
		enterLICPartnerHandleFunds(BaseLibrary.getdatabasedonsheet("Partner", 75, 1));
		enterCashManagementElection(BaseLibrary.getdatabasedonsheet("Partner", 76, 1));
		enterBeneficiaryName(BaseLibrary.getdatabasedonsheet("Partner", 77, 1));
		enterbeneficiaryAccountNo(BaseLibrary.getdatabasedonsheet("Partner", 78, 1));
		enterbeneficiaryAccountType(BaseLibrary.getdatabasedonsheet("Partner", 79, 1));
		enterBeneficiaryRountingNumber(BaseLibrary.getdatabasedonsheet("Partner", 80, 1));
		enterBeneficiaryBankName(BaseLibrary.getdatabasedonsheet("Partner", 81, 1));
		enterAddressLine1(BaseLibrary.getdatabasedonsheet("Partner", 82, 1));
		enterCountry(BaseLibrary.getdatabasedonsheet("Partner", 84, 1));
		enterState(BaseLibrary.getdatabasedonsheet("Partner", 85, 1));
		entercity(BaseLibrary.getdatabasedonsheet("Partner", 86, 1));
		enterZipcode(BaseLibrary.getdatabasedonsheet("Partner", 87, 1));
		enterPhone(BaseLibrary.getdatabasedonsheet("Partner", 88, 1));
		enterEmail(BaseLibrary.getdatabasedonsheet("Partner", 89, 1));
		Actions actions = new Actions(driver);
		actions.moveToElement(intermediarySWIFT).perform();
		enterIntermediarySWIFT(BaseLibrary.getdatabasedonsheet("Partner", 91, 1));
		enterIntermediaryBankName(BaseLibrary.getdatabasedonsheet("Partner", 92, 1));
		enterIntermediaryBankCountry(BaseLibrary.getdatabasedonsheet("Partner", 93, 1));
	}



	public void feedvailddatatominpartnerinformationfields() throws Exception {
		enterPartnerName(BaseLibrary.randomstringgenerator(5));
		enterPartnerType(BaseLibrary.getdatabasedonsheet("Partner", 5, 1));
		enterKYCMode(BaseLibrary.getdatabasedonsheet("Partner", 6, 1));
		enterPartnerWebsite(BaseLibrary.getdatabasedonsheet("Partner", 7, 1));
		enterAddressType(BaseLibrary.getdatabasedonsheet("Partner", 9, 1));
		enterAddressLine1(BaseLibrary.randomstringgenerator(2));
		enterAddressLine2(BaseLibrary.randomstringgenerator(2));
		enterCity(BaseLibrary.randomstringgenerator(1));
		enterState(BaseLibrary.randomstringgenerator(1));
		enterCountry(BaseLibrary.getdatabasedonsheet("Partner", 14, 1));
		enterZipcode(BaseLibrary.randomnumbergenerator(1));
		enterEmail(BaseLibrary.getdatabasedonsheet("Partner", 16, 1));
		enterAlternativeEmail(BaseLibrary.getdatabasedonsheet("Partner", 17, 1));
		enterPhone(BaseLibrary.getdatabasedonsheet("Partner", 18, 1));
		enterProspectus(BaseLibrary.randomstringgenerator(1));
		enterIndustry(BaseLibrary.getdatabasedonsheet("Partner", 20, 1));
		enterStockTicker(BaseLibrary.randomstringgenerator(1));
		enterCoolDownPeriod(BaseLibrary.randomstringgenerator(1));
		enterOTCMarketPeriod(BaseLibrary.randomstringgenerator(1));
		enterOmnibusAccountID(BaseLibrary.randomstringgenerator(1));
		enterSubscriptionDefaultTrialPeriodDays(BaseLibrary.getdatabasedonsheet("Partner", 26, 1));
		enterBusinessStructureType(BaseLibrary.getdatabasedonsheet("Partner", 27, 1));
		enterDirectorCount(BaseLibrary.randomstringgenerator(1));
		enterMPID(BaseLibrary.randomstringgenerator(1));
		enterFinraNum(BaseLibrary.randomstringgenerator(1));
		enterSECRegNum(BaseLibrary.randomstringgenerator(1));
		enterStatus(BaseLibrary.getdatabasedonsheet("Partner", 35, 1));
	}

	public void feedvailddatatominlegalriskfields() throws Exception {
		BaseLibrary.waitforelement(Legalrisk);
		BaseLibrary.clickelement(Legalrisk);
		BaseLibrary.waitforelement(CPTradingLimit);
		enterCPTradingLimit(BaseLibrary.randomnumbergenerator(1));
		enterCPFundingLimit(BaseLibrary.randomnumbergenerator(1));
		enterLineOfCredit(BaseLibrary.randomnumbergenerator(1));
		enterInitialClearingDeposit(BaseLibrary.randomnumbergenerator(1));
		enterRateCard(BaseLibrary.randomstringgenerator(1));
		enterCountry(BaseLibrary.getdatabasedonsheet("Partner", 45, 1));
		enterStatus(BaseLibrary.getdatabasedonsheet("Partner", 46, 1));
		enterJurisdictionList(BaseLibrary.getdatabasedonsheet("Partner", 47, 1));
		enterRegistrationType(BaseLibrary.getdatabasedonsheet("Partner", 48, 1));
		enterRegulatoryLicenceNo(BaseLibrary.randomnumbergenerator(1));
		enterRegistrationDate(BaseLibrary.getdatabasedonsheet("Partner", 50, 1));
	}

	public void feedvailddatatominfundingfields() throws Exception {
		BaseLibrary.waitforelement(FundingTab);
		BaseLibrary.clickelement(FundingTab);
		BaseLibrary.waitforelement(fundingType);
		enterFundingType(BaseLibrary.getdatabasedonsheet("Partner", 68, 1));
		enterPaymentID(BaseLibrary.getdatabasedonsheet("Partner", 69, 1));
		entercategory(BaseLibrary.getdatabasedonsheet("Partner", 70, 1));
		enterCurrencyCode(BaseLibrary.getdatabasedonsheet("Partner", 71, 1));
		enterStatus(BaseLibrary.getdatabasedonsheet("Partner", 72, 1));
		enterPaymentRail(BaseLibrary.getdatabasedonsheet("Partner", 73, 1));
		enterLICPartnerHandleFunds(BaseLibrary.getdatabasedonsheet("Partner", 75, 1));
		enterCashManagementElection(BaseLibrary.getdatabasedonsheet("Partner", 76, 1));
		enterBeneficiaryName(BaseLibrary.randomstringgenerator(1));
		enterbeneficiaryAccountNo(BaseLibrary.randomstringgenerator(1));
		enterbeneficiaryAccountType(BaseLibrary.randomstringgenerator(1));
		enterBeneficiaryRountingNumber(BaseLibrary.randomstringgenerator(1));
		enterBeneficiaryBankName(BaseLibrary.randomstringgenerator(1));
		enterAddressLine1(BaseLibrary.randomstringgenerator(1));
		enterAddressLine2(BaseLibrary.randomstringgenerator(1));
		enterCountry(BaseLibrary.getdatabasedonsheet("Partner", 84, 1));
		enterState(BaseLibrary.randomstringgenerator(1));
		entercity(BaseLibrary.randomstringgenerator(1));
		enterZipcode(BaseLibrary.randomnumbergenerator(1));
		enterPhone(BaseLibrary.getdatabasedonsheet("Partner", 88, 1));
		enterEmail(BaseLibrary.getdatabasedonsheet("Partner", 89, 1));
		enterAlternativeEmail(BaseLibrary.getdatabasedonsheet("Partner", 90, 1));
		enterIntermediarySWIFT(BaseLibrary.randomnumbergenerator(1));
		enterIntermediaryBankName(BaseLibrary.randomnumbergenerator(1));
		enterIntermediaryBankCountry(BaseLibrary.randomnumbergenerator(1));
		enterEscrowAccountID(BaseLibrary.randomnumbergenerator(1));
		enterEscrowAccountNo(BaseLibrary.randomnumbergenerator(1));
		enterIFAAccountID(BaseLibrary.randomnumbergenerator(1));
		enterIFAAccountNo(BaseLibrary.randomnumbergenerator(1));
		enterHouseAccountNO(BaseLibrary.randomnumbergenerator(1));
		enterHouseAccountID(BaseLibrary.randomnumbergenerator(1));
		enterSuspenseAccountID(BaseLibrary.randomnumbergenerator(1));
		enterSuspenseAccountNO(BaseLibrary.randomnumbergenerator(1));
	}

	public void feedvailddatatominsettlementfields() throws Exception {
		BaseLibrary.waitforelement(SettlemenTAccountingStatementsTab);
		BaseLibrary.clickelement(SettlemenTAccountingStatementsTab);
		BaseLibrary.waitforelement(prefix);
		enterPrefix(BaseLibrary.randomstringgenerator(1));
		enterLanguage(BaseLibrary.randomstringgenerator(1));
		enterClearingCode(BaseLibrary.randomnumbergenerator(1));
		enterCompanyName(BaseLibrary.randomstringgenerator(1));
		enterFinancing_Spread_Tier_3(BaseLibrary.randomnumbergenerator(1));
		enterRegulatorID(BaseLibrary.randomnumbergenerator(1));
		enterCountryID(BaseLibrary.getdatabasedonsheet("Partner", 110, 1));
		enterMarginDefault(BaseLibrary.randomnumbergenerator(1));
		enterPrefixPractice(BaseLibrary.randomstringgenerator(1));
		enterWLPId(BaseLibrary.randomstringgenerator(1));
		enterWLPHash(BaseLibrary.randomstringgenerator(1));
		enterCurrencies(BaseLibrary.randomstringgenerator(1));
		enterMarginMin(BaseLibrary.randomnumbergenerator(1));
		enterRiskownedbyID(BaseLibrary.randomnumbergenerator(1));
		enterContactPhoneWork(BaseLibrary.getdatabasedonsheet("Partner", 118, 1));
		enterContactPhoneMobile(BaseLibrary.getdatabasedonsheet("Partner", 119, 1));
		enterContraSubAccount(BaseLibrary.randomstringgenerator(1));
		enterAllowedCountryList(BaseLibrary.randomstringgenerator(1));
		enterDefaultWatchList(BaseLibrary.randomstringgenerator(1));
		enterInstrumentWhiteList(BaseLibrary.randomstringgenerator(1));
		enterDefaultFavorites(BaseLibrary.randomstringgenerator(1));
		enterDefaultRecentInstruments(BaseLibrary.randomstringgenerator(1));
		enterTaxID(BaseLibrary.randomnumbergenerator(1));
		enterIRSTXMControl(BaseLibrary.randomstringgenerator(1));
		enterIRSContactName(BaseLibrary.randomstringgenerator(1));
		enterIRSTaxContactTitle(BaseLibrary.randomstringgenerator(1));
		enterIRSContactPhone(BaseLibrary.getdatabasedonsheet("Partner", 130, 1));
		enterFooter(BaseLibrary.randomstringgenerator(1));
		enterDisclaimer(BaseLibrary.randomstringgenerator(1));
		enterFooter_two(BaseLibrary.randomstringgenerator(1));
		enterDisclaimer_two(BaseLibrary.randomstringgenerator(1));
//		File upload yet to add
	}

	public void feedvailddatatominofficefields() throws Exception {
		BaseLibrary.waitforelement(OfficeSubOfficeTab);
		BaseLibrary.clickelement(OfficeSubOfficeTab);
		BaseLibrary.waitforelement(officeName);
		enterOfficeName(BaseLibrary.randomstringgenerator(1));
		enterOfficeCode(BaseLibrary.randomstringgenerator(1));
		enterDescription(BaseLibrary.randomstringgenerator(1));
		enterFundingAddressLine1(BaseLibrary.randomstringgenerator(1));
		enterFundingAddressLine2(BaseLibrary.randomstringgenerator(1));
		enterFundingAddressLine3(BaseLibrary.randomstringgenerator(1));
		enterCountry(BaseLibrary.getdatabasedonsheet("Partner", 142, 1));
		enterState(BaseLibrary.randomstringgenerator(1));
		entercity(BaseLibrary.randomstringgenerator(1));
		enterZipcode(BaseLibrary.randomnumbergenerator(1));
		enterPhone(BaseLibrary.getdatabasedonsheet("Partner", 146, 1));
		enterEmail(BaseLibrary.getdatabasedonsheet("Partner", 147, 1));
		Actions actions = new Actions(driver);
		actions.moveToElement(subOfficeName).perform();
		enterSubOfficeName(BaseLibrary.randomstringgenerator(1));
		enterCode(BaseLibrary.randomstringgenerator(1));
		enterPurpose(BaseLibrary.randomstringgenerator(1));
		// officefileupload();
//		file upload yet to update
	}

	public void feedvailddatatomandatoryofficesubofficefields(String officename,String officecode) throws Exception {
		BaseLibrary.waitforelement(OfficeSubOfficeTab);
		BaseLibrary.clickelement(OfficeSubOfficeTab);
		BaseLibrary.waitforelement(officeName);
		enterOfficeName(officename);
		enterOfficeCode(officecode);
		enterDescription(BaseLibrary.getdatabasedonsheet("Partner", 138, 1));

		enterFundingAddressLine1(BaseLibrary.getdatabasedonsheet("Partner", 139, 1));
		enterCountry(BaseLibrary.getdatabasedonsheet("Partner", 142, 1));
		enterState(BaseLibrary.getdatabasedonsheet("Partner", 143, 1));
		entercity(BaseLibrary.getdatabasedonsheet("Partner", 144, 1));
		enterZipcode(BaseLibrary.getdatabasedonsheet("Partner", 145, 1));
		enterphonecountrycode(BaseLibrary.getdatabasedonsheet("Partner", 169, 1));
		enterPhone(BaseLibrary.getdatabasedonsheet("Partner", 146, 1));
		enterEmail(BaseLibrary.getdatabasedonsheet("Partner", 147, 1));



	}

	public void feedvailddatatominreportfields() throws Exception {
		BaseLibrary.waitforelement(ReportsDocumentsTab);
		BaseLibrary.clickelement(ReportsDocumentsTab);
		BaseLibrary.waitforelement(documentCode);
		enterDocumentCode(BaseLibrary.randomstringgenerator(1));
		enterDocumentName(BaseLibrary.randomstringgenerator(1));
		enterEntryDate(BaseLibrary.getdatabasedonsheet("Partner", 163, 1));
		enterDueDate(BaseLibrary.getdatabasedonsheet("Partner", 164, 1));
		enterExpDate(BaseLibrary.getdatabasedonsheet("Partner", 165, 1));
		enterRemarks(BaseLibrary.randomstringgenerator(1));
		reportfileupload();
	}

	public void feedvailddatatomandatorywithoutreportfields() throws Exception {
		BaseLibrary.waitforelement(ReportsDocumentsTab);
		BaseLibrary.clickelement(ReportsDocumentsTab);
		BaseLibrary.waitforelement(documentCode);
		BaseLibrary.waitforelement(delete);
		BaseLibrary.clickelement(delete);

	}

	public void savepartner() throws Exception {
		clicksavebutton();
//		creationmessage();
	}

	public void feedvailddatato_samewlpid_settlementfields() throws Exception {
		BaseLibrary.waitforelement(SettlemenTAccountingStatementsTab);
		BaseLibrary.clickelement(SettlemenTAccountingStatementsTab);
		BaseLibrary.waitforelement(prefix);
		enterPrefix(BaseLibrary.getdatabasedonsheet("Partner", 103, 1));
		enterLanguage(BaseLibrary.getdatabasedonsheet("Partner", 104, 1));
		enterClearingCode(BaseLibrary.getdatabasedonsheet("Partner", 105, 1));
		enterCompanyName(BaseLibrary.getdatabasedonsheet("Partner", 106, 1));
		enterFinancing_Spread_Tier_3(BaseLibrary.getdatabasedonsheet("Partner", 107, 1));
		enterRegulatorID(BaseLibrary.getdatabasedonsheet("Partner", 108, 1));
		enterCountryID(BaseLibrary.getdatabasedonsheet("Partner", 110, 1));
		enterMarginDefault(BaseLibrary.getdatabasedonsheet("Partner", 111, 1));
		enterPrefixPractice(BaseLibrary.getdatabasedonsheet("Partner", 112, 1));
		enterWLPId(WlPID);
		enterWLPHash(BaseLibrary.getdatabasedonsheet("Partner", 114, 1));
		enterCurrencies(BaseLibrary.getdatabasedonsheet("Partner", 115, 1));
		enterMarginMin(BaseLibrary.getdatabasedonsheet("Partner", 116, 1));
		enterRiskownedbyID(BaseLibrary.getdatabasedonsheet("Partner", 117, 1));
		enterContactPhoneWork(BaseLibrary.getdatabasedonsheet("Partner", 118, 1));
		enterContactPhoneMobile(BaseLibrary.getdatabasedonsheet("Partner", 119, 1));
		enterContraSubAccount(BaseLibrary.getdatabasedonsheet("Partner", 120, 1));
		enterAllowedCountryList(BaseLibrary.getdatabasedonsheet("Partner", 121, 1));
		enterDefaultWatchList(BaseLibrary.getdatabasedonsheet("Partner", 122, 1));
		enterInstrumentWhiteList(BaseLibrary.getdatabasedonsheet("Partner", 123, 1));
		enterTaxID(BaseLibrary.getdatabasedonsheet("Partner", 126, 1));
		enterIRSTXMControl(BaseLibrary.getdatabasedonsheet("Partner", 127, 1));
		enterIRSContactName(BaseLibrary.getdatabasedonsheet("Partner", 128, 1));
		enterIRSTaxContactTitle(BaseLibrary.getdatabasedonsheet("Partner", 129, 1));
		enterIRSContactPhone(BaseLibrary.getdatabasedonsheet("Partner", 130, 1));
		Actions actions = new Actions(driver);
		actions.moveToElement(footer_two).perform();
		enterFooter(BaseLibrary.getdatabasedonsheet("Partner", 131, 1));
		enterDisclaimer(BaseLibrary.getdatabasedonsheet("Partner", 132, 1));
		enterFooter_two(BaseLibrary.getdatabasedonsheet("Partner", 133, 1));
		enterDisclaimer_two(BaseLibrary.getdatabasedonsheet("Partner", 134, 1));
	}

	public void feedvaildminmaxdatatoallpartnerinformationfields(int columnvalue) throws Exception {
		enterPartnerName(BaseLibrary.getdatabasedonsheet("Partner", 4, columnvalue));
		enterPartnerType(BaseLibrary.getdatabasedonsheet("Partner", 5, columnvalue));
		enterKYCMode(BaseLibrary.getdatabasedonsheet("Partner", 6, columnvalue));
		enterPartnerWebsite(BaseLibrary.getdatabasedonsheet("Partner", 7, columnvalue));
		enterWLPId(BaseLibrary.getdatabasedonsheet("Partner", 113, columnvalue));
		enterAddressType(BaseLibrary.getdatabasedonsheet("Partner", 9, columnvalue));
		enterAddressLine1(BaseLibrary.getdatabasedonsheet("Partner", 10, columnvalue));
		enterAddressLine2(BaseLibrary.getdatabasedonsheet("Partner", 11, columnvalue));
		enterCity(BaseLibrary.getdatabasedonsheet("Partner", 12, columnvalue));
		enterState(BaseLibrary.getdatabasedonsheet("Partner", 13, columnvalue));
		enterCountry(BaseLibrary.getdatabasedonsheet("Partner", 14, columnvalue));
		enterZipcode(BaseLibrary.getdatabasedonsheet("Partner", 15, columnvalue));
		enterEmail(BaseLibrary.getdatabasedonsheet("Partner", 16, columnvalue));
		enterAlternativeEmail(BaseLibrary.getdatabasedonsheet("Partner", 17, columnvalue));
		enterPhone(BaseLibrary.getdatabasedonsheet("Partner", 18, columnvalue));
		enterProspectus(BaseLibrary.getdatabasedonsheet("Partner", 19, columnvalue));
		enterIndustry(BaseLibrary.getdatabasedonsheet("Partner", 20, columnvalue));
		enterStockTicker(BaseLibrary.getdatabasedonsheet("Partner", 21, columnvalue));
		enterCoolDownPeriod(BaseLibrary.getdatabasedonsheet("Partner", 22, columnvalue));
		enterOTCMarketPeriod(BaseLibrary.getdatabasedonsheet("Partner", 24, columnvalue));
		enterOmnibusAccountID(BaseLibrary.getdatabasedonsheet("Partner", 25, columnvalue));
		enterSubscriptionDefaultTrialPeriodDays(BaseLibrary.getdatabasedonsheet("Partner", 26, columnvalue));
		enterBusinessStructureType(BaseLibrary.getdatabasedonsheet("Partner", 27, columnvalue));
		enterDirectorCount(BaseLibrary.getdatabasedonsheet("Partner", 31, columnvalue));
		enterMPID(BaseLibrary.getdatabasedonsheet("Partner", 32, columnvalue));
		enterFinraNum(BaseLibrary.getdatabasedonsheet("Partner", 33, columnvalue));
		enterSECRegNum(BaseLibrary.getdatabasedonsheet("Partner", 34, columnvalue));
		enterStatus(BaseLibrary.getdatabasedonsheet("Partner", 35, columnvalue));

	}
	
	

	public void feedvaildminmaxdatatoalllegalriskfields(String regtype,int columnvalue) throws Exception {
		BaseLibrary.waitforelement(Legalrisk);
		BaseLibrary.clickelement(Legalrisk);
		BaseLibrary.waitforelement(CPTradingLimit);
		enterCPTradingLimit(BaseLibrary.getdatabasedonsheet("Partner", 40, columnvalue));
		enterCPFundingLimit(BaseLibrary.getdatabasedonsheet("Partner", 41, columnvalue));
		enterLineOfCredit(BaseLibrary.getdatabasedonsheet("Partner", 42, columnvalue));
		enterInitialClearingDeposit(BaseLibrary.getdatabasedonsheet("Partner", 43, columnvalue));
		enterRateCard(BaseLibrary.getdatabasedonsheet("Partner", 44, columnvalue));
		enterCountry(BaseLibrary.getdatabasedonsheet("Partner", 45, columnvalue));
		enterStatus(BaseLibrary.getdatabasedonsheet("Partner", 46, columnvalue));
		enterJurisdictionList(BaseLibrary.getdatabasedonsheet("Partner", 47, columnvalue));
		enterRegistrationType(regtype);
		enterRegulatoryLicenceNo(BaseLibrary.getdatabasedonsheet("Partner", 49, columnvalue));
		enterRegistrationDate(BaseLibrary.getdatabasedonsheet("Partner", 50, columnvalue));
	}

	public void feedvaildminmaxdatatoallProductinfofields(String prodid,int columnvalue) throws Exception {
		BaseLibrary.waitforelement(Productinfo);
		BaseLibrary.clickelement(Productinfo);
		BaseLibrary.waitforelement(ProductID);
		enterProductID(prodid);
//		enterCommissionDescription(BaseLibrary.getdatabasedonsheet("Partner", 53, columnvalue));
//		enterCommissionGroupDescription(BaseLibrary.getdatabasedonsheet("Partner", 54, columnvalue));
//		enterCommissionDetails(BaseLibrary.getdatabasedonsheet("Partner", 55, columnvalue));
//		enterFractionalDetails(BaseLibrary.getdatabasedonsheet("Partner", 56, columnvalue));
//		enterCountry(BaseLibrary.getdatabasedonsheet("Partner", 15, columnvalue)); 
//		enterAccountManagementType(BaseLibrary.getdatabasedonsheet("Partner", 57, columnvalue));
//		enterStatus(BaseLibrary.getdatabasedonsheet("Partner", 35, columnvalue)); 
//		enterDefaultInd(BaseLibrary.getdatabasedonsheet("Partner", 58, columnvalue));
//		enterSubscription(BaseLibrary.getdatabasedonsheet("Partner", 59, columnvalue));
//		enterBasketDetails(BaseLibrary.getdatabasedonsheet("Partner", 60, columnvalue));
//		enterBasketSchedule(BaseLibrary.getdatabasedonsheet("Partner", 61, columnvalue));
//		enterManagedAccountDetails(BaseLibrary.getdatabasedonsheet("Partner", 62, columnvalue));
//		enterOTCcommissionDetail(BaseLibrary.getdatabasedonsheet("Partner", 63, columnvalue));
//		enterPassThroughFees(BaseLibrary.getdatabasedonsheet("Partner", 64, columnvalue));
//		enterInstrumentListType(BaseLibrary.getdatabasedonsheet("Partner", 64, columnvalue));
//		enterDescription(BaseLibrary.getdatabasedonsheet("Partner", 65, columnvalue));
//		enterStatus(BaseLibrary.getdatabasedonsheet("Partner", 35, columnvalue));

	}

	public void feedvaildminmaxdatatoallfundingfields(int columnvalue) throws Exception {
		BaseLibrary.waitforelement(FundingTab);
		BaseLibrary.clickelement(FundingTab);
		BaseLibrary.waitforelement(fundingType);
		enterFundingType(BaseLibrary.getdatabasedonsheet("Partner", 68, columnvalue));
		enterPaymentID(BaseLibrary.getdatabasedonsheet("Partner", 69, columnvalue));
		entercategory(BaseLibrary.getdatabasedonsheet("Partner", 70, columnvalue));
		enterCurrencyCode(BaseLibrary.getdatabasedonsheet("Partner", 71, columnvalue));
		enterStatus(BaseLibrary.getdatabasedonsheet("Partner", 72, columnvalue));
		enterPaymentRail(BaseLibrary.getdatabasedonsheet("Partner", 73, columnvalue));
		enterLICPartnerHandleFunds(BaseLibrary.getdatabasedonsheet("Partner", 75, columnvalue));
		enterCashManagementElection(BaseLibrary.getdatabasedonsheet("Partner", 76, columnvalue));
		enterBeneficiaryName(BaseLibrary.getdatabasedonsheet("Partner", 77, columnvalue));
		enterbeneficiaryAccountNo(BaseLibrary.getdatabasedonsheet("Partner", 78, columnvalue));
		enterbeneficiaryAccountType(BaseLibrary.getdatabasedonsheet("Partner", 79, columnvalue));
		enterBeneficiaryRountingNumber(BaseLibrary.getdatabasedonsheet("Partner", 80, columnvalue));
		enterBeneficiaryBankName(BaseLibrary.getdatabasedonsheet("Partner", 81, columnvalue));
		enterAddressLine1(BaseLibrary.getdatabasedonsheet("Partner", 82, columnvalue));
		enterAddressLine2(BaseLibrary.getdatabasedonsheet("Partner", 83, columnvalue));
		enterCountry(BaseLibrary.getdatabasedonsheet("Partner", 84, columnvalue));
		enterState(BaseLibrary.getdatabasedonsheet("Partner", 85, columnvalue));
		entercity(BaseLibrary.getdatabasedonsheet("Partner", 86, columnvalue));
		enterZipcode(BaseLibrary.getdatabasedonsheet("Partner", 87, columnvalue));
		enterPhone(BaseLibrary.getdatabasedonsheet("Partner", 88, columnvalue));
		enterEmail(BaseLibrary.getdatabasedonsheet("Partner", 89, columnvalue));
		enterAlternativeEmail(BaseLibrary.getdatabasedonsheet("Partner", 90, columnvalue));
		Actions actions = new Actions(driver);
		actions.moveToElement(intermediarySWIFT).perform();
		enterIntermediarySWIFT(BaseLibrary.getdatabasedonsheet("Partner", 91, columnvalue));
		enterIntermediaryBankName(BaseLibrary.getdatabasedonsheet("Partner", 92, columnvalue));
		enterIntermediaryBankCountry(BaseLibrary.getdatabasedonsheet("Partner", 93, columnvalue));
		actions.moveToElement(escrowAccountID).perform();
		enterEscrowAccountID(BaseLibrary.getdatabasedonsheet("Partner", 94, columnvalue));
		enterEscrowAccountNo(BaseLibrary.getdatabasedonsheet("Partner", 95, columnvalue));
		actions.moveToElement(iFAAccountNo).perform();
		enterIFAAccountID(BaseLibrary.getdatabasedonsheet("Partner", 96, columnvalue));
		enterIFAAccountNo(BaseLibrary.getdatabasedonsheet("Partner", 97, columnvalue));
		enterHouseAccountNO(BaseLibrary.getdatabasedonsheet("Partner", 98, columnvalue));
		enterHouseAccountID(BaseLibrary.getdatabasedonsheet("Partner", 99, columnvalue));
		actions.moveToElement(suspenseAccountID).perform();
		enterSuspenseAccountID(BaseLibrary.getdatabasedonsheet("Partner", 100, columnvalue));
		enterSuspenseAccountNO(BaseLibrary.getdatabasedonsheet("Partner", 101, columnvalue));
	}

	public void feedvaildminmaxdatatoallsettlementfields(int columnvalue) throws Exception {
		BaseLibrary.waitforelement(SettlemenTAccountingStatementsTab);
		BaseLibrary.clickelement(SettlemenTAccountingStatementsTab);
		BaseLibrary.waitforelement(prefix);
		enterPrefix(BaseLibrary.getdatabasedonsheet("Partner", 103, columnvalue));
		enterLanguage(BaseLibrary.getdatabasedonsheet("Partner", 104, columnvalue));
		enterClearingCode(BaseLibrary.getdatabasedonsheet("Partner", 105, columnvalue));
		enterCompanyName(BaseLibrary.getdatabasedonsheet("Partner", 106, columnvalue));
		enterFinancing_Spread_Tier_3(BaseLibrary.getdatabasedonsheet("Partner", 107, columnvalue));
		enterRegulatorID(BaseLibrary.getdatabasedonsheet("Partner", 108, columnvalue));
		enterCountryID(BaseLibrary.getdatabasedonsheet("Partner", 110, columnvalue));
		enterMarginDefault(BaseLibrary.getdatabasedonsheet("Partner", 111, columnvalue));
		enterPrefixPractice(BaseLibrary.getdatabasedonsheet("Partner", 112, columnvalue));
		// enterWLPId(BaseLibrary.getdatabasedonsheet("Partner", 113, columnvalue));
		enterWLPHash(BaseLibrary.getdatabasedonsheet("Partner", 114, columnvalue));
		enterCurrencies(BaseLibrary.getdatabasedonsheet("Partner", 115, columnvalue));
		enterMarginMin(BaseLibrary.getdatabasedonsheet("Partner", 116, columnvalue));
		enterRiskownedbyID(BaseLibrary.getdatabasedonsheet("Partner", 117, columnvalue));
		enterContactPhoneWork(BaseLibrary.getdatabasedonsheet("Partner", 118, columnvalue));
		enterContactPhoneMobile(BaseLibrary.getdatabasedonsheet("Partner", 119, columnvalue));
		enterContraSubAccount(BaseLibrary.getdatabasedonsheet("Partner", 120, columnvalue));
		enterAllowedCountryList(BaseLibrary.getdatabasedonsheet("Partner", 121, columnvalue));
		enterDefaultWatchList(BaseLibrary.getdatabasedonsheet("Partner", 122, columnvalue));
		enterInstrumentWhiteList(BaseLibrary.getdatabasedonsheet("Partner", 123, columnvalue));
		enterDefaultFavorites(BaseLibrary.getdatabasedonsheet("Partner", 124, columnvalue));
		enterDefaultRecentInstruments(BaseLibrary.getdatabasedonsheet("Partner", 125, columnvalue));
		enterTaxID(BaseLibrary.getdatabasedonsheet("Partner", 126, columnvalue));
		enterIRSTXMControl(BaseLibrary.getdatabasedonsheet("Partner", 127, columnvalue));
		enterIRSContactName(BaseLibrary.getdatabasedonsheet("Partner", 128, columnvalue));
		enterIRSTaxContactTitle(BaseLibrary.getdatabasedonsheet("Partner", 129, columnvalue));
		enterIRSContactPhone(BaseLibrary.getdatabasedonsheet("Partner", 130, columnvalue));
		Actions actions = new Actions(driver);
		actions.moveToElement(footer_two).perform();
		enterFooter(BaseLibrary.getdatabasedonsheet("Partner", 131, columnvalue));
		enterDisclaimer(BaseLibrary.getdatabasedonsheet("Partner", 132, columnvalue));
		enterFooter_two(BaseLibrary.getdatabasedonsheet("Partner", 133, columnvalue));
		enterDisclaimer_two(BaseLibrary.getdatabasedonsheet("Partner", 134, columnvalue));
//		File upload yet to add
	}

	public void feedvaildminmaxdatatoallofficefields(int columnvalue) throws Exception {
		BaseLibrary.waitforelement(OfficeSubOfficeTab);
		BaseLibrary.clickelement(OfficeSubOfficeTab);
		BaseLibrary.waitforelement(officeName);
		enterOfficeName(BaseLibrary.getdatabasedonsheet("Partner", 136, columnvalue));
		enterOfficeCode(BaseLibrary.getdatabasedonsheet("Partner", 137, columnvalue));
		enterDescription(BaseLibrary.getdatabasedonsheet("Partner", 138, columnvalue));
		enterFundingAddressLine1(BaseLibrary.getdatabasedonsheet("Partner", 139, columnvalue));
		enterFundingAddressLine2(BaseLibrary.getdatabasedonsheet("Partner", 140, columnvalue));
		enterFundingAddressLine3(BaseLibrary.getdatabasedonsheet("Partner", 141, columnvalue));
		enterCountry(BaseLibrary.getdatabasedonsheet("Partner", 142, columnvalue));
		enterState(BaseLibrary.getdatabasedonsheet("Partner", 143, columnvalue));
		entercity(BaseLibrary.getdatabasedonsheet("Partner", 144, columnvalue));
		enterZipcode(BaseLibrary.getdatabasedonsheet("Partner", 145, columnvalue));
		enterPhone(BaseLibrary.getdatabasedonsheet("Partner", 146, columnvalue));
		enterEmail(BaseLibrary.getdatabasedonsheet("Partner", 147, columnvalue));
		Actions actions = new Actions(driver);
		actions.moveToElement(subOfficeName).perform();
		enterSubOfficeName(BaseLibrary.getdatabasedonsheet("Partner", 148, columnvalue));
		enterCode(BaseLibrary.getdatabasedonsheet("Partner", 149, columnvalue));
		enterPurpose(BaseLibrary.getdatabasedonsheet("Partner", 150, columnvalue));
		officefileupload();
//		file upload yet to update
	}

	public void feedvaildminmaxdatatoallreportfields(int columnvalue) throws Exception {
		BaseLibrary.waitforelement(ReportsDocumentsTab);
		BaseLibrary.clickelement(ReportsDocumentsTab);
		BaseLibrary.waitforelement(documentCode);
		enterDocumentCode(BaseLibrary.getdatabasedonsheet("Partner", 161, columnvalue));
		enterDocumentName(BaseLibrary.getdatabasedonsheet("Partner", 162, columnvalue));
		enterEntryDate(BaseLibrary.getdatabasedonsheet("Partner", 163, columnvalue));
		enterDueDate(BaseLibrary.getdatabasedonsheet("Partner", 164, columnvalue));
		enterExpDate(BaseLibrary.getdatabasedonsheet("Partner", 165, columnvalue));
		enterRemarks(BaseLibrary.getdatabasedonsheet("Partner", 166, columnvalue));
		reportfileupload();
	}
	
	public void searchwithonefilter() throws Exception {
		BaseLibrary.waitforelement(filter_partnerName);
		BaseLibrary.typetext(filter_partnerName, partnerName);
		BaseLibrary.clickelement(filterSearchButton);
		BaseLibrary.clickelement(filtercloseButton);
	}
	
	public void searchwithvaildonefilter(String Partner_name) throws Exception {
		BaseLibrary.waitforelement(filter_partnerName);
		BaseLibrary.typetext(filter_partnerName, Partner_name);
		BaseLibrary.clickelement(filterSearchButton);
		BaseLibrary.clickelement(filtercloseButton);
	}

	public void recordsonentity() throws Exception {
		Thread.sleep(5000);
		BaseLibrary.waitforelement(tableFirstRow);
		Assert.assertEquals(partnerName, partnernamehyperlink.getText());
	}
	
	public void recordsvaildonentity(String Partner_name) throws Exception {
		Thread.sleep(5000);
		BaseLibrary.waitforelement(tableFirstRow);
		Assert.assertEquals(Partner_name, partnernamehyperlink.getText());
	}


	public void partneruniversalsearch(String input) throws Exception {
		Thread.sleep(2000);
		BaseLibrary.waitforelement(tableFirstRow);
		BaseLibrary.waitforelement(universalsearch);
		if (input.equalsIgnoreCase("valid")) {
			BaseLibrary.typetext(universalsearch,partnerName);
			BaseLibrary.waitforelement(tableFirstRow);
		} else {
			BaseLibrary.typetext(universalsearch, BaseLibrary.randomstringgenerator(5));
		}
	}

	public void searchwithoneinvalidfilter() throws Exception {
		Thread.sleep(2000);
		BaseLibrary.waitforelement(filter_partnerName);
		BaseLibrary.typetext(filter_partnerName, BaseLibrary.randomstringgenerator(7));
		BaseLibrary.clickelement(filterSearchButton);
		BaseLibrary.clickelement(filtercloseButton);
	}

	public void searchwithmultiplefilter(String searchone,String searchtwo) throws Exception {
		BaseLibrary.waitforelement(filter_partnerName);
		BaseLibrary.typetext(filter_partnerName, searchone);
		BaseLibrary.waitforelement(filter_wlpId);
		BaseLibrary.typetext(filter_wlpId, searchtwo);
		BaseLibrary.clickelement(filterSearchButton);
		BaseLibrary.clickelement(filtercloseButton);
	}

	public void searchwithmultipleinvalidfilter() throws Exception {
		BaseLibrary.waitforelement(filter_partnerName);
		BaseLibrary.typetext(filter_partnerName, BaseLibrary.randomstringgenerator(10));
		BaseLibrary.waitforelement(filter_wlpId);
		BaseLibrary.typetext(filter_wlpId, BaseLibrary.randomnumbergenerator(7));
		BaseLibrary.clickelement(filterSearchButton);
		BaseLibrary.clickelement(filtercloseButton);
	}
	
	public void partneruniversalsearch(String input,String Partnername) throws Exception {
		Thread.sleep(2000);
		BaseLibrary.waitforelement(tableFirstRow);
		BaseLibrary.waitforelement(universalsearch);
		if (input.equalsIgnoreCase("valid")) {
			BaseLibrary.typetext(universalsearch, Partnername);
			BaseLibrary.waitforelement(tableFirstRow);
		} else {
			BaseLibrary.typetext(universalsearch, BaseLibrary.randomstringgenerator(5));
		}
	}
	
	public void clickSearchIcon() throws Exception {
		BaseLibrary.waitforelement(searchicon);
		BaseLibrary.clickelement(searchicon);
	}


	public void feedvailddatatomandatoryofficefieldsonpartner(String officename,String officecode,String subofficename,String subofficecode) throws Exception {
		BaseLibrary.waitforelement(OfficeSubOfficeTab);
		BaseLibrary.clickelement(OfficeSubOfficeTab);
		BaseLibrary.waitforelement(officeName);
		enterOfficeName(officename);
		enterOfficeCode(officecode);
		enterDescription(BaseLibrary.getdatabasedonsheet("Partner", 138, 1));
		enterFundingAddressLine1(BaseLibrary.getdatabasedonsheet("Partner", 139, 1));
		enterCountry(BaseLibrary.getdatabasedonsheet("Partner", 142, 1));
		enterState(BaseLibrary.getdatabasedonsheet("Partner", 143, 1));
		entercity(BaseLibrary.getdatabasedonsheet("Partner", 144, 1));
		enterZipcode(BaseLibrary.getdatabasedonsheet("Partner", 145, 1));
		enterPhone(BaseLibrary.getdatabasedonsheet("Partner", 146, 1));
		enterEmail(BaseLibrary.getdatabasedonsheet("Partner", 147, 1));
		enterSubOfficeName(subofficename);
		enterCode(subofficecode);
		enterPurpose(BaseLibrary.getdatabasedonsheet("Partner", 150, 1));
	}
	public void feedvailddatatomandatorypartnerinformationfieldsforotherscreen(String Partnername, String brokerpartner, String businessstructure,String wipid) throws Exception {
		enterPartnerName(Partnername);
		enterPartnerType(brokerpartner);
		enterKYCMode(BaseLibrary.getdatabasedonsheet("Partner", 6, 1));
		enterPartnerWebsite(BaseLibrary.getdatabasedonsheet("Partner", 7, 1));
		enterWLPId(wipid);
		enterAddressType(BaseLibrary.getdatabasedonsheet("Partner", 9, 1));
		enterAddressLine1(BaseLibrary.getdatabasedonsheet("Partner", 10, 1));
		enterCity(BaseLibrary.getdatabasedonsheet("Partner", 12, 1));
		enterState(BaseLibrary.getdatabasedonsheet("Partner", 13, 1));
		enterCountry(BaseLibrary.getdatabasedonsheet("Partner", 14, 1));
		enterZipcode(BaseLibrary.getdatabasedonsheet("Partner", 15, 1));
		enterEmail(BaseLibrary.getdatabasedonsheet("Partner", 16, 1));
		enterPhone(BaseLibrary.getdatabasedonsheet("Partner", 18, 1));
		enterStockTicker(BaseLibrary.getdatabasedonsheet("Partner", 21, 1));
		enterBusinessStructureType(businessstructure);
		enterDirectorCount(BaseLibrary.getdatabasedonsheet("Partner", 31, 1));
		enterMPID(BaseLibrary.getdatabasedonsheet("Partner", 32, 1));
		enterFinraNum(BaseLibrary.getdatabasedonsheet("Partner", 33, 1));
		enterSECRegNum(BaseLibrary.getdatabasedonsheet("Partner", 34, 1));
		enterStatus(BaseLibrary.getdatabasedonsheet("Partner", 35, 1));
	}

	public void feedvailddatatomandatoryofficefieldsforotherscreen() throws Exception {
		BaseLibrary.waitforelement(OfficeSubOfficeTab);
		BaseLibrary.clickelement(OfficeSubOfficeTab);
		BaseLibrary.waitforelement(officeName);
		enterOfficeName(BaseLibrary.randomstringgenerator(7));
		enterOfficeCode(BaseLibrary.randomnumbergenerator(8));
		enterDescription(BaseLibrary.getdatabasedonsheet("Partner", 138, 1));
		enterFundingAddressLine1(BaseLibrary.getdatabasedonsheet("Partner", 139, 1));
		enterCountry(BaseLibrary.getdatabasedonsheet("Partner", 142, 1));
		enterState(BaseLibrary.getdatabasedonsheet("Partner", 143, 1));
		entercity(BaseLibrary.getdatabasedonsheet("Partner", 144, 1));
		enterZipcode(BaseLibrary.getdatabasedonsheet("Partner", 145, 1));
		enterPhone(BaseLibrary.getdatabasedonsheet("Partner", 146, 1));
		enterEmail(BaseLibrary.getdatabasedonsheet("Partner", 147, 1));
	}

}
