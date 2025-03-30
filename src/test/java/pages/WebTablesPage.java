package pages;

import helpMethods.ElementHelper;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageLocators.WebTablesLocators;

import java.util.List;

import static pageLocators.PracticeFormsLocators.firstNameElement;
import static pageLocators.PracticeFormsLocators.lastNameElement;
import static pageLocators.WebTablesLocators.*;

public class WebTablesPage {
    private WebDriver driver;
    private ElementHelper elementHelper;

    public WebTablesPage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }

    public void verifyTableContent(int expectedTablesRowListElement) {
        elementHelper.waitForElementVisible(tableRowsListElement);
        LoggerUtility.infoTest("The user verifies the table content with expected rows");
        List<WebElement> tableRowsList = driver.findElements(tableRowsListElement);
        Assert.assertEquals(tableRowsList.size(), expectedTablesRowListElement, "Valoarea initiala a tabelului nu este 3.");
    }

    public void addNewRecordButtonClick() {
        elementHelper.clickJSLocator(addElement);
        LoggerUtility.infoTest("The user clicks the Add New Record button.");

    }

    public void fillFirstName(String firstNameValue) {
        elementHelper.fillLocator(WebTablesLocators.firstNameElement, firstNameValue);
        LoggerUtility.infoTest("The user fills in First Name: " + firstNameValue);
    }

    public void filllastName(String lastNameValue) {
        elementHelper.fillLocator(WebTablesLocators.lastNameElement, lastNameValue);
        LoggerUtility.infoTest("The user fills in Last Name: " + lastNameValue);
    }

    public void fillEmail(String userEmailValue) {
        elementHelper.fillLocator(userEmailElement, userEmailValue);
        LoggerUtility.infoTest("The user fills in Email: " + userEmailValue);
    }

    public void fillAge(String ageValue) {
        elementHelper.fillLocator(ageElement, ageValue);
        LoggerUtility.infoTest("The user fills in Age: " + ageValue);
    }

    public void fillSalary(String salaryValue) {
        elementHelper.fillLocator(salaryElement, salaryValue);
        LoggerUtility.infoTest("The user fills in Salary: " + salaryValue);
    }

    public void fillDepartment(String departmentValue) {
        elementHelper.fillLocator(departmentElement, departmentValue);
        LoggerUtility.infoTest("The user fills in Department: " + departmentValue);
    }

    public void submitClick() {
        elementHelper.clickJSLocator(submitElement);
        LoggerUtility.infoTest("The user clicks the Submit button");
    }

    public void verifyTableContent(int expectedSize, String firstNameValue, String lastNameValue, String userEmailValue,
                                   String ageValue, String salaryValue, String departmentValue) {
        LoggerUtility.infoTest("The user verifies the table content with expected size: " + expectedSize);
        List<WebElement> tablesRowsList = driver.findElements(tableRowsListElement);
        Assert.assertEquals(tablesRowsList.size(), expectedSize, "Valoarea actuala a tabelului nu este 4");
        elementHelper.validateTextContainsElement(tablesRowsList.get(3), firstNameValue);
        elementHelper.validateTextContainsElement(tablesRowsList.get(3), lastNameValue);
        elementHelper.validateTextContainsElement(tablesRowsList.get(3), userEmailValue);
        elementHelper.validateTextContainsElement(tablesRowsList.get(3), ageValue);
        elementHelper.validateTextContainsElement(tablesRowsList.get(3), salaryValue);
        elementHelper.validateTextContainsElement(tablesRowsList.get(3), departmentValue);
    }

    public void deleteRecords() {
        elementHelper.clickJSLocator(deleteElement);
        LoggerUtility.infoTest("The user clicks the Delete Record button.");
    }

    public void editClick() {
        elementHelper.clickJSLocator(editElement);
        LoggerUtility.infoTest("The user clicks the Edit Record button.");
    }
}
