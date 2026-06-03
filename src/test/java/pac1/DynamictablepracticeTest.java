package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;

public class DynamictablepracticeTest {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.w3schools.com/html/html_tables.asp");

    }

    @AfterClass
    public void teardown() {

        driver.close();
    }

    //Get total rows
    @Test(priority = 1)
    public void GeTest() {

        List<WebElement> list =
                driver.findElements(By.xpath("//table[@id='customers']//tbody//tr"));

        int totalrows =
                list.size();
        System.out.println("total rows: " + totalrows);

        for (WebElement wb : list) {
            System.out.println(wb.getText());

        }
    }


    // Test 3 - Get total columns
    @Test(priority = 1)
    public void tiotalTest() {




    }
    }







