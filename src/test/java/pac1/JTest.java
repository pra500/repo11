package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class JTest {


    WebDriver driver;

    @BeforeClass
    public void setup() {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--no-sandbox");
//        options.addArguments("incognito");
//        options.addArguments("--disable-notifications");
//        options.addArguments("--disable-infobars");
//        options.addArguments("--disable-autofilled");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().deleteAllCookies();
      //driver.get("https://www.opencart.com/");
      driver.get("https://www.makemytrip.com/");
    }

    @AfterClass
    public void tear() {
        driver.quit();
    }

    @Test(priority = 0)
    public void yyGeTest() {
        String title = driver.getTitle();
        System.out.println(title);


    }


    @Test(priority = 1)
    public void yyGsseTest() {
        String url = driver.getCurrentUrl();
        System.out.println(url);


    }

    @Test(priority = 2)
    public void yyGssddeTest() {
        String wid = driver.getWindowHandle();
        System.out.println(wid);


    }

    @Test(priority = 2)
    public void brokenlinksTest() throws IOException {

        List<WebElement> list =
                driver.findElements(By.xpath("//a"));
        System.out.println(list.size());

        for (int i = 0; i <= list.size()-1; i++) {

            String s = list.get(i).getAttribute("href");
            brokenlinks(s);
        }

    }

    public static void brokenlinks(String s) throws IOException {


        URL url=new URL(s);
        HttpURLConnection hh=(HttpURLConnection)url.openConnection();
        hh.connect();
        hh.setConnectTimeout(3000);
     int code=   hh.getResponseCode();
     if(code==400)
     {
         System.out.println("broken");
     }
     else {
         System.out.println("not broken");
     }


    }


   // @Test(priority = 2)
    public void brokenboxesTest() throws IOException {

        List<WebElement> list =
                driver.findElements(By.xpath("//img"));
        System.out.println(list.size());

        for (int i = 0; i <= list.size()-1; i++) {

            String s = list.get(i).getAttribute("src");
            brokeninputboxes(s);
        }

    }

    public static void brokeninputboxes(String s) throws IOException {

        URL url=new URL(s);
        HttpURLConnection hh=(HttpURLConnection)url.openConnection();
        hh.connect();
        hh.setConnectTimeout(3000);
        int code=  hh.getResponseCode();
        if(code==400)
        {
            System.out.println("broken");
        }
        else {
            System.out.println("not broken");
        }






    }






}

