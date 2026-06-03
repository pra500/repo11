package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Ge {

WebDriver driver;

    @Test(priority = 1)
    public void geTest()
    {


        driver = new ChromeDriver();
        driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.highcharts.com/demo");


    }



    @Test(priority = 2)
    public void geTedTTest()
    {



    }
}
