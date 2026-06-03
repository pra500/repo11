package pac1;

import org.assertj.core.error.ShouldHaveSizeLessThanOrEqualTo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.Arrays;

public class GGTest {

    public static WebDriver driver;

    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
        driver.get("https://www.htmlelements.com/demos/dropdownlist/multiple-selection/index.htm");
        driver.navigate().refresh();
        Assert.assertEquals(driver.getTitle(), "DropDownList Multiple Selection"
        );
        back();
        baddck();
          }

          public static void back()
          {
              driver.navigate().back();
              driver.navigate().forward();

          }



    public static void baddck()
    {
        driver.navigate().back();
        driver.navigate().forward();

    }
}
