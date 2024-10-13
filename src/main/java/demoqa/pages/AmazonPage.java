package demoqa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonPage extends BasePage{
    @FindBy(
            xpath = "//input[@id='twotabsearchtextbox']"
    )
    public WebElement searchBar;
    @FindBy(
            xpath = "//span[@id='s-all-filters']"
    )
    public WebElement allFiltersBtn;
    @FindBy(
            xpath = "//a[contains(@class,'a-link-normal s-navigation-item')]//span[contains(@class,'a-size-base a-color-base')][normalize-space()='Apple']"
    )
    public WebElement appleBrandCheckbox;
    @FindBy(
            xpath = "//span[@class='a-size-base a-color-base'][normalize-space()='Motorola']"
    )
    public WebElement motorolaBrandCheckbox;

    public AmazonPage() {
    }

    public AmazonPage searchText(String txt) {
        this.webElementActions.click(this.searchBar);
        this.webElementActions.input(this.searchBar, txt);
        this.searchBar.sendKeys(new CharSequence[]{Keys.ENTER});
        return this;
    }

    public AmazonPage tickBrandCheckboxes(String brand, String txt) {
        this.searchText(txt);
        this.webElementActions.click(this.allFiltersBtn);
        switch (brand.toLowerCase()) {
            case "motorola":
                this.webElementActions.click(this.motorolaBrandCheckbox);
            case "apple":
                this.webElementActions.click(this.appleBrandCheckbox);
            default:
                return this;
        }
    }
}
