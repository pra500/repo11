package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class Svgelements {

    WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void b1() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.get("https://www.worldometers.info/coronavirus/country/india/");

    }

    @AfterClass(alwaysRun = true)
    public void b2() {

        driver.quit();

    }

    @Test
    public void geTest() {
        boolean text =
                driver.findElement(By.xpath("(//*[name()='svg']//*[local-name()='rect'])[1]")).isDisplayed();
        System.out.println(text);

        boolean b =
                driver.findElement(By.xpath("(//*[name()='svg']//*[local-name()='desc'])[1]")).isDisplayed();
        System.out.println(b);








    }
}
