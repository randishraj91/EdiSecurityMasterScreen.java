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

public class LoginScreen {

	WebDriver driver;

	@FindBy(xpath = "//input[@placeholder='Enter the Username']")
	private WebElement userName;

	@FindBy(xpath = "//input[@placeholder='Enter the Password']")
	private WebElement Password;

	@FindBy(xpath = "//span[text()='Login']")
	private WebElement loginButton;

	@FindBy(xpath = "//*[@placeholder='Confirm code']")
	private WebElement confirmCode;

	@FindBy(xpath = "//div[@class='submit-btn']")
	private WebElement Confirmsubmitbutton;


	@FindBy(xpath = "//button[@type='submit']")
	private WebElement companysubmitbutton;

	@FindBy(xpath = "//div[text()='Incorrect username or password.']")
	private WebElement alertmessage;

	@FindBy(xpath = "//span[text()='Username required']")
	private WebElement usernamevaildation;

	@FindBy(xpath = "//span[text()='Password required']")
	private WebElement passwordvaildation;

	@FindBy(xpath = "(//li[@class][i])[2]")
	private WebElement firstcompanyfromlist;





	public static String Companyname;



	public LoginScreen() {
		this.driver = Threadmanager.getdriver();
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
	}

	public void enterUserName(String username) throws Exception {
		BaseLibrary.typetext(userName, username);
	}

	public void enterPassword(String password) throws Exception {
		BaseLibrary.typetext(Password, password);
	}

	public void clickLoginButton() throws Exception {
		BaseLibrary.clickelement(loginButton);
	}

	public void enterandclickconfirmcode(String userName, String password, String subjectKeyword, String fromEmail,
										 String bodySearchText) throws Exception {
		BaseLibrary.waitforelement(Confirmsubmitbutton);
		String code = BaseLibrary.searchEmail(userName, password, subjectKeyword, fromEmail, bodySearchText);
		System.out.println("Code is : "+code);
		BaseLibrary.typetext(confirmCode, code);
		BaseLibrary.clickelement(Confirmsubmitbutton);

	}

	public void verifycompanypage() throws Exception {
		Thread.sleep(10000);
		BaseLibrary.waitforelementwithsecs(companysubmitbutton,30);

	}

	public void verifyalert() throws Exception {
		BaseLibrary.waitforelement(alertmessage);

	}

	public void verifyvaildation() throws Exception {
		BaseLibrary.waitforelement(usernamevaildation);
		BaseLibrary.waitforelement(passwordvaildation);

	}



	public void choosecompany() throws Exception {
		BaseLibrary.waitforelement(firstcompanyfromlist);
		Companyname =BaseLibrary.gettext(firstcompanyfromlist);
		System.out.println("Company Name : "+Companyname);
		BaseLibrary.clickelement(firstcompanyfromlist);
		BaseLibrary.clickelement(companysubmitbutton);
	}




	public static void openApplication() throws Exception {

	}

}
