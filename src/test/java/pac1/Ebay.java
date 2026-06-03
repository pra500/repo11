package pac1;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Ebay {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        options.addArguments("no-sandbox");
        options.addArguments("disable-infobars");
        options.addArguments("disable-notifications");
        options.addArguments("disable-popup-blocking");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.get("https://www.ebay.com/");
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }

    @Description("verify page title....")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 0)
    public void titleTest() {

        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title, "Electronics, Cars, Fashion, Collectibles & More | eBay");

    }
    @Description("verify page url....")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 1)
    public void urlTest() {

        String url = driver.getCurrentUrl();
        System.out.println(url);
        Assert.assertEquals(url, "https://www.ebay.com/");

    }
    @Description("verify current window id....")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 2)
    public void windowIdTest() {

        String windowHandle = driver.getWindowHandle();
        System.out.println(windowHandle);

    }
    @Description("verify register link......")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 3)
    public void registerTest() {
        WebElement logo =
                driver.findElement(By.xpath("//*[local-name()='svg' and @id='gh-logo']"));
        boolean flag =
                logo.isDisplayed();
        Assert.assertTrue(flag);
        }


    @Test(priority = 4)
    public void signinTest() {
        WebElement s =
                driver.findElement(By.xpath("(//a[text()='Sign in'])[1]"));
        boolean searchbar =
                s.isDisplayed();
        Assert.assertTrue(searchbar);
        s.click();
        Assert.assertEquals(
                driver.getCurrentUrl(), "https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&sgfl=gh&ru=https%3A%2F%2Fwww.ebay.com%2F");

        String text = driver.findElement(By.xpath("//p[contains(text(), 'To buy and sell on ')]")).getText();
        Assert.assertTrue(text.contains("To buy and sell on"));
        driver.navigate().back();
    }

    /*
    @Description("verify searchbar....")
    @Severity(SeverityLevel.NORMAL)
    //@Test(priority = 3)
    public void searchTest() {
        WebElement s =
                driver.findElement(By.cssSelector("input[aria-label='Search for anything']"));
        boolean searchbar =
                s.isDisplayed();
        Assert.assertTrue(searchbar);
        s.sendKeys("clothes", Keys.ENTER);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/sch/i.html?_nkw=clothes&_sacat=0&_from=R40&_trksid=p4624852.m570.l1313");
        //driver.getCurrentUrl(), "https://www.ebay.com/sch/i.html?_nkw=clothes&_sacat=0&_from=R40&_trksid=p4624852.m570.l1313"

    }




    @Test(priority = 5)
    public void serachTest() {
        WebElement s =
                driver.findElement(By.xpath("input[aria-label='Search for anything']"));
        boolean searchbar =
                s.isDisplayed();
        Assert.assertTrue(searchbar);
        s.sendKeys("clothes", Keys.ENTER);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/sch/i.html?_nkw=clothes&_sacat=0&_from=R40&_trksid=p4624852.m570.l1313");
        //driver.getCurrentUrl(), "https://www.ebay.com/sch/i.html?_nkw=clothes&_sacat=0&_from=R40&_trksid=p4624852.m570.l1313"
    }

    @Test(priority = 6)
    public void Test() {
        WebElement logo =
                driver.findElement(By.xpath("//*[local-name()='svg' and @id='gh-logo']"));
        boolean flag =
                logo.isDisplayed();
        Assert.assertTrue(flag);
        //  s.sendKeys("clothes", Keys.ENTER);
        //  Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/sch/i.html?_nkw=clothes&_sacat=0&_from=R40&_trksid=p4624852.m570.l1313");
        //driver.getCurrentUrl(), "https://www.ebay.com/sch/i.html?_nkw=clothes&_sacat=0&_from=R40&_trksid=p4624852.m570.l1313"
    }

    @Test(priority = 6)
    public void logddoTest() {
        WebElement logo =
                driver.findElement(By.xpath("//*[local-name()='svg' and @id='gh-logo']"));
        boolean flag =
                logo.isDisplayed();
        Assert.assertTrue(flag);
        //  s.sendKeys("clothes", Keys.ENTER);
        //  Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/sch/i.html?_nkw=clothes&_sacat=0&_from=R40&_trksid=p4624852.m570.l1313");
        //driver.getCurrentUrl(), "https://www.ebay.com/sch/i.html?_nkw=clothes&_sacat=0&_from=R40&_trksid=p4624852.m570.l1313"
    }@Test(priority = 6)
    public void logoTest() {
        WebElement logo =
                driver.findElement(By.xpath("//*[local-name()='svg' and @id='gh-logo']"));
        boolean flag =
                logo.isDisplayed();
        Assert.assertTrue(flag);
        //  s.sendKeys("clothes", Keys.ENTER);
        //  Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/sch/i.html?_nkw=clothes&_sacat=0&_from=R40&_trksid=p4624852.m570.l1313");
        //driver.getCurrentUrl(), "https://www.ebay.com/sch/i.html?_nkw=clothes&_sacat=0&_from=R40&_trksid=p4624852.m570.l1313"
    }
*/


}

