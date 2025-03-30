package pages;

import helpMethods.ElementHelper;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.List;

import static pageLocators.PracticeFormsLocators.*;

public class PracticeFormsPage {
    private WebDriver driver;
    private ElementHelper elementHelper;

    public PracticeFormsPage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }

    public void fillFirstName(String firstNameValue) {
        elementHelper.fillLocator(firstNameElement, firstNameValue);
        LoggerUtility.infoTest("The user filled the first name field with value: " + firstNameValue);
    }

    public void fillLastName(String lastNameValue) {
        elementHelper.fillLocator(lastNameElement, lastNameValue);
        LoggerUtility.infoTest("The user filled the last name field with value: " + lastNameValue);
    }

    public void fillEmailValue(String emailElementValue) {
        elementHelper.fillLocator(emailElement, emailElementValue);
        LoggerUtility.infoTest("The user filled the email field with value: " + emailElementValue);
    }

    public void fillGenderValue(String genderValue) {
        List<WebElement> genderOptionList = driver.findElements(genderOptionElement);

        if (genderValue.equals("Male")) {
            elementHelper.clickJSLocator(genderOptionList.get(0));
        }
        if (genderValue.equals("Female")) {
            elementHelper.clickJSLocator(genderOptionList.get(1));
        }
        if (genderValue.equals("Other")) {
            elementHelper.clickJSLocator(genderOptionList.get(2));

        }
        LoggerUtility.infoTest("The user select gender");
    }

    public void fillMobilPhoneValue(String mobilePhoneValue) {
        elementHelper.fillLocator(mobilePhoneElement, mobilePhoneValue);
        LoggerUtility.infoTest("The user filled the mobile phone field with value: " + mobilePhoneValue);
    }

    public void fillSubjects(List<String> subjects) {
        elementHelper.clickJSLocator(subjectsElement);
        for (int index = 0; index < subjects.size(); index++) {
            elementHelper.fillPressLocator(subjectsElement, subjects.get(index), Keys.ENTER);
        }
    }

    public void fillHobbies(List<String> hobbies) {
        List<WebElement> hobbiesOptionList = driver.findElements(By.xpath("//div[@id='hobbiesWrapper']//label"));
        for (
                int index = 0; index < hobbiesOptionList.size(); index++) {
            String currentText = hobbiesOptionList.get(index).getText();
            if (hobbies.contains(currentText)) {
                elementHelper.clickJSLocator(hobbiesOptionList.get(index));
            }
        }
        LoggerUtility.infoTest("The user select the subjects");
    }

    public void pictureUpload(String path) {
        File file = new File(path);
        elementHelper.fillLocator(pictureElement, file.getAbsolutePath());
        LoggerUtility.infoTest("The user uploaded picture from path: " + path);
    }

    public void fillCurrentadress(String currentAddressValue) {
        elementHelper.fillLocator(currentAddressElement, currentAddressValue);
        LoggerUtility.infoTest("The user filled the current address field with value: " + currentAddressValue);
    }

    public void fillState(String stateValue) {
        elementHelper.clickJSLocator(stateElement);
        LoggerUtility.infoTest("The user clicked on state Button");
        elementHelper.fillPressLocator(stateInputElement, stateValue, Keys.ENTER);
        LoggerUtility.infoTest("The user selected state: " + stateValue);
    }

    public void fillCity(String cityValue) {
        elementHelper.clickJSLocator(cityElement);
        LoggerUtility.infoTest("The user clicked on city Button");
        elementHelper.fillPressLocator(cityInputElement, cityValue, Keys.ENTER);
        LoggerUtility.infoTest("The user selected city: " + cityValue);
    }

    public void submitButton() {
        elementHelper.clickLocator(submitButtonElement);
        LoggerUtility.infoTest("The user clicked on Submit Button");
    }

    public void validateThankYouMessage(String expectedMessage) {
        elementHelper.validateTextLocator(thankYouElement, expectedMessage);
        LoggerUtility.infoTest("The user validated the Thank You message with expected value: " + expectedMessage);
    }

    public void validateEntireTable(String firstNameValue, String lastNameValue, String emailElementValue, String genderValue, String mobilePhoneValue, String subjectStringValue, String hobbiesStringValue, String currentAddressValue, String stateValue, String cityValue) {
        List<WebElement> rowsList = driver.findElements(rowsListElement);
        elementHelper.validateTextContainsElement(rowsList.get(0), "Student Name");
        elementHelper.validateTextContainsElement(rowsList.get(0), firstNameValue);
        elementHelper.validateTextContainsElement(rowsList.get(0), lastNameValue);

        elementHelper.validateTextContainsElement(rowsList.get(1), "Student Email");
        elementHelper.validateTextContainsElement(rowsList.get(1), emailElementValue);

        elementHelper.validateTextContainsElement(rowsList.get(2), "Gender");
        elementHelper.validateTextContainsElement(rowsList.get(2), genderValue);

        elementHelper.validateTextContainsElement(rowsList.get(3), "Mobile");
        elementHelper.validateTextContainsElement(rowsList.get(3), mobilePhoneValue);


        elementHelper.validateTextContainsElement(rowsList.get(5), "Subjects");
        elementHelper.validateTextContainsElement(rowsList.get(5), subjectStringValue);

        elementHelper.validateTextContainsElement(rowsList.get(6), "Hobbies");
        elementHelper.validateTextContainsElement(rowsList.get(6), hobbiesStringValue);

        elementHelper.validateTextContainsElement(rowsList.get(7), "Picture");
        elementHelper.validateTextContainsElement(rowsList.get(7), "2.png");

        elementHelper.validateTextContainsElement(rowsList.get(8), "Address");
        elementHelper.validateTextContainsElement(rowsList.get(8), currentAddressValue);

        elementHelper.validateTextContainsElement(rowsList.get(9), "State and City");
        elementHelper.validateTextContainsElement(rowsList.get(9), stateValue);
        elementHelper.validateTextContainsElement(rowsList.get(9), cityValue);
    }


}
