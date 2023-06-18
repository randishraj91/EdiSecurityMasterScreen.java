package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Currenyrate;
import pageObjects.LoginScreen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CurrencyRate {

    LoginScreen login =new LoginScreen();
    Currenyrate currencyrate =new Currenyrate();

    @Given("user navigate to CurrencyRate screen")
    public void user_navigate_to_currency_rate_screen() throws Exception {
        LoginScreen.openApplication();
        currencyrate.clickSystemMaster();
        currencyrate.loadTestData();

    }

    @Given("click on Add New Currency Rate button")
    public void click_on_add_new_currency_rate_button() throws Exception {
        currencyrate.addNewCurrencyrate();
    }

    @When("Enters all the Currency Rate fields")
    public void enters_all_the_currency_rate_fields() throws Exception {
        /*
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Currencyrate.properties");
        String currency = prop.getProperty("Currency");
        String rate = prop.getProperty("Rate2");
        String against = prop.getProperty("CurrencyAgainst");
        String description = prop.getProperty("Description");
        String ratedate = prop.getProperty("RateDate");

         */
        currencyrate.currency("Dyn_Rate");
        currencyrate.Rate("Dyn_Rate");
        currencyrate.CurrencyAgainst("DAI");
        currencyrate.Description("Created for automation script");
        currencyrate.RateDate("Random_Date");

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


    @When("Enter the Currency Rate details with mandatory fields")
    public void enter_the_currency_rate_details_with_mandatory_fields() throws Exception {
     /*
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Currencyrate.properties");
        String currency = prop.getProperty("Currency1");
        String rate = prop.getProperty("Rate1");
        String against = prop.getProperty("CurrencyAgainst1");
        String description = prop.getProperty("Description1");
        String ratedate = prop.getProperty("CurrencyRate");
        currencyrate.currency(currency);
        currencyrate.Rate(rate);
        currencyrate.Description(description);
        currencyrate.RateDate(ratedate);

      */

        currencyrate.currency("Dyn_Rate");
        currencyrate.Rate("Dyn_Rate");
        currencyrate.CurrencyAgainst("DAI");
        currencyrate.Description("Created for automation script");
        currencyrate.RateDate("Random_Date");

    }

    @Then("click the Currency Rate save button")
    public void click_the_currency_rate_save_button() throws Exception {
        currencyrate.clickSave();

          }

    @Given("Enter Currency and click on Search Icon")
    public void enter_currency_and_click_on_search_icon() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Currencyrate.properties");
        String currency = prop.getProperty("Currency");
        currencyrate.enterCurrencyInSearchBox(currency);

    }
    @Given("click on the Currency rate filter  button")
    public void click_on_the_currency_rate_filter_button() throws Exception {
        currencyrate.CurrencyFilter();
    }


    @When("Enter the Currency and rate")
    public void enter_the_currency_and_rate() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Currencyrate.properties");
        String currency = prop.getProperty("Currency");
        String rate = prop.getProperty("CurrencyRate");
        currencyrate.filtercurrency(currency);
        currencyrate.filterrate(rate);
         }


    @When("Enter the Currency")
    public void enter_the_currency() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Currencyrate.properties");
        String currency = prop.getProperty("Currency");
        currencyrate.filtercurrency(currency);

    }

    @When("Enter the rate")
    public void enter_the_rate() throws Exception {
        Properties prop = readPropertiesFile(

                System.getProperty("user.dir") + "/src/test/resources/properties/Currencyrate.properties");

        String rate = prop.getProperty("CurrencyRate");
        currencyrate.filterrate(rate);

        }
    @When("Enter the description")
    public void enter_the_description() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Currencyrate.properties");
        String desc = prop.getProperty("Description");
        currencyrate.filterdescription(desc);

    }
    @When("Select the Currency Against")
    public void select_the_currency_against() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Currencyrate.properties");
        String against = prop.getProperty("CurrencyAgainst");
        currencyrate.filtercurrencyagainst(against);
    }
    @When("Enter the Rate date")
    public void enter_the_rate_date() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Currencyrate.properties");
        String date = prop.getProperty("RateDate");
        currencyrate.FilterRateDate(date);

         }

    @Then("Click on Currency Filter Search Button")
    public void click_on_currency_filter_search_button() throws Exception {
        currencyrate.FilterSearch();
          }
    @Given("Click the Existing Currency Rate Rule")
    public void click_the_existing_currency_rate_rule() throws Exception {
        currencyrate.CurrencyEditClick();
          }

    @When("Change the Currency and Rate")
    public void change_the_currency_and_rate() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Currencyrate.properties");
        String currency = prop.getProperty("Currency1");
        currencyrate.currency(currency);
        String rate = prop.getProperty("CurrencyRate");
        currencyrate.Rate(rate);
    }
    @Then("validation message should be displayed on Currency Rate screen")
    public void validation_message_should_be_displayed_on_currency_rate_screen() throws Exception {
        currencyrate.verifyValidationMessage();
    }
    @When("user enter  {string}  in Currency search box")
    public void user_enter_in_currency_search_box(String string) throws Exception {
        currencyrate.enterCurrencyInSearchBox(string);
    }

    @When("user should able to view {string} in Currency list screen")
    public void user_should_able_to_view_in_currency_list_screen(String string) throws Exception {
        currencyrate.verifyNoDataDisplayed(string);
    }


    @Given("Verify Search Result is displayed")
    public void verify_search_result_is_displayed() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Currencyrate.properties");
        String currency = prop.getProperty("Currency");
        currencyrate.verifyCurrency(currency);

    }


    @Then("Verify Currency and Rate are displayed")
    public void verify_currency_and_rate_are_displayed() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Currencyrate.properties");
        String currency = prop.getProperty("Currency1");
        currencyrate.verifyCurrency(currency);
        String rate = prop.getProperty("CurrencyRate");
        currencyrate.verifyRate(rate);
    }


    @Then("Verify Currency is displayed")
    public void verify_currency_is_displayed() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Currencyrate.properties");
        String currency = prop.getProperty("Currency");
        currencyrate.verifyCurrency(currency);

    }

    @Then("Verify Rate is displayed")
    public void verify_rate_is_displayed() throws Exception {
        Properties prop = readPropertiesFile(

                System.getProperty("user.dir") + "/src/test/resources/properties/Currencyrate.properties");

        String rate = prop.getProperty("CurrencyRate");
        currencyrate.verifyRate(rate);
    }


    @Then("Verify description is displayed")
    public void verify_description_is_displayed() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Currencyrate.properties");
        String desc = prop.getProperty("Description");
        currencyrate.verifyDescription(desc);
    }

    @Then("Verify Currency Against is displayed")
    public void verify_currency_against_is_displayed() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Currencyrate.properties");
        String against = prop.getProperty("CurrencyAgainst");
        currencyrate.verifyCurrencyAgainst(against);
    }

    @Then("Verify Rate date is displayed")
    public void verify_rate_date_is_displayed() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/Currencyrate.properties");
        String date = prop.getProperty("RateDate");
        currencyrate.verifyRateDate(date);

    }
    @Then("{string} edit validation message should be displayed on Currency screen")
    public void edit_validation_message_should_be_displayed_on_currency_screen(String string) throws Exception {
        currencyrate.verifyValidationMessaeWithText("has been saved successfully!");
    }

    @Given("click on the Export Button check whether the Currency rate List is downloaded")
    public void click_on_the_export_button_check_whether_the_currency_rate_list_is_downloaded() throws Exception {
        currencyrate.Export();
    }


}
