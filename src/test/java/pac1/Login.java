package pac1;

import abccc.ExtentManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Login {


    WebDriver driver;
    ExtentTest test = ExtentManager.getInstance().createTest("my loginnnn test this is");


    @BeforeClass
    public void setup() {

        test.info("launching the driver");

        driver = new ChromeDriver();

        test.info("maximizing the window");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://demo.automationtesting.in/Register.html");

    }




    @AfterClass
    public void afterClass() {
        test.info("quitting the driver");
        driver.quit();
    }




    @Test(priority = 0)
    public void test1Test() {

        test.info("printing title");
        System.out.println(driver.getTitle());

    }
}

