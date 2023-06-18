package pageObjects;

import baseMethods.BaseLibrary;
import org.openqa.selenium.By;

import java.util.Random;

public class TradeEntryScreen {
    By systemMaster = By.xpath("//*[@id='simple-menu']/ul/li[4]/em");
    By navigateTrade = By.xpath("//ul[@class='sub-menu-list']//li//a[text()='Trade/Journal Entry']");

    By systemMaster1 = By.xpath("//*[@id='simple-menu']/ul/li[4]/em");
    By navigateTransaction = By.xpath("//ul[@class='sub-menu-list']//li//a[text()='Transaction & Journal Listing/Updates']");

    By pcompany = By.xpath("//input[@class]");
    By ppartner = By.xpath("//input[@class]//following::input[1]");
    By poffice = By.xpath("//input[@class]//following::input[2]");
    By psuboffice = By.xpath("//input[@class]//following::input[3]");
    By paccountnumber = By.xpath("//input[@class]//following::input[4]");
    By paccounttype = By.xpath("//input[@class]//following::input[5]");


    By contrabrokercode = By.xpath("//input[@class]//following::input[6]");
    By ccompany = By.xpath("//input[@class]//following::input[7]");
    By cpartner = By.xpath("//input[@class]//following::input[8]");
    By coffice = By.xpath("//input[@class]//following::input[9]");
    By csuboffice = By.xpath("//input[@class]//following::input[10]");
    By caccountnumber = By.xpath("//input[@class]//following::input[11]");
    By caccounttype = By.xpath("//input[@class]//following::input[12]");

    By entrytype = By.xpath("//input[@class]//following::input[13]");
    By trantype = By.xpath("//input[@class]//following::input[14]");
    By symbol = By.xpath("//input[@class]//following::input[15]");
    By tradecurrency = By.xpath("//input[@class]//following::input[16]");
    By quantity = By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input']");
    By price = By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input']//following::input[1]");
    By tradedate = By.id("add_tradeDate");
    By execution = By.id("time-picker");
    By blotter = By.xpath("//input[@class]//following::input[24]");
    By solicited = By.xpath("//*[text()='Yes']");
    By capacity = By.xpath("//input[@class]//following::input[25]");
    By settlementcurrency = By.xpath("//input[@class]//following::input[26]");
    By country = By.xpath("//input[@class]//following::input[27]");
    By location = By.xpath("//input[@class]//following::input[28]");
    By trade70E = By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input']//following::input[12]");
    By tradetag = By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input']//following::input[13]");
    By description = By.xpath("//textarea[@class]");
    By rrcode = By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input']//following::input[14]");
    By group = By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input']//following::input[15]");
    By ordid = By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input']//following::input[16]");
    By trailercode = By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input']//following::input[17]");
    By memo1 = By.xpath("//*[@class]//following::textarea[3]");
    By memo2 = By.xpath("//*[@class]//following::textarea[5]");
    By comm = By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input']//following::input[18]");
    By commtype = By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input']//following::input[19]");
    By regfee = By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input']//following::input[20]");
    By ecnfee = By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input']//following::input[21]");
    By exchangefee = By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input']//following::input[22]");
    By clearingfee = By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input']//following::input[23]");
    By brokerfee = By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input']//following::input[24]");
    By occfee = By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input']//following::input[25]");
    By otherfee = By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input']//following::input[26]");
    By tefra = By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input']//following::input[27]");
    By tradememo1 = By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input']//following::input[19]");
    By tradememo2 = By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input']//following::input[20]");
    By addfee = By.xpath("//img[@alt='add new row']");
    By feecode = By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input']//following::input[28]");
    By feeamount = By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input']//following::input[29]");
    By appliedto = By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input']//following::input[30]");
    By button_Save = By.xpath("//*[text()='Save']");
    By search = By.xpath("//input[@id='outlined-basic']");
    By searchIcon = By.xpath("//i[@class='search-icon']");
    By filter = By.xpath("//span[text()='Filter By']");
    By textTooVerify = By.xpath("//*[contains(text(),'Trade Entry has been created successfully!')]");
    By searchTransaction = By.xpath("//input[@id='outlined-basic']");
    By EditTrade = By.xpath("//span[text()='Edit Trade']");
    By CancelTrade = By.xpath("//span[text()='Cancel Trade']");
    By editdetails = By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiAutocomplete-input MuiAutocomplete-inputFocused MuiInputBase-inputAdornedEnd MuiOutlinedInput-inputAdornedEnd']");
    By editMessage =   By.xpath("//*[contains(text(),'has been Updated successfully!')]");
    By cancelMessage =   By.xpath("//*[contains(text(),'has been Cancelled successfully!')]");
    By canceldetails = By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiAutocomplete-input MuiAutocomplete-inputFocused MuiInputBase-inputAdornedEnd MuiOutlinedInput-inputAdornedEnd']");
    By save = By.xpath("//span[text()='Save']");
    By closeValidation = By.xpath("//*[@title='Close']");

    public void clickSystemMaster() throws Exception {
        BaseLibrary.waitAndClickElementsUsingByLocator(systemMaster);
        BaseLibrary.SetWaitTime(1000);
        BaseLibrary.waitAndClickElement(navigateTrade);
    }

    public void primarycompany(String text) throws Exception {
        BaseLibrary.clearText(pcompany);
        BaseLibrary.clickOnTextFromDropdownList(pcompany, text);
        // BaseLibrary.SetWaitTime(100);
    }

    public void primarypartner(String text) throws Exception {
        BaseLibrary.clearText(ppartner);
        BaseLibrary.clickOnTextFromDropdownList(ppartner, text);
        // BaseLibrary.SetWaitTime(100);
    }

    public void primaryoffice(String text) throws Exception {
        BaseLibrary.clearText(poffice);
        BaseLibrary.clickOnTextFromDropdownList(poffice, text);
        // BaseLibrary.SetWaitTime(100);
    }

    public void primarysuboffice(String text) throws Exception {
        BaseLibrary.clearText(psuboffice);
        BaseLibrary.clickOnTextFromDropdownList(psuboffice, text);
        //   BaseLibrary.SetWaitTime(100);
    }

    public void primaryAccountnumber(String text) throws Exception {
        BaseLibrary.clearText(paccountnumber);
        BaseLibrary.clickOnTextFromDropdownList(paccountnumber, text);
        //   BaseLibrary.SetWaitTime(100);
    }


    public void contraBrokerCode(String text) throws Exception {
        BaseLibrary.clearText(contrabrokercode);
        BaseLibrary.clickOnTextFromDropdownList(contrabrokercode, text);
        //   BaseLibrary.SetWaitTime(100);

    }

    public void contracompany(String text) throws Exception {
        BaseLibrary.clearText(ccompany);
        BaseLibrary.clickOnTextFromDropdownList(ccompany, text);
        //    BaseLibrary.SetWaitTime(100);
    }

    public void contrapartner(String text) throws Exception {
        BaseLibrary.clearText(cpartner);
        BaseLibrary.clickOnTextFromDropdownList(cpartner, text);
        //     BaseLibrary.SetWaitTime(100);
    }

    public void contraoffice(String text) throws Exception {
        BaseLibrary.clearText(coffice);
        BaseLibrary.clickOnTextFromDropdownList(coffice, text);
        //    BaseLibrary.SetWaitTime(100);
    }

    public void contrasuboffice(String text) throws Exception {
        BaseLibrary.clearText(csuboffice);
        BaseLibrary.clickOnTextFromDropdownList(csuboffice, text);
        //     BaseLibrary.SetWaitTime(100);
    }

    public void contraAccountnumber(String text) throws Exception {
        BaseLibrary.clearText(caccountnumber);
        BaseLibrary.clickOnTextFromDropdownList(caccountnumber, text);
        //   BaseLibrary.SetWaitTime(100);
    }

    public void EntryType(String text) throws Exception {
        BaseLibrary.clearText(entrytype);
        BaseLibrary.setFocusToElement(entrytype);
        BaseLibrary.clickOnTextFromDropdownList(entrytype, text);
        //   BaseLibrary.SetWaitTime(100);

    }

    public void TransactionType(String text) throws Exception {
        BaseLibrary.clearText(trantype);
        BaseLibrary.setFocusToElement(trantype);

        BaseLibrary.clickOnTextFromDropdownList(trantype, text);
        //    BaseLibrary.SetWaitTime(100);

    }

    public void RandomTransactionType() throws Exception {
        BaseLibrary.clearText(trantype);
        BaseLibrary.setFocusToElement(trantype);
        Random r = new Random();
        int low = 0;
        int high = 2;
        int result = r.nextInt(high-low) + low;
        String data[] = {"Sell","Buy"};

        BaseLibrary.clickOnTextFromDropdownList(trantype, data[result]);
        //    BaseLibrary.SetWaitTime(100);

    }
    public void RandomEntryType() throws Exception {
        BaseLibrary.clearText(entrytype);
        BaseLibrary.setFocusToElement(entrytype);
        Random r = new Random();
        int low = 0;
        int high = 100;
        int result = r.nextInt(high-low) + low;
        String data[] = {"ACATC","ACATS","ADRFEE","CADJ","CADJR","CADJW",
                "CDEP","CDMF","CLQ","CLQF","CLTW","COMDEP","CONV","CSD",
                "CSR","CSR05","CSR10","DEL","DIV","DIVCGL","DIVCGS","DIVFEE",
                "DIVFT","DIVNRA","DIVROC","DIVTW","DIVTXEX","DK","DTCRCL","DTCSUS",
                "DTF","DTFRG","DTFTA","DVP","DVPB","DVPBC","DVPC","DVPR","DWACD",
                "DWACR","FTD","FTR","IADJ","INT","INTBD","INTBN","INTBT","INTNRA",
                "INTS","INTS","ITRF","JNL","LMRK","MA","MAC","MAS","MFEEI","NC",
                "OPASN","OPEXP","OPXRC","PL","PTC","PTR","REC","REORG","REP",
                "RND","RRP","RTS","RVP","RVPB","RVPBC","RVPC","RVPR","SB","SC",
                "SDO","SECDEP","SL","SPO","SRI","SSO","SSP","TRD","VOLUN","WIREI",
                "WIREO","WTS","XJNL","XTRF","XTRFG"};

        BaseLibrary.clickOnTextFromDropdownList(entrytype, data[result]);
        //    BaseLibrary.SetWaitTime(100);

    }



    public void Symbol(String text) throws Exception {
        BaseLibrary.clearText(symbol);
        BaseLibrary.setFocusToElement(symbol);

        BaseLibrary.clickOnTextFromDropdownList(symbol, text);
        //     BaseLibrary.SetWaitTime(100);

    }

    public void TradeCurrency(String text) throws Exception {
        BaseLibrary.setFocusToElement(tradecurrency);
        BaseLibrary.clearText(tradecurrency);

        BaseLibrary.clickOnTextFromDropdownList(tradecurrency, text);
        //    BaseLibrary.SetWaitTime(100);
    }

    public void Quantity(String text) throws Exception {
        BaseLibrary.setFocusToElement(quantity);
        BaseLibrary.clearText(quantity);
        BaseLibrary.sendKeysToWebElement(quantity, text);
        //     BaseLibrary.SetWaitTime(100);
    }

    public void Price(String text) throws Exception {
        BaseLibrary.setFocusToElement(price);
        BaseLibrary.clearText(price);
        BaseLibrary.sendKeysToWebElement(price, text);
        //   BaseLibrary.SetWaitTime(100);
    }

    public void Execution(String text) throws Exception {
        BaseLibrary.setFocusToElement(execution);
        BaseLibrary.clearText(execution);
        BaseLibrary.sendKeysToWebElement(execution, text);
        //     BaseLibrary.SetWaitTime(100);
    }

    public void TradeDate(String text) throws Exception {
        BaseLibrary.setFocusToElement(tradedate);
        BaseLibrary.clearText(tradedate);
        BaseLibrary.sendKeysToWebElement(tradedate, text);
        BaseLibrary.SetWaitTime(100);
    }

    public void Blotter(String text) throws Exception {
        BaseLibrary.setFocusToElement(blotter);
        BaseLibrary.clearText(blotter);
        BaseLibrary.clickOnTextFromDropdownList(blotter, text);
        //    BaseLibrary.SetWaitTime(100);
    }

    public void Capacity(String text) throws Exception {
        BaseLibrary.setFocusToElement(capacity);
        BaseLibrary.clearText(capacity);
        BaseLibrary.clickOnTextFromDropdownList(capacity, text);
        //    BaseLibrary.SetWaitTime(100);
    }

    public void SettlementCurrency(String text) throws Exception {
        BaseLibrary.setFocusToElement(settlementcurrency);
        BaseLibrary.clearText(settlementcurrency);
        BaseLibrary.clickOnTextFromDropdownList(settlementcurrency, text);
        //    BaseLibrary.SetWaitTime(100);
    }

    public void Country(String text) throws Exception {
        BaseLibrary.setFocusToElement(country);
        BaseLibrary.clearText(country);
        BaseLibrary.clickOnTextFromDropdownList(country, text);
        //    BaseLibrary.SetWaitTime(100);
    }

    public void Location(String text) throws Exception {
        BaseLibrary.setFocusToElement(location);
        BaseLibrary.clearText(location);
        BaseLibrary.clickOnTextFromDropdownList(location, text);
        //    BaseLibrary.SetWaitTime(100);
    }

    public void Tag70E(String text) throws Exception {
        BaseLibrary.setFocusToElement(trade70E);
        BaseLibrary.clearText(trade70E);
        BaseLibrary.sendKeysToWebElement(trade70E, text);
        //    BaseLibrary.SetWaitTime(100);
    }

    public void TradeTag(String text) throws Exception {
        BaseLibrary.setFocusToElement(tradetag);
        BaseLibrary.clearText(tradetag);
        BaseLibrary.sendKeysToWebElement(tradetag, text);
        //    BaseLibrary.SetWaitTime(100);
    }

    public void Description(String text) throws Exception {
        BaseLibrary.setFocusToElement(description);
        BaseLibrary.clearText(description);
        BaseLibrary.sendKeysToWebElement(description, text);
        //    BaseLibrary.SetWaitTime(100);
    }

    public void RRcode(String text) throws Exception {
        BaseLibrary.setFocusToElement(rrcode);
        BaseLibrary.clearText(rrcode);
        BaseLibrary.clickOnTextFromDropdownList(rrcode, text);
        //    BaseLibrary.SetWaitTime(100);
    }

    public void Group(String text) throws Exception {
        BaseLibrary.setFocusToElement(group);
        BaseLibrary.clearText(group);
        BaseLibrary.clickOnTextFromDropdownList(group, text);
        //    BaseLibrary.SetWaitTime(100);
    }

    public void Ordid(String text) throws Exception {
        BaseLibrary.setFocusToElement(ordid);
        BaseLibrary.clearText(ordid);
        BaseLibrary.sendKeysToWebElement(ordid, text);
        //    BaseLibrary.SetWaitTime(100);
    }

    public void Trailercodes(String text) throws Exception {
        BaseLibrary.setFocusToElement(trailercode);
        BaseLibrary.clearText(trailercode);
        BaseLibrary.sendKeysToWebElement(trailercode, text);
        //    BaseLibrary.SetWaitTime(100);
    }

    public void Memo1(String text) throws Exception {
        BaseLibrary.setFocusToElement(memo1);
        BaseLibrary.clearText(memo1);
        BaseLibrary.sendKeysToWebElement(memo1, text);
        //    BaseLibrary.SetWaitTime(100);
    }

    public void Memo2(String text) throws Exception {
        BaseLibrary.setFocusToElement(memo2);
        BaseLibrary.clearText(memo2);
        BaseLibrary.sendKeysToWebElement(memo2, text);
        //    BaseLibrary.SetWaitTime(100);
    }

    public void Commission(String text) throws Exception {
        BaseLibrary.setFocusToElement(comm);
        BaseLibrary.clearText(comm);
        BaseLibrary.sendKeysToWebElement(comm, text);
        //    BaseLibrary.SetWaitTime(100);
    }

    public void CommissionType(String text) throws Exception {
        BaseLibrary.setFocusToElement(commtype);
        BaseLibrary.clearText(commtype);
        BaseLibrary.clickOnTextFromDropdownList(commtype, text);
        //    BaseLibrary.SetWaitTime(100);
    }

    public void RegFee(String text) throws Exception {
        BaseLibrary.setFocusToElement(regfee);
        BaseLibrary.clearText(regfee);
        BaseLibrary.sendKeysToWebElement(regfee, text);
        //    BaseLibrary.SetWaitTime(100);
    }

    public void ECNFee(String text) throws Exception {
        BaseLibrary.setFocusToElement(ecnfee);
        BaseLibrary.clearText(ecnfee);
        BaseLibrary.sendKeysToWebElement(ecnfee, text);
        //    BaseLibrary.SetWaitTime(100);
    }

    public void ExchangeFee(String text) throws Exception {
        BaseLibrary.setFocusToElement(exchangefee);
        BaseLibrary.clearText(exchangefee);
        BaseLibrary.sendKeysToWebElement(exchangefee, text);
        //    BaseLibrary.SetWaitTime(100);
    }

    public void ClearingFee(String text) throws Exception {
        BaseLibrary.setFocusToElement(clearingfee);
        BaseLibrary.clearText(clearingfee);
        BaseLibrary.sendKeysToWebElement(clearingfee, text);
        //    BaseLibrary.SetWaitTime(100);
    }

    public void BrokerFee(String text) throws Exception {
        BaseLibrary.setFocusToElement(brokerfee);
        BaseLibrary.clearText(brokerfee);
        BaseLibrary.sendKeysToWebElement(brokerfee, text);
        //    BaseLibrary.SetWaitTime(100);
    }

    public void Occfee(String text) throws Exception {
        BaseLibrary.setFocusToElement(occfee);
        BaseLibrary.clearText(occfee);
        BaseLibrary.sendKeysToWebElement(occfee, text);
        //    BaseLibrary.SetWaitTime(100);
    }

    public void OtherFee(String text) throws Exception {
        BaseLibrary.setFocusToElement(otherfee);
        BaseLibrary.clearText(otherfee);
        BaseLibrary.sendKeysToWebElement(otherfee, text);
        //    BaseLibrary.SetWaitTime(100);
    }

    public void TefraFee(String text) throws Exception {
        BaseLibrary.setFocusToElement(tefra);
        BaseLibrary.clearText(tefra);
        BaseLibrary.sendKeysToWebElement(tefra, text);
        //    BaseLibrary.SetWaitTime(100);
    }

    public void AddFee() throws Exception {
        BaseLibrary.setFocusToElement(addfee);
        BaseLibrary.clearText(addfee);
        BaseLibrary.waitAndClickElementsUsingByLocator(addfee);
        //    BaseLibrary.SetWaitTime(100);

    }

    public void FeeCode(String text) throws Exception {
        BaseLibrary.setFocusToElement(feecode);
        BaseLibrary.clearText(feecode);
        BaseLibrary.clickOnTextFromDropdownList_two(feecode, text);
        //    BaseLibrary.SetWaitTime(100);
    }

    public void FeeAmount(String text) throws Exception {
        BaseLibrary.setFocusToElement(feeamount);
        BaseLibrary.clearText(feeamount);
        BaseLibrary.sendKeysToWebElement(feeamount, text);
        //    BaseLibrary.SetWaitTime(100);
    }

    public void AppliedTo(String text) throws Exception {
        BaseLibrary.setFocusToElement(appliedto);
        BaseLibrary.clearText(appliedto);
        BaseLibrary.clickOnTextFromDropdownList_two(appliedto, text);
        BaseLibrary.setFocusToElement(addfee);
        BaseLibrary.waitAndClickElementsUsingByLocator(addfee);
        //    BaseLibrary.SetWaitTime(100);
    }

    public void TradeSave() throws Exception {
        ;
        BaseLibrary.setFocusToElement(button_Save);
        BaseLibrary.waitAndClickElementsUsingByLocator(button_Save);
        //   BaseLibrary.SetWaitTime(100000);
    }

    public void verifyValidationMessage(String sVerify) throws Exception {

        BaseLibrary.verifyText(By.xpath("//*[contains(text(),'Trade Entry  has been created successfully!')]"), sVerify);
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
    public void EditTrade(String textToSent) throws Exception {

        BaseLibrary.waitAndClickElementsUsingByLocator(EditTrade);
        BaseLibrary.clickOnTextFromDropdownList(editdetails,textToSent);
    }
    public void CancelTrade(String textToSent) throws Exception {

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
}