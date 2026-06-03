package pa1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pa2.Page1;
import pac1.H5;

import java.time.Duration;

public class LoginnnnnnTest {


    WebDriver driver;
    Page1 page1;


    @Test
    public void heeETest()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        page1=new Page1(driver);
        page1.enterdetails();
        driver.quit();
    }

}