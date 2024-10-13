package demoqa.module_import;

import demoqa.helper.AlertHelper;
import demoqa.helper.BrowserManager;
import demoqa.helper.DropdownHelper;
import demoqa.helper.WebElementActions;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ImportHelpers {
    public WebDriver driver;
    public BrowserManager browserManager;
    public BrowserManager.WindowHelper windowHelper;
    public AlertHelper alertHelper;
    public DropdownHelper dropdownHelper;
    public BrowserManager.IFrameHelper iFrameHelper;
    public WebElementActions webElementActions;

    public ImportHelpers(WebDriver driver) {
        browserManager = new BrowserManager(driver);
        windowHelper = new BrowserManager.WindowHelper(driver);
        alertHelper = new AlertHelper(driver);
        iFrameHelper = new BrowserManager.IFrameHelper(driver);
        dropdownHelper = new DropdownHelper(driver);
        webElementActions = new WebElementActions();
    }

    public AlertHelper getAlertHelper() {
        return alertHelper;
    }

    public BrowserManager getBrowserManager() {
        return browserManager;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public DropdownHelper getDropdownHelper() {
        return dropdownHelper;
    }

    public BrowserManager.IFrameHelper getiFrameHelper() {
        return iFrameHelper;
    }

    public WebElementActions getWebElementActions() {
        return webElementActions;
    }

    public BrowserManager.WindowHelper getWindowHelper() {
        return windowHelper;
    }


}
