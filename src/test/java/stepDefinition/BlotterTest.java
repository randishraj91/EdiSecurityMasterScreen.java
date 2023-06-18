package stepDefinition;

import baseMethods.BaseLibrary;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BlotterScreen;
import pageObjects.LoginScreen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class BlotterTest {
    BlotterScreen BlotterScreen = new BlotterScreen();
    LoginScreen LoginScreen = new LoginScreen();
    public List<List<String>> data = null;
    @Given("user enters the following details with all fields on blotter screen")
    public void user_enters_the_following_details_with_all_fields_on_blotter_screen(DataTable dataTable) throws Exception {
        data = dataTable.asLists(String.class);
        BlotterScreen.enterBlotterNumber(data.get(0).get(1));
        BlotterScreen.enterBlotterName(data.get(1).get(1));
        BlotterScreen.selectContraAccount(data.get(2).get(1));
        BlotterScreen.selectBlotterExchangeCode(data.get(3).get(1));
        BlotterScreen.selectBlotteClearingType(data.get(4).get(1));
        BlotterScreen.selectBlotterMethod(data.get(5).get(1));
        BlotterScreen.selectProcessingInd (data.get(6).get(1));
        BlotterScreen.selectCompareCode(data.get(7).get(1));
        BlotterScreen.selectCompareFile(data.get(8).get(1));
        BlotterScreen.enterSettlementCode(data.get(9).get(1));
        BlotterScreen.enterSettlementCustodianAccountNumber(data.get(10).get(1));
        BlotterScreen.enterBankAccountNumber(data.get(11).get(1));
        BlotterScreen.selectSettlementCurrency(data.get(12).get(1));
        data =null;
    }


    @Given("click on add new blotter button")
    public void click_on_add_new_blotter_button() throws Exception {
        BlotterScreen.clickAddBlotter();
    }

    @Given("user enters the following details with only mandatory fields on blotter screen")
    public void user_enters_the_following_details_with_only_mandatory_fields_on_blotter_screen(io.cucumber.datatable.DataTable dataTable) throws Exception {
        data = dataTable.asLists(String.class);
        BlotterScreen.enterBlotterNumber(data.get(0).get(1));
        BlotterScreen.enterBlotterName(data.get(1).get(1));
        BlotterScreen.selectBlotterExchangeCode(data.get(2).get(1));
        BlotterScreen.selectBlotteClearingType(data.get(3).get(1));
        BlotterScreen.selectBlotterMethod(data.get(4).get(1));
        data = null;
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

    @Then("user click on the blotter name")
    public void user_click_on_the_blotter_name() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/blotter.properties");

        String blotterName =  prop.getProperty("Blotter_Name");
        BaseLibrary.waitAndClickElementUsingDynamic(blotterName);
        BaseLibrary.SetWaitTime(3);
    }

    @Then("user enters the following  updated details with all fields on blotter screen")
    public void user_enters_the_following_updated_details_with_all_fields_on_blotter_screen(io.cucumber.datatable.DataTable dataTable) throws Exception {
        data = dataTable.asLists(String.class);
        BlotterScreen.enterBlotterNumber(data.get(0).get(1));
        BlotterScreen.enterBlotterName(data.get(1).get(1));
        data = null;
    }

    @Then("user clicks save button on blotter screen")
    public void user_clicks_save_button_on_blotter_screen() throws Exception {
        BlotterScreen.clickSaveBlotter();
    }

    @Then("{string} validation message should be displayed on blotter screen")
    public void validation_message_should_be_displayed_on_blotter_screen(String string) throws Exception {
        BlotterScreen.verifyValidationMessageOnBlotterScreen();
    }

    @Then("verify blotter has been update table list")
    public void verify_blotter_has_been_update_table_list() {

    }


    @Then("Validate message on blotter screen")
    public void Validate_message_on_blotter_screen() throws Exception {
        BlotterScreen.verifyValidationMessaeWithText("has been saved successfully!");
    }

    @When("user enter blotter name  in search box")
    public void user_enter_blotter_name_in_search_box() throws Exception {
        BaseLibrary.SetWaitTime(1000);
        BlotterScreen.enterofficeNameInSearchBox();
    }

    @Then("user click on the blotter name and details should be displayed")
    public void user_click_on_the_blotter_name_and_details_should_be_displayed() throws Exception {
        Properties prop = readPropertiesFile(
                System.getProperty("user.dir") + "/src/test/resources/properties/blotter.properties");
        String blotterName =  prop.getProperty("Blotter_Name");
        BaseLibrary.waitAndClickElementUsingDynamic(blotterName);
        BaseLibrary.SetWaitTime(3);
        BlotterScreen.verifyAttributeValueOfBlotterName(blotterName);

    }


    @When("user enter blotter name {string}  in search box")
    public void user_enter_blotter_name_in_search_box(String string) throws Exception {
        BlotterScreen.enterValueInSearchBox(string);
    }

    @When("user should able to {string} in  the blotter table list screen")
    public void user_should_able_to_in_the_blotter_table_list_screen(String string) throws Exception {
        BlotterScreen.verifyNoData(string);

    }

    @Given("user navigate to blotter screen")
    public void user_navigate_to_blotter_screen() throws Exception {
        LoginScreen.openApplication();
       BlotterScreen.NavigateBlotterScreen();
    }

    @When("user click on the filter button on blotter screen")
    public void user_click_on_the_filter_button_on_blotter_screen() throws Exception {
        BlotterScreen.clickFilterButtonOnBlotter();
    }

    @When("enter the blotter name {string}")
    public void enter_the_blotter_name(String textToSent) throws Exception {
        if(textToSent.contentEquals("Random_Name")) {
            Properties prop = readPropertiesFile(
                    System.getProperty("user.dir") + "/src/test/resources/properties/blotter.properties");
            String blotterName =  prop.getProperty("Blotter_Name");
            BlotterScreen.enterBlotterNameOnFilter(blotterName);
        }else{
            BlotterScreen.enterBlotterNameOnFilter(textToSent);
        }
    }

    @When("click on the search button on blotter screen")
    public void click_on_the_search_button_on_blotter_screen() throws Exception {
        BlotterScreen.clickBlotterFilterSearch();
    }

    @When("enter the blotter number {string}")
    public void enter_the_blotter_number(String textToSent) throws Exception {
        if(textToSent.contentEquals("Random_Number")) {
            Properties prop = readPropertiesFile(
                    System.getProperty("user.dir") + "/src/test/resources/properties/blotter.properties");
            String blotterNumber =  prop.getProperty("Blotter_Number");
            BlotterScreen.enterBlotterNumberOnFilter(blotterNumber);
        }else{
            BlotterScreen.enterBlotterNumberOnFilter(textToSent);
        }
    }


    @Then("user should able see the below blotter details to be displayed")
    public void user_should_able_see_the_below_blotter_details_to_be_displayed(DataTable dataTable) throws Exception {
        data = dataTable.asLists(String.class);
        BlotterScreen.verifyBlotterNameOnList(data.get(0).get(1));
       // BlotterScreen.verifyBlotterNumberOnList(data.get(1).get(1));
        data = null;
    }



    @Then("user click on the blotter details screen should be displayed")
    public void user_click_on_the_blotter_details_screen_should_be_displayed() {

    }


}
