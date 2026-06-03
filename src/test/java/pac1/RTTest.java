package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;

public class RTTest {

    WebDriver driver;

    @BeforeClass
    public void setup() {

//
//        ChromeOptions co=new ChromeOptions();
//        co.addArguments("incognito");
//        co.addArguments("headless");
//        co.addArguments("disable-popup-blocking");
//        driver = new ChromeDriver(co);

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }


    @Test(priority = 0)
    public void titleTest() {
        System.out.println(driver.getTitle());


    }
    @Test(priority = 1)
    public void urlTest() {
        System.out.println(driver.getCurrentUrl());

    }

    @Test(priority = 2)
    public void windowhandleTest() {
        System.out.println(driver.getWindowHandle());

    }

    @Test(priority = 3)
    public void alllinkscountTest() {
        System.out.println("all links are: " + driver.findElements(By.tagName("a")).size());

    }

    @Test(priority = 4)
    public void allimagescountTest() {
        System.out.println("all imgaes are: " + driver.findElements(By.tagName("img")).size());

    }
    @Test(priority = 3)
    public void allinputboxesTest() {
        System.out.println("all input boxes are: " + driver.findElements(By.tagName("input")).size());

    }

    @Test(priority = 3)
    public void firstnameexistTest() {
        boolean firstnameexist=
       driver.findElement(By.xpath("//input[@id='name']")).isDisplayed();
        Assert.assertTrue(firstnameexist);

    }


    @Test(priority = 3)
    public void emailexistTest() {
        boolean emailexist=
                driver.findElement(By.id("email")).isDisplayed();
        Assert.assertTrue(emailexist);

    }
    @Test(priority = 3)
    public void firstnamecssvalueTest() {
        String firstnamecssvalue=
                driver.findElement(By.xpath("//input[@id='name']")).getCssValue("color");
        System.out.println(firstnamecssvalue);

    }

    @Test(priority = 3)
    public void alldinputboxesTest() {
        System.out.println("all input boxes are: " + driver.findElements(By.tagName("input")).size());

    }

    @Test(priority = 3)
    public void allinpdutboxesTest() {
        System.out.println("all input boxes are: " + driver.findElements(By.tagName("input")).size());

    }

    @Test(priority = 3)
    public void allinpddeutboxesTest() {
        System.out.println("all input boxes are: " + driver.findElements(By.tagName("input")).size());

    }
    @Test(priority = 3)
    public void allinpddutboxesTest() {
        System.out.println("all input boxes are: " + driver.findElements(By.tagName("input")).size());

    }
    @Test(priority = 3)
    public void allinpdudtboxesTest() {
        System.out.println("all input boxes are: " + driver.findElements(By.tagName("input")).size());

    }















}





