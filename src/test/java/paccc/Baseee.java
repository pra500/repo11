package paccc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Baseee {

   public static WebDriver driver;

    Baseee(WebDriver driver)
    {
        this.driver=driver;
    }

   public static void getlaunch()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://vinothqaacademy.com/drop-down/");
    }
}




