package pac1;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class G {

    //EVERY PAGE URL CHECK

    WebDriver driver;
    JavascriptExecutor js;

    @BeforeClass(alwaysRun = true)
    public void setup() {


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.wanderfly.in/");
    }

    @AfterClass(alwaysRun = true)
    public void teardown() {

        driver.quit();
    }

    //1) Verify Home Page Loads Successfully
    @Test(priority = 0)
    public void logoandtitleverifyTest() {
        try {

            String title = driver.getTitle();
            Assert.assertEquals(title, "Wanderfly | Stop the Burnout. Start the Vibes.");

            boolean logopresent = driver.findElement(By.xpath("(//img[starts-with(@alt, 'Wanderfly Logo')])[1]")).isDisplayed();
            Assert.assertTrue(logopresent);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //2) Validate Navigation Menu Items
    @Test(priority = 1)
    public void NavigationMenuItemsverifyTest() {

        try {

            WebElement solutions =
                    driver.findElement(By.xpath("(//a[contains(text(), 'Solutions')])[1]"));
            boolean solutionspresence = solutions.isDisplayed();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    //Scenario 3: Contact Us Page – Form Presence (No submission)
    @Test(priority = 2)
    public void  ContactUsPageFormPresenceVerifyTest() {

driver.findElement(By.xpath("//a[text()='Contact']")).click();

Assert.assertTrue(driver.getCurrentUrl().contains("/contact"));


boolean solutionsexist =
        driver.findElement(By.xpath("(//a[text()='Solutions'])[1]")).isDisplayed();
Assert.assertTrue(solutionsexist);

        boolean featuresexist =
                driver.findElement(By.xpath("(//a[text()='Features'])[1]")).isDisplayed();

        Assert.assertTrue(featuresexist);

        driver.navigate().refresh();

       WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(8));
      boolean b=  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[text()='Solutions'])[1]"))).isDisplayed();
        Assert.assertTrue(b);


        boolean b1=  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[text()='Features'])[1]"))).isDisplayed();
        Assert.assertTrue(b1);









    }





}


