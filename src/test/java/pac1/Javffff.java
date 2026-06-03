package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.*;


public class Javffff {

    public static WebDriver driver;

    public static void main(String[] args) {


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://beeceptor.com/docs/sample-api-for-testing/");
        boolean b= driver.getCurrentUrl().contains("ht");
        Assert.assertTrue(b);
boolean bb=
        driver.getTitle().contains("Sample API For Testing | Beeceptor");
        System.out.println(bb);
        String s=
        driver.getWindowHandle();
        System.out.println(s);



            }


}

