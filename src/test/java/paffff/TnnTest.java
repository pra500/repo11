package paffff;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class TnnTest {


    WebDriver driver;
    JavascriptExecutor js;
    WebDriverWait wait;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://beeceptor.com/docs/sample-api-for-testing/");



        //  driver.get("https://www.abhibus.com/");

        //driver.get("https://www.yatra.com/");

        //  driver.get("https://www.wanderfly.in/");


     //   driver.get("https://slice.bank.in/");
    }


    @AfterClass(alwaysRun = true)
    public void teardown() {

        driver.quit();
    }

    //1) Verify Home Page Loads Successfully
    // @Test(priority = 0)
    public void logoandtitlevSerifyTest() {

        System.out.println(driver.getTitle());

        //driver.getTitle()
    }
}
