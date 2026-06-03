package pac1;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Beeceptor1Test {
    WebDriver driver;

    @BeforeClass
    public void setup() {
       // ChromeOptions options = new ChromeOptions();
       // options.addArguments("--headless=new");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://beeceptor.com/docs/sample-api-for-testing/");
    }

    @AfterClass
    public void teardown() {

        driver.quit();
    }

    @Description("checking title of the page....")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 0)
    public void titleTest() {
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Sample API For Testing | Beeceptor");

    }

    @Description("checking url of the page....")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 1)
    public void urlTest() {

        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(), "https://beeceptor.com/docs/sample-api-for-testing/");

    }


    @Description("checking total number of links in the page....")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 2)
    public void alllinksTest() {

        System.out.println("total links are: " + " " + driver.findElements(By.tagName("a")).size());
    }

    @Description("checking total number of input boxes in the page....")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 3)
    public void allinputboxesTest() {

        System.out.println("total input boxes are: " + " " + driver.findElements(By.tagName("input")).size());
    }


    @Description("checking total number of images in the page....")
    @Severity(SeverityLevel.BLOCKER)
    @Test(priority = 4)
    public void allimagesTest() {

        System.out.println("total images are: " + " " + driver.findElements(By.tagName("img")).size());
    }

    @Description("checking search bar in the page....")
    @Severity(SeverityLevel.BLOCKER)
    @Test(priority = 5)
    public void searchTest() {

        boolean search = driver.findElement(By.cssSelector("input[placeholder='Search']")).isDisplayed();
        Assert.assertTrue(search);

    }

    @Description("checking features link in the page....")
    @Severity(SeverityLevel.BLOCKER)
    @Test(priority = 6)
    public void FeaturesTest() {

        boolean search = driver.findElement(By.xpath("//a[text()='Features']")).isDisplayed();
        Assert.assertTrue(search);
    }


    @Description("checking documentation link in the page....")
    @Severity(SeverityLevel.BLOCKER)
    @Test(priority = 7)
    public void documentationTest() {

        boolean documentation = driver.findElement(By.xpath("//a[text()='Documentation']")).isDisplayed();
        Assert.assertTrue(documentation);

    }


    @Description("checking logo in the page....")
    @Severity(SeverityLevel.MINOR)
    @Test(priority = 8)
    public void logoTest() {
        boolean logo = driver.findElement(By.cssSelector("img[alt='Beeceptor-Logo']")).isDisplayed();
        Assert.assertTrue(logo);

    }


    @Description("checking endpoint in the page....")
    @Severity(SeverityLevel.MINOR)
    @Test(priority = 9)
    public void endpointTest() {
        boolean endpoint = driver.findElement(By.xpath("//a[text()='Create an Endpoint']")).isDisplayed();
        Assert.assertTrue(endpoint);

    }

    @Description("checking signin button in the page....")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 10)
    public void signinTest() throws InterruptedException {
    //        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
    //       boolean b= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Sign In']")))!=null;

         // Thread.sleep(9000);
    //        JavascriptExecutor js=(JavascriptExecutor) driver;
          //  js.executeScript(
           //boolean b= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href='https://app.beeceptor.com/login']")))!=null;

    //       boolean b= driver.findElement(By.cssSelector("a[href='https://app.beeceptor.com/login']")).isDisplayed();
    //        Assert.assertTrue(b);

            // Replace isDisplayed() checks with:

            WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(6));
            WebElement wb= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='button button--link navbar__item navbar__link']")));

            JavascriptExecutor js=(JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", wb);

    Assert.assertTrue(wb.isDisplayed());


          /*
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            boolean search = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                           // By.cssSelector("a[href='https://app.beeceptor.com/login']")
                            By.xpath("//a[contains(text(), 'Sign In')]")
                    )
            ) != null;*/


            //  //a[@class='button button--link navbar__item navbar__link']
    }

}
