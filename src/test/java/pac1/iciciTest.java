package pac1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.OutputStream;
import java.time.Duration;
import java.util.List;

public class iciciTest {

    WebDriver driver;

    @BeforeClass
    public void setup() {

//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("disable-popup-blocking");
//        //  options.addArguments("ac

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.canarabank.bank.in/");


//        driver.findElement(By.cssSelector(".IntegrationModal-viewDemoBtn")).click();


        // driver.get("https://www.opencart.com/");


    }

    @AfterClass
    public void teardown() {
        driver.quit();


    }


    @Test(priority = 0)
    public void mddsdenuTest() {

//
//        FirstName=pragti


        System.out.println(driver.getWindowHandle());

        //driver.getWindowHandle()
    }


    @Test(priority = 1)
    public void menuddTest() {

//
//        FirstName=pragti
        System.out.println(driver.findElements(By.tagName("a")).size());


    }

    @Test(priority = 2)
    public void meddddnuTest() {

//
//        FirstName=pragti
        boolean b =

                driver.getPageSource().contains("div");

        Assert.assertTrue(b);


    }

    @Test(priority = 3)
    public void meddnuTest() {

//
//        FirstName=pragti
        Assert.assertTrue(driver.getPageSource().contains("input"));
        String str =

                driver.findElement(By.xpath("//a[text()='ABOUT US']")).getText();

        System.out.println(str);
    }

    @Test(priority = 4)
    public void mendddduTest() {

//
//        FirstName=pragti

        List<WebElement> list =
                driver.findElements(By.tagName("a"));

        for (int i = 0; i <= list.size() - 1; i++) {
            System.out.println(list.get(i).getText());
            //list.get(i).getText()
        }


    }

    @Test(priority = 5)
    public void meddnuddTest() {

//
//        FirstName=pragti

        String s =
                driver.findElement(By.xpath("//img[@id='canara-logo']")).getAttribute("id");
        Assert.assertEquals(s, "canara-logo");

    }

    @Test(priority = 6)
    public void menuTest() throws Exception {

//
//        FirstName=pragti

        String s =
                driver.findElement(By.xpath("//a[text()='CUSTOMER FEEDBACK']")).getAttribute("title");
        Assert.assertEquals(s, "CUSTOMER FEEDBACK ABOUT OUR SERVICE");
    }

    @Test(priority = 7)
    public void mddenuTest() {

//
//        FirstName=pragti

        WebElement wb =
                driver.findElement(By.xpath("//a[text()='CUSTOMER FEEDBACK']"));
        System.out.println(wb.getAriaRole());

    }

    @Test(priority = 8)
    public void menwwdduTest() {

//
//        FirstName=pragti
        String tagname =
                driver.findElement(By.cssSelector("#canara-logo")).getTagName();
        System.out.println(tagname);
        Assert.assertEquals(tagname, "img");
    }

    @Test(priority = 9)
    public void menssdduTest() {

//
//        FirstName=pragti
        String tagname =
                driver.findElement(By.cssSelector("#canara-logo")).getTagName();
        System.out.println(tagname);
        Assert.assertEquals(tagname, "img");
    }

    @Test(priority = 10)
    public void mendduTest() {

//
//        FirstName=pragti
        String tagname =
                driver.findElement(By.cssSelector("#canara-logo")).getTagName();
        System.out.println(tagname);
        Assert.assertEquals(tagname, "img");

    }


    @Test(priority = 11)
    public void mednddddduTest() {

        System.out.println("------------------------------");


        driver.findElements(By.tagName("div")).size();
    }


    @Test(priority = 11)
    public void m2Test() {
        //   System.out.println();

//
//        FirstName=pragti
        String tagname =
                driver.findElement(By.cssSelector("#canara-logo")).getTagName();
        System.out.println(tagname);
        Assert.assertEquals(tagname, "img");

    }

    @Test(priority = 11)
    public void medcccndduTest() {
        //  System.out.println();

//
//        FirstName=pragti


        String tagname =
                driver.findElement(By.cssSelector("#canara-logo")).getAttribute(
                        "alt"
                );
        System.out.println(tagname);
        Assert.assertEquals(tagname, "Canara bank a government of India undertaking");

    }

    @Test(priority = 11)
    public void m3Test() {
        System.out.println();

//
//        FirstName=pragti
        String tagname =
                driver.findElement(By.cssSelector("#canara-logo")).getTagName();
        System.out.println(tagname);
        Assert.assertEquals(tagname, "img");

    }

    @Test(priority = 11)
    public void m4Test() {
        System.out.println();

//
//        FirstName=pragti
        String tagname =
                driver.findElement(By.cssSelector("#canara-logo")).getTagName();
        System.out.println(tagname);
        Assert.assertEquals(tagname, "img");

    }

    @Test(priority = 11)
    public void m5Test() {
        //System.out.println();

//
//        FirstName=pragti
        String tagname =
                driver.findElement(By.cssSelector("#canara-logo")).getTagName();
        System.out.println(tagname);
        Assert.assertEquals(tagname, "img");

    }

    @Test(priority = 11)
    public void m6Test() {
        //  System.out.println();

//
//        FirstName=pragti
        String tagname =
                driver.findElement(By.cssSelector("#canara-logo")).getTagName();
        System.out.println(tagname);
        Assert.assertEquals(tagname, "img");

    }

    @Test(priority = 11)
    public void m7Test() {


//
//
//
        Point p = driver.findElement(By.xpath("//a[normalize-space()='DEPOSITS']")).getLocation();
        System.out.println(p.getX());

    }

    @Test(priority = 11)
    public void m8Test() {
        String d =
                driver.findElement(By.xpath("//a[normalize-space()='DEPOSITS']")).getCssValue("color");
        System.out.println(d);

    }


    @Test(priority = 11)
    public void m9Test() {


//
//        FirstName=pragti
        System.out.println(driver.findElement(By.xpath("//a[normalize-space()='DEPOSITS']")).getAttribute("class"));

    }

    @Test(priority = 11)
    public void m1Test() {
        System.out.println(driver.findElement(By.xpath("//a[normalize-space()='DEPOSITS']")).getAttribute("href"));
    }

    @Test(priority = 11)
    public void meddndduTest() {


//
//        FirstName=pragti
        System.out.println(driver.findElement(By.xpath("//a[normalize-space()='DEPOSITS']")).getAriaRole());

    }

    @Test(priority = 11)
    public void medddndduTest() {
        System.out.println(driver.findElement(By.xpath("//a[normalize-space()='DEPOSITS']")).getSize());

    }

    @Test(priority = 11)
    public void mednddduTest() {

        System.out.println(driver.findElements(By.tagName("div")).size());


    }


    @Test(priority = 12)
    public void medndeddduTest()  throws Exception {
        System.out.println("***************************");

        driver.get("https://practicetestautomation.com/practice-test-login/");

        Thread.sleep(
                3000
        );
        driver.findElement(By.cssSelector("input#username")).sendKeys("loginffff");

   }

    @Test(priority = 13)
    public void medndddddduTest() {

       System.out.println("***************************");

       WebElement wb=
        driver.findElement(By.xpath("//span[text()='ONLINE ACCOUNT OPENING']"));
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(8));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='ONLINE ACCOUNT OPENING']")));

        String text=
wb.getText();
        System.out.println(text);
    //    System.out.println(driver.findElement(By.xpath("//span[text()='ONLINE ACCOUNT OPENING']")).getText());

      //  driver.findElement(By.xpath("//span[text()='ONLINE ACCOUNT OPENING']")).getText();


    }


    @Test(priority = 14)
    public void medndddduTest() {
       // System.out.println("***************************");

        driver.findElement(By.xpath("//input[@name='q']"))
                .sendKeys("deposit", Keys.ENTER);
    }


    @Test(priority = 14)
    public void mednddddasssduTest() throws Exception {
        // System.out.println("***************************");


        driver.get("https://practice.expandtesting.com/login");
        Thread.sleep(4000);
    int size=    driver.findElements(By.tagName("a")).size();

        System.out.println(size);
       // driver.findElement(By.xpath("")).sendKeys();
    }


    @Test(priority = 14)
    public void m2wTest() throws Exception {
        // System.out.println("***************************");


        driver.get("https://practice.expandtesting.com/login");
        Thread.sleep(4000);
        int size=    driver.findElements(By.tagName("a")).size();

        System.out.println(size);
        // driver.findElement(By.xpath("")).sendKeys();
    }



}





