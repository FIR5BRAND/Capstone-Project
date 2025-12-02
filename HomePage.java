package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    private By searchInput = By.name("q");
    private By flipkartLogo = By.xpath("//div[@class='_1T-hUV']//img[@alt='Flipkart']");
    private By firstSearchResult = By.xpath("(//div[contains(@data-tkid, '')])[1]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public boolean isFlipkartLogoDisplayed() {
        return driver.findElement(flipkartLogo).isDisplayed();
    }

    public void searchProduct(String productName) {
        WebElement searchBox = driver.findElement(searchInput);
        searchBox.sendKeys(productName);
        searchBox.submit();
    }

    public void clickFirstItem() {
        driver.findElement(firstSearchResult).click();
    }
}