package demoqa.helper;

import demoqa.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MultiSelectPage extends BasePage {
    @FindBy(id="cars")
    public WebElement cars;

}
