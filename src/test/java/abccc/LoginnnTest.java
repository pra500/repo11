package abccc;

import apcvc.bss;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.awt.event.ActionListener;
import java.time.Duration;

public class LoginnnTest {

    WebDriver driver;


    @BeforeClass
    public void setUp() {
        ChromeOptions op=new ChromeOptions();
        op.addArguments("incognito");
        driver = new ChromeDriver(op);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

        // driver.get("http://localhost/litecart/en/");
        driver.get("https://www.saucedemo.com");//
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void gegTest() {

        Assert.assertEquals(driver.getTitle(), "Swag Labs");

    }

    @Test
    public void gegssTest() {

    allinfo();


    scrolling();

    }

    public void allinfo() {
        System.out.println(driver.getWindowHandle());

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());
    }

    public void scrolling() {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(-300, -400)", "");

    }


}
