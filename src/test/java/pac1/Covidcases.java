package pac1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Covidcases
{
    WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void b1() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
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

    }

    @Test
    public void gssedsTest() {
        System.out.println(driver.getTitle());


    }

    @Test
    public void gsddseTest() {
        System.out.println(driver.getCurrentUrl());


    }
    @Test
    public void gsseTest() {
        System.out.println(driver.getCurrentUrl().toLowerCase());


    }  @Test
    public void gss22seTest() {
        System.out.println(driver.getPageSource().contains("div"));


    }
    @Test
    public void gs222sseTest() {
        System.out.println(driver.getTitle());


    }  @Test
    public void gssssseTest() {
        System.out.println(driver.getCurrentUrl().toUpperCase());


    }
    @Test
    public void gss22wwseTest() {
        System.out.println(driver.getCurrentUrl().toUpperCase());



    }

    @Test
    public void gsssseTest() {
        System.out.println(driver.getTitle().toUpperCase());


    }


    @Test
    public void gsswwseTest() {
        System.out.println(driver.getTitle());


    }












}




