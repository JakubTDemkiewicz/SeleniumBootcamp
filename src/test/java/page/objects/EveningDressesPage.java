package page.objects;

import helpers.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertTrue;

public class EveningDressesPage {
    private WebDriver driver;
    private Methods methods;

    public EveningDressesPage(WebDriver driver) {
        this.driver = driver;
        this.methods = new Methods(this.driver);
    }

    public void clickOnListView() {
        WebElement listIcon = driver.findElement(By.cssSelector(".icon-th-list"));
        methods.waitAndClickOnElement(listIcon);
    }

    public void openPrintedDressPage() {
        WebElement moreButton = driver.findElement(By.cssSelector(".right-block a[title=\"View\"]"));
        methods.waitAndClickOnElement(moreButton);

        String pageTitle = driver.getTitle();
        assertTrue(pageTitle.contains("Printed Dress"));
    }
}
