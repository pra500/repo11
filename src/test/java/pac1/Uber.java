package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class Uber {

    WebDriver driver;
    JavascriptExecutor js;


    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.wanderfly.in/");


    }

    @AfterClass
    public void teardown() {
        driver.quit();

    }
/*

    @Test
    public void geddssseTestI() {
        System.out.println(driver.getTitle());
        driver.getTitle();

        driver.findElement(By.xpath("(//a[contains(text(), 'Job search')])[1]")).click();

        driver.findElement(By.xpath("(//a[contains(text(), 'Job search')])[1]"));

    }

    @Test
    public void geddeTestI() {
        System.out.println(driver.getTitle());
        driver.getTitle();

        driver.findElement(By.xpath("(//a[contains(text(), 'Job search')])[1]")).click();

        driver.findElement(By.xpath("(//a[contains(text(), 'Job search')])[1]"));

    }

    @Test
    public void gewseTestI() {
        System.out.println(driver.getTitle());
        driver.getTitle();

        driver.findElement(By.xpath("(//a[contains(text(), 'Job search')])[1]")).click();

        driver.findElement(By.xpath("(//a[contains(text(), 'Job search')])[1]"));

    }

    @Test
    public void geseTestI() {
        System.out.println(driver.getTitle());
        driver.getTitle();

        driver.findElement(By.xpath("(//a[contains(text(), 'Job search')])[1]")).click();

        driver.findElement(By.xpath("(//a[contains(text(), 'Job search')])[1]"));

    }
*/

    @Test
    public void gedseTestI() {
     String text= driver.findElement(By.xpath("(//a[text()='Features'])[2]")).getText();
        Assert.assertEquals(text, "Features");

        String text1= driver.findElement(By.xpath("//li//a[text()='Social']")).getText();
        Assert.assertEquals(text1, "Social");

        String text2= driver.findElement(By.xpath("//li//a[text()='Pricing']")).getText();
        Assert.assertEquals(text2, "Pricing");

//
//        String text3= driver.findElement(By.xpath("//li//a[text()='ThriveHub']")).getText();
//        Assert.assertEquals(text3, "ThriveHub");
//
//        String text= driver.findElement(By.xpath("(//a[text()='Features'])[2]")).getText();
//        Assert.assertEquals(text, "Features");
//
//        String text= driver.findElement(By.xpath("(//a[text()='Features'])[2]")).getText();
//        Assert.assertEquals(text, "Features");

    }


    @Test
    public void geddseTestI() throws Exception {
        String filepath = "C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\K1.properties";
        FileInputStream fip=new FileInputStream(filepath);
        Properties prop = new Properties();
        prop.load(fip);
        String u=
        prop.getProperty("user");
        System.out.println(u);

        String p=
        prop.getProperty("pwd");
        System.out.println(p);
    }
    }

