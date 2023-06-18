package pageObjects;

import baseMethods.BaseLibrary;
import baseMethods.DataDrivenUtility;
import org.openqa.selenium.By;

import java.io.IOException;
import java.util.Random;


public class SettlementPage {
	public String days = "";
	public String asset = "";
	public static String Pub_CountryCode = "";
	public static String Pub_AssertType=  "";
	public static String Pub_SecurityType =  "";
	public static String Pub_NoOfDays =  "";
	public static DataDrivenUtility dd = null;
	public String dataSheetPath = System.getProperty("user.dir") + "/src/test/resources/testFiles/TestData.xlsx";

	By systemMaster = By.xpath("//*[@id='simple-menu']/ul/li[2]/em");
	By navigateSettlement = By.xpath("//ul[@class='sub-menu-list']//li//a[text()='Settlement Rules']");
	By addRules = By.xpath("//*[text()='Add New Rules']");
	By settlementcountrycode = By.xpath("//input[@class]");
	By settlementassettype = By.xpath("(//input)[2]");
	By settlementsecuritytype = By.xpath("(//input)[3]");
	By settlementnumberofdays = By.xpath("(//input)[4]");
	By button_Save = By.xpath("//*[text()='Save']");
	By searchSettlement = By.xpath("//input[@id='outlined-basic']");
	By searchIcon = By.xpath("//i[@class='search-icon']");
	By settlementfilter= By.xpath("//span[text()='Filter By']");
	By filtercountry= By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input']//following::input[3]");
	By filternumber= By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input']//following::input[6]");
	By filterasset= By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input']//following::input[4]");
	By filtersecurity= By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input']//following::input[5]");
	By filtersearch= By.xpath("//span[text()='Search']");
	By filterreset= By.xpath("//span[text()='Reset']");
	By button_cancel= By.xpath("//*[text()='Cancel']");
	By cancel_yes =By.xpath("//span[text()='Yes, go back']");
	By cancel_No =By.xpath("//span[text()='No, Proceed']");
	By settlementEditclick= By.xpath("//*[@class='MuiTableCell-root MuiTableCell-body link  MuiTableCell-sizeSmall']");
	By noDataOnTable = By.xpath("//*[contains(text(),'No data found')]");
	By textTooVerify = By.xpath("//*[contains(text(),'Settlement Rule has been created successfully!')]");

	By editMessage =   By.xpath("//*[contains(text(),'has been saved successfully!')]");
	By closeValidation = By.xpath("//*[@title='Close']");
	By exportlink =   By.xpath("//*[@class='MuiSvgIcon-root']");
	By exportbutton =   By.xpath("//li[@role='menuitem']");

	By viewcolumn=By.id("demo-mutiple-checkbox");
	By viewcolumnasset =By.xpath("//*[@data-value='Asset Type']");
	By viewcolumncountry =By.xpath("//*[@data-value='Country']");


	public void clickSystemMaster() throws Exception {

		BaseLibrary.waitAndClickElementsUsingByLocator(systemMaster);
		BaseLibrary.SetWaitTime(1000);
		BaseLibrary.waitAndClickElement(navigateSettlement);
		// Base_Library.waitAndClickElementsUsingByLocator(systemMaster);
		// Base_Library.Func_MainNew(systemMaster, "CLICK", "System master",
		// "");

	}
	public void verifyNoDataDisplayed(String textToVerify) throws Exception {
		BaseLibrary.SetWaitTime(3000);
		BaseLibrary.verifyText(noDataOnTable,textToVerify);
	}
	public void settlementFilter() throws Exception {

		BaseLibrary.waitAndClickElementsUsingByLocator(settlementfilter);
		

	}
	public void verifySettlementList(String name) throws Exception {
		BaseLibrary.verifyTableListContainsWithSingleColumnWithName(Pub_AssertType,"Asset Type");
	}
	
	public void settlementEdit() throws Exception {
		BaseLibrary.clickOnDynText(Pub_NoOfDays);
		//BaseLibrary.waitAndClickElementsUsingByLocator(settlementEditclick);
		

	}

	public void addNewSettlement() throws Exception {

		BaseLibrary.waitAndClickElementsUsingByLocator(addRules);

		BaseLibrary.SetWaitTime(30);
	}
	public void FilterSearch() throws Exception {
		
		BaseLibrary.SetWaitTime(10);
		BaseLibrary.waitAndClickElementsUsingByLocator(filtersearch);
        BaseLibrary.SetWaitTime(70000);

	}
	public void FilterReset() throws Exception {
		
		BaseLibrary.SetWaitTime(10);
		BaseLibrary.waitAndClickElementsUsingByLocator(filterreset);
        BaseLibrary.SetWaitTime(30);
	}
	public void clickSave() throws Exception {

		BaseLibrary.waitAndClickElementsUsingByLocator(button_Save);
		BaseLibrary.SetWaitTime(30);
		

	}
	public void verifyNumber(String name1) throws Exception {
		BaseLibrary.VerifyDynText(name1);

	}
	public void verifySecurity(String name1) throws Exception {
		BaseLibrary.verifyTableListContainsWithSingleColumnWithName(Pub_SecurityType,"Security Type");
		//BaseLibrary.scrollDownBy350();
	}
	public void verifyAsset(String name1) throws Exception {

		BaseLibrary.verifyTableListContainsWithSingleColumnWithName(Pub_AssertType,"Asset Type");


	}
	public void verifyCountry(String name1) throws Exception {
		BaseLibrary.verifyTableListWithSingleColumnWithName(Pub_CountryCode,"Country");

	}
	public void clickCancelYes() throws Exception {

		BaseLibrary.waitAndClickElementsUsingByLocator(button_cancel);
		BaseLibrary.waitAndClickElementsUsingByLocator(cancel_yes);
		BaseLibrary.SetWaitTime(30);

	}
	public void clickCancelNo() throws Exception {

		BaseLibrary.waitAndClickElementsUsingByLocator(button_cancel);
		BaseLibrary.waitAndClickElementsUsingByLocator(cancel_No);
		BaseLibrary.SetWaitTime(30);

	}

	public void verifysettlementTableList() throws Exception {

		BaseLibrary.verifyTableList_2(days, asset);
		// Base_Library.verifyTableList(HolidayName, HolidayDate);

	}
	public void selectCountryCode(String textToSent) throws Exception {
		final String[] proper_noun = {"United States", "INDIA", "JAPAN", "Canada", "United Kingdom"};
		Random random = new Random();
		int index = random.nextInt(proper_noun.length);
		textToSent = proper_noun[index];
		//System.out.println(proper_noun[index]);
		BaseLibrary.clearText(settlementcountrycode);
		BaseLibrary.clickOnTextFromDropdownList(settlementcountrycode, textToSent);
		DataDrivenUtility dd = new DataDrivenUtility();
		dd.setExcelFile(dataSheetPath,"Settlement");
		dd.setCellValue(1,1,textToSent,dataSheetPath);

	}




	public void selectsettlementAssetType(String textToSent) throws Exception {
		final String[] proper_noun = {"Options", "Equity", "Cryptocurrency", "Fixed Income", "Mutual Fund"};
		Random random = new Random();
		int index = random.nextInt(proper_noun.length);
		textToSent = proper_noun[index];
		BaseLibrary.clearText(settlementassettype);
		BaseLibrary.clickOnTextFromDropdownList(settlementassettype, textToSent);
		DataDrivenUtility dd = new DataDrivenUtility();
		dd.setExcelFile(dataSheetPath,"Settlement");
		dd.setCellValue(2,1,textToSent,dataSheetPath);

	}
	public void selectsettlementSecurityType(String textToSent) throws Exception {
		final String[] proper_noun = {"Certificate", "Common Stock", "Debt Issue (Bond)", "Fixed Income", "Index","Index Options"};
		Random random = new Random();
		int index = random.nextInt(proper_noun.length);
		textToSent = proper_noun[index];
		BaseLibrary.clearText(settlementsecuritytype);
		BaseLibrary.clickOnTextFromDropdownList(settlementsecuritytype, textToSent);
		DataDrivenUtility dd = new DataDrivenUtility();
		dd.setExcelFile(dataSheetPath,"Settlement");
		dd.setCellValue(3,1,textToSent,dataSheetPath);

	}

	public void enterNumberOfDays(String textToSent) throws Exception {

		int min = 200;
		int max = 20000;
		int b = (int)(Math.random()*(max-min+1)+min);
		textToSent = Integer.toString(b);
		BaseLibrary.clearText(settlementnumberofdays);
		BaseLibrary.sendKeysToWebElement(settlementnumberofdays, textToSent);
		DataDrivenUtility dd = new DataDrivenUtility();
		dd.setExcelFile(dataSheetPath,"Settlement");
		dd.setCellValue(4,1,textToSent,dataSheetPath);
	}


	public void enterSettlementInSearchBox(String textToSent) throws Exception {
		BaseLibrary.SetWaitTime(30);
		
		BaseLibrary.sendKeysToWebElement(searchSettlement, Pub_AssertType);
		BaseLibrary.waitAndClickElementsUsingByLocator(searchIcon);
		BaseLibrary.SetWaitTime(30);
	}

	public void enterNoDataSettlementInSearchBox(String textToSent) throws Exception {
		BaseLibrary.SetWaitTime(30);
		BaseLibrary.sendKeysToWebElement(searchSettlement, textToSent);
		BaseLibrary.waitAndClickElementsUsingByLocator(searchIcon);
		BaseLibrary.SetWaitTime(30);
	}

	public void filternumber(String textToSent) throws Exception {
		BaseLibrary.SetWaitTime(30);
		BaseLibrary.sendKeysToWebElement(filternumber, Pub_NoOfDays);
		BaseLibrary.SetWaitTime(10);
	}
	public void filtercountry(String textToSent) throws Exception {
		BaseLibrary.SetWaitTime(30);

		BaseLibrary.clickOnTextFromDropdownList(filtercountry, Pub_CountryCode);
		BaseLibrary.SetWaitTime(10);
	}
	public void filterasset(String textToSent) throws Exception {
		BaseLibrary.SetWaitTime(30);

		BaseLibrary.clickOnTextFromDropdownList(filterasset, Pub_AssertType);
		BaseLibrary.SetWaitTime(30);
	}
	
	public void filtersecurity(String textToSent) throws Exception {
		BaseLibrary.SetWaitTime(30);
		BaseLibrary.clickOnTextFromDropdownList(filtersecurity, Pub_SecurityType);
		BaseLibrary.SetWaitTime(30);
	}
	public void SettlementEdit() throws Exception {

		BaseLibrary.waitAndClickElementsUsingByLocator(settlementEditclick);
		BaseLibrary.SetWaitTime(30);

	}

	public void verifyValidationMessage() throws Exception {
		//*[contains(text(),'Office has been created successfully!')]
		BaseLibrary.verifyText(textTooVerify,"Settlement Rule has been created successfully!");
	}
	public void verifyValidationMessaeWithText(String strVerify) throws Exception {
		BaseLibrary.verifyText(editMessage,strVerify);
		BaseLibrary.waitAndClickElement(closeValidation);
	}
	public void ExportSettlement() throws Exception {
		BaseLibrary.waitAndClickElementsUsingByLocator(exportlink);
		BaseLibrary.waitAndClickElementsUsingByLocator(exportbutton);
		BaseLibrary.SetWaitTime(1000);

	}
	public void ViewColumn() throws Exception {
		BaseLibrary.actionMoveAndClickByLocator(viewcolumn);
		BaseLibrary.actionMoveAndClickByLocator(viewcolumnasset);
		BaseLibrary.actionMoveAndClickByLocator(viewcolumncountry);
		BaseLibrary.SetWaitTime(1000);
	}

	public void loadTestData() throws IOException {
		System.out.println("Load Test Data");
		dd = new DataDrivenUtility();
		dd.setExcelFile(dataSheetPath, "Settlement");
		Pub_CountryCode = dd.getCellData(1, 1);
		Pub_AssertType = dd.getCellData(2, 1);
		Pub_SecurityType = dd.getCellData(3, 1);
		Pub_NoOfDays = dd.getCellData(4, 1);
	}
}
