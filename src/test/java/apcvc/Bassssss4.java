package apcvc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class Bassssss4 {
    WebDriver driver;


   public Bassssss4(WebDriver driver)
    {
        this.driver=driver;

    }


    @BeforeClass
    public void beforeClass()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        //
        // driver.get("https://rahulshettyacademy.com/");
        //driver.get("https://www.wanderfly.in/");
        driver.get("https://practicetestautomation.com/practice-test-login/");

    }
}
