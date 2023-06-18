package pageObjects;

import baseMethods.BaseLibrary;
import org.openqa.selenium.By;

public class StockJournalScreen {
    By systemMaster = By.xpath("//*[@id='simple-menu']/ul/li[4]/em");
    By navigateStock = By.xpath("//ul[@class='sub-menu-list']//li//a[text()='Stock Journal Entry']");
    By systemMaster1 = By.xpath("//*[@id='simple-menu']/ul/li[4]/em");
    By navigateTransaction = By.xpath("//ul[@class='sub-menu-list']//li//a[text()='Transaction & Journal Listing/Updates']");

    By pcompany = By.xpath("//input[@class]");
    By ppartner = By.xpath("//input[@class]//following::input[1]");
    By poffice = By.xpath("//input[@class]//following::input[2]");
    By psuboffice = By.xpath("//input[@class]//following::input[3]");
    By paccountnumber = By.xpath("//input[@class]//following::input[4]");
    By paccounttype = By.xpath("//input[@class]//following::input[5]");

    By ccompany = By.xpath("//input[@class]//following::input[6]");
    By cpartner = By.xpath("//input[@class]//following::input[7]");
    By coffice = By.xpath("//input[@class]//following::input[8]");
    By csuboffice = By.xpath("//input[@class]//following::input[9]");
    By caccountnumber = By.xpath("//input[@class]//following::input[10]");
    By caccounttype = By.xpath("//input[@class]//following::input[11]");

    By symbol = By.xpath("//input[@class]//following::input[12]");
    By quantity = By.xpath("//input[@class]//following::input[13]");
    By costbasis = By.xpath("//input[@class]//following::input[14]");
    By description = By.xpath("//textarea[@class]");

    By entrytype = By.xpath("//input[@class]//following::input[15]");
    By currency = By.xpath("//input[@class]//following::input[16]");
    By source = By.xpath("//input[@class]//following::input[17]");
    By batchno = By.xpath("//input[@class]//following::input[18]");
    By tradedate = By.xpath("//input[@class]//following::input[19]");

    By button_Save = By.xpath("//*[text()='Save']");
    By search = By.xpath("//input[@id='outlined-basic']");
    By searchIcon = By.xpath("//i[@class='search-icon']");
    By filter = By.xpath("//span[text()='Filter By']");
    By textTooVerify = By.xpath("//*[contains(text(),'Stock Journal has been created successfully!')]");
    By searchTransaction = By.xpath("//input[@id='outlined-basic']");
    By EditTrade = By.xpath("//span[text()='Edit Trade']");
    By CancelTrade = By.xpath("//span[text()='Cancel Trade']");
    By editdetails = By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiAutocomplete-input MuiAutocomplete-inputFocused MuiInputBase-inputAdornedEnd MuiOutlinedInput-inputAdornedEnd']");
    By editMessage =   By.xpath("//*[contains(text(),'has been saved successfully!')]");
    By cancelMessage =   By.xpath("//*[contains(text(),'has been Cancelled successfully!')]");
    By canceldetails = By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiAutocomplete-input MuiAutocomplete-inputFocused MuiInputBase-inputAdornedEnd MuiOutlinedInput-inputAdornedEnd']");
    By save = By.xpath("//span[text()='Save']");
    By closeValidation = By.xpath("//*[@title='Close']");
    By addentry = By.xpath("//span[text()='Add Entry']");
    By clear = By.xpath("//span[text()='Clear']");


    public void clickSystemMaster() throws Exception {
        BaseLibrary.waitAndClickElementsUsingByLocator(systemMaster);
        BaseLibrary.SetWaitTime(1000);
        BaseLibrary.waitAndClickElement(navigateStock);
    }

    public void primarycompany(String text) throws Exception {
        BaseLibrary.setFocusToElement(pcompany);
        BaseLibrary.clearText(pcompany);
        BaseLibrary.clickOnTextFromDropdownList(pcompany, text);
        // BaseLibrary.SetWaitTime(100);
    }

    public void primarypartner(String text) throws Exception {
        BaseLibrary.setFocusToElement(ppartner);
        BaseLibrary.clearText(ppartner);
        BaseLibrary.clickOnTextFromDropdownList(ppartner, text);
        // BaseLibrary.SetWaitTime(100);
    }

    public void primaryoffice(String text) throws Exception {
        BaseLibrary.setFocusToElement(poffice);
        BaseLibrary.clearText(poffice);
        BaseLibrary.clickOnTextFromDropdownList(poffice, text);
        // BaseLibrary.SetWaitTime(100);
    }

    public void primarysuboffice(String text) throws Exception {
        BaseLibrary.setFocusToElement(psuboffice);
        BaseLibrary.clearText(psuboffice);
        BaseLibrary.clickOnTextFromDropdownList(psuboffice, text);
        //   BaseLibrary.SetWaitTime(100);
    }

    public void primaryAccountnumber(String text) throws Exception {
        BaseLibrary.setFocusToElement(paccountnumber);
        BaseLibrary.clearText(paccountnumber);
        BaseLibrary.clickOnTextFromDropdownList(paccountnumber, text);
        //   BaseLibrary.SetWaitTime(100);
    }

    public void contracompany(String text) throws Exception {
        BaseLibrary.setFocusToElement(ccompany);
        BaseLibrary.clearText(ccompany);
        BaseLibrary.clickOnTextFromDropdownList(ccompany, text);
        //    BaseLibrary.SetWaitTime(100);
    }

    public void contrapartner(String text) throws Exception {
        BaseLibrary.setFocusToElement(cpartner);
        BaseLibrary.clearText(cpartner);
        BaseLibrary.clickOnTextFromDropdownList(cpartner, text);
        //     BaseLibrary.SetWaitTime(100);
    }

    public void contraoffice(String text) throws Exception {
        BaseLibrary.setFocusToElement(coffice);
        BaseLibrary.clearText(coffice);
        BaseLibrary.clickOnTextFromDropdownList(coffice, text);
        //    BaseLibrary.SetWaitTime(100);
    }

    public void contrasuboffice(String text) throws Exception {
        BaseLibrary.setFocusToElement(csuboffice);
        BaseLibrary.clearText(csuboffice);
        BaseLibrary.clickOnTextFromDropdownList(csuboffice, text);
        //     BaseLibrary.SetWaitTime(100);
    }

    public void contraAccountnumber(String text) throws Exception {
        BaseLibrary.setFocusToElement(caccountnumber);
        BaseLibrary.clearText(caccountnumber);
        BaseLibrary.clickOnTextFromDropdownList(caccountnumber, text);
        //   BaseLibrary.SetWaitTime(100);
    }
    public void Symbol(String text) throws Exception {
        BaseLibrary.setFocusToElement(symbol);
        BaseLibrary.clearText(symbol);
        BaseLibrary.clickOnTextFromDropdownList(symbol, text);
        //   BaseLibrary.SetWaitTime(100);
    }
    public void Quantity(String text) throws Exception {
        BaseLibrary.setFocusToElement(quantity);
        BaseLibrary.clearText(quantity);
        BaseLibrary.sendKeysToWebElement(quantity, text);
        //   BaseLibrary.SetWaitTime(100);
    }
    public void CostBasis(String text) throws Exception {
        BaseLibrary.setFocusToElement(costbasis);
        BaseLibrary.clearText(costbasis);
        BaseLibrary.sendKeysToWebElement(costbasis, text);
        //   BaseLibrary.SetWaitTime(100);
    }
    public void Description(String text) throws Exception {
        BaseLibrary.setFocusToElement(description);
        BaseLibrary.clearText(description);
        BaseLibrary.sendKeysToWebElement(description, text);
        //   BaseLibrary.SetWaitTime(100);
    }
    public void EntryType(String text) throws Exception {
        BaseLibrary.setFocusToElement(entrytype);
        BaseLibrary.clearText(entrytype);
        BaseLibrary.clickOnTextFromDropdownList(entrytype, text);
        //   BaseLibrary.SetWaitTime(100);

    }
    public void Currency(String text) throws Exception {
        BaseLibrary.setFocusToElement(currency);
        BaseLibrary.clearText(currency);
        BaseLibrary.clickOnTextFromDropdownList(currency, text);
        //    BaseLibrary.SetWaitTime(100);
    }

    public void Source(String text) throws Exception {
        BaseLibrary.setFocusToElement(source);
        BaseLibrary.clearText(source);
        BaseLibrary.sendKeysToWebElement(source, text);
        //     BaseLibrary.SetWaitTime(100);
    }
    public void BatchNumber(String text) throws Exception {
        BaseLibrary.setFocusToElement(batchno);
        BaseLibrary.clearText(batchno);
        BaseLibrary.sendKeysToWebElement(batchno, text);
        //     BaseLibrary.SetWaitTime(100);
    }
    public void TradeDate(String text) throws Exception {
        BaseLibrary.setFocusToElement(tradedate);
        BaseLibrary.clearText(tradedate);
        BaseLibrary.sendKeysToWebElement(tradedate, text);
        BaseLibrary.SetWaitTime(100);
    }
    public void AddEntry() throws Exception {
        ;
        BaseLibrary.setFocusToElement(addentry);
        BaseLibrary.waitAndClickElementsUsingByLocator(addentry);
        //   BaseLibrary.SetWaitTime(100000);
    }
    public void StockSave() throws Exception {
        ;
        BaseLibrary.setFocusToElement(button_Save);
        BaseLibrary.waitAndClickElementsUsingByLocator(button_Save);
        //   BaseLibrary.SetWaitTime(100000);
    }

    public void verifyValidationMessage(String sVerify) throws Exception {

        BaseLibrary.verifyText(By.xpath("//*[contains(text(),'Stock Journal  has been created successfully!')]"), sVerify);
        BaseLibrary.waitAndClickElement(By.xpath("//button[@title='Close']"));
    }


    public void SearchTransaction(String textToSent) throws Exception {


        BaseLibrary.waitAndClickElementsUsingByLocator(systemMaster1);
        BaseLibrary.SetWaitTime(1000);
        BaseLibrary.waitAndClickElement(navigateTransaction);

        BaseLibrary.sendKeysToWebElement(searchTransaction, textToSent);
        BaseLibrary.waitAndClickElementsUsingByLocator(searchIcon);
        BaseLibrary.SetWaitTime(30);
        BaseLibrary.clickOnDynText(textToSent);

    }
    public void EditStockJournal(String textToSent) throws Exception {

        BaseLibrary.waitAndClickElementsUsingByLocator(EditTrade);
        BaseLibrary.clickOnTextFromDropdownList(editdetails,textToSent);
    }
    public void CancelStockJournal(String textToSent) throws Exception {

        BaseLibrary.waitAndClickElementsUsingByLocator(CancelTrade);
        BaseLibrary.clickOnTextFromDropdownList(editdetails,textToSent);
        BaseLibrary.waitAndClickElementsUsingByLocator(save);
    }
    public void verifyValidationMessageWithText(String strVerify) throws Exception {
        BaseLibrary.verifyText(editMessage,strVerify);
        BaseLibrary.waitAndClickElement(closeValidation);
    }
    public void verifyCancelValidationMessageWithText(String strVerify) throws Exception {
        BaseLibrary.verifyText(cancelMessage,strVerify);
        BaseLibrary.waitAndClickElement(closeValidation);
    }
    public void Clear() throws Exception {
        ;
        BaseLibrary.setFocusToElement(clear);
        BaseLibrary.waitAndClickElementsUsingByLocator(clear);
        //   BaseLibrary.SetWaitTime(100000);
    }

}
