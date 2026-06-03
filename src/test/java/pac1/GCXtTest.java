package pac1;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class GCXtTest {

  public static   WebDriver driver;

    @Test
    public void test1Test() throws IOException {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://demowebshop.tricentis.com/onepagecheckout");

        File folder = new File(System.getProperty("user.dir") + "/scnn");
        if (!folder.exists()) folder.mkdirs();

        try {
            driver.findElement(
                    By.xpath("(//a[normalize-space()='Apparelgffdggdgd & Shoes'])[1]")
            ).isDisplayed();

        } catch (Exception e) {

            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);

            File dest = new File(
                    System.getProperty("user.dir") + "/scnn/test1Test.jpg"
            );
            FileUtils.copyFile(src, dest);

            System.out.println("Screenshot captured");
            throw e;
        }
    }





    @Test
    public void tesdt1Test() {


boolean b=
        driver.getTitle().contains("http");
        System.out.println(b);

       // driver.getCurrentUrl();







    }


    @Test
    public void tesdddt1Test() {


    }


    }






