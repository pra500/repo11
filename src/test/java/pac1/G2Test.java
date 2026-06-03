package pac1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class G2Test {


    WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup() {

        driver = new ChromeDriver();
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

    public static void brok(String s) throws Exception {


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
    public void tTest() throws Exception {

        System.out.println(driver.findElements(By.tagName("div")).size());
      //  driver.findElements(By.tagName("div")).size()

    }


    @Test
    public void trTest() throws Exception {

        System.out.println(driver.findElements(By.tagName("img")).size());

    }

    @Test
    public void teerTest(){

        System.out.println(driver.findElements(By.tagName("strong")).size());

    }


    @Test
    public void teeTest() throws Exception {
        System.out.println(driver.getTitle().contains("Selenium Practice - Student Registration Form"));
        //  driver.getTitle()


    }


    @Test
    public void tseeTest() throws Exception {
        System.out.println(driver.getTitle().contains("Selenium Practice - Student Registration Form"));
        //  driver.getTitle()


        Dimension s=
        driver.findElement(By.xpath("//div//h1[text()='Selenium - Automation Practice Form']")).getSize();
        System.out.println(s);

String heading=
        driver.findElement(By.xpath("//h1[text()='Student Registration Form']")).getAriaRole();
        System.out.println(heading);

    }



    @Test
    public void tseseTest() throws Exception {
String s=
        driver.findElement(By.xpath("//a[normalize-space()='Selenium Tutorial']")).getAriaRole();
        System.out.println(s);
        String label=
        driver.findElement(By.xpath("//label[text()='Name:']")).getAriaRole();
        System.out.println(label);

    }


    @Test
    public void tsesessTest() throws Exception {
//        String s=
//                driver.findElement(By.xpath("//a[normalize-space()='Selenium Tutorial']")).getAriaRole();
//        System.out.println(s);
//        String label=
//                driver.findElement(By.xpath("//label[text()='Name:']")).getAriaRole();
//        System.out.println(label);
//
 /*
        String s=
        driver.findElement(By.xpath("//input[@id='name']")).getAriaRole();
        System.out.println(s);


        String s1=
                driver.findElement(By.xpath("//input[@id='email']")).getAriaRole();
        System.out.println(s1);

boolean b=
driver.findElement(By.xpath("//label[text()='Female']")).isSelected();
Assert.assertFalse(b);

        System.out.println(driver.findElement(By.xpath("//*[local-name()='svg' and @class='svg-inline--fa fa-bars toc-icons']")).isDisplayed());

//driver.findElement(By.xpath("//*[local-name()='svg' and @class='svg-inline--fa fa-bars toc-icons']")).isDisplayed();

*/
        System.out.println(driver.findElements(By.xpath("//*[local-name()='svg' and @class='svg-inline--fa fa-arrow-right']")).size());
  //      driver.findElements(By.xpath("//*[local-name()='svg' and @class='svg-inline--fa fa-arrow-right']")).size()

    }

    @Test
    public void tsvnsessTest() throws Exception {
        System.out.println(driver.findElement(By.xpath("//input[@value='Login']")).getAriaRole());

driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\pragt\\Downloads\\summary.txt", Keys.ENTER);

//
//wb.click();
//
//wb.sendKeys("C:\\Users\\pragt\\Downloads\\summary.txt", Keys.ENTER);
//

    }


    @Test
    public void tsTest() throws Exception {

        boolean correct=driver.getCurrentUrl().contains("https://");
        Assert.assertTrue(correct);

    }

    @Test
    public void tdfjvjTest() throws Exception {





    }





}