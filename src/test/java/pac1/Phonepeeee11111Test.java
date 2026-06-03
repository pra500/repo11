package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.*;

import java.time.Duration;

public class Phonepeeee11111Test {


    WebDriver driver;

    @BeforeClass
    public void Phonepeeccee11111()
    {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.phonepe.com/");


    }

    @AfterClass
    public void tear() {

        driver.quit();

    }



@Test
public void alllitemsTest()
{


    List<WebElement>list=
    driver.findElements(By.xpath("//div[@class='index-module--navigationLinks--a2c52']"));
    System.out.println(list.size());


    for(WebElement ww:list)
    {
        System.out.println(ww.getText());
    }


}

    @Test
    public void alddllitemsTest()
    {

boolean b=
        driver.getCurrentUrl().contains("https");
        Assert.assertTrue(b);



    }



    @Test
    public void alllitdfemsTest() {

        boolean b=
        driver.getPageSource().contains("div");
        System.out.println(b);

    }



    @Test
    public void alllitdfffemsTest() {

        boolean b=
                driver.getPageSource().contains("div");
        System.out.println(b);

    }



    @Test
    public void alllitdfsffemsTest() {

        boolean b=
                driver.getPageSource().contains("div");
        System.out.println(b);

    }


    @Test
    public void alllitdfsddffemsTest() {

        boolean b=
                driver.getPageSource().contains("img");
        System.out.println(b);

    }

    @Test
    public void alllitsdfsddffemsTest() {

        System.out.println(driver.getWindowHandle());
      // driver.getWindowHandle()
    }


    }





