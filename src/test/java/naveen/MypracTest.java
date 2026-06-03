package naveen;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class MypracTest {

WebDriver driver;

    @Description("checking login page title")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 0)
    public void loginPageTitleTest(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        Assert.assertEquals(driver.getTitle(), "Test Login | Practice Test Automation");
        driver.quit();


          }

    @Description("checking login page title")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 0)
    public void loginPageUrlTest(){


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://practicetestautomation.com/practice-test-login/");
        driver.quit();

        }

    @Description("checking login page title")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 0)
    public void alllinksTest(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        List<WebElement> list= driver.findElements(By.tagName("a"));
        for(WebElement wb:list)
        {
            System.out.println(wb.getText());
        }
        driver.quit();

    }
}
