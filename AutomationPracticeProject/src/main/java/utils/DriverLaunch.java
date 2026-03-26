package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;

public class DriverLaunch {

    public WebDriver driver;
    public WebDriver getDriverLaunch(){

        String browser = ConfigPropertyReader.getConfigPropertyValues("browser");
        String testEnvironment = ConfigPropertyReader.getConfigPropertyValues("testEnvironment");

        if(driver == null) {
            switch (browser.toLowerCase()) {
                case "chrome":
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.get(testEnvironment);
                    break;

                case "firefox":
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.get(testEnvironment);
                    break;

                case "ie":
                    driver = new InternetExplorerDriver();
                    driver.manage().window().maximize();
                    driver.get(testEnvironment);
                    break;

                default:
                    throw new IllegalArgumentException("Invalid browser");
            }
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver;

    }
}
