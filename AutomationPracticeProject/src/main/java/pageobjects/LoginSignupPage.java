package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigPropertyReader;

import java.time.Duration;

public class LoginSignupPage {

    public WebDriver driver;
    public String name;
    public WebDriverWait wait;
    public LoginSignupPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean newUsersignupFormIsVisible(){

        boolean signUpFormStatus= driver.findElement(By.xpath("//div[@class='signup-form']")).isDisplayed();
        return signUpFormStatus;

    }

    public void userEntersTheNameAndEmail(){

        String name = ConfigPropertyReader.getConfigPropertyValues("name");
        String validEmail = ConfigPropertyReader.getConfigPropertyValues("validEmail");
        driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys(name);
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys(validEmail);
    }

    public void userClicksTheSignupButton(){

        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();

    }

    public boolean enterAccountInformationFormIsVisible(){

        boolean status = driver.findElement(By.xpath("//div[@class='login-form']//descendant::b[text()='Enter Account Information']")).isDisplayed();
        return status;
    }

    public void userEntersTheAccountInformationDetails() {

        name = ConfigPropertyReader.getConfigPropertyValues("name");
        String validPassword = ConfigPropertyReader.getConfigPropertyValues("validPassword");
        driver.findElement(By.xpath("//div[@class='radio-inline']//descendant::div[@id='uniform-id_gender1']")).click();
        driver.findElement(By.cssSelector("#name")).clear();
        driver.findElement(By.cssSelector("#name")).sendKeys(name);
        driver.findElement(By.cssSelector("#password")).clear();
        driver.findElement(By.cssSelector("#password")).sendKeys(validPassword);
        WebElement daySelect = driver.findElement(By.cssSelector("#days"));
        WebElement monthSelect = driver.findElement(By.cssSelector("#months"));
        WebElement yearSelect = driver.findElement(By.cssSelector("#years"));
        Select selectDay = new Select(daySelect);
        Select selectMonth = new Select(monthSelect);
        Select selectYear = new Select(yearSelect);
        selectDay.selectByValue("16");
        selectMonth.selectByValue("5");
        selectYear.selectByValue("1996");
    }

    public void userClicksTheSignupForOurNewsletterCheckbox() {

        driver.findElement(By.cssSelector("#newsletter")).click();
    }

    public void userClicksTheReceiveSpecialOffersFromOurPartnersCheckbox() {

        driver.findElement(By.cssSelector("#optin")).click();
    }

    public void userEntersTheAddressInformationDetails() {

        String firstName = ConfigPropertyReader.getConfigPropertyValues("firstName");
        String lastName = ConfigPropertyReader.getConfigPropertyValues("lastName");
        String company = ConfigPropertyReader.getConfigPropertyValues("company");
        String address1 = ConfigPropertyReader.getConfigPropertyValues("address1");
        String address2 = ConfigPropertyReader.getConfigPropertyValues("address2");
        WebElement countrySelect = driver.findElement(By.cssSelector("#country"));
        Select selectCountry = new Select(countrySelect);
        String state = ConfigPropertyReader.getConfigPropertyValues("state");
        String city = ConfigPropertyReader.getConfigPropertyValues("city");
        String zipcode = ConfigPropertyReader.getConfigPropertyValues("zipcode");
        String mobileNumber = ConfigPropertyReader.getConfigPropertyValues("mobileNumber");

        driver.findElement(By.cssSelector("#first_name")).sendKeys(firstName);
        driver.findElement(By.cssSelector("#last_name")).sendKeys(lastName);
        driver.findElement(By.cssSelector("#company")).sendKeys(company);
        driver.findElement(By.cssSelector("#address1")).sendKeys(address1);
        driver.findElement(By.cssSelector("#address2")).sendKeys(address2);
        selectCountry.selectByValue("India");
        driver.findElement(By.cssSelector("#state")).sendKeys(state);
        driver.findElement(By.cssSelector("#city")).sendKeys(city);
        driver.findElement(By.cssSelector("#zipcode")).sendKeys(zipcode);
        driver.findElement(By.cssSelector("#mobile_number")).sendKeys(mobileNumber);
    }

    public void userClicksTheCreateAccountButton(){

        driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();

    }

    public String userReadsTheAccountCreatedMessage(){

        String accountCreatedMessage = driver.findElement(By.xpath("//div[@class='col-sm-9 col-sm-offset-1']//descendant::p")).getText();
        return accountCreatedMessage;

    }

    public void userClicksTheContinueButton(){

        driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
    }

    public String userReadsTheLoggedInNameIsVisible(){

        return driver.findElement(By.xpath("//b")).getText();
    }

    public void userClicksTheDeleteAccountButton(){

        driver.findElement(By.xpath("//div[@class='shop-menu pull-right']//descendant::a[text()=' Delete Account']")).click();
    }

    public String userReadsTheAccountDeletedMessage(){

        String actualDeletedMessage = driver.findElement(By.xpath("//div[@class='col-sm-9 col-sm-offset-1']//descendant::p")).getText();
        return actualDeletedMessage;

    }

    public boolean verifyLoginToYourAccountIsVisible(){

        boolean loginInFormStatus= driver.findElement(By.xpath("//div[@class='login-form']")).isDisplayed();
        return loginInFormStatus;

    }

    public void userEnterTheValidEmailAddressAndValidPassword(){

        String validEmail = ConfigPropertyReader.getConfigPropertyValues("validEmail");
        String validPassword = ConfigPropertyReader.getConfigPropertyValues("validPassword");
        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys(validEmail);
        driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys(validPassword);

    }

    public void userEntertheInvalidEmailAddressAndInvalidPassword(){

        String inValidEmail = ConfigPropertyReader.getConfigPropertyValues("invalidEmail");
        String inValidPassword = ConfigPropertyReader.getConfigPropertyValues("invalidPassword");
        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys(inValidEmail);
        driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys(inValidPassword);

    }

    public void userClickOnLoginButton(){

        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
    }

    public String userReadsTheInvalidEmainOrPasswordTextIsVisible(){

        try {
            driver.findElement(By.xpath("//form[@action='/login']//child::p")).isDisplayed();
        }
        catch (NoSuchElementException e){

            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form[@action='/login']//child::p")));
        }
        return driver.findElement(By.xpath("//form[@action='/login']//child::p")).getText();

    }

    public void userClicksTheLogoutButton(){

        driver.findElement(By.xpath("//div[@class='shop-menu pull-right']//descendant::a[text()=' Logout']")).click();

    }

    public String userVerifyErrorEmailAddressAlreadyExistIsVisible(){

        try {
            driver.findElement(By.xpath("//form[@action='/login']//child::p")).isDisplayed();
        }
        catch (NoSuchElementException e){

            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form[@action='/signup']//child::p")));
        }
        return driver.findElement(By.xpath("//form[@action='/signup']//child::p")).getText();

    }


}
