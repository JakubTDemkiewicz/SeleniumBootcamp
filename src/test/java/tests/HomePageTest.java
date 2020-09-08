package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;


public class HomePageTest {
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

    @Test(groups = {"smoke"})
    public void homePageLoadTest() {
        HomePage homePage = new HomePage(driver);
        homePage.isOnHomePage();
    }

    @Test()
    public void userIsAbleToNavigateFromTopMenu() {
        HomePage homePage = new HomePage(driver);
        homePage.navigateToEveningDresses();
    }
}
