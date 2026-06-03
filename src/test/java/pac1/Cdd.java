package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Cdd {

    WebDriver driver;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();


        //driver.get("https://www.tricentis.com/");

        driver.get("https://selectorshub.com/");

    }
/*


    //@BeforeClass
    public void sestup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://lovable.dev/");
        driver.getTitle().contains("Lovable - Build Apps & Websites with AI, Fast | No Code App Builder");


    }

    public void teardown() {
        driver.quit();

    }


    @Test(priority = 0)
    public void cDDddTest() {

        String title = driver.getTitle();
        Assert.assertEquals(title, "CodePen Search");

    }


    @Test(priority = 1)
    public void cDDdsdsdddTest() {
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("circle");
      boolean b=  driver.findElement(By.xpath("//div//a[contains(text(), 'Search')]")).isDisplayed();

        System.out.println(b);



    }
    @Test(priority = 1)
    public void cDDdddsdddTest() {

        String url = driver.getCurrentUrl();

        Assert.assertEquals(url, "https://codepen.io/search/pens?q=svg%20chart");

    }

    @Test(priority = 1)
    public void cDDfdddsdddTest() {

        System.out.println(driver.getTitle());


    }


    @Test(priority = 1)
    public void cDDffdddsdddTest() {

        System.out.println(driver.getCurrentUrl());
       // System.out.println(driver.getCurrentUrl());
        }




    @Test(priority = 1)
    public void cDffdddsdddTest() {
    int size=
        driver.findElements(By.xpath("//span[text()='CodePen Home']")).size();
        System.out.println(size);

    }
*/

    @AfterClass
public void teardown()
    {
        driver.quit();
    }
   @Test(priority = 1)
    public void cDffdddsddTest() {
        driver.findElement(By.xpath("//a//p[text()='Trials & demos']")).click();
       String text= driver.findElement(By.xpath("//h2[text()='Experience the difference for yourself']")).getText();
       Assert.assertEquals(text, "Experience the difference for yourself");
    }


    @Test(priority = 1)
    public void cDffdddxdddsddTest() {

       String text=
        driver.findElement(By.xpath("//div//p[text()='Solutions']")).getText();
        System.out.println(text);
String text1=driver.findElement(By.xpath("(//div//p[text()='Services & Support'])[1]")).getText();
        System.out.println(text1);

        WebElement wb=
                driver.findElement(By.xpath("//div//a[text()='Trust & Security']"));
boolean b=
        wb.isDisplayed();
        System.out.println(b);

        String texte=
wb.getText();
        System.out.println(texte);

        Point p=
        wb.getLocation();

        System.out.println(p.getX());
        System.out.println(p.getY());
    }



    @Test(priority = 1)
    public void cDffddddxdddsddTest() {


        System.out.println(driver.getWindowHandle());

boolean b=
        driver.getCurrentUrl().contains("https://selectorshub.com/");
        System.out.println(b);

String title=
driver.getTitle();
        System.out.println(title);

        boolean b1=
        driver.getPageSource().contains("div");
        System.out.println(b1);

        boolean b2=
        driver.getPageSource().contains("input");
        System.out.println(b2);


        boolean b3=
                driver.getPageSource().contains("button");
        System.out.println(b2);
    }

}
