package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.LoginScreen;
import pageObjects.TransactionListScreen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TransactionList {
    LoginScreen loginScreen = new LoginScreen();
    TransactionListScreen TransactionScreen = new TransactionListScreen();
    WebDriver driver;


    @Given("user navigate to Transaction screen")
    public void user_navigate_to_transaction_screen() throws Exception {
        LoginScreen.openApplication();
        TransactionScreen.clickSystemMaster();
    }


    @Given("user enters the Keyword in Searchbox")
    public void user_enters_the_keyword_in_searchbox() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
        String tranno = prop.getProperty("TransNo");

        TransactionScreen.SearchTransaction(tranno);

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


        @Then("Verify the Search Result")
    public void verify_the_search_result() throws Exception {
            Properties prop = readPropertiesFile(
                    System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
            String tranno = prop.getProperty("TransNo");
            TransactionScreen.verifySearchList(tranno);
    }
    @Given("click on the Transaction filter by button")
    public void click_on_the_transaction_filter_by_button() throws Exception {
        TransactionScreen.Filter();
    }


    @When("Select  the Currency and Symbol")
    public void select_the_currency_and_symbol() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
        String currency = prop.getProperty("Currency");
        String symbol = prop.getProperty("Symbol");
        TransactionScreen.FilterCurrency(currency);
        TransactionScreen.FilterSymbol(symbol);

    }
    @Then("Check whether Currency and Symbol are displayed in the List Screen")
    public void check_whether_currency_and_symbol_are_displayed_in_the_list_screen() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
        String currency = prop.getProperty("Currency");
        String symbol = prop.getProperty("Symbol");

        TransactionScreen.verifycurrency(currency);
        TransactionScreen.verifysymbol(symbol);
    }

    @When("enter the Batch Number")
    public void enter_the_batch_number() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
        String batch = prop.getProperty("BatchNumber");
        TransactionScreen.FilterBatchNumber(batch);
    }

    @When("Check whether Batch Number is displayed in the List Screen")
    public void check_whether_batch_number_is_displayed_in_the_list_screen() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
        String batch = prop.getProperty("BatchNumber");
        TransactionScreen.verifyBatchnumber(batch);
       }

    @When("Select the Correspondent")
    public void select_the_correspondent() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
        String corr = prop.getProperty("Correspondent");
        TransactionScreen.FilterCorrespondent(corr);
    }

    @When("Check whether Correspondent is displayed in the List Screen")
    public void check_whether_correspondent_is_displayed_in_the_list_screen() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
        String corr = prop.getProperty("Correspondent");
        TransactionScreen.verifyCorrespondent(corr);
    }

    @When("Select the Office")
    public void select_the_office() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
        String office = prop.getProperty("Office");
        TransactionScreen.FilterOffice(office);
    }

    @When("Check whether Office is displayed in the List Screen")
    public void check_whether_office_is_displayed_in_the_list_screen() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
        String office = prop.getProperty("Office");
        TransactionScreen.verifyOffice(office);
    }


    @When("Select the Account Number")
    public void select_the_account_number() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
        String accountnumber = prop.getProperty("AccountNumber");
        TransactionScreen.FilterAccountNumber(accountnumber);
    }


    @When("Check whether Account Number is displayed in the List Screen")
    public void check_whether_account_number_is_displayed_in_the_list_screen() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
        String accountnumber = prop.getProperty("AccountNumber");
        TransactionScreen.verifyAccountNumber(accountnumber);
    }

    @When("Select the Account Name")
    public void select_the_account_name() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
        String accountname = prop.getProperty("AccountName");
        TransactionScreen.FilterAccountName(accountname);
    }


    @When("Check whether Account Name is displayed in the List Screen")
    public void check_whether_account_name_is_displayed_in_the_list_screen() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
        String accountname = prop.getProperty("AccountName");
        TransactionScreen.verifyAccountName(accountname);
    }
    @When("Select the Account Type")
    public void select_the_account_type() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
        String accounttype = prop.getProperty("AccountType");
        TransactionScreen.FilterAccountType(accounttype);
    }

    @Then("Check whether Account Type is displayed in the List Screen")
    public void check_whether_account_type_is_displayed_in_the_list_screen() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
        String accounttype = prop.getProperty("AccountType");
        TransactionScreen.verifyAccountType(accounttype);

    }

    @When("Select the Transaction Type")
    public void select_the_transaction_type() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
        String trantype = prop.getProperty("TransType");
        TransactionScreen.FilterTransactionType(trantype);

    }

    @Then("Check whether Transaction Type is displayed in the List Screen")
    public void check_whether_transaction_type_is_displayed_in_the_list_screen() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
        String trantype = prop.getProperty("TransType");
        TransactionScreen.verifyTransactionType(trantype);

    }

    @When("Select the Trade Date")
    public void select_the_trade_date() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
        String tradedate = prop.getProperty("TradeDate");
        TransactionScreen.FilterTradeDate(tradedate);

    }

    @Then("Check whether Trade Date is displayed in the List Screen")
    public void check_whether_trade_date_is_displayed_in_the_list_screen() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
        String tradedate = prop.getProperty("TradeDate");
        TransactionScreen.verifyTradeDate(tradedate);

    }


    @When("Select the Settlement Date")
    public void select_the_settlement_date() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
        String settdate = prop.getProperty("SettlementDate");
        TransactionScreen.FilterSettlementDate(settdate);
    }

    @Then("Check whether Settlement Date is displayed in the List Screen")
    public void check_whether_settlement_date_is_displayed_in_the_list_screen() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
        String settdate = prop.getProperty("SettlementDate");
        TransactionScreen.verifySettlementDate(settdate);
    }

    @When("Select the Entry Date")
    public void select_the_entry_date() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
        String entrydate = prop.getProperty("EntryDate");
        TransactionScreen.FilterEntryDate(entrydate);

    }

    @Then("Check whether Entry Date is displayed in the List Screen")
    public void check_whether_entry_date_is_displayed_in_the_list_screen() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
        String entrydate = prop.getProperty("EntryDateD");
        TransactionScreen.verifyEntrydate(entrydate);

    }

    @When("Select the Currency")
    public void select_the_currency() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
        String curr = prop.getProperty("Currency");
        TransactionScreen.FilterCurrency(curr);

    }

    @Then("Check whether Currency is displayed in the List Screen")
    public void check_whether_currency_is_displayed_in_the_list_screen() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
        String curr = prop.getProperty("Currency");
        TransactionScreen.verifycurrency(curr);

    }

    @When("Enter the price")
    public void enter_the_price() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
        String price = prop.getProperty("Price");
        TransactionScreen.FilterPrice(price);

    }

    @Then("Check whether Price is displayed in the List Screen")
    public void check_whether_price_is_displayed_in_the_list_screen() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
        String price = prop.getProperty("Price");
        TransactionScreen.verifyPrice(price);

    }

    @When("Enter the Gross Amount")
    public void enter_the_gross_amount() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
        String gross = prop.getProperty("GrossAmount");
        TransactionScreen.FilterGrossAmount(gross);

    }

    @Then("Check whether Gross Amount is displayed in the List Screen")
    public void check_whether_gross_amount_is_displayed_in_the_list_screen() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
        String gross = prop.getProperty("GrossAmount");
        TransactionScreen.verifyGrossAmount(gross);

    }

    @When("Enter the Net Amount")
    public void enter_the_net_amount() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
        String net = prop.getProperty("NetAmount");
        TransactionScreen.FilterNetAmount(net);

    }

    @Then("Check whether Net Amount is displayed in the List Screen")
    public void check_whether_net_amount_is_displayed_in_the_list_screen() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
        String net = prop.getProperty("NetAmount");
        TransactionScreen.verifyNetAmount(net);

    }
    @When("Select the Entry Type")
    public void select_the_entry_type() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
        String entrytype = prop.getProperty("EntryType");
        TransactionScreen.FilterEntryType(entrytype);

    }

    @Then("Check whether Entry Type is displayed in the List Screen")
    public void check_whether_entry_type_is_displayed_in_the_list_screen() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
        String entrytype = prop.getProperty("EntryType");
        TransactionScreen.verifyEntrytype(entrytype);

    }

    @When("Select the Transaction Number")
    public void select_the_transaction_number() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
        String tranno = prop.getProperty("TransNo");
        TransactionScreen.FilterTransactionNumber(tranno);

    }

    @Then("Check whether Transaction Number is displayed in the List Screen")
    public void check_whether_transaction_number_is_displayed_in_the_list_screen() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Transaction.properties");
        String tranno = prop.getProperty("TransNo");
        TransactionScreen.verifyTransactionNumber(tranno);

    }
}
