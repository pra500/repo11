package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class BacddTest {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.opencart.com/");


    }

    @AfterMethod
    public void teardown() {

        driver.close();
    }

    @Test(priority = 0)
    public void GeTest() {

        System.out.println(driver.getTitle());
    }

    @Test(priority = 1)
    public void GdedTest() {

        System.out.println(driver.getTitle());
    }

    @Test(priority = 2)
    public void GesdTest() {

        System.out.println(driver.getTitle());
    }


    @Test(priority = 3)
    public void GeweedTest() {

        System.out.println(driver.getTitle());
    }

    @Test(priority = 4)
    public void GedTest() {

        System.out.println(driver.getTitle());


    }
    @Test(priority = 4)
    public void GedddTest() {

        System.out.println(driver.getTitle());


    }

    @Test(priority = 4)
    public void GeddTest() {

        System.out.println(driver.getCurrentUrl());


    }
    @Test(priority = 0)
    public void GddeTest() {

        System.out.println(driver.getWindowHandle());
    }

    @Test(priority = 0)
    public void GddwddeTest() {

        System.out.println(driver.getWindowHandle());
    }



    @Test(priority = 0)
    public void GddddeTest() {

        System.out.println(driver.getWindowHandle());
    }


    @Test(priority = 0)
    public void GddddewwTest() {

        System.out.println(driver.getWindowHandle());
    }
    @Test(priority = 0)
    public void GddwwddeTest() {

        System.out.println(driver.getWindowHandle());
    }

    @Test(priority = 0)
    public void GddwwwddeTest() {

        System.out.println(driver.getWindowHandle());
    }

    @Test(priority = 0)
    public void GddwwdfdwddeTest() {
        System.out.println(driver.getCurrentUrl().contains("https:"));
    }











}
