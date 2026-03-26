package utils;

import org.openqa.selenium.WebDriver;
import pageobjects.ContactUsPage;
import pageobjects.Homepage;
import pageobjects.LoginSignupPage;

public class PageObjectManager {

    WebDriver driver;
    Homepage homepage;
    LoginSignupPage loginSignupPage;
    ContactUsPage  contactUsPage;

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
}
