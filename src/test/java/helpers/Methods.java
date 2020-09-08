package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Methods {
    private WebDriver driver;
    private WebDriverWait wait;

    public Methods(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
    }

    public void waitAndClickOnElement(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void clickOnOptionFromTopMenu(WebElement first, String linkText) {
        Actions action = new Actions(driver);
        action.moveToElement(first).pause(2000).build().perform();
        WebElement secondElement = driver.findElement(By.linkText(linkText));
        secondElement.click();
    }

    public Select selectFromDropDownByValue(WebElement element, String value) {
        Select sizeDropDown = new Select(element);
        sizeDropDown.selectByValue(value);
        return sizeDropDown;
    }
}
