package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TcvbTest {


    WebDriver driver;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));

        //  driver.get("https://www.cult.fit/");
        driver.get("https://www.makemytrip.com/");

    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }

//

    /// /
    /// /    //@Test(priority = 0)
    /// /    public void titleTest() {
    /// /        System.out.println(driver.getTitle());
    /// /        Assert.assertEquals("Browse thousands of Cart Page images for design inspiration | Dribbble", driver.getTitle());
    /// /
    /// /
    /// /    }
    /// /    @Test(priority = 1)
    /// /    public void urlTest() {
    /// /        System.out.println(driver.getCurrentUrl());
    /// /      //  Assert.assertEquals("Browse thousands of Cart Page images for design inspiration | Dribbble", driver.getTitle());
    /// /
    /// /
    /// /    }
    /// /    @Test(priority = 0)
    /// /    public void windowhandleTest() {
    /// /        System.out.println(driver.getWindowHandle());
    /// /    }
    /// /
//
//
//
//    @Test(priority = 0)
//    public void titleTest() {
//        System.out.println(driver.getTitle());
//
//        Assert.assertEquals("Get the Best Fitness Workouts, Gyms and Sports in India | cult.fit", driver.getTitle());
//
//
//    }
//
//
//    @Test(priority = 1)
//    public void tietleTest() {
//        System.out.println(driver.getTitle());
//
//        Assert.assertEquals("Get the Best Fitness Workouts, Gyms and Sports in India | cult.fit", driver.getTitle());
//
//    }
//
//    @Test(priority = 2)
//    public void urlTest() {
//        System.out.println(driver.getTitle());
//
//        Assert.assertEquals("https://www.cult.fit/", driver.getCurrentUrl());
//
//
//    }
//    @Test(priority = 3)
//    public void titdleTest() {
//        System.out.println(driver.findElements(By.xpath("//a")).size());
//     // driver.findElements(By.xpath("//a")).size();
//
//    }
//
//
//    @Test(priority = 0)
//    public void tisstleTest() {
//        driver.e
//


//@Test(priority = 1)
    public void titleTest() {
        driver.findElement(By.xpath("(//a[normalize-space()='Books'])[1]")).click();

        Assert.assertEquals("https://demowebshop.tricentis.com/books", driver.getCurrentUrl());

        WebElement sortby =
                driver.findElement(By.xpath("//select[@id='products-orderby']"));
        Select sel = new Select(sortby);
        ;
        sel.selectByVisibleText("Name: A to Z");

        driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();

        (//input[@value='Add to cart'])[1]


                driver.findElement(By.xpath("//span[text()='Shopping cart']"))).click();
        //driver.findElement(By.xpath(""
        //div//h1[text()='Shopping cart']

    }


    @Test(priority = 1)
    public void verifylaptopsTest() {
        driver.findElement(By.xpath("(//li//a[normalize-space()='Digital downloads'])[1]")).click();

        String text =
                driver.findElement(By.xpath("//h1[contains(text(), 'Digital downloads')]")).getText();

        Assert.assertEquals(text, "Digital downloads");

        WebElement wb =
                driver.findElement(By.xpath("//select[@name='products-pagesize']"));
        Select sel = new Select(wb);
        sel.selectByVisibleText("8");

    }


    @Test(priority = 1)
    public void verifcylaptopsTest() {

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());


    }


    @Test(priority = 1)
    public void veridddefcylaptopsTest() {
        System.out.println(driver.getWindowHandle());
//driver.getWindowHandle()


    }

    @Test(priority = 1)
    public void verifddcylaptopsTest() {
        System.out.println(driver.getPageSource().contains("input"));

    }

    @Test(priority = 1)
    public void veriddfcylaptopsTest() {
        System.out.println(driver.getCurrentUrl());

    }


}


