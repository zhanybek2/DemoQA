package demoqa_tests;

import org.testng.annotations.Test;

public class AlertTest extends BaseTest{

    @Test
    void alertTest() throws InterruptedException {
        helper.getBrowserManager().openUrl("https://demoqa.com/alerts");
        webElementActions.click(demoqaPages.getAlertPage().alertButton);
        Thread.sleep(5000);
        helper.getAlertHelper().acceptAlert();
        Thread.sleep(5000);
    }
}
