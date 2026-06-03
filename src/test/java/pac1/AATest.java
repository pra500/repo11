package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
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
import java.util.List;

public class AATest {


    WebDriver driver;

    @BeforeClass
    public void beforeClass() {

//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("incognito");
//        options.addArguments("--window-maximize-");
//        options.addArguments("--disable-popup-blocking");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        // driver.get("https://slice.bank.in/");
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

    }

    @AfterClass
    public void afterClass() {


        driver.quit();
    }


    @Test(priority = 1)
    public void geseTest() {
        boolean savings =
                driver.findElement(By.xpath("//a[@aria-label='Savings account']")).isDisplayed();
        Assert.assertTrue(savings);
    }

    @Test(priority = 2)
    public void gexeTest() {
        boolean savings =
                driver.findElement(By.xpath("//a[@aria-label='UPI Credit Card']")).isDisplayed();
        Assert.assertTrue(savings);
    }

    @Test(priority = 3)
    public void gsseeTest() {

        boolean savings =
                driver.findElement(By.xpath("//button[text()='What we offer']")).isDisplayed();
        Assert.assertTrue(savings);
    }

    @Test(priority = 4)
    public void gesseTest() {
        String savings =
                driver.findElement(By.xpath("//div//p[text()='Simple, fast, intelligent banking']")).getTagName();
        System.out.println(savings);          //p
    }

    @Test(priority = 5)
    public void gessseTest() {
        Point savings =
                driver.findElement(By.xpath("//div//p[text()='Simple, fast, intelligent banking']")).getLocation();
        System.out.println(savings.getX());

        System.out.println(savings.getY());

    }

    @Test(priority = 6)
    public void gessdsssexsTest() {
        System.out.println(driver.findElements(By.xpath("//button[text()='Get slice']")).size());
        //   driver.findElements(By.xpath("//button[text()='Get slice']")).size();

    }

    @Test(priority = 6)
    public void gessdsssssseTest() {
        System.out.println(driver.findElements(By.xpath("//button[text()='Get slice']")).size());
        //   driver.findElements(By.xpath("//button[text()='Get slice']")).size();

    }


    @Test(priority = 6)
    public void titleTest() {
        // System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }


    @Test(priority = 6)
    public void urlTest() {
        // System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }


    @Test(priority = 7)
    public void windowhandlingTest() {
        // System.out.println(driver.getTitle());
        System.out.println(driver.getWindowHandle());
    }

    @Test(priority = 8)
    public void windowhansdlingTest() {
        // System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl().contains("https"));

    }

    @Test(priority = 8)
    public void GetalllinksTest() {
        List<WebElement> list =
                driver.findElements(By.tagName("a"));

        for (int i = 0; i <= list.size() - 1; i++) {
            System.out.println(list.get(i).getText());
        }
    }

    @Test(priority = 9)
    public void GetallimagesTest() {
        List<WebElement> list =
                driver.findElements(By.tagName("img"));

        for (int i = 0; i <= list.size() - 1; i++) {
            System.out.println(list.get(i).getText());
        }
        System.out.println(list.size());

    }

    @Test(priority = 9)
    public void GetallimdagesTest() {

        boolean b = driver.findElement(By.xpath("//img[@class='logoClass']")).isDisplayed();
        System.out.println(b);
        boolean bb =
                driver.findElement(By.xpath("//button[text()='Home']")).isDisplayed();
        System.out.println(bb);
    }


    @Test(priority = 9)
    public void GetallximdagesTest() {

        boolean b = driver.findElement(By.xpath("//img[@class='logoClass']")).isDisplayed();
        System.out.println(b);
        boolean bb =
                driver.findElement(By.xpath("//button[text()='Home']")).isDisplayed();
        System.out.println(bb);
    }


    @Test(priority = 10)
    public void fdfTest() {
        boolean b = driver.findElement(By.xpath("(//ul//li//a[text()='Practice'])[1]")).isDisplayed();
        System.out.println(b);
    }


    @Test(priority = 11)
    public void gefvdfest() {
        String b = driver.findElement(By.xpath("//ul//li//a[text()='JMeter']")).getText();
        Assert.assertEquals(b, "JMeter");
    }


    @Test(priority = 11)
    public void geefvdfest() {
        String b = driver.findElement(By.xpath("//ul//li//a[text()='JMeter']")).getText();
        Assert.assertEquals(b, "JMeter");
    }


    @Test(priority = 11)
    public void gefssvdfest() {
        String b = driver.findElement(By.xpath("//ul//li//a[text()='JMeter']")).getText();
        Assert.assertEquals(b, "JMeter");
    }

    @Test(priority = 10)
    public void fdddxfTest() {
        boolean b = driver.findElement(By.xpath("(//ul//li//a[text()='Practice'])[1]")).isDisplayed();
        System.out.println(b);
    }

    @Test(priority = 10)
    public void fddddxfTest() {
        try {
            boolean b = driver.findElement(By.xpath("(//ul//li//a[text()='Practice'])[1]")).isDisplayed();
            System.out.println(b);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("must executed");

        }
    }

    @Test(priority = 10)
    public void fdddddxfTest() {
        boolean b = driver.findElement(By.xpath("(//ul//li//a[text()='Practice'])[1]")).isDisplayed();
        System.out.println(b);
    }

    @Test(priority = 10)
    public void fdddsddxfTest() {
        String color = driver.findElement(By.xpath("(//ul//li//a[text()='Practice'])[1]")).getCssValue("color");
        System.out.println(color);
    }


    @Test(priority = 11)
    public void fdddddddxfTest() {
        boolean b = driver.findElement(By.xpath("(//ul//li//a[text()='Practice'])[1]")).isDisplayed();
        System.out.println(b);
    }


    @Test(priority = 11)
    public void fddddddddxfTest() {
        boolean b = driver.findElement(By.xpath("(//ul//li//a[text()='Practice'])[1]")).isDisplayed();
        System.out.println(b);
    }

    @Test(priority = 13)
    public void fddTest() {
        try {
            WebElement b = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
            clickonelement(b);

            WebElement practice = driver.findElement(By.xpath("//button[contains(text(), 'Signup')]"));
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            System.out.println("must be executed");
        }


    }

    public static void clickonelement(WebElement element) {
        element.click();
    }


    @Test(priority = 13)
    public void fddwwTest() {
        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getTitle());

        System.out.println(driver.getWindowHandle());

    }

    @Test(priority = 13)
    public void fddwddwTest() {
        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getTitle());

        System.out.println(driver.getWindowHandle());

        System.out.println(driver.getCurrentUrl().contains("http"));
    }

    @Test(priority = 13)
    public void verifydropdownTest() throws InterruptedException {

        driver.get("https://demoqa.com/select-menu");

        Thread.sleep(5000);
        WebElement wb =
                driver.findElement(By.cssSelector("#oldSelectMenu"));
        Select select = new Select(wb);
        boolean result = select.isMultiple();
        Assert.assertFalse(result);

        List<WebElement> list = select.getOptions();
        System.out.println(list.size());
        Assert.assertTrue(list.size() > 0);
        Assert.assertEquals(list.size(), 11);

        for (WebElement wb1 : list) {
            System.out.println(wb1.getText());
        }
    }


    @Test(priority = 13)
    public void verifydddropdownTest() throws InterruptedException {

        System.out.println(driver.getWindowHandle());
    }

    @Test(priority = 13)
    public void verTest() throws InterruptedException {

        driver.get("https://demoqa.com/select-menu");
        Thread.sleep(5000);
        WebElement wb =
                driver.findElement(By.cssSelector("#oldSelectMenu"));
        Select select = new Select(wb);
select.selectByValue("Yellow");

    }

}