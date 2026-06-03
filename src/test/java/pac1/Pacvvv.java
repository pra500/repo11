package pac1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.time.Duration;
import java.util.List;

public class Pacvvv {

    WebDriver driver;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.wanderfly.in/");

    }


    @AfterClass
    public void afterClass() {
        driver.quit();
    }


    @Test(priority = 0)
    public void test1Test() {


        boolean flag = driver.findElement(By.xpath("//a[starts-with(@id, 'contact_us_btn')]")).isDisplayed();
        Assert.assertEquals(flag, true);

        List<WebElement> list =
                driver.findElements(By.tagName("a"));
        System.out.println(list.size());


        List<WebElement> list1 =
                driver.findElements(By.tagName("img"));
        System.out.println(list1.size());


        List<WebElement> lisww =
                driver.findElements(By.tagName("div"));
        System.out.println(lisww.size());


        List<WebElement> list2 =
                driver.findElements(By.tagName("strong"));
        System.out.println(list2.size());


        List<WebElement> listww2 =
                driver.findElements(By.tagName("link"));
        System.out.println(listww2.size());


        List<WebElement> listwdew2 =
                driver.findElements(By.tagName("style"));
        System.out.println(listww2.size());


        List<WebElement> list99 =
                driver.findElements(By.tagName("button"));
        System.out.println(list99.size());


        List<WebElement> list9 =
                driver.findElements(By.tagName("input"));
        System.out.println(list9.size());


        List<WebElement> list8 =
                driver.findElements(By.tagName("script"));
        System.out.println(list8.size());


    }


}
