package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class HTest {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.goibibo.com/");
//        System.out.println(driver.getTitle());
//       // Assert.assertEquals(driver.getTitle(), "Housing Finance | Home Finance Company | HDFC Bank Ltd");
//
//        int size=
//       driver.findElements(By.xpath("//*[local-name()='svg' and @class='e-font-icon-svg e-fas-caret-down']"))
//                .size();
//
//        System.out.println(size);


  //      Thread.sleep(10000);




        boolean b=
        driver.findElement(By.xpath("//span[text()='Hotels']")).isDisplayed();
        Assert.assertTrue(b);


        boolean logo=
        driver.findElement(By.xpath("//span[@class='sc-1f95z5i-14 eFJvvO header-sprite logo gi-logo']")).isDisplayed();
        Assert.assertTrue(logo);

        boolean login=
        driver.findElement(By.xpath("(//ul//li[text()='Login / Signup'])[1]")).isDisplayed();
        Assert.assertTrue(login);


String text=
        driver.findElement(By.xpath("(//ul//li[text()='Login / Signup'])[1]")).getText();
        System.out.println(text);
    }
}
