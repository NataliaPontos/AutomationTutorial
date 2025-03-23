package pages;

import helpMethods.AlertHelper;
import helpMethods.ElementHelper;
import org.openqa.selenium.WebDriver;
import pageLocators.AlertLocators;

public class AlertPage {
    private WebDriver driver;
    private ElementHelper elementHelper;
    private AlertHelper alertHelper;

    public AlertPage(WebDriver driver){
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
        alertHelper = new AlertHelper(driver);

    }
    public void interactWithAcceptAlert(){
        elementHelper.clickLocator(AlertLocators.alertOKElement);
        alertHelper.acceptAlert();
        
    }
    public void interactWithTimerAlert(){
        elementHelper.clickJSLocator(AlertLocators.timerAlertElement);
        alertHelper.acceptAlert();
    }

    public void interactWithCancelAlert(){
        elementHelper.clickLocator(AlertLocators.confirmElement);
        alertHelper.cancelAlert();
    }

    public void interactWithPromtAlert(String value){
        elementHelper.clickJSLocator(AlertLocators.promtElement);
        alertHelper.fillAlert(value);
    }
}
