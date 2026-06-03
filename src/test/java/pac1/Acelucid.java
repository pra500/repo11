package pac1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

public class Acelucid {

    WebDriver driver;
    // JavascriptExecutor js;

    @BeforeClass(alwaysRun = true)
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        //driver.get("https://jsonformatter.org/");
        //driver.get("https://rahulshettyacademy.com/");
        //driver.get("https://www.goibibo.com/");


        // driver.get("https://www.cult.fit/");
        //driver.get("http://uitestingplayground.com/");

        driver.get("https://tech.walmart.com/content/walmart-global-tech/en_us.html");

    }

    @AfterClass(alwaysRun = true)
    public void teardown() {
        driver.quit();

    }


    /*
    @Test
    public void ggTest() {

        String title = driver.getCurrentUrl();
        Assert.assertTrue(title.contains("acelucid"));

        boolean logoexist =
                driver.findElement(By.xpath("(//a//img[@alt='Acelucid Logo'])[1]")).isDisplayed();
        Assert.assertTrue(logoexist);


        List<WebElement> list =
                driver.findElements(By.xpath("//ul[@class='navbar-nav mx-auto mb-lg-0']"));
        int size = list.size();
        Assert.assertEquals(size, 1);

        boolean b =
                driver.findElement(By.xpath("//button[contains(text(), 'Schedule a Call')]")).isDisplayed();
        Assert.assertTrue(b, "check the message");


        System.out.println("t");



//
//        Scroll to bottom of page using JavaScriptExecutor.
//
//        1️⃣6️⃣ Wait for element using WebDriverWait.
//
//        1️⃣7️⃣ Upload a file using sendKeys().
//
//        1️⃣8️⃣ Take a screenshot.
//
//        1️⃣9️⃣ Hover over a menu using Actions class.


//
//         js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(400, 600)", "");
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(14));
//        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
//                "(//p[normalize-space()='Copyright © 2026 Acelucid, All rights reserved'])")));
//
//        boolean copyright =
//                element.isDisplayed();
//        Assert.assertTrue(copyright);

    }

     */

/*
    @Test
    public void ggTest() {
        boolean b = driver.getPageSource().contains("divdffgb");

        Assert.assertFalse(b);

        List<WebElement> list =
                driver.findElements(By.xpath("//li//a[text()='XML Formatter']"));


        if (list.size() == 3) {
            System.out.println("correct");
        } else {
            System.out.println("incorrect");
        }


        // driver.findElement(By.xpath())

    }


    @Test
    public void gddgTest() {
        System.out.println(driver.getTitle());
        //driver.getTitle()

        boolean b = driver.getTitle().contains("Best");
        Assert.assertTrue(b);

        boolean bb =
                driver.findElement(By.xpath("//img[@title='JSON Formatter']")).isDisplayed();
        Assert.assertTrue(bb);
    }
*/


    //  @Test
    public void gddddgTest() {

//        String s=
//        driver.findElement(By.xpath("//input[@id='toCity']")).getText();
//        System.out.println(s);

//        String s11=
//        driver.findElement(By.xpath("//span[@class='sc-1f95z5i-14 eFJvvO header-sprite logo gi-logo']")).getText();
//        System.out.println(s11);

//        String s22=
//        driver.findElement(By.xpath("(//ul//li[text()='Login / Signup'])[1]")).getText();
//        System.out.println(s22);
//Point p=
//        driver.findElement(By.xpath("(//ul//li[text()='Login / Signup'])[1]")).getLocation();
//        System.out.println(p.getY());


        String text =
                driver.findElement(By.xpath("//img[@class='logoClass']")).getText();
        System.out.println(text);


        boolean flag = driver.findElement(By.xpath("//img[@class='logoClass']")).isDisplayed();
        System.out.println(flag);

        boolean flag1 = driver.findElement(By.xpath("//h1[text()='Practice Page']")).isDisplayed();
        System.out.println(flag1);

    }

    /*

    @Test
    public void gddd4444dgTest() {
        System.out.println(driver.getTitle());

    }



    @Test
    public void gddsdd4444dgTest() {
        System.out.println(driver.getCurrentUrl());


    }



    @Test
    public void gddsdd44w44dgTest() {
        System.out.println(driver.getWindowHandle());

    }




    @Test
    public void gddsdsd44w44dgTest() {

int size=
driver.findElements(By.xpath("//a[normalize-space()='All-Access']")).size();
        if(size==2)
            System.out.println("correct size");


        int size1=
        driver.findElements(By.xpath("//a[normalize-space()='Mentorship']")).size();
        System.out.println(size1);

String a=
        driver.findElement(By.xpath("//a[normalize-space()='Practice Apps']")).getText();
        System.out.println(a);
    }

     */


    //    @Test
    public void gddsdsd44w44dgTest() {
        driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
        driver.findElement(By.xpath("(//ul//li[text()='Login / Signup'])[1]")).click();
        driver.findElement(By.xpath("//input[@class='loginCont__input']")).sendKeys("9088999999", Keys.ENTER);


        String s =
                driver.findElement(By.xpath("//div/h3[text()='Verify OTP']")).getText();
        Assert.assertEquals(s, "Verify OTP");


        String s1 =
                driver.findElement(By.xpath("//div[text()='Enter 4 digit OTP sent to']")).getText();
        Assert.assertTrue(s1.contains("Enter 4 digit OTP sent to"));

    }


    //@Test
    public void gddsdsdd44w44dgTest() {


        boolean s1 =
                driver.findElement(By.xpath("//span[@class='sc-1f95z5i-14 eFJvvO header-sprite logo gi-logo']"))
                        .isDisplayed();
        Assert.assertTrue(s1);
        System.out.println(driver.findElements(By.xpath("//ul[@class='sc-1f95z5i-0 fTpLLU']")).size());

        // driver.findElements(By.xpath("//ul[@class='sc-1f95z5i-0 fTpLLU']")).size();


        //  //span[@class='sc-1f95z5i-14 eFJvvO header-sprite logo gi-logo']
    }


    //   @Test
    public void gddsdcdsdd44w44dgTest() {

        System.out.println(driver.findElement(By.xpath("//div//h5[text()='FITNESS']")).getText());
        //driver.findElement(By.xpath("//div//h5[text()='FITNESS']")).getText();

    }


    // @Test
    public void gddsdcdsssdd44w44dgTest() {

        System.out.println(driver.findElement(By.xpath("//div//h5[text()='FITNESS']")).getText());
        //driver.findElement(By.xpath("//div//h5[text()='FITNESS']")).getText();

    }

    @Test
    public void nTest() {

        System.out.println(driver.findElement(By.xpath("//li//a[text()='Home']")).getText());
        //driver.findElement(By.xpath("//div//h5[text()='FITNESS']")).getText();

        System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'UI Test Automation')]")).getText());

        //  driver.findElement(By.xpath("//h1[contains(text(),'UI Test Automation')]")).getText();
    }

    @Test
    public void nffTest() {

        System.out.println(driver.findElement(By.xpath("//li//a[text()='Home']")).getText());
        //driver.findElement(By.xpath("//div//h5[text()='FITNESS']")).getText();

        System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'UI Test Automation')]")).getText());

        //  driver.findElement(By.xpath("//h1[contains(text(),'UI Test Automation')]")).getText();

    }

    @Test
    public void nfdfTest() {

        boolean b = driver.findElement(By.id(
                "navbarSupportedContent")).isDisplayed();
        System.out.println(b);
        Assert.assertTrue(b);

        boolean bb =
                driver.findElement(By.id("citation']")).isDisplayed();
        System.out.println(bb);
    }


    @Test
    public void nfddfTest() throws Exception {
        String s =
                driver.findElement(By.xpath("//li//a[text()='Resources']")).getText();
        System.out.println(s);

        String s1 =
                driver.findElement(By.xpath("//p[text()='Different automation pitfalls appearing in modern web applications are described and emulated below.']"))
                        .getText();
        System.out.println(s1);

        String s2 =
                driver.findElement(By.xpath("//h3//a[text()='Dynamic ID']")).getText();
        System.out.println(s2);


        String filepath = "C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\u.properties";
        FileInputStream fip = new FileInputStream(filepath);
        Properties prop = new Properties();
        prop.load(fip);
        String see = prop.getProperty("user");
        String s21 = prop.getProperty("pwd");
        System.out.println(see);
        System.out.println(s21);


    }


    @Test
    public void nfdxdfTest() throws Exception {

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }


    @Test
    public void nfddxdfTest() throws Exception {

        System.out.println(driver.findElements(By.tagName("a")).size());

    }

    @Test
    public void nfdddgfdxdfTest() throws Exception {

        System.out.println(driver.findElements(By.tagName("img")).size());

    }


    @Test
    public void nfddddxdfTest() throws Exception {

        System.out.println(driver.findElements(By.tagName("img")).size());

    }


    @Test
    public void nfdddddfddxdfTest() throws Exception {

        System.out.println(driver.findElements(By.tagName("img")).size());


    }

    @Test
    public void nfdddddxdfTest() throws Exception {

        System.out.println(driver.findElement(By.xpath("//span[text()='Future-ready digital transformation starts here']")).isDisplayed());

        //driver.findElement(By.xpath("//span[text()='Future-ready digital transformation starts here']")).isDisplayed();
    }



    @Test
    public void nfcdddddxdfTest() throws Exception {

        //System.out.println(driver.findElement(By.xpath("//span[text()='Future-ready digital transformation starts here']")).isDisplayed());

        //driver.findElement(By.xpath("//span[text()='Future-ready digital transformation starts here']")).isDisplayed();

        int s=
        driver.findElements(By.xpath("//div")).size();
        System.out.println(s);
    }

}

        


