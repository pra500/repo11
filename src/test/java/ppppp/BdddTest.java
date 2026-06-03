package ppppp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class BdddTest {

    WebDriver driver;
    Bs bs;

    @BeforeClass
    public void beforeClass() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        //   driver.manage().deleteAllCookies();
        driver.get("https://practice.expandtesting.com/login");
        bs = new Bs(driver);

    }


    @Test
    public void tesdddet1Test() {
        bs.enterid();

    }





}
