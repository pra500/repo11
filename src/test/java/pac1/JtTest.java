package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class JtTest {

    WebDriver driver;
    // Cultpage cp;


    //WebDriver driver;

    @BeforeClass
    public void setup() {

//        ChromeOptions co = new ChromeOptions();
//        co.addArguments("--incognito");
//        co.addArguments("--headless");
//        co.addArguments("--no-sandbox");
//        co.addArguments("start-maximized");
//        co.addArguments("disable-autofill");
//        co.addArguments("disable-extensions");
//        co.addArguments("disable-infobars");
//        co.addArguments("window-size=1920,1080");
//        co.addArguments("disable-password-manager-reauthentication");


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
        // driver.get("https://proleed.academy/exercises/selenium/automate-the-signup-form-using-selenium-webdriver.php");
        //  driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");


        driver.get("https://www.opencart.com/");
    }


    @AfterClass
    public void ee() {
        driver.quit();

    }


    @Test
    public void ggTest() {
        boolean b =
                driver.findElement(By.xpath("(//a[text()='Features'])[2]")).isDisplayed();
        System.out.println(b);

        boolean b1 =
                driver.findElement(By.xpath("(//a[text()='Demo'])[2]")).isDisplayed();
        System.out.println(b1);


        boolean b2 =
                driver.findElement(By.xpath("//a[text()='Terms & Conditions']")).isDisplayed();
        System.out.println(b2);


        boolean b3 =
                driver.findElement(By.xpath("(//a[text()='OpenCart Books'])[2]")).isDisplayed();
        System.out.println(b3);

        boolean b33 =
                driver.findElement(By.xpath("//li//a[text()='Privacy Policy']")).isDisplayed();
        System.out.println(b33);

        System.out.println(driver.getTitle());
       // driver.getTitle()



    }


}