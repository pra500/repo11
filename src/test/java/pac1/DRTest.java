package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;


public class DRTest {

    WebDriver driver;


    @Test
    public void etTest() {


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();

        driver.get("https://checkout.stripe.dev/");

        driver.findElement(By.xpath("//button[starts-with(text(), 'View')]")).click();

        String title =
                driver.getTitle();
        System.out.println(title);
    }

    @Test
    public void eTtTest() {

        driver.findElement(By.xpath("//div[@class='Modal-Portal']")).click();

        System.out.println(driver.getTitle());


    }


    @Test
    public void eTddtTest() {

        driver.findElement(By.xpath("")).click();



    }


    @Test
    public void eTdddtTest() {

        driver.findElement(By.xpath("")).click();



    }


}



