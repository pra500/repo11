package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class BrokenpracccTest {


    WebDriver driver;

    @Test
    public void brokenlinkwssssTest() throws Exception {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        // driver.get("https://www.opencart.com/");

        // driver.get("https://katalon.com/resources-center/blog/api-examples");
        driver.get("https://restful-api.dev/");


        List<WebElement> list = driver.findElements(By.tagName("a"));

        int size = list.size();

        for (int i = 0; i <= size - 1; i++) {

            WebElement s22 = list.get(i);
            String s1 = s22.getAttribute("href");
            brokenlinks(s1);
        }

        int totalbuttons =
                driver.findElements(By.tagName("button")).size();
        System.out.println("totalbuttons are " + totalbuttons);


        int totalinput =
                driver.findElements(By.tagName("input")).size();






        System.out.println(driver.getWindowHandle());

        System.out.println(driver.getTitle());

        boolean b=
                driver.getPageSource().contains("div");
        Assert.assertTrue(b);

        driver.quit();


    }


    public static void brokenlinks(String s) throws IOException {

        URL u = new URL(s);
        HttpURLConnection huc = (HttpURLConnection) u.openConnection();
        huc.connect();
        huc.setConnectTimeout(4000);
        int code = huc.getResponseCode();

        if (code == 200 || code == 201 || code == 204 || code == 205)
            System.out.println(huc.getResponseMessage() + " " + "it's not broken");
        else
            System.out.println(huc.getResponseMessage() + " " + "it's broken");

    }


}