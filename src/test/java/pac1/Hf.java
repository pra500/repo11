package pac1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.*;
import java.time.Duration;
import java.util.List;


public class Hf {

        WebDriver driver;

        @BeforeClass
        public void setUp() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        }

        @AfterClass
        public void tearDown() {
            driver.quit();
        }

        // ❌ Wrong 1
        @Test(priority = 1)
        public void wrongOneTest() {
            driver.get("https://the-internet.herokuapp.com/login");
            driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
            driver.findElement(By.cssSelector("#password")).sendKeys("SuperSecretPassword!");
            driver.findElement(By.cssSelector("button[type='submit']")).click();
            Assert.assertTrue(driver.getCurrentUrl().contains("secure1"));
        }

        // ❌ Wrong 2
        @Test(priority = 2)
        public void wrongTwoTest() {
            driver.get("https://the-internet.herokuapp.com/login");
            driver.findElement(By.cssSelector("#username1")).sendKeys("tomsmith");
            driver.findElement(By.cssSelector("#password")).sendKeys("SuperSecretPassword!");
            driver.findElement(By.cssSelector("button[type='submit']")).click();
            Assert.assertTrue(driver.getCurrentUrl().contains("secure"));
        }

        // ❌ Wrong 3
        @Test(priority = 3)
        public void wrongThreeTest() {
            driver.get("https://the-internet.herokuapp.com/login");
            driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
            driver.findElement(By.cssSelector("#password")).sendKeys("SuperSecretPassword!");
            driver.findElement(By.cssSelector("button[type='submit']")).click();
            WebElement msg = driver.findElement(By.cssSelector("#flash"));
            Assert.assertEquals(msg.getText(), "Wrong success message!");
        }

        // ❌ Wrong 4
        @Test(priority = 4)
        public void wrongFourTest() {
            driver.get("https://the-internet.herokuapp.com/checkboxes");
            List<WebElement> checkboxes = driver.findElements(
                    By.cssSelector("input[type='checkbox1']"));
            Assert.assertEquals(checkboxes.size(), 2);
        }

        // ❌ Wrong 5
        @Test(priority = 5)
        public void wrongFiveTest() {
            driver.get("https://the-internet.herokuapp.com/dropdown");
            WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));
            Select select = new Select(dropdown);
            select.selectByVisibleText("Option 1");
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Option 1");
        }


        // ❌ Wrong 6
        @Test(priority = 6)
        public void wrongSixTest() {
            driver.get("https://demoqa.com/text-box");
            driver.findElement(By.cssSelector("#userName")).sendKeys("John");
            driver.findElement(By.cssSelector("#userEmail")).sendKeys("notavalidemail");
            driver.findElement(By.cssSelector("#submit")).click();
            Assert.assertTrue(
                    driver.findElement(By.cssSelector("#email")).isDisplayed());
        }

        // ❌ Wrong 7
        @Test(priority = 7)
        public void wrongSevenTest() {
            driver.get("https://demoqa.com/select-menu");
            WebElement dropdown = driver.findElement(By.cssSelector("#oldSelectMenu"));
            Select select = new Select(dropdown);
            select.selectByIndex(20);
            Assert.assertNotNull(select.getFirstSelectedOption().getText());
        }

        // ❌ Wrong 8
        @Test(priority = 8)
        public void wrongEightTest() {
            driver.get("https://opensource-demo.orangehrmlive.com");
            driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
            driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
            driver.findElement(By.cssSelector("button[type='submit']")).click();
            Assert.assertEquals(driver.getTitle(), "OrangeHRM Live");
        }

        // ❌ Wrong 9
        @Test(priority = 9)
        public void wrongNineTest() {
            driver.get("https://opensource-demo.orangehrmlive.com");
            driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
            driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
            driver.findElement(By.cssSelector("button[type='submit']")).click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.urlContains("dashboard"));

            driver.findElement(By.cssSelector(".oxd-userdropdown1")).click();
            driver.findElement(By.cssSelector("a[href='/web/index.php/auth/logout']")).click();
            Assert.assertTrue(driver.getCurrentUrl().contains("login"));
        }

        // ❌ Wrong 10
        @Test(priority = 10)
        public void wrongTenTest() {
            driver.get("https://automationexercise.com");
            driver.findElement(By.cssSelector("a[href='/login1']")).click();
            Assert.assertTrue(driver.getCurrentUrl().contains("login"));
        }

        // ❌ Wrong 11
        @Test(priority = 11)
        public void wrongElevenTest() {
            driver.get("https://automationexercise.com");
            driver.findElement(By.cssSelector("a[href='/login']")).click();
            driver.findElement(By.cssSelector("input[placeholder='Search Product1']"))
                    .sendKeys("dress");
            driver.findElement(By.cssSelector("#search-button")).click();
            List<WebElement> products = driver.findElements(
                    By.cssSelector(".productinfo"));
            Assert.assertTrue(products.size() > 0);
        }

        // ❌ Wrong 12
        @Test(priority = 12)
        public void wrongTwelveTest() {
            driver.get("https://www.demoblaze.com");
            driver.findElement(By.cssSelector("#login2")).click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.cssSelector("#loginusername")));

            driver.findElement(By.cssSelector("#loginusername")).sendKeys("testuser");
            driver.findElement(By.cssSelector("#loginpassword")).sendKeys("testpass");
            driver.findElement(By.cssSelector("button[onclick='logIn()']")).click();
            Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
        }

        // ❌ Wrong 13
        @Test(priority = 13)
        public void wrongThirteenTest() {
            driver.get("https://demoqa.com/webtables");
            List<WebElement> rows = driver.findElements(
                    By.cssSelector(".rt-tr-group1"));
            Assert.assertTrue(rows.size() > 0);
        }

        // ❌ Wrong 14
        @Test(priority = 14)
        public void wrongFourteenTest() {
            driver.get("https://the-internet.herokuapp.com/login");
            WebElement element = null;
            element.sendKeys("tomsmith");
        }

        // ❌ Wrong 15
        @Test(priority = 15)
        public void wrongFifteenTest() {
            driver.get("https://the-internet.herokuapp.com/login");
            driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
            driver.findElement(By.cssSelector("#password")).sendKeys("SuperSecretPassword!");
            driver.findElement(By.cssSelector("button[type='submit']")).click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.urlContains("secure"));

            WebElement loginBtn = driver.findElement(By.cssSelector("#username"));
            driver.navigate().refresh();
            loginBtn.sendKeys("tomsmith");
        }
    }


