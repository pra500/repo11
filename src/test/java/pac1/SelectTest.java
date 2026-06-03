package pac1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class SelectTest {


    WebDriver driver;
    JavascriptExecutor js;

//    String filepath = "C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\eer.properties";
//    Properties prop;
//    Properties prop1;
//

    @BeforeClass
    public void setup() throws Exception {

//
//        ChromeOptions options=new ChromeOptions();
//        options.addArguments("--incognito-");
//        options.addArguments("--headless-");
//        options.addArguments("--disable-infobars-");
//        options.addArguments("--disable-chrome-extensions-");
//        options.addArguments("--disable-gpu-");
//        options.addArguments("--disable-auto-filled");


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        // driver.get("https://demoqa.com/select-menu");


      //  driver.get("https://demoqa.com/text-box");

        driver.get("https://www.joshwcomeau.com/svg/friendly-introduction-to-svg/");
//        FileInputStream fip=new FileInputStream(filepath);
//        prop = new Properties();
//        prop.load(fip);


    }


    @AfterClass
    public void tear() {

        driver.quit();

    }

    //   @Test
    public void yyGeTest() throws Exception {

        boolean b =
                driver.findElement(By.xpath("(//*[local-name()='svg' and @aria-hidden='true'])[1]")).isDisplayed();
        System.out.println(b);


        boolean b1 =
                driver.findElement(By.xpath("(//*[local-name()='svg' and @aria-hidden='true'])[1]")).isDisplayed();
        System.out.println(b1);


        boolean b2 =
                driver.findElement(By.xpath("(//*[local-name()='svg' and @aria-hidden='true'])[1]")).isDisplayed();
        System.out.println(b2);

        boolean bsfs =
                driver.findElement(By.xpath("(//*[local-name()='svg' and @aria-hidden='true'])[1]")).isDisplayed();
        System.out.println(bsfs);


        boolean b3331 =
                driver.findElement(By.xpath("(//*[local-name()='svg' and @aria-hidden='true'])[1]")).isDisplayed();
        System.out.println(b3331);


        boolean b332 =
                driver.findElement(By.xpath("(//*[local-name()='svg' and @aria-hidden='true'])[1]")).isDisplayed();
        System.out.println(b332);
    }


    @Test
    public void yyGseTest() throws Exception {
//
//        driver.get("https://demoqa.com/checkbox");
//        boolean b=
//        driver.findElement(By.xpath("//span[@role='checkbox']")).isSelected();
//        Assert.assertFalse(b);

//
//        WebElement wb=
//        driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
//        Select select=new Select(wb);
//        select.selectByIndex(3);
//
//
//        WebElement wb1=
//        driver.findElement(By.xpath("//div[text()='Old Style Select Menu']"));
//
//
//        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(8));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Old Style Select Menu']")));
//        String text=  wb1.getText();
//        System.out.println(text);
//
//
//
//        driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
//
//
//Alert alt=driver.switchTo().alert();
//
//System.out.println(alt.getText());
//
//alt.accept();
//
//
//Assert.assertEquals("https://rahulshettyacademy.com/AutomationPractice/", driver.getCurrentUrl());
//
////driver.getCurrentUrl()
//
//    //    driver.findElement(By.xpath("//input[@id='alertbtn']")).
//
//



        driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("sf", Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("sfdv", Keys.ENTER);

        // Thread.sleep(10000);

        WebElement wb =
                driver.findElement(By.xpath("//div//button[text()='Submit']"));

        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", wb);

    }



    @Test
    public void yyGddseTest() {
int size=
driver.findElements(By.xpath("//*[local-name()='svg' and @class='lucide lucide-check']")).size();
        System.out.println(size);
    }

    @Test
    public void yyGddddseTest() {
        int size=
                driver.findElements(By.xpath("//*[local-name()='svg' and @class='lucide lucide-check']")).size();
        System.out.println(size);
    }


    @Test
    public void yyGesddedddddseTest() {

        boolean b=
      driver.getTitle().contains("A Friendly Introduction to SVG • Josh W. Comeau");
        System.out.println(b);
        Assert.assertTrue(b);


    }



    @Test
    public void yyGededdddddseTest() {

    //        Example:
    //
    //        Valid login
    //        Invalid password
    //        Empty fields
    //        Special characters
    //






        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://practicetestautomation.com/practice-test-login/");


        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
        driver.findElement(By.xpath("//button[@id='submit']")).click();











    }
}
