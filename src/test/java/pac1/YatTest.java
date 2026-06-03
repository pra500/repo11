package pac1;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.auxiliary.MethodCallProxy;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class YatTest {

    WebDriver driver;

    @BeforeClass
    public void beforeClass() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
      //  driver.get("https://beeceptor.com/docs/sample-api-for-testing/");

    }

    @AfterClass
    public void tear() {
        driver.quit();

    }

    @Test
    public void yyGeTest() {
        System.out.println(
                driver.getTitle());


        //  driver.getTitle()
    }


    @Test
    public void ydyGeTest() {
        System.out.println(driver.getWindowHandle());

    }

    @Test
    public void yyddGeTest() {
        System.out.println(
                driver.getCurrentUrl());


    }

//25. Push project to GitHub
//26. Create README file
//27. Fix one old bug
//28. Practice Selenium exceptions
//29. Create mini framework
//30. Practice Java collections


    @Test
    public void yydxfvfeTest() {
        System.out.println(
                driver.getCurrentUrl());

        System.out.println(driver.getTitle());
    }


    @Test
    public void yydddxfvfeTest() {
        boolean b =
                driver.findElement(By.xpath("//h1[text()='Sample API For Tesssting']")).isDisplayed();
        System.out.println(b);
        Assert.assertTrue(b);


    }

    @Test
    public void yyddssdxfvfeTest() {
        boolean b =
                driver.findElement(By.xpath("//h1[text()='Sample API For Tesssting']")).isDisplayed();
        System.out.println(b);
        Assert.assertTrue(b);


    }

    @Test
    public void yydddddxfvfeTest() {
        boolean b =
                driver.findElement(By.xpath("//h1[text()='Sample API For Tesssting']")).isDisplayed();
        System.out.println(b);
        Assert.assertTrue(b);


    }


    @Test
    public void yyddddxddxfvfeTest() {
        boolean b =
                driver.findElement(By.xpath("//h1[text()='Sample API For Tesssting']")).isDisplayed();
        System.out.println(b);
        Assert.assertTrue(b);



    }

    //new code:

//    4. Write dropdown handling code
//5. Handle alerts
//6. Handle iFrames
//7. Handle multiple windows
//8. Practice waits




    @Test
    public void y1Test() throws InterruptedException {

        /*
        driver.get("https://practice.expandtesting.com/dropdown#google_vignette");
        Thread.sleep(5000);

        WebElement wb=
        driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select sel=new Select(wb);
        sel.selectByVisibleText("Option 2");
        List<WebElement> lisss=
        sel.getOptions();
        System.out.println(lisss.size());


boolean b=
sel.isMultiple();
        System.out.println(b);



        driver.get("https://www.selenium.dev/selenium/web/alerts.html#");
        Thread.sleep(5000);


        driver.findElement(By.xpath("(//a[contains(text(), 'click me')])[2]")).click();

        Alert alt=driver.switchTo().alert();
        System.out.println();
        String s=alt.getText();

        System.out.println(s);
       // Assert.assertTrue(alt.getText().contains("www"));



        alt.accept();



        driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");
        Thread.sleep(5000);

        WebElement wb=
        driver.findElement(By.xpath("(//iframe[contains(@src, 'sample.php')])[1]"));

        driver.switchTo().frame(wb);


String text=
        driver.findElement(By.xpath("//h2[text()='Iframe 1']")).getText();

Assert.assertEquals(text, "Iframe 1");

driver.switchTo().defaultContent();


*/


        driver.get("https://vinothqaacademy.com/multiple-windows/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//button[text()='New Browser Window']")).click();
        Set<String> set1=
        driver.getWindowHandles();

        Iterator<String>itr=set1.iterator();
        String parent=  itr.next();
        String child=  itr.next();
        String title=
      //  String title=
        driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title, "Demo Site – WebTable – Vinoth Tech Solutions");
        driver.close();

        driver.switchTo().window(parent);

//        WebElement home=
//        driver.findElement(By.xpath("(//a[text()='Home'])[2]"));


Wait<WebDriver>wait=new FluentWait<WebDriver>(driver)
        .withTimeout(Duration.ofSeconds(30))
        .ignoring(NoSuchElementException.class)
        .pollingEvery(Duration.ofSeconds(30));

        WebElement home=
wait.until(driver ->  driver.findElement(By.xpath("(//a[text()='Home'])[2]")));

        home.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://vinothqaacademy.com/multiple-windows/");


//        driver.getCurrentUrl(), "https://vinothqaacademy.com/multiple-windows/"


//        Practice ArrayList
//        Practice HashMap
//        Practice HashSet
//        Practice Exception Handling
//        Create custom exception
//        Parse JSON response










    }




}


