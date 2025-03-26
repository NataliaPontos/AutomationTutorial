package tests;

import helpMethods.ElementHelper;
import helpMethods.PageHelper;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.IndexPage;
import pages.PracticeFormsPage;
import sharedData.SharedData;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class PracticeFormTest extends SharedData {


    @Test

    public void metodaTest() {

        IndexPage indexPage = new IndexPage(driver);
        indexPage.enterOnFormsMenu();
        indexPage.enterOnPracticeFormSubMenu();

        String firstNameValue = "Pontos";
        String lastNameValue = "Natalia";
        String emailElementValue = "test@gmail.com";
        String genderValue = "Female";
        String mobilePhoneValue = "0753554442";
        List<String> subjects = new ArrayList<>();
        subjects.add("Maths");
        subjects.add("Arts");
        subjects.add("Biology");
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Sports");
        hobbies.add("Music");
        String pathValue = "src/test/resources/2.png";
        String currentAddressValue = "Timisoara, jud. Timis";
        String stateValue = "NCR";
        String cityValue = "Delhi";
        String expectedMessage = "Thanks for submitting the form";
        String subjectStringValue = String.join(", ", subjects);
        String hobbiesStringValue = String.join(", ", hobbies);

        PracticeFormsPage practiceFormsPage = new PracticeFormsPage(driver);
        practiceFormsPage.fillFirstName(firstNameValue);
        practiceFormsPage.fillLastName(lastNameValue);
        practiceFormsPage.fillEmailValue(emailElementValue);
        practiceFormsPage.fillGenderValue(genderValue);
        practiceFormsPage.fillMobilPhoneValue(mobilePhoneValue);
        practiceFormsPage.fillSubjects(subjects);
        practiceFormsPage.fillHobbies(hobbies);
        practiceFormsPage.pictureUpload(pathValue);
        practiceFormsPage.fillCurrentadress(currentAddressValue);
        practiceFormsPage.fillState(stateValue);
        practiceFormsPage.fillCity(cityValue);
        practiceFormsPage.submitButton();
        practiceFormsPage.validateThankYouMessage(expectedMessage);
        practiceFormsPage.validateEntireTable(firstNameValue, lastNameValue, emailElementValue, genderValue, mobilePhoneValue, subjectStringValue, hobbiesStringValue, currentAddressValue, stateValue, cityValue);

    }

}