package baseMethods;
/*
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
*/

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.OperatingSystem;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//import stepDefinition.HolidayTest;

public class BaseLibrary extends UIUtilis {


    public static String parentHandle = "";
    public static int callfolderOnce;
    public static String testCaseResultPath = null;

    public static String Pub_Curr_Time = null;
    public static String TestcaseFinalStatus = null;
    public static String pubTestCaseName = null;
    static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date date1 = new Date();
    static String tcResultFolder = "";
    static String PubApplicationName = "DW Post Trade";
    public static int Window_count = 0;
    public static Hashtable<String, Object> outputparameters = new Hashtable<String, Object>();



    /*
     * sendKeysToWebElement method will sent intputs to the webelement and takes
     * input parameters as element and test to sent
     */
    public static void sendKeysToWebElement(By by_element, String textToSent) throws Exception {

        try {
            setFocusToElement(by_element);
            WebElement element = (Threadmanager.getdriver()).findElement(by_element);
            // WebDriverWait wait = new WebDriverWait((Threadmanager.getdriver()), 10);
            // new WebDriverWait((Threadmanager.getdriver()), Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(by_element)).click();
            if (element.isEnabled()) {
                clearText(by_element);
                element.click();
                element.sendKeys(textToSent);

            }

            // HTMLReportGenerator.StepDetails("Pass", "Action: Send Keys, Input Given:",
            // textToSent,
            // by_element.toString());

        } catch (Exception e) {
            Assert.fail("Unable to wait and click on the WebElement, using : " + by_element.toString());

        }

    }

    /*
     * waitAndClickElement method will wait and click on webelement and takes input
     * parameters as element
     */
    public static void waitAndClickElement(By belement) throws Exception {
        WebElement element = null;
        try {
            element = (Threadmanager.getdriver()).findElement(belement);
            new Actions((Threadmanager.getdriver())).moveToElement(element).perform();
            if (element.isDisplayed() || element.isEnabled()) {
                element.click();
            }
        } catch (Exception e) {

            Assert.fail("Unable to wait and click on the WebElement, using : " + element.toString());
        }

    }

    public static void waitAndClickElementsUsingByLocator(By by) throws Exception {
        boolean clicked = false;
        int attempts = 0;

        new WebDriverWait((Threadmanager.getdriver()), Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(by));

        if ((Threadmanager.getdriver()).findElement(by).isEnabled()) {
            setFocusToElement(by);
            (Threadmanager.getdriver()).findElement(by).click();
            System.out
                    .println("Successfully clicked on the element using by locator: " + "<" + by.toString() + ">");

        }



    }

    public static void clickOnTextFromDropdownList(WebElement list, String textToSearchFor) throws Exception {

        try {
            new WebDriverWait((Threadmanager.getdriver()), Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(list)).click();
            list.sendKeys(textToSearchFor);
            list.sendKeys(Keys.ENTER);
            System.out.println("Successfully sent the following keys: " + textToSearchFor
                    + ", to the following WebElement: " + "<" + list.toString() + ">");
            // HTMLReportGenerator.StepDetails("Pass", "Action: Select , Input Given:",
            // textToSearchFor, list.toString());
        } catch (Exception e) {
            System.out.println("Unable to send the following keys: " + textToSearchFor
                    + ", to the following WebElement: " + "<" + list.toString() + ">");

            // Assert.fail("Unable to select the required text from the dropdown
            // menu, Exception: " + e.getMessage());
            // HTMLReportGenerator.StepDetails("Fail", "Unable to select value from dropdown
            // : ", textToSearchFor,
            // list.toString());
        }

    }

    public static void setFocusToElement(By byElement) {

        try {
            SetWaitTime(1000);
            WebElement element = (Threadmanager.getdriver()).findElement(byElement);
            new Actions((Threadmanager.getdriver())).moveToElement(element).perform();
            // element.click();

        } catch (Exception ex) {
        }

    }

    public static void clickOnTextFromDropdownList(By byElement, String textToSearchFor) throws Exception {
        WebElement list = (Threadmanager.getdriver()).findElement(byElement);

        try {
            new WebDriverWait((Threadmanager.getdriver()), Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(list)).click();
            list.sendKeys(textToSearchFor);
            SetWaitTime(30);
            list.sendKeys(Keys.DOWN);
            SetWaitTime(30);
            list.sendKeys(Keys.ENTER);
            System.out.println("Successfully sent the following keys: " + textToSearchFor
                    + ", to the following WebElemen t: " + "<" + list.toString() + ">");
            // HTMLReportGenerator.StepDetails("Pass", "Action: Select , Input Given:",
            // textToSearchFor,
            // byElement.toString());
        } catch (Exception e) {

            System.out.println("Unable to send the following keys: " + textToSearchFor
                    + ", to the following WebElement:" + "<" + list.toString() + ">");
            // HTMLReportGenerator.StepDetails("Fail", "Unable to select value from dropdown
            // : ", textToSearchFor,
            // byElement.toString());
            // Assert.fail("Unable toselect the required text from the dropdown
            // menu, Exception: " + e.getMessage());
        }

    }

    public static void clickOnTextFromDropdownList_two(By byElement, String textToSearchFor) throws Exception {
        WebElement list = (Threadmanager.getdriver()).findElement(byElement);

        try {
            new WebDriverWait((Threadmanager.getdriver()), Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(list)).click();
            list.sendKeys(textToSearchFor);
            SetWaitTime(30);
            list.sendKeys(Keys.DOWN);
            SetWaitTime(30);
            list.sendKeys(Keys.DOWN);
            SetWaitTime(30);
            list.sendKeys(Keys.ENTER);
            System.out.println("Successfully sent the following keys: " + textToSearchFor
                    + ", to the following WebElemen t: " + "<" + list.toString() + ">");
            // HTMLReportGenerator.StepDetails("Pass", "Action: Select , Input Given:",
            // textToSearchFor,
            // byElement.toString());
        } catch (Exception e) {

            System.out.println("Unable to send the following keys: " + textToSearchFor
                    + ", to the following WebElement:" + "<" + list.toString() + ">");
            // HTMLReportGenerator.StepDetails("Fail", "Unable to select value from dropdown
            // : ", textToSearchFor,
            // byElement.toString());
            // Assert.fail("Unable toselect the required text from the dropdown
            // menu, Exception: " + e.getMessage());
        }

    }

    public static void clickOnElementUsingCustomTimeout(WebElement locator, WebDriver driver, int timeout)
            throws Exception {
        try {
            new WebDriverWait((Threadmanager.getdriver()), Duration.ofSeconds(30)).until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(locator)));
            locator.click();
            // HTMLReportGenerator.StepDetails("Pass", "Action: Click , Input Given:",
            // locator.toString(),
            // locator.toString());
            System.out.println("Successfully clicked on the WebElement, using locator: " + "<" + locator + ">"
                    + ", using a custom Timeout of: " + timeout);
        } catch (Exception e) {

            System.out.println("Unable to click on the WebElement, using locator: " + "<" + locator + ">"
                    + ", using a custom Timeout of: " + timeout);
            // Assert.fail("Unable to click on the WebElement, Exception: " +
            // e.getMessage());
            // HTMLReportGenerator.StepDetails("Fail", "Unable to perform click operation on
            // :", locator.toString(),
            // locator.toString());
        }

    }

    /**********************************************************************************/
    /**********************************************************************************/

    /**********************************************************************************
     ** ACTION METHODS
     **********************************************************************************/

    public static void actionMoveAndClick(WebElement element) throws Exception {
        Actions ob = new Actions((Threadmanager.getdriver()));
        try {
            // new WebDriverWait((Threadmanager.getdriver()), Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(element)).isEnabled();
            ob.moveToElement(element).click().build().perform();
            System.out.println("Successfully Action Moved and Clicked on the WebElement, using locator: " + "<"
                    + element.toString() + ">");
        } catch (StaleElementReferenceException elementUpdated) {
            WebElement elementToClick = element;
            Boolean elementPresent = false;

            // new WebDriverWait((Threadmanager.getdriver()), Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(elementToClick)).isEnabled();
            if (elementPresent == true) {
                ob.moveToElement(elementToClick).click().build().perform();
                System.out.println(
                        "(Stale Exception) - Successfully Action Moved and Clicked on the WebElement, using locator: "
                                + "<" + element.toString() + ">");
                // HTMLReportGenerator.StepDetails("Pass", "Unable to perform click operation on
                // : ", element.toString(),
                // element.toString());
            }
        } catch (Exception e) {

            System.out.println("Unable to Action Move and Click on the WebElement, using locator: " + "<"
                    + element.toString() + ">");
            // Assert.fail("Unable to Action Move and Click on the WebElement,
            // Exception: " + e.getMessage());
            // HTMLReportGenerator.StepDetails("Fail", "Unable to perform click operation on
            // :", element.toString(),
            // element.toString());
        }

    }

    public static void actionMoveAndClickByLocator(By element) throws Exception {
        Actions ob = new Actions((Threadmanager.getdriver()));
        try {
            Boolean elementPresent = true;
            // new WebDriverWait((Threadmanager.getdriver()), Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(element)).isEnabled();
            if (elementPresent == true) {
                WebElement elementToClick = (Threadmanager.getdriver()).findElement(element);
                setFocusToElement(element);
                ob.moveToElement(elementToClick).click().build().perform();
                System.out.println("Action moved and clicked on the following element, using By locator: " + "<"
                        + element.toString() + ">");
            }
        } catch (StaleElementReferenceException elementUpdated) {
            WebElement elementToClick = (Threadmanager.getdriver()).findElement(element);
            ob.moveToElement(elementToClick).click().build().perform();

            // HTMLReportGenerator.StepDetails("Pass", "Action: Click , Input Given:",
            // element.toString(),
            // element.toString());

            System.out
                    .println("(Stale Exception) - Action moved and clicked on the following element, using By locator: "
                            + "<" + element.toString() + ">");
        } catch (Exception e) {
            // check

            System.out.println("Unable to Action Move and Click on the WebElement using by locator: " + "<"
                    + element.toString() + ">");
            // HTMLReportGenerator.StepDetails("Fail",
            // "Unable to Action Move and Click on the WebElement using by locator:",
            // element.toString(),
            // element.toString());
            // Assert.fail(
            // "Unable to Action Move and Click on the WebElement using by
            // locator, Exception: " + e.getMessage());
        }

    }

    /// ****************************************** VERIFY
    /// **************************/

    public static void verifyText(By element, String textToVerify) throws Exception {
        try {
            // SetWaitTime(1000);
            new WebDriverWait((Threadmanager.getdriver()), Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(element));
            String result = (Threadmanager.getdriver()).findElement(element).getText();
            WebElement ele = (Threadmanager.getdriver()).findElement(element);
            System.out.println("Reult text received : " + result);
            JavascriptExecutor js = (JavascriptExecutor) (Threadmanager.getdriver());

            if (result.trim().contains(textToVerify.trim())) {
                js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
                        ele);
                String tsStatus = "Pass";
                // HTMLReportGenerator.StepDetails("Pass", "Action: Verify , Input Given:",
                // textToVerify, element.toString());
                System.out.println(tsStatus);
            } else {
                Assert.fail("Unable to verify error message using by locator, Exception: " + result);
                // HTMLReportGenerator.StepDetails("Fail", "Action: Verify , Input Given:",
                // textToVerify, element.toString());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            Assert.fail("Unable to verify error message using by locator, Exception: " + ex.getMessage());
        }

    }

    public static void closeBrowser() {
        (Threadmanager.getdriver()).manage().deleteAllCookies();
        (Threadmanager.getdriver()).close();
        (Threadmanager.getdriver()).quit();
    }

    public static void verifyTableList_2(String holidayname, String holidaydate) throws Exception {
        try {
            SetWaitTime(3000);
            Thread.sleep(5000);
            List<WebElement> rows = (Threadmanager.getdriver()).findElements(By.xpath("//table//tbody//tr"));
            new WebDriverWait((Threadmanager.getdriver()), Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfAllElements(rows));
            boolean flag1 = false;
            JavascriptExecutor js = (JavascriptExecutor) (Threadmanager.getdriver());
            for (WebElement row : rows) {
                String val1 = row.findElement(By.xpath("//td[2]")).getText();
                String val2 = row.findElement(By.xpath("//td[3]")).getText();
                if (val1.contentEquals(holidayname) || val2.contentEquals(holidaydate)) {
                    js.executeScript(
                            "arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
                            row.findElement(By.xpath("//td[2]")));
                    js.executeScript(
                            "arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
                            row.findElement(By.xpath("//td[3]")));
                    SetWaitTime(3000);
                    flag1 = true;
                    System.out.println("*******************************");
                    System.out.println(flag1);
                    System.out.println("*******************************");
                    // HTMLReportGenerator.StepDetails("Pass", "Action: Verify , Input Given:",
                    // val1, "");
                    break;
                }

            }

            System.out.println("*******************************");
            System.out.println(flag1);
            System.out.println("*******************************");
            if (flag1 == false) {
                Assert.fail("unable to verify table content : " + rows);
                // HTMLReportGenerator.StepDetails("Fail", "Action: Verify , Input Given:",
                // holidayname,
                // "Unable to get value in webtable");
            }

        } catch (Exception Ex) {
            // HTMLReportGenerator.StepDetails("Fail", "Action: Verify , Input Given:",
            // holidayname,
            // "Unable to get value in webtable");
            Ex.printStackTrace();
            Assert.fail("unable to verify table content " + Ex.getMessage());
        }

    }

    public static void verifyTableListWithCellandRow(String data, int row, int cell) throws Exception {
        try {

            SetWaitTime(3000);
            boolean flag1 = false;
            JavascriptExecutor js = (JavascriptExecutor) (Threadmanager.getdriver());
            WebElement element = (Threadmanager.getdriver()).findElement(By.xpath("//table//tbody//tr[" + row + "]//td[" + cell + "]"));
            new WebDriverWait((Threadmanager.getdriver()), Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfAllElements(element));
            setFocusToElement(By.xpath("//table//tbody//tr[ " + row + " ]//td[" + cell + "]"));
            String cellData = element.getText();
            if (cellData.contentEquals(data)) {
                setFocusToElement(By.xpath("//table//tbody//tr[" + row + "]//td[" + cell + "]"));
                js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
                        (Threadmanager.getdriver()).findElement(By.xpath("//table//tbody//tr[" + row + "]//td[" + cell + "]")));

                flag1 = true;
                System.out.println("*******************************");
                System.out.println(flag1);
                System.out.println("*******************************");
            }
            if (flag1 == false) {
                Assert.fail("unable to verify table content :" + cellData);
            }

        } catch (Exception Ex) {
            Ex.printStackTrace();
            Assert.fail("unable to verify table content " + Ex.getMessage());
        }

    }

    public static void verifyTableListWithSingleColumn(String data, int columnNumber) throws Exception {
        String val1 = "";
        try {

            List<WebElement> countOfPage = (Threadmanager.getdriver()).findElements(By.xpath("//ul[@class='MuiPagination-ul']//li"));
            setFocusToElement(By.xpath("//td[" + columnNumber + "]"));
            int count = countOfPage.size() - 2;

            for (int i = 0; i <= count; i++) {

                int countRow = 1;


                SetWaitTime(3000);
                Thread.sleep(5000);
                List<WebElement> rows = (Threadmanager.getdriver()).findElements(By.xpath("//table//tbody//tr"));
                new WebDriverWait((Threadmanager.getdriver()), Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfAllElements(rows));
                boolean flag1 = true;
                JavascriptExecutor js = (JavascriptExecutor) (Threadmanager.getdriver());
                final int colNum = columnNumber;
                for (WebElement row : rows) {
                    row.findElement(By.xpath("./td[" + colNum + "]")).click();
                    val1 = row.findElement(By.xpath("./td[" + colNum + "]")).getText();
                    if (val1.contentEquals(data)) {
                        js.executeScript(
                                "arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
                                row.findElement(By.xpath("./td[" + colNum + "]")));
                        countRow++;
                        val1 = null;
                    } else {
                        flag1 = false;
                    }

                }
                System.out.println("*******************************");
                System.out.println(flag1);
                System.out.println("*******************************");
                if (flag1 == false) {

                    Assert.fail("unable to verify table content  (False)  Expected : " + val1);
                } else {
                    if (i < count && countRow == 11)
                        (Threadmanager.getdriver()).findElement(By.xpath("//button[@aria-label='Go to next page']")).click();
                }
            }

        } catch (Exception Ex) {
            Ex.printStackTrace();

            Assert.fail("unable to verify table content " + data + " , Actual : " + val1 + " , and exception : "
                    + Ex.getMessage());
        }

    }

    public static void VerifyDynamicText(String DynStr) throws Exception {
        try {
            JavascriptExecutor js = (JavascriptExecutor) (Threadmanager.getdriver());
            WebElement dispText = (Threadmanager.getdriver()).findElement(By.xpath("//*[contains(text(),'" + DynStr + "')]"));
            String disVal = dispText.getText();
            if (!disVal.contentEquals(DynStr)) {
                Assert.fail("Error --> VerifyDynamicText, unable to verify table content : " + dispText);
            } else {

                js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
                        dispText);
                BaseLibrary.SetWaitTime(1000);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            Assert.fail("Error --> VerifyDynamicText, unable to verify table content : ");
        }

    }

    public static void VerifyTableDynamicText(String DynStr) throws Exception {
        try {
            JavascriptExecutor js = (JavascriptExecutor) (Threadmanager.getdriver());
            List<WebElement> dispText = (Threadmanager.getdriver()).findElements(By.xpath("//td[text()='" + DynStr + "']"));

            if (dispText.size() > 0) {
                verifyText(By.xpath("(//td[text()='" + DynStr + "'])[1]"), DynStr);

            } else {
                Assert.fail(
                        "Error --> VerifyDynamicText, unable to verify table content -------> " + dispText.toString());
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            Assert.fail("Error --> VerifyDynamicText, unable to verify table content : ");
        }

    }

    // tr[@class='MuiTableRow-root nested-body-col']//td

    public static void VerifyTaxLotTableText(String DynStr) throws Exception {
        try {
            boolean flag = false;
            JavascriptExecutor js = (JavascriptExecutor) (Threadmanager.getdriver());
            List<WebElement> dispText = (Threadmanager.getdriver())
                    .findElements(By.xpath("/tr[@class='MuiTableRow-root nested-body-col']//td"));

            for (WebElement loc : dispText) {
                String verdata = loc.getText();
                if (verdata.contentEquals(DynStr)) {
                    flag = true;
                    new Actions((Threadmanager.getdriver())).moveToElement(loc).perform();
                    js.executeScript(
                            "arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", loc);
                }

            }

            if (!flag) {
                Assert.fail("Error --> VerifyDynamicText, unable to verify table content --> " + DynStr);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            Assert.fail("Error --> VerifyDynamicText, unable to verify table content : " + DynStr);
        }

    }

    public static void verifyTableList_1(String holidayname) throws Exception {
        try {

            SetWaitTime(3000);
            Thread.sleep(5000);
            List<WebElement> rows = (Threadmanager.getdriver()).findElements(By.xpath("//table//tbody//tr"));
            new WebDriverWait((Threadmanager.getdriver()), Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfAllElements(rows));
            boolean flag1 = false;
            JavascriptExecutor js = (JavascriptExecutor) (Threadmanager.getdriver());
            for (WebElement row : rows) {
                String val1 = row.findElement(By.xpath("//td[2]")).getText();
                if (val1.contentEquals(holidayname)) {
                    js.executeScript(
                            "arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
                            row.findElement(By.xpath("//td[2]")));

                    flag1 = true;
                    System.out.println("*******************************");
                    System.out.println(flag1);
                    System.out.println("*******************************");
                    // HTMLReportGenerator.StepDetails("Pass", "Action: Verify , Input Given:",
                    // val1, "");
                    break;
                }

            }

            System.out.println("*******************************");
            System.out.println(flag1);
            System.out.println("*******************************");
            if (flag1 == false) {
                // Assert.fail("unable to verify table content : " + rows);
                // HTMLReportGenerator.StepDetails("Fail", "Action: Verify , Input Given:",
                // holidayname,
                // "Unable to verify value in web table");
            }

        } catch (Exception Ex) {
            // HTMLReportGenerator.StepDetails("Fail", "Action: Verify , Input Given:",
            // holidayname,
            // "Unable to verify value in web table");
            Ex.printStackTrace();
            Assert.fail("unable to verify table content " + Ex.getMessage());
        }

    }

    public static void SetWaitTime(int WaitSeconds) {
        try {
            Thread.sleep(WaitSeconds);
        } catch (Exception ex) {

        }
    }


    public static void waitAndClickElementUsingDynamic(String dynString) throws Exception {

        WebElement element = (Threadmanager.getdriver()).findElement(By.xpath("//td[contains(text(),'" + dynString + "')]"));
        boolean clicked = false;
        int attempts = 0;
        while (!clicked && attempts < 10) {
            try {
                if (element.isDisplayed()) {

                    element.click();
                    SetWaitTime(10);

                }

                // HTMLReportGenerator.StepDetails("Pass", "Action: click , Input Given:", "",
                // dynString);

                System.out.println("Successfully clicked on the WebElement: " + "<" + element.toString() + ">");
                clicked = true;
            } catch (Exception e) {
                // HTMLReportGenerator.StepDetails("Fail", "Action: click , Input Given:",
                // e.toString(), dynString);

                Assert.fail(
                        "Unable to wait and click on the WebElement, using locator: " + "<" + element.toString() + ">");
            }
            attempts++;
        }

    }

    public static void clearText(By nameOfHoliday) {
        try {
            SetWaitTime(3000);
            String txtData = (Threadmanager.getdriver()).findElement(nameOfHoliday).getAttribute("value");
            int clrLength = txtData.length();

            for (int i = 0; i <= clrLength + 3; i++) {
                (Threadmanager.getdriver()).findElement(nameOfHoliday).sendKeys(Keys.BACK_SPACE);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void clickOnDynText(String dynText) {
        try {
            WebElement element = (Threadmanager.getdriver()).findElement(By.xpath("//td[contains(text(),'" + dynText + "')]"));
            element.click();
        } catch (Exception ex) {
            Assert.fail("Unable to wait and click on the WebElement, using locator: " + "<" + dynText + ">");
        }
    }

    public static void VerifyDynText(String dynText) {
        try {
            SetWaitTime(1000);
            JavascriptExecutor js = (JavascriptExecutor) (Threadmanager.getdriver());
            boolean element = (Threadmanager.getdriver()).findElement(By.xpath("//td[contains(text(),'" + dynText + "')]")).isDisplayed();
            if (element) {
                js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
                        (Threadmanager.getdriver()).findElement(By.xpath("//td[contains(text(),'" + dynText + "')]")));

            }

        } catch (Exception ex) {
            Assert.fail("Unable to wait and verify on the WebElement, using locator: " + "<" + dynText + ">");
        }
    }

    public static void verifyAttributeValue(By officeNumber, String dynText) {
        try {
            SetWaitTime(1000);
            JavascriptExecutor js = (JavascriptExecutor) (Threadmanager.getdriver());
            String sData = (Threadmanager.getdriver()).findElement(officeNumber).getAttribute("value");
            if (sData.contentEquals(dynText)) {
                js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
                        (Threadmanager.getdriver()).findElement(officeNumber));
                SetWaitTime(1000);
            }
        } catch (Exception ex) {
            Assert.fail("verifyAttributeValue --> Unable to wait and verify on the WebElement, using locator: " + "<"
                    + dynText + ">");
        }
    }

    public static void highLightFirstRow(int row, String data) {
        try {
            SetWaitTime(1000);
            JavascriptExecutor js = (JavascriptExecutor) (Threadmanager.getdriver());
            WebElement element = (Threadmanager.getdriver()).findElement(By.xpath("(//td)[" + row + "]"));
            if (data.contentEquals(element.getText().trim())) {
                js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
                        element);
            }
        } catch (Exception ex) {
            Assert.fail("highLightFirstRow --> Unable to wait and verify on the WebElement, using locator: " + "<" + row
                    + ">");
        }
    }

    public static String uploadWithGivenFile(String filePath) {
        String platform = System.getProperty("os.name");
        String componentStatus = null;
        try {
            Robot robot = new Robot();

            if (!System.getProperty("os.name").equals("Windows")) {

                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_L);
                robot.keyRelease(KeyEvent.VK_L);
                robot.keyRelease(KeyEvent.VK_CONTROL);
            }

            StringSelection stringSelection = new StringSelection(filePath);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, stringSelection);
            robot.delay(1000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.delay(1000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

        } catch (Exception e) {
            Assert.fail("Unable to attach the file.... ");
        }
        return componentStatus;
    }

    public static void sentTextUsingJS(By byElement, String textToSent) {
        try {
            WebElement element = (Threadmanager.getdriver()).findElement(byElement);
            element.click();
            JavascriptExecutor jse = (JavascriptExecutor) (Threadmanager.getdriver());
            jse.executeScript("arguments[0].value='" + textToSent + "';", element);

        } catch (Exception ex) {
            ex.printStackTrace();
            Assert.fail("Unable to sent text using JS ");
        }

    }

    public static void scrollDownBy350() {

        JavascriptExecutor js = (JavascriptExecutor) (Threadmanager.getdriver());
        js.executeScript("window.scrollBy(0,1000)", "");
    }

    public static void scrollDownBy(By element) {
        WebElement scroll = (Threadmanager.getdriver()).findElement(element);
        JavascriptExecutor js = (JavascriptExecutor) (Threadmanager.getdriver());
        js.executeScript("arguments[0].scrollIntoView()", scroll);
    }

    public static void pressDown(int iter) {
        for (int i = 0; i <= iter; i++) {
            (Threadmanager.getdriver()).findElement(By.xpath("html")).sendKeys(Keys.DOWN);
        }
    }

    public static void verifyTableListWithSingleColumnWithName(String data, String colName) {
        String val1 = "";
        try {
            int columnNumber = getcolumnNumber(colName);
            List<WebElement> countOfPage = (Threadmanager.getdriver()).findElements(By.xpath("//ul[@class='MuiPagination-ul']//li"));
            setFocusToElement(By.xpath("//td[" + columnNumber + "]"));
            int count = countOfPage.size() - 2;
            for (int i = 1; i <= count; i++) {
                int countRow = 1;
                int drow = 0;
                int check = 0;
                setFocusToElement(By.xpath("//td[" + columnNumber + "]"));

                SetWaitTime(6000);
                List<WebElement> rows = (Threadmanager.getdriver()).findElements(By.xpath("//table//tbody//tr"));
                // new WebDriverWait((Threadmanager.getdriver()), Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfAllElements(rows));
                boolean flag1 = true;
                JavascriptExecutor js = (JavascriptExecutor) (Threadmanager.getdriver());
                final int colNum = columnNumber;

                for (WebElement row : rows) {
                    drow++;
                    if (drow == 9 || drow == 12 || drow == 18 || drow == 24 || drow == 29 || drow == 35 || drow == 39
                            || drow == 45) {
                        pressDown(6);
                    }
                    // setFocusToElement(By.xpath("./td[" + colNum + "]"));
                    val1 = row.findElement(By.xpath("./td[" + colNum + "]")).getText();
                    if (val1.contentEquals(data)) {
                        System.out.println(colNum);
                        js.executeScript(
                                "arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
                                row.findElement(By.xpath("./td[" + colNum + "]")));
                        countRow++;
                        val1 = null;
                        BaseLibrary.SetWaitTime(200);

                    } else {
                        System.out.println("row : " + countRow + " , coll :  " + colNum + " Data : " + val1);
                        flag1 = false;
                    }

                }
                System.out.println("*******************************");
                System.out.println(flag1);
                System.out.println("*******************************");
                if (flag1 == false) {

                    Assert.fail("unable to verify table content  (False)  Expected : " + val1);
                } else {
                    if (i < count && countRow == 51)
                        (Threadmanager.getdriver()).findElement(By.xpath("//button[@aria-label='Go to next page']")).click();
                }
            }

        } catch (Exception Ex) {
            Ex.printStackTrace();

            Assert.fail("unable to verify table content " + data + " , Actual : " + val1 + " , and exception : "
                    + Ex.getMessage());
        }

    }

    public static void verifyTableListContainsWithSingleColumnWithName(String data, String colName) {
        String val1 = "";
        try {
            int columnNumber = getcolumnNumber(colName);
            List<WebElement> countOfPage = (Threadmanager.getdriver()).findElements(By.xpath("//ul[@class='MuiPagination-ul']//li"));
            setFocusToElement(By.xpath("//td[" + columnNumber + "]"));
            int count = countOfPage.size() - 2;
            for (int i = 1; i <= count; i++) {
                int countRow = 1;
                int drow = 0;
                int check = 0;
                setFocusToElement(By.xpath("//td[" + columnNumber + "]"));

                SetWaitTime(6000);
                List<WebElement> rows = (Threadmanager.getdriver()).findElements(By.xpath("//table//tbody//tr"));
                // new WebDriverWait((Threadmanager.getdriver()), Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfAllElements(rows));
                boolean flag1 = true;
                JavascriptExecutor js = (JavascriptExecutor) (Threadmanager.getdriver());
                final int colNum = columnNumber;

                for (WebElement row : rows) {
                    drow++;
                    if (drow == 9 || drow == 12 || drow == 18 || drow == 24 || drow == 29 || drow == 35 || drow == 39
                            || drow == 45) {
                        pressDown(6);
                    }
                    // setFocusToElement(By.xpath("./td[" + colNum + "]"));
                    val1 = row.findElement(By.xpath("./td[" + colNum + "]")).getText();
                    if (val1.contains(data)) {
                        System.out.println(colNum);
                        js.executeScript(
                                "arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
                                row.findElement(By.xpath("./td[" + colNum + "]")));
                        countRow++;
                        val1 = null;
                        BaseLibrary.SetWaitTime(200);

                    } else {
                        System.out.println("row : " + countRow + " , coll :  " + colNum + " Data : " + val1);
                        flag1 = false;
                    }

                }
                System.out.println("*******************************");
                System.out.println(flag1);
                System.out.println("*******************************");
                if (flag1 == false) {

                    Assert.fail("unable to verify table content  (False)  Expected : " + val1);
                } else {
                    if (i < count && countRow == 51)
                        (Threadmanager.getdriver()).findElement(By.xpath("//button[@aria-label='Go to next page']")).click();
                }
            }

        } catch (Exception Ex) {
            Ex.printStackTrace();

            Assert.fail("unable to verify table content " + data + " , Actual : " + val1 + " , and exception : "
                    + Ex.getMessage());
        }

    }

    private static int getcolumnNumber(String i) {
        int vcount = 1;
        SetWaitTime(1000);
        List<WebElement> cols = (Threadmanager.getdriver()).findElements(By.xpath("//th"));
        for (WebElement col : cols) {
            setFocusToElement(By.xpath("(//th)[" + vcount + "]"));
            String val = col.getText();
            System.out.println(vcount + "===" + val);
            if (val.contentEquals(i)) {
                return vcount;

            }
            vcount++;
        }

        return vcount;
    }

    public static void verifyTableListWithColName(String data, int row, String colname) {

        try {
            int columnNumber = getcolumnNumber(colname);

            SetWaitTime(1000);
            boolean flag1 = false;
            JavascriptExecutor js = (JavascriptExecutor) (Threadmanager.getdriver());
            WebElement element = (Threadmanager.getdriver())
                    .findElement(By.xpath("//table//tbody//tr[" + row + "]//td[" + columnNumber + "]"));
            new WebDriverWait((Threadmanager.getdriver()), Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfAllElements(element));
            setFocusToElement(By.xpath("//table//tbody//tr[ " + row + " ]//td[" + columnNumber + "]"));
            String cellData = element.getText();
            if (cellData.contentEquals(data)) {
                setFocusToElement(By.xpath("//table//tbody//tr[" + row + "]//td[" + columnNumber + "]"));
                js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
                        (Threadmanager.getdriver()).findElement(By.xpath("//table//tbody//tr[" + row + "]//td[" + columnNumber + "]")));

                flag1 = true;
                System.out.println("*******************************");
                System.out.println(flag1);
                System.out.println("*******************************");
            }
            if (flag1 == false) {
                Assert.fail("unable to verify table content :" + cellData);
            }

        } catch (Exception Ex) {
            Ex.printStackTrace();
            Assert.fail("unable to verify table content " + Ex.getMessage());
        }

    }

    public static void hardRefresh() {
        (Threadmanager.getdriver()).navigate().refresh();

    }

    public static void pressF5() {
        (Threadmanager.getdriver()).navigate().refresh();
    }

    public static WebElement findElement(By locator) {
        return new WebDriverWait((Threadmanager.getdriver()), Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void sliderDownToEnd(By xpath, int iterator) {

        WebElement Slider = findElement(xpath);

        for (int i = 1; i <= iterator; i++) {
            Actions move = new Actions((Threadmanager.getdriver()));
            Action action = (Action) move.dragAndDropBy(Slider, 30, 0).build();
            ((Actions) action).perform();
        }
    }

    public static void scrollDownFilter(int iterator) {
        for (int i = 1; i <= iterator; i++) {
            (Threadmanager.getdriver()).findElement(By.xpath("//div[@class='filter-section']")).sendKeys(Keys.ARROW_DOWN);
        }
    }



    /*
     * public static void verifyTableListWithCustomeFields(String quantity, int i,
     * String colname) {
     *
     * try { int columnNumber = getcolumnNumber(colname); WebDriverWait tempWait =
     * new WebDriverWait((Threadmanager.getdriver()), 10); SetWaitTime(1000); boolean flag1 = false;
     * JavascriptExecutor js = (JavascriptExecutor) (Threadmanager.getdriver()); WebElement element =
     * (Threadmanager.getdriver()).findElement(By.xpath("//table//tbody//tr[" + row + "]//td[" +
     * columnNumber + "]"));
     * new WebDriverWait((Threadmanager.getdriver()), Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfAllElements(element));
     * setFocusToElement(By.xpath("//table//tbody//tr[ "+ row +" ]//td["+
     * columnNumber + "]")); String cellData = element.getText(); if
     * (cellData.contentEquals(data)) {
     * setFocusToElement(By.xpath("//table//tbody//tr[" + row + "]//td[" +
     * columnNumber + "]")); js.executeScript(
     * "arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');"
     * , (Threadmanager.getdriver()).findElement(By.xpath("//table//tbody//tr[" + row + "]//td[" +
     * columnNumber + "]")));
     *
     * flag1 = true; System.out.println("*******************************");
     * System.out.println(flag1);
     * System.out.println("*******************************"); } if (flag1 == false)
     * { Assert.fail("unable to verify table content :" + cellData); }
     *
     * } catch (Exception Ex) { Ex.printStackTrace();
     * Assert.fail("unable to verify table content " + Ex.getMessage()); }
     *
     * }
     */
}
