package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Idfcfirstbank {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("incognito");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-autofilled");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.idfcfirst.bank.in/");
    }

    @AfterClass
    public void tear() {
        driver.quit();
    }

    @Test(priority = 0)
    public void yyGeTest() {
        String title = driver.getTitle();
        System.out.println(title);
    }

    @Test(priority = 1)
    public void urlTest() {
        String url = driver.getCurrentUrl();
        System.out.println(url);
    }

    @Test(priority = 2)
    public void logoTest() {
        boolean logo = driver.findElement(
                By.xpath("(//img[@alt='Logo of IDFC FIRST Bank'])[1]")).isDisplayed();
        System.out.println(logo);
        Assert.assertEquals(logo, true);
    }

    @Test(priority = 3)
    public void windowidTest() {
        String wid = driver.getWindowHandle();
        System.out.println(wid);
    }

    @Test(priority = 4)
    public void searchTest() {
        boolean search = driver.findElement(
                By.cssSelector("#search-main")).isDisplayed();
        Assert.assertTrue(search);
    }

    @Test(priority = 5)
    public void internalvalueTest() {
        String message = driver.findElement(
                By.cssSelector("#search-main")).getAttribute("placeholder");
        System.out.println(message);
    }

    @Test(priority = 6)
    public void payTest() {
        String message = driver.findElement(
                By.xpath("(//a[text()='Pay'])[1]")).getAttribute("href");
        System.out.println(message);
    }

    @Test(priority = 7)
    public void knowmoreTest() {
        String message = driver.findElement(
                        By.xpath("//a[text()='Know more about the bank']"))
                .getAttribute("data-gtm-click-text");
        System.out.println(message.contains("Know more about the bank"));
    }

    @Test(priority = 8)
    public void listTest() {
        int size = driver.findElements(
                By.xpath("//li[@class='menu-item-has-children']")).size();
        if (size == 5)
            System.out.println("correct");
        else
            System.out.println("incorrect");
    }

    @Test(priority = 9)
    public void listsTest() {
        int size = driver.findElements(
                By.xpath("//li[@class='menu-item-has-children']")).size();
        if (size == 5)
            System.out.println("correct");
        else
            System.out.println("incorrect");
    }

    @Test(priority = 10)
    public void listdssTest() {
        String s = driver.findElement(
                By.xpath("//p[contains(text(), 'Become a banker in just 12 months!')]")).getText();
        boolean b = s.contains("Become a banker in just 12 months!");
        System.out.println(b);
    }

    //@Test(priority = 10)
    public void listsdssTest() {
        String s = driver.findElement(
                By.xpath("//p[contains(text(), 'Become a banker in just 12 months!')]")).getAttribute("");

        boolean b = s.contains("Become a banker in just 12 months!");
        System.out.println(b);
    }

    @Test(priority = 11)
    public void listsdssssTest() {
        System.out.println(driver.getTitle());

    }
}