package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Trycatchpgm1 {


    WebDriver driver;

    @Test
    public void egTest()
    {
driver=new ChromeDriver();

        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.opencart.com/");
        try
        {
            driver.findElement(By.xpath("(//a[text()='Demo'])[1]")).getText();

            WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1));
         String text=   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Demo'])[1]"))).getText();
            System.out.println(text);

           // Assert.fail("failure failure");

            driver.quit();

        }

        catch (TimeoutException e) {
            System.out.println("time is over");
        }

    }

}

