package demoqa.helper;

import demoqa.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage  extends BasePage {


    @FindBy(xpath = "//a[normalize-space()='Main Item 2']")
    public WebElement mainItem2;

    @FindBy(xpath = "//a[normalize-space()='SUB SUB LIST »']")
    public WebElement subSubList;

    @FindBy(xpath = "//a[normalize-space()='Sub Sub Item 1']")
    public WebElement subSubItem1;

    @FindBy(xpath = "//a[normalize-space()='Sub Sub Item 2']")
    public WebElement subSubItem2;

    @FindBy(xpath = "(//a[normalize-space()='Sub Item'])[contains(text(),'Sub Item')][2]")
    public WebElement SubItem2;

}
