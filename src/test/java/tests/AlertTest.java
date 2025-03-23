package tests;

import helpMethods.AlertHelper;
import helpMethods.ElementHelper;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.AlertPage;
import pages.IndexPage;
import sharedData.SharedData;

import java.time.Duration;

public class AlertTest extends SharedData {


    @Test

    public void metodaTest() {
        IndexPage indexPage = new IndexPage(driver);
        indexPage.enterOnAlertFrameWindowMenu();
        indexPage.enterOnAlertSubMEnu();

        AlertPage alertPage = new AlertPage(driver);
        alertPage.interactWithAcceptAlert();
        alertPage.interactWithTimerAlert();
        alertPage.interactWithCancelAlert();
        alertPage.interactWithPromtAlert("Este doar un test");
//        ElementHelper elementHelper=new ElementHelper(driver);
//        AlertHelper alertHelper=new AlertHelper(driver);
//
//        IndexPage indexPage = new IndexPage(driver);
//        indexPage.enterOnAlertFrameWindowMenu();
//        indexPage.enterOnAlertSubMEnu();
//
//       By alertOKElement =By.id("alertButton");
//        elementHelper.clickLocator(alertOKElement);
//
//        alertHelper.acceptAlert();
//
//       By timerAlertElement = By.id("timerAlertButton");
//        elementHelper.clickLocator(timerAlertElement);
//
//        alertHelper.acceptAlert();
//
//        By confirmElement =By.id("confirmButton");
//        elementHelper.clickLocator(confirmElement);
//
//        alertHelper.cancelAlert();
//
//       By promtElement = By.id("promtButton");
//        elementHelper.clickLocator(promtElement);
//
//        alertHelper.fillAlert("Este doar un test");

    }
}
