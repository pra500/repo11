package pac1;

import net.bytebuddy.implementation.auxiliary.MethodCallProxy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class nnTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {

        ChromeOptions options=new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("incognito");
        options.addArguments("--disable-infobars");
        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
       // driver.get("https://www.demoblaze.com/index.html");

        driver.get("https://www.makemytrip.com/");

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    /*
    @Test(priority = 1)
    public void Url() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.demoblaze.com/index.html");
    }

    @Test(priority = 2)
    public void title() {
        // Assert.assertEquals(driver.getTitle(), "Get the Best Fitness Workouts, Gyms and Sports in India | cult.fit");

        WebElement wb = driver.findElement(By.xpath("//a[text()='Sign up']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", wb);

        js.executeScript("window.scrollBy(200, 300)", "");
    }

    @Test(priority = 3)
    public void tiddtle() throws InterruptedException {
        driver.get("https://www.makemytrip.com/");
        Thread.sleep(5000);
        //driver.findElement(By.xpath("https://www.makemytrip.com/")).click();
        String arff =
                driver.findElement(By.xpath("//img[@alt='Make My Trip']")).getAriaRole();
        System.out.println(arff);

    }
     */


    @Test(priority = 4)
    public void tidssdtle() throws InterruptedException {

Thread.sleep(4000);
        String arff =
                driver.findElement(By.xpath("//a[@data-cy='mmtLogo']")).getAttribute("src");
        System.out.println(arff);
        driver.findElement(By.xpath("//img[@alt='Make My Trip']")).click();

   }
    @Test(priority = 4)
    public void dropdownTest() throws InterruptedException {

        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(4000);

        WebElement wb=
                driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        Select select=new Select(wb);
        select.selectByVisibleText("Option2");


        System.out.println(driver.getCurrentUrl());
     //   driver.getCurrentUrl()  ;

    }


    @Test(priority = 4)
    public void dropdosswnTest() throws InterruptedException {

        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(4000);

        WebElement wb=
                driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        Select select=new Select(wb);
        select.selectByIndex(1);


        System.out.println(driver.getCurrentUrl());
        //   driver.getCurrentUrl()  ;






    }

}

