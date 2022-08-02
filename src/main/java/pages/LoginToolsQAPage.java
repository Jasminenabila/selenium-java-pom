package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginToolsQAPage {

    WebDriver driver;

    public LoginToolsQAPage(WebDriver driver){
        this.driver = driver;
    }

    //element locator login
    By LoginBtn = By.id("login");

    //element locator password
    By paswordField = By.id("password");

    //element locator username
    By usernameField = By.id("username");

    //method username
    public void enterUsername(String user){
        driver.findElement(usernameField).sendKeys(user);
    }

    public void enterPassword(String password){
        driver.findElement(paswordField).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(LoginBtn).click();
    }

    public void chooseGender(){

    }
}
