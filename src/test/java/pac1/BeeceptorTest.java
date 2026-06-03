package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

public class BeeceptorTest {

    WebDriver driver;

    @BeforeClass
    public void setup()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
        driver.get("https://beeceptor.com/docs/sample-api-for-testing/");
    }


    @AfterClass
    public void teardown() {

        driver.quit();
    }


    @Test
    public void hesseTest()
    {
        System.out.println(driver.getWindowHandle());
    }


    @Test
    public void hedsseTest()
    {
        System.out.println(driver.getCurrentUrl());
    }



    @Test
    public void hesdseTest()
    {
        System.out.println(driver.getTitle());
    }


    @Test
    public void hdddddesdseTest()
    {
        System.out.println(driver.getWindowHandle());

        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getTitle());

    }


    @Test(dependsOnMethods = "hdddddesdseTest", priority = 0)
    public void hdddddddesdseTest()
    {
        System.out.println(driver.getWindowHandle());

        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getTitle());

        System.out.println(driver.findElements(By.tagName("a")).size());
        System.out.println(driver.findElements(By.tagName("input")).size());
        System.out.println(driver.findElements(By.tagName("img")).size());



    }



    @Test()
    public void hddddddddesdseTest()
    {

    boolean n=driver.findElement(By.xpath("//div//a[text()='Create an Endpoint']")).isDisplayed();
        Assert.assertTrue(n);



        boolean n1=driver.findElement(By.xpath("//img[@alt='Beeceptor-Logo']")).isDisplayed();
        Assert.assertTrue(n1);

//
//        boolean nsf1=driver.findElement(By.xpath("//a[text()='Documentation']ws")).isDisplayed();
//        Assert.assertTrue(nsf1);
//
//        boolean nsfe1=driver.findElement(By.xpath("//a[text()='Documentation']ws")).isDisplayed();
//        Assert.assertTrue(nsfe1);
//
//
//        boolean mm=driver.findElement(By.xpath("//a[text()='Documentation']ws")).isDisplayed();
//        Assert.assertTrue(mm);



        boolean m1=driver.findElement(By.xpath("//a[text()='Sign In']")).isDisplayed();
        Assert.assertTrue(m1);

        int size=
        driver.findElements(By.xpath("//span[@class='irj294a']//*[local-name()='path']")).size();
        System.out.println(size);


        int joshsize=
        driver.findElements(By.xpath("//span[text()='Josh']")).size();
        System.out.println(joshsize);



//boolean b=
//        driver.findElement(By.xpath("//li//button[normalize-space()='courses']")).isDisplayed();
//                Assert.assertTrue(b);

        boolean b1=
                driver.findElement(By.xpath("//li//button[text()='goodies']")).isDisplayed();
        Assert.assertTrue(b1);

        // Assert.assertEquals(driver.getTitle().contains("Sample API For Testing | Beeceptor"));
       // driver.getTitle().contains("Sample API For Testing | Beeceptor");

    }

    @Test
    public void hddddDDdesdseTest() throws Exception {
        String filepath = "C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\cv.properties";
        FileInputStream fip=new FileInputStream(filepath);
        Properties prop=new Properties();
        prop.load(fip);
        String s=prop.getProperty("username");
        System.out.println(s);
   }

    @Test
    public void  hddddDDddesdseTest() throws Exception {

        boolean flag= driver.getTitle().contains("Sample API For Testing | Beeceptor");
        Assert.assertTrue(flag);


    }





    }
