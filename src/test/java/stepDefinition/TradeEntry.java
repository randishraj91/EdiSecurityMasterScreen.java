package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.LoginScreen;
import pageObjects.TradeEntryScreen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TradeEntry {
    LoginScreen loginScreen = new LoginScreen();
    TradeEntryScreen TradeScreen = new TradeEntryScreen();
    WebDriver driver;


    @Given("user navigate to Trade Entry screen")
    public void user_navigate_to_trade_entry_screen() throws Exception {
        LoginScreen.openApplication();
        TradeScreen.clickSystemMaster();
    }

    public static Properties readPropertiesFile(String fileName) throws IOException {
        FileInputStream fis = null;
        Properties prop = null;
        try {
            fis = new FileInputStream(fileName);
            prop = new Properties();
            prop.load(fis);
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            fis.close();
        }
        return prop;
    }

    @Given("user enters the Trade Entry details with All fields")
    public void user_enters_the_trade_entry_details_with_all_fields() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/TradeEntry.properties");
        String pcompany = prop.getProperty("PCompany");
        String ppartner = prop.getProperty("PPartner");
        String poffice = prop.getProperty("POffice");
        String psuboff = prop.getProperty("PSubOffice");
        String paccountnumber = prop.getProperty("PAccountNumber");
        String contrabroker = prop.getProperty("ContraBroker");
        String ccompany = prop.getProperty("CCompany");
        String cpartner = prop.getProperty("CPartner");
        String coffice = prop.getProperty("COffice");
        String csuboff = prop.getProperty("CSubOffice");
        String caccountnumber = prop.getProperty("CAccountNumber");

        String entrytype = prop.getProperty("EntryType");
        String trantype = prop.getProperty("TranType");
        String symbol = prop.getProperty("Symbol");
        String tradecurrency = prop.getProperty("TradeCurrency");
        String quan = prop.getProperty("Quantity");
        String price = prop.getProperty("Price");

        String tradedate = prop.getProperty("TradeDate");
        String execution = prop.getProperty("Execution");
        String blotter = prop.getProperty("Blotter");
        String capacity = prop.getProperty("Capacity");
        String settcurrency = prop.getProperty("SettlementCurrency");
        String country = prop.getProperty("Country");

        String location = prop.getProperty("Location");
        String tag7E = prop.getProperty("Tag70E");
        String tradetag = prop.getProperty("TradeTag");
        String desc = prop.getProperty("Description");
        String rrcode = prop.getProperty("RRCode");
        String group = prop.getProperty("Group");

        String ordid = prop.getProperty("Ordid");
        String trailer = prop.getProperty("TrailerCode");
        String memo1 = prop.getProperty("Memo1");
        String memo2 = prop.getProperty("Memo2");
        String comm = prop.getProperty("Comm");
        String commtype = prop.getProperty("CommType");

        String regfee = prop.getProperty("RegFee");
        String ecnfee = prop.getProperty("ECNFee");
        String excfee = prop.getProperty("ExchangeFee");
        String clefee = prop.getProperty("ClearingFee");
        String brofee = prop.getProperty("BrokerFee");
        String occfee = prop.getProperty("OCCFee");

        String otherfee = prop.getProperty("OtherFee");
        String tefra = prop.getProperty("TefraFee");
        String feecode = prop.getProperty("FeeCode");
        String feeamount = prop.getProperty("FeeAmount");
        String applied = prop.getProperty("AppliedTo");

        TradeScreen.primarycompany(pcompany);
        TradeScreen.primarypartner(ppartner);
        TradeScreen.primaryoffice(poffice);
        TradeScreen.primarysuboffice(psuboff);
        TradeScreen.primaryAccountnumber(paccountnumber);
        TradeScreen.contraBrokerCode(contrabroker);
        TradeScreen.contracompany(ccompany);
        TradeScreen.contrapartner(cpartner);
        TradeScreen.contraoffice(coffice);
        TradeScreen.contrasuboffice(csuboff);
        TradeScreen.contraAccountnumber(caccountnumber);
        TradeScreen.EntryType(entrytype);
        TradeScreen.TransactionType(trantype);
        TradeScreen.Symbol(symbol);
        TradeScreen.TradeCurrency(tradecurrency);
        TradeScreen.Quantity(quan);
        TradeScreen.Price(price);
        TradeScreen.TradeDate(tradedate);
        TradeScreen.Execution(execution);
        TradeScreen.Blotter(blotter);
        TradeScreen.Capacity(capacity);
        TradeScreen.SettlementCurrency(settcurrency);
        TradeScreen.Country(country);
        TradeScreen.Location(location);
        TradeScreen.Tag70E(tag7E);
        TradeScreen.TradeTag(tradetag);
        TradeScreen.Description(desc);
        TradeScreen.RRcode(rrcode);
        TradeScreen.Group(group);
        TradeScreen.Ordid(ordid);
        TradeScreen.Trailercodes(trailer);
        TradeScreen.Memo1(memo1);
        TradeScreen.Memo2(memo2);
        TradeScreen.Commission(comm);
        TradeScreen.CommissionType(commtype);
        TradeScreen.RegFee(regfee);
        TradeScreen.ECNFee(ecnfee);
        TradeScreen.ExchangeFee(excfee);
        TradeScreen.ClearingFee(clefee);
        TradeScreen.BrokerFee(brofee);
        TradeScreen.Occfee(occfee);
        TradeScreen.OtherFee(otherfee);
        TradeScreen.TefraFee(tefra);
        TradeScreen.AddFee();
        TradeScreen.FeeCode(feecode);
        TradeScreen.FeeAmount(feeamount);
        TradeScreen.AppliedTo(applied);
    }

    @When("Click on Trade Save button")
    public void click_on_trade_save_button() throws Exception {
        TradeScreen.TradeSave();
    }


    @Then("validation message should be displayed on Trade screen")
    public void validation_message_should_be_displayed_on_trade_screen() throws Exception {
        TradeScreen.verifyValidationMessage("Trade Entry has been created successfully!");
    }

    @Given("user enters the Trade Entry details with mandatory fields")
    public void user_enters_the_trade_entry_details_with_mandatory_fields() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/TradeEntry.properties");
        String pcompany = prop.getProperty("PCompany");
        String ppartner = prop.getProperty("PPartner");
        String poffice = prop.getProperty("POffice");
        String paccountnumber = prop.getProperty("PAccountNumber");
        String contrabroker = prop.getProperty("ContraBroker");
        String ccompany = prop.getProperty("CCompany");
        String cpartner = prop.getProperty("CPartner");
        String coffice = prop.getProperty("COffice");
        String caccountnumber = prop.getProperty("CAccountNumber");
        String entrytype = prop.getProperty("EntryType");
        String trantype = prop.getProperty("TranType");
        String symbol = prop.getProperty("Symbol");
        String tradecurrency = prop.getProperty("TradeCurrency");
        String quan = prop.getProperty("Quantity");
        String price = prop.getProperty("Price");
        String tradedate = prop.getProperty("TradeDate");

        TradeScreen.primarycompany(pcompany);
        TradeScreen.primarypartner(ppartner);
        TradeScreen.primaryoffice(poffice);
        TradeScreen.primaryAccountnumber(paccountnumber);
        TradeScreen.contraBrokerCode(contrabroker);
        TradeScreen.contracompany(ccompany);
        TradeScreen.contrapartner(cpartner);
        TradeScreen.contraoffice(coffice);
        TradeScreen.contraAccountnumber(caccountnumber);
        TradeScreen.EntryType(entrytype);
        TradeScreen.TransactionType(trantype);
        TradeScreen.Symbol(symbol);
        TradeScreen.TradeCurrency(tradecurrency);
        TradeScreen.Quantity(quan);
        TradeScreen.Price(price);
        TradeScreen.TradeDate(tradedate);

    }

    @Given("Search the Transaction and click on the Transaction no")
    public void search_the_transaction_and_click_on_the_transaction_no() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/TradeEntry.properties");
        String tranno = prop.getProperty("TransNo");

        TradeScreen.SearchTransaction(tranno);

    }

    @When("Update the Trade Entry All fields")
    public void update_the_trade_entry_all_fields() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/TradeEntry.properties");
        String pcompany = prop.getProperty("PCompany1");
        String ppartner = prop.getProperty("PPartner1");
        String poffice = prop.getProperty("POffice1");
        String psuboff = prop.getProperty("PSubOffice1");
        String paccountnumber = prop.getProperty("PAccountNumber1");
        String contrabroker = prop.getProperty("ContraBroker1");
        String ccompany = prop.getProperty("CCompany1");
        String cpartner = prop.getProperty("CPartner1");
        String coffice = prop.getProperty("COffice1");
        String csuboff = prop.getProperty("CSubOffice1");
        String caccountnumber = prop.getProperty("CAccountNumber1");
        String entrytype = prop.getProperty("EntryType1");
        String trantype = prop.getProperty("TranType1");
        String symbol = prop.getProperty("Symbol1");
        String tradecurrency = prop.getProperty("TradeCurrency1");
        String quan = prop.getProperty("Quantity1");
        String price = prop.getProperty("Price1");
        String tradedate = prop.getProperty("TradeDate1");
        String execution = prop.getProperty("Execution1");
        String blotter = prop.getProperty("Blotter1");
        String capacity = prop.getProperty("Capacity1");
        String settcurrency = prop.getProperty("SettlementCurrency1");
        String country = prop.getProperty("Country1");
        String location = prop.getProperty("Location1");
        String tag7E = prop.getProperty("Tag70E1");
        String tradetag = prop.getProperty("TradeTag1");
        String desc = prop.getProperty("Description1");
        String rrcode = prop.getProperty("RRCode1");
        String group = prop.getProperty("Group1");
        String ordid = prop.getProperty("Ordid1");
        String trailer = prop.getProperty("TrailerCode1");
        String memo1 = prop.getProperty("Memo11");
        String memo2 = prop.getProperty("Memo21");
        String comm = prop.getProperty("Comm1");
        String commtype = prop.getProperty("CommType1");
        String regfee = prop.getProperty("RegFee1");
        String ecnfee = prop.getProperty("ECNFee1");
        String excfee = prop.getProperty("ExchangeFee1");
        String clefee = prop.getProperty("ClearingFee1");
        String brofee = prop.getProperty("BrokerFee1");
        String occfee = prop.getProperty("OCCFee1");
        String otherfee = prop.getProperty("OtherFee1");
        String tefra = prop.getProperty("TefraFee1");
        String feecode = prop.getProperty("FeeCode1");
        String feeamount = prop.getProperty("FeeAmount1");
        String applied = prop.getProperty("AppliedTo1");
        String editreason = prop.getProperty("EditReason");

        TradeScreen.EditTrade(editreason);

        TradeScreen.primarycompany(pcompany);
        TradeScreen.primarypartner(ppartner);
        TradeScreen.primaryoffice(poffice);
        TradeScreen.primarysuboffice(psuboff);
        TradeScreen.primaryAccountnumber(paccountnumber);
        TradeScreen.contraBrokerCode(contrabroker);
        TradeScreen.contracompany(ccompany);
        TradeScreen.contrapartner(cpartner);
        TradeScreen.contraoffice(coffice);
        TradeScreen.contrasuboffice(csuboff);
        TradeScreen.contraAccountnumber(caccountnumber);
        TradeScreen.EntryType(entrytype);
        TradeScreen.TransactionType(trantype);
        TradeScreen.Symbol(symbol);
        TradeScreen.TradeCurrency(tradecurrency);
        TradeScreen.Quantity(quan);
        TradeScreen.Price(price);
        TradeScreen.TradeDate(tradedate);
        TradeScreen.Execution(execution);
        TradeScreen.Blotter(blotter);
        TradeScreen.Capacity(capacity);
        TradeScreen.SettlementCurrency(settcurrency);
        TradeScreen.Country(country);
        TradeScreen.Location(location);
        TradeScreen.Tag70E(tag7E);
        TradeScreen.TradeTag(tradetag);
        TradeScreen.Description(desc);
        TradeScreen.RRcode(rrcode);
        TradeScreen.Group(group);
        TradeScreen.Ordid(ordid);
        TradeScreen.Trailercodes(trailer);
        TradeScreen.Memo1(memo1);
        TradeScreen.Memo2(memo2);
        TradeScreen.Commission(comm);
        TradeScreen.CommissionType(commtype);
        TradeScreen.RegFee(regfee);
        TradeScreen.ECNFee(ecnfee);
        TradeScreen.ExchangeFee(excfee);
        TradeScreen.ClearingFee(clefee);
        TradeScreen.BrokerFee(brofee);
        TradeScreen.Occfee(occfee);
        TradeScreen.OtherFee(otherfee);
        TradeScreen.TefraFee(tefra);
        TradeScreen.AddFee();
        TradeScreen.FeeCode(feecode);
        TradeScreen.FeeAmount(feeamount);
        TradeScreen.AppliedTo(applied);

    }

    @When("Update the Trade Entry mandatory fields")
    public void update_the_trade_entry_mandatory_fields() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/TradeEntry.properties");
        String pcompany = prop.getProperty("PCompany1");
        String ppartner = prop.getProperty("PPartner1");
        String poffice = prop.getProperty("POffice1");
        String paccountnumber = prop.getProperty("PAccountNumber1");
        String contrabroker = prop.getProperty("ContraBroker1");
        String ccompany = prop.getProperty("CCompany1");
        String cpartner = prop.getProperty("CPartner1");
        String coffice = prop.getProperty("COffice1");
        String caccountnumber = prop.getProperty("CAccountNumber1");
        String entrytype = prop.getProperty("EntryType1");
        String trantype = prop.getProperty("TranType1");
        String symbol = prop.getProperty("Symbol1");
        String tradecurrency = prop.getProperty("TradeCurrency1");
        String quan = prop.getProperty("Quantity1");
        String price = prop.getProperty("Price1");
        String tradedate = prop.getProperty("TradeDate1");
        String editreason = prop.getProperty("EditReason");

        TradeScreen.EditTrade(editreason);
        TradeScreen.primarycompany(pcompany);
        TradeScreen.primarypartner(ppartner);
        TradeScreen.primaryoffice(poffice);
        TradeScreen.primaryAccountnumber(paccountnumber);
        TradeScreen.contraBrokerCode(contrabroker);
        TradeScreen.contracompany(ccompany);
        TradeScreen.contrapartner(cpartner);
        TradeScreen.contraoffice(coffice);
        TradeScreen.contraAccountnumber(caccountnumber);
        TradeScreen.EntryType(entrytype);
        TradeScreen.TransactionType(trantype);
        TradeScreen.Symbol(symbol);
        TradeScreen.TradeCurrency(tradecurrency);
        TradeScreen.Quantity(quan);
        TradeScreen.Price(price);
        TradeScreen.TradeDate(tradedate);
    }

    @Then("{string} edit validation message should be displayed on Trade Entry screen")
    public void edit_validation_message_should_be_displayed_on_trade_entry_screen(String string) throws Exception {
        TradeScreen.verifyValidationMessageWithText("has been Updated successfully!");
    }

    @When("Click ok Cancel Trade button and select the reason to cancel")
    public void click_ok_cancel_trade_button_and_select_the_reason_to_cancel() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/TradeEntry.properties");

        String cancelreason = prop.getProperty("CancelReason");
        TradeScreen.CancelTrade(cancelreason);
    }


    @Then("{string} cancel validation message should be displayed on Trade Entry screen")
    public void cancel_validation_message_should_be_displayed_on_trade_entry_screen(String string) throws Exception {
        TradeScreen.verifyCancelValidationMessageWithText("has been Cancelled successfully!");
    }

    @Given("Create Trade Entry With Fractional Quantity and Price")
    public void create_trade_entry_with_fractional_quantity_and_price() throws Exception {

            Properties prop = readPropertiesFile(
                    System.getProperty("user.dir") + "/src/test/resources/properties/TradeEntry.properties");
            String pcompany = prop.getProperty("PCompany");
            String ppartner = prop.getProperty("PPartner");
            String poffice = prop.getProperty("POffice");
            String paccountnumber = prop.getProperty("PAccountNumber");
            String contrabroker = prop.getProperty("ContraBroker");
            String ccompany = prop.getProperty("CCompany");
            String cpartner = prop.getProperty("CPartner");
            String coffice = prop.getProperty("COffice");
            String caccountnumber = prop.getProperty("CAccountNumber");
            String entrytype = prop.getProperty("EntryType");
            String trantype = prop.getProperty("TranType");
            String symbol = prop.getProperty("Symbol");
            String tradecurrency = prop.getProperty("TradeCurrency");
            String quan = prop.getProperty("Quantity2");
            String price = prop.getProperty("Price2");
            String tradedate = prop.getProperty("TradeDate");

            TradeScreen.primarycompany(pcompany);
            TradeScreen.primarypartner(ppartner);
            TradeScreen.primaryoffice(poffice);
            TradeScreen.primaryAccountnumber(paccountnumber);
            TradeScreen.contraBrokerCode(contrabroker);
            TradeScreen.contracompany(ccompany);
            TradeScreen.contrapartner(cpartner);
            TradeScreen.contraoffice(coffice);
            TradeScreen.contraAccountnumber(caccountnumber);
            TradeScreen.EntryType(entrytype);
            TradeScreen.TransactionType(trantype);
            TradeScreen.Symbol(symbol);
            TradeScreen.TradeCurrency(tradecurrency);
            TradeScreen.Quantity(quan);
            TradeScreen.Price(price);
            TradeScreen.TradeDate(tradedate);

        }
    @Given("user enters the Trade Entry details with all transaction type")
    public void user_enters_the_trade_entry_details_with_all_transaction_type() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/TradeEntry.properties");
        String pcompany = prop.getProperty("PCompany");
        String ppartner = prop.getProperty("PPartner");
        String poffice = prop.getProperty("POffice");
        String paccountnumber = prop.getProperty("PAccountNumber");
        String contrabroker = prop.getProperty("ContraBroker");
        String ccompany = prop.getProperty("CCompany");
        String cpartner = prop.getProperty("CPartner");
        String coffice = prop.getProperty("COffice");
        String caccountnumber = prop.getProperty("CAccountNumber");
        String entrytype = prop.getProperty("EntryType");
        String trantype = prop.getProperty("TranType");
        String symbol = prop.getProperty("Symbol");
        String tradecurrency = prop.getProperty("TradeCurrency");
        String quan = prop.getProperty("Quantity2");
        String price = prop.getProperty("Price2");
        String tradedate = prop.getProperty("TradeDate");

        TradeScreen.primarycompany(pcompany);
        TradeScreen.primarypartner(ppartner);
        TradeScreen.primaryoffice(poffice);
        TradeScreen.primaryAccountnumber(paccountnumber);
        TradeScreen.contraBrokerCode(contrabroker);
        TradeScreen.contracompany(ccompany);
        TradeScreen.contrapartner(cpartner);
        TradeScreen.contraoffice(coffice);
        TradeScreen.contraAccountnumber(caccountnumber);
        TradeScreen.EntryType(entrytype);
        TradeScreen.RandomTransactionType();
        TradeScreen.Symbol(symbol);
        TradeScreen.TradeCurrency(tradecurrency);
        TradeScreen.Quantity(quan);
        TradeScreen.Price(price);
        TradeScreen.TradeDate(tradedate);

    }
    @Given("user enters the Trade Entry details with all Entry types")
    public void user_enters_the_trade_entry_details_with_all_entry_types() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/TradeEntry.properties");
        String pcompany = prop.getProperty("PCompany");
        String ppartner = prop.getProperty("PPartner");
        String poffice = prop.getProperty("POffice");
        String paccountnumber = prop.getProperty("PAccountNumber");
        String contrabroker = prop.getProperty("ContraBroker");
        String ccompany = prop.getProperty("CCompany");
        String cpartner = prop.getProperty("CPartner");
        String coffice = prop.getProperty("COffice");
        String caccountnumber = prop.getProperty("CAccountNumber");
        String entrytype = prop.getProperty("EntryType");
        String trantype = prop.getProperty("TranType");
        String symbol = prop.getProperty("Symbol");
        String tradecurrency = prop.getProperty("TradeCurrency");
        String quan = prop.getProperty("Quantity2");
        String price = prop.getProperty("Price2");
        String tradedate = prop.getProperty("TradeDate");

        TradeScreen.primarycompany(pcompany);
        TradeScreen.primarypartner(ppartner);
        TradeScreen.primaryoffice(poffice);
        TradeScreen.primaryAccountnumber(paccountnumber);
        TradeScreen.contraBrokerCode(contrabroker);
        TradeScreen.contracompany(ccompany);
        TradeScreen.contrapartner(cpartner);
        TradeScreen.contraoffice(coffice);
        TradeScreen.contraAccountnumber(caccountnumber);
        TradeScreen.RandomEntryType();
        TradeScreen.RandomTransactionType();
        TradeScreen.Symbol(symbol);
        TradeScreen.TradeCurrency(tradecurrency);
        TradeScreen.Quantity(quan);
        TradeScreen.Price(price);
        TradeScreen.TradeDate(tradedate);
    }
}