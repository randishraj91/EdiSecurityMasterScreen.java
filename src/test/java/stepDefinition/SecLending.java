package stepDefinition;

import baseMethods.BaseLibrary;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;

public class SecLending{

    @Given("click on add new brocker")
    public void click_on_add_new_brocker() throws Exception {
        BaseLibrary.InitializationBrowser();
        BaseLibrary.loadURL("http://44.196.7.137:3010/");
        BaseLibrary.sendKeysToWebElement(By.xpath("(//input)[1]"),"ionixx.ezra");
        BaseLibrary.sendKeysToWebElement(By.xpath("(//input)[2]"),"Testing@123456789");
        BaseLibrary.waitAndClickElement(By.xpath("//button"));
       Thread.sleep(6000);
       BaseLibrary.waitAndClickElement(By.xpath("//*[contains(text(),'Upload new file')]"));
        Thread.sleep(2000);
       BaseLibrary.clickOnTextFromDropdownList(By.xpath("//input[@id='add_Type']"),"Axos");
       Thread.sleep(3000);
       BaseLibrary.verifyAttributeValue(By.xpath("//input[@id='add_Type']"),"Axos");
        By BID = By.xpath("//input[@type='file']");
        BaseLibrary.setFocusToElement(BID);
        BaseLibrary.actionMoveAndClickByLocator(BID);
        BaseLibrary.SetWaitTime(2000);
        String path = "/src/test/resources/testFiles/NAF.pdf";
        String filePath = System.getProperty("user.dir") + path;
        BaseLibrary.uploadWithGivenFile(filePath);
        BaseLibrary.SetWaitTime(10000);
        BID = null;


    }


}