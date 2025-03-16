package tests;

import helpMethods.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import sharedData.SharedData;

import java.util.List;

public class WebTableTest extends SharedData {


    @Test
    public void metodaTest() {
        ElementHelper elementHelper = new ElementHelper(driver);

        By elmenentsMenu = By.xpath("//h5[text()='Elements']");
        elementHelper.clickLocator(elmenentsMenu);

        By webTableSubMenu = By.xpath("//span[text()='Web Tables']");
        elementHelper.clickLocator(webTableSubMenu);

        By tableRowsListElement = By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -even' or @class='rt-tr -odd']");
        List<WebElement> tableRowsList = driver.findElements(tableRowsListElement);
        Assert.assertEquals(tableRowsList.size(), 3, "Valoarea initiala a tabelului nu este 3.");

        //identificm un element
        By addElement = By.id("addNewRecordButton");
        elementHelper.clickLocator(addElement);

        By firstNameElement = By.id("firstName");
        String firstNameValue = "Pontos";
        elementHelper.fillLocator(firstNameElement, firstNameValue);

        By lastNameElement = By.id("lastName");
        String lastNameValue = "Natalia";
        elementHelper.fillLocator(lastNameElement, lastNameValue);

        By userEmailElement = By.id("userEmail");
        String userEmailValue = "user.test@yahoo.com";
        elementHelper.fillLocator(userEmailElement, userEmailValue);


        By ageElement = By.id("age");
        String ageValue = "23";
        elementHelper.fillLocator(ageElement, ageValue);

        By salaryElement = By.id("salary");
        String salaryValue = "5400";
        elementHelper.fillLocator(salaryElement, salaryValue);

        By departmentElement = By.id("department");
        String departmentValue = "QA";
        elementHelper.fillLocator(departmentElement, departmentValue);

        By submitElement = By.id("submit");
        elementHelper.clickLocator(submitElement);

        tableRowsList = driver.findElements(tableRowsListElement);
        Assert.assertEquals(tableRowsList.size(), 4, "Valoarea actuala a tabelului nu este 4.");
        String expectedRow = tableRowsList.get(3).getText();
        Assert.assertTrue(expectedRow.contains(firstNameValue));
        Assert.assertTrue(expectedRow.contains(lastNameValue));
        Assert.assertTrue(expectedRow.contains(ageValue));
        Assert.assertTrue(expectedRow.contains(userEmailValue));
        Assert.assertTrue(expectedRow.contains(salaryValue));
        Assert.assertTrue(expectedRow.contains(departmentValue));


        //edit functionality

        By editElement = By.id("edit-record-4");
        elementHelper.clickLocator(editElement);

        By editFirstNameElement = By.id("firstName");
        String editFirstNAmeElementValue = "Ionescu";
        elementHelper.clearFilledLocator(editFirstNameElement, editFirstNAmeElementValue);

        By editLastNameElement = By.id("lastName");
        String editLastNAmeElementValue = "Aira";
        elementHelper.clearFilledLocator(editLastNameElement, editLastNAmeElementValue);

        By editUserEmailElement = By.id("userEmail");
        String editUserEmailElementValue = "modificare@gmail.com";
        elementHelper.clearFilledLocator(editUserEmailElement, editUserEmailElementValue);

        By editAgeElement = By.id("age");
        String editAgeElementValue = "25";
        elementHelper.clearFilledLocator(editAgeElement, editAgeElementValue);

        By editSalaryElement = By.id("salary");
        String editSalaryElementValue = "6000";
        elementHelper.clearFilledLocator(editSalaryElement, editSalaryElementValue);

        By editDepartmentElement = By.id("department");
        String editDepartmentElementValue = "Automation";
        elementHelper.clearFilledLocator(editDepartmentElement, editDepartmentElementValue);

        By submitEditedElement = By.id("submit");
        elementHelper.clickLocator(submitEditedElement);

        tableRowsList = driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -even' or @class='rt-tr -odd']"));
        Assert.assertEquals(tableRowsList.size(), 4, "Valoarea actuala a tabelului nu este 4.");
        expectedRow = tableRowsList.get(3).getText();
        Assert.assertTrue(expectedRow.contains(editFirstNAmeElementValue));
        Assert.assertTrue(expectedRow.contains(editLastNAmeElementValue));
        Assert.assertTrue(expectedRow.contains(editAgeElementValue));
        Assert.assertTrue(expectedRow.contains(editUserEmailElementValue));
        Assert.assertTrue(expectedRow.contains(editSalaryElementValue));
        Assert.assertTrue(expectedRow.contains(editDepartmentElementValue));

        By deleteElement=By.id("delete-record-4");
        elementHelper.clickLocator(deleteElement);

        tableRowsList = driver.findElements(tableRowsListElement);
        Assert.assertEquals(tableRowsList.size(), 3, "Valoarea actuala a tabelului nu este 4.");


    }
}
