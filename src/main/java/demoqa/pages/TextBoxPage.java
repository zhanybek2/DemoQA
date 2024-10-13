package demoqa.pages;

import demoqa.drivers.DriverManager;
import demoqa.entities.TextBox;
import demoqa.helper.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage extends BasePage {

    @FindBy(id = "userName")
    public WebElement userName;

    @FindBy(id = "userEmail")
    public WebElement userEmail;

    @FindBy(id = "currentAddress")
    public WebElement currentAddress;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddress;

    @FindBy(id="submit")
    public WebElement submit;

    public TextBoxPage inputUserName(String userName){
        webElementActions.input(this.userName,userName);
        return this;

    }public TextBoxPage inputUserEmail(String userEmail){
        webElementActions.input(this.userEmail,userEmail);
        return this;

    }public TextBoxPage inputCurrentAddress (String currentAddress){
        webElementActions.input(this.currentAddress,currentAddress);
        return this;

    }public TextBoxPage inputPermanentAddress (String permanentAddress){
        webElementActions.input(this.permanentAddress,permanentAddress);
        return this;

    }
    public TextBoxPage submit(){
        webElementActions.scrollToElement(this.submit).click(this.submit);
        return this;
    }
    public TextBoxPage fillTextBoxForm(TextBox textBox){
        inputUserName(textBox.getFullName())
                .inputUserEmail(textBox.getEmail())
                .inputCurrentAddress(textBox.getCurrentAddress())
                .inputPermanentAddress(textBox.getPermanentAddress())
                .submit();
        return this;
    }

}
