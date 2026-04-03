package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    public WebDriver driver;
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean verifyAddressDetailsAndReviewYourOrder(){
        boolean flag = false;
        try {
            if (    driver.findElement(By.xpath("//h3[text()='Your delivery address']")).isDisplayed() &&
                    driver.findElement(By.xpath("//h3[text()='Your billing address']")).isDisplayed() &&
                    driver.findElement(By.xpath("//h2[text()='Review Your Order']")).isDisplayed()
            ) {
                flag = true;
            } else {
                flag = false;
            }
        }
        catch (Exception e) {
            return false;
        }
        return flag;
    }

    public void userEntersTheCommentInMessage(String message){
        driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys(message);
    }
    public void userClicksThePlaceOrderButton(){
        driver.findElement(By.xpath("//a[text()='Place Order']")).click();
    }
    public void userEntersTheNameOnCard(String name){
        driver.findElement(By.xpath("//input[@name='name_on_card']")).sendKeys(name);
    }
    public void userEntersTheCardNumber(String cardNumber){
        driver.findElement(By.xpath("//input[@name='card_number']")).sendKeys(cardNumber);
    }
    public void userEntersTheCVC(String cVC){
        driver.findElement(By.xpath("//input[@name='cvc']")).sendKeys(cVC);
    }
    public void userEntersTheMonthExpiry(String monthExpiry){
        driver.findElement(By.xpath("//input[@name='expiry_month']")).sendKeys(monthExpiry);
    }
    public void userEntersTheYearExpiry(String yearExpiry){
        driver.findElement(By.xpath("//input[@name='expiry_year']")).sendKeys(yearExpiry);
    }
    public void userClicksThePayAndConfirmOrderButton(){
        driver.findElement(By.xpath("//button[@data-qa='pay-button']")).click();
    }
    public boolean userVerifyTheOrderPlacedSuccessfullyMessage(){
        boolean flag = false;
        try {
            if(driver.findElement(By.xpath("//h2[@data-qa='order-placed']//child::b[text()='Order Placed!']")).isDisplayed() &&
               driver.findElement(By.xpath("//p[text()='Congratulations! Your order has been confirmed!']")).isDisplayed()){
                flag = true;
            }
            else {
                return false;
            }
        }
        catch (Exception e){
            return false;
        }
        return flag;
    }

}
