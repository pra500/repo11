package pac1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class GtTest {

    WebDriver driver;

    @Parameters("browser")
    @BeforeMethod
    public void logine(String browser){


        if(browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }
        else {

            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://practicetestautomation.com/practice-test-login/");


   }

@Test
    public void loginddTest(){
    System.out.println(driver.getTitle());

}

    @Test
    public void loginddsdvTest(){
        System.out.println(driver.getCurrentUrl());

    }


}
