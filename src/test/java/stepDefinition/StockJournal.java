package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.LoginScreen;
import pageObjects.StockJournalScreen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class StockJournal {

    LoginScreen loginScreen = new LoginScreen();
    StockJournalScreen stockjournal = new StockJournalScreen();
    WebDriver driver;

    @Given("user navigate to stock Journal screen")
    public void user_navigate_to_stock_journal_screen() throws Exception {
        LoginScreen.openApplication();
        stockjournal.clickSystemMaster();
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
    @Given("Create a new Stock Journal entry with All fields")
    public void create_a_new_stock_journal_entry_with_all_fields() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/StockJournal.properties");
        String pcompany = prop.getProperty("PCompany");
        String ppartner = prop.getProperty("PPartner");
        String poffice = prop.getProperty("POffice");
        String psuboff = prop.getProperty("PSubOffice");
        String paccountnumber = prop.getProperty("PAccountNumber");
        String ccompany = prop.getProperty("CCompany");
        String cpartner = prop.getProperty("CPartner");
        String coffice = prop.getProperty("COffice");
        String csuboff = prop.getProperty("CSubOffice");
        String caccountnumber = prop.getProperty("CAccountNumber");

        String symbol = prop.getProperty("Symbol");
        String quantity = prop.getProperty("Quantity");
        String cost = prop.getProperty("CostBasis");
        String description = prop.getProperty("Description");

        String entrytype = prop.getProperty("EntryType");
        String currency = prop.getProperty("Currency");
        String source = prop.getProperty("Source");
        String tradedate = prop.getProperty("TradeDate");

        stockjournal.primarycompany(pcompany);
        stockjournal.primarypartner(ppartner);
        stockjournal.primaryoffice(poffice);
        stockjournal.primarysuboffice(psuboff);
        stockjournal.primaryAccountnumber(paccountnumber);
        stockjournal.contracompany(ccompany);
        stockjournal.contrapartner(cpartner);
        stockjournal.contraoffice(coffice);
        stockjournal.contrasuboffice(csuboff);
        stockjournal.contraAccountnumber(caccountnumber);

        stockjournal.Symbol(symbol);
        stockjournal.Quantity(quantity);
        stockjournal.CostBasis(cost);
        stockjournal.Description(description);

        stockjournal.EntryType(entrytype);
        stockjournal.Currency(currency);
        stockjournal.Source(source);
        stockjournal.TradeDate(tradedate);
        stockjournal.AddEntry();
    }
    @When("Click on Stock Journal Save button")
    public void click_on_stock_journal_save_button() throws Exception {
        stockjournal.StockSave();
    }
    @Then("validation message should be displayed on Stock Journal screen")
    public void validation_message_should_be_displayed_on_stock_journal_screen() throws Exception {
        stockjournal.verifyValidationMessage("Stock Journal has been created successfully!");
    }
    @Given("Create a new Stock Journal entry with mandatory fields")
    public void create_a_new_stock_journal_entry_with_mandatory_fields() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/StockJournal.properties");
        String pcompany = prop.getProperty("PCompany");
        String ppartner = prop.getProperty("PPartner");
        String poffice = prop.getProperty("POffice");
        String psuboff = prop.getProperty("PSubOffice");
        String paccountnumber = prop.getProperty("PAccountNumber");
        String ccompany = prop.getProperty("CCompany");
        String cpartner = prop.getProperty("CPartner");
        String coffice = prop.getProperty("COffice");
        String csuboff = prop.getProperty("CSubOffice");
        String caccountnumber = prop.getProperty("CAccountNumber");

        String symbol = prop.getProperty("Symbol");
        String quantity = prop.getProperty("Quantity");
        String cost = prop.getProperty("CostBasis");
        String description = prop.getProperty("Description");

        String entrytype = prop.getProperty("EntryType");
        String currency = prop.getProperty("Currency");
        String tradedate = prop.getProperty("TradeDate");

        stockjournal.primarycompany(pcompany);
        stockjournal.primarypartner(ppartner);
        stockjournal.primaryoffice(poffice);
        stockjournal.primarysuboffice(psuboff);
        stockjournal.primaryAccountnumber(paccountnumber);
        stockjournal.contracompany(ccompany);
        stockjournal.contrapartner(cpartner);
        stockjournal.contraoffice(coffice);
        stockjournal.contrasuboffice(csuboff);
        stockjournal.contraAccountnumber(caccountnumber);

        stockjournal.Symbol(symbol);
        stockjournal.Quantity(quantity);
        stockjournal.CostBasis(cost);
        stockjournal.Description(description);

        stockjournal.EntryType(entrytype);
        stockjournal.Currency(currency);
        stockjournal.TradeDate(tradedate);
        stockjournal.AddEntry();
    }
    @Given("Create A New Stock Journal Entry With Fractional Quantity and Cost Basis")
    public void create_a_new_stock_journal_entry_with_fractional_quantity_and_cost_basis() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/StockJournal.properties");
        String pcompany = prop.getProperty("PCompany");
        String ppartner = prop.getProperty("PPartner");
        String poffice = prop.getProperty("POffice");
        String psuboff = prop.getProperty("PSubOffice");
        String paccountnumber = prop.getProperty("PAccountNumber");
        String ccompany = prop.getProperty("CCompany");
        String cpartner = prop.getProperty("CPartner");
        String coffice = prop.getProperty("COffice");
        String csuboff = prop.getProperty("CSubOffice");
        String caccountnumber = prop.getProperty("CAccountNumber");

        String symbol = prop.getProperty("Symbol");
        String quantity = prop.getProperty("Quantity2");
        String cost = prop.getProperty("CostBasis2");
        String description = prop.getProperty("Description");

        String entrytype = prop.getProperty("EntryType");
        String currency = prop.getProperty("Currency");
        String tradedate = prop.getProperty("TradeDate");

        stockjournal.primarycompany(pcompany);
        stockjournal.primarypartner(ppartner);
        stockjournal.primaryoffice(poffice);
        stockjournal.primarysuboffice(psuboff);
        stockjournal.primaryAccountnumber(paccountnumber);
        stockjournal.contracompany(ccompany);
        stockjournal.contrapartner(cpartner);
        stockjournal.contraoffice(coffice);
        stockjournal.contrasuboffice(csuboff);
        stockjournal.contraAccountnumber(caccountnumber);

        stockjournal.Symbol(symbol);
        stockjournal.Quantity(quantity);
        stockjournal.CostBasis(cost);
        stockjournal.Description(description);

        stockjournal.EntryType(entrytype);
        stockjournal.Currency(currency);
        stockjournal.TradeDate(tradedate);
        stockjournal.AddEntry();
    }
    @Given("Search the Stock Transaction and click on the Transaction no")
    public void search_the_stock_transaction_and_click_on_the_transaction_no() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/StockJournal.properties");
        String tranno = prop.getProperty("TransNo");
        stockjournal.SearchTransaction(tranno);
    }

    @When("Update the Stock Journal with mandatory fields")
    public void update_the_stock_journal_with_mandatory_fields() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/StockJournal.properties");
        String pcompany = prop.getProperty("PCompany1");
        String ppartner = prop.getProperty("PPartner1");
        String poffice = prop.getProperty("POffice1");
        String psuboff = prop.getProperty("PSubOffice1");
        String paccountnumber = prop.getProperty("PAccountNumber1");
        String ccompany = prop.getProperty("CCompany1");
        String cpartner = prop.getProperty("CPartner1");
        String coffice = prop.getProperty("COffice1");
        String csuboff = prop.getProperty("CSubOffice1");
        String caccountnumber = prop.getProperty("CAccountNumber1");

        String symbol = prop.getProperty("Symbol1");
        String quantity = prop.getProperty("Quantity1");
        String cost = prop.getProperty("CostBasis1");
        String description = prop.getProperty("Description1");

        String entrytype = prop.getProperty("EntryType");
        String currency = prop.getProperty("Currency1");
        String tradedate = prop.getProperty("TradeDate1");
        String edit = prop.getProperty("EditReason");


        stockjournal.EditStockJournal(edit);
        stockjournal.primarycompany(pcompany);
        stockjournal.primarypartner(ppartner);
        stockjournal.primaryoffice(poffice);
        stockjournal.primarysuboffice(psuboff);
        stockjournal.primaryAccountnumber(paccountnumber);
        stockjournal.contracompany(ccompany);
        stockjournal.contrapartner(cpartner);
        stockjournal.contraoffice(coffice);
        stockjournal.contrasuboffice(csuboff);
        stockjournal.contraAccountnumber(caccountnumber);

        stockjournal.Symbol(symbol);
        stockjournal.Quantity(quantity);
        stockjournal.CostBasis(cost);
        stockjournal.Description(description);

        stockjournal.EntryType(entrytype);
        stockjournal.Currency(currency);
        stockjournal.TradeDate(tradedate);
    }
    @Then("{string} edit validation message should be displayed on Stock Journal screen")
    public void edit_validation_message_should_be_displayed_on_stock_journal_screen(String string) throws Exception {
        stockjournal.verifyValidationMessageWithText("has been saved successfully!");
    }
    @When("Update the Stock Journal with All fields")
    public void update_the_stock_journal_with_all_fields() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/StockJournal.properties");
        String pcompany = prop.getProperty("PCompany1");
        String ppartner = prop.getProperty("PPartner1");
        String poffice = prop.getProperty("POffice1");
        String psuboff = prop.getProperty("PSubOffice1");
        String paccountnumber = prop.getProperty("PAccountNumber1");
        String ccompany = prop.getProperty("CCompany1");
        String cpartner = prop.getProperty("CPartner1");
        String coffice = prop.getProperty("COffice1");
        String csuboff = prop.getProperty("CSubOffice1");
        String caccountnumber = prop.getProperty("CAccountNumber1");

        String symbol = prop.getProperty("Symbol1");
        String quantity = prop.getProperty("Quantity1");
        String cost = prop.getProperty("CostBasis1");
        String description = prop.getProperty("Description1");

        String entrytype = prop.getProperty("EntryType");
        String currency = prop.getProperty("Currency1");
        String source = prop.getProperty("Source1");
        String tradedate = prop.getProperty("TradeDate1");
        String edit = prop.getProperty("EditReason");


        stockjournal.EditStockJournal(edit);
        stockjournal.primarycompany(pcompany);
        stockjournal.primarypartner(ppartner);
        stockjournal.primaryoffice(poffice);
        stockjournal.primarysuboffice(psuboff);
        stockjournal.primaryAccountnumber(paccountnumber);
        stockjournal.contracompany(ccompany);
        stockjournal.contrapartner(cpartner);
        stockjournal.contraoffice(coffice);
        stockjournal.contrasuboffice(csuboff);
        stockjournal.contraAccountnumber(caccountnumber);

        stockjournal.Symbol(symbol);
        stockjournal.Quantity(quantity);
        stockjournal.CostBasis(cost);
        stockjournal.Description(description);

        stockjournal.EntryType(entrytype);
        stockjournal.Currency(currency);
        stockjournal.Source(source);
        stockjournal.TradeDate(tradedate);

    }
    @When("Click on Stock Journal Clear button")
    public void click_on_stock_journal_clear_button() throws Exception {
        stockjournal.Clear();
    }
    @When("Click ok Stock Journal Cancel Trade button and select the reason to cancel")
    public void click_ok_stock_journal_cancel_trade_button_and_select_the_reason_to_cancel() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/StockJournal.properties");

        String cancelreason = prop.getProperty("CancelReason");
        stockjournal.CancelStockJournal(cancelreason);
    }

    @Then("{string} cancel validation message should be displayed on Stock Journal screen")
    public void cancel_validation_message_should_be_displayed_on_stock_journal_screen(String string) throws Exception {
        stockjournal.verifyCancelValidationMessageWithText("has been Cancelled successfully!");
    }
    @Given("Create a new Stock Journal entry with multiple stock entries")
    public void create_a_new_stock_journal_entry_with_multiple_stock_entries() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/StockJournal.properties");
        String pcompany = prop.getProperty("PCompany");
        String ppartner = prop.getProperty("PPartner");
        String poffice = prop.getProperty("POffice");
        String psuboff = prop.getProperty("PSubOffice");
        String paccountnumber = prop.getProperty("PAccountNumber");
        String ccompany = prop.getProperty("CCompany");
        String cpartner = prop.getProperty("CPartner");
        String coffice = prop.getProperty("COffice");
        String csuboff = prop.getProperty("CSubOffice");
        String caccountnumber = prop.getProperty("CAccountNumber");

        String symbol = prop.getProperty("Symbol");
        String quantity = prop.getProperty("Quantity");
        String cost = prop.getProperty("CostBasis");
        String description = prop.getProperty("Description");

        String entrytype = prop.getProperty("EntryType");
        String currency = prop.getProperty("Currency");
        String tradedate = prop.getProperty("TradeDate");

        stockjournal.primarycompany(pcompany);
        stockjournal.primarypartner(ppartner);
        stockjournal.primaryoffice(poffice);
        stockjournal.primarysuboffice(psuboff);
        stockjournal.primaryAccountnumber(paccountnumber);
        stockjournal.contracompany(ccompany);
        stockjournal.contrapartner(cpartner);
        stockjournal.contraoffice(coffice);
        stockjournal.contrasuboffice(csuboff);
        stockjournal.contraAccountnumber(caccountnumber);

        stockjournal.Symbol(symbol);
        stockjournal.Quantity(quantity);
        stockjournal.CostBasis(cost);
        stockjournal.Description(description);

        stockjournal.EntryType(entrytype);
        stockjournal.Currency(currency);
        stockjournal.TradeDate(tradedate);
        stockjournal.AddEntry();
        stockjournal.primarycompany(pcompany);
        stockjournal.primarypartner(ppartner);
        stockjournal.primaryoffice(poffice);
        stockjournal.primarysuboffice(psuboff);
        stockjournal.primaryAccountnumber(paccountnumber);
        stockjournal.contracompany(ccompany);
        stockjournal.contrapartner(cpartner);
        stockjournal.contraoffice(coffice);
        stockjournal.contrasuboffice(csuboff);
        stockjournal.contraAccountnumber(caccountnumber);

        stockjournal.Symbol(symbol);
        stockjournal.Quantity(quantity);
        stockjournal.CostBasis(cost);
        stockjournal.Description(description);

        stockjournal.EntryType(entrytype);
        stockjournal.Currency(currency);
        stockjournal.TradeDate(tradedate);
        stockjournal.AddEntry();
    }

}
