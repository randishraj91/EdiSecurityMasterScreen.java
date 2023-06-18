package pageObjects;

import baseMethods.BaseLibrary;
import baseMethods.DataDrivenUtility;
import baseMethods.Threadmanager;
import io.cucumber.java.en.Then;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class UserScreen {

	WebDriver driver;

	@FindBy(xpath = "//a[text()='Users and Accounts']")
	private WebElement useracc_submenu;

	@FindBy(xpath = "//label[text()='Select partner']")
	private WebElement selectpartner;

	@FindBy(xpath = "//div[@class='partner-list open']//input[@placeholder='Search...']")
	private WebElement searchpartner;

	@FindBy(xpath = "(//div[@class='partner-list open']//li//span)[1]")
	private WebElement firstitem;

	@FindBy(xpath = "//span[text()='Add New User']//parent::button")
	private WebElement addnewuser;

	@FindBy(xpath = "//div[@role='radiogroup']//span[text()='Institutional']")
	private WebElement usertype_institutional_checkbox;

	@FindBy(xpath = "(//div[@role='radiogroup']//span[text()='Director'])[1]")
	private WebElement usertype_director_checkbox;

	@FindBy(xpath = "(//div[@role='radiogroup']//span[text()='Director'])[2]")
	private WebElement usercategory_director_checkbox;

	@FindBy(xpath = "//div[@role='radiogroup']//span[text()='RIA Manager']")
	private WebElement usercategory_RIA_checkbox;

	@FindBy(xpath = "//span[text()='Create']//parent::button")
	private WebElement Create_user;

	@FindBy(xpath = "(//label[text()='User*']//following::input)[1]")
	private WebElement User;

	@FindBy(xpath = "(//label[text()='Preferred Language*']//following::input)[1]")
	private WebElement PreferredLanguage;

	@FindBy(xpath = "//label[text()='View Column ']//parent::div")
	private WebElement viewcolumn;
	

	@FindBy(xpath = "//label[text()='Status']//parent::div")
	private WebElement status_label;
	

	@FindBy(xpath = "//span[text()='Status']//parent::div")
	private WebElement status_checkbox;			
			
			
	@FindBy(xpath = "(//label[text()='Sub Office*']//following::input)[1]")
	private WebElement SubOffice;

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
	private WebElement Country;

	@FindBy(xpath = "(//label[text()='Zip code*']//following::input)[1]")
	private WebElement Zipcode;

	@FindBy(xpath = "(//label[text()='Email*']//following::input)[1]")
	private WebElement Email;

	@FindBy(xpath = "(//label[text()='Alternative Email']//following::input)[1]")
	private WebElement AlternativeEmail;

	@FindBy(xpath = "(//label[text()='Phone*']//following::input)[1]")
	private WebElement Phone;

	@FindBy(xpath = "(//label[text()='Instrument Group']//following::input)[1]")
	private WebElement InstrumentGroup;

	@FindBy(xpath = "(//label[text()='Office Code*']//following::input)[1]")
	private WebElement OfficeCode;

	@FindBy(xpath = "(//label[text()='Referral Code']//following::input)[1]")
	private WebElement ReferralCode;

	@FindBy(xpath = "(//label[text()='Referral No']//following::input)[1]")
	private WebElement ReferralNo;

	@FindBy(xpath = "(//label[text()='Status*']//following::input)[1]")
	private WebElement Basic_Status;

	@FindBy(xpath = "(//label[text()='Tenancy Designation']//following::input)[1]")
	private WebElement TenancyDesignation;

	@FindBy(xpath = "(//label[text()='US Referrer Id*']//following::input)[1]")
	private WebElement USReferrerId;

	@FindBy(xpath = "(//label[text()='Display Name']//following::input)[1]")
	private WebElement DisplayName;

	@FindBy(xpath = "(//label[text()='External Account Sent At?']//following::input)[1]")
	private WebElement ExternalAccountSentAt;

	@FindBy(xpath = "(//label[text()='External Connection Via']//following::input)[1]")
	private WebElement ExternalConnectionVia;

	@FindBy(xpath = "(//label[text()='External Username*']//following::input)[1]")
	private WebElement ExternalUsername;

	@FindBy(xpath = "(//label[text()='External Password*']//following::input)[1]")
	private WebElement ExternalPassword;

	@FindBy(xpath = "(//label[text()='Legal and Complianc']//following::input)[1]")
	private WebElement LegalandComplianc;

	@FindBy(xpath = "//label[text()='Funding Sources*']//parent::div")
	private WebElement FundingSources;

	@FindBy(xpath = "//span[text()='Employment']")
	private WebElement FundingSources_Employment;

	@FindBy(xpath = "(//label[text()='Metadata']//following::input)[1]")
	private WebElement Metadata;

	@FindBy(xpath = "(//label[text()='Commission Rate*']//following::input)[1]")
	private WebElement CommissionRate;

	@FindBy(xpath = "(//label[text()='Taxed Country Code*']//following::input)[1]")
	private WebElement TaxedCountryCode;

	@FindBy(xpath = "(//label[text()='Tax Recipient Code*']//following::input)[1]")
	private WebElement TaxRecipientCode;

	@FindBy(xpath = "(//label[text()='Tax Status Code*']//following::input)[1]")
	private WebElement TaxStatusCode;

	@FindBy(xpath = "(//label[text()='Tefra ID*']//following::input)[1]")
	private WebElement TefraID;

	@FindBy(xpath = "(//label[text()='Last Money Movement When?*']//following::input)[1]")
	private WebElement LastMoneyMovementWhen;

	@FindBy(xpath = "(//label[text()='Last Rebalance When?*']//following::input)[1]")
	private WebElement LastRebalanceWhen;

	@FindBy(xpath = "(//label[text()='Next Rebalance When?*']//following::input)[1]")
	private WebElement NextRebalanceWhen;

	@FindBy(xpath = "(//label[text()='Cleanup Account ID*']//following::input)[1]")
	private WebElement CleanupAccountID;

	@FindBy(xpath = "(//label[text()='Cleanup Account No*']//following::input)[1]")
	private WebElement CleanupAccountNo;

	@FindBy(xpath = "(//label[text()='Master Trading Account Id*']//following::input)[1]")
	private WebElement MasterTradingAccountId;

	@FindBy(xpath = "(//label[text()='Master Trading Account No*']//following::input)[1]")
	private WebElement MasterTradingAccountNo;

	@FindBy(xpath = "(//label[text()='Minimum Orders*']//following::input)[1]")
	private WebElement MinimumOrders;

	@FindBy(xpath = "(//label[text()='Minimum Order Amount*']//following::input)[1]")
	private WebElement MinimumOrderAmount;

	@FindBy(xpath = "(//label[text()='Next Money Movement At?*']//following::input)[1]")
	private WebElement NextMoneyMovementAt;

	@FindBy(xpath = "(//label[text()='Last Force Rebalance When?*']//following::input)[1]")
	private WebElement LastForceRebalanceWhen;

	@FindBy(xpath = "(//label[text()='Rebalance Period*']//following::input)[1]")
	private WebElement RebalancePeriod;

	@FindBy(xpath = "(//label[text()='Money Movement Period*']//following::input)[1]")
	private WebElement MoneyMovementPeriod;

	@FindBy(xpath = "(//label[text()='RIA ID*']//following::input)[1]")
	private WebElement RIAID;

	@FindBy(xpath = "(//label[text()='RIA Portfolio ID*']//following::input)[1]")
	private WebElement RIAPortfolioID;

	@FindBy(xpath = "(//label[text()='RIA Product ID*']//following::input)[1]")
	private WebElement RIAProductID;

	@FindBy(xpath = "//span[text()='Add another document']//parent::button")
	private WebElement addanotherdocument;

	@FindBy(xpath = "(//label[text()='Document Code*']//following::input)[1]")
	private WebElement DocumentCode;

	@FindBy(xpath = "(//label[text()='Document Name*']//following::input)[1]")
	private WebElement DocumentName;

	@FindBy(xpath = "(//label[text()='Entry Date*']//following::input)[1]")
	private WebElement EntryDate;

	@FindBy(xpath = "(//label[text()='Due Date*']//following::input)[1]")
	private WebElement DueDate;

	@FindBy(xpath = "(//label[text()='Expiration Date*']//following::input)[1]")
	private WebElement ExpirationDate;

	@FindBy(xpath = "(//label[text()='Status*']//following::input)[1]")
	private WebElement Supporting_Status;

	@FindBy(xpath = "((//label[text()='Document Code*'])[2]//following::input)[1]")
	private WebElement DocumentCode_2;

	@FindBy(xpath = "((//label[text()='Document Name*'])[2]//following::input)[1]")
	private WebElement DocumentName_2;

	@FindBy(xpath = "((//label[text()='Entry Date*'])[2]//following::input)[1]")
	private WebElement EntryDate_2;

	@FindBy(xpath = "((//label[text()='Due Date*'])[2]//following::input)[1]")
	private WebElement DueDate_2;

	@FindBy(xpath = "((//label[text()='Expiration Date*'])[2]//following::input)[1]")
	private WebElement ExpirationDate_2;

	@FindBy(xpath = "((//label[text()='Status*'])[2]//following::input)[1]")
	private WebElement Supporting_Status_2;

	@FindBy(xpath = "(//label[text()='Category*']//following::input)[1]")
	private WebElement Category;

	@FindBy(xpath = "(//label[text()='Subject*']//following::input)[1]")
	private WebElement Subject;

	@FindBy(xpath = "(//label[text()='Note*']//following::input)[1]")
	private WebElement Note;
	
	@FindBy(xpath = "((//label[text()='Category*'])[2]//following::input)[1]")
	private WebElement Category_2;

	@FindBy(xpath = "((//label[text()='Subject*'])[2]//following::input)[1]")
	private WebElement Subject_2;

	@FindBy(xpath = "((//label[text()='Note*'])[2]//following::input)[1]")
	private WebElement Note_2;
	
	@FindBy(xpath = "//span[text()='Basic & Communication Info']")
	private WebElement Basicinfo;

	@FindBy(xpath = "//span[text()='Legal and Compliance']")
	private WebElement Legal;

	@FindBy(xpath = "//span[text()='Cancel']")
	private WebElement Cancel_button;

	@FindBy(xpath = "//span[text()='Autopilot']")
	private WebElement Autopilot;

	@FindBy(xpath = "//span[text()='Supporting Documentation']")
	private WebElement Supportingdoc;

	@FindBy(xpath = "//span[text()='Notes']")
	private WebElement Notes;
	
	@FindBy(xpath = "//span[text()='Add another note']")
	private WebElement Add_another_Notes;
	
	
	@FindBy(xpath = "//ul[@class='tab-click']//span[text()='Users']")
	private WebElement usertab;
	
	@FindBy(xpath = "//ul[@class='tab-click']//span[text()='Accounts']")
	private WebElement accountstab;
	
	
	@FindBy(xpath = "//textarea[text()='Single Notes']")
	private WebElement Notes_text;

	@FindBy(xpath = "//textarea[text()='Multi Notes']")
	private WebElement Notes_text_2;

	@FindBy(xpath = "(//input[@type='file'])[1]")
	private WebElement upload_supportingdocument;

	@FindBy(xpath = "//label[text()='File format not supported']")
	private WebElement invaild_alert;

	@FindBy(xpath = "//i[@title='Download File']")
	private WebElement download_supportingdocument;

	@FindBy(xpath = "//i[@title='Delete File']")
	private WebElement download_deleting_supportingdocument;

	@FindBy(xpath = "//span[text()='To upload file']")
	private WebElement upload_label;

	@FindBy(xpath = "//button[@tabindex='0']//span[text()='Save']")
	private WebElement userSave;

	@FindBy(xpath = "//span[text()='Create']")
	private WebElement usercreate;

	@FindBy(xpath = "//input[@id='filter_accounts']")
	private WebElement filter_accounts;
	
	@FindBy(xpath = "//button[text()='1']")
	private WebElement page_number;
	
	@FindBy(xpath = "//span[text()='Next']")
	private WebElement Next_button;
	
	@FindBy(xpath = "//span[text()='Previous']")
	private WebElement Previous_button;
	
	@FindBy(xpath = "//span[text()='Clear Filter']")
	private WebElement clearfilter;
	
	@FindBy(xpath = "//span[text()='Reset']")
	private WebElement Resetbutton;
	
	@FindBy(xpath = "//label[@data-shrink='false' and text()='User']")
	private WebElement cleardata;
	

	@FindBy(xpath = "//input[@id='filter_userName']")
	private WebElement filter_UserName;

	@FindBy(xpath = "//span[text()='Search']")
	private WebElement filterSearchButton;

	@FindBy(xpath = "//div[@class='filter-section']//i[@class='close-icon']")
	private WebElement filtercloseButton;

	@FindBy(xpath = "//td[@id='row-0-cell-0']")
	private WebElement Usernamehyperlink;

	@FindBy(xpath = "//tbody/tr[1]")
	private WebElement tableFirstRow;

	@FindBy(xpath = "//tbody/tr[2]")
	private WebElement tableSecondRow;

	
	@FindBy(xpath = "//input[@id='outlined-basic']")
	private WebElement universalsearch;	

	@FindBy(xpath = "//i[@class='search-icon']")
	private WebElement searchicon;
	
	@FindBy(xpath = "//span[text()='Director User']")
	private WebElement Directional_user;

	@FindBy(xpath = "//span[text()='User']//parent::button")
	private WebElement User_tab;

	@FindBy(xpath = "//span[text()='Edit']//parent::button")
	private WebElement editicon;

	@FindBy(xpath = "(//label[text()='First Name*']//following::input)[1]")
	private WebElement FirstName;

	@FindBy(xpath = "(//label[text()='Middle Name']//following::input)[1]")
	private WebElement MiddleName;

	@FindBy(xpath = "(//label[text()='Last Name*']//following::input)[1]")
	private WebElement LastName;

	@FindBy(xpath = "(//label[text()='Corporate Doc Reviewed At*']//following::input)[1]")
	private WebElement CorporateDocReviewedAt;

	@FindBy(xpath = "(//label[text()='Corporate Doc Reviewed By*']//following::input)[1]")
	private WebElement CorporateDocReviewedBy;

	@FindBy(xpath = "(//label[text()='Director Of*']//following::input)[1]")
	private WebElement DirectorOf;

	@FindBy(xpath = "(//label[text()='User Attributes*']//following::input)[1]")
	private WebElement UserAttributes;

	@FindBy(xpath = "(//label[text()='User Info Documents*']//following::input)[1]")
	private WebElement UserInfoDocuments;

	@FindBy(xpath = "(//label[text()='Identification Type*']//following::input)[1]")
	private WebElement IdentificationType;

	@FindBy(xpath = "(//label[text()='Identification No*']//following::input)[1]")
	private WebElement IdentificationNo;

	@FindBy(xpath = "(//label[text()='Identification Description*']//following::input)[1]")
	private WebElement IdentificationDescription;

	@FindBy(xpath = "(//label[text()='Country of Citizenship*']//following::input)[1]")
	private WebElement citizenship;

	@FindBy(xpath = "(//label[text()='Secondary Country of Citizenship*']//following::input)[1]")
	private WebElement secondary_citizenship;

	@FindBy(xpath = "(//label[text()='Acknowledged Signed By*']//following::input)[1]")
	private WebElement AcknowledgedSignedBy;

	@FindBy(xpath = "(//label[text()='Work Title*']//following::input)[1]")
	private WebElement WorkTitle;

	public static String User_Name, First_Name;

	public UserScreen() {
		this.driver = Threadmanager.getdriver();
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
	}

	public void chooseusertype(String Usertype) throws Exception {
		if (Usertype.equalsIgnoreCase("Institutional")) {
			BaseLibrary.clickelement(usertype_institutional_checkbox);
		} else if (Usertype.equalsIgnoreCase("Director")) {
			BaseLibrary.clickelement(usertype_director_checkbox);
			BaseLibrary.clickelement(usercategory_director_checkbox);
		}
	}

	public void clickcreateuser() throws Exception {
		BaseLibrary.clickelement(Create_user);
		BaseLibrary.waitforelement(Basicinfo);
	}

	public void clickuseraccountsubmenu() throws Exception {
		BaseLibrary.waitforelement(useracc_submenu);
		BaseLibrary.jsclickelement(useracc_submenu);
		BaseLibrary.waitforelement(selectpartner);
	}

	public void choosepartner(String Partnername) throws Exception {
		BaseLibrary.waitforelement(selectpartner);
		BaseLibrary.clickelement(selectpartner);
		Thread.sleep(2000);
		BaseLibrary.typetext(searchpartner, Partnername);
		Thread.sleep(2000);
		BaseLibrary.clickelement(firstitem);
	}

	public void clickadduser() throws Exception {
		BaseLibrary.waitforelement(addnewuser);
		BaseLibrary.clickelement(addnewuser);
	}

	public void enterUser(String user) throws Exception {
		BaseLibrary.typetext(User, user);
		User_Name = user;
	}

	public void enterPreferredLanguage(String preferredlanguage) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(PreferredLanguage, preferredlanguage, 1);
	}

	public void enterWorkTitle(String Worktitle) throws Exception {
		BaseLibrary.typetext(WorkTitle, Worktitle);
	}

	public void enterSubOffice(String suboffice) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(SubOffice, suboffice, 1);
	}

	public void enterAddressType(String addresstype) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(AddressType, addresstype, 1);
	}

	public void enterAddressLine1(String addressline1) throws Exception {
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

	public void enterCountry(String country) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(Country, country, 1);
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

	public void enterInstrumentGroup(String instrumentgroup) throws Exception {
		BaseLibrary.typetext(InstrumentGroup, instrumentgroup);
	}

	public void enterOfficeCode(String officecode) throws Exception {
		BaseLibrary.typetext(OfficeCode, officecode);
	}

	public void enterReferralCode(String referralcode) throws Exception {
		BaseLibrary.typetext(ReferralCode, referralcode);
	}

	public void enterReferralNo(String referralno) throws Exception {
		BaseLibrary.typetext(ReferralNo, referralno);
	}

	public void enterBasic_Status(String basic_status) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(Basic_Status, basic_status, 1);
	}

	public void enterTenancyDesignation(String tenancydesignation) throws Exception {
		BaseLibrary.typetext(TenancyDesignation, tenancydesignation);
	}

	public void enterUSReferrerId(String usreferrerid) throws Exception {
		BaseLibrary.typetext(USReferrerId, usreferrerid);
	}

	public void enterDisplayName(String displayname) throws Exception {
		BaseLibrary.typetext(DisplayName, displayname);
	}

	public void enterExternalAccountSentAt(String externalaccountsentat) throws Exception {
		BaseLibrary.typetext(ExternalAccountSentAt, externalaccountsentat);
	}

	public void enterExternalConnectionVia(String externalconnectionvia) throws Exception {
		BaseLibrary.typetext(ExternalConnectionVia, externalconnectionvia);
	}

	public void enterExternalUsername(String externalusername) throws Exception {
		BaseLibrary.typetext(ExternalUsername, externalusername);
	}

	public void enterExternalPassword(String externalpassword) throws Exception {
		BaseLibrary.typetext(ExternalPassword, externalpassword);
	}

	public void enterLegalandComplianc(String legalandcomplianc) throws Exception {
		BaseLibrary.typetext(LegalandComplianc, legalandcomplianc);
	}

	public void enterFundingSources(String fundingsources) throws Exception {
		BaseLibrary.clickelement(FundingSources);
		BaseLibrary.waitforelement(FundingSources_Employment);
		BaseLibrary.clickelement(FundingSources_Employment);
		BaseLibrary.jsclickelement(Supportingdoc);
		BaseLibrary.jsclickelement(Legal);
	}

	public void enterMetadata(String metadata) throws Exception {
		BaseLibrary.typetext(Metadata, metadata);
	}

	public void enterCommissionRate(String commissionrate) throws Exception {

		BaseLibrary.typetext(CommissionRate, commissionrate);
	}

	public void enterTaxedCountryCode(String taxedcountrycode) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(TaxedCountryCode, taxedcountrycode, 1);
	}

	public void enterTaxRecipientCode(String taxrecipientcode) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(TaxRecipientCode, taxrecipientcode, 1);
	}

	public void enterTaxStatusCode(String taxstatuscode) throws Exception {
		BaseLibrary.typetext(TaxStatusCode, taxstatuscode);
	}

	public void enterTefraID(String tefraid) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(TefraID, tefraid, 1);
	}

	public void enterLastMoneyMovementWhen(String lastmoneymovementwhen) throws Exception {
		BaseLibrary.typetext(LastMoneyMovementWhen, lastmoneymovementwhen);
	}

	public void enterLastRebalanceWhen(String lastrebalancewhen) throws Exception {
		BaseLibrary.typetext(LastRebalanceWhen, lastrebalancewhen);
	}

	public void enterNextRebalanceWhen(String nextrebalancewhen) throws Exception {
		BaseLibrary.typetext(NextRebalanceWhen, nextrebalancewhen);
	}

	public void enterCleanupAccountID(String cleanupaccountid) throws Exception {
		BaseLibrary.typetext(CleanupAccountID, cleanupaccountid);
	}

	public void enterCleanupAccountNo(String cleanupaccountno) throws Exception {
		BaseLibrary.typetext(CleanupAccountNo, cleanupaccountno);
	}

	public void enterMasterTradingAccountId(String mastertradingaccountid) throws Exception {
		BaseLibrary.typetext(MasterTradingAccountId, mastertradingaccountid);
	}

	public void enterMasterTradingAccountNo(String mastertradingaccountno) throws Exception {
		BaseLibrary.typetext(MasterTradingAccountNo, mastertradingaccountno);
	}

	public void enterMinimumOrders(String minimumorders) throws Exception {
		BaseLibrary.typetext(MinimumOrders, minimumorders);
	}

	public void enterMinimumOrderAmount(String minimumorderamount) throws Exception {
		BaseLibrary.typetext(MinimumOrderAmount, minimumorderamount);
	}

	public void enterNextMoneyMovementAt(String nextmoneymovementat) throws Exception {
		BaseLibrary.typetext(NextMoneyMovementAt, nextmoneymovementat);
	}

	public void enterLastForceRebalanceWhen(String lastforcerebalancewhen) throws Exception {
		BaseLibrary.typetext(LastForceRebalanceWhen, lastforcerebalancewhen);
	}

	public void enterRebalancePeriod(String rebalanceperiod) throws Exception {
		BaseLibrary.typetext(RebalancePeriod, rebalanceperiod);
	}

	public void enterMoneyMovementPeriod(String moneymovementperiod) throws Exception {
		BaseLibrary.typetext(MoneyMovementPeriod, moneymovementperiod);
	}

	public void enterRIAID(String riaid) throws Exception {
		BaseLibrary.typetext(RIAID, riaid);
	}

	public void enterRIAPortfolioID(String riaportfolioid) throws Exception {
		BaseLibrary.typetext(RIAPortfolioID, riaportfolioid);
	}

	public void enterRIAProductID(String riaproductid) throws Exception {
		BaseLibrary.typetext(RIAProductID, riaproductid);
	}

	public void enterDocumentCode(String documentcode) throws Exception {
		BaseLibrary.typetext(DocumentCode, documentcode);
	}

	public void enterDocumentName(String documentname) throws Exception {
		BaseLibrary.typetext(DocumentName, documentname);
	}

	public void enterEntryDate(String entrydate) throws Exception {
		BaseLibrary.typetext(EntryDate, entrydate);
	}

	public void enterDueDate(String duedate) throws Exception {
		BaseLibrary.typetext(DueDate, duedate);
	}

	public void enterExpirationDate(String expirationdate) throws Exception {
		BaseLibrary.typetext(ExpirationDate, expirationdate);
	}

	public void enterSupporting_Status(String supporting_status) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(Supporting_Status, supporting_status, 1);
	}

	public void enterDocumentCode_2(String documentcode) throws Exception {
		BaseLibrary.typetext(DocumentCode_2, documentcode);
	}

	public void enterDocumentName_2(String documentname) throws Exception {
		BaseLibrary.typetext(DocumentName_2, documentname);
	}

	public void enterEntryDate_2(String entrydate) throws Exception {
		BaseLibrary.typetext(EntryDate_2, entrydate);
	}

	public void enterDueDate_2(String duedate) throws Exception {
		BaseLibrary.typetext(DueDate_2, duedate);
	}

	public void enterExpirationDate_2(String expirationdate) throws Exception {
		BaseLibrary.typetext(ExpirationDate_2, expirationdate);
	}

	public void enterSupporting_Status_2(String supporting_status) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(Supporting_Status_2, supporting_status, 1);
	}

	public void enterCategory(String category) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(Category, category, 1);
	}

	public void enterSubject(String subject) throws Exception {
		BaseLibrary.typetext(Subject, subject);
	}

	public void enterNote(String note) throws Exception {
		BaseLibrary.typetext(Note, note);
	}
	
	public void enterCategory2(String category) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(Category, category, 1);
	}

	public void enterSubject2(String subject) throws Exception {
		BaseLibrary.typetext(Subject, subject);
	}

	public void enterNote2(String note) throws Exception {
		BaseLibrary.typetext(Note, note);
	}

	public void supportingdocumentfileupload() throws Exception {
		BaseLibrary.fileupload(upload_supportingdocument,
				System.getProperty("user.dir") + "/src/test/resources/TestData/sample.pdf");
	}

	public void supportingdocumentinvaildfileupload() throws Exception {
		BaseLibrary.fileupload(upload_supportingdocument,
				System.getProperty("user.dir") + "/src/test/resources/TestData/DEV_inputdata.xlsx");
		BaseLibrary.waitforelement(invaild_alert);
	}

	public void supportingdocumentfileupload_2() throws Exception {
		BaseLibrary.fileupload(upload_supportingdocument,
				System.getProperty("user.dir") + "/src/test/resources/TestData/sample.pdf");
	}

	public void enterFirstName(String Firstname) throws Exception {
		BaseLibrary.typetext(FirstName, Firstname);
		First_Name = Firstname;
	}

	public void enterMiddleName(String Middlename) throws Exception {
		BaseLibrary.typetext(MiddleName, Middlename);
	}

	public void enterLastName(String Lastname) throws Exception {
		BaseLibrary.typetext(LastName, Lastname);
	}

	public void enterCorporateDocReviewedAt(String corporatedocreviewedat) throws Exception {
		BaseLibrary.typetext(CorporateDocReviewedAt, corporatedocreviewedat);
	}

	public void enterCorporateDocReviewedBy(String corporatedocreviewedby) throws Exception {
		BaseLibrary.typetext(CorporateDocReviewedBy, corporatedocreviewedby);
	}

	public void enterDirectorOf(String directorof) throws Exception {
		BaseLibrary.typetext(DirectorOf, directorof);
	}

	public void enterUserAttributes(String userattributes) throws Exception {
		BaseLibrary.typetext(UserAttributes, userattributes);
	}

	public void enterUserInfoDocuments(String userinfodocuments) throws Exception {
		BaseLibrary.typetext(UserInfoDocuments, userinfodocuments);
	}

	public void enterIdentificationType(String identificationtype) throws Exception {
		BaseLibrary.typetext(IdentificationType, identificationtype);
	}

	public void enterIdentificationNo(String identificationno) throws Exception {
		BaseLibrary.typetext(IdentificationNo, identificationno);
	}

	public void enterIdentificationDescription(String identificationdescription) throws Exception {
		BaseLibrary.typetext(IdentificationDescription, identificationdescription);
	}

	public void enterCountryofCitizenship(String countryofcitizenship) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(citizenship, countryofcitizenship,1);
	}

	public void enterSecondaryCountryofCitizenship(String secondarycountryofcitizenship) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(secondary_citizenship, secondarycountryofcitizenship,1);
	}

	public void enterAcknowledgedSignedBy(String acknowledgedsignedby) throws Exception {
		BaseLibrary.typetext(AcknowledgedSignedBy, acknowledgedsignedby);
	}

	public void feed_vaild_basicinfo(String type, String username, String Suboffice, String Euser, String Epwd)
			throws Exception {
		enterUser(username);
		enterPreferredLanguage(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 2, 1));
		enterSubOffice(Suboffice);
		enterAddressType(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 4, 1));
		enterAddressLine1(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 5, 1));
		enterCity(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 7, 1));
		enterState(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 8, 1));
		enterCountry(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 9, 1));
		enterZipcode(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 10, 1));
		enterEmail(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 11, 1));
		enterPhone(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 13, 1));
		enterOfficeCode(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 15, 1));
		enterBasic_Status(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 18, 1));
		enterUSReferrerId(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 20, 1));
		enterExternalUsername(Euser);
		enterExternalPassword(Epwd);
		if (type.equalsIgnoreCase("Valid")) {
			BaseLibrary.scrollToElement(AddressLine2);
			enterAddressLine2(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 6, 1));
			enterAlternativeEmail(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 12, 1));
			enterInstrumentGroup(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 14, 1));
			enterReferralCode(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 16, 1));
			enterReferralNo(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 17, 1));
			enterTenancyDesignation(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 19, 1));
			enterDisplayName(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 21, 1));
			enterExternalAccountSentAt(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 22, 1));
			enterExternalConnectionVia(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 23, 1));
		}
	}

	public void feed_vaild_director_basicinfo(String type,String FirstName, String Suboffice)
			throws Exception {
		enterFirstName(FirstName);
		enterMiddleName(BaseLibrary.getdatabasedonsheet("DirectorUser", 2, 1));
		enterLastName(BaseLibrary.getdatabasedonsheet("DirectorUser", 3, 1));
		enterPreferredLanguage(BaseLibrary.getdatabasedonsheet("DirectorUser", 4, 1));
		enterWorkTitle(BaseLibrary.getdatabasedonsheet("DirectorUser", 6, 1));
		enterSubOffice(Suboffice);
		enterAddressType(BaseLibrary.getdatabasedonsheet("DirectorUser", 7, 1));
		enterAddressLine1(BaseLibrary.getdatabasedonsheet("DirectorUser", 8, 1));
		enterCity(BaseLibrary.getdatabasedonsheet("DirectorUser", 10, 1));
		enterState(BaseLibrary.getdatabasedonsheet("DirectorUser", 11, 1));
		enterCountry(BaseLibrary.getdatabasedonsheet("DirectorUser", 12, 1));
		enterZipcode(BaseLibrary.getdatabasedonsheet("DirectorUser", 13, 1));
		enterEmail(BaseLibrary.getdatabasedonsheet("DirectorUser", 14, 1));
		enterPhone(BaseLibrary.getdatabasedonsheet("DirectorUser", 16, 1));
		enterCorporateDocReviewedAt(BaseLibrary.getdatabasedonsheet("DirectorUser", 17, 1));
		enterCorporateDocReviewedBy(BaseLibrary.getdatabasedonsheet("DirectorUser", 18, 1));
		enterDirectorOf(BaseLibrary.getdatabasedonsheet("DirectorUser", 19, 1));
		enterUserAttributes(BaseLibrary.getdatabasedonsheet("DirectorUser", 20, 1));
		enterUserInfoDocuments(BaseLibrary.getdatabasedonsheet("DirectorUser", 21, 1));
		enterIdentificationType(BaseLibrary.getdatabasedonsheet("DirectorUser", 22, 1));
		enterIdentificationNo(BaseLibrary.getdatabasedonsheet("DirectorUser", 23, 1));
		enterIdentificationDescription(BaseLibrary.getdatabasedonsheet("DirectorUser", 24, 1));
		enterCountryofCitizenship(BaseLibrary.getdatabasedonsheet("DirectorUser", 25, 1));
		enterSecondaryCountryofCitizenship(BaseLibrary.getdatabasedonsheet("DirectorUser", 26, 1));

		if (type.equalsIgnoreCase("Valid")) {
			BaseLibrary.scrollToElement(AddressLine2);
			enterAddressLine2(BaseLibrary.getdatabasedonsheet("DirectorUser", 9, 1));
			enterAlternativeEmail(BaseLibrary.getdatabasedonsheet("DirectorUser", 15, 1));

		}
	}

	public void feed_vaild_legalinfo(String type) throws Exception {
		BaseLibrary.waitforelement(Legal);
		BaseLibrary.clickelement(Legal);
		Thread.sleep(2000);
		enterFundingSources(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 27, 1));
		enterCommissionRate(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 29, 1));
		enterTaxedCountryCode(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 30, 1));
		enterTaxRecipientCode(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 31, 1));
		enterTaxStatusCode(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 32, 1));
		enterTefraID(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 33, 1));
		if (type.equalsIgnoreCase("Valid")) {
			enterMetadata(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 28, 1));
		}
	}
	
	public void feed_vaild_director_legalinfo(String type) throws Exception {
		BaseLibrary.waitforelement(Legal);
		BaseLibrary.clickelement(Legal);
		Thread.sleep(2000);
		enterMetadata(BaseLibrary.getdatabasedonsheet("DirectorUser", 28, 1));
		enterAcknowledgedSignedBy(BaseLibrary.getdatabasedonsheet("DirectorUser", 29, 1));
	}

	public void feed_vaild_autopilotinfo() throws Exception {
		BaseLibrary.waitforelement(Autopilot);
		BaseLibrary.clickelement(Autopilot);
		enterLastMoneyMovementWhen(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 35, 1));
		enterLastRebalanceWhen(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 36, 1));
		enterNextRebalanceWhen(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 37, 1));
		enterCleanupAccountID(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 38, 1));
		enterCleanupAccountNo(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 39, 1));
		enterMasterTradingAccountId(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 40, 1));
		enterMasterTradingAccountNo(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 41, 1));
		enterMinimumOrders(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 42, 1));
		enterMinimumOrderAmount(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 43, 1));
		enterNextMoneyMovementAt(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 44, 1));
		enterLastForceRebalanceWhen(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 45, 1));
		enterRebalancePeriod(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 46, 1));
		enterMoneyMovementPeriod(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 47, 1));
		enterRIAID(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 48, 1));
		enterRIAPortfolioID(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 49, 1));
		enterRIAProductID(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 50, 1));
	}

	public void feed_vaild_docinfo(String upload) throws Exception {
		BaseLibrary.waitforelement(Supportingdoc);
		BaseLibrary.clickelement(Supportingdoc);
		enterDocumentCode(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 52, 1));
		enterDocumentName(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 53, 1));
		enterEntryDate(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 54, 1));
		enterDueDate(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 55, 1));
		enterExpirationDate(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 56, 1));
		enterSupporting_Status(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 57, 1));
		if (upload.equalsIgnoreCase("yes")) {
			supportingdocumentfileupload();
		}

	}

	public void feed_invaild_docinfo() throws Exception {
		BaseLibrary.waitforelement(Supportingdoc);
		BaseLibrary.clickelement(Supportingdoc);
		supportingdocumentinvaildfileupload();
	}

	public void feed_vaild_docinfo_2(String upload) throws Exception {
		BaseLibrary.waitforelement(addanotherdocument);
		BaseLibrary.clickelement(addanotherdocument);
		enterDocumentCode_2(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 52, 1));
		enterDocumentName_2(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 53, 1));
		enterEntryDate_2(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 54, 1));
		enterDueDate_2(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 55, 1));
		enterExpirationDate_2(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 56, 1));
		enterSupporting_Status_2(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 57, 1));
		if (upload.equalsIgnoreCase("yes")) {
			supportingdocumentfileupload_2();
		}

	}

	public void feed_vaild_noteinfo() throws Exception {
		BaseLibrary.waitforelement(Notes);
		BaseLibrary.clickelement(Notes);
		enterCategory(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 59, 1));
		enterSubject(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 60, 1));
		enterNote(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 61, 1));

	}
	
	public void feed_vaild_noteinfo_two() throws Exception {
		BaseLibrary.waitforelement(Add_another_Notes);
		BaseLibrary.clickelement(Add_another_Notes);
		enterCategory2(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 59, 1));
		enterSubject2(BaseLibrary.getdatabasedonsheet("InstitutionalUser", 60, 1));
		enterNote2("Multi Notes");

	}

	public void clicksavebutton() throws Exception {
		BaseLibrary.waitforelement(userSave);
		BaseLibrary.clickelement(userSave);
	}

	public void clickcreatebutton() throws Exception {
		BaseLibrary.waitforelement(usercreate);
		BaseLibrary.clickelement(usercreate);
	}

	public void searchwithvaildonefilter(String User_name) throws Exception {
		BaseLibrary.waitforelement(filter_UserName);
		BaseLibrary.typetext(filter_UserName, User_name);
		BaseLibrary.clickelement(filterSearchButton);
		BaseLibrary.clickelement(filtercloseButton);
	}

	public void recordsvaildonuser(String User_name) throws Exception {
		Thread.sleep(5000);
		BaseLibrary.waitforelement(tableFirstRow);
		Assert.assertEquals(User_name, Usernamehyperlink.getText());
	}

	public void click_already_created_user(String User_name) throws Exception {
		Thread.sleep(5000);
		WebElement createduser = BaseLibrary.locatorstowebelement("//td[text()='" + User_name + "']");
		BaseLibrary.clickelement(createduser);
		BaseLibrary.clickelement(User_tab);

	}
	
	public void click_already_created_director_user(String User_name) throws Exception {
		Thread.sleep(5000);
		BaseLibrary.clickelement(Directional_user);
		WebElement createduser = BaseLibrary.locatorstowebelement("//td[text()='" + User_name + "']");
		BaseLibrary.clickelement(createduser);

	}

	public void check_createaccountlink(String User_name) throws Exception {
		Thread.sleep(5000);
		WebElement createanaccountlink = BaseLibrary
				.locatorstowebelement("//td[text()='" + User_name + "']//parent::tr//td[text()='Create an account']");

	}

	public void edit_user() throws Exception {
		BaseLibrary.waitforelement(editicon);
		BaseLibrary.clickelement(editicon);
	}

	public void Update_user(String updatetype) throws Exception {
		if (updatetype.equalsIgnoreCase("status")) {
			Thread.sleep(5000);
			BaseLibrary.textclear(Basic_Status);
			enterBasic_Status("Pending");
			Thread.sleep(5000);
		} else if (updatetype.equalsIgnoreCase("address")) {
			Thread.sleep(5000);
			BaseLibrary.textclear(AddressLine1);
			enterAddressLine1("Address Updated");
			Thread.sleep(5000);
		}
		else if (updatetype.equalsIgnoreCase("Autopilot")) {
			Thread.sleep(5000);
			BaseLibrary.waitforelement(Autopilot);
			BaseLibrary.clickelement(Autopilot);
			BaseLibrary.textclear(RebalancePeriod);
			enterRebalancePeriod("12");
			Thread.sleep(5000);
		}
	}

	public void verify_user_information() throws Exception {
		BaseLibrary.waitforelement(BaseLibrary
				.locatorstowebelement("//span[text()='" + BaseLibrary.getdatabasedonsheet("InstitutionalUser", 2, 1) + "']"));
		BaseLibrary.waitforelement(BaseLibrary
				.locatorstowebelement("//span[text()='" + BaseLibrary.getdatabasedonsheet("InstitutionalUser", 5, 1) + "']"));
		BaseLibrary.waitforelement(BaseLibrary
				.locatorstowebelement("//span[text()='" + BaseLibrary.getdatabasedonsheet("InstitutionalUser", 6, 1) + "']"));
	}
	
	
	public void verify_user_notes(String type) throws Exception {
		BaseLibrary.waitforelement(Notes);
		BaseLibrary.clickelement(Notes);
		BaseLibrary.waitforelement(Notes_text);
		if(type.equals("Multiple"))
		{
			BaseLibrary.waitforelement(Notes_text_2);
		}
	}


	public void verify_downloads() throws Exception {
		BaseLibrary.waitforelement(Supportingdoc);
		BaseLibrary.clickelement(Supportingdoc);
		BaseLibrary.waitforelement(download_supportingdocument);
		BaseLibrary.clickelement(download_supportingdocument);
		Assert.assertEquals(true, BaseLibrary.check_windowtabs(2));
	}

	
	public void verify_counts() throws Exception {
		BaseLibrary.waitforelement(usertab);
		BaseLibrary.waitforelement(accountstab);
	
	}
	
	
	public void verify_trash() throws Exception {
		BaseLibrary.waitforelement(Supportingdoc);
		BaseLibrary.clickelement(Supportingdoc);
		BaseLibrary.waitforelement(download_deleting_supportingdocument);
		BaseLibrary.clickelement(download_deleting_supportingdocument);
		BaseLibrary.waitforelement(upload_label);
	}
	
	public void partneruniversalsearch(String input,String Username) throws Exception {
		Thread.sleep(2000);
		BaseLibrary.waitforelement(tableFirstRow);
		BaseLibrary.waitforelement(universalsearch);
		if (input.equalsIgnoreCase("valid")) {
			BaseLibrary.typetext(universalsearch, Username);
			BaseLibrary.waitforelement(tableFirstRow);
		} else {
			BaseLibrary.typetext(universalsearch, BaseLibrary.randomstringgenerator(5));
		}
	}
	
	public void clickSearchIcon() throws Exception {
		BaseLibrary.waitforelement(searchicon);
		BaseLibrary.clickelement(searchicon);
	}
	
	public void searchwithoneinvalidfilter() throws Exception {
		Thread.sleep(2000);
		BaseLibrary.waitforelement(filter_UserName);
		BaseLibrary.typetext(filter_UserName, BaseLibrary.randomstringgenerator(7));
		BaseLibrary.clickelement(filterSearchButton);
		BaseLibrary.clickelement(filtercloseButton);
	}
	
	public void searchwithmultiplefilter(String searchone,String searchtwo) throws Exception {
		BaseLibrary.waitforelement(filter_UserName);
		BaseLibrary.typetext(filter_UserName, searchone);
		BaseLibrary.waitforelement(filter_accounts);
		BaseLibrary.typetext(filter_accounts, searchtwo);
		BaseLibrary.clickelement(filterSearchButton);
		BaseLibrary.clickelement(filtercloseButton);
	}
	
	
	public void clearfilter(String searchone,String searchtwo) throws Exception {
		BaseLibrary.waitforelement(filter_UserName);
		BaseLibrary.typetext(filter_UserName, searchone);
		BaseLibrary.waitforelement(filter_accounts);
		BaseLibrary.typetext(filter_accounts, searchtwo);
		BaseLibrary.waitforelement(clearfilter);
		BaseLibrary.clickelement(clearfilter);
		BaseLibrary.waitforelement(cleardata);
		
	}
	

	public void resetfilter(String searchone,String searchtwo) throws Exception {
		BaseLibrary.waitforelement(filter_UserName);
		BaseLibrary.typetext(filter_UserName, searchone);
		BaseLibrary.waitforelement(filter_accounts);
		BaseLibrary.typetext(filter_accounts, searchtwo);
		BaseLibrary.waitforelement(Resetbutton);
		BaseLibrary.clickelement(Resetbutton);
		BaseLibrary.waitforelement(cleardata);
		
	}
	
	public void pagenumber()throws Exception {
		BaseLibrary.waitforelement(page_number);
		
	}
	
	public void switchtab()throws Exception {
		BaseLibrary.waitforelement(Next_button);
		BaseLibrary.clickelement(Next_button);
		BaseLibrary.waitforelement(Metadata);
		BaseLibrary.waitforelement(Previous_button);
		BaseLibrary.clickelement(Previous_button);
		BaseLibrary.waitforelement(PreferredLanguage);
		
	}
	
	public void viewcolumn()throws Exception {
		BaseLibrary.waitforelement(viewcolumn);
		BaseLibrary.clickelement(viewcolumn);
		BaseLibrary.waitforelement(status_checkbox);
		BaseLibrary.clickelement(status_checkbox);
		BaseLibrary.dontseeelement(status_label);		
		BaseLibrary.waitforelement(status_checkbox);
		BaseLibrary.clickelement(status_checkbox);
		
	}
}