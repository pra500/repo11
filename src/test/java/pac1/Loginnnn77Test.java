package pac1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;

public class Loginnnn77Test {

    WebDriver driver;

    @BeforeClass
    public void beforeClass() {

        FirefoxOptions firefoxOptions=new FirefoxOptions();
        firefoxOptions.addArguments("-private");
        driver = new FirefoxDriver(firefoxOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().deleteAllCookies();

        // driver.get("https://www.geeksforgeeks.org/");

        driver.get("https://jqueryui.com/droppable/");


    }
    @AfterClass
    public void afterClass() {

        driver.quit();
    }

//    @Test(priority = 2)
//    public void verifyWindowHandle() {
//
//        System.out.println(driver.getWindowHandle());
//
//    }
//
//    @Test(priority = 3)
//    public void verifyHomePageUrl() {
//
//        System.out.println(driver.getCurrentUrl());
//    }
//
//    @Test(priority = 4)
//    public void verifytotalinks() {
//
//        System.out.println(driver.findElements(By.tagName("a")).size());
//
//    }
//
//    @Test(priority = 5)
//    public void verifytotalimages() {
//
//        System.out.println(driver.findElements(By.tagName("img")).size());
//    }
//
//    @Test(priority = 6)
//    public void verifytotalinputboxes() {
//
//        System.out.println(driver.findElements(By.tagName("input")).size());
//    }
//
//    @Test(priority = 7)
//    public void verifysigninbutton() {
//        System.out.println(driver.findElement(By.xpath("//button[text()='Sign In']")).isDisplayed());
//
//    }
//
//    @Test(priority = 8)
//    public void verifylogobutton() {
//
//        System.out.println(driver.findElement(By.xpath("//img[@alt='geeksforgeeks']")).isDisplayed());
//    }
//
//    @Test(priority = 9)
//    public void verifycoursesbutton() {
//
//        System.out.println(driver.findElement(By.xpath("//div[text()='Courses']")).isDisplayed());
//
//    }
//
//    @Test(priority = 10)
//    public void verifySessdddionActive() {
//
//        System.out.println(driver.getPageSource().contains("div"));
//    }
//
//    @Test(priority = 10)
//    public void verifySessissonActive() {
//
//        System.out.println(driver.getPageSource().contains("div"));
//    }
//
//    @Test(priority = 10)
//    public void verifySesddddsionActive() {
//
//        System.out.println(driver.getPageSource().contains("div"));
//    }
//
//    @Test(priority = 10)
//    public void verifySessionAdctive() {
//
//        System.out.println(driver.getPageSource().contains("div"));
//    }
//
//
//    @Test(priority = 10)
//    public void verifgssionActive() {
//
//        System.out.println(driver.getPageSource().contains("div"));
//    }
//
//    @Test(priority = 10)
//    public void verifySefbssionActive() {
//
//        System.out.println(driver.getPageSource().contains("div"));
//    }
//
//    @Test(priority = 10)
//    public void verifySessiddonActive() {
//
//        System.out.println(driver.getPageSource().contains("div"));
//    }
//
//    @Test(priority = 10)
//    public void verifySesdddsionActive() {
//
//        System.out.println(driver.getPageSource().contains("div"));
//    }
//    @Test(priority = 10)
//    public void verifySesdddsddionActive() {
//
//        System.out.println(driver.getPageSource().contains("button"));
//    }
//    @Test(priority = 11)
//    public void verifySesdddsdddionActive() {
//        System.out.println(driver.findElements(By.tagName("button")).size());
//
//    }
//
//    @Test(priority = 11)
//    public void verifySesddsdsdddionActive() {
//        System.out.println(driver.findElement(By.xpath("//div[contains(text(), 'Registered Address:')]")).getText());
//
//    }
//
//    @Test(priority = 11)
//    public void verifTest() {
//        System.out.println(driver.findElement(By.xpath("//div[contains(text(), 'Registered Address:')]")).getText());
//
//    }
//
//
//    @Test(priority = 11)
//    public void verifzvTest() {
//        System.out.println(driver.findElement(By.xpath("//div[contains(text(), 'Registered Address:')]")).getText());
//
//    }
//    @Test(priority = 11)
//    public void verifySesddsdsTest() {
//
//        Point p=
//        driver.findElement(By.xpath("//div[text()='Practice']")).getLocation();
//        System.out.println(p.getX());
//        System.out.println(p.getY());
//         }
//
//    @Test(priority = 11)
//    public void verifySesddsdssddddionATest() {
////        System.out.println(driver.findElement(By.xpath("//div[contains(text(), 'Registered Address:')]")).getText());
////        System.out.println(driver.findElement(By.xpath("//div[@class='socialIcon linkedin']")).getLocation());
//
//       List<WebElement>list= driver.findElements(By.tagName("link"));
//        System.out.println(list.size());
//       for(int i=0;i<=list.size();i++)
//       {
//           System.out.println(list.get(i).getText());
//       }
//
//    }
//
//
//    @Test(priority = 11)
//    public void verifySesddsdssssddddionATest() {
//
////        System.out.println(driver.findElement(By.xpath("//div[contains
//        System.out.println(driver.findElements(By.tagName("div")).size());
//
//    }
//
//    @Test(priority = 11)
//    public void verifySesddazsdssssddddionATest() {
//
////        System.out.println(driver.findElement(By.xpath("//div[contains
//
////        boolean b=
////        driver.findElement(By.cssSelector("#stitches")).isDisplayed();
////        Assert.assertTrue(b);
//
//
////
////int size=
//      driver.findElements(By.xpath("//script[@type='text/javascript']")).size();
////Assert.assertEquals(size, 3);
//
//
//        int size1=
//                driver.findElements(By.xpath("//li")).size();
//        Assert.assertEquals(size1, 58);
//
//
//
//}




@Test
public void geeTest()
{

    /*

    // Fix 1: Use CSS selector instead
    WebElement searchBox = driver.findElement(By.cssSelector(".gs-input"));
searchBox.sendKeys("Java Tutorial");

    // Fix 2: Correct method name
// Fix 3: Find correct button
  //  WebElement searchBtn = driver.findElement(By.cssSelector(".gsc-search-button"));
//searchBtn.click();
// Fix 4: Add wait for results
//wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".entry-title")));
//    WebElement result = driver.findElement(By.cssSelector(".entry-title"));
//System.out.println("First result: " + result.getText());

    FluentWait<WebDriver>wait=new FluentWait<WebDriver>(driver);
    wait.withTimeout(Duration.ofSeconds(8)).pollingEvery(Duration.ofSeconds(2));
WebElement wb=
    driver.findElement(By.xpath("//div[contains(text(), 'Hello, What Do You Want To Learn?')]"));
    WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(8));
    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'Hello, What Do You Want To Learn?')]")));
    System.out.println(wb.getAriaRole()
    );

    System.out.println(driver.getCurrentUrl().contains("http"));
// driver.getCurrentUrl().contains("http");


    List<WebElement>list=
    driver.findElements(By.tagName("a"));

        for(int i=0;i<=list.size()-1;i++)
        {
            System.out.println(list.get(i).getText());

        }
*/

String s=
    driver.findElement(By.xpath("//button[text()='Sign In']")).getCssValue("border");
    System.out.println(s);

    System.out.println(driver.getWindowHandle());
   // driver.getWindowHandle()

         driver.quit();

}

@Test
public void ggTest()
{
    WebElement wb=
    driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
driver.switchTo().frame(wb);

    WebElement draggable = driver.findElement(By.id("draggable"));
            WebElement droppable = driver.findElement(By.id("droppable"));

            Actions actions = new Actions(driver);
            actions.dragAndDrop(draggable, droppable).perform();

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", draggable);

//
//            WebElement invisibleElement = driver.findElement(By.id("does-not-exist"));
//            invisibleElement.click();
            driver.quit();
        }

    @Test
    public void gddgTest() {

        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        WebElement wb = driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(wb);


        WebElement tryItBtn = driver.findElement(By.xpath("//button[text()='Try it']"));
        tryItBtn.click();


        //  WebElement outsideFrame = driver.findElement(By.tagName("body"));

        Alert alt = driver.switchTo().alert();


        boolean b = alt.getText().contains("Hello!");
        Assert.assertTrue(b);

        alt.accept();


        driver.quit();


}





@Test
public void gddddgTest()
{

    System.out.println(

    driver.getCurrentUrl().contains("http"));



    driver.navigate().back();



}






}





