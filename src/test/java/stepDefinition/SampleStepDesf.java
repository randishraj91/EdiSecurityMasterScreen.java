package stepDefinition;

import io.cucumber.java.en.Given;
import pageObjects.OfficeScreen;

public class SampleStepDesf {

    OfficeScreen of = new OfficeScreen();

    @Given("user navigate to office screen for demo")
    public void user_navigate_to_office_screen_for_demo() throws Exception {
      // LoginScreen.openApplication();
      //  of.NavigateToOfficeScreen();
    }


    @Given("click on add new office button for demo")
    public void click_on_add_new_office_button_for_demo() {

    }

    @Given("user enters the following details on add new office screen for demo")
    public void user_enters_the_following_details_on_add_new_office_screen_for_demo() {

    }
}
