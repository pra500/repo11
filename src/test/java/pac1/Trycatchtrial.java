package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Trycatchtrial {


    WebDriver driver;
    SoftAssert so = new SoftAssert();

//
//
//    @BeforeClass
//    public void setup() {
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
//        driver.manage().deleteAllCookies();
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//
//    }
//
//    @AfterClass
//    public void tearDown() {
//        driver.quit();
//    }
//
//
//    @Test
//    public void TrycddatccdhTrialTest() {
//
//        try {
//
//        driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
//
//        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
//            driver.findElement(By.xpath("//input[@name='pasddddsword']")).sendKeys("adminSd@1234");
//
//
//            driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
//    } catch (Exception e) {
//           e.printStackTrace();
//
//
//        }
//
//
//        finally {
//            System.out.println("final statement");
//        }
//    }


//***************

    @BeforeClass
    public void setup() {


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://demowebshop.tricentis.com/onepagecheckout");

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void TrycacdctchTrialTesr() {
        boolean flag =

                driver.findElement(By.xpath("(//a[normalize-space()='Books'])[1]")).isDisplayed();
        so.assertTrue(flag);

        so.assertEquals("demo", "Demo");

        driver.findElement(By.xpath("//input[@id='small-seaddrchterms']")).sendKeys("laptop");
        String title = driver.getTitle();

        so.assertEquals(title, "Demo Web Shop. Shopping Cart", "not found");

    }


}
