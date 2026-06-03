package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class BeeTest {

WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void seftup() {

        ChromeOptions options=new ChromeOptions();
        options.addArguments("--incognito-");
        //options.addArguments("--headless-");
        options.addArguments("--disable-gpu-");
        options.addArguments("--disable-chrome-extensions");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-autofilled");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        //  driver.get("https://www.abhibus.com/");

        //driver.get("https://www.yatra.com/");

        driver.get("https://www.wanderfly.in/");


    }
    @AfterClass(alwaysRun = true)
    public void teardown()
    {

        driver.quit();
    }


    @Test(priority = 1)
    public void gTest()
    {
        System.out.println(driver.getTitle());

    }


    @Test(priority = 2, dependsOnMethods = "gTest")
    public void gsdsdTest()
    {
        System.out.println(driver.getCurrentUrl());
    }


    @Test(priority = 3)
    public void gsddsdTest()
    {
        System.out.println(driver.getWindowHandle());
    }

    @Test
    public void gsdddsdTest()
    {
        System.out.println(driver.getWindowHandle());
    }








}

