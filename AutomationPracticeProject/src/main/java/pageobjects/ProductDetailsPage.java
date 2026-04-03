package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage {

    WebDriver driver;
    String productPageDetailsTitle;
    public ProductDetailsPage(WebDriver driver) {
        this.driver = driver;
    }
    public String userVerifyTheProductDetailsPageTitle(){
        productPageDetailsTitle = driver.getTitle();
        return productPageDetailsTitle;
    }
    public void userIncreaseTheQuantity(int quantity){
        driver.findElement(By.id("quantity")).clear();
        driver.findElement(By.id("quantity")).sendKeys(Integer.toString(quantity));
    }
    public void userClicksTheAddToCartButton(){
        driver.findElement(By.xpath("//div[@class='product-information']//descendant::button")).click();
    }
    public void userClicksTheViewCartButton() {
        driver.findElement(By.xpath("//u[text()='View Cart']")).click();
    }
    public String userVerifyTheAddedQuantity(){
        return driver.findElement(By.xpath("//table[@id='cart_info_table']//descendant::button")).getText();
    }
}
