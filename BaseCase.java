package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseCase {
    protected WebDriver driver;
    public static final String FLIPKART_URL = "https://www.flipkart.com/";

    @BeforeSuite
    public void setupSuite() {
        System.out.println("Initializing WebDriver and setting up suite.");
        // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void tearDownSuite() {
        if (driver != null) {
            System.out.println("Tearing down WebDriver.");
            driver.quit();
        }
    }
}