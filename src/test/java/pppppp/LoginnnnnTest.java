package pppppp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class LoginnnnnTest {


    //        Example:
    //
    //        Valid login
    //        Invalid password
    //        Empty fields
    //        Special characters
    //


    WebDriver driver;

    @BeforeClass
    public void setup() throws Exception {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();
        driver.get("https://www.tricentis.com/");

    }

    @AfterClass
    public void teardown() throws Exception {

        driver.quit();
    }

/*

    /*
    // @Test(priority = 1)
    public void geeTest() {


        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
        driver.findElement(By.xpath("//button[@id='submit']")).click();


    }

    @Test(priority = 1)
    public void gwweeTest() {


        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        String successfulmsg = driver.findElement(By.xpath("//h1[text()='Logged In Successfully']")).getText();
        Assert.assertEquals(successfulmsg, "Logged In Successfully");

    }

    @Test(priority = 2)
    public void geddeTest() {

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Passwdddord123");
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        String s = driver.findElement(By.xpath("//div[text()='Your password is invalid!']")).getText();
        Assert.assertEquals(s, "Your password is invalid!");

    }


    @Test(priority = 3)
    public void geesTest() {


        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("");
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        String s = driver.findElement(By.xpath("//div[text()='Your username is invalid!']")).getText();

        Assert.assertEquals(s, "Your username is invalid!");


    }


    @Test(priority = 4)
    public void geeseeeeddTest() {
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());


    }


    @Test(priority = 4)
    public void geesssddTest() {
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());


    }

    @Test(priority = 4)
    public void geddeeesddTest() {
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getWindowHandle());
    }


    @Test(priority = 5)
    public void gddeddesddTest() {
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getWindowHandle());
    }


    @Test(priority = 6)
    public void geddesddTest() {
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getWindowHandle());
    }

*/


    //   @Test(priority = 6)
    public void geddedsddTest() {

        System.out.println(driver.getWindowHandle());
//driver.getWindowHandle()

    }


    @Test(priority = 6)
    public void geddesddTest() {


        boolean flag =
                driver.findElement(By.xpath("//div//p[text()='Solutions']")).isDisplayed();
        Assert.assertTrue(flag);

        boolean flag1 = driver.findElement(By.xpath("//a//img[@alt='logo']")).isDisplayed();
        Assert.assertTrue(flag1);

        boolean flag2 = driver.findElement(By.xpath("(//a[@aria-label='Search page'])[1]")).isDisplayed();
        Assert.assertTrue(flag2);
    }


    @Test(priority = 6)
    public void geddddedsddTest() throws Exception {

        String filepath = "C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\ddhh.properties";
        FileInputStream fip = new FileInputStream(filepath);
        Properties prop = new Properties();
        prop.load(fip);
        String s = prop.getProperty("user");
        System.out.println(s);
        String s1 = prop.getProperty("pwd");
        System.out.println(s1);
    }


    @Test(priority = 6)
    public void gedddddedsddTest() throws Exception {

        System.out.println("svxcdfv");

        driver.getTitle();

        //System.out.println("svxcdfv");

        //System.out.println("sv");

        //System.out.println("svxcv");

    }


    @Test(priority = 6)
    public void geddddddedsddTest() throws Exception {
    }


}