package pac1;

import net.bytebuddy.implementation.auxiliary.MethodCallProxy;
import org.apache.commons.collections.bidimap.DualHashBidiMap;
import org.apache.commons.compress.harmony.pack200.NewAttributeBands;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v127.input.Input;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class TitleTest {

    WebDriver driver;

/*

    @BeforeClass
    public void setup() {

//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("disable-popup-blocking");
//        //  options.addArguments("ac

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();
        //driver.get("https://www.opencart.com/");

//        driver.findElement(By.cssSelector(".IntegrationModal-viewDemoBtn")).click();


        // driver.get("https://www.opencart.com/");

     //   driver.get("https://www.aptisure.com/");
        driver.get("https://the-internet.herokuapp.com/hovers");


    }

    @AfterClass
    public void teardown() {
        driver.quit();

    }


    @Test
    public void menuTest() {

        boolean b = driver.findElement(By.xpath("//h2[text()='Community Support']")).isDisplayed();
        Assert.assertTrue(b);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        WebElement wb =
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Login']")));
        boolean b11 = wb.isDisplayed();
        Assert.assertTrue(b11);


//
//        WebElement wb=
//        driver.findElement(By.xpath("//a[text()='Login']"));
//
//        String url=
//        driver.getCurrentUrl();
//                //.contains("https://www.opencart.com/index.php?route=account/login");
//
//Assert.assertEquals(url, "https://www.opencart.com/index.php?route=account/login");
//

//       boolean b1=driver.findElement(By.xpath("//a[text()='Login']")).isDisplayed();
//        Assert.assertTrue(b1);
//
// boolean b2=driver.findElement(By.xpath("(//a[text()='Register'])[2]")).isDisplayed();
//Assert.assertTrue(b2);
//
    }

   @Test
    public void mensuTest() {
Set<String> set111=
        driver.getWindowHandles();
       System.out.println(set111.size());
//set111.size()

       System.out.println(driver.findElement(By.tagName("img")).getSize());

    }

    @Test
    public void mensssuTest() {
        Set<String> set111=
                driver.getWindowHandles();
        System.out.println(set111.size());
//set111.size()

        System.out.println(driver.findElement(By.tagName("div")).getSize());


    }



//3 times

    //svg
    //dropdowm
    //wrong script
    //get/post
    //reusable methods
    //today learning


    @Test
    public void dropdown111Test() {

       // driver.navigate().to("https://practice.expandtesting.com/dropdown");
        driver.get("https://www.saucedemo.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//
//      WebElement wb= driver.findElement(By.xpath("//select[@id='dropdown']"));
//
//      Select sel=new Select(wb);
//      List<WebElement> list=
//      sel.getOptions();
//
//        System.out.println(list.size());
//
//    }

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
boolean b=
        driver.findElement(By.id("user-name")).isDisplayed();
Assert.assertTrue(b);

    }


    @Test
    public void dropdown1ss11Test() {
//        System.out.println();
//        driver.getPageSource().contains("div")

        System.out.println(driver.getTitle().contains("OpenCart - Open Source Shopping Cart Solution"));
      //  driver.getTitle().contains("OpenCart - Open Source Shopping Cart Solution")

    }

    @Test
    public void dropddown1ss11Test() {
//        System.out.println();
//        driver.getPageSource().contains("div")

//
//        System.out.println(driver.findElements(By.xpath("//a[text()='Marketplace']")).size());
//
//        Dimension d=
//        driver.findElement(By.xpath("(//a[contains(text(), 'Features')])[1]")).getSize();
//        System.out.println(d.getHeight());
//
//
//        String s=driver.findElement(By.xpath("(//a[contains(text(), 'Features')])[1]")).getCssValue("color");
//        System.out.println(s);
//

        try {
//            WebElement wb =
//                    driver.findElement(By.xpath("//button[text()='Certifications']"));
//            Assert.assertTrue(wb.getAttribute("type").equalsIgnoreCase("button"));
//            wb.getShadowRoot();

            boolean text =
                    driver.findElement(By.xpath("//div//h5[text()='name: user3']")).isDisplayed();
            System.out.println(text);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


        @Test
        public void dropdown11dd1Test() {

            System.out.println(driver.getCurrentUrl()
            );

            System.out.println(driver.getPageSource().contains("div"));
            System.out.println(driver.getTitle());
      //  driver.getTitle()

        }

    @Test
    public void dropddxdown11dd1Test() {

String text=driver.findElement(By.xpath("//p[text()='Hover over the image for additional information']")).getText();
                Assert.assertEquals(text, "Hover over the image for additional information");

                Assert.assertTrue(text.contains("Hover"));


    }

    @Test
    public void dTest() throws Exception {
////        String s=
////driver.findElement(By.xpath("Hovers")).getAttribute()
////                ""
//
//        System.out.println(s);
//
//        String s=
//        driver.findElement(By.xpath("//img[@alt='Fork me on GitHub']")).getAttribute("style");
//        System.out.println(s);
//     //   Assert.assertEquals(s, "position: absolute; top: 0; right: 0; border: 0;");

//
//        driver.get("https://beeceptor.com/docs/sample-api-for-testing/");
//        Thread.sleep(6000);
//        System.out.println(driver.findElements(By.cssSelector("#sample-user-api")).size());


        //System.out.println(driver.getCurrentUrl());
       // driver.getCurrentUrl()


        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(6));
      WebElement b=  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(text(), 'Hover over the image for additional information')]"
        )));

      Assert.assertTrue(b.isDisplayed());

    }


 */
/*

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        //  driver.get("https://www.saucedemo.com/");

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    // ❌ Wrong 1 - Wrong URL
    @Test(priority = 1)
    public void wrongUrlTest() {
        driver.get("https://www.saucedemo.com");
        Assert.assertTrue(driver.getTitle().contains("Swag Labs"));
    }

*/
/*

        // ❌ Wrong 3 - Wrong locator id
        @Test(priority = 3)
        public void wrongLocatorTest() {
            driver.get("https://www.saucedemo.com");
            driver.findElement(By.id("username")).sendKeys("standard_user");  // ❌ actual is "user-name"
        }

        // ❌ Wrong 4 - Wrong password
        @Test(priority = 4)
        public void wrongPasswordTest() {
            driver.get("https://www.saucedemo.com");
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("wrongpassword");  // ❌ actual is "secret_sauce"
            driver.findElement(By.id("login-button")).click();
            Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
        }

        // ❌ Wrong 5 - Wrong button id
        @Test(priority = 5)
        public void wrongButtonTest() {
            driver.get("https://www.saucedemo.com");
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("submit-button")).click();  // ❌ actual is "login-button"
        }

        // ❌ Wrong 6 - Wrong URL assertion
        @Test(priority = 6)
        public void wrongUrlAssertionTest() {
            driver.get("https://www.saucedemo.com");
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
            Assert.assertTrue(driver.getCurrentUrl().contains("home"));  // ❌ actual contains "inventory"
        }

        // ❌ Wrong 7 - Wrong class name
        @Test(priority = 7)
        public void wrongClassNameTest() {
            driver.get("https://www.saucedemo.com");
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
            List<WebElement> items = driver.findElements(By.className("inventory_items"));  // ❌ actual is "inventory_item"
            Assert.assertTrue(items.size() > 0);
        }

        // ❌ Wrong 8 - Wrong xpath
        @Test(priority = 8)
        public void wrongXpathTest() {
            driver.get("https://www.saucedemo.com");
            WebElement logo = driver.findElement(
                    By.xpath("//div[@class='login_logo1']"));  // ❌ actual is "login_logo"
            Assert.assertTrue(logo.isDisplayed());
        }

        // ❌ Wrong 9 - Wrong cart id
        @Test(priority = 9)
        public void wrongCartIdTest() {
            driver.get("https://www.saucedemo.com");
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
            driver.findElement(By.id("add-to-cart-backpack")).click();  // ❌ actual is "add-to-cart-sauce-labs-backpack"
        }

        // ❌ Wrong 10 - Wrong cart badge
        @Test(priority = 10)
        public void wrongCartBadgeTest() {
            driver.get("https://www.saucedemo.com");
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
            driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
            String count = driver.findElement(By.className("cart_badge")).getText();  // ❌ actual is "shopping_cart_badge"
            Assert.assertEquals(count, "1");
        }

        // ❌ Wrong 11 - Wrong CSS selector
        @Test(priority = 11)
        public void wrongCssSelectorTest() {
            driver.get("https://www.saucedemo.com");
            WebElement btn = driver.findElement(
                    By.cssSelector(".login-button"));  // ❌ actual is "#login-button"
            btn.click();
        }

        // ❌ Wrong 12 - Wrong dropdown text
        @Test(priority = 12)
        public void wrongDropdownTextTest() {
            driver.get("https://www.saucedemo.com");
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();

            WebElement dropdown = driver.findElement(By.className("product_sort_container"));
            Select select = new Select(dropdown);
            select.selectByVisibleText("Price Low to High");  // ❌ actual is "Price (low to high)"
        }

 */


    /*
    // ❌ Wrong 13 - Wrong dropdown index
    @Test(priority = 13)
    public void wrongDropdownIndexTest() {
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        WebElement dropdown = driver.findElement(By.className("product_sort_container"));
        Select select = new Select(dropdown);
        select.selectByIndex(1);  // ❌ only 4 options exist, index 10 doesn't exist
    }

    // ❌ Wrong 14 - NullPointerException
    @Test(priority = 14)
    public void nullPointerTest() {

        driver.get("https://www.saucedemo.com");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        WebElement element = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        element.click();  // ❌ NPE - element is null!
        String text = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).getText();
        Assert.assertEquals(text, "Sauce Labs Backpack");
    }

/*

        // ❌ Wrong 15 - Stale element
        @Test(priority = 15)
        public void staleElementTest() {
            driver.get("https://www.saucedemo.com");
            WebElement loginBtn = driver.findElement(By.id("login-button"));
            driver.navigate().refresh();  // page refreshes
            loginBtn.click();  // ❌ StaleElementReferenceException
        }

        // ❌ Wrong 16 - Wrong table id
        @Test(priority = 16)
        public void wrongTableIdTest() {
            driver.get("https://www.w3schools.com/html/html_tables.asp");
            List<WebElement> rows = driver.findElements(
                    By.xpath("//table[@id='myTable']//tr"));  // ❌ actual is "customers"
            Assert.assertTrue(rows.size() > 0);
        }

        // ❌ Wrong 17 - Wrong tag name
        @Test(priority = 17)
        public void wrongTagNameTest() {
            driver.get("https://www.w3schools.com/html/html_tables.asp");
            List<WebElement> rows = driver.findElements(
                    By.xpath("//table[@id='customers']//tr"));

            for (WebElement row : rows) {
                List<WebElement> cols = row.findElements(By.tagName("th"));  // ❌ actual is "td"
                for (WebElement col : cols) {
                    System.out.println(col.getText());
                }
            }
        }

        // ❌ Wrong 18 - Wrong expected count
        @Test(priority = 18)
        public void wrongCountTest() {
            driver.get("https://www.saucedemo.com");
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();

            List<WebElement> items = driver.findElements(By.className("inventory_item"));
            Assert.assertEquals(items.size(), 10);  // ❌ actual is 6
        }

        // ❌ Wrong 19 - Wrong assertion after remove
        @Test(priority = 19)
        public void wrongRemoveCartTest() {
            driver.get("https://www.saucedemo.com");
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
            driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
            driver.findElement(By.id("remove-sauce-labs-backpack")).click();

            // ❌ badge should be gone but we assert it exists
            String count = driver.findElement(
                    By.className("shopping_cart_badge")).getText();
            Assert.assertEquals(count, "0");
        }

        // ❌ Wrong 20 - Wrong link text
        @Test(priority = 20)
        public void wrongLinkTextTest() {
            driver.get("https://www.saucedemo.com");
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();

            // ❌ wrong link text
            driver.findElement(By.linkText("About Page")).click();  // ❌ actual is "About"
        }






    @Test(priority = 19)
    public void egegTest()
    {

      int size=  driver.findElements(By.tagName("a")).size();
        System.out.println("total number is: " + size);



    }

*/

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.cleartrip.com/");
    }

    @AfterClass
    public void teardown() {
        driver.quit();

    }


    @Test(priority = 0)
    public void tTest() throws Exception {

        driver.findElement(By.xpath("//*[local-name()='svg' and @data-testid='closeIcon']")).click();


        driver.findElement(By.xpath("//div[@class='closeit']")).click();

        WebElement wb =
                driver.findElement(By.xpath("//p[text()='Business']"));


        Actions act = new Actions(driver);
        act.moveToElement(wb).build().perform();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//h2[text()='OutOfOffice']")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://ooo.cleartrip.com/");

        //  driver.getCurrentUrl(), "https://ooo.cleartrip.com/"


    }


    /*
    @Test(priority = 1)
    public void urlTest() {
        boolean b = driver.getCurrentUrl().contains("https://www.cleartrip.com/");
        Assert.assertTrue(b);
    }

    @Test(priority = 1)
    public void udrlTest() {
        boolean b = driver.getCurrentUrl().contains("https://www.cleartrip.com/");
        Assert.assertTrue(b);
        Assert.assertTrue(b);
    }

    @Test(priority = 2)
    public void offerspageurlTest() {

        driver.findElement(By.xpath("//p[text()='Offers']")).click();
        if (driver.getCurrentUrl().equalsIgnoreCase("https://www.cleartrip.com/all-offers/flights/")) {
            System.out.println("landing correctly");

        }
    }


    @Test(priority = 2)
    public void offerddspageurlTest() {
        boolean b =
                driver.findElement(By.xpath("//p[contains(text(), 'Sudpport')]")).isDisplayed();

    }


    @Test(priority = 2)
    public void offerddddspageurlTest() {
        String title =
                driver.getTitle();
        System.out.println(title);
        System.out.println(driver.getWindowHandle());

        System.out.println(driver.findElements(By.tagName("div")).size());

        //  driver.findElements(By.tagName("div")).size();


        WebElement wb =
                driver.findElement(By.xpath("//p[text()='Hotels']"));
        click(wb);
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.cleartrip.com/hotels"));
//    driver.getCurrentUrl().contains("https://www.cleartrip.com/hotels")
        driver.getWindowHandle();

    }


  public void click(WebElement wb) {
        wb.click();


    }


    @Test(priority = 2)
    public void offerdddddspageurlTest() {
       // System.out.println(driver.findElements(By.tagName("img")).size());

        driver.get("https://www.opencart.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();
        System.out.println(driver.findElements(By.tagName("a")).size());
       // driver.findElements(By.tagName("a")).size();

        System.out.println(driver.getWindowHandle());
      //  driver.getWindowHandle()

        boolean urlexist1= driver.getCurrentUrl().contains("https://www.opencart");
        Assert.assertTrue(urlexist1);

        boolean urlexist= driver.getCurrentUrl().contains("https://www.opencart.com/");
        Assert.assertTrue(urlexist);


        driver.navigate().back();
        driver.navigate().refresh();

       if(driver.getCurrentUrl().equalsIgnoreCase("https://www.opencart.com/"))
       {
           System.out.println("gg");
       }
       else
       { System.out.println("gg1");
       }

    }
*/


}




