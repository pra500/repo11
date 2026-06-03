package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.Properties;

public class Cult1dd11Test {

    WebDriver driver;
   JavascriptExecutor js;

    @BeforeClass(alwaysRun = true)
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        //  driver.get("https://www.abhibus.com/");

        //driver.get("https://www.yatra.com/");

       // driver.get("https://www.cult.fit/");
    }

    @AfterClass(alwaysRun = true)
    public void teardown() {

        driver.quit();
    }


   // @Test(priority = 0)
    public void logoandtitlevSerifyTest() throws InterruptedException {


        driver.findElement(By.xpath("//h5[text()='SPORTS']")).click();
        Assert.assertEquals("https://www.cult.fit/play", driver.getCurrentUrl());

        WebElement wb= driver.findElement(By.xpath("//div[text()='GET APP']"));

        driver.findElement(By.xpath("//div[@class='style-prefix-18wh94b e1ji7sof0']"));
        js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", wb);

        Thread.sleep(4000);

      boolean b=  driver.findElement(By.xpath("(//img[@alt='vman-and-white-cult-text'])[2]")).isDisplayed();
        Assert.assertTrue(b);

        driver.findElement(By.xpath("//div[text()='BANGALORE']")).click();

        driver.findElement(By.xpath("//div[@class='style-prefix-kdw7mz e1mafxnz2']"))

                .sendKeys("Indore");

driver.findElement(By.xpath("//h5[text()='FITNESS']")).click();
        Assert.assertEquals(
                driver.getCurrentUrl(), "https://www.cult.fit/fitness");

boolean bb=
        driver.findElement(By.xpath("//img[@alt='logged-out-image']")).isDisplayed();
        Assert.assertTrue(bb);
    }


    @Test(priority = 1)
    public void lTest()  throws Exception{


        String filepath = "C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\hh.properties";
        String filepath1 = "C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\hh1.properties";
        FileInputStream fip=new FileInputStream(filepath);
        Properties prop=new Properties();
        prop.load(fip);

        String url1=prop.getProperty("url");
        String username1=prop.getProperty("username");

        driver.get(url1);
        driver.findElement(By.id("username")).sendKeys(username1);


        FileOutputStream fop=new FileOutputStream(filepath1);
        Properties prop1=new Properties();
       prop1.setProperty("pwd", "admin@1234");
        prop1.setProperty("pwd1", "admin@12347");
        prop1.setProperty("pwd2", "admin@123888");

       prop1.store(fop, "my msggggggggg");
       fop.close();

    }



    }
