package pac1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class TTest {

    WebDriver driver;

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite() {


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.highcharts.com/demo");


    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {

        driver.quit();

    }


   // @Test(alwaysRun = true)
    public void befssssTest() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        boolean flag = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[local-name()='svg']//*[name()='rect'])[1]"))).isDisplayed();


        System.out.println(flag);


        WebDriverWait wai12t = new WebDriverWait(driver, Duration.ofSeconds(4));

        boolean flag1 =
                wai12t.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[local-name()='svg']//*[name()='circle']"))).isDisplayed();
        System.out.println(flag1);


    }




    @Test(alwaysRun = true)
    public void befdsdddssssTest() {


        boolean bsd=
        driver.findElement(By.xpath("//*[local-name()='svg' and @aria-label='Collapse sidebar']")).isDisplayed();
        Assert.assertEquals(bsd, true);



    }

    @Test(alwaysRun = true)
    public void bedsdddssssTest() {
driver.get("https://www.highcharts.com/demo");

        boolean bsd=
                driver.findElement(By.xpath("//*[local-name()='svg' and @aria-label='Collapse sidebar']")).isDisplayed();
        Assert.assertEquals(bsd, true);


        System.out.println( driver.getCurrentUrl());


    driver.getTitle();









    }

}
