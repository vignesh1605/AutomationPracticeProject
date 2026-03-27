package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    private WebDriver driver;

    public ProductsPage( WebDriver driver) {
        this.driver = driver;
    }

    public String getProductsPageTitle(){
        return driver.getTitle();
    }

    public boolean getProductsListVisible(){
        return driver.findElement(By.xpath("//div[@class='brands-name']//descendant::li")).isDisplayed();
    }

    public void clickViewProductForTheFirstProduct(int productId){
        driver.findElement(By.xpath("//a[@href='/product_details/"+productId+"']")).click();
    }

    public String getCurrentUrlForSelectedProduct(){

        return driver.getCurrentUrl();
    }

    public boolean productNameIsAvailable(){
       return driver.findElement(By.xpath("//div[@class='product-information']//child::h2")).isDisplayed();
    }
    public boolean productCategoryIsAvailable(){
        return driver.findElement(By.xpath("//div[@class='product-information']//child::p[contains(text(),'Category')]")).isDisplayed();
    }
    public boolean productPriceIsAvailable(){
        return driver.findElement(By.xpath("//div[@class='product-information']//child::span[contains(text(),'Rs.')]")).isDisplayed();
    }
    public boolean productAvailabilityIsAvailable(){
        return driver.findElement(By.xpath("//div[@class='product-information']//child::b[contains(text(),'Availability')]")).isDisplayed();
    }
    public boolean productConditionIsAvailable(){
        return driver.findElement(By.xpath("//div[@class='product-information']//child::b[contains(text(),'Condition:')]")).isDisplayed();
    }
    public boolean productBrandIsAvailable(){
        return driver.findElement(By.xpath("//div[@class='product-information']//child::b[contains(text(),'Brand:')]")).isDisplayed();
    }
}
