package demoqa.module_import;

import demoqa.helper.*;
import demoqa.pages.*;
import lombok.Getter;

@Getter
public class DemoqaPages {

    public TextBoxPage textBoxPage;
    public ButtonsPage buttonsPage;
    public AlertPage alertPage;
    public SelectMenuPage selectMenuPage;
    public MultiSelectPage multiSelectPage;
    public FramesPage framesPage;
    public BrowserWindowsPage browserWindowsPage;
    public MenuPage menuPages;
    public WebTablesPage webTablesPage;
    public CheckBoxPage checkBoxPage;
    public AmazonPage amazonPage;


    public AmazonPage getAmazonPage() {
        return amazonPage;
    }

    public DemoqaPages() {

        textBoxPage = new TextBoxPage();
        buttonsPage = new ButtonsPage();
        browserWindowsPage = new BrowserWindowsPage();
        alertPage = new AlertPage();
        selectMenuPage = new SelectMenuPage();
        multiSelectPage = new MultiSelectPage();
        framesPage = new FramesPage();
        menuPages = new MenuPage();
        webTablesPage = new WebTablesPage();
        checkBoxPage = new CheckBoxPage();
        amazonPage = new AmazonPage();



    }

    public AlertPage getAlertPage() {
        return alertPage;
    }

    public BrowserWindowsPage getBrowserWindowsPage() {
        return browserWindowsPage;
    }

    public ButtonsPage getButtonsPage() {
        return buttonsPage;
    }

    public FramesPage getFramesPage() {
        return framesPage;
    }

    public MultiSelectPage getMultiSelectPage() {
        return multiSelectPage;
    }

    public SelectMenuPage getSelectMenuPage() {
        return selectMenuPage;
    }

    public TextBoxPage getTextBoxPage() {
        return textBoxPage;
    }

    public MenuPage getMenuPages() {
        return menuPages;
    }

    public WebTablesPage getWebTablesPage() {
        return webTablesPage;
    }

    public CheckBoxPage getCheckBoxPage() {
        return checkBoxPage;
    }
}