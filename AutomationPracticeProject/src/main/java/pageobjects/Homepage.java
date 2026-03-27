package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

    WebDriver driver;
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

}
