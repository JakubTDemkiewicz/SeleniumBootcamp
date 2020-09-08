package page.objects;

import helpers.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HomePage {
    private WebDriver driver;
    private Methods methods;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.methods = new Methods(this.driver);
    }

    public void navigateToEveningDresses() {
        WebElement topMenuWomenLink = driver.findElement(By.cssSelector("#block_top_menu a"));
        methods.clickOnOptionFromTopMenu(topMenuWomenLink, "Evening Dresses");
        String pageTitle = driver.getTitle();
        assertTrue(pageTitle.contains("Evening Dresses"));
    }

    public void isOnHomePage() {
        String title = driver.getTitle();
        assertEquals(title, "My Store");
    }
}
