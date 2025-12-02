package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class FlipkartTest extends BaseCase {
    @Test
    public void addMacbookToCartTest() {
        driver.get(FLIPKART_URL);
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isFlipkartLogoDisplayed(), "Flipkart logo is not displayed.");
        homePage.searchProduct("Macbook air m2");

        String originalWindow = driver.getWindowHandle();
        homePage.clickFirstItem();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        // ProductPage productPage = new ProductPage(driver);
        // productPage.clickAddToCart();
        // CartPage cartPage = new CartPage(driver);
        // Assert.assertTrue(cartPage.isItemInCart(), "Item was not successfully added to cart.");
        // driver.close();
        // driver.switchTo().window(originalWindow);
    }
}