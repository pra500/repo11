package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class fvTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.get("https://www.makemytrip.com/");
    }

    @AfterClass
    public void teardown() {
        driver.quit();

    }


    @Test(priority = 0)
    public void geTest() {
        System.out.println(driver.getTitle());
    }


    @Test(priority = 1)
    public void gesaTest() {
        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void gesaTest1() {
        System.out.println(driver.findElements(By.tagName("img")).size());

    }

    @Test
    public void gedsaTest1() {
        System.out.println(driver.findElements(By.tagName("div")).size());
    }


    @Test
    public void gedddsaTest1() {
        System.out.println(driver.findElements(By.tagName("strong")).size());

    }


    @Test
    public void geddddsaTest1() {
        System.out.println(driver.findElements(By.tagName("")).size());

    }

    @Test
    public void gedddddsaTest1() {
        System.out.println(driver.findElements(By.tagName("strong")).size());

    }


    @Test
    public void gedsddddsaTest1() throws Exception {
//
//        driver.get("https://www.geeksforgeeks.org/");
//        Thread.sleep(5000);
//        System.out.println(driver.findElement(By.xpath("//a[text()='Machine Learning']")).getText());
//        System.out.println(driver.findElement(By.xpath("(//a[contains(text(), 'Data Science')])[1]")).getText());
//
//       // WebElement wbwb=driver.findElement(By.xpath("//div[@class='socialIcon twitter']"));wbwb.getAttribute("class");
//
//        driver.navigate().refresh();
//
//        driver.navigate().back();
//        driver.navigate().forward();

        driver.get("https://www.geeksforgeeks.org/");
        Thread.sleep(5000);

        driver.findElement(By.cssSelector("#skipto-main-link")).isDisplayed();
    }


    @Test(priority = 0)
    public void geTdddest() {
        System.out.println(driver.getTitle());
    }


    @Test(priority = 0)
    public void geddTest() {
        System.out.println(driver.getTitle().toUpperCase());
    }

    @Test(priority = 0)
    public void gesddTest() {
        System.out.println(driver.getTitle().contains("http"));
    }

    @Test(priority = 0)
    public void gedsdsdTest() {
        System.out.println(driver.getTitle());
    }


    @Test
    public void geddddsdsaTest1() throws Exception {
        driver.navigate().to("https://www.abhibus.com/");
        List<WebElement> list = driver.findElements(By.tagName("a"));

        for (WebElement wb : list) {
            String s = wb.getAttribute("href");
            //     broke(s);
        }
    }

    @Test(priority = 0)
    public void gedssdTest() throws Exception {

        driver.get("https://www.yatra.com/");
        Thread.sleep(4000);
        System.out.println(driver.getCurrentUrl().contains("http"));
        String s =

                driver.findElement(By.xpath("//img[@alt='Join Yatra Prime Banner']")).getAttribute("alt");
        System.out.println(s);

        String we =
                driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary Mui-selected css-k3bn3h']"))
                        .getCssValue("background-color");
        System.out.println(we);

    }


    @Test(priority = 0)
    public void gedddssdTest() throws Exception {

        driver.get("https://www.yatra.com/");
        //button[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary Mui-selected css-k3bn3h']

        Thread.sleep(4000);
        driver.navigate().refresh();
    }


    @Test(priority = 0)
    public void geddddssdTest() throws Exception {

        driver.get("https://www.yatra.com/");
        //button[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary Mui-selected css-k3bn3h']

        Thread.sleep(4000);
        driver.navigate().refresh();
    }


    @Test(priority = 0)
    public void geTddrrredest() {
        System.out.println(driver.getTitle());
    }


    @Test(priority = 0)
    public void geTdsddest() {
        System.out.println(driver.getTitle());
    }


    @Test(priority = 0)
    public void geTdddddest() throws InterruptedException {

        driver.get("https://www.yatra.com/");

        Thread.sleep(3000);

        System.out.println(driver.getWindowHandle());


        System.out.println(driver.getTitle());
        // driver.getTitle();


        int size =
                driver.findElements(By.tagName("input")).size();
        System.out.println(size);


        int totalnumbeddddd =
                driver.findElements(By.xpath("//div")).size();
        System.out.println(totalnumbeddddd);

        boolean truee =
                driver.findElement(By.xpath("//img[@alt='Join Yatra Prime Banner']")).isDisplayed();
        Assert.assertTrue(truee);


        driver.findElements(By.partialLinkText(""));
        driver.findElement(By.cssSelector("")).getText();
        driver.findElement(By.cssSelector("")).getText();


        driver.navigate().back();

        driver.navigate().refresh();

        System.out.println(driver.findElements(By.tagName("input")).size());
        System.out.println(driver.findElements(By.tagName("div")).size());


//driver.findElements()

    }

    @Test(priority = 0)
    public void geTdddddddest() throws InterruptedException {

        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

        Thread.sleep(4000);

        WebElement wb =
                driver.findElement(By.xpath("//div//h1[text()='Selenium - Automation Practice Form']"));


        String text =
                driver.findElement(By.xpath("//div//h1[text()='Selenium - Automation Practice Form']")).getText();
        System.out.println(text);

        String s = wb.getCssValue("display");
        System.out.println(s);

        String s1 =
                wb.getAriaRole();
        System.out.println(s1);

        System.out.println(driver.getWindowHandle());
        //   driver.getWindowHandle();

String text1=
        driver.findElement(By.xpath("//button[@aria-controls='collapseTwo']")).getAccessibleName();
        System.out.println(text1);


        String text2=
                driver.findElement(By.xpath("//button[@aria-controls='collapseTwo']")).getAriaRole();
        System.out.println(text2);

    }


   @Test(priority = 0)
    public void gewwTest() throws InterruptedException {




    }


}
