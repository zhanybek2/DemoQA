package demoqa_tests;

import demoqa.data.MockDataRegistrationForm;
import org.testng.annotations.Test;

public class WebtablesTest extends BaseTest {

    @Test
    void testWebTables() throws InterruptedException {
        helper.getBrowserManager().openUrl("https://demoqa.com/webtables");
        helper.webElementActions.scrollToElement(demoqaPages.getWebTablesPage().addButton);
        demoqaPages.getWebTablesPage().addButton.click();
        Thread.sleep(5000);
        demoqaPages.webTablesPage.fillWebTablesForm(MockDataRegistrationForm.randomRegistration());
        Thread.sleep(5000);
        demoqaPages.webTablesPage.submit();
   }
    }



