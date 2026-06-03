package pac1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class xcv {

    WebDriver driver;


    @Test
    public void geTest() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://beeceptor.com/docs/sample-api-for-testing/");

        driver.navigate().forward();


        driver.get("https://github.com/pra500?tab=repositories");

        System.out.println(driver.getTitle());

//driver.getTitle()

    }


    @Test

    public void gddeTest() {

        System.out.println(driver.getCurrentUrl());
       // driver.getCurrentUrl()
    }




    }




