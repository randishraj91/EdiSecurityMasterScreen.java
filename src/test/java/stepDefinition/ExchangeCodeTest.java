package stepDefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ExchangeCodeScreen;
import pageObjects.LoginScreen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ExchangeCodeTest {
    LoginScreen loginScreen = new LoginScreen();
    Properties prop;
    ExchangeCodeScreen exgScreen = new ExchangeCodeScreen();

    @Given("user navigate to Exchange code screen")
    public void user_navigate_to_exchange_code_screen() throws Exception {
        LoginScreen.openApplication();
        exgScreen.clickSystemMaster();
        exgScreen.loadTestData();
    }

    @Given("^click on Add New Exchange button$")
    public void click_on_Add_New_Exchange_button() throws Throwable {
        exgScreen.addNewExecutive();
    }

    @When("^Enters all the fields$")
    public void enters_all_the_fields() throws Throwable {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/exchangecode.properties");
        String code = prop.getProperty("ExchangeCode");
        String name = prop.getProperty("ExchangeName");
        String miccode = prop.getProperty("MicCode");
        String edicode = prop.getProperty("EdiCode");
        String dtccode = prop.getProperty("DtcMarketCode");
        String occ = prop.getProperty("OccAcronym");
        String idsi = prop.getProperty("Idsi");
        String bluesheet = prop.getProperty("BlueSheet");
        exgScreen.exchangecode("Random_Code");
        exgScreen.exchangename("Random_ExchangeName");
        exgScreen.miccode("Random_ExchangeMIC");
        exgScreen.edicode("Random_ExchangeEDI");
        exgScreen.dtcmarket("Random_ExchangeDTC");
        exgScreen.occacronym("Random_ExchangeOCC");
        exgScreen.idsi("Random_ExchangeIDSI");
        exgScreen.BlueSheet("Random_ExchangeBS");

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


    @Then("^click the Exchange save button$")
    public void click_the_Exchange_save_button() throws Throwable {
        exgScreen.clickSave();
    }

    @When("Enters mandatory fields for Exchange code and click no")
    public void enters_mandatory_fields_for_exchange_code_no() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/exchangecode.properties");

        String code = prop.getProperty("ExchangeCode1");
        String name = prop.getProperty("ExchangeName1");
        exgScreen.exchangecode("11");
        exgScreen.exchangename("22");

    }

    @When("Enters mandatory fields for Exchange code")
    public void enters_mandatory_fields_for_exchange_code() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/exchangecode.properties");

        String code = prop.getProperty("ExchangeCode1");
        String name = prop.getProperty("ExchangeName1");
        exgScreen.exchangecode("Random_Code");
        exgScreen.exchangename("Random_ExchangeName");

    }

    @Given("Enter Exchange code and click on Search Icon")
    public void enter_exchange_code_and_click_on_search_icon() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/exchangecode.properties");
        String idsi = prop.getProperty("Idsi");

        exgScreen.enterInSearchBox("Random_IDSI");
    }

    @Given("click on the Exchange Code filter  button")
    public void click_on_the_exchange_code_filter_button() throws Exception {
        exgScreen.ExchangeFilter();
    }



    @When("Enter the DTC and Idsi")
    public void enter_the_dtc_and_idsi() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/exchangecode.properties");
        String dtc = prop.getProperty("DtcMarketCode");
        String idsi = prop.getProperty("Idsi");
        exgScreen.filterdtcmarket(dtc);
        exgScreen.filteridsi(idsi);

    }
    @When("Enter the  Idsi")
    public void enter_the_idsi() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/exchangecode.properties");
        String idsi = prop.getProperty("Idsi");
        exgScreen.filteridsi(idsi);
    }
    @When("Enter the  Dtc Market")
    public void enter_the_dtc_market() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/exchangecode.properties");
        String dtc = prop.getProperty("DtcMarketCode");
        exgScreen.filterdtcmarket(dtc);

    }

    @When("Enter the  Occ Acronym")
    public void enter_the_occ_acronym() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/exchangecode.properties");
        String occ = prop.getProperty("OccAcronym");
        exgScreen.filterocc(occ);

    }


    @When("Enter the  Bluesheet")
    public void enter_the_bluesheet() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/exchangecode.properties");
        String blue = prop.getProperty("BlueSheet");
        exgScreen.filterbluesheet(blue);
            }

    @When("Enter the Exchange Name")
    public void enter_the_exchange_name() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/exchangecode.properties");
        String name = prop.getProperty("ExchangeName");
        exgScreen.filtername(name);

       }

    @When("Enter the Mic Code")
    public void enter_the_mic_code() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/exchangecode.properties");
        String mic = prop.getProperty("MicCode");
        exgScreen.filtermic(mic);

    }
/*
    @When("Enter the Edi Code")
    public void enter_the_edi_code() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/exchangecode.properties");
        String edi = prop.getProperty("EdiCode");
        exgScreen.filteredi(edi);


    }*/

    @When("Click on Exchange Filter Search Button")
    public void click_on_exchange_filter_search_button() throws Exception {
        exgScreen.FilterSearch();
    }
    @When("Click on Exchange Filter Reset Button")
    public void click_on_exchange_filter_reset_button() throws Exception {
        exgScreen.FilterReset();
    }
    @Then("click the Exchange Cancel Yes button")
    public void click_the_exchange_cancel_yes_button() throws Exception {
        exgScreen.clickCancelYes();
    }
    @Then("click the Exchange Cancel No button")
    public void click_the_exchange_cancel_no_button() throws Exception {
        exgScreen.clickCancelNo();
    }
    @Given("Click the Existing Exchange Code")
    public void click_the_existing_exchange_code() throws Exception {
        exgScreen.ExchangeEdit();
    }


    @When("Change the Exchange code,Mic code and Idsi")
    public void change_the_exchange_code_mic_code_and_idsi() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/exchangecode.properties");
        String code = prop.getProperty("ExchangeCode2");
        String miccode = prop.getProperty("MicCode");
        String idsi = prop.getProperty("Idsi");

        exgScreen.dtcmarket("Random_ExchangeDTC");
        exgScreen.occacronym("Random_ExchangeOCC");
        exgScreen.idsi("Random_ExchangeIDSI");
    }

    @Then("Verify the Exchange Code search result")
    public void verify_the_exchange_code_search_result() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/exchangecode.properties");
        String idsi = prop.getProperty("Idsi");

        exgScreen.verifyIdsi(idsi);

    }


    @When("Verify Idsi and Dtc are displayed")
    public void verify_idsi_and_dtc_are_displayed() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/exchangecode.properties");

        String dtc = prop.getProperty("DtcMarketCode");
        String idsi = prop.getProperty("Idsi");

        exgScreen.verifyDtc(dtc);
        exgScreen.verifyIdsi(idsi);
    }


    @When("Verify Idsi is displayed")
    public void verify_idsi_is_displayed() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/exchangecode.properties");

        String idsi = prop.getProperty("Idsi");

        exgScreen.verifyIdsi(idsi);
    }

    @When("Verify Dtc Market is displayed")
    public void verify_dtc_market_is_displayed() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/exchangecode.properties");
        String dtc = prop.getProperty("DtcMarketCode");
        exgScreen.verifyDtc(dtc);

    }

    @When("Verify Occ Acronym is displayed")
    public void verify_occ_acronym_is_displayed() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/exchangecode.properties");
        String occ = prop.getProperty("OccAcronym");
        exgScreen.verifyOcc(occ);

    }


    @When("Verify BlueSheet is displayed")
    public void verify_blue_sheet_is_displayed() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/exchangecode.properties");
        String blue = prop.getProperty("BlueSheet");
        exgScreen.verifyBluesheet(blue);

    }

    @When("Verify Exchange Name is displayed")
    public void verify_exchange_name_is_displayed() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/exchangecode.properties");
        String name = prop.getProperty("ExchangeName");
        exgScreen.verifyExchangename(name);

    }

    @When("Verify Mic Code is displayed")
    public void verify_mic_code_is_displayed() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/exchangecode.properties");

        String miccode = prop.getProperty("MicCode");
        exgScreen.verifyMiccode(miccode);

    }
    @Then("validation message should be displayed on Exchange Code screen")
    public void validation_message_should_be_displayed_on_exchange_code_screen() throws Exception {
        exgScreen.verifyValidationMessage();
    }

    @When("user enter  {string}  in Exchange search box")
    public void user_enter_in_exchange_search_box(String string) throws Exception {
        exgScreen.enterInSearchBoxforNoData(string);
    }

    @When("user should able to view {string} in Exchange list screen")
    public void user_should_able_to_view_in_exchange_list_screen(String string) throws Exception {
        exgScreen.verifyNoDataDisplayed(string);
    }
    @Then("{string} edit validation message should be displayed on Exchange screen")
    public void edit_validation_message_should_be_displayed_on_exchange_screen(String string) throws Exception {
        exgScreen.verifyValidationMessaeWithText("has been saved successfully!");
    }
    @Given("click on the Export Button check whether the Exchange Code List is downloaded")
    public void click_on_the_export_button_check_whether_the_exchange_code_list_is_downloaded() throws Exception {
        exgScreen.Export();
    }
}