package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.ConfigPropertyReader;

public class ProductsPage {
    private WebDriver driver;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String userGetProductsPageTitle() {
        return driver.getTitle();
    }

    public boolean userGetProductsListVisible() {
        return driver.findElement(By.xpath("//div[@class='brands-name']//descendant::li")).isDisplayed();
    }

    public void userClicksTheViewProductForTheFirstProduct(int productId) {
        driver.findElement(By.xpath("//a[@href='/product_details/" + productId + "']")).click();
    }

    public String userGetTheCurrentUrlForSelectedProduct() {

        return driver.getCurrentUrl();
    }

    public boolean userChecksTheProductNameIsAvailable() {
        return driver.findElement(By.xpath("//div[@class='product-information']//child::h2")).isDisplayed();
    }

    public boolean userChecksTheProductCategoryIsAvailable() {
        return driver.findElement(By.xpath("//div[@class='product-information']//child::p[contains(text(),'Category')]")).isDisplayed();
    }

    public boolean userChecksTheProductPriceIsAvailable() {
        return driver.findElement(By.xpath("//div[@class='product-information']//child::span[contains(text(),'Rs.')]")).isDisplayed();
    }

    public boolean userChecksTheProductAvailabilityIsAvailable() {
        return driver.findElement(By.xpath("//div[@class='product-information']//child::b[contains(text(),'Availability')]")).isDisplayed();
    }

    public boolean userChecksTheProductConditionIsAvailable() {
        return driver.findElement(By.xpath("//div[@class='product-information']//child::b[contains(text(),'Condition:')]")).isDisplayed();
    }

    public boolean userChecksTheProductBrandIsAvailable() {
        return driver.findElement(By.xpath("//div[@class='product-information']//child::b[contains(text(),'Brand:')]")).isDisplayed();
    }

    public void userEnterTheProductName() {
        String productName = ConfigPropertyReader.getConfigPropertyValues("productName");
        driver.findElement(By.id("search_product")).sendKeys(productName);
    }

    public void userClickTheSearchButton() {
        driver.findElement(By.id("submit_search")).click();
    }

    public boolean userGetSearchedProductsText() {
        return driver.findElement(By.xpath("//h2[@class='title text-center']")).isDisplayed();
    }
    public void userHoverTheFirstProductAndClickAddToCart() {
        WebElement firstProduct = driver.findElement(By.xpath("//div[@class='single-products']//descendant::a[@data-product-id=1]"));
        Actions clickAndHoverProduct = new Actions(driver);
        clickAndHoverProduct.clickAndHold(firstProduct).build().perform();
        driver.findElement(By.xpath("//div[@class='productinfo text-center']//child::a[@data-product-id=1]")).click();
    }
    public void userClickContinueShoppingButton() {
        driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
    }
    public void userHoverTheSecondProductAndClickAddToCart() {
        WebElement firstProduct = driver.findElement(By.xpath("//div[@class='single-products']//descendant::a[@data-product-id=2]"));
        Actions clickAndHoverProduct = new Actions(driver);
        clickAndHoverProduct.clickAndHold(firstProduct).build().perform();
        driver.findElement(By.xpath("//div[@class='productinfo text-center']//child::a[@data-product-id=2]")).click();
    }
    public void userclicksTheViewCartButton() {
        driver.findElement(By.xpath("//u[text()='View Cart']")).click();
    }
    public boolean userVerifyTheBothProductsAreAddedToCart() {
        boolean flag = false;
        int productCount = 0;

        try {
            productCount = driver.findElements(By.xpath("//table[@id='cart_info_table']//child::tbody//child::tr")).size();
        } catch (NoSuchElementException e) {
            flag = false;
        }
        if (productCount == 2) {
            flag = true;
        }
        return flag;
    }
    public boolean userVerifyTheirPricesQuantityAndTotalPrice(){

        boolean flag = false;
        int productCount = 0;
        int price = 0;
        int quantity = 0;
        int totalPrice = 0;

        try {
            productCount = driver.findElements(By.xpath("//table[@id='cart_info_table']//child::tbody//child::tr")).size();
            for (int i=0; i<productCount; i++){
                price= Integer.parseInt(driver.findElements(By.xpath("//table[@id='cart_info_table']//child::tbody//descendant::td[@class='cart_price']")).get(i).getText().substring(4));
                quantity= Integer.parseInt(driver.findElements(By.xpath("//table[@id='cart_info_table']//child::tbody//descendant::td[@class='cart_quantity']")).get(i).getText());
                totalPrice= Integer.parseInt(driver.findElements(By.xpath("//table[@id='cart_info_table']//child::tbody//descendant::td[@class='cart_total']")).get(i).getText().substring(4));

                if(price*quantity==totalPrice){
                    flag = true;
                }
                else {
                    return false;
                }
            }

        } catch (NoSuchElementException e) {
            flag = false;
        }
        return flag;

    }

}
