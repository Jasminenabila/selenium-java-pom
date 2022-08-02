package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentFormToolsQAPage {

    WebDriver driver;

    public StudentFormToolsQAPage(WebDriver driver){
        this.driver = driver;
    }

    //Element locator
    By headingStudent = By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div.practice-form-wrapper > h5");
    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By emailField = By.id("userEmail");
    By radioButtonGender = By.cssSelector("#gender-radio-2");
    By userNumber = By.id("userNumber");
    By datesForm = By.id("dateOfBirthInput");
    By subjectForm = By.id("subjectsContainer");


    //Method

    public String getHeading(){
        String head = driver.findElement(headingStudent).getText();
        return head;
    }

    public void enterFirstName(String username){
        driver.findElement(firstName).sendKeys(username);
    }

    public void enterLastName(String lastname){
        driver.findElement(lastName).sendKeys(lastname);
    }

    public void enterEmailField(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void chooseGender(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(radioButtonGender));
    }

    public void enterNumberPhone(String phone){
        driver.findElement(userNumber).sendKeys(phone);
    }


    public void createDates(){
        String pattern = "dd-mm-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String dates = simpleDateFormat.format(new Date());
        System.out.println(dates);
        driver.findElement(datesForm).clear();
        driver.findElement(datesForm).sendKeys(dates);
    }

    public void enterSubject(String subject){
        driver.findElement(subjectForm).sendKeys(subject);
    }
}

