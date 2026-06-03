package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Wrongscript1Test {

    WebDriver driver;


    @Test(priority = 0)
    public void LoginSuccessfulTest() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://demo.testfire.net/login.jsp");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("uid")));

        driver.findElement(By.id("uid")).sendKeys("admin");
        driver.findElement(By.id("passw")).sendKeys("admin");

        driver.findElement(By.name("btnSubmit")).click();
//
//
//        String helloadminusermsg =
//                driver.findElement(By.xpath("//h1[normalize-space()='Hello Admin User']")).getText();
//        Assert.assertEquals(helloadminusermsg, "Hello Admin User", "please verify your message");
//
//
//        driver.quit();




    }




}
