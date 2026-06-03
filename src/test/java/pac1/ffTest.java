package pac1;

import net.bytebuddy.dynamic.loading.ClassFilePostProcessor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v127.audits.model.FederatedAuthRequestIssueDetails;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilePermission;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

public class ffTest {

    WebDriver driver;

    @BeforeClass
    public void setup() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-popup-blocking");
        options.addArguments("--incognito");
        options.addArguments("--headless");
        //options.addArguments("--disable-autofilled");


        //  options.addArguments("ac

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://practice.expandtesting.com/login#google_vignette");

//        driver.findElement(By.cssSelector(".IntegrationModal-viewDemoBtn")).click();

        // driver.get("https://www.opencart.com/");

    }


    @AfterClass
    public void teardown() {
        driver.quit();
    }

    /*
    @Test
    public void menuTest() {
        List<WebElement> list =
                driver.findElements(By.xpath("//a"));
        System.out.println(list.size());


    }


    @Test
    public void med2222nuTest() {
        List<WebElement> list =
                driver.findElements(By.xpath("//img"));
        System.out.println(list.size());


    }

    @Test
    public void mednuTest() {
        List<WebElement> list =
                driver.findElements(By.xpath("//button"));
        System.out.println(list.size());


    }

    @Test
    public void mdenuTest() {
        List<WebElement> list =
                driver.findElements(By.xpath("//strong"));
        System.out.println(list.size());


    }

    @Test
    public void medsnuTest() {
        List<WebElement> list =
                driver.findElements(By.xpath("//div"));
        System.out.println(list.size());


    }

    @Test
    public void medsssnuTest() {
        List<WebElement> list =
                driver.findElements(By.xpath("//iframe"));
        System.out.println(list.size());


    }

    @Test
    public void me222nuTest() {
        List<WebElement> list =
                driver.findElements(By.xpath("//input"));
        System.out.println(list.size());


    }

    @Test
    public void me2222nuTest() {
        List<WebElement> list =
                driver.findElements(By.xpath("//table"));
        System.out.println(list.size());

    }

    @Test
    public void me3344nuTest() {
        List<WebElement> list =
                driver.findElements(By.xpath("//style"));
        System.out.println(list.size());

    }

    @Test
    public void me333nuTest() {
        List<WebElement> list =
                driver.findElements(By.xpath("//footer"));
        System.out.println(list.size());

    }

    @Test
    public void men66uTest() {
        List<WebElement> list =
                driver.findElements(By.xpath("//p"));
        System.out.println(list.size());

    }

    @Test
    public void mend777uTest() {
        List<WebElement> list =
                driver.findElements(By.xpath("//h1"));
        System.out.println(list.size());

    }

    @Test
    public void men777uTest() {
        List<WebElement> list =
                driver.findElements(By.xpath("//h1"));
        System.out.println(list.size());
    }

    @Test
    public void men777uffTest() {
        List<WebElement> list =
                driver.findElements(By.xpath("//h1"));
        System.out.println(list.size());

    }

    @Test
    public void medd333n777uTest() {
        List<WebElement> list =
                driver.findElements(By.xpath("//h1"));
        System.out.println(list.size());


    }

    @Test
    public void men777dduTest() {
        List<WebElement> list =
                driver.findElements(By.xpath("//h1"));
        System.out.println(list.size());

    }

    @Test
    public void meddn777uTest() {
        List<WebElement> list =
                driver.findElements(By.xpath("//h1"));
        System.out.println(list.size());
    }

    @Test
    public void meddddn777uTest() {
        boolean n=
        driver.findElement(By.xpath("//button[@name='submit-login']")).isDisplayed();

        System.out.println(n);

    }
    @Test
    public void meddddedn777uTest() {
        boolean n=
                driver.findElement(By.xpath("//button[@name='submit-login']")).isDisplayed();

        System.out.println(n);

    }

    @Test
    public void meddddddn777uTest() {
        int size=
                driver.findElements(By.xpath("//a")).size();

        System.out.println(size);

    }

    @Test
    public void medde33ddddn777uTest() {
        int size=
                driver.findElements(By.xpath("//img")).size();

        System.out.println(size);

    }


    @Test
    public void meddddcdddn777uTest() {
        int size=
                driver.findElements(By.xpath("//div")).size();

        System.out.println(size);

    }


    @Test
    public void meddddcddn777uTest() {
        int size=
                driver.findElements(By.xpath("//button")).size();

        System.out.println(size);

    }

    @Test
    public void medddddcddn777uTest() {
        int size=
                driver.findElements(By.xpath("//div")).size();

        System.out.println(size);

    }
*/


    @Test
    public void medddddcddn777uTest() {
        int size =
                driver.findElements(By.xpath("//input")).size();

        System.out.println(size);

    }


    @Test
    public void m1Test() {
        int size =
                driver.findElements(By.xpath("//img")).size();

        System.out.println(size);

    }


    @Test
    public void mdd1Test() {
        int size =
                driver.findElements(By.xpath("//table")).size();

        System.out.println(size);


    }


    @Test
    public void mdsd1Test() throws Exception {

        String filepath = "C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\G777.properties";
        FileInputStream fip = new FileInputStream(filepath);
        Properties prop = new Properties();
        prop.load(fip);
        String s =
                prop.getProperty("user");
        System.out.println(s);


        String s1 =
                prop.getProperty("pwd");
        System.out.println(s1);


        String filepath1 = "C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\j.properties";
        FileOutputStream fop = new FileOutputStream(filepath1);
        Properties prop1 = new Properties();
        prop1.setProperty("url", "https://jsonplaceholder.typicode.com/posts");
        prop1.setProperty("urla", "https://jsonplaceholder.typicode.com/postsa");
        prop1.store(fop, "vvre");
        fop.close();


    }


    @Test
    public void mdsd1dTest() throws Exception {
        driver.get("https://www.opencart.com/");
        Thread.sleep(4000);


      WebElement wn=  driver.findElement(By.xpath("(//a[text()='OpenCart Books'])[2]"));
      clickxsdd(wn);


    }

    public void clickxsdd(WebElement wn) throws Exception {

        wn.click();
        if(driver.getCurrentUrl().equalsIgnoreCase("https://www.opencart.com/index.php?route=cms/download"))
            System.out.println("xxx");

        else
            System.out.println("xxxxxx");

    }


}





