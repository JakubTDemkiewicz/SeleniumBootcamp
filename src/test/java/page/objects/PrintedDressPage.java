package page.objects;

import helpers.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class PrintedDressPage {
    private WebDriver driver;
    private Methods methods;

    public PrintedDressPage(WebDriver driver) {
        this.driver = driver;
        methods = new Methods(this.driver);
    }

    public void changeColourToPink() {
        WebElement colorPink = driver.findElement(By.id("color_24"));
        methods.waitAndClickOnElement(colorPink);

        WebElement pinkImage = driver.findElement(By.id("thumbnail_11"));
        assertTrue(pinkImage.isDisplayed());
    }

    public void changeSizeToL() {
        WebElement size = driver.findElement(By.id("group_1"));
        Select dropDown = methods.selectFromDropDownByValue(size, "3");
        assertEquals(dropDown.getFirstSelectedOption().getText(), "L");
    }
}
