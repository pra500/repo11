package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class SliceTest {

    WebDriver driver;
    JavascriptExecutor js;

    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
        driver.get("https://slice.bank.in/");
        js=(JavascriptExecutor)driver;

    }


    @AfterMethod
    public void tear() {
        driver.quit();

    }


    @Test(priority = 0)
        public void yyGeTest() {

        driver.findElement(By.xpath("(//button[@aria-label='Open menu'])[2]")).click();

        driver.findElement(By.xpath( "(//h3[text()='Help center'])[2]")).click();

       boolean flag= driver.findElement(By.xpath("//a[text()='Contact us']")).isDisplayed();
        Assert.assertTrue(flag);

     String title= (String)  js.executeScript("return document.title");
        System.out.println(title);

       js.executeScript("location.reload()");

    }


    @Test(priority = 1)
    public void yyddGeTest() {

driver.findElement(By.xpath("//a[text()='UPI credit card']")).click();

boolean creditcard=
driver.getCurrentUrl().contains("https://slice.bank.in/credit-card/");
Assert.assertTrue(creditcard);

js.executeScript("window.scrollBy(300, 340)", "");

    }

}
