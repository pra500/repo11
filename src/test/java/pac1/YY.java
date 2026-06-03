package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class YY {

    public static WebDriver driver;

    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();
        driver.get("https://www.opencart.com/");
    String s=    gettitlepage();
        System.out.println(s);

        driver.quit();

    }
    public static String gettitlepage()
    {

      return driver.getTitle();
    }

    public static String gettsdditlepage()
    {

        return driver.getTitle();
    }

}


