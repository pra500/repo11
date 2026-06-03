package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Wrongscript {


@Test
public void geeTest()
{

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.testfire.net/login.jsp");

        WebElement username = driver.findElement(By.id("uid"));
        WebElement password = driver.findElement(By.id("passw"));
        WebElement loginBtn = driver.findElement(By.name("btnSubmit"));

       // driver.navigate().refresh();


        username.sendKeys("admin");
        password.sendKeys("admin");
        loginBtn.click();

    }
}
