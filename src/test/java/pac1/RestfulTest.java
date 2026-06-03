package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class RestfulTest {

    WebDriver driver;
    //private WebDriver ;
    // JavascriptExecutor  js;

    @BeforeClass
    public void setup() {

//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("disable-popup-blocking");

        //  options.addArguments("ac

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://restful-api.dev/");

        //js=(JavascriptExecutor)driver;
//        driver.findElement(By.cssSelector(".IntegrationModal-viewDemoBtn")).click();


        // driver.get("https://www.opencart.com/");


    }

    @AfterClass
    public void teardown() {
        driver.quit();

    }

    @Test
    public void menuTest() {
        Dimension d=
                driver.findElement(By.xpath("//div[@class='MuiBox-root css-i9gxme']")).getSize();
        System.out.println(d);


    }
    @Test
    public void menssssssuTest() {
        Dimension d=
                driver.findElement(By.xpath("//div[@class='MuiBox-root css-i9gxme']")).getSize();
        System.out.println(d);


    }
    @Test
    public void menwwssssuTest() {
        Dimension d=
                driver.findElement(By.xpath("//div[@class='MuiBox-root css-i9gxme']")).getSize();
        System.out.println(d);


    }

    }
