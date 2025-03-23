package pages;

import helpMethods.ElementHelper;
import org.openqa.selenium.WebDriver;
import pageLocators.IndexLocators;

public class IndexPage {
    private WebDriver driver;
    private ElementHelper elementHelper;

    public IndexPage(WebDriver driver){
        this.driver = driver;
        elementHelper=new ElementHelper(driver);
    }
    public void enterOnAlertFrameWindowMenu(){
        elementHelper.clickLocator(IndexLocators.alertFrameWindowsMenu);
    }

    public void enterOnAlertSubMEnu(){
        elementHelper.clickJSLocator(IndexLocators.alertsSubMenu);
    }
}
