package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
},
        features = "src/test/resources/BUSINESS_LOGIC/CUCUMBER_SUITE/",
        glue = {"stepDefinition"},
        dryRun = false,
        tags = "@GLCOA")

public class EdiSecurityMasterRun extends AbstractTestNGCucumberTests {

}
