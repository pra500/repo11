package pac1;

import com.sun.nio.sctp.SctpSocketOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class YatraaaaTest {

    WebDriver driver;

    @BeforeClass
    public void setup() {
ChromeOptions options=new ChromeOptions();
options.addArguments("incognito");
options.addArguments("disable-extensions");
options.addArguments("no-sandbox");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://demoqa.com/select-menu");
    }

    @AfterClass
    public void teardown() {
        driver.quit();

    }


    @Test(priority = 0)
    public void titleTest() {
        WebElement wb=
  driver.findElement(By.xpath("//select[@id='cars']"));
        Select sel=new Select(wb);
        sel.selectByVisibleText("Saab");
        sel.selectByVisibleText("Opel");
        sel.deselectByVisibleText("Opel");
        sel.deselectByVisibleText("Saab");

        List<WebElement> list=
        sel.getOptions();
        System.out.println(list.size());




    }
}

