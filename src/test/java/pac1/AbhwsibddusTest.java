package pac1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.DirectoryNotEmptyException;
import java.security.cert.Certificate;
import java.time.Duration;
import java.util.List;

public class AbhwsibddusTest {

//
//    1. Automate login page
//2. Practice XPathx,
//3. Practice CSS selectors
//	4. Write dropdown handling code
//	5. Handle alerts

    WebDriver driver;
    JavascriptExecutor js;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
        driver.get("https://www.hdfc.bank.in/");

    }


    @AfterClass(alwaysRun = true)
    public void teardown() {

        driver.quit();

    }

    @Test
    public void gegeTest() {


        driver.findElement(By.xpath("//button[@aria-label='Login']")).click();
        String s =
                driver.findElement(By.xpath("//span[text()='NetBanking']")).getText();
        System.out.println(s);
        //button[@aria-label='Login']

    }

    @Test
    public void gedgeTest() {
        System.out.println(driver.findElements(By.cssSelector("a[data-value='Personal']")).size()
        );

        String href = driver.findElement(By.xpath("(//a[text()='Personal'])[1]")).getAttribute("href");
        System.out.println(href);

//driver.get("https://www.tutorialspoint.com/selenium/practice/select-menu.php")

    }


  //  @Test
    public void gedgfdveTest() throws InterruptedException {

        driver.get("https://www.htmlelements.com/demos/dropdownlist/multiple-selection/index.htm");
        Thread.sleep(7000);

        System.out.println(driver.getWindowHandle());

        System.out.println(driver.getTitle());

        driver.navigate().refresh();
        List<WebElement> list =
                driver.findElements(By.xpath("//span[@smart-id='dropDownButton']"));
        System.out.println(list.size());
      /*  Select sel = new Select(wb);
        sel.selectByVisibleText("Breve");
        sel.selectByVisibleText("Bicerin");

        if (sel.isMultiple() == true)
            System.out.println("this is multiselect");

        List<WebElement> list =
                sel.getOptions();
        System.out.println(list.size());

        System.out.println(list.getClass());

       */
    }


/*
    // @Test
    public void gegeTest() {
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        System.out.println();
        driver.getWindowHandle();


        driver.getCurrentUrl();
        driver.getTitle();

    }

    //  @Test
    public void gegsweTest() {
        System.out.println(driver.findElements(By.xpath("//button")).size());

        //  driver.findElements(By.xpath("//button")).size();
    }


    //@Test
    public void gegssssweTest() {
        System.out.println(driver.findElements(By.xpath("//button")).size());

        String s =
                driver.findElement(By.xpath("//img[@alt='OpenCart']")).getAttribute("src");
        System.out.println(s);

        Assert.assertEquals("https://application/view/image/icon/opencart-logo-white.png", s);
    }


   // @Test
    public void gegssssssweTest() {
        WebElement wb = driver.findElement(By.xpath("//img[@alt='Online Bus Tickets Booking']"));


        Point p =
                wb.getLocation();
        System.out.println(p.getX());
        System.out.println(p.getY());

        String s =
                wb.getAttribute("class");
        System.out.println(s);


        String tagname = wb.getTagName();
        System.out.println(tagname);


        String ss = wb.getAriaRole();
        System.out.println(ss);

        Dimension d = wb.getSize();
        System.out.println(d);

    }


    @Test
    public void brokenlinksfindingTest() throws Exception {

        List<WebElement> list = driver.findElements(By.tagName("a"));
        int size =
                list.size();
        System.out.println(size);


        for (int i = 0; i <= list.size() - 1; i++) {
            WebElement wb = list.get(i);
            String s = wb.getAttribute("href");
            brok(s);

        }

    }

    public void brok(String s) throws Exception {


        URL url = new URL(s);
        HttpURLConnection hip = (HttpURLConnection) url.openConnection();
        hip.
                connect();
        hip.setConnectTimeout(3000)
        ;
        if (hip.getResponseCode() == 200) {
            System.out.println(hip.getResponseMessage() + " " + "not broken");

        }
    }

    @Test
    public void brokenlinksddfindingTest() throws Exception {

        System.out.println(driver.getTitle());
        //driver.getTitle()
    }
    @Test
    public void bTest() throws Exception {

        System.out.println(driver.getCurrentUrl());
        //driver.getTitle()
    }

    @Test
    public void b1Test() throws Exception {

        System.out.println(driver.getWindowHandle());
        //driver.getTitle()
    }


*/


}

