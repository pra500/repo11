package pac1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TddTest {


    WebDriver driver;

    @BeforeClass
    public void setup() throws Exception{

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--disable-autofilled");
        options.addArguments("--disable-notifications");
        options.addArguments("--start-maximized");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-extensions");

        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        //   driver.get("https://www.tricentis.com/");
       // driver.get("https://www.opencart.com/");
        driver.get("https://www.makemytrip.com/");

    }

    @AfterClass
    public void teardown() throws Exception {

        driver.quit();
    }
/*
    //@Test
    public void gedeTest() {
        boolean watchnow =
                driver.findElement(By.xpath("//a[text()='Watch now']")).isDisplayed();
        System.out.println(watchnow);

        String text =
                driver.findElement(By.xpath("//div//p[text()='Platform']")).getText();
        System.out.println(text);


        boolean logo =
                driver.findElement(By.xpath("//img[@alt='logo']")).isDisplayed();
        System.out.println(logo);

    }


    @Test
    public void geeTest() throws Exception {


        driver.findElement(By.xpath("//button[starts-with(@id, 'openwindow')]")).click();
        Set<String> set1 = driver.getWindowHandles();

        Iterator<String> itr = set1.iterator();

        String p = itr.next();
        String c = itr.next();


        driver.switchTo().window(c);
        Thread.sleep(5000);

        //  WebDriverWait wait=new WebDriverWait()

        Assert.assertTrue(driver.getTitle().contains("Foundations of Modern Higher Education | .Consulting"));

        driver.close();
        driver.switchTo().window(p);

        //   Assert.assertTrue(driver.getCurrentUrl().contains("https://rahulshettyacademy.com/AutomationPractice/"));

        //  Foundations of Modern Higher Education | .Consulting

    }

    @Test
    public void geedTest() {

        System.out.println(driver.getWindowHandle());

    }


    @Test
    public void geeddTest() {

        System.out.println(driver.getCurrentUrl());

    }


    @Test
    public void gee22ddTest() {

        System.out.println(driver.getTitle());


    }


    @Test
    public void gees22ddTest() {
        List<WebElement> list =
                driver.findElements(By.xpath("//a"));

        for (WebElement wb : list) {
            System.out.println(wb.getText());
        }

        System.out.println("****************");

        List<WebElement> list1 =
                driver.findElements(By.xpath("//img"));

        for (WebElement wb : list1) {
            System.out.println(wb.getText());
        }
    }

    @Test
    public void ggTest() {
        String url =
                driver.getCurrentUrl();
        Assert.assertEquals(url, "https://www.opencart.com/");
    }
*/
    @Test
    public void ggTest() {
driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
boolean b=
driver.findElement(By.xpath("//li[@class='menu_Homestays']")).isDisplayed();
        System.out.println(b);
    }



}


