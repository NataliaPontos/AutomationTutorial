package tests;

import helpMethods.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import sharedData.SharedData;

import java.time.Duration;

public class FrameTest extends SharedData {


    @Test

    public void metodaTest() {
        ElementHelper elementHelper = new ElementHelper(driver);

        By framesMenu = By.xpath("//h5[text()='Alerts, Frame & Windows']");
        elementHelper.clickLocator(framesMenu);

        By framesSubMenu = By.xpath("//span[text()='Frames']");
        elementHelper.clickJSLocator(framesMenu);

        driver.switchTo().frame("frame1");

        WebElement textElement = driver.findElement(By.id("sampleHeading"));
        System.out.println(textElement.getText());

        driver.switchTo().parentFrame();

        driver.switchTo().frame("frame2");

        WebElement textElement2 = driver.findElement(By.id("sampleHeading"));
        System.out.println(textElement2.getText());
    }
}
