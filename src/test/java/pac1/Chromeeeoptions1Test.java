package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.Properties;

public class Chromeeeoptions1Test {

    WebDriver driver;
    JavascriptExecutor js;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1920,1080");
        options.addArguments("disable-infobars");
        // options.addArguments("disable-");
        // options.addArguments("--autofill-disabled=true");

        driver = new ChromeDriver(options);
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        //  driver.get("https://www.abhibus.com/");

        //driver.get("https://www.yatra.com/");

        driver.get("https://slice.bank.in/");
    }

    @AfterClass(alwaysRun = true)
    public void teardown() {

        driver.quit();
    }

    //1) Verify Home Page Loads Successfully
    @Test(priority = 0)
    public void logoandtitlevSerifyTest() {

        System.out.println(driver.getTitle());

    }

    @Test(priority = 0)
    public void logoancddtitlevSerifyTest() {

        // System.out.println(driver.getTitle());

        String s =
                driver.findElement(By.xpath("//a[@aria-label='Savings account']")).getAttribute("class");
        System.out.println(s);

        String s1 =
                driver.findElement(By.xpath("//a[@aria-label='Savings account']")).getAttribute("class");
        System.out.println(s1);
    }


    @Test(priority = 0)
    public void logrttifyTest() {
        String s =
                driver.findElement(By.xpath("//a[@aria-label='Savings account']")).getAttribute("class");
        System.out.println(s);
    }

    @Test(priority = 0)
    public void logrtstifyTest() {
        String s =
                driver.findElement(By.xpath("//a[@aria-label='Savings account']")).getAttribute("class");
        System.out.println(s);

    }

    @Test(priority = 0)
    public void logrddtstifyTest() {
        String s =
                driver.findElement(By.xpath("//a[@aria-label='Savings account']")).getAttribute("class");
        System.out.println(s);
    }


    @Test(priority = 0)
    public void logrddtssstifyTest()  throws  Exception{
//        String s =
//                driver.findElement(By.xpath("(//a[normalize-space()='Careers'])[1]"))
//                        .getAttribute("href");
//        System.out.println(s);


       // driver.findElement(By.xpath("(//a[normalize-space()='Careers'])[1]")).click();

String filepath="C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\gb1.properties";
//        FileInputStream fip=new FileInputStream(filepath);
//        Properties prop=new Properties();
//        prop.load(fip);
//        String s=prop.getProperty("userrrr");
//        System.out.println(s);


        FileOutputStream fop=new FileOutputStream(filepath);
        Properties prop=new Properties();
prop.setProperty("uss", "fdvb");
prop.setProperty("pwdddd", "fdvb@123445");
prop.store(fop, "msgggg");
fop.close();

    }

}