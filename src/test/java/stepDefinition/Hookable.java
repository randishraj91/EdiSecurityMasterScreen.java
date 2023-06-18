package stepDefinition;

import baseMethods.BaseLibrary;
import baseMethods.Threadmanager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentHtmlReporterConfiguration;

import testRailIntegration.APIClient;
import testRailIntegration.APIException;
import testRailIntegration.TestRailAccount;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Hookable {

	private static APIClient client = null;
	private static final int FAIL_STATE = 5;
	private static final int SUCCESS_STATE = 1;
	private static final String SUCCESS_COMMENT = "This test passed with Selenium";
	private static final String FAILED_COMMENT = "This test failed with Selenium";
	public static int totalcase,failedcase;
	
	@Rule
	public TestName testName = new TestName();
	private String runId = "GetFromProp";

	@Before
	public void before(Scenario scenario) throws Exception {
		System.out.println("Scenario Name ---->" + scenario.getName());
		BaseLibrary.InitializationBrowser();
		totalcase++;
	}

	@After
	public void after(Scenario scenario) throws IOException, Exception {

		String sname = scenario.getName();
		if (scenario.isFailed()) {
			failedcase++;
			final byte[] src = ((TakesScreenshot) Threadmanager.getdriver()).getScreenshotAs(OutputType.BYTES);
			scenario.log(scenario.getName() + "is failed");
			System.out.println(scenario.getName());
			ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(
					BaseLibrary.convertscrtobase(BaseLibrary.takeSnapShot("Error"+Thread.currentThread().getId()+".png")));

		}

		logResultToTestRail(scenario);
		BaseLibrary.closeBrowser();
		System.out.println("--------------- -Scenario Ends and browser closed -----------------------");

	}

	
	
	
	private void logResultToTestRail(Scenario scenario) {

		String sname = scenario.getName();
		String[] sNameArray = sname.split("_");
		String[] caseIds = sNameArray[0].split("&");

		for(String caseId : caseIds) {

			Map<String, Serializable> data = new HashMap<>();
			if (!scenario.isFailed()) {
				data.put("status_id", SUCCESS_STATE);
				data.put("comment", SUCCESS_COMMENT);
			} else {

				data.put("status_id", FAIL_STATE);
				data.put("comment", FAILED_COMMENT);
			}

			if (!caseId.equals("")) {
				try {
					if (System.getenv("runIdTestRail") != null && System.getenv("runTestRailId").equals("")) {
						runId = System.getenv("runIdTestRail");
					}
					client = TestRailAccount.testRailApiClient();
					if (runId.contentEquals("GetFromProp")) {
						String test = System.getenv("runIdTestRail");
						Properties prop = readPropertiesFile(
								System.getProperty("user.dir") + "/src/test/resources/properties/testrail.properties");
						runId = prop.getProperty("RunID");

					}
					client.sendPost("add_result_for_case/" + runId + "/" + caseId, data);
				} catch (IOException | APIException e) {
					e.printStackTrace();
				}
			}

		}

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

}
