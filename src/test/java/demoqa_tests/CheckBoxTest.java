package demoqa_tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CheckBoxTest  extends BaseTest{

    @Test
    void testCheckBox() throws InterruptedException {
        helper.getBrowserManager().openUrl("https://demoqa.com/checkbox");
        Actions actions = new Actions(helper.getiFrameHelper().getDriver());
         Thread.sleep(4000);
        demoqaPages.getCheckBoxPage().button.click();
        Thread.sleep(4000);
        helper.webElementActions.scrollToElement(demoqaPages.getCheckBoxPage().desktop);

        demoqaPages.getCheckBoxPage().desktop.click();
        Thread.sleep(4000);



    }
}
