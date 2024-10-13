package demoqa.pages;

import demoqa.drivers.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeFormPage {
    public PracticeFormPage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "userEmail")
    public WebElement userEmail;

    @FindBy(id = "gender-radio-1")
    public WebElement male;

    @FindBy(id = "gender-radio-2")
    public WebElement female;

    @FindBy(id = "gender-radio-3")
    public WebElement other;

    @FindBy(id = "userNumber" )
    public WebElement userNumber;

    @FindBy(id="dateOfBirthInput")
    public WebElement dateOfBirth;

    @FindBy(id = "subjectsInput")
    public WebElement subjectsInput;

    @FindBy(css="label[for='hobbies-checkbox-1']")
    public WebElement sport;

    @FindBy(id="hobbies-checkbox-2")
    public WebElement reading;

    @FindBy(id="hobbies-checkbox-3")
    public WebElement music;

    @FindBy(id="uploadPicture")
    public WebElement uploadPicture;

    @FindBy(id="currentAddress")
    public WebElement currentAddress;

    @FindBy(id="react-select-3-input")
    public WebElement NCR;

    @FindBy(id="react-select-3-input")
    public WebElement city;





}

