package pac1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AbhibusdddddTest {

    WebDriver driver;
    JavascriptExecutor js;

    WebDriverWait wait;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        //  driver.get("https://www.abhibus.com/");

        //driver.get("https://www.yatra.com/");

        //  driver.get("https://www.wanderfly.in/");


        driver.get("https://slice.bank.in/");
    }


    @AfterClass(alwaysRun = true)
    public void teardown() {

        driver.quit();
    }

    //1) Verify Home Page Loads Successfully
    // @Test(priority = 0)
    public void logoandtitlevSerifyTest() {

        // System.out.println(driver.getTitle().contains("Yatra.com – Best Travel Website. Book Flights, Hotels, Trains, Holidays &amp; Bus Tickets"));
        System.out.println(driver.getTitle());
    }

    // @Test
    public void FaqsTest() {
//
//WebElement resources=
//        driver.findElement(By.xpath("//button[starts-with(text(), 'Resources')]"));
//boolean presence=
//resources.isDisplayed();
//        Assert.assertEquals(presence, true);
//        WebElement faq=
//        driver.findElement(By.xpath("//a[starts-with(text(), 'FAQ')]"));
//
//
//        Actions actions = new Actions(driver);
//        actions.moveToElement(resources).click(faq).build().perform();
//
//
//
//        String url= driver.getCurrentUrl();
//        Assert.assertEquals("https://www.wanderfly.in/faq", url);

    }


    // @Test
    public void FaqssTest() {
        System.out.println(driver.getCurrentUrl());

    }


    @Test
    public void FacdcqsTest() {

        driver.findElement(By.xpath("//a[contains(text(), 'Savings account')]")).click();
        driver.findElement(By.xpath("//a[contains(text(), 'UPI Credit Card')]")).click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://slice.bank.in/credit-card/");

        WebElement whatweoffer = driver.findElement(By.xpath("//button[text()='What we offer']"));

        wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='What we offer']")));

        String s =
                whatweoffer.getText();
        Assert.assertEquals(s, "What we offer");

        String ssss =
                driver.findElement(By.xpath("//button[text()='What we offer']")).getAttribute("aria-label");
        Assert.assertEquals(ssss, "Open menu");
    }

    @Test
    public void FacdddcqsTest() {

        System.out.println(driver.getWindowHandle());
        System.out.println(driver.findElements(By.tagName("img")).size());

    }

    @Test
    public void FacdddddcqsTest() {

        System.out.println(driver.getWindowHandle());

    }

    @Test
    public void asdfcdddddcqsTest() {

        System.out.println(driver.getWindowHandle());

    }

    @Test
    public void acdddddddcqsTest() {

        System.out.println(driver.getWindowHandle());

    }


    @Test
    public void acdddddddddcqsTest() {

        System.out.println(driver.getWindowHandle());
        int size = driver.findElements(By.xpath("//button[contains(text(), 'Get slice')]")).size();
        System.out.println(size);

        System.out.println(driver.findElement(By.xpath("//a[@aria-label='Savings account']")).getSize());

    }

    @Test
    public void acdddddsdddddssdcqsTest() {
        System.out.println(driver.getWindowHandle());
        int size = driver.findElements(By.xpath("//button[contains(text(), 'Get slice')]")).size();
        System.out.println(size);
        System.out.println(driver.findElement(By.xpath("//a[@aria-label='Savings account']")).getSize());

    }

    @Test
    public void acdddddsddddddssdcqsTest() {
        System.out.println(driver.getWindowHandle());
        int size = driver.findElements(By.xpath("//button[contains(text(), 'Get slice')]")).size();
        System.out.println(size);
        WebElement w = driver.findElement(By.xpath("//a[@aria-label='Savings account']"));
        //WebElement w= driver.findElement(By.xpath("//a[@aria-label='Savings account']"));
        String sa = w.getAttribute("class");
        System.out.println(sa);
    }

    @Test
    public void a1Test() {
        System.out.println("-------------------------");

        try {

            List<WebElement> list = driver.findElements(By.tagName("a"));
            System.out.println(list.size());

            for (WebElement wb : list) {
                System.out.println(wb.getText() + " ");

            }
            System.out.println("-------------");

            List<WebElement> list1 = driver.findElements(By.tagName("img"));
            System.out.println(list1.size());

            for (WebElement wb : list1) {
                System.out.println(wb.getText() + " ");

            }

            System.out.println("-------------");
            List<WebElement> list2 = driver.findElements(By.tagName("input"));
            System.out.println(list2.size());

            for (WebElement wb : list2) {
                System.out.println(wb.getText() + " ");

            }
            System.out.println("-------------");

            List<WebElement> list3 = driver.findElements(By.tagName("table   "));
            System.out.println(list3.size());

            for (WebElement wb : list3) {
                System.out.println(wb.getText() + " ");

            }


            System.out.println("---------");


            List<WebElement> list4 = driver.findElements(By.tagName("div"));
            System.out.println(list4.size());

            for (WebElement wb : list4) {
                System.out.println(wb.getText() + " ");

            }


            js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(400, 430)", "");

            js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(-200, -330)", "");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void FadcdcqsTest() {
        System.out.println(driver.findElements(By.tagName("img")).size());
        //driver.findElements(By.tagName("img")).size();
    }

    @Test
    public void FadcdddddcqsxTest() {
        System.out.println(driver.findElements(By.tagName("div")).size());
        //driver.findElements(By.tagName("img")).size();
    }

    @Test
    public void FadcdcddqsxTest() {
        System.out.println(driver.findElements(By.tagName("div")).size());
        //driver.findElements(By.tagName("img")).size();
    }

    @Test
    public void FadcdddcqsxTest() {
        System.out.println(driver.findElements(By.tagName("input")).size());
        //driver.findElements(By.tagName("img")).size();
    }


//today code:
   // @Test
    public void f1Test() {

        System.out.println("--------------");
        System.out.println(driver.findElements(By.tagName("input")).size());
        System.out.println(driver.getWindowHandle());
        System.out.println(driver.findElements(By.tagName("button")).size());
    }

    @Test
    public void f2Test() {

        driver.get("https://dribbble.com/search/logout");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

     String currentid=driver.getWindowHandle();

        System.out.println(currentid);

        boolean b=

        driver.findElement(By.cssSelector(".site-nav__wrapper")).isDisplayed();

        Assert.assertTrue(b);


boolean b1=
        driver.findElement(By.cssSelector("#autocomplete-0-input")).isDisplayed();
        Assert.assertTrue(b1);
        String text=
driver.findElement(By.xpath("//a[contains(text(), 'Hire Talent')]")).getText();
        System.out.println(text);

WebElement wb=driver.findElement(By.xpath("//a[contains(text(), 'Hire Talent')]"));
        Dimension s= wb.getSize();
        System.out.println(s.getWidth());
        System.out.println(s.getHeight());

String ss=
wb.getCssValue("--link-color");
        System.out.println(ss);

        WebElement login=
        driver.findElement(By.xpath("//a[contains(text(), 'Log in')]"));
        System.out.println(login.getText());

        String href=login.getAttribute("href");
        System.out.println(href);

        WebElement  signup=
                driver.findElement(By.xpath("(//a[contains(text(), 'Sign up')])[1]"));
        System.out.println(signup.getText());

        String href1=signup.getAttribute("href");
        System.out.println(href1);

        WebElement loginn=
                driver.findElement(By.xpath("//a[contains(text(), 'Log in')]"));
        System.out.println(loginn.getText());

        String hreff=login.getAttribute("href");
        System.out.println(hreff);


        WebElement loginww=
                driver.findElement(By.xpath("//a[contains(text(), 'Log in')]"));
        System.out.println(loginww.getText());

        String hrefww=login.getAttribute("href");
        System.out.println(hrefww);

        WebElement loginwww=
                driver.findElement(By.xpath("//a[contains(text(), 'Log in')]"));
        System.out.println(loginwww.getText());

        String hrefsss=login.getAttribute("href");
        System.out.println(hrefsss);


        WebElement login19=
                driver.findElement(By.xpath("//a[contains(text(), 'Log in')]"));
        System.out.println(login19.getText());

        String href19=login.getAttribute("href");
        System.out.println(href19);
    }

   }
