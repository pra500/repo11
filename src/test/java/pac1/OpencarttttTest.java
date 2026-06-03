package pac1;

import com.aventstack.extentreports.reporter.configuration.Theme;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class OpencarttttTest {

    WebDriver driver;
    JavascriptExecutor js;

    @BeforeClass
    public void setup() {
        ChromeOptions options=new  ChromeOptions();
        options.addArguments("incognito");
        options.addArguments("no-sandbox");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://homeloans.hdfc.bank.in/");
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }

    @Description("checking title...")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 0)
    public void titleTest() {
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("Housing Finance | Home Finance Company | HDFC Bank Ltd"));
    }

    @Description("checking url...")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 1)
    public void urlTest() {
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("https://homeloans.hdfc.bank.in/"));
        // driver.getCurrentUrl().contains("https://homeloans.hdfc.bank.in/")
    }

    @Description("checking windowhandling...")
    @Severity(SeverityLevel.BLOCKER)
    @Test(priority = 2)
    public void windowhandlingTest() {
        System.out.println(driver.getWindowHandle());
    }
/*
    @Description("checking language....")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 3)
    public void marathilanguageTest() {
        WebElement language = driver.findElement(By.xpath("//select[@id='langSelect']"));
        Select sel = new Select(language);
        boolean singleselectcheck = sel.isMultiple();
        System.out.println("the drop down is considered: " + singleselectcheck);
        Assert.assertFalse(singleselectcheck);
        sel.selectByIndex(2);
driver.navigate().back();
    }

    @Description("checking pre-verified properties......")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 4)
    public void preverifiedpropertiesTest() {

        WebElement pre = driver.findElement(By.xpath("(//a[text()='Pre-verified Properties'])[1]"));
        pre.click();
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(), "https://homeloans.hdfc.bank.in/project-search");

    }
    @Description("checking blogs....")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)



   //new code:

    @Description("checking blogs....")
    @Severity(SeverityLevel.CRITICAL)
    //@Test(priority = 5)
    public void HomeLoanProductsTest()  throws InterruptedException {
        WebElement HomeLoanProducts= driver.findElement(By.xpath("(//a[contains(text(), 'Home Loan Products')])[1]"));
        Actions act=new Actions(driver);
        act.moveToElement(HomeLoanProducts).build().perform();

        //WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(9));
     //WebElement w=   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(), 'Non Housing Loans')]")));

        Thread.sleep(6000);

        WebElement w=
                driver.findElement(By.xpath("//li[contains(text(), 'Non Housing Loans')]"));
          js=(JavascriptExecutor)driver;
         js.executeScript("arguments[0].click();", w);
           //  w.click();
       // driver.findElement(By.xpath("//li[contains(text(), 'Non Housing Loans')]")).click();
        //Assert.assertEquals(driver.getCurrentUrl(), "https://homeloans.hdfc.bank.in/non-housing-loans");
        driver.navigate().back();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("checking blogs....")
    @Test(priority = 5)
    public void instantcallbackTest() {

        WebElement instantcallback= driver.findElement(By.xpath("//b[contains(text(), 'Get an instant call back')]"));
        instantcallback.click();
        driver.findElement(By.xpath("(//span[@class='cmp-button__text'])[1]")).click();
Assert.assertTrue(driver.getCurrentUrl().contains("https://homeloans.hdfc.bank.in/"));
    }

    @Description("checking blogs....")
    @Severity(SeverityLevel.CRITICAL)
    //@Test(priority = 5)
    public void HomeLoanProductsssTest() {
        WebElement HomeLoanProducts= driver.findElement(By.xpath("(//a[contains(text(), 'Home Loan Products')])[1]"));
        Actions act=new Actions(driver);
        act.moveToElement(HomeLoanProducts).build().perform();
        driver.findElement(By.xpath("//li[contains(text(), 'Non Housing Loans')]")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://homeloans.hdfc.bank.in/non-housing-loans");
        driver.navigate().back();
    }

    @Description("checking blogs....")
    @Severity(SeverityLevel.CRITICAL)
    //@Test(priority = 5)
    public void HomeLoansProddductsssTest() {
        WebElement HomeLoanProducts= driver.findElement(By.xpath("(//a[contains(text(), 'Home Loan Products')])[1]"));
        Actions act=new Actions(driver);
        act.moveToElement(HomeLoanProducts).build().perform();
        driver.findElement(By.xpath("//li[contains(text(), 'Non Housing Loans')]")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://homeloans.hdfc.bank.in/non-housing-loans");
        driver.navigate().back();
    }


 */
}
