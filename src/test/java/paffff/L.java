package paffff;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class L {


    WebDriver driver;

    @Test
    public void testddTest()
    {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@name='usersdname']"));

        gets();

    }



public void gets()
{

    TakesScreenshot ts= (TakesScreenshot) driver;
   // ts.get

   // System.getProperty("user.dir" + "/sv" + "im1" + ".png" ;

}



}
