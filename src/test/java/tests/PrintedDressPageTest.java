package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.EveningDressesPage;
import page.objects.HomePage;
import page.objects.PrintedDressPage;

public class PrintedDressPageTest {
    private WebDriver driver;

    @BeforeMethod
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com/");
    }

    @AfterMethod
    public void afterTest() {
        driver.close();
        driver.quit();
    }

    @Test()
    public void userIsAbleToChangeOptionsInPDP() {
        HomePage homePage = new HomePage(driver);
        homePage.navigateToEveningDresses();

        EveningDressesPage eveningDressesPage = new EveningDressesPage(driver);
        eveningDressesPage.clickOnListView();
        eveningDressesPage.openPrintedDressPage();

        PrintedDressPage printedDressPage = new PrintedDressPage(driver);
        printedDressPage.changeColourToPink();
        printedDressPage.changeSizeToL();
    }
}
