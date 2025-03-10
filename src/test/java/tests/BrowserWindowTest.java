package tests;

import helpMethods.ElementHelper;
import helpMethods.TabWindowHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import sharedData.SharedData;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BrowserWindowTest extends SharedData {


    @Test
    public void metodaTest() {

        TabWindowHelper tabWindowHelper=new TabWindowHelper(driver);
        ElementHelper elementHelper=new ElementHelper(driver);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Inițializăm JavascriptExecutor DUPĂ inițializarea driver-ului


        By alertFrameWindowsMenu = By.xpath("//h5[text()='Alerts, Frame & Windows']");
        elementHelper.clickLocator(alertFrameWindowsMenu);

        By browserSubMenu = By.xpath("//span[text()='Browser Windows']");
        elementHelper.clickJSLocator(browserSubMenu);

        By newTabClick = By.id("tabButton");
        elementHelper.clickLocator(newTabClick);

        System.out.println(driver.getCurrentUrl());

        tabWindowHelper.switchToSpecificTabWindow(1);

        System.out.println(driver.getCurrentUrl());

        tabWindowHelper.cloaseCurrentTabWindow();

        tabWindowHelper.switchToSpecificTabWindow(0);

        By newWindowClick = By.id("windowButton");
        elementHelper.clickLocator(newWindowClick);

        tabWindowHelper.switchToSpecificTabWindow(1);

        System.out.println(driver.getCurrentUrl());

    }
}
