package pageObjects;

import baseMethods.BaseLibrary;
import baseMethods.Threadmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CompanyScreen {

	WebDriver driver;

	@FindBy(xpath = "//*[text()='Add New Company']")
	private WebElement addNewCompany;

	@FindBy(id = "add_companyName")
	private WebElement companyName;

	@FindBy(id = "add_companyCode")
	private WebElement companyCode;

	@FindBy(id = "add_mpid")
	private WebElement companyMpid;

	@FindBy(id = "add_dtcNumber")
	private WebElement companyDtc;

	@FindBy(id = "add_taxId")
	private WebElement companuTaxID;

	@FindBy(id = "add_addressLine1")
	private WebElement addressLine1;

	@FindBy(id = "add_addressLine2")
	private WebElement addressLine2;

	@FindBy(id = "add_countryName")
	private WebElement country;

	@FindBy(id = "add_stateName")
	private WebElement state;

	@FindBy(id = "add_cityName")
	private WebElement city;

	@FindBy(id = "add_zipcode")
	private WebElement zipCode;

	@FindBy(id = "add_contact")
	private WebElement contact;

	@FindBy(id = "add_phoneMobile")
	private WebElement phoneMobile;

	@FindBy(id = "add_email")
	private WebElement email;

	@FindBy(id = "add_fax")
	private WebElement fax;

	@FindBy(xpath = "//button[@tabindex='0']//span[text()='Save']")
	private WebElement companySave;

	@FindBy(xpath = "//*[text()='Company has been created successfully!']")
	private WebElement CreatedMessage;

	@FindBy(xpath = "//div[text()='Company Code Already Exist']")
	private WebElement ValidationMessage;

	@FindBy(xpath = "//button[@tabindex='-1']//span[text()='Save']")
	private WebElement disablesavebutton;

	@FindBy(xpath = "//*[@id='simple-menu']/ul/li[1]/em")
	private WebElement accountManagement;

	@FindBy(xpath = "//ul[@class='sub-menu-list']//li//a[text()='Company']")
	private WebElement navigateCompany;

	@FindBy(id = "outlined-basic")
	private WebElement searchBox;

	@FindBy(xpath = "//i[@class='search-icon']")
	private WebElement searchIcon;

	@FindBy(xpath = "//tbody/tr[1]")
	private WebElement tableFirstRow;

	@FindBy(xpath = "//*[contains(text(),'No data found')]")
	private WebElement noData;

	@FindBy(xpath = "//i[@class='filter-icon-menu']")
	private WebElement filterIcon;

	@FindBy(id = "filter_companyName")
	private WebElement filterCompanyName;

	@FindBy(id = "filter_companyCode")
	private WebElement filterCompanyCode;

	@FindBy(id = "filter_taxId")
	private WebElement filterCompanyTaxId;

	@FindBy(xpath = "//span[text()='Search']")
	private WebElement filterSearchButton;

	@FindBy(xpath = "//button[@type='reset']")
	private static WebElement filterReset;

	@FindBy(xpath = "//div[@class='filter-section']//i[@class='close-icon']")
	private WebElement filterClose;

	@FindBy(xpath = "//*[contains(text(),'Export')]")
	private WebElement export;

	@FindBy(xpath = "//div[@class='view-export-option']//div/button[@aria-controls='long-menu']")
	private WebElement exportKebabButton;

	@FindBy(xpath = "//button[@tabindex=-1]/span[text()='Save']")
	private WebElement companySaveDisabled;

	@FindBy(xpath = "//*[contains(text(),'Clear Filter')]")
	private WebElement filterClear;

	@FindBy(xpath = " //*[@title='Close']")
	private WebElement close;

	@FindBy(xpath = "//span[@class='error-msg' and text()='Company Name required']")
	private WebElement error_Companyname;

	@FindBy(xpath = "//span[@class='error-msg' and text()='Company Code required']")
	private WebElement error_CompanyCode;

	@FindBy(xpath = "//span[@class='error-msg' and text()='Tax ID required']")
	private WebElement error_TaxID;

	@FindBy(xpath = "//span[@class='error-msg' and text()='Address Line1 is required']")
	private WebElement error_AddressLine1;

	@FindBy(xpath = "//span[@class='error-msg' and text()='State is required']")
	private WebElement error_State;

	@FindBy(xpath = "//span[@class='error-msg' and text()='City is required']")
	private WebElement error_City;

	@FindBy(xpath = "//span[@class='error-msg' and text()='Zipcode is required']")
	private WebElement error_Zipcode;

	@FindBy(xpath = "//span[@class='error-msg' and text()='Contact is required']")
	private WebElement error_Contact;

	@FindBy(xpath = "//button//span[text()='Edit']")
	private WebElement editbutton;

	@FindBy(xpath = "//*[contains(text(),'has been saved successfully!')]")
	private WebElement savedmessage;

	public CompanyScreen() {
		this.driver = Threadmanager.getdriver();
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
	}

	public void entercompanyname(String CompanyName) throws Exception {
		BaseLibrary.typetext(companyName, CompanyName);

	}

	public void entercompanycode(String CompanyCode) throws Exception {
		BaseLibrary.typetext(companyCode, CompanyCode);

	}

	public void entertaxid(String TaxID) throws Exception {
		BaseLibrary.typetext(companuTaxID, TaxID);
	}

	public void enteraddressline1(String AddressLine1) throws Exception {
		BaseLibrary.typetext(addressLine1, AddressLine1);
	}

	public void entercountry(String Country) throws Exception {
		BaseLibrary.dropdownselectionwithkeys(country, Country, 2);
	}

	public void enterstate(String State) throws Exception {
		BaseLibrary.typetext(state, State);
	}

	public void entercity(String City) throws Exception {
		BaseLibrary.typetext(city, City);
	}

	public void enterzipcode(String zip) throws Exception {
		BaseLibrary.typetext(zipCode, zip);
	}

	public void entercontact(String Contact) throws Exception {
		BaseLibrary.typetext(contact, Contact);
	}

	public void enterphone(String Phone) throws Exception {
		BaseLibrary.typetext(phoneMobile, Phone);
	}

	public void enterfax(String Fax) throws Exception {
		BaseLibrary.typetext(fax, Fax);
	}

	public void clicksavebutton() throws Exception {
		BaseLibrary.clickelement(companySave);
	}

	public void creationmessage() throws Exception {
		BaseLibrary.waitforelement(CreatedMessage);
	}

	public void validationmessage() throws Exception {
		BaseLibrary.waitforelement(ValidationMessage);
	}

	public void enteremail(String Email) throws Exception {
		BaseLibrary.typetext(email, Email);
	}

	public void entermpid(String Mpid) throws Exception {
		BaseLibrary.typetext(companyMpid, Mpid);
	}

	public void enterdtcno(String Dtc) throws Exception {
		BaseLibrary.typetext(companyDtc, Dtc);
	}

	public void checksavebutton() throws Exception {
		BaseLibrary.waitforelement(disablesavebutton);
	}

	public void createcompanywithmandatory() throws Exception {
		entercompanyname(BaseLibrary.getdatabasedonsheet("Company", 1, 1));
		entercompanycode(BaseLibrary.getdatabasedonsheet("Company", 2, 1));
		entertaxid(BaseLibrary.getdatabasedonsheet("Company", 3, 1));
		enteraddressline1(BaseLibrary.getdatabasedonsheet("Company", 4, 1));
		entercountry(BaseLibrary.getdatabasedonsheet("Company", 5, 1));
		enterstate(BaseLibrary.getdatabasedonsheet("Company", 6, 1));
		entercity(BaseLibrary.getdatabasedonsheet("Company", 7, 1));
		enterzipcode(BaseLibrary.getdatabasedonsheet("Company", 8, 1));
		entercontact(BaseLibrary.getdatabasedonsheet("Company", 9, 1));

	}

	public void createcompanywithallfields() throws Exception {
		entercompanyname(BaseLibrary.randomstringgenerator(7));
		entercompanycode(BaseLibrary.randomstringgenerator(7));
		entertaxid(BaseLibrary.randomnumbergenerator(10));
		enteraddressline1(BaseLibrary.randomstringgenerator(10));
		entercountry(BaseLibrary.getdatabasedonsheet("Company", 5, 1));
		enterstate(BaseLibrary.getdatabasedonsheet("Company", 6, 1));
		entercity(BaseLibrary.getdatabasedonsheet("Company", 7, 1));
		enterzipcode(BaseLibrary.getdatabasedonsheet("Company", 8, 1));
		entercontact(BaseLibrary.getdatabasedonsheet("Company", 9, 1));
		enteremail(BaseLibrary.getdatabasedonsheet("Company", 10, 1));
		entermpid(BaseLibrary.getdatabasedonsheet("Company", 11, 1));
		enterdtcno(BaseLibrary.getdatabasedonsheet("Company", 12, 1));
		enterfax(BaseLibrary.getdatabasedonsheet("Company", 14, 1));
		enterphone(BaseLibrary.getdatabasedonsheet("Company", 13, 1));
	}

	public void createcompanywithinvailddata() throws Exception {
		entercompanyname(BaseLibrary.randomstringgenerator(7));
		entercompanycode(BaseLibrary.randomstringgenerator(7));
		entertaxid(BaseLibrary.randomnumbergenerator(10));
		enteraddressline1(BaseLibrary.randomstringgenerator(10));
		entercountry(BaseLibrary.getdatabasedonsheet("Company", 5, 1));
		enterstate(BaseLibrary.getdatabasedonsheet("Company", 6, 1));
		entercity(BaseLibrary.getdatabasedonsheet("Company", 7, 1));
		enterzipcode(BaseLibrary.getdatabasedonsheet("Company", 8, 1));
		entercontact(BaseLibrary.getdatabasedonsheet("Company", 9, 1));
		enteremail(BaseLibrary.getdatabasedonsheet("Company", 10, 1));
		entermpid(BaseLibrary.getdatabasedonsheet("Company", 11, 1));
		enterdtcno(BaseLibrary.getdatabasedonsheet("Company", 12, 1));
		enterfax(BaseLibrary.getdatabasedonsheet("Company", 14, 1));
		enterphone(BaseLibrary.getdatabasedonsheet("Company", 13, 1));
		clearallfields();
		checkalertmessage();
	}

	public void clearallfields() throws Exception {
		BaseLibrary.textclear(companyName);
		BaseLibrary.textclear(companyCode);
		BaseLibrary.textclear(companuTaxID);
		BaseLibrary.textclear(addressLine1);
		BaseLibrary.textclear(country);
		BaseLibrary.textclear(state);
		BaseLibrary.textclear(city);
		BaseLibrary.textclear(zipCode);
		BaseLibrary.textclear(contact);
		BaseLibrary.textclear(email);
		BaseLibrary.textclear(companyMpid);
		BaseLibrary.textclear(companyDtc);
		BaseLibrary.textclear(fax);
		BaseLibrary.textclear(phoneMobile);
	}

	public void checkalertmessage() throws Exception {
		BaseLibrary.waitforelement(error_AddressLine1);
		BaseLibrary.waitforelement(error_City);
		BaseLibrary.waitforelement(error_CompanyCode);
		BaseLibrary.waitforelement(error_Companyname);
		BaseLibrary.waitforelement(error_Contact);
		BaseLibrary.waitforelement(error_State);
		BaseLibrary.waitforelement(error_TaxID);
		BaseLibrary.waitforelement(error_Zipcode);
	}

	public void clickedit(String data_type) throws Exception {
		BaseLibrary.waitforelement(editbutton);
		BaseLibrary.clickelement(editbutton);
		if(data_type.equalsIgnoreCase("valid")) {
		BaseLibrary.waitforelement(addressLine1);
		enteraddressline1("Modify");
		}
		else
		{
			BaseLibrary.waitforelement(companyName);
			BaseLibrary.textclear(companyName);
		}
	}

	public void checksavedmessage() throws Exception {
		BaseLibrary.waitforelement(savedmessage);
	}
}
