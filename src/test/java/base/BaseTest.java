package base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.WindowManager;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;
    protected HomePage homePage;


    @BeforeClass
    public void setUp() {
        System.setProperty("browser", "CHROME");
        driver = new ChromeDriver();
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().window().maximize();

    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://www.demoblaze.com/");
        homePage = new HomePage(driver);
    }

    @AfterClass
       public void tearDown(){
        driver.quit();
        }


    protected String handleAlert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        String alertMessage = alert.getText();
        alert.accept();
        return alertMessage;
    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }
    }


