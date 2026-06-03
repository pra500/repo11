package pac1;

import org.apache.commons.io.input.WindowsLineEndingInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class MakemytripTest {

    WebDriver driver;

    @BeforeClass
    public void setup() {


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        //  driver.get("https://practice.expandtesting.com/login");
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }


    @Test(priority = 1)
    public void titleTest() {
        String title =
                driver.getTitle();
        System.out.println(title);
        Assert.assertTrue(title.contains("Selenium Practice - Student Registration Form"));

    }

    @Test(priority =2)
    public void urlTest() {
        String title =
                driver.getCurrentUrl();
        System.out.println(title);
        Assert.assertTrue(title.contains("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php"));

    }

    @Test(priority = 3)
    public void elementpresentTest() {
        boolean b=
    driver.findElement(By.xpath("//h1[text()='Selenium - Automation Practice Form']")).isDisplayed();
        System.out.println(b);
        Assert.assertTrue(b);

    }

}