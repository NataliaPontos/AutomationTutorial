package tests;

import helpMethods.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.IndexPage;
import pages.WebTablesPage;
import sharedData.SharedData;

import java.util.List;

public class WebTableTest extends SharedData {


    @Test
    public void metodaTest() {
        IndexPage indexPage = new IndexPage(driver);
        indexPage.enterOnWebTableMenu();
        indexPage.enterOnWebTableSubMenu();

        WebTablesPage webTablesPage = new WebTablesPage(driver);
        webTablesPage.verifyTableContent(3);

        webTablesPage.addNewRecordButtonClick();

        String firstNameValue = "Pontos";
        String lastNameValue = "Natalia";
        String userEmailValue = "user.test@yahoo.com";
        String ageValue = "23";
        String salaryValue = "5400";
        String departmentValue = "QA";
        int expectedSize = 4;

        webTablesPage.fillFirstName(firstNameValue);
        webTablesPage.filllastName(lastNameValue);
        webTablesPage.fillEmail(userEmailValue);
        webTablesPage.fillAge(ageValue);
        webTablesPage.fillSalary(salaryValue);
        webTablesPage.fillDepartment(departmentValue);
        webTablesPage.submitClick();

        webTablesPage.verifyTableContent(expectedSize, firstNameValue, lastNameValue, userEmailValue, ageValue, salaryValue, departmentValue);

        webTablesPage.editClick();
        String editFirstNAmeElementValue = "Ionescu";
        String editLastNAmeElementValue = "Aira";
        String editUserEmailElementValue = "modificare@gmail.com";
        String editAgeElementValue = "25";
        String editSalaryElementValue = "6000";
        String editDepartmentElementValue = "Automation";
        int expectedSizeEdit = 4;

        webTablesPage.verifyTableContent(expectedSizeEdit);
        webTablesPage.fillFirstName(editFirstNAmeElementValue);
        webTablesPage.filllastName(editLastNAmeElementValue);
        webTablesPage.fillEmail(editUserEmailElementValue);
        webTablesPage.fillAge(editAgeElementValue);
        webTablesPage.fillSalary(editSalaryElementValue);
        webTablesPage.fillDepartment(editDepartmentElementValue);
        webTablesPage.submitClick();

        webTablesPage.deleteRecords();
        webTablesPage.verifyTableContent(3);



//        By tableRowsListElement = By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -even' or @class='rt-tr -odd']");
//        List<WebElement> tableRowsList = driver.findElements(tableRowsListElement);
//        Assert.assertEquals(tableRowsList.size(), 3, "Valoarea initiala a tabelului nu este 3.");
//
//        //identificm un element
//        By addElement = By.id("addNewRecordButton");
//        elementHelper.clickLocator(addElement);
//
//        By firstNameElement = By.id("firstName");
//        String firstNameValue = "Pontos";
//        elementHelper.fillLocator(firstNameElement, firstNameValue);
//
//        By lastNameElement = By.id("lastName");
//        String lastNameValue = "Natalia";
//        elementHelper.fillLocator(lastNameElement, lastNameValue);
//
//        By userEmailElement = By.id("userEmail");
//        String userEmailValue = "user.test@yahoo.com";
//        elementHelper.fillLocator(userEmailElement, userEmailValue);
//
//
//        By ageElement = By.id("age");
//        String ageValue = "23";
//        elementHelper.fillLocator(ageElement, ageValue);
//
//        By salaryElement = By.id("salary");
//        String salaryValue = "5400";
//        elementHelper.fillLocator(salaryElement, salaryValue);
//
//        By departmentElement = By.id("department");
//        String departmentValue = "QA";
//        elementHelper.fillLocator(departmentElement, departmentValue);
//
//        By submitElement = By.id("submit");
//        elementHelper.clickLocator(submitElement);
//
//        tableRowsList = driver.findElements(tableRowsListElement);
//        Assert.assertEquals(tableRowsList.size(), 4, "Valoarea actuala a tabelului nu este 4.");
//        String expectedRow = tableRowsList.get(3).getText();
//        Assert.assertTrue(expectedRow.contains(firstNameValue));
//        Assert.assertTrue(expectedRow.contains(lastNameValue));
//        Assert.assertTrue(expectedRow.contains(ageValue));
//        Assert.assertTrue(expectedRow.contains(userEmailValue));
//        Assert.assertTrue(expectedRow.contains(salaryValue));
//        Assert.assertTrue(expectedRow.contains(departmentValue));
//
//
//        //edit functionality
//
//        By editElement = By.id("edit-record-4");
//        elementHelper.clickLocator(editElement);
//
//        By editFirstNameElement = By.id("firstName");
//        String editFirstNAmeElementValue = "Ionescu";
//        elementHelper.clearFilledLocator(editFirstNameElement, editFirstNAmeElementValue);
//
//        By editLastNameElement = By.id("lastName");
//        String editLastNAmeElementValue = "Aira";
//        elementHelper.clearFilledLocator(editLastNameElement, editLastNAmeElementValue);
//
//        By editUserEmailElement = By.id("userEmail");
//        String editUserEmailElementValue = "modificare@gmail.com";
//        elementHelper.clearFilledLocator(editUserEmailElement, editUserEmailElementValue);
//
//        By editAgeElement = By.id("age");
//        String editAgeElementValue = "25";
//        elementHelper.clearFilledLocator(editAgeElement, editAgeElementValue);
//
//        By editSalaryElement = By.id("salary");
//        String editSalaryElementValue = "6000";
//        elementHelper.clearFilledLocator(editSalaryElement, editSalaryElementValue);
//
//        By editDepartmentElement = By.id("department");
//        String editDepartmentElementValue = "Automation";
//        elementHelper.clearFilledLocator(editDepartmentElement, editDepartmentElementValue);
//
//        By submitEditedElement = By.id("submit");
//        elementHelper.clickLocator(submitEditedElement);
//
//        tableRowsList = driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -even' or @class='rt-tr -odd']"));
//        Assert.assertEquals(tableRowsList.size(), 4, "Valoarea actuala a tabelului nu este 4.");
//        expectedRow = tableRowsList.get(3).getText();
//        Assert.assertTrue(expectedRow.contains(editFirstNAmeElementValue));
//        Assert.assertTrue(expectedRow.contains(editLastNAmeElementValue));
//        Assert.assertTrue(expectedRow.contains(editAgeElementValue));
//        Assert.assertTrue(expectedRow.contains(editUserEmailElementValue));
//        Assert.assertTrue(expectedRow.contains(editSalaryElementValue));
//        Assert.assertTrue(expectedRow.contains(editDepartmentElementValue));
//
//        By deleteElement=By.id("delete-record-4");
//        elementHelper.clickLocator(deleteElement);
//
//        tableRowsList = driver.findElements(tableRowsListElement);
//        Assert.assertEquals(tableRowsList.size(), 3, "Valoarea actuala a tabelului nu este 4.");


    }
}
