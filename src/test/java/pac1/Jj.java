package pac1;

import org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class Jj {

    public static WebDriver driver;

    public static void main(String[] args) {

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");

            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
            driver.manage().deleteAllCookies();
           // driver.get("https://www.opencart.com/");

           // driver.get("https://katalon.com/resources-center/blog/api-examples");
            driver.get("https://www.cult.fit/");

            /*
        System.out.println(driver.getTitle());

        boolean b=
        driver.getCurrentUrl().contains("http");
        System.out.println(b);


        System.out.println(driver.getTitle());
        //  driver.getTitle()


String start=driver.findElement(By.xpath("//a[text()='Start now']")).getText();
        System.out.println(start);
        Assert.assertEquals(start, "START NOW");


        String s=
        driver.findElement(By.xpath("(//a[text()='Free Download'])[1]")).getText();
        System.out.println(s);
        Assert.assertEquals(s, "FREE DOWNLOAD");

        System.out.println(   driver.findElements(By.tagName("img")).size()
        );
     //   driver.findElements(By.tagName("img")).size()

        System.out.println(driver.findElements(By.xpath("//li//a[text()='Features']")).size());
      //  driver.findElements(By.xpath("//li//a[text()='F   eatures']")).size();

               System.out.println(driver.getWindowHandle());

        System.out.println(driver.findElements(By.tagName("input")).size());
String blog=
        driver.findElement(By.xpath("//li//a[text()='Blog']")).getText();
        System.out.println(blog);
*/

        /*
        String s11=
        driver.findElement(By.xpath("//div[text()='Solutions']")).getText();
        System.out.println(s11);


String s1s1=
        driver.findElement(By.xpath("//li//p[contains(text(), 'Customize how the map looks (style, colors, zoom level)')]")).getAttribute("data-end");
        System.out.println(s1s1);
*/

        String d=
        driver.findElement(By.xpath("//div//div[text()='BANGALORE']")).getAttribute("cursor");
        System.out.println(d);


String s=driver.findElement(By.xpath("//h5[text()='SPORTS']")).getText();
        System.out.println(s);
//
// List<WebElement> list=driver.findElements(By.tagName("a"));
//
//       int size= list.size();
//        System.out.println("the size is " + size);
//
//
//
//        for(int i=0;i<=size-1;i++)
//        {
//            System.out.println(list.get(i).getText());
//
//        }


boolean b=
driver.getPageSource().contains("div");
        System.out.println(b);


        driver.quit();


       }

     }












