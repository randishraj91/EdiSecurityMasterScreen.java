package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.CashJournalScreen;
import pageObjects.LoginScreen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CashJournal {
    LoginScreen loginScreen = new LoginScreen();
    CashJournalScreen cashjournal = new CashJournalScreen();
    WebDriver driver;



    @Given("user navigate to Cash Journal screen")
    public void user_navigate_to_cash_journal_screen() throws Exception {
        LoginScreen.openApplication();
        cashjournal.clickSystemMaster();
    }

    @Given("Create a new Cash Journal entry with All fields")
    public void create_a_new_cash_journal_entry_with_all_fields() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/CashJournal.properties");
        String pcompany = prop.getProperty("PCompany");
        String ppartner = prop.getProperty("PPartner");
        String poffice = prop.getProperty("POffice");
        String psuboff = prop.getProperty("PSubOffice");
        String paccountnumber = prop.getProperty("PAccountNumber");
        String amount = prop.getProperty("Amount");
        String ccompany = prop.getProperty("CCompany");
        String cpartner = prop.getProperty("CPartner");
        String coffice = prop.getProperty("COffice");
        String csuboff = prop.getProperty("CSubOffice");
        String caccountnumber = prop.getProperty("CAccountNumber");

        String entrytype = prop.getProperty("EntryType");
        String currency = prop.getProperty("Currency");
        String source = prop.getProperty("Source");
        String batchno = prop.getProperty("BatchNumber");
        String tradedate = prop.getProperty("TradeDate");

        cashjournal.primarycompany(pcompany);
        cashjournal.primarypartner(ppartner);
        cashjournal.primaryoffice(poffice);
        cashjournal.primarysuboffice(psuboff);
        cashjournal.primaryAccountnumber(paccountnumber);
        cashjournal.amount(amount);
        cashjournal.contracompany(ccompany);
        cashjournal.contrapartner(cpartner);
        cashjournal.contraoffice(coffice);
        cashjournal.contrasuboffice(csuboff);
        cashjournal.contraAccountnumber(caccountnumber);
        cashjournal.EntryType(entrytype);

        cashjournal.Currency(currency);
        cashjournal.Source(source);
        cashjournal.BatchNumber(batchno);
        cashjournal.TradeDate(tradedate);
        cashjournal.AddEntry();
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
    @When("Click on Cash Journal Save button")
    public void click_on_cash_journal_save_button() throws Exception {
        cashjournal.CashSave();
    }
    @Then("validation message should be displayed on Cash Journal screen")
    public void validation_message_should_be_displayed_on_cash_journal_screen() throws Exception {
        cashjournal.verifyValidationMessage("Cash Journal has been created successfully!");
    }
    @Given("Create a new Cash Journal entry with mandatory fields")
    public void create_a_new_cash_journal_entry_with_mandatory_fields() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/CashJournal.properties");
        String pcompany = prop.getProperty("PCompany");
        String ppartner = prop.getProperty("PPartner");
        String poffice = prop.getProperty("POffice");
        String psuboff = prop.getProperty("PSubOffice");
        String paccountnumber = prop.getProperty("PAccountNumber");
        String amount = prop.getProperty("Amount");
        String ccompany = prop.getProperty("CCompany");
        String cpartner = prop.getProperty("CPartner");
        String coffice = prop.getProperty("COffice");
        String csuboff = prop.getProperty("CSubOffice");
        String caccountnumber = prop.getProperty("CAccountNumber");

        String entrytype = prop.getProperty("EntryType");
        String currency = prop.getProperty("Currency");
        String tradedate = prop.getProperty("TradeDate");

        cashjournal.primarycompany(pcompany);
        cashjournal.primarypartner(ppartner);
        cashjournal.primaryoffice(poffice);
        cashjournal.primarysuboffice(psuboff);
        cashjournal.primaryAccountnumber(paccountnumber);
        cashjournal.amount(amount);
        cashjournal.contracompany(ccompany);
        cashjournal.contrapartner(cpartner);
        cashjournal.contraoffice(coffice);
        cashjournal.contrasuboffice(csuboff);
        cashjournal.contraAccountnumber(caccountnumber);
        cashjournal.EntryType(entrytype);
        cashjournal.Currency(currency);
        cashjournal.TradeDate(tradedate);
        cashjournal.AddEntry();
    }


    @Given("Search the Cash Transaction and click on the Transaction no")
    public void search_the_cash_transaction_and_click_on_the_transaction_no() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/CashJournal.properties");
        String tranno = prop.getProperty("TransNo");
        cashjournal.SearchTransaction(tranno);
    }


    @When("Update the Cash Journal with mandatory fields")
    public void update_the_cash_journal_with_mandatory_fields() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/CashJournal.properties");
        String pcompany = prop.getProperty("PCompany");
        String ppartner = prop.getProperty("PPartner");
        String poffice = prop.getProperty("POffice");
        String psuboff = prop.getProperty("PSubOffice");
        String paccountnumber = prop.getProperty("PAccountNumber");
        String amount = prop.getProperty("Amount");
        String ccompany = prop.getProperty("CCompany");
        String cpartner = prop.getProperty("CPartner");
        String coffice = prop.getProperty("COffice");
        String csuboff = prop.getProperty("CSubOffice");
        String caccountnumber = prop.getProperty("CAccountNumber");

        String entrytype = prop.getProperty("EntryType");
        String currency = prop.getProperty("Currency");
        String tradedate = prop.getProperty("TradeDate");
        String edit = prop.getProperty("EditReason");


        cashjournal.EditCashJournal(edit);
        cashjournal.primarycompany(pcompany);
        cashjournal.primarypartner(ppartner);
        cashjournal.primaryoffice(poffice);
        cashjournal.primarysuboffice(psuboff);
        cashjournal.primaryAccountnumber(paccountnumber);
        cashjournal.amount(amount);
        cashjournal.contracompany(ccompany);
        cashjournal.contrapartner(cpartner);
        cashjournal.contraoffice(coffice);
        cashjournal.contrasuboffice(csuboff);
        cashjournal.contraAccountnumber(caccountnumber);
        cashjournal.EntryType(entrytype);
        cashjournal.Currency(currency);
        cashjournal.TradeDate(tradedate);

    }
    @Then("{string} edit validation message should be displayed on Cash Journal screen")
    public void edit_validation_message_should_be_displayed_on_cash_journal_screen(String string) throws Exception {
        cashjournal.verifyValidationMessageWithText("has been Updated successfully!");
    }

    @When("Update the Cash Journal with All fields")
    public void update_the_cash_journal_with_all_fields() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/CashJournal.properties");
        String pcompany = prop.getProperty("PCompany");
        String ppartner = prop.getProperty("PPartner");
        String poffice = prop.getProperty("POffice");
        String psuboff = prop.getProperty("PSubOffice");
        String paccountnumber = prop.getProperty("PAccountNumber");
        String amount = prop.getProperty("Amount");
        String ccompany = prop.getProperty("CCompany");
        String cpartner = prop.getProperty("CPartner");
        String coffice = prop.getProperty("COffice");
        String csuboff = prop.getProperty("CSubOffice");
        String caccountnumber = prop.getProperty("CAccountNumber");

        String entrytype = prop.getProperty("EntryType");
        String currency = prop.getProperty("Currency");
        String source = prop.getProperty("Source");
        String batchno = prop.getProperty("BatchNumber");
        String tradedate = prop.getProperty("TradeDate");
        String edit = prop.getProperty("EditReason");


        cashjournal.EditCashJournal(edit);
        cashjournal.primarycompany(pcompany);
        cashjournal.primarypartner(ppartner);
        cashjournal.primaryoffice(poffice);
        cashjournal.primarysuboffice(psuboff);
        cashjournal.primaryAccountnumber(paccountnumber);
        cashjournal.amount(amount);
        cashjournal.contracompany(ccompany);
        cashjournal.contrapartner(cpartner);
        cashjournal.contraoffice(coffice);
        cashjournal.contrasuboffice(csuboff);
        cashjournal.contraAccountnumber(caccountnumber);
        cashjournal.EntryType(entrytype);

        cashjournal.Currency(currency);
        cashjournal.Source(source);
        cashjournal.BatchNumber(batchno);
        cashjournal.TradeDate(tradedate);

    }

    @When("Click on Cash Journal Clear button")
    public void click_on_cash_journal_clear_button() throws Exception {
        cashjournal.Clear();
    }
    @When("Click ok Cash Journal Cancel Trade button and select the reason to cancel")
    public void click_ok_cash_journal_cancel_trade_button_and_select_the_reason_to_cancel() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/CashJournal.properties");

        String cancelreason = prop.getProperty("CancelReason");
        cashjournal.CancelCashJournal(cancelreason);
    }


    @Then("{string} cancel validation message should be displayed on Cash Journal screen")
    public void cancel_validation_message_should_be_displayed_on_cash_journal_screen(String string) throws Exception {
        cashjournal.verifyCancelValidationMessageWithText("has been Cancelled successfully!");
    }
    @Given("Create a new Cash Journal entry with multiple Cash entries")
    public void create_a_new_cash_journal_entry_with_multiple_cash_entries() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/CashJournal.properties");
        String pcompany = prop.getProperty("PCompany");
        String ppartner = prop.getProperty("PPartner");
        String poffice = prop.getProperty("POffice");
        String psuboff = prop.getProperty("PSubOffice");
        String paccountnumber = prop.getProperty("PAccountNumber");
        String amount = prop.getProperty("Amount");
        String ccompany = prop.getProperty("CCompany");
        String cpartner = prop.getProperty("CPartner");
        String coffice = prop.getProperty("COffice");
        String csuboff = prop.getProperty("CSubOffice");
        String caccountnumber = prop.getProperty("CAccountNumber");

        String entrytype = prop.getProperty("EntryType");
        String currency = prop.getProperty("Currency");
        String tradedate = prop.getProperty("TradeDate");

        cashjournal.primarycompany(pcompany);
        cashjournal.primarypartner(ppartner);
        cashjournal.primaryoffice(poffice);
        cashjournal.primarysuboffice(psuboff);
        cashjournal.primaryAccountnumber(paccountnumber);
        cashjournal.amount(amount);
        cashjournal.contracompany(ccompany);
        cashjournal.contrapartner(cpartner);
        cashjournal.contraoffice(coffice);
        cashjournal.contrasuboffice(csuboff);
        cashjournal.contraAccountnumber(caccountnumber);
        cashjournal.EntryType(entrytype);
        cashjournal.Currency(currency);
        cashjournal.TradeDate(tradedate);
        cashjournal.AddEntry();
        cashjournal.primarycompany(pcompany);
        cashjournal.primarypartner(ppartner);
        cashjournal.primaryoffice(poffice);
        cashjournal.primarysuboffice(psuboff);
        cashjournal.primaryAccountnumber(paccountnumber);
        cashjournal.amount(amount);
        cashjournal.contracompany(ccompany);
        cashjournal.contrapartner(cpartner);
        cashjournal.contraoffice(coffice);
        cashjournal.contrasuboffice(csuboff);
        cashjournal.contraAccountnumber(caccountnumber);
        cashjournal.EntryType(entrytype);
        cashjournal.Currency(currency);
        cashjournal.TradeDate(tradedate);
        cashjournal.AddEntry();

    }
    @Given("Create A New Cash Journal Entry With Fractional Amount")
    public void create_a_new_cash_journal_entry_with_fractional_amount() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/CashJournal.properties");
        String pcompany = prop.getProperty("PCompany");
        String ppartner = prop.getProperty("PPartner");
        String poffice = prop.getProperty("POffice");
        String psuboff = prop.getProperty("PSubOffice");
        String paccountnumber = prop.getProperty("PAccountNumber");
        String amount = prop.getProperty("Amount2");
        String ccompany = prop.getProperty("CCompany");
        String cpartner = prop.getProperty("CPartner");
        String coffice = prop.getProperty("COffice");
        String csuboff = prop.getProperty("CSubOffice");
        String caccountnumber = prop.getProperty("CAccountNumber");

        String entrytype = prop.getProperty("EntryType");
        String currency = prop.getProperty("Currency");
        String tradedate = prop.getProperty("TradeDate");

        cashjournal.primarycompany(pcompany);
        cashjournal.primarypartner(ppartner);
        cashjournal.primaryoffice(poffice);
        cashjournal.primarysuboffice(psuboff);
        cashjournal.primaryAccountnumber(paccountnumber);
        cashjournal.amount(amount);
        cashjournal.contracompany(ccompany);
        cashjournal.contrapartner(cpartner);
        cashjournal.contraoffice(coffice);
        cashjournal.contrasuboffice(csuboff);
        cashjournal.contraAccountnumber(caccountnumber);
        cashjournal.EntryType(entrytype);
        cashjournal.Currency(currency);
        cashjournal.TradeDate(tradedate);
        cashjournal.AddEntry();

    }
}
