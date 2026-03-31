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
    public String userVerifyTheCartPageTitle(){
        return driver.getTitle();
    }
    public void userClicksTheProceedToCheckoutButton(){
        driver.findElement(By.xpath("//section[@id='cart_items']//descendant::a[text()='Proceed To Checkout']")).click();
    }
    public void userClicksTheRegister_LoginButton(){
        driver.findElement(By.xpath("//section[@id='cart_items']//descendant::u[text()='Register / Login']")).click();
    }
    public void userClicksTheDeleteProductButton(){
        driver.findElement(By.xpath("//td[@class='cart_delete']//descendant::a[@data-product-id=1]")).click();
    }
    public boolean userVerifyTheProductDelete(){
       return driver.findElement(By.xpath("//td[@class='cart_delete']//descendant::a[@data-product-id=1]")).isDisplayed();
    }

}
