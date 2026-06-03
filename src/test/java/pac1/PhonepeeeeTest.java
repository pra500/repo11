package pac1;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class PhonepeeeeTest {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("no-sandbox");
        options.addArguments("disable-infobars");
        options.addArguments("disable-popup-blocking");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.phonepe.com/");
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }


    @Description("checking title of the page....")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 0)
    public void titleTest() {
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "PhonePe: UPI Payments, Investment, Insurance, Recharges, DTH & More");

    }

    @Description("checking url of the page....")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 1)
    public void urlTest() {
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.phonepe.com/");

    }

    @Description("checking total images of the page....")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 2)
    public void totalimagesTest() {
        int totalimages = driver.findElements(By.tagName("img")).size();
        System.out.println(totalimages);

    }

    @Description("checking total links of the page....")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 3)
    public void totallinksTest() {
        int totalimages = driver.findElements(By.tagName("a")).size();
        System.out.println(totalimages);
    }


    @Description("checking InvestorRelations presence....")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 4)
    public void InvestorRelationsTest() {
        boolean InvestorRelations = driver.findElement(By.xpath("(//a[text()='Investor Relations'])[1]")).isDisplayed();
        Assert.assertTrue(InvestorRelations);

    }

    @Description("checking logo....")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 5)
    public void logoTest() {
        boolean logo = driver.findElement(By.xpath("//img[@alt='PhonePe | Logo']")).isDisplayed();
        Assert.assertTrue(logo);

    }

    @Description("checking url of the page....")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 6)
    public void fdvTest() {

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(19));
   WebElement wb= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(text(), 'Contact Us')])[1]")));

       // String contactus = driver.findElement(By.xpath("(//a[contains(text(), 'Contact Us')])[1]")).getText();

        Assert.assertEquals(wb, "CONTACT US");

    }


    @Description("checking url of the page....")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 6)
    public void fdddvTest() {

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(19));
        WebElement wb= wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("")));

        // String contactus = driver.findElement(By.xpath("(//a[contains(text(), 'Contact Us')])[1]")).getText();

        Assert.assertEquals(wb, "CONTACT US");

    }


    @Description("checking url of the page....")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 6)
    public void fdddddvTest() {

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(19));
        WebElement wb= wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("")));

        // String contactus = driver.findElement(By.xpath("(//a[contains(text(), 'Contact Us')])[1]")).getText();

        Assert.assertEquals(wb, "CONTACT US");

    }


    @Description("checking url of the page....")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 6)
    public void fdddddddvTest() {

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(19));
        WebElement wb= wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("")));

        // String contactus = driver.findElement(By.xpath("(//a[contains(text(), 'Contact Us')])[1]")).getText();

        Assert.assertEquals(wb, "CONTACT US");

    }



    @Description("checking url of the page....")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 6)
    public void fddddddddvTest() {
        System.out.println(driver.getTitle());
       // driver.getTitle()

        System.out.println(driver.getCurrentUrl());

        System.out.println("---------");
        System.out.println(driver.findElements(By.tagName("img")).size());
        //driver.findElements(By.tagName("img")).size();


    }
}