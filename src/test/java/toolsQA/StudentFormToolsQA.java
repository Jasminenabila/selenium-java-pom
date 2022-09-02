package toolsQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.StudentFormToolsQAPage;

public class StudentFormToolsQA {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver 4");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");

        StudentFormToolsQAPage studentFormToolsQAPage = new StudentFormToolsQAPage(driver);
        System.out.println("The page is heading"+studentFormToolsQAPage.getHeading());
        studentFormToolsQAPage.enterFirstName("Lee min hoo");
        studentFormToolsQAPage.enterLastName("Novel");
        studentFormToolsQAPage.enterEmailField("lee@kr.com");
        studentFormToolsQAPage.chooseGender();
        studentFormToolsQAPage.enterNumberPhone("292010291");
        studentFormToolsQAPage.createDates();
        studentFormToolsQAPage.enterSubject("Inilah akhirnya harus kuakhiri");
        Thread.sleep(3000);
        driver.close();
    }
}
