package pageObjects;

import baseMethods.BaseLibrary;
import org.openqa.selenium.By;

public class TransactionListScreen {
    By systemMaster = By.xpath("//*[@id='simple-menu']/ul/li[4]/em");
    By navigateTransaction = By.xpath("//ul[@class='sub-menu-list']//li//a[text()='Transaction & Journal Listing/Updates']");
    By search = By.xpath("//input[@id='outlined-basic']");
    By searchIcon = By.xpath("//i[@class='search-icon']");
    By filter = By.xpath("//span[text()='Filter By']");
    By exportlink =   By.xpath("//*[@class='MuiSvgIcon-root']");
    By exportbutton =   By.xpath("//li[@role='menuitem']");

    By viewcolumn=By.id("demo-mutiple-checkbox");
    By viewcolumnasset =By.xpath("//*[@data-value='Asset Type']");
    By viewcolumncountry =By.xpath("//*[@data-value='Country']");
    By noDataOnTable = By.xpath("//*[contains(text(),'No data found')]");
    By filtersearch= By.xpath("//span[text()='Search']");
    By filterreset= By.xpath("//span[text()='Reset']");
    By filtercurrency= By.id("filter_currency");
    By filtersymbol= By.id("filter_symbol");
    By filterCorr= By.id("filter_partner");
    By filterOffice= By.id("filter_office");
    By filterAccno= By.id("filter_accountNo");
    By filterAccname= By.id("filter_accountName");
    By filterbatchno= By.id("filter_batchNo");
    By filterAcctype= By.id("filter_accountType");
    By filterTranstype= By.id("filter_transactionType");
    By filterEntrytype= By.id("filter_entryType");
    By filterTradedate= By.id("filter_tradeDate");
    By filterSettdate= By.id("filter_settlementDate");
    By filterEntrydate= By.id("filter_entryDate");
    By filterPrice= By.id("filter_price");
    By filterGrossamt= By.id("filter_grossAmount");
    By filterNetamt= By.id("filter_netAmount");
    By filterTansacNo= By.id("filter_transactionNo");
    By listAccname= By.xpath("//em[text()='Acc. Name']");
    By listAccno= By.xpath("//em[text()='Acc. No']");
    By listOffice= By.xpath("//em[text()='Office']");
    By listCorr= By.xpath("//em[text()='Correspondent']");
    By listbatchno= By.xpath("//em[text()='Batch No']");

    By listAcctype= By.xpath("//em[text()='Acc. Type']");
    By listTrantype= By.xpath("//em[text()='Tran Type']");
    By listEntrytype= By.xpath("//em[text()='Entry Type']");
    By listTradedate= By.xpath("//em[text()='Trade Date']");
    By listSettdate= By.xpath("//em[text()='Settle Date']");
    By listEntrydate= By.xpath("//em[text()='Entry Date']");
    By listprice= By.xpath("//em[text()='Price']");
    By listgross= By.xpath("//em[text()='Gross Amount']");
    By listnet= By.xpath("//em[text()='Net Amount']");
    By listTranno= By.xpath("//em[text()='Tran No']");
    By scroll= By.xpath("//div[@class='ps__thumb-x']");
    
    
    
    
    
    public void clickSystemMaster() throws Exception {
        BaseLibrary.waitAndClickElementsUsingByLocator(systemMaster);
        BaseLibrary.SetWaitTime(1000);
        BaseLibrary.waitAndClickElement(navigateTransaction);
    }


    public void SearchTransaction(String textToSent) throws Exception {

        BaseLibrary.sendKeysToWebElement(search, textToSent);
        BaseLibrary.waitAndClickElementsUsingByLocator(searchIcon);
        BaseLibrary.SetWaitTime(30);

    }
    public void verifyNoDataDisplayed(String textToVerify) throws Exception {
        BaseLibrary.SetWaitTime(3000);
        BaseLibrary.verifyText(noDataOnTable,textToVerify);
    }
    public void Filter() throws Exception {

        BaseLibrary.waitAndClickElementsUsingByLocator(filter);

    }
    public void FilterCurrency(String text) throws Exception {
        BaseLibrary.SetWaitTime(1000);
       BaseLibrary.setFocusToElement(By.id("filter_netAmount"));
        BaseLibrary.clickOnTextFromDropdownList(filtercurrency,text);

    }
    public void FilterSymbol(String text) throws Exception {
        BaseLibrary.setFocusToElement(filtersymbol);
        BaseLibrary.clickOnTextFromDropdownList_two(filtersymbol,text);
    }
    public void FilterBatchNumber(String text) throws Exception {
        BaseLibrary.setFocusToElement(filterbatchno);
        BaseLibrary.clickOnTextFromDropdownList(filterbatchno,text);
    }
    public void FilterCorrespondent(String text) throws Exception {
        BaseLibrary.setFocusToElement(filterCorr);
        BaseLibrary.clickOnTextFromDropdownList(filterCorr,text);
    }
    public void FilterOffice(String text) throws Exception {
        BaseLibrary.setFocusToElement(filterOffice);
        BaseLibrary.clickOnTextFromDropdownList(filterOffice,text);
    }
    public void FilterAccountNumber(String text) throws Exception {
        BaseLibrary.setFocusToElement(filterAccno);
        BaseLibrary.clickOnTextFromDropdownList(filterAccno,text);
    }
    public void FilterAccountName(String text) throws Exception {
        BaseLibrary.setFocusToElement(filterAccname);
        BaseLibrary.clickOnTextFromDropdownList(filterAccname,text);
    }
    public void FilterAccountType(String text) throws Exception {
        BaseLibrary.setFocusToElement(filterAcctype);
        BaseLibrary.clickOnTextFromDropdownList_two(filterAcctype,text);
    }
    public void FilterTransactionType(String text) throws Exception {
        BaseLibrary.setFocusToElement(filterEntrytype);
        BaseLibrary.clickOnTextFromDropdownList(filterTranstype,text);
    }
    public void FilterEntryType(String text) throws Exception {
        BaseLibrary.setFocusToElement(filtercurrency);
        BaseLibrary.clickOnTextFromDropdownList(filterEntrytype,text);
    }
    public void FilterTransactionNumber(String text) throws Exception {
        BaseLibrary.setFocusToElement(filterTansacNo);
        BaseLibrary.clickOnTextFromDropdownList(filterTansacNo,text);
    }
    public void FilterTradeDate(String text) throws Exception {
        BaseLibrary.setFocusToElement(filterSettdate);
        BaseLibrary.clickOnTextFromDropdownList(filterTradedate,text);
    }
    public void FilterSettlementDate(String text) throws Exception {
        BaseLibrary.setFocusToElement(filterEntrydate);
        BaseLibrary.clickOnTextFromDropdownList(filterSettdate,text);
    }
    public void FilterEntryDate(String text) throws Exception {
        BaseLibrary.setFocusToElement(filterPrice);
        BaseLibrary.clickOnTextFromDropdownList(filterEntrydate,text);
    }
    public void FilterPrice(String text) throws Exception {
        BaseLibrary.setFocusToElement(filterGrossamt);
        BaseLibrary.clickOnTextFromDropdownList(filterPrice,text);
    }
    public void FilterGrossAmount(String text) throws Exception {
        BaseLibrary.setFocusToElement(filterNetamt);
        BaseLibrary.clickOnTextFromDropdownList(filterGrossamt,text);
    }
    public void FilterNetAmount(String text) throws Exception {
        BaseLibrary.setFocusToElement(filterNetamt);
        BaseLibrary.clickOnTextFromDropdownList(filterNetamt,text);
    }
    public void verifyBatchnumber(String name) throws Exception {
        BaseLibrary.setFocusToElement(listbatchno);
        BaseLibrary.verifyTableListWithSingleColumnWithName(name, "Batch No");
    }
    public void verifycurrency(String text) throws Exception {
        BaseLibrary.verifyTableListWithSingleColumnWithName(text, "Currency");
    }
    public void verifysymbol(String name) throws Exception {
        BaseLibrary.verifyTableListWithSingleColumnWithName(name, "Symbol");
    }
    public void verifyCorrespondent(String name) throws Exception {
        BaseLibrary.setFocusToElement(listCorr);
        BaseLibrary.verifyTableListWithSingleColumnWithName(name, "Correspondent");
    }
    public void verifyOffice(String name) throws Exception {
        BaseLibrary.setFocusToElement(listOffice);
        BaseLibrary.verifyTableListWithSingleColumnWithName(name, "Office");
    }
    public void verifyAccountName(String name) throws Exception {
        BaseLibrary.setFocusToElement(listAccname);
        BaseLibrary.verifyTableListWithSingleColumnWithName(name, "Acc. Name");
    }
    public void verifyAccountNumber(String name) throws Exception {
        BaseLibrary.setFocusToElement(listAccno);
        BaseLibrary.verifyTableListWithSingleColumnWithName(name, "Acc. No");
    }
    public void verifyAccountType(String name) throws Exception {
        BaseLibrary.setFocusToElement(listAcctype);
        BaseLibrary.verifyTableListWithSingleColumnWithName(name, "Acc. Type");
    }
    public void verifyTransactionType(String name) throws Exception {
        BaseLibrary.setFocusToElement(listTrantype);
        BaseLibrary.verifyTableListWithSingleColumnWithName(name, "Tran Type");
    }
    public void verifyEntrytype(String name) throws Exception {
        BaseLibrary.setFocusToElement(listEntrytype);
        BaseLibrary.verifyTableListWithSingleColumnWithName(name, "Entry Type");
    }
    public void verifyTransactionNumber(String name) throws Exception {
        BaseLibrary.setFocusToElement(listTranno);
        BaseLibrary.VerifyDynText(name);
    }

    public void verifyTradeDate(String name) throws Exception {
        BaseLibrary.setFocusToElement(listTradedate);
        BaseLibrary.verifyTableListWithSingleColumnWithName(name, "Trade Date");
    }
    public void verifySettlementDate(String name) throws Exception {
        BaseLibrary.setFocusToElement(listSettdate);
        BaseLibrary.verifyTableListWithSingleColumnWithName(name, "Settle Date");
    }
    public void verifyEntrydate(String name) throws Exception {
        BaseLibrary.setFocusToElement(listbatchno);
        BaseLibrary.verifyTableListWithSingleColumnWithName(name, "Entry Date");
    }
    public void verifyPrice(String name) throws Exception {
        BaseLibrary.setFocusToElement(listprice);
        BaseLibrary.verifyTableListWithSingleColumnWithName(name, "Price");
    }
    public void verifyGrossAmount(String name) throws Exception {
        BaseLibrary.setFocusToElement(listgross);
        BaseLibrary.verifyTableListWithSingleColumnWithName(name, "Gross Amount");
    }
    public void verifyNetAmount(String name) throws Exception {
        BaseLibrary.setFocusToElement(listnet);
        BaseLibrary.verifyTableListWithSingleColumnWithName(name, "Net Amount");
    }

    public void verifySearchList(String name) throws Exception {
        BaseLibrary.VerifyDynText(name);
    }
}
