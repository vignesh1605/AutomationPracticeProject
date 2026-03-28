package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ConfigPropertyReader;

public class CartPage {

    public WebDriver driver;
    String subscriptionEmail;

    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public boolean userVerifyTheSubscriptionText(){
        return driver.findElement(By.xpath("//footer[@id='footer']//descendant::h2[text()='Subscription']")).isDisplayed();
    }
    public void userEntersTheSubscriptionEmailAdress(){
        subscriptionEmail = ConfigPropertyReader.getConfigPropertyValues("validEmail");
        driver.findElement(By.id("susbscribe_email")).clear();
        driver.findElement(By.id("susbscribe_email")).sendKeys(subscriptionEmail);
    }
    public void userClicksTheSubscriptionArrowButton(){
        driver.findElement(By.id("subscribe")).click();
    }
    public boolean userVerifyTheSubscriptionSuccessMessageIsVisible(){
        return driver.findElement(By.id("success-subscribe")).isDisplayed();
    }

}
