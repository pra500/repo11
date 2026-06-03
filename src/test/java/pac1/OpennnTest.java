package pac1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class OpennnTest {
    WebDriver driver;
    JavascriptExecutor js;
    WebDriverWait wait;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();



        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
    }

    @AfterClass(alwaysRun = true)
    public void teardown() {
        driver.quit();
    }

    @Test
    public void lossddTest() {
        System.out.println(driver.getTitle());
    }

    @Test
    public void logccdscdTest() {
        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void leedTest() {
        System.out.println(driver.getWindowHandle());
    }

    @Test
    public void loTest() {
        System.out.println(driver.findElements(By.tagName("a")).size());
    }

    @Test
    public void logoandddtitlevSerifyTest() {
        System.out.println(driver.findElements(By.tagName("div")).size());
    }

    @Test
    public void logoandtitlevddSerifyTest() {
        System.out.println(driver.findElements(By.tagName("img")).size());
    }

    @Test
    public void eelTest() {
        System.out.println(driver.getWindowHandle());
    }

    @Test
    public void ldTest() {
        System.out.println(driver.getWindowHandle());
    }

    @Test
    public void dlTest() {
        System.out.println(driver.getWindowHandle());
    }

    @Test
    public void leeTest() {
        System.out.println(driver.getWindowHandle());
    }

    @Test
    public void leeeTest() {
        System.out.println(driver.getWindowHandle());
    }

    @Test
    public void lTw22est() {
        System.out.println(driver.getWindowHandle());
    }

    @Test
    public void l3wTest() {
        System.out.println(driver.getWindowHandle());
    }

    @Test
    public void lwwwTest() {
        System.out.println(driver.getWindowHandle());
    }

    @Test
    public void l22ee2Test() {
        System.out.println(
                driver.findElement(By.xpath("//input[@placeholder='Search']")).isDisplayed());
    }

    @Test
    public void l2x22Test() {
        System.out.println(
                driver.findElement(By.xpath("//img[@alt='naveenopencart']")).isDisplayed());
    }

    @Test
    public void l222Test() {
        System.out.println(
                driver.findElement(By.xpath("//a[text()='Account']")).isDisplayed());
    }

    @Test
    public void l22w2Test() {
        System.out.println(
                driver.findElement(By.xpath("//a[@id='wishlist-total']")).getText());
    }

    @Test
    public void l22ew2Test() {
        System.out.println(
                driver.findElement(By.xpath("//a[@id='wishlist-total']")).getAttribute("id"));
    }

    @Test
    public void l22ww2Test() {
        System.out.println(
                driver.findElement(By.xpath("//a[@id='wishlist-total']")).getAttribute("title"));
    }

    @Test
    public void l22wew2Test() {
        System.out.println(
                driver.findElement(By.xpath("//a[@id='wishlist-total']")).getSize());
    }

    @Test
    public void l22wwww2Test() {
        System.out.println(
                driver.findElement(By.xpath("//a[@id='wishlist-total']")).getLocation());
    }

    @Test
    public void l22sww2Test() {
        System.out.println(
                driver.findElement(By.xpath("//a[@id='wishlist-total']")).getLocation());
    }

    @Test
    public void l22dsww2Test() {
        System.out.println(
                driver.findElement(By.xpath("//span[text()='Checkout']")).getLocation());
    }

    @Test
    public void l22dsweew2Test() {
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(440, 300)", "");
    }

    @Test
    public void l22dsweesw2Test() {
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(-440, -300)", "");
    }


    @Test
    public void l2Test() {
        // js=(JavascriptExecutor) driver;
        int size = driver.findElements(By.xpath("//a[contains(text(), 'Laptops & Notebooks')")).size();
        System.out.println(size
        );
    }

    @Test
    public void l3Test() {
        // js=(JavascriptExecutor) driver;
        String size = driver.findElement(By.xpath("//p[contains(text(), 'By creating')]")).getText();
        System.out.println(size
        );
    }


    @Test
    public void l3wwTest() {
       int size=
        driver.findElements(By.xpath("img")).size();
        System.out.println(size);
    }

    @Test
    public void l3wsswTest() {
        int size=
                driver.findElements(By.xpath("table")).size();
        System.out.println(size);
    }
    @Test
    public void l3ddwsswTest() {
        int size =
                driver.findElements(By.xpath("table")).size();
    }




    @Test
    public void l22dswxxeesw2Test() {
        System.out.println(driver.findElement(By.xpath("//p[contains(text(), 'By creating')]")).getSize());


    }

    @Test
    public void l5Test() {
        // js=(JavascriptExecutor) driver;
        String text = driver.findElement(By.xpath("//input[@type='submit']")).getText();
        System.out.println(text);
    }

    @Test
    public void l22dswxdxeesw2Test() {
        System.out.println(driver.findElement(By.xpath("(//a[contains(text(), 'Forgotten Password')])[1]")).isDisplayed());
    }

    @Test
    public void l2dddTest() {
        System.out.println(driver.findElements(By.xpath("//a[contains(text(), 'Order History')]")).size());

    }

    @Test
    public void l2ssddTest() {
        System.out.println(driver.findElements(By.xpath("//a[contains(text(), 'Order History')]")).size());

    }

    @Test
    public void l2seeswwddTest() {
        System.out.println(driver.findElements(By.xpath("//a[contains(text(), 'Order History')]")).getClass());

    }

    @Test
    public void l2sswwddTest() {
        System.out.println(driver.findElements(By.xpath("//a[contains(text(), 'Order History')]")).size());

    }

    @Test
    public void ld2ddTest() {
        System.out.println(driver.findElement(By.xpath("(//a[contains(text(), 'Forgotten Password')])[1]")).getAriaRole());


    }

    @Test
    public void l2eeddTest() {
        System.out.println(driver.findElement(By.xpath("(//a[contains(text(), 'Forgotten Password')])[1]")).getAriaRole());


    }

    @Test
    public void l2dwwwwdTest() {
        System.out.println(driver.findElement(By.xpath("(//a[contains(text(), 'Forgotten Password')])[1]")).getAriaRole());


    }

    @Test
    public void l2ddTest() {
        System.out.println(driver.findElement(By.xpath("(//a[contains(text(), 'Forgotten Password')])[1]")).getAriaRole());


    }

    @Test
    public void l2dwwdTest() {
        System.out.println(driver.findElement(By.xpath("//a[contains(text(), 'Privacy Policy')]")).getAriaRole());


    }

    @Test
    public void l2dwwwwwwdTest() {
        System.out.println(driver.findElements(By.xpath("//a[contains(text(), 'Newsletter')]")).size());


    }

    @Test
    public void l2dwwdeeTest() {
        System.out.println(driver.findElement(By.xpath("//a[text()='Phones & PDAs']")).getAriaRole());


    }

    @Test
    public void l2dwwdeeddTest() {
        System.out.println(driver.findElement(By.xpath("//a[text()='Phones & PDAs']")).getAriaRole());


    }

    @Test
    public void l2dwwdwweeTest() {
        System.out.println(driver.findElement(By.xpath("//label[text()='E-Mail Address']")).getAriaRole());
    }

    @Test
    public void l2dwwewdwweeTest() {
        System.out.println(driver.findElements(By.xpath("//a[text()='Forgotten Password']")).size());
    }

    @Test
    public void mee1Test() {
        System.out.println(driver.findElements(By.xpath("//a[text()='Order History']")).size());
    }

    @Test
    public void mewwe1Test() {
        System.out.println(driver.findElements(By.xpath("//a[text()='Order History']")).size());
    }

    @Test
    public void mff1Test() {
        System.out.println(driver.findElements(By.xpath("//a[text()='Order History']")).size());
    }

    @Test
    public void l2dwweedeeTest() {
        System.out.println(driver.findElement(By.xpath("//a[text()='Phones & PDAs']")).getAriaRole());

    }

    @Test
    public void mwwwwww1Test() {
        System.out.println(driver.findElements(By.xpath("//a[text()='Order History']")).size());
    }

    @Test
    public void mwwww1Test() {
        System.out.println(driver.findElements(By.xpath("//a[text()='Order History']")).size());
    }

    @Test
    public void m1Tddest() {

        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        System.out.println(driver.findElement(By.xpath("//button[@id='submit']")).getCssValue("color"));

        WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
        System.out.println(submit.getSize());

        System.out.println(submit.getAttribute("id"));
        System.out.println(submit.getAriaRole());
        System.out.println(submit.getAccessibleName());

        Assert.assertTrue(driver.getTitle().contains("Test Login | Practice Test Automation"));

        Assert.assertEquals(driver.getCurrentUrl(),
                "https://practicetestautomation.com/practice-test-login/");
        String ss =
                driver.findElement(By.xpath("//img[@class='custom-logo']")).getAttribute(
                        "width");
        System.out.println(ss);

        WebElement wb = driver.findElement(By.xpath("//img[@class='custom-logo']"));
        System.out.println(wb.getAriaRole());

        boolean b = driver.findElement(By.xpath("//h2[text()='Test login']")).isDisplayed();
        Assert.assertTrue(b);

        String s =
                driver.findElement(By.xpath("//h2[text()='Test login']")).getText();
        System.out.println(s);

        Point p =
                driver.findElement(By.xpath("//h2[text()='Test login']")).getLocation();
        System.out.println(p.getX());
        System.out.println(p.getY());
    }


    @Test
    public void gTest()
    {
        System.out.println(driver.getWindowHandle());
        System.out.println(driver.findElements(By.xpath("img")).size());
        System.out.println(driver.findElements(By.xpath("a")).size());
        System.out.println(driver.findElements(By.xpath("table")).size());
        System.out.println(driver.findElements(By.xpath("input")).size());
        System.out.println(driver.findElements(By.xpath("input")).size());
        System.out.println(driver.findElements(By.xpath("input")).size());
    }

    @Test
    public void ddgTest() {

        String Search = driver.findElement(By.xpath("//input[@placeholder='Search']")).getAttribute("placeholder");
        Assert.assertEquals(Search, "Search");

        WebElement wb = driver.findElement(By.xpath("//span[contains(text(), '0 item(s) - $0.00')]"));
        System.out.println(wb.getLocation());
        System.out.println( wb.getSize());
        System.out.println(wb.getDomProperty("id"));
        System.out.println(wb.getDomAttribute("id"));
        System.out.println(wb.getTagName());
        System.out.println(wb.getTagName());
        System.out.println( wb.getClass());
    }


   @Test
    public void wwwgTest()
    {
        System.out.println(driver.getWindowHandle());
        int size=
driver.findElements(By.tagName("button")).size();
        System.out.println(size);

        int size1=
                driver.findElements(By.tagName("form")).size();
        System.out.println(size1);
    }



    @Test
    public void wwwdgTest()
    {      //  driver.get("https://www.idfcfirst.bank.in/");
       //  driver.get("https://www.idfcfirst.bank.in/");

    }


}



