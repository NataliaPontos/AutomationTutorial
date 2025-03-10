package tests;

import helpMethods.AlertHelper;
import helpMethods.ElementHelper;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import sharedData.SharedData;

import java.time.Duration;

public class AlertTest extends SharedData {


    @Test

    public void metodaTest() {
        ElementHelper elementHelper=new ElementHelper(driver);
        AlertHelper alertHelper=new AlertHelper(driver);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        By alertFrameWindowsMenu =By.xpath("//h5[text()='Alerts, Frame & Windows']");
        elementHelper.clickLocator(alertFrameWindowsMenu);

        By alertsSubMenu =By.xpath("//span[text()='Alerts']");
        elementHelper.clickJSLocator(alertsSubMenu);

       By alertOKElement =By.id("alertButton");
        elementHelper.clickLocator(alertOKElement);

        alertHelper.acceptAlert();

       By timerAlertElement = By.id("timerAlertButton");
        elementHelper.clickLocator(timerAlertElement);

        alertHelper.acceptAlert();

        By confirmElement =By.id("confirmButton");
        elementHelper.clickLocator(confirmElement);

        alertHelper.cancelAlert();

       By promtElement = By.id("promtButton");
        elementHelper.clickLocator(promtElement);

        alertHelper.fillAlert("Este doar un test");

    }
}
