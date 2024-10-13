package demoqa_tests;

import demoqa.drivers.DriverManager;
import demoqa.helper.*;

import demoqa.module_import.DemoqaPages;
import demoqa.module_import.ImportHelpers;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public abstract class BaseTest {
    public WebDriver driver;
    public WebElementActions webElementActions;
    public ImportHelpers helper;
    public DemoqaPages demoqaPages;

    @BeforeTest(alwaysRun = true)
    public void setUp() {
        driver = DriverManager.getDriver();
        webElementActions = new WebElementActions();
        helper = new ImportHelpers(driver);
        demoqaPages = new DemoqaPages();


    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        DriverManager.closeDriver();
    }

}
