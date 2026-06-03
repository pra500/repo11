package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Tr {




        WebDriver driver;
        JavascriptExecutor js;

        @BeforeClass(alwaysRun = true)
        public void setup() {


            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
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


                String title =
                        driver.getTitle();
                Assert.assertEquals(title, "Wanderfly | Empowering Employee Wellbeing");

                boolean logopresent = driver.findElement(By.xpath("//a[contains(text(), 'Wanderfly')]")).isDisplayed();
                Assert.assertTrue(logopresent);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }


        //2) Validate Navigation Menu Items
        // @Test(priority = 1)
        public void NavigationMenuItemsverifyTest() {

            try {

                WebElement blog =
                        driver.findElement(By.xpath("//div//a[starts-with(text(), 'Blogs')]"));
                boolean flag = blog.isDisplayed();
                Assert.assertTrue(flag);


                WebElement EmployeeGifting =
                        driver.findElement(By.xpath("//div//a[starts-with(text(), 'Employee Gifting')]"));
                boolean flag1 = EmployeeGifting.isDisplayed();
                Assert.assertTrue(flag1);

                blog.click();
                Assert.assertEquals(driver.getTitle(), "Wanderfly Blogs | An Employee Wellbeing Company");


                driver.navigate().back();


                EmployeeGifting.click();
                Assert.assertEquals(driver.getTitle(), "Employee Gifting by Wanderfly ");


            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        //3) Verify “About Us” Page
        @Test(priority = 2)
        public void aboutusbuttonTest() {

            try {
                driver.findElement(By.xpath("(//div//a[contains(text(), 'About Us')])[1]")).click();

                List<WebElement> allitems =
                        driver.findElements(By.xpath("//div[@class='flex flex-col items-center justify-center']"));

                if (allitems.size() == 4) {
                    System.out.println("total items count is correct");
                } else {
                    System.out.println("total items count is not correct");
                }

                for (int i = 0; i <= allitems.size() - 1; i++) {
                    System.out.println(allitems.get(i).getText());

                }

            } catch (Exception e) {
                e.printStackTrace();

            }

        }


        //4) Verify “Contact Us” Form Presence
        @Test(priority = 3)
        public void contactusverifyTest() {

            try {
                driver.findElement(By.xpath("//a[text()='Contact Us']")).click();


                boolean flag = driver.findElement(By.xpath("//div[@class='undefined']//h1[text()='Connect with us to know more']")).isDisplayed();
                Assert.assertTrue(flag);
                System.out.println(flag);


                boolean Youremail = driver.findElement(By.xpath("//label[text()='Your email']")).isDisplayed();
                Assert.assertTrue(Youremail);
                System.out.println(Youremail);


                boolean phoneno =
                        driver.findElement(By.xpath(" //label[text()='Phone No']")).isDisplayed();
                Assert.assertTrue(phoneno);

                boolean message =
                        driver.findElement(By.xpath("//label[text()='Message']")).isDisplayed();
                Assert.assertTrue(message);

                boolean sendmessage =
                        driver.findElement(By.xpath("//button[text()='Send message']")).isDisplayed();
                Assert.assertTrue(sendmessage);

                driver.findElement(By.xpath("(//*[name()='svg']//*[local-name()='path' and @fill-rule='evenodd'])[5]")).click();


            } catch (Exception e) {
                e.printStackTrace();
            }


        }


        //5) Validate Sign Up / Sign Up Button Navigation
        @Test(priority = 4)
        public void SignUpButtonverifyTest() {

            try {
                driver.findElement(By.xpath("(//a[starts-with(text(), 'Sign up for free')])[1]")).click();

                String url = driver.getCurrentUrl();
                Assert.assertEquals(url, "https://app.wanderfly.in/login");

                boolean Logintoyouraccount = driver.findElement(By.xpath("//h1[contains(text(), 'Login to your account')]")).isDisplayed();
                Assert.assertTrue(Logintoyouraccount);

                boolean Email = driver.findElement(By.xpath("//label[text()='Email']")).isDisplayed();
                Assert.assertTrue(Email);

                boolean phoneno =
                        driver.findElement(By.xpath("  //label[text()='Password']")).isDisplayed();
                Assert.assertTrue(phoneno);

                boolean message =
                        driver.findElement(By.xpath("//button[contains(text(), 'Login')]")).isDisplayed();
                Assert.assertTrue(message);


            } catch (Exception e) {
                e.printStackTrace();
            }

        }


        //6) Check “Request a Demo” Button
        @Test(priority = 5)
        public void requestademobuttonverifyTest() {

            try {
                driver.findElement(By.xpath("(//div[normalize-space()='Request a demo'])[2]")).click();

                WebElement wb =
                        driver.findElement(By.xpath("//iframe[@title='Calendly Scheduling Page']"));
                driver.switchTo().frame(wb);

                String thiscalendly = driver.findElement(By.xpath("//div//h1[text()='This Calendly URL is not valid.']")).getText();
                Assert.assertEquals(thiscalendly, "This Calendly URL is not valid.");

                String ifyou =
                        driver.findElement(By.xpath("//div[contains(text(), 'If you are the owner of this account, you can')]")).getText();
                Assert.assertEquals(ifyou, "If you are the owner of this account, you can log in to find out more.");


                String poweredby=
                        driver.findElement(By.xpath("//div[@data-id='branding']")).getText();
                System.out.println(poweredby);
                Assert.assertTrue(poweredby.contains("Calendly"));

//
//            poweredby.contains("POWERED BY Calendly");
//     Assert.assertEquals(poweredby, " POWERED BY Calendly");



                js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollBy(200, 280)", "");
                js.executeScript("window.scrollBy(-140, -230)", "");

                driver.findElement(By.xpath("//button[@aria-label='Close modal']")).click();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }



    }










