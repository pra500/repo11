package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class fdvfTest  {

    WebDriver driver;
    H5 hh;
    @Test
    public void heeETest()
    {
        hh=new H5(driver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        hh.enterdetails();
    }


}
