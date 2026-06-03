package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class TetvgbTest {

    WebDriver driver;

    //  @Test
    public void geeTest() {
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().deleteAllCookies();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String windowhandle =
                driver.getWindowHandle();
        System.out.println(driver.getTitle());
        //   driver.gett


    }


    @BeforeClass
    public void ges() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().deleteAllCookies();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //driver.getCurrentUrl()

    }

    @AfterClass
    public void teardonw() {
        driver.quit();
    }

   // @Test
    public void test1() {

        String s = driver.findElement(By.xpath("//img[@alt='company-branding']")).getAttribute("alt");
        System.out.println(s);
        Assert.assertEquals(s, "company-branding");


        String s1 = driver.findElement(By.xpath("//div//p[text()='Username : Admin']")).getAttribute("class");
        System.out.println(s1);
        Assert.assertEquals(s1, "oxd-text oxd-text--p");


        String s2 = driver.findElement(By.xpath("//div//h5[text()='Login']")).getAttribute("class");
        System.out.println(s2);
        Assert.assertEquals(s2, "oxd-text oxd-text--h5 orangehrm-login-title");

    }

    @Test
    public void teddst1() {
        String s=
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).getAttribute("class");
        System.out.println(s);

        String ss=
                driver.findElement(By.xpath("//button[normalize-space()='Login']")).getAttribute("type");
        System.out.println(ss);


        String  ssee=
                driver.findElement(By.xpath("//button[normalize-space()='Login']")).getAttribute("type");
        System.out.println(ssee);

    }


}
