package pac1;

import freemarker.core.CSSOutputFormat;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Trycatchseleniumscript {

    WebDriver driver;

    @Test
    public void LoginSuccessfulTest() {

        try
        {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://practicetestautomation.com/practice-test-login/");

            driver.findElement(By.xpath("//input[@id='usernWame']")).sendKeys("admin");

            driver.findElement(By.xpath("//input[@id='password]")).sendKeys("Password123");
            driver.findElement(By.xpath("//button[@id='submit']")).click();

        }

        catch (Exception e)
        {
            System.out.println("catching");
           e.printStackTrace();
        }



    }
}
