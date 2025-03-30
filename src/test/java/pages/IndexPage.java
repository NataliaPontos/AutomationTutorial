package pages;

import helpMethods.ElementHelper;
import loggerUtility.LoggerUtility;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pageLocators.IndexLocators;

public class IndexPage {
    private WebDriver driver;
    private ElementHelper elementHelper;

    public IndexPage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }

    public void enterOnAlertFrameWindowMenu() {

        elementHelper.clickLocator(IndexLocators.alertFrameWindowsMenu);
        LoggerUtility.infoTest("The user clicks on Alert Frame Window Menu");
    }

    public void enterOnAlertSubMEnu() {
        elementHelper.clickJSLocator(IndexLocators.alertsSubMenu);
        LoggerUtility.infoTest("The user clicks on Alerts SubMenu");
    }

    public void enterOnBrowserWindowSubmenu() {

        elementHelper.clickLocator(IndexLocators.browserSubMenu);
        LoggerUtility.infoTest("The user clicks on Browser SubMenu");
    }

    public void enterOnFrameSubmenu() {
        elementHelper.clickLocator(IndexLocators.framesSubMenu);
        LoggerUtility.infoTest("The user clicks on Frame SubMenu");
    }

    public void enterOnFormsMenu() {
        elementHelper.clickLocator(IndexLocators.formsMenu);
        LoggerUtility.infoTest("The user clicks on Forms Menu");
    }

    public void enterOnPracticeFormSubMenu() {
        elementHelper.clickLocator(IndexLocators.practiceFormSubMenu);
        LoggerUtility.infoTest("The user clicks on Practice Form SubMenu");
    }

    public void enterOnWebTableMenu() {
        elementHelper.clickLocator(IndexLocators.elmenentsMenu);
        LoggerUtility.infoTest("The user clicks on Web Table Menu");
    }

    public void enterOnWebTableSubMenu() {
        elementHelper.clickLocator(IndexLocators.webTableSubMenu);
        LoggerUtility.infoTest("The user clicks on Web Table SubMenu");
    }
}
