package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ConfigPropertyReader;

public class Homepage {

    WebDriver driver;
    String subscriptionEmail;
    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHomePageTitle(){

        return driver.getTitle();
    }
    public void clickonSignupButton(){

        driver.findElement(By.xpath("//div[@class='shop-menu pull-right']//descendant::a[4]")).click();
    }

    public void clickOnContactUsButton(){

        driver.findElement(By.xpath("//div[@class='shop-menu pull-right']//descendant::a[text()=' Contact us']")).click();
    }

    public void clickOnTestCasesButton(){
        driver.findElement(By.xpath("//div[@class='shop-menu pull-right']//descendant::a[text()=' Test Cases']")).click();
    }

    public boolean getTestCasesPageIsVisible(){

        return driver.findElement(By.xpath("//div[@class='container']//descendant::span")).isDisplayed();

    }

    public void userClicksTheProductsButton(){

        driver.findElement(By.xpath("//div[@class='shop-menu pull-right']//descendant::a[text()=' Products']")).click();
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
    public void userClicksTheCartButton(){
        driver.findElement(By.xpath("//div[@class='shop-menu pull-right']//descendant::a[@href='/view_cart']")).click();
    }
    public void userClicksTheViewProductButton(){
        driver.findElement(By.xpath("//a[@href='/product_details/1']")).click();
    }
    public String userVerifyTheCategoryIsVisible(){
        return driver.findElement(By.xpath("//div[@class='left-sidebar']//descendant::h2")).getText();
    }
    public void userClicksTheProductCategoryMenuButton(){
        driver.findElement(By.xpath("//div[@id='accordian']//descendant::a[@href='#Women']")).click();
    }
    public void userClickOnTopsCategoryLinkUnderWomenCategory(){
        driver.findElement(By.xpath("//div[@id='Women']//descendant::a[text()='Tops ']")).click();
    }
    public String userVerifyThatCategoryPageIsDisplayedAndConfirmTextWOMENTOPSPRODUCTS(){
        return driver.findElement(By.xpath("//div[@class='features_items']//child::h2")).getText();
    }
    public void userClicksOnAnySubCategoryLinkOfCategory(){
        driver.findElement(By.xpath("//div[@class='brands-name']//descendant::a[text()='Biba']")).click();
    }
    public String verifyThatUserIsNavigatedToThatCategoryPage(){
        return driver.findElement(By.xpath("//div[@class='features_items']//child::h2[@class='title text-center']")).getText();
    }
}
