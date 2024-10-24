package demoqa_tests;

import org.testng.annotations.Test;

public class BrowserWindowsTest extends BaseTest{
    @Test
    void windowTest() throws InterruptedException {
        helper.getBrowserManager().openUrl("https://demoqa.com/browser-windows");
        for (int i = 0; i < 3; i++) {
            webElementActions.click(demoqaPages.getBrowserWindowsPage().newTab);
        }
        helper.getWindowHelper().switchToDefaultWindow();
    }
}

