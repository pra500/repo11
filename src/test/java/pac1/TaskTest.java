package pac1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TaskTest {


    WebDriver driver;
    JavascriptExecutor js;


    @BeforeClass
    public void setup() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-popup-blocking");
        //  options.addArguments("ac

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        //driver.get("https://juspay.io/in");

        // driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//        driver.findElement(By.cssSelector(".IntegrationModal-viewDemoBtn")).click();


        // driver.get("https://jsonplaceholder.typicode.com/users");
        //driver.get("https://demoqa.com/text-box");

        driver.get("https://demoqa.com/checkbox");

    }

    public void teardown() {
        driver.quit();

    }


    @Test
    public void menuTest() throws Exception {
//
//        String title=
//        driver.getTitle();
//
//        System.out.println(title);
//
//boolean flag=
//        title.contains("Sample API For Testing | Beeceptor");
//        Assert.assertTrue(flag);


        //  driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("selenium", Keys.ENTER);
//
//        int alllinks=
//        driver.findElements(By.xpath("//a")).size();
//        System.out.println(alllinks);


//        List<WebElement> list= driver.findElements(By.tagName("pre"));
//
//        System.out.println(list.size());


//
//
//        System.out.println(driver.findElement(By.tagName("pre")).getText());
//
//    List<WebElement>list= driver.findElements(By.tagName("pre"));
//
//
//    for(int i=0;i<=list.size()-1;i++)
//    {
//        if(list.get(i).getText().equalsIgnoreCase("username"))
//        {
//            System.out.println(list.get(i).getText());
//            break;
//        }
//    }
//
//
//
//


        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("admin#23334@gmail.com");

//        js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(600, 850)", "");

        WebElement wb =
                driver.findElement(By.xpath("//div//button[text()='Submit']"));


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//button[text()='Submit']")));

        wb.click();

        //button[@id='submit']
//driver.findElement(By.xpath("//div//button[text()='Submit']")).click();

        driver.quit();
//button[@id='submit']

//span[@role='checkbox']





    }

}
