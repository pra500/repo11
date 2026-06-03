package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class CsssTest {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("headless");
        co.addArguments("disable-popup-blocking");
        co.addArguments("no-sandbox");
        driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }

    @Test(priority = 0)
    public void geeTest() {
        System.out.println(driver.getTitle());

        System.out.println(driver.findElements(By.xpath("//button")).size());

        System.out.println(driver.findElements(By.xpath("//input")).size());

    }

    @Test(priority = 1)
    public void gddeeTest() {
        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.findElements(By.xpath("//button")).size());

        System.out.println(driver.findElements(By.xpath("//input")).size());

    }

    @Test(priority = 2)
    public void gddddeeTest() {
        System.out.println(driver.getWindowHandle());

        System.out.println(driver.findElements(By.xpath("//div")).size());

    }

    @Test(priority = 3)
    public void gddddddeeTest() {
        System.out.println(driver.findElements(By.xpath("//a")).size());

        System.out.println(driver.findElements(By.xpath("//img")).size());
    }


    @Test(priority = 3)
    public void gddddddddeeTest() {
        System.out.println(driver.findElements(By.xpath("//a")).size());

        System.out.println(driver.findElements(By.xpath("//img")).size());
    }

    @Test(priority = 3)
    public void gdddddddddeeTest() {
        System.out.println(driver.findElements(By.xpath("//input")).size());

        System.out.println(driver.findElements(By.xpath("//img")).size());
    }

    @Test(priority = 3)
    public void gdddddddddddeeTest() {
        System.out.println(driver.findElements(By.xpath("//input")).size());

        System.out.println(driver.findElements(By.xpath("//img")).size());
    }


}
