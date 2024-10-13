package demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxPage  extends BasePage{
      @FindBy (xpath = "//button[@aria-label='Toggle']")
      public WebElement button;

      @FindBy(xpath = "(//button[@class='rct-collapse rct-collapse-btn'])[2]")
      public WebElement desktop;





}
