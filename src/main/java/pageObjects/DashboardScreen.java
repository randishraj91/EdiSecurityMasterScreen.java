package pageObjects;

import baseMethods.BaseLibrary;
import baseMethods.Threadmanager;
import baseMethods.UIUtilis;

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

public class DashboardScreen {

	WebDriver driver;
    
    @FindBy(xpath = "//span[text()='Add new company']")
    private WebElement addnewcompany;

	@FindBy(xpath = "//h1[text()='Company']")
	private WebElement dashboard_company;



	@FindBy(xpath = "//li[@class='active']")
	private WebElement dashboard_securitymasterdata;

	@FindBy(xpath = "//h1[text()='Company']")
	private WebElement verifysecuritymasterdatadashboard;



	@FindBy(xpath = "(//ul[@role='listbox']//li)[last()]")
    private WebElement lastcompanyfromlist;
    
    @FindBy(xpath = "//li//strong[text()='Account Data Management']/..")
	private static WebElement accountDataManagement;

	@FindBy(xpath = "//li//strong[text()='System-Wide Master Data']/..")
	private static WebElement systemWideMasterData;

	@FindBy(xpath = "//li[@class='active']")
	private static WebElement securitymasterdata;


	@FindBy(xpath = "//li//strong[text()='Accounting']/..")
	private static WebElement accounting;


	@FindBy(xpath = "//a[text()='Partner']")
	private static WebElement partner;

	@FindBy(xpath = "//a[text()='Entity']")
	private static WebElement entity;

	@FindBy(xpath = " //a[text()='Office']")
	private static WebElement office;

	@FindBy(xpath = "//a[text()='Sub Office']")
	private static WebElement subOffice;

	@FindBy(xpath = "//a[text()='Holidays']")
	private static WebElement holiday;

	@FindBy(xpath = "//div[@class='MuiAlert-message']")
	private static WebElement validationMessage;

	@FindBy(xpath = "//i[@class='filter-icon-menu']")
	private static WebElement filterIcon;

	@FindBy(xpath = "//*[contains(text(),'No data found')]")
	private static WebElement noData;

	@FindBy(xpath = "//a[text()='Account Master']")
	private static WebElement accountMaster;

	@FindBy(xpath = " //*[@title='Close']")
	private WebElement close;
    
  
    public String Switchcompanyname;
	
	public DashboardScreen() {
		this.driver = Threadmanager.getdriver();
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
	}

	public void verifydashboard() throws Exception {
		BaseLibrary.waitforelementwithsecs(dashboard_company,30);
	}

	public void verifysecuritymasterdatadashboard() throws Exception {
		BaseLibrary.waitforelementwithsecs(dashboard_securitymasterdata,30);
	}



	public void clickaddnewcompany() throws Exception {
		BaseLibrary.waitforelement(addnewcompany);
		BaseLibrary.clickelement(addnewcompany);
	}
	
	public void checkaddnewcompanydisable() throws Exception {
		BaseLibrary.waitforelementinvisible(addnewcompany);
		
	}
	
	public void switchcompany(String CurrentCompanyname) throws Exception {
		BaseLibrary.clickelement(BaseLibrary.locatorstowebelement("//div[text()='"+CurrentCompanyname+"']"));	
		BaseLibrary.waitforelement(lastcompanyfromlist);
	//	Switchcompanyname=BaseLibrary.gettext(lastcompanyfromlist);
		Switchcompanyname=BaseLibrary.getdatabasedonsheet("Company", 1, 1);
		System.out.println("Switch Company Name : "+Switchcompanyname);
		BaseLibrary.clickelement(BaseLibrary.locatorstowebelement("//ul[@role='listbox']//li[text()='"+Switchcompanyname+"']"));
		BaseLibrary.waitforelement(BaseLibrary.locatorstowebelement("//label[text()='Company Name']//following-sibling::span[text()='"+Switchcompanyname+"']"));		
		
	}
	
	
	public void switchlastcompany(String CurrentCompanyname) throws Exception {
		BaseLibrary.clickelement(BaseLibrary.locatorstowebelement("//div[text()='"+CurrentCompanyname+"']"));	
		BaseLibrary.waitforelement(lastcompanyfromlist);
		Switchcompanyname=BaseLibrary.gettext(lastcompanyfromlist);
		System.out.println("Switch Company Name : "+Switchcompanyname);
		BaseLibrary.clickelement(lastcompanyfromlist);
		BaseLibrary.waitforelement(BaseLibrary.locatorstowebelement("//label[text()='Company Name']//following-sibling::span[text()='"+Switchcompanyname+"']"));		
		
	}
	
	public static void account_data_management_menu(String menuName) throws Throwable {
		UIUtilis.waitforelementwithsecs(accountDataManagement,60);
		BaseLibrary.clickelement(accountDataManagement);

		WebElement element = null;
		switch (menuName) {
			case "Company":
				break;
			case "Partner":
				element = partner;
				break;
			case "Entity":
				element = entity;
				break;
			case "Office":
				element = office;
				break;
			case "SubOffice":
				element = subOffice;
				break;

		}
		UIUtilis.waitforelementwithsecs(element,60);
		BaseLibrary.clickelement(element);
		Thread.sleep(2);

	}
	public static void system_Wide_master_data(String menuName) throws Throwable {
		UIUtilis.waitforelementwithsecs(systemWideMasterData,60);
		BaseLibrary.clickelement(systemWideMasterData);

		WebElement element = null;
		switch (menuName) {
			case "Holiday":
				element = holiday;
				break;
		}
		UIUtilis.waitforelementwithsecs(element,60);
		BaseLibrary.clickelement(element);
		Thread.sleep(2);
	}

	public static void security_master_data(String menuName) throws Throwable {
		UIUtilis.waitforelementwithsecs(securitymasterdata,60);
		BaseLibrary.clickelement(securitymasterdata);

		WebElement element = null;
		switch (menuName) {
			case "SecurityMaster":
				break;
			case "EDISecurityMaster":
				element = partner;
				break;
		}
		UIUtilis.waitforelementwithsecs(element,60);
		BaseLibrary.clickelement(element);
		Thread.sleep(2);

	}
	

	
	

}
