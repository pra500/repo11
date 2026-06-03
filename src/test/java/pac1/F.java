package pac1;


import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;


public class F {

Logger log= LogManager.getLogger(F.class);
    WebDriver driver;

    @BeforeClass
    public void setup() {
        log.error("erroring");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://demo.automationtesting.in/Register.html");

    }




    @AfterClass
    public void afterClass() {
        driver.quit();
    }



    @Test(priority = 0)
    public void test1Test() {

        System.out.println(driver.getTitle());


    }
}




