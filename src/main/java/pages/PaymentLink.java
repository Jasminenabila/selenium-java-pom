package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentLink {

    protected WebDriver driver;
    private By buttonAddPayment = By.id("newPaymentLink");
    private By SinglePayment = By.id("singlePayment");

    public PaymentLink(WebDriver driver) {
        this.driver = driver;
    }

   public void clickAddPaymentLink(){
        driver.findElement(buttonAddPayment).click();
   }

   public void clickSinglePaymentLink(){
       driver.findElement(SinglePayment).click();
   }
}
