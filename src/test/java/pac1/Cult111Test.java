package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Cult111Test {

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

        driver.get("https://www.cult.fit/");
    }

    @AfterClass(alwaysRun = true)
    public void teardown() {

        driver.quit();
    }

    @Test(priority = 0)
    public void logoandtitlevSerifyTest() throws InterruptedException {

        driver.findElement(By.xpath("//span[text()='×']")).click();
        Thread.sleep(4000);

        driver.findElement(By.xpath("//h5[text()='SPORTS']")).click();
        Assert.assertEquals("https://www.cult.fit/play", driver.getCurrentUrl());

        WebElement wb= driver.findElement(By.xpath("//div[text()='GET APP']"));

     String s=   wb.getAriaRole();
        driver.findElement(By.xpath("//div[@class='style-prefix-18wh94b e1ji7sof0']"));
        js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", wb);

        Thread.sleep(4000);

      boolean b=  driver.findElement(By.xpath("(//img[@alt='vman-and-white-cult-text'])[2]")).isDisplayed();
        Assert.assertTrue(b);

       // driver.findElement(By.xpath("//div[@class='style-prefix-k008qs e8v7wso0']//div[text()='BANGALORE']")).click();


        /*
WebElement wbb=
        driver.findElement(By.xpath("//div[@class='style-prefix-kdw7mz e1mafxnz2']"));


        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(9));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='style-prefix-kdw7mz e1mafxnz2']")));


     wbb.sendKeys("Indore");



driver.findElement(By.xpath("//h5[text()='FITNESS']")).click();
        Assert.assertEquals(
                driver.getCurrentUrl(), "https://www.cult.fit/fitness");

boolean bb=
        driver.findElement(By.xpath("//img[@alt='logged-out-image']")).isDisplayed();
        Assert.assertTrue(bb);


         */
    }


    @Test(priority = 0)
    public void loTest() throws InterruptedException {

      //  System.out.println(driver.getTitle());


            driver.get("https://www.saucedemo.com");

            Thread.sleep(3000);

            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
            }



        @Test(priority = 0)
        public void lest() throws InterruptedException {




    }
    }


