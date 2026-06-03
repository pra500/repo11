package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ChromeeeTest {


    WebDriver driver;

    @BeforeClass
    public void beforeClass() {

        ChromeOptions options = new ChromeOptions();
        //    options.addArguments("--inco


        driver = new ChromeDriver(options);
        // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
        driver.get("https://beeceptor.com/docs/sample-api-for-testing/");

    }

    @AfterClass
    public void tearDown() {

    }


    @Test
    public void chromeTest() {
        driver = new ChromeDriver();
    }
}
