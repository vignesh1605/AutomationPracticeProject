package utils;

import org.openqa.selenium.WebDriver;
import pageobjects.ContactUsPage;
import pageobjects.Homepage;
import pageobjects.LoginSignupPage;
import pageobjects.ProductsPage;

public class PageObjectManager {

    public WebDriver driver;
    public Homepage homepage;
    public LoginSignupPage loginSignupPage;
    public ContactUsPage  contactUsPage;
    public ProductsPage productsPage;

    public PageObjectManager(WebDriver driver) {
         this.driver = driver;
    }

    public Homepage getHomepage(){

        homepage = new Homepage(driver);
        return homepage;

    }

    public LoginSignupPage getLoginSignupPage(){

        loginSignupPage = new LoginSignupPage(driver);
        return loginSignupPage;

    }

    public ContactUsPage getContactUsPage(){
        contactUsPage = new ContactUsPage(driver);
        return contactUsPage;
    }

    public ProductsPage getProductsPage(){
        productsPage = new ProductsPage(driver);
        return productsPage;

    }
}
