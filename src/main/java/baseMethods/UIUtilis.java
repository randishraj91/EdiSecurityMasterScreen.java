package baseMethods;

import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.File;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.OperatingSystem;

public class UIUtilis extends CommonUilitis {

	/* Launch the browser */

	public synchronized static void InitializationBrowser() throws Exception {
		String strBrowserName = System.getProperty("Browser");
		String browserenvironment = System.getProperty("BrowserEnvironment");
		String os = System.getProperty("os.name");
		String AUTOMATE_USERNAME = getpropvalue("bs_username");
		String AUTOMATE_ACCESS_KEY = getpropvalue("bs_password");
		String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";

		if (browserenvironment.equalsIgnoreCase("Cloud")) {
			DesiredCapabilities caps = new DesiredCapabilities();
			if (strBrowserName.equalsIgnoreCase("Chrome")) {
				caps.setCapability("os", "Windows");
				caps.setCapability("os_version", "10");
				caps.setCapability("browser", "Chrome");
				caps.setCapability("browser_version", "99.0");
				caps.setCapability("browserstack.local", "false");
				caps.setCapability("browserstack.selenium_version", "4.0.0");
			} else if (strBrowserName.equalsIgnoreCase("Firefox")) {
				caps.setCapability("os", "Windows");
				caps.setCapability("os_version", "10");
				caps.setCapability("browser", "Firefox");
				caps.setCapability("browser_version", "latest");
				caps.setCapability("browserstack.local", "false");
				caps.setCapability("browserstack.selenium_version", "4.0.0");
			}
			driver = new RemoteWebDriver(new URL(URL), caps);

		} else {
			if (os.startsWith("Linux") && strBrowserName.equalsIgnoreCase("Chrome")) {
				WebDriverManager.chromedriver().operatingSystem(OperatingSystem.LINUX).setup();
				Map<String, Object> prefs = new HashMap<String, Object>();
				prefs.put("download.default_directory",System.getProperty("user.dir") + "//src//test//resources//Downloads//");
				ChromeOptions options = new ChromeOptions();
				options.setExperimentalOption("prefs", prefs);          
				driver = new ChromeDriver(options);	
			} else if (os.startsWith("Linux") && strBrowserName.equalsIgnoreCase("Edge")) {
				WebDriverManager.edgedriver().operatingSystem(OperatingSystem.LINUX).setup();
				driver = new EdgeDriver();
			} else if (os.startsWith("Linux") && strBrowserName.equalsIgnoreCase("Firefox")) {
				WebDriverManager.firefoxdriver().operatingSystem(OperatingSystem.LINUX).setup();
				driver = new FirefoxDriver();
			} else if (os.contains("MAC") && strBrowserName.equalsIgnoreCase("Chrome")) {
				WebDriverManager.chromedriver().operatingSystem(OperatingSystem.MAC).setup();
				driver = new ChromeDriver();
			} else if (os.contains("MAC") && strBrowserName.equalsIgnoreCase("Edge")) {
				WebDriverManager.edgedriver().operatingSystem(OperatingSystem.MAC).setup();
				driver = new EdgeDriver();
			} else if (os.contains("MAC") && strBrowserName.equalsIgnoreCase("Firefox")) {
				WebDriverManager.firefoxdriver().operatingSystem(OperatingSystem.MAC).setup();
				driver = new FirefoxDriver();
			} else if (os.startsWith("Windows") && strBrowserName.equalsIgnoreCase("Chrome")) {
				WebDriverManager.chromedriver().operatingSystem(OperatingSystem.WIN).setup();
				driver = new ChromeDriver();
			} else if (os.startsWith("Windows") && strBrowserName.equalsIgnoreCase("Edge")) {
				WebDriverManager.edgedriver().operatingSystem(OperatingSystem.WIN).setup();
				driver = new EdgeDriver();
			} else if (os.startsWith("Windows") && strBrowserName.equalsIgnoreCase("Firefox")) {
				WebDriverManager.firefoxdriver().operatingSystem(OperatingSystem.WIN).setup();
				driver = new FirefoxDriver();
			}

		}
		driver.manage().window().maximize();
		Threadmanager.setdriver(driver);
		Threadmanager.getdriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		loadURL(getpropvalue("url"));

	}

	/* Launch the application url */
	public static void loadURL(String URL) {
		Threadmanager.getdriver().get(URL);

	}

	public static void waitforelement(WebElement element) {
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void dontseeelement(WebElement element) {
		new WebDriverWait(driver, Duration.ofSeconds(2)).until(ExpectedConditions.invisibilityOf(element));
	}
	
	
	public static void waitforelementinvisible(WebElement element) {
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.invisibilityOf(element));
	}


	public static void waitforelementwithsecs(WebElement element, int seconds) {
		new WebDriverWait(driver, Duration.ofSeconds(seconds)).until(ExpectedConditions.visibilityOf(element));
	}

	public static void typetext(WebElement element, String value) throws Exception {
		waitforelement(element);
		scrollToElement(element);
		element.sendKeys(value);
	}
	
	public static void fileupload(WebElement element, String path) throws Exception {
		scrollToElement(element);
		element.sendKeys(path);
	}
	
	public static void scrollToElement(WebElement element) throws Exception {
	    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
	    Thread.sleep(500);
	}
	
	
	public static void textclear(WebElement element) throws Exception {
		waitforelement(element);
		scrollToElement(element);
		element.click();
		element.sendKeys(Keys.CONTROL+"A");
		element.sendKeys(Keys.BACK_SPACE);
	}

	public static void jstypetext(WebElement element, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='" + value + "';", element);
	}

	public static void clickelement(WebElement element) throws Exception {
		waitforelement(element);
		scrollToElement(element);
		element.click();
	}
	
	
	public static boolean check_windowtabs(int expectedsize) throws Exception {
		Thread.sleep(5000);
		int actualsize = driver.getWindowHandles().size();
		if(expectedsize == actualsize)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	public static void jsclickelement(WebElement element) throws Exception {
		waitforelement(element);
		scrollToElement(element);
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(" + element.getLocation().x + "," + element.getLocation().y + ")");
		js.executeScript("arguments[0].click();", element);

	}

	public static String gettext(WebElement element) {
		return element.getText();
	}

	public static WebElement locatorstowebelement(String locators) {
		return new WebDriverWait(driver, Duration.ofSeconds(20))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locators)));
	}

	public static void dropdownselectionwithkeys(WebElement element, String value, int times) throws Exception {
		waitforelement(element);
		element.sendKeys(value);
		Thread.sleep(3000);
		element.sendKeys(Keys.DOWN);
		if (times == 2) {
			element.sendKeys(Keys.DOWN);
		}
		element.sendKeys(Keys.ENTER);
	}


}
