package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Phonepe {

    WebDriver driver;
    //private WebDriver ;
    // JavascriptExecutor  js;

    @BeforeClass
    public void setup() {
//
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("disable-popup-blocking");
//
        //  options.addArguments("ac

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.flipkart.com/");

        //js=(JavascriptExecutor)driver;
//        driver.findElement(By.cssSelector(".IntegrationModal-viewDemoBtn")).click();


        // driver.get("https://www.opencart.com/");

    }

    @AfterClass
    public void teardown() {
        driver.quit();


    }

    @Test
    public void menuTest() {

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

    }


    //    @Test
    //    public void menudsTest() {
    //
    //        System.out.println(driver.getTitle());
    //        System.out.println(driver.getCurrentUrl());
    //
    //    }


    /*

  //  @Test
    public void contacsTest() {

        driver.findElement(By.xpath("(//div//a[text()='Contact Us'])[1]")).click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("https://www.phonepe.com/contact-us/)"));

        Assert.assertEquals("https://www.phonepe.com/contact-us/", driver.getCurrentUrl());



}


/*
    @Test
    public void refreshTest() {

boolean b=
        driver.getCurrentUrl().contains("https://www.phonepe.com/");
        System.out.println(b);
js.executeScript("location.reload();");




    }

    @Test
    public void titleTest() {

     String text=(String) js.executeScript("return document.title");
     Assert.assertEquals(text, "PhonePe: UPI Payments,  Investment, Insurance, Recharges, DTH & More");

    }

//    @Test
//    public void titleTest() {
//
//     //            (JavascriptExecutor)driver;


    }

 */

/*
    @Test
  public void tiddtleTest() {
        System.out.println(driver.getTitle());
        //driver.getTitle().equalsIgnoreCase("")
    }

    @Test
    public void tiddccdtleTest() {
        System.out.println(driver.getCurrentUrl());
        //driver.getTitle().equalsIgnoreCase("")
    }
    @Test
    public void tiddcdcdtleTest() {
        System.out.println(driver.getTitle().contains("PhonePe: UPI Payments, Investment, Insurance, Recharges, DTH & More"));
        System.out.println(driver.getTitle().contains("PhonePe: UPI Payments, Investment, Insurance, Recharges, DTH & More"));
        //driver.getTitle().equalsIgnoreCase("")
    }

    @Test
    public void tiddcdcdtddleTest() {
        System.out.println(driver.getCurrentUrl().contains("https"));
        System.out.println(driver.getCurrentUrl().contains("htt"));
        System.out.println(driver.getCurrentUrl().contains("http"));


    }

    @Test
    public void tiddcdddcdtddleTest() {
        System.out.println(driver.getWindowHandle());
        //driver.getWindowHandle()

    }
    @Test
    public void tiddcssdddcdtddleTest() {

        System.out.println(driver.findElements(By.tagName("img")).size());
      //  driver.findElements(By.tagName("img")).size()
        //driver.getWindowHandle()

    }

*/


    @Test
    public void tiddcssdddcdtddleTest() {

        System.out.println(driver.findElements(By.tagName("script")).size());
        System.out.println(driver.findElements(By.tagName("div")).size());
        System.out.println(driver.findElements(By.tagName("table")).size());
        System.out.println(driver.findElements(By.tagName("img")).size());
        //  driver.findElements(By.tagName("img")).size()

        //  driver.findElements(By.tagName("img")).size()
        //driver.getWindowHandle()

    }

    // @Test
    public void tiddcssddddcdtddleTest() {

        System.out.println(driver.findElements(By.tagName("img")).size());
        //  driver.findElements(By.tagName("img")).size()
        //driver.getWindowHandle()

    }

    //    @Test
    public void tiddcssdwwddcdtddleTest() {

        System.out.println(driver.findElements(By.tagName("div")).size());
        //  driver.findElements(By.tagName("img")).size()
        //driver.getWindowHandle()

    }

    @Test
    public void tiddcssdwwddcdtddleddxTest() {

        System.out.println(driver.findElements(By.tagName("table")).size());

        //  driver.findElements(By.tagName("img")).size()
        //driver.getWindowHandle()

    }

    @Test
    public void tiddcssdwwddcdtdddleddxTest() {

        System.out.println(driver.findElements(By.tagName("div"
        )).size());

        //  driver.findElements(By.tagName("img")).size()
        //driver.getWindowHandle()
    }

    @Test
    public void tiddcsdsdwwddcdtdddleddxTest() {

        System.out.println(driver.findElements(By.tagName("div"
        )).size());

    }

    @Test
    public void tiddcsdsffdwwddcdtdddleddxTest() {

        System.out.println(driver.getWindowHandle());

    }
    @Test
    public void tTest() {

        System.out.println(driver.getWindowHandle());
        System.out.println(driver.findElements(By.xpath("input[placeholder='Search for Products, Brands and More']")).size());
      int size=driver.findElements(By.xpath("//a")).size()
              ;
        System.out.println(size);

       // driver.findElement

       // driver.findElements(By.xpath("input[placeholder='Search for Products, Brands and More']")).size()

    }

    }
