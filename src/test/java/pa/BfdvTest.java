package pa;

import baseeeeeeeeee.G;
import baseeeeeeeeee.Pageeee;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class BfdvTest {


 WebDriver driver;
Pageeee p;


@BeforeClass
public void beforeClass()
{
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
    driver.manage().deleteAllCookies();
    driver.get("https://practicetestautomation.com/practice-test-login/");
}


@Test
public void beforeCladdssTest() {

    p=new Pageeee(driver);
    p.get();

}





}
