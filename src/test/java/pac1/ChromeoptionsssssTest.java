package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class ChromeoptionsssssTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {

ChromeOptions options=new  ChromeOptions();
options.addArguments("--disable-dev-shm-usage");
options.addArguments("--disable-popup-blocking");
options.addArguments("--disable-infobars");
options.addArguments("--no-sandbox");
options.addArguments("--start-maximized");
options.addArguments("--no-sandbox");
options.addArguments("--window-size=1920, 1080");

        driver = new ChromeDriver(options);
       // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
        driver.get("https://beeceptor.com/docs/sample-api-for-testing/");
    }

    @AfterClass
    public void teardown() {

        driver.quit();
    }


    @Test
    public void hesssseTest() {
        System.out.println(driver.getWindowHandle());

    }

    @Test
    public void hesseTest() {
        System.out.println(driver.getWindowHandle());

    }


    @Test
    public void hesdeeseTest() {
        System.out.println(driver.getWindowHandle());

    }


    @Test
    public void hesseeeTest() {
        System.out.println(driver.getWindowHandle());

    }


}
