package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Loginnnnnnnn5Test {

    WebDriver driver;

    @BeforeClass
    public void beforeClass() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().deleteAllCookies();
        //  driver.get("https://www.abhibus.com/");
        //driver.get("https://www.opencart.com/");
        //driver.get("https://www.cult.fit/");
       // driver.get("https://rahulshettyacademy.com");
        driver.get("https://homeloans.hdfc.bank.in/");
    }

    @AfterClass
    public void afterClass() {

        driver.quit();
    }

    @BeforeMethod
    public void beforeMethod() {


        System.out.println("start mtd");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("end mtd");

    }

    /*
    // @Test(invocationCount = 3)
    public void testLoginTest() {
        boolean b =
                driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).isDisplayed();
        System.out.println(b);

        String s =
                driver.findElement(By.xpath("//div[text()='Swag Labs']")).getAttribute("class");
        System.out.println(s);

        String s1 =
                driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();
        System.out.println(s1);

    }

    @Test(invocationCount = 2)
    public void loginTest() {

        //driver.findElement(By.id("user-name")).sendKeys("standard_user");
        // driver.findElement(By
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
        System.out.println(driver.findElements(By.tagName("a")).size());
        System.out.println(driver.findElements(By.tagName("img")).size());
        System.out.println(driver.findElements(By.tagName("input")).size());
        System.out.println(driver.findElements(By.tagName("button")).size());
        System.out.println(driver.findElements(By.tagName("div")).size());
        // System.out.println(driver.findElements(By.tagName("a")).size());

        System.out.println(driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).getAttribute("class"));
        System.out.println(driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).getText());
        System.out.println(driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).getLocation());
        // driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).getAttribute("class");
    }

    @Test(invocationCount = 2)
    public void testsLsoginTest() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }


    @Test(invocationCount = 3)
    public void testsLsodginTest() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

    }

    @Test(invocationCount = 2)
    public void testsLdsoginTest() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }


    @Test(invocationCount = 2)
    public void testsLssdoginTest() {
        String s =
                driver.findElement(By.xpath("(//a[contains(text(), 'Free Download')])[1]"))
                        .getAttribute("class");
        System.out.println(s);
    }

    @Test(invocationCount = 2)
    public void testsLsdsdoginTest() {
        String s =
                driver.findElement(By.xpath("(//a[contains(text(), 'Free Download')])[1]"))
                        .getAttribute("class");
        System.out.println(s);
    }

    @Test(invocationCount = 2)
    public void testsLdesdsdoginTest() {
        String s =
                driver.findElement(By.xpath("//a[@class='btn btn-white btn-xl']"))
                        .getAttribute("class");
        System.out.println(s);
    }

    @Test(invocationCount = 2)
    public void testsLddsesdsdoginTest() {
        String s =
                driver.findElement(By.xpath("//div//h2[text()='Payment gateways and shipping methods']"))
                        .getText();
        System.out.println(s);
    }

    @Test(invocationCount = 2)
    public void testsLddsesddsdsdoginTest() {
        String s =
                driver.findElement(By.xpath("//div//h2[text()='Payment gateways and shipping methods']"))
                        .getText();
        Assert.assertEquals(s, "Payment gateways and shipping methods");

        boolean sw2 =
                driver.findElement(By.xpath("//div//h2[text()='Payment gateways and shipping methods']"))
                        .isDisplayed();
        Assert.assertTrue(sw2);

        Boolean sew =
                driver.findElement(By.xpath("//div//h2[text()='Payment gatewaysdd and shipping methods']"))
                        .isDisplayed();
        Assert.assertFalse(sew);
    }

    @Test()
    public void testsLddscesddsdsdoginTest() {

//        boolean b=
//        driver.findElement(By.xpath("(//img[@alt='vman-and-white-cult-text'])[1]")).isDisplayed();

        System.out.println(driver.findElements(By.tagName("link")).size());

    }


    @Test()
    public void testsLddscesyyTest() {
//        boolean b=
//        driver.findElement(By.xpath("(//img[@alt='vman-and-white-cult-text'])[1]")).isDisplayed();

        System.out.println(driver.findElements(By.tagName("img")).size());

    }


    @Test()
    public void testsLddsceddsyyTest() {

//        boolean b=
//        driver.findElement(By.xpath("(//img[@alt='vman-and-white-cult-text'])[1]")).isDisplayed();

        //   System.out.println(driver.findElements(By.tagName("img")).size());

        String text =
                driver.findElement(By.xpath("//div[text()='GET APP']")).getText();
        Assert.assertEquals(text, "GET APP");
    }


    @Test()
    public void windowhandlingTest() {

//        boolean b=
//        driver.findElement(By.xpath("(//img[@alt='vman-and-white-cult-text'])[1]")).isDisplayed();

        //   System.out.println(driver.findElements(By.tagName("img")).size());

        System.out.println(driver.getWindowHandle());
    }


    @Test()
    public void titleTest() {

        boolean b = driver.getTitle().contains("OpenCart - Open Source Shopping Cart Solution");
        Assert.assertTrue(b);

        boolean flag = driver.getTitle().contains("OpenCart");
        Assert.assertTrue(flag);
            }


    @Test()
    public void windodswhandlingTest() {
        WebElement wb=
        driver.findElement(By.xpath("(//div//a[@href='/fitness'])[2]"));

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(8));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div//a[@href='/fitness'])[2]")));

        String s= wb.getAttribute("href");
        System.out.println(s);

     //   driver.findElement(By.xpath("//div//a[text()='EXPLORE CULTPASS']"))
    }



    @Test()
    public void verifylearnmoreTest() {

      boolean flag=driver.findElement(By.xpath("(//p//a[text()='Learn More'])[1]")).isDisplayed();
      Assert.assertTrue(flag);

    }
*/


    // @Test()
    public void verifylearnmoreTest() throws Exception {
        String filepath = "C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\a6.properties";
        FileOutputStream fop = new FileOutputStream(filepath);
        Properties prop = new Properties();
        prop.setProperty("user", "admindd");
        prop.setProperty("dob", "12/02/2020");
        // prop.setProperty("dob", "12/02/2020");
        prop.store(fop, "freeegqegrqeg");


    }


    @Test()
    public void verifyldearnmoreTest() throws Exception {


        driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
        Set<String> set1 = driver.getWindowHandles();
        Iterator<String> itr = set1.iterator();
        String p = itr.next();
        String c = itr.next();

        driver.switchTo().window(c);
        boolean b = driver.getCurrentUrl().contains("https://sso.teachable");
        System.out.println(b);
        driver.close();
        driver.switchTo().window(p);

        //https://sso.teachable.com/secure/9521/identity/sign_up/otp?wizard_id=hI32btDlPhl6K_IN5Y6rS7NzZf9zAWZvBgm0BzSWSk5yZxT7cgUE24LEXpzzwhg8tofiB7ckzGf2oaybn9lCxg

    }


    @Test()
    public void veTest(){
        System.out.println(driver.findElements(By.tagName("a")).size());
   }

}