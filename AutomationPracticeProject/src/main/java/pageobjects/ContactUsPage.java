package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ConfigPropertyReader;

public class ContactUsPage {

    public WebDriver driver;
    public String name;
    public String email;
    public String subject;
    public String message;
    public String getInTouchUploadFile;
    public String alertAcceptSuccessMessage;

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getGetInTouchIsVisibleText(){

        return driver.findElement(By.xpath("//div[@class='contact-form']//child::h2")).getText();
    }

    public void userEntersTheName(){
        name = ConfigPropertyReader.getConfigPropertyValues("name");
        driver.findElement(By.xpath("//input[@data-qa='name']")).sendKeys(name);
    }
    public void userEntersTheEmail(){
        email = ConfigPropertyReader.getConfigPropertyValues("validEmail");
        driver.findElement(By.xpath("//input[@data-qa='email']")).sendKeys(email);
    }

    public void userEntersTheSubject(){
        subject = ConfigPropertyReader.getConfigPropertyValues("getInTouchSubject");
        driver.findElement(By.xpath("//input[@data-qa='subject']")).sendKeys(subject);
    }

    public void userEntersTheMessage(){

        message = ConfigPropertyReader.getConfigPropertyValues("getInTouchMessage");
        driver.findElement(By.xpath("//textarea[@data-qa='message']")).sendKeys(message);
    }

    public void userUploadsTheFile(){

        getInTouchUploadFile =  ConfigPropertyReader.getConfigPropertyValues("getInTouchUploadFile");
        driver.findElement(By.xpath("//input[@name='upload_file']")).sendKeys(getInTouchUploadFile);
    }

    public void userClicksTheSubmitButton(){
        driver.findElement(By.xpath("//input[@data-qa='submit-button']")).click();
    }

    public void userClicksTheOkButtonInAlert(){

        driver.switchTo().alert().accept();

    }

    public String userReadsTheSuccessMessageAfterTheAlertAccept(){

       alertAcceptSuccessMessage = driver.findElement(By.xpath("//div[@class='status alert alert-success']")).getText();
       return alertAcceptSuccessMessage;
    }

    public void userClicksTheHomeButton(){
        driver.findElement(By.xpath("//div[@id='form-section']//descendant::a")).click();
    }


}
