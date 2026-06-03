package pac1;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class AbhibustrialTest {

    //   https://www.abhibus.com/


    //tc1: title
    //tc2: url
    //tc3: windowh
    //tc4: bus then check url
    //tc5: flights then check url
    //tc6: trains then check url
    // tc7: hotels then check url
    // tc8: track ticket then check url
    //tc9: need help then check url
    //tc10: login


    WebDriver driver;

    @BeforeClass
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito=new");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.abhibus.com/");
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
        Assert.assertEquals(driver.getTitle(), "Book Bus Tickets Online at Lowest Fare, Upto ₹500 off On Bus Booking | AbhiBus");

    }

    @Description("checking url of the page....")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 1)
    public void urlTest() {
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.abhibus.com/");

    }

    @Description("getting current window id....")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 2)
    public void windowhandleTest() {
        System.out.println(driver.getWindowHandle());
    }


    @Description("checking flightspageurl....")
    @Severity(SeverityLevel.BLOCKER)
    @Test(priority = 3)
    public void flightspageurlTest() {
        WebElement flights = driver.findElement(By.id("flights-link"));
        flights.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ixigo.com/flights?utm_source=abhibus&utm_medium=abhiwebf");
        driver.navigate().back();
    }


    @Description("checking hotelspageurl....")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 4)
    public void hotelspageurlTest() {
        WebElement www = driver.findElement(By.id("hotel-link"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", www);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ixigo.com/hotels?utm_source=abhibus&utm_medium=abhiwebh");
        driver.navigate().back();
    }

    @Description("checking trainpageurl....")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 5)
    public void trainspageurlTest() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement trains = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("train-link']")));
        trains.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://trains.abhibus.com/?channel=abhibus-web");
        driver.navigate().back();
    }

    @Description("checking trackticketpageurl....")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 6)
    public void trackticketTest() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement tracktickets = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("track-link")));
        tracktickets.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.abhibus.com/track");
        driver.navigate().back();
    }

    @Description("checking needhelppageurl....")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 7)
    public void needhelpTest() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement needhelp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("need-help-link")));
        Assert.assertTrue(needhelp.isDisplayed());

    }

    @Description("checking offerspageurl....")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 8)
    public void offersTest() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement trains = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("offers-link")));
        trains.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.abhibus.com/bus-ticket-offers");
        driver.navigate().back();
    }

    @Description("checking logo....")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 9)
    public void logoTest() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[local-name()='svg' and @id='abhibus-logo']")));
        Assert.assertTrue(logo.isDisplayed());

    }

    @Description("checking trustedsign....")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 10)
    public void trustedsignTest() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement trustedby = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[local-name()='svg' and @id='trusted-by']")));
        Assert.assertTrue(trustedby.isDisplayed());
        driver.navigate().back();

    }


}
