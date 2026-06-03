package pac1;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class HJTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("disable-infobars");
//        options.addArguments("incognito");
//        options.addArguments("headless");
        // driver = new ChromeDriver(options);


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        //driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.get("https://www.demoblaze.com/");

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test(priority = 1)
    public void snippetOneTest() {
        driver.get("https://www.demoblaze.com");
        Assert.assertEquals(driver.getTitle(), "STORE");
        scrolling();
    }

    @Test(priority = 2)
    public void snippetTwoTest() throws Exception {
        driver.get("https://www.demoblaze.com");
        driver.findElement(By.id("login2")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("loginusername")).sendKeys("parul1");
        driver.findElement(By.id("loginpassword")).sendKeys("parul@1234");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("demoblaze"));
        pagerefresh();

    }


    @Test(priority = 3)
    public void snippetThreeTest() throws Exception {
        driver.get("https://opensource-demo.orangehrmlive.com");
        // Thread.sleep(4000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        // wait.until()
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }

    @Test(priority = 4)
    public void snippetFourTest() {
        driver.get("https://opensource-demo.orangehrmlive.com");
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
    }
/*
        @Test(priority = 5)
        public void snippetFiveTest() {
            driver.get("https://demoqa.com/select-menu");
            WebElement dropdown = driver.findElement(By.id("oldSelectMenu1"));
            Select select = new Select(dropdown);
            select.selectByVisibleText("Purple");
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Purple");
        }

        @Test(priority = 6)
        public void snippetSixTest() {
            driver.get("https://demoqa.com/select-menu");
            WebElement dropdown = driver.findElement(By.id("oldSelectMenu"));
            Select select = new Select(dropdown);
            select.selectByIndex(20);
            Assert.assertNotNull(select.getFirstSelectedOption().getText());
        }

        @Test(priority = 7)
        public void snippetSevenTest() {
            driver.get("https://the-internet.herokuapp.com/dropdown");
            WebElement dropdown = driver.findElement(By.id("dropdown1"));
            Select select = new Select(dropdown);
            select.selectByVisibleText("Option 3");
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Option 3");
        }

        @Test(priority = 8)
        public void snippetEightTest() {
            driver.get("https://automationexercise.com");
            driver.findElement(By.xpath("//a[text()='Signup / Login1']")).click();
            Assert.assertTrue(driver.getCurrentUrl().contains("login"));
        }

        @Test(priority = 9)
        public void snippetNineTest() {
            driver.get("https://automationexercise.com");
            driver.findElement(By.xpath("//a[text()='Signup / Login']")).click();
            driver.findElement(By.xpath("//input[@placeholder='Search Product']")).sendKeys("dress");
            driver.findElement(By.id("search-button1")).click();
            List<WebElement> products = driver.findElements(By.className("productinfo"));
            Assert.assertTrue(products.size() > 0);
        }

        @Test(priority = 10)
        public void snippetTenTest() {
            driver.get("https://the-internet.herokuapp.com/checkboxes");
            List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox1']"));
            Assert.assertEquals(checkboxes.size(), 2);
        }

        @Test(priority = 11)
        public void snippetElevenTest() {
            driver.get("https://demoqa.com/text-box");
            driver.findElement(By.id("userName")).sendKeys("John");
            driver.findElement(By.id("userEmail")).sendKeys("notavalidemail");
            driver.findElement(By.id("submit")).click();
            Assert.assertTrue(driver.findElement(By.id("name")).isDisplayed());
            Assert.assertTrue(driver.findElement(By.id("email")).isDisplayed());
        }

        @Test(priority = 12)
        public void snippetTwelveTest() {
            driver.get("https://www.demoblaze.com");
            driver.findElement(By.xpath("//a[text()='Phones1']")).click();
            List<WebElement> phones = driver.findElements(By.className("card-title"));
            Assert.assertTrue(phones.size() > 0);
        }

        @Test(priority = 13)
        public void snippetThirteenTest() {
            driver.get("https://opensource-demo.orangehrmlive.com");
            driver.findElement(By.name("username")).sendKeys("Admin");
            driver.findElement(By.name("password")).sendKeys("wrongpassword");
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
        }

        @Test(priority = 14)
        public void snippetFourteenTest() {
            driver.get("https://the-internet.herokuapp.com/login");
            driver.findElement(By.id("username")).sendKeys("tomsmith");
            driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            Assert.assertTrue(driver.getCurrentUrl().contains("secure1"));
        }

        @Test(priority = 15)
        public void snippetFifteenTest() {
            driver.get("https://demoqa.com/webtables");
            List<WebElement> rows = driver.findElements(
                    By.xpath("//div[@class='rt-tr-group1']"));
            Assert.assertTrue(rows.size() > 0);
        }


 */

    @Test(priority = 1)
    public void snipdpetOneTest() {
        driver.get("https://www.demoblaze.com");
        Assert.assertEquals(driver.getTitle(), "STORE");

    }

    @Test(priority = 1)
    public void sniddpdpetOneTest() {

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getWindowHandle());
    }

    @Test(priority = 1)
    public void sniddpdpsetOneTest() throws Exception {
//
//        System.out.println(driver.getPageSource().contains("div"));
//        System.out.println(driver.getPageSource().contains("input"));
//        System.out.println(driver.getPageSource().contains("button"));

        driver.get("https://www.demoblaze.com");
        driver.findElement(By.id("login2")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("loginusername")).sendKeys("parul1");
        driver.findElement(By.id("loginpassword")).sendKeys("parul@1234");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("demoblaze"));
        scrolling();
        pagerefresh();

    }

    public void scrolling() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(400, 300)", "");
    }

    public void pagerefresh() {
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("STORE"));
        //driver.getTitle().contains("STORE")
        // driver.getWindowHandle();
    }


    @Test(priority = 1)
    public void sniddpdddpsetOneTest() throws Exception {

//        WebElement cart=driver.findElement(By.xpath("//a[@id='cartur']"));


        driver.get("https://www.demoblaze.com");
        driver.findElement(By.id("login2")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("loginusername")).sendKeys("parul1");
        driver.findElement(By.id("loginpassword")).sendKeys("parul@1234");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("demoblaze"));

        boolean b = driver.findElement(By.xpath("//a[normalize-space()='PRODUCT STORE']")).isDisplayed();
        Assert.assertTrue(b);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        WebElement cart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cartur")));
        Assert.assertEquals(cart.getText(), "Cart");

        cart.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.demoblaze.com/cart.html");

    }


    @Test(priority = 1)
    public void logoTest() throws Exception {
        driver.get("https://tech.walmart.com/content/walmart-global-tech/en_us.html");

        Thread.sleep(7000);

        WebElement wb = driver.findElement(By.xpath("//img[@alt='Branding spelling out Walmart Global Tech']"));

        boolean b = wb.isDisplayed();
        Assert.assertTrue(b);

        String color = wb.getCssValue("color");
        System.out.println(color);

    }


    @Test(priority = 1)
    public void pdddddTest() throws Exception {

        driver.get("https://tech.walmart.com/content/walmart-global-tech/en_us.html");

        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

        Thread.sleep(6000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(9));

        WebElement Flagship_Conferences = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[normalize-space()='Flagship Conferences']")));
        System.out.println(Flagship_Conferences.getText());

        WebElement wb = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//b[text()='Learn more']")));
        wb.click();

        WebElement seemoreele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Walmart Newsroom']")));
        seemoreele.click();

        //(//a[text()='See more'])[2]

    }


    @Test(priority = 1)
    public void logosTest() throws Exception {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(5000);

        Assert.assertTrue(driver.findElements(By.xpath("//a")).size() > 0);
        //  driver.findElements(By.xpath("//a")).size()>0

        System.out.println(driver.findElements(By.tagName("img")).size());
        System.out.println(driver.findElements(By.tagName("input")).size());

        // driver.findElements(By.tagName("a")).size()

    }


    @Test(priority = 1)
    public void logxxosTest() throws Exception {


        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(5000);

        WebElement wb =
                driver.findElement(By.cssSelector("#dropdown-class-example"));
        Select sel = new Select(wb);

        sel.selectByVisibleText("Option2");
        //sel.selectByIndex(2);

        if (sel.isMultiple() == false)
            System.out.println("not multiselect");
        else
            System.out.println("multiselect");

        List<WebElement> list = sel.getOptions();
        System.out.println(list.size());

    }

    // @Test(priority = 1)
    public void logxddxosTest() throws Exception {

        int size = driver.findElements(By.tagName("img")).size();
        System.out.println(size);
        System.out.println(driver.getTitle().contains("Practice Page"));

        List<WebElement> list = driver.findElements(By.tagName("a"));
        System.out.println(list.size());

        for (int i = 0; i <= list.size() - 1; i++) {
            String s = list.get(i).getAttribute("href");
            getbroken(s);
        }

    }

    public static void getbroken(String s1) throws Exception {

        URL url = new URL(s1);
        HttpURLConnection huc = (HttpURLConnection) url.openConnection();
        huc.connect();
        huc.setConnectTimeout(4000);
        int code = huc.getResponseCode();
        if (code == 400 || code == 401 || code == 403 || code == 404) {
            System.out.println(huc.getResponseMessage() + " " + "this is a broken link");
        }
    }


    @Test
    public void logxdssdxosTest() throws Exception {
        WebElement wb =
                driver.findElement(By.xpath("//a[text()='About us']"));
        click(wb);

    }

    @Test
    public void logxdddssdxosTest() throws Exception {
        WebElement wb =
                driver.findElement(By.xpath("//a[text()='About us']"));
        click(wb);


    }

    @Test
    public void logxdddssssdxosTest() throws Exception {
        System.out.println(driver.getTitle().contains("STORE"));

    }


    @Test
    public void lo777sdxosTest() throws Exception {

        System.out.println(driver.getWindowHandle());

    }
    public void click(WebElement wn) {
        wn.click();

    }


    @Test
    public void JscrollingTest() throws Exception {

        scrollingssd();


    }



    @Test
    public void dropdownTest() throws Exception {

//        driver.get("https://demoqa.com/select-menu");
//        Thread.sleep(4000);
//WebElement wb=
//        driver.findElement(By.xpath("(//div[@class='css-1xc3v61-indicatorContainer'])[1]"));
//Select sel = new Select(wb);
//sel.selectByVisibleText("Another root option");


    }

    public void scrollingssd()
    {
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(200, 240)", "");

        JavascriptExecutor jsw=(JavascriptExecutor) driver;
        jsw.executeScript("window.scrollBy(-200, -400)", "");


    }





    public void click1(WebElement w)
    {

        w.click();
    }





    @Test
    public void drodpddownTest() throws Exception {




    }




}


