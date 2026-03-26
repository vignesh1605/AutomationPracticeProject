package utils;

import org.openqa.selenium.WebDriver;

public class TestContext {

    public WebDriver driver;
    public PageObjectManager pageObjectManager;
    public DriverLaunch driverLaunch;

    public TestContext(){

        driverLaunch = new DriverLaunch();
        driver = driverLaunch.getDriverLaunch();
        pageObjectManager = new PageObjectManager(driver);

    }
}
