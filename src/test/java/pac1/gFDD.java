package pac1;

import java.io.File;

import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.logging.LogManager.*;

public class gFDD {

    WebDriver driver;

    @Test
    public void GTest()
    {
        System.out.println(driver.getTitle());
        click();

    }

    public void click()
    {
try {

    driver.findElement(By.xpath("(//a[normalize-space()='Computers'])[1]")).click();

}
catch (Exception e) {

    e.printStackTrace();
}

finally {
    System.out.println("must be");
}

    }


    @BeforeMethod
    public void a() {

driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://demowebshop.tricentis.com/onepagecheckout");



    }


    @AfterMethod
    public void tear() {
        driver.quit();
    }


}

