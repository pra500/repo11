package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class dv{

    WebDriver driver;


    @Parameters("b")
@Test
public void gessTest(String b) {

if(b.equalsIgnoreCase("Chrome"))
{
    driver = new ChromeDriver();

}
else if(b.equalsIgnoreCase("Firefox"))
{
    driver = new FirefoxDriver();
}
else
{
    System.out.println("wrong browsername");

}


    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
    driver.manage().deleteAllCookies();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

   String s= driver.getPageSource();
    System.out.println(s);
    System.out.println( driver.getTitle().toUpperCase());

}

}

