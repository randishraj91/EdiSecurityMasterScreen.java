package testRunner;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepDefinition.Hookable;
//import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)

@CucumberOptions(plugin = { "pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, features = "src/test/resources/BUSINESS_LOGIC/CUCUMBER_SUITE/", glue = {
				"stepDefinition" }, dryRun = false, monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests {

	@BeforeClass
	public void setupClassName(ITestContext context) {
		if (System.getProperty("Parallel").equalsIgnoreCase("Yes")) {
			context.getCurrentXmlTest().getSuite().setDataProviderThreadCount(5);
		} else {
			context.getCurrentXmlTest().getSuite().setDataProviderThreadCount(1);
		}
	}
	
	 @Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }

	@AfterSuite
	public void buildReport() throws Exception {
		StringBuilder builder = new StringBuilder();

		try {
			builder.append("<html>" + "<head><style>table {border-collapse: collapse;}"
					+ "table, td, th {border: 2px solid black;font-weight: bold;}</style></head>"
					+ "<body><center><img src='https://www.ionixxtech.com/assets/img/ionixx-logo.png' alt='CompanyIcon'></center>"
					+ "<p>Hi All,<p>"
					+ "<p>We have successfully executed Drivewealth UI Automation Suite for the release : "
					+ System.getProperty("Releasename") + ".\r\n</p>" + "<p><b>Environment Details :</b></p><table>"
					+ "<tr><td><font color='Purple'> App Environment </td><td style=\"text-align:center;\">"
					+ System.getProperty("AppEnvironment")
					+ "</td></tr><tr><td><font color='Purple'> Server </td><td style=\"text-align:center;\">"
					+ System.getProperty("BrowserEnvironment")
					+ "</td></tr><tr><td><font color='Purple'> Browser </td><td style=\"text-align:center;\">"
					+ System.getProperty("Browser") + "</td></tr></table><p><b>Test Summary :</b></p>" + "<table>"
					+ "<tr>" + "<td><font color='Purple'>TestCases: " + Hookable.totalcase + "</font></td>"
					+ "<td><font color='Green'>Passed: " + (Hookable.totalcase - Hookable.failedcase) + "</font></td>"
					+ "<td><font color='Red'>Failed: " + Hookable.failedcase + "</font></td>" + "</tr>" + "<tr>\r\n"
					+ "</table>" + "<p><b>For Detailed Report, Please find the attachment.</b></p>"
					+ "<p><b><font color='#00BFFF'>Testing Team - Ionixx Technologies</font></b> </p>"
					+ "<pre>******* Happy Testing *******</pre>" + "</blockquote>" + "<br>" + "</html>");
			File summaryLocation = new File("Summary.html");
			if (summaryLocation.exists()) {
				summaryLocation.delete();
				Thread.sleep(5000);
				summaryLocation.createNewFile();
			}
			OutputStream outputstream = new FileOutputStream(summaryLocation);
			Writer writer = new OutputStreamWriter(outputstream);
			writer.write(builder.toString());
			writer.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
