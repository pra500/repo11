package pac1;

import org.apache.commons.collections.bidimap.DualHashBidiMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Phonepeeee1Test {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
//driver.get("https://developer.paypal.com/home/");
driver.get("https://www.phonepe.com/");

    }

    @AfterMethod
    public void teardown() {
        driver.quit();


    }

    //@Test
    public void menuTest() {

        //  driver.findElement(By.xpath("//p[contains(text(), 'You have read and accepted the')]")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='Button-module_pp-button__OsSkY Button-module_pp-button--large__28yQE Button-module_pp-button--primary__POu3i']"))).click();

        //   driver.findElement(By.xpath("//a[@class='Button-module_pp-button__OsSkY Button-module_pp-button--large__28yQE Button-module_pp-button--primary__POu3i']")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://developer.paypal.com/developer-program/");


        driver.findElement(By.xpath("//a[normalize-space()='Join Now']")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://developer.paypal.com/developer-signup/");

        driver.findElement(By.xpath("//*[local-name()='svg' and @class='ppLogo']")).isDisplayed();

        Assert.assertTrue(driver.findElement(By.xpath("//*[local-name()='svg' and @class='ppLogo']")).isDisplayed());


        //a[@class='Button-module_pp-button__OsSkY Button-module_pp-button--large__28yQE Button-module_pp-button--primary__POu3i']
    }


    //homepage:

//    Verify page title
//    Verify PhonePe logo is visible and clickable
//    Verify hero banner loads
//    Verify banner CTA buttons are clickable
//    Verify page load time


    @Test(priority = 0)
    public void titleTest() {

        Assert.assertEquals(driver.getTitle(), "PhonePe: UPI Payments, Investment, Insurance, Recharges, DTH & More");

    }
        @Test(priority = 1)
        public void logoTest() {
WebElement logo=
        driver.findElement(By.xpath("//img[@alt='PhonePe | Logo']"));
        Assert.assertTrue(logo.isDisplayed());
      //  logo.click();

    }
    @Test(priority = 2)
    public void bannersTest() {
        WebElement banner=
                driver.findElement(By.xpath("//img[@alt='Share.Market']"));
        Assert.assertTrue(banner.isDisplayed());
         }
    @Test(priority = 3)
    public void bannerssideTest() {
        WebElement banner=
                driver.findElement(By.xpath("(//img[@alt='External Link'])[1]"));
        banner.click();

     Set<String> set1=driver.getWindowHandles();

     Iterator<String> iterator1=set1.iterator();

      String parent=  iterator1.next();
      String child=  iterator1.next();

      driver.switchTo().window(child);

     boolean logoexist= driver.findElement(By.xpath("(//img[@alt='Share.Market Logo'])[1]")).isDisplayed();
Assert.assertTrue(logoexist);

driver.close();
driver.switchTo().window(parent);

    }

    @Test(priority = 4)
    public void bannerssidebuttonsTest() throws InterruptedException {

        WebElement wb=
        driver.findElement(By.xpath("(//span[text()='Company'])[1]"));
        Actions act=new Actions(driver);
        act.moveToElement(wb).build().perform();
        Thread.sleep(3000);

        //driver.findElement(By.xpath("(//span[text()='Company'])[1]"));

        driver.findElement(By.xpath("(//li[normalize-space()='About Us'])[1]")).click();
        Thread.sleep(3000);
        System.out.println(driver.getCurrentUrl());
      //  driver.getCurrentUrl()
        //  https://www.phonepe.com/about-us/
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.phonepe.com/about-us/"));
driver.navigate().back();

        WebElement wb1=
                driver.findElement(By.xpath("(//span[text()='Company'])[1]"));
        Actions act1=new Actions(driver);
        act1.moveToElement(wb1).build().perform();
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//li[normalize-space()='Careers'])[1]")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.phonepe.com/careers/"));

    }

    @Test(priority = 4)
    public void pageloadtimeTest() {

//        driver.findElement(By.xpath("(//li[normalize-space()='About Us'])[1]")).click();
//        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.phonepe.com/about-us/"));
//        driver.navigate().back();
//
//        driver.findElement(By.xpath("(//li[normalize-space()='Careers'])[1]")).click();
//        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.phonepe.com/careers/"));


       long  starttime=System.currentTimeMillis();

       driver.get("https://www.phonepe.com/");

      long endtime= System.currentTimeMillis();

      long inbetweentime=endtime-starttime;

     double d= inbetweentime / 1000.0;

        System.out.println("page load time: " + d);
    }



}