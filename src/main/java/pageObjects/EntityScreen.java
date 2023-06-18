package pageObjects;

import baseMethods.BaseLibrary;
import baseMethods.Threadmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

public class EntityScreen {

	WebDriver driver;

	@FindBy(xpath = "//li[@class='active']")
	private WebElement accountdatamanagement_menu;

	@FindBy(xpath = "//a[text()='Entity']")
	private WebElement entity_submenu;

	@FindBy(xpath = "//span[text()='Add New Entity']")
	private WebElement addnewentity;

	@FindBy(xpath = "(//label[text()='Full Legal Name*']//following::input)[1]")
	private WebElement fulllegalname;

	@FindBy(xpath = "(//label[text()='DBA*']//following::input)[1]")
	private WebElement dba;

	@FindBy(xpath = "//input[@placeholder='MM/DD/YYYY']")
	private WebElement dateofincorporation;

	@FindBy(xpath = "(//label[text()='Ownership Type*']//following::input)[1]")
	private WebElement ownershiptype;

	@FindBy(xpath = "(//label[text()='Registration Type*']//following::input)[1]")
	private WebElement registrationtype;

	@FindBy(xpath = "(//label[text()='Registration ID*']//following::input)[1]")
	private WebElement registrationid;

	@FindBy(xpath = "(//label[text()='Status*']//following::input)[1]")
	private WebElement status;

	@FindBy(xpath = "(//label[text()='Address Line 1*']//following::input)[1]")
	private WebElement addressLine1;

	@FindBy(xpath = "(//label[text()='Country*']//following::input)[1]")
	private WebElement country;

	@FindBy(xpath = "(//label[text()='State*']//following::input)[1]")
	private WebElement state;

	@FindBy(xpath = "(//label[text()='City*']//following::input)[1]")
	private WebElement city;

	@FindBy(xpath = "(//label[text()='Zipcode*']//following::input)[1]")
	private WebElement zipCode;

	@FindBy(xpath = "//button//span[text()='Save']")
	private WebElement entitysavebutton;

	@FindBy(xpath = "//button//span[text()='Skip']")
	private WebElement skipbutton;

	@FindBy(xpath = "(//label[text()='Date of Incorporation*']//following::input)[1]")
	private WebElement dateofIncorporation;

	@FindBy(xpath = "(//label[text()='Registration Type*']//following::input)[1]")
	private WebElement registrationType;

	@FindBy(xpath = "(//label[text()='Registration ID*']//following::input)[1]")
	private WebElement registrationID;

	@FindBy(xpath = "(//label[text()='Address Line 2']//following::input)[1]")
	private WebElement addressLine2;

	@FindBy(xpath = "(//label[text()='Address Line 3']//following::input)[1]")
	private WebElement addressLine3;

	@FindBy(xpath = "(//label[text()='Zipcode*']//following::input)[1]")
	private WebElement zipcode;

	@FindBy(xpath = "(//label[text()='Phone']//following::input)[1]")
	private WebElement phone;

	@FindBy(xpath = "(//label[text()='Email']//following::input)[1]")
	private WebElement email;

	@FindBy(xpath = "(//label[text()='Fax']//following::input)[1]")
	private WebElement fax;

	@FindBy(xpath = "(//label[text()='Partner ID*']//following::input)[1]")
	private WebElement partnerID;

	@FindBy(xpath = "//button[@tabindex='0']//span[text()='Save']")
	private WebElement companySave;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained    primary-btn MuiButton-containedPrimary Mui-disabled Mui-disabled']")
	private WebElement disabledSave;

	@FindBy(xpath = "//button[@tabindex='0']//span[text()='Skip']")
	private WebElement skip;

	@FindBy(xpath = "//button[@tabindex='0']//span[text()='Add Partner']")
	private WebElement addpartner;

	@FindBy(xpath = "//tbody/tr[1]")
	private WebElement tableFirstRow;

	@FindBy(xpath = "//span[@class='filter-icon']")
	private WebElement filtericon;

	@FindBy(xpath = "//input[@id='filter_legalName']")
	private WebElement filter_legalname;

	@FindBy(xpath = "//input[@id='filter_registerationIdentification']")
	private WebElement filter_registrationID;

	@FindBy(xpath = "//span[text()='Search']")
	private WebElement filterSearchButton;

	@FindBy(xpath = "//div[@class='filter-section']//i[@class='close-icon']")
	private WebElement filtercloseButton;

	@FindBy(xpath = "//*[contains(text(),'No data found')]")
	private WebElement noData;

	@FindBy(xpath = "//div[@class='MuiAlert-message']")
	private WebElement validateMessage;

	@FindBy(xpath = "//button//span[text()='Edit']")
	private WebElement editbutton;

	@FindBy(xpath = "//input[@id='outlined-basic']")
	private WebElement universalsearch;

	@FindBy(xpath = "//i[@class='search-icon']")
	private WebElement searchicon;

	@FindBy(xpath = "//td[@id='row-0-cell-0']")
	private WebElement fulllegelnamehyperlink;

	@FindBy(xpath = "//span[@class='error-msg' and text()='Full Legal Name Required']")
	private WebElement error_fulllegalname;

	@FindBy(xpath = "//span[@class='error-msg' and text()='DBA Required']")
	private WebElement error_dba;

	@FindBy(xpath = "//span[@class='error-msg' and text()='Registration ID required']")
	private WebElement error_registrationID;

	@FindBy(xpath = "//span[@class='error-msg' and text()='Address Line 1 Required']")
	private WebElement error_addressline1;

	@FindBy(xpath = "//span[@class='error-msg' and text()='city required']")
	private WebElement error_city;

	@FindBy(xpath = "//span[@class='error-msg' and text()='state required']")
	private WebElement error_state;

	@FindBy(xpath = "//span[@class='error-msg' and text()='zipcode required']")
	private WebElement error_zipcode;

	@FindBy(xpath = "//span[@class='column-sort']")
	private static WebElement sortcolumn1;
	
	@FindBy(xpath = "//button[@title='Close']")
	private WebElement close;

	public String Fulllegalname;
	public String RegistrationID;
	public String DbA;
	public String DateofIncorporation;
	public String OwnershipTYpe;
	public String Registrationtype;
	public String sTatus;

	public EntityScreen() {
		this.driver = Threadmanager.getdriver();
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
	}

	public void clickaccountdatamanagementmenu() throws Exception {
		BaseLibrary.waitforelement(accountdatamanagement_menu);
		BaseLibrary.jsclickelement(accountdatamanagement_menu);

	}

	public void clickenitysubmenu() throws Exception {
		BaseLibrary.waitforelement(entity_submenu);
		BaseLibrary.jsclickelement(entity_submenu);
		BaseLibrary.waitforelement(addnewentity);
	}

	public void clickaddnewentity() throws Exception {
		BaseLibrary.clickelement(addnewentity);
		Thread.sleep(2000);
		BaseLibrary.waitforelement(fulllegalname);
	}

	public void entitysavebutton() throws Exception {
		BaseLibrary.clickelement(entitysavebutton);
	}

	public void verifynewentity() throws Exception {
		BaseLibrary.waitforelement(skipbutton);
		BaseLibrary.clickelement(skipbutton);
	}

	public void createentitywithmandatory(String legalname, String DBA, String RegistrationID) throws Exception {
		enterFullLegalName(legalname);
		enterDBA(DBA);
		enterDateofIncorporation(BaseLibrary.getdatabasedonsheet("Entity", 3, 1));
		enterOwnershipType(BaseLibrary.getdatabasedonsheet("Entity", 4, 1));
		enterRegistrationType(BaseLibrary.getdatabasedonsheet("Entity", 5, 1));
		enterRegistrationID(RegistrationID);
		enterStatus(BaseLibrary.getdatabasedonsheet("Entity", 7, 1));
		enterAddressLine1(BaseLibrary.getdatabasedonsheet("Entity", 8, 1));
		enterCountry(BaseLibrary.getdatabasedonsheet("Entity", 11, 1));
		enterState(BaseLibrary.getdatabasedonsheet("Entity", 12, 1));
		entercity(BaseLibrary.getdatabasedonsheet("Entity", 13, 1));
		enterZipcode(BaseLibrary.getdatabasedonsheet("Entity", 14, 1));

	}

	public void enterFullLegalName(String fullLegalname) throws Exception {
		BaseLibrary.typetext(fulllegalname, fullLegalname);
		Fulllegalname = fullLegalname;
	}

	public void enterDBA(String DBA) throws Exception {
		BaseLibrary.typetext(dba, DBA);
		DbA = DBA;
	}

	public void enterDateofIncorporation(String dateofincorporation) throws Exception {
		BaseLibrary.typetext(dateofIncorporation, dateofincorporation);
		DateofIncorporation = dateofincorporation;
	}

	public void enterOwnershipType(String ownershipType) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(ownershiptype, ownershipType, 1);
		OwnershipTYpe = ownershipType;
	}

	public void entercity(String City) throws Exception {
		BaseLibrary.typetext(city, City);
	}

	public void enterRegistrationType(String RegistrationType) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(registrationType, RegistrationType, 1);
		Registrationtype = RegistrationType;
	}

	public void enterRegistrationID(String ReistrationID) throws Exception {
		BaseLibrary.typetext(registrationID, ReistrationID);
		RegistrationID = ReistrationID;
	}

	public void enterStatus(String Status) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(status, Status, 1);
		sTatus = Status;
	}

	public void enterAddressLine1(String Addressline1) throws Exception {
		BaseLibrary.typetext(addressLine1, Addressline1);
	}

	public void enterAddressLine2(String Addressline2) throws Exception {
		BaseLibrary.typetext(addressLine2, Addressline2);
	}

	public void enterAddressLine3(String Addressline3) throws Exception {
		BaseLibrary.typetext(addressLine3, Addressline3);
	}

	public void enterCountry(String Country) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(country, Country, 1);
	}

	public void enterState(String State) throws Exception {
		BaseLibrary.typetext(state, State);
	}

	public void enterZipcode(String ZipCode) throws Exception {
		BaseLibrary.typetext(zipcode, ZipCode);
	}

	public void enterPhone(String Phone) throws Exception {
		BaseLibrary.typetext(phone, Phone);
	}

	public void enterEmail(String Email) throws Exception {
		BaseLibrary.typetext(email, Email);
	}

	public void enterFax(String Fax) throws Exception {
		BaseLibrary.typetext(fax, Fax);
	}

	public void createmandatorywithallfield() throws Exception {
		Thread.sleep(1000);
		driver.navigate().refresh();
		enterFullLegalName(BaseLibrary.getdatabasedonsheet("Entity", 1, 1));
		enterDBA(BaseLibrary.getdatabasedonsheet("Entity", 2, 1));
		enterDateofIncorporation(BaseLibrary.getdatabasedonsheet("Entity", 3, 1));
		enterOwnershipType(BaseLibrary.getdatabasedonsheet("Entity", 4, 1));
		enterRegistrationType(BaseLibrary.getdatabasedonsheet("Entity", 5, 1));
		enterRegistrationID(BaseLibrary.getdatabasedonsheet("Entity", 6, 1));
		enterStatus(BaseLibrary.getdatabasedonsheet("Entity", 7, 1));
		enterAddressLine1(BaseLibrary.getdatabasedonsheet("Entity", 8, 1));
		enterAddressLine2(BaseLibrary.getdatabasedonsheet("Entity", 9, 1));
		enterAddressLine3(BaseLibrary.getdatabasedonsheet("Entity", 10, 1));
		enterCountry(BaseLibrary.getdatabasedonsheet("Entity", 11, 1));
		enterState(BaseLibrary.getdatabasedonsheet("Entity", 12, 1));
		entercity(BaseLibrary.getdatabasedonsheet("Entity", 13, 1));
		enterZipcode(BaseLibrary.getdatabasedonsheet("Entity", 14, 1));
		enterPhone(BaseLibrary.getdatabasedonsheet("Entity", 15, 1));
		enterEmail(BaseLibrary.getdatabasedonsheet("Entity", 16, 1));
		enterFax(BaseLibrary.getdatabasedonsheet("Entity", 17, 1));
	}

	public void createfieldswithmaxinput() throws Exception {
		Thread.sleep(1000);
		driver.navigate().refresh();
		enterFullLegalName(BaseLibrary.randomstringgenerator(50));
		enterDBA(BaseLibrary.randomnumbergenerator(50));
		enterDateofIncorporation(BaseLibrary.getdatabasedonsheet("Entity", 3, 1));
		enterOwnershipType(BaseLibrary.getdatabasedonsheet("Entity", 4, 1));
		enterRegistrationType(BaseLibrary.getdatabasedonsheet("Entity", 5, 1));
		enterRegistrationID(BaseLibrary.randomstringgenerator(50));
		enterStatus(BaseLibrary.getdatabasedonsheet("Entity", 7, 1));
		enterAddressLine1(BaseLibrary.randomstringgenerator(50));
		enterAddressLine2(BaseLibrary.randomstringgenerator(50));
		enterAddressLine3(BaseLibrary.randomstringgenerator(50));
		enterCountry(BaseLibrary.getdatabasedonsheet("Entity", 11, 1));
		enterState(BaseLibrary.randomstringgenerator(50));
		entercity(BaseLibrary.randomstringgenerator(50));
		enterZipcode(BaseLibrary.randomnumbergenerator(10));
		enterPhone(BaseLibrary.getdatabasedonsheet("Entity", 15, 1));
		enterEmail(BaseLibrary.getdatabasedonsheet("Entity", 16, 1));
		enterFax(BaseLibrary.getdatabasedonsheet("Entity", 17, 1));
	}

	public void createmandatorywithmandatoryfield() throws Exception {
		Thread.sleep(1000);
		driver.navigate().refresh();
		enterFullLegalName(BaseLibrary.randomstringgenerator(7));
		enterDBA(BaseLibrary.randomnumbergenerator(7));
		enterDateofIncorporation(BaseLibrary.getdatabasedonsheet("Entity", 3, 1));
		enterOwnershipType(BaseLibrary.getdatabasedonsheet("Entity", 4, 1));
		enterRegistrationType(BaseLibrary.getdatabasedonsheet("Entity", 5, 1));
		enterRegistrationID(BaseLibrary.randomnumbergenerator(10));
		enterStatus(BaseLibrary.getdatabasedonsheet("Entity", 7, 1));
		enterAddressLine1(BaseLibrary.getdatabasedonsheet("Entity", 8, 1));
		enterCountry(BaseLibrary.getdatabasedonsheet("Entity", 11, 1));
		enterState(BaseLibrary.getdatabasedonsheet("Entity", 12, 1));
		entercity(BaseLibrary.getdatabasedonsheet("Entity", 13, 1));
		enterZipcode(BaseLibrary.getdatabasedonsheet("Entity", 14, 1));
	}

	public void withoutmandatoryfields() throws Exception {
		Thread.sleep(1000);
		driver.navigate().refresh();
		enterDBA(BaseLibrary.getdatabasedonsheet("Entity", 2, 1));
		enterDateofIncorporation(BaseLibrary.getdatabasedonsheet("Entity", 3, 1));
		enterOwnershipType(BaseLibrary.getdatabasedonsheet("Entity", 4, 1));
		enterRegistrationType(BaseLibrary.getdatabasedonsheet("Entity", 5, 1));
		enterRegistrationID(BaseLibrary.getdatabasedonsheet("Entity", 6, 1));
		enterStatus(BaseLibrary.getdatabasedonsheet("Entity", 7, 1));
		enterAddressLine1(BaseLibrary.getdatabasedonsheet("Entity", 8, 1));
		enterCountry(BaseLibrary.getdatabasedonsheet("Entity", 11, 1));
		enterState(BaseLibrary.getdatabasedonsheet("Entity", 12, 1));
		entercity(BaseLibrary.getdatabasedonsheet("Entity", 13, 1));
		enterZipcode(BaseLibrary.getdatabasedonsheet("Entity", 14, 1));
		boolean Savebutton;
		Savebutton = disabledSave.isEnabled();
		Assert.assertFalse(Savebutton);
		enterFullLegalName(BaseLibrary.getdatabasedonsheet("Entity", 1, 1));
		cleartext(dba);
		Thread.sleep(1000);
		Savebutton = disabledSave.isEnabled();
		Assert.assertFalse(Savebutton);
		enterDBA(BaseLibrary.getdatabasedonsheet("Entity", 2, 1));
//	        cleartext(dateofIncorporation);
//	        Thread.sleep(1000);
//	        Savebutton = disabledSave.isEnabled();
//	        Assert.assertFalse(Savebutton);
//	        enterDateofIncorporation(BaseLibrary.getdatabasedonsheet("Entity", 3, 1));
		cleartext(ownershiptype);
		Thread.sleep(1000);
		Savebutton = disabledSave.isEnabled();
		Assert.assertFalse(Savebutton);
		enterOwnershipType(BaseLibrary.getdatabasedonsheet("Entity", 4, 1));
		cleartext(registrationType);
		Thread.sleep(1000);
		Savebutton = disabledSave.isEnabled();
		Assert.assertFalse(Savebutton);
		enterRegistrationType(BaseLibrary.getdatabasedonsheet("Entity", 5, 1));
		cleartext(registrationID);
		Thread.sleep(1000);
		Savebutton = disabledSave.isEnabled();
		Assert.assertFalse(Savebutton);
		enterRegistrationID(BaseLibrary.getdatabasedonsheet("Entity", 6, 1));
		cleartext(status);
		Thread.sleep(1000);
		Savebutton = disabledSave.isEnabled();
		Assert.assertFalse(Savebutton);
		enterStatus(BaseLibrary.getdatabasedonsheet("Entity", 7, 1));
		Thread.sleep(1000);
		cleartext(addressLine1);
		Thread.sleep(1000);
		Savebutton = disabledSave.isEnabled();
		Assert.assertFalse(Savebutton);
		enterAddressLine1(BaseLibrary.getdatabasedonsheet("Entity", 8, 1));
		cleartext(country);
		Thread.sleep(1000);
		Savebutton = disabledSave.isEnabled();
		Assert.assertFalse(Savebutton);
		enterCountry(BaseLibrary.getdatabasedonsheet("Entity", 11, 1));
		cleartext(state);
		Thread.sleep(1000);
		Savebutton = disabledSave.isEnabled();
		Assert.assertFalse(Savebutton);
		enterState(BaseLibrary.getdatabasedonsheet("Entity", 12, 1));
		cleartext(city);
		Thread.sleep(1000);
		Savebutton = disabledSave.isEnabled();
		Assert.assertFalse(Savebutton);
		entercity(BaseLibrary.getdatabasedonsheet("Entity", 13, 1));
		cleartext(zipcode);
		Thread.sleep(1000);
		Savebutton = disabledSave.isEnabled();
		Assert.assertFalse(Savebutton);
		enterZipcode(BaseLibrary.getdatabasedonsheet("Entity", 14, 1));
	}

	public void cleartext(WebElement field) throws Exception {
		field.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		field.sendKeys(Keys.DELETE);
		field.sendKeys(Keys.BACK_SPACE);
	}

	public void clickskipbutton() throws Exception {
		BaseLibrary.waitforelement(skip);
		BaseLibrary.clickelement(skip);
		BaseLibrary.waitforelement(tableFirstRow);
	}

	public void clickAddPartnerbuttonpopup() throws Exception {
		BaseLibrary.waitforelement(addpartner);
		BaseLibrary.clickelement(addpartner);
	}

	public void navigatepartnerscreen() throws Exception {
		BaseLibrary.waitforelement(partnerID);
	}

	public void clicksavebutton() throws Exception {
		BaseLibrary.waitforelement(companySave);
		BaseLibrary.clickelement(companySave);
	}
	public void searchwithonefilter() throws Exception {
		BaseLibrary.waitforelement(filter_legalname);
		BaseLibrary.dropdownselectionwithkeys(filter_legalname, Fulllegalname, 1);
		BaseLibrary.clickelement(filterSearchButton);
		BaseLibrary.clickelement(filtercloseButton);
	}

	public void searchwithoneinvalidfilter() throws Exception {
		BaseLibrary.waitforelement(filter_legalname);
		BaseLibrary.dropdownselectionwithkeys(filter_legalname, BaseLibrary.randomstringgenerator(7), 1);
		BaseLibrary.clickelement(filterSearchButton);
		BaseLibrary.clickelement(filtercloseButton);
	}

	public void searchwithmultiplefilter() throws Exception {
		BaseLibrary.waitforelement(filter_legalname);
		BaseLibrary.dropdownselectionwithkeys(filter_legalname, Fulllegalname, 1);
		BaseLibrary.waitforelement(filter_registrationID);
		BaseLibrary.dropdownselectionwithkeys(filter_registrationID, RegistrationID, 1);
		BaseLibrary.clickelement(filterSearchButton);
		BaseLibrary.clickelement(filtercloseButton);
	}

	public void searchwithmultipleinvalidfilter() throws Exception {
		BaseLibrary.waitforelement(filter_legalname);
		BaseLibrary.dropdownselectionwithkeys(filter_legalname, BaseLibrary.randomstringgenerator(10), 1);
		BaseLibrary.waitforelement(filter_registrationID);
		BaseLibrary.dropdownselectionwithkeys(filter_registrationID, BaseLibrary.randomnumbergenerator(7), 1);
		BaseLibrary.clickelement(filterSearchButton);
		BaseLibrary.clickelement(filtercloseButton);
	}

	public void recordsonentity() throws Exception {
		BaseLibrary.waitforelement(tableFirstRow);
		Assert.assertEquals(Fulllegalname, fulllegelnamehyperlink.getText());

//	        Thread.sleep(2000);
//	        List<WebElement> Record_Details_ROW = driver.findElements(By.xpath("//table[@id='main-table']//tbody/tr/td[contains(@id,'row-0-cell')]"));
		//
//	        System.out.println("Size:"+Record_Details_ROW.size());
//	        HashMap<String, String> Entity_Table = new HashMap<String, String>();
		//
//	        List<String> header_Table = new ArrayList<String>();
//	        header_Table.add("Full Legal Name");
//	        header_Table.add("DBA");
//	        header_Table.add("Date of Incorporation");
//	        header_Table.add("Ownership TYpe");
//	        header_Table.add("Registration Type");
//	        header_Table.add("Registration ID");
//	        header_Table.add("No of Partners");
//	        header_Table.add("Status");
		//
//	        for (int i = 1; i < Record_Details_ROW.size() - 1; i++)
//	            Entity_Table.put(header_Table.get(i), Record_Details_ROW.get(i).getText());

//	        Assert.assertEquals(RegistrationID, Entity_Table.get("Registration ID"));
//	        System.out.println("expected:"+RegistrationID+"Actual:" +Entity_Table.get("Registration ID"));
//	        Assert.assertEquals(DbA, Entity_Table.get("DBA"));
//	        System.out.println("expected:"+DbA+"Actual:" +Entity_Table.get("DBA"));
//	        Assert.assertEquals(DateofIncorporation, Entity_Table.get("Date of Incorporation"));
//	        System.out.println("expected:"+DateofIncorporation+"Actual:" +Entity_Table.get("Date of Incorporation"));
//	        Assert.assertEquals(OwnershipTYpe, Entity_Table.get("Ownership TYpe"));
//	        System.out.println("expected:"+OwnershipTYpe+"Actual:" +Entity_Table.get("Ownership TYpe"));
	}

	public void norecordfound() throws Exception {
		BaseLibrary.waitforelement(noData);
		noData.isDisplayed();
	}

	public void clickfilter() throws Exception {
		BaseLibrary.waitforelement(filtericon);
		BaseLibrary.clickelement(filtericon);
		BaseLibrary.waitforelement(filterSearchButton);
	}

	public void clickfulllegalname() throws Exception {
		BaseLibrary.waitforelement(fulllegelnamehyperlink);
		BaseLibrary.clickelement(fulllegelnamehyperlink);
		BaseLibrary.waitforelement(status);
	}

	public void editentity(String input) throws Exception {
		BaseLibrary.waitforelement(filtericon);
		BaseLibrary.clickelement(filtericon);
		BaseLibrary.waitforelement(filter_legalname);
		BaseLibrary.dropdownselectionwithkeys(filter_legalname, BaseLibrary.getdatabasedonsheet("Entity", 1, 1), 1);
		BaseLibrary.clickelement(filterSearchButton);
		BaseLibrary.clickelement(filtercloseButton);
		BaseLibrary.waitforelement(fulllegelnamehyperlink);
		Thread.sleep(1000);
		BaseLibrary.clickelement(fulllegelnamehyperlink);
		Thread.sleep(2000);
		BaseLibrary.waitforelement(editbutton);
		BaseLibrary.clickelement(editbutton);
		BaseLibrary.waitforelement(status);
		if (input.equalsIgnoreCase("valid")) {
			BaseLibrary.waitforelement(addressLine1);
			BaseLibrary.textclear(fulllegalname);
			enterFullLegalName(BaseLibrary.randomstringgenerator(10));
			BaseLibrary.textclear(registrationID);
			enterRegistrationID(BaseLibrary.randomnumbergenerator(10));
		} else {
			BaseLibrary.waitforelement(fulllegalname);
			BaseLibrary.textclear(fulllegalname);
			BaseLibrary.textclear(dba);
//	            BaseLibrary.textclear(dateofIncorporation);
			BaseLibrary.textclear(ownershiptype);
			BaseLibrary.textclear(ownershiptype);
			BaseLibrary.textclear(registrationID);
			BaseLibrary.textclear(registrationType);
			BaseLibrary.textclear(status);
			BaseLibrary.textclear(city);
			BaseLibrary.textclear(addressLine1);
			BaseLibrary.textclear(country);
			BaseLibrary.textclear(zipcode);
		}
	}

	public void errormessageentity() throws Exception {
		BaseLibrary.waitforelement(error_fulllegalname);
		BaseLibrary.waitforelement(error_dba);
		BaseLibrary.waitforelement(error_registrationID);
		BaseLibrary.waitforelement(error_addressline1);
//	        BaseLibrary.waitforelement(error_state);
//	        System.out.println("error_state");
		BaseLibrary.waitforelement(error_city);
		BaseLibrary.waitforelement(error_zipcode);
	}

	public void entityuniversalsearch(String input) throws Exception {
		Thread.sleep(2000);
		BaseLibrary.waitforelement(tableFirstRow);
		BaseLibrary.waitforelement(universalsearch);
		if (input.equalsIgnoreCase("valid")) {
			BaseLibrary.typetext(universalsearch, Fulllegalname);
			BaseLibrary.waitforelement(tableFirstRow);
		} else {
			BaseLibrary.typetext(universalsearch, BaseLibrary.randomstringgenerator(5));
		}
	}

	public void clickSearchIcon() throws Exception {
		BaseLibrary.waitforelement(searchicon);
		BaseLibrary.clickelement(searchicon);
	}

	public void sortcolumn() throws Exception {
		Thread.sleep(5000);
		BaseLibrary.waitforelement(sortcolumn1);
		BaseLibrary.clickelement(sortcolumn1);
		Thread.sleep(2000);
	}

	public void columnsortorder(String sortorder) throws Exception {
		BaseLibrary.waitforelement(tableFirstRow);
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
		if (sortorder.equalsIgnoreCase("ascending order")) {
			Collections.sort(sortedList);
		} else {
			Collections.sort(sortedList);
			Collections.reverse(sortedList);
		}
		System.out.println("obtainedList:" + obtainedList);
		System.out.println("sortedList:" + sortedList);
		Assert.assertTrue(sortedList.equals(obtainedList));
	}
	
	
	public void validationMeassage(String expected_textMessage) throws Exception {
	   BaseLibrary.waitforelement(validateMessage);
	   String actual_textMessage = validateMessage.getText();
	   Assert.assertEquals(expected_textMessage, actual_textMessage);
	   BaseLibrary.waitforelement(close);
	   BaseLibrary.clickelement(close);
	}

}
