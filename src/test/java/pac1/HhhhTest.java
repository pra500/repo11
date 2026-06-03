package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HhhhTest {
        WebDriver driver;

        @BeforeClass
        public void setUp() {

            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
            driver.get("https://www.saucedemo.com");

        }

        @AfterClass
        public void tearDown() {
            driver.quit();
        }

        // ❌ Wrong 1 - Wrong URL
        @Test(priority = 1)
        public void wrongUrlTest() {
           // driver.get("https://www.saucedemo.com/");  // ❌ wrong URL
            Assert.assertEquals(driver.getTitle(), "Swag Labs");
        }

        // ❌ Wrong 2 - Wrong title
        @Test(priority = 2)
        public void wrongTitleTest() {
           // driver.get("https://www.saucedemo.com");
            Assert.assertEquals(driver.getTitle(), "Swag Labs");  // ❌ actual is "Swag Labs"
        }

        // ❌ Wrong 3 - Wrong locator id
        @Test(priority = 3)
        public void wrongLocatorTest() {
          //  driver.get("https://www.saucedemo.com");
            driver.findElement(By.id("user-name")).clear();
            driver.findElement(By.id("user-name")).sendKeys("standard_user");  // ❌ actual is "user-name"
        }

        // ❌ Wrong 4 - Wrong password
        @Test(priority = 4)
        public void wrongPasswordTest() {
        //    driver.get("https://www.saucedemo.com");
            driver.findElement(By.id("user-name")).clear();
                driver.findElement(By.id("user-name")).sendKeys("standard_user");

            driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("password")).sendKeys("secret_sauce");  // ❌ actual is "secret_sauce"
            driver.findElement(By.id("login-button")).click();
            Assert.assertTrue(driver.getCurrentUrl().contains("https://www.saucedemo.com/"));
        }

        // ❌ Wrong 5 - Wrong button id
        @Test(priority = 5)
        public void wrongButtonTest() {
           // driver.get("https://www.saucedemo.com");

            driver.findElement(By.id("user-name")).clear();
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();  // ❌ actual is "login-button"
        }

        // ❌ Wrong 6 - Wrong URL assertion
        @Test(priority = 6)
        public void wrongUrlAssertionTest() {
            driver.findElement(By.id("user-name")).clear();
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
            Assert.assertTrue(driver.getCurrentUrl().contains("saucedemo"));  // ❌ actual contains "inventory"
        }

        // ❌ Wrong 7 - Wrong class name
        @Test(priority = 7)
        public void wrongClassNameTest() {
          //  driver.get("https://www.saucedemo.com");
            driver.findElement(By.id("user-name")).clear();
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
            List<WebElement> items = driver.findElements(By.className("inventory_item"));  // ❌ actual is "inventory_item"
            Assert.assertTrue(items.size() > 0);
        }

        /*
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

        // ❌ Wrong 13 - Wrong dropdown index
        @Test(priority = 13)
        public void wrongDropdownIndexTest() {
            driver.get("https://www.saucedemo.com");
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();

            WebElement dropdown = driver.findElement(By.className("product_sort_container"));
            Select select = new Select(dropdown);
            select.selectByIndex(10);  // ❌ only 4 options exist, index 10 doesn't exist
        }

        // ❌ Wrong 14 - NullPointerException
        @Test(priority = 14)
        public void nullPointerTest() {
            driver.get("https://www.saucedemo.com");
            WebElement element = null;
            element.click();  // ❌ NPE - element is null!
        }

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
            driver.findElement(By.i


         */


}

