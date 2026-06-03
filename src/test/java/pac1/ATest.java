package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.lang.annotation.Target;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class ATest {


    WebDriver driver;

    @BeforeClass
    public void beforeClass() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        options.addArguments("--window-maximize-");
        options.addArguments("--disable-popup-blocking");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.abhibus.com/");

    }

    @AfterClass
    public void afterClass() {


        driver.quit();
    }

    /*
    @Test
    public void testddTest() {

        System.out.println(driver.findElement(By.xpath("//a[@id='offers-link']")).getText());
//driver.findElement(By.xpath("//a[@id='offers-link']")).getText();
    }

    @Test
    public void testdsxsdTest() {
        System.out.println(driver.findElement(By.xpath("//span[text()='Need Help?']")).getLocation());
        // driver.findElement(By.xpath("//span[text()='Need Help?']")).getLocation();
    }

    //  @Test
    public void testdssxsdTest() {
        WebElement wb = driver.findElement(By.xpath("//a[text()='Bus Partner Offer']"));

        System.out.println(wb.getLocation());

        // driver.findElement(By.xpath("//span[text()='Need Help?']")).getLocation();


        wb.getTagName();
    }


    @Test
    public void testdsxssdTest() {
        boolean b =
                driver.findElement(By.xpath("//span[text()='Search']")).isDisplayed();
        Assert.assertTrue(b);

        String bd =
                driver.findElement(By.xpath("//span[text()='Hotels']")).getText();
        System.out.println(bd);
    }


    @Test
    public void testdsdxssdTest() {
        String bd =
                driver.findElement(By.xpath("//span[text()='Hotels']")).getText();
        System.out.println(bd);
    }


    @Test
    public void testdsxcssdTest() {
        boolean b =
                driver.findElement(By.xpath("//div//a[text()='Tomorrow']")).isDisplayed();
        Assert.assertTrue(b);
    }


    @Test
    public void testdsxcdssdTest() {
        String b =
                driver.findElement(By.xpath("//a[@id='bus-link']")).getText();
        System.out.println(b);
    }


    @Test
    public void tesdtdsxcdssdTest() {
        String b =
                driver.findElement(By.xpath("//a[@id='bus-link']")).getText();
        System.out.println(b);
    }


    @Test
    public void tesdtdssxcdssdTest() {

//String s= driver.findElement(By.xpath("//a[@id='bus-link']")).getTagName();
//        System.out.println(s);
        int size =
                driver.findElements(By.xpath("//a")).size();
        System.out.println(size);

    }


    @Test
    public void tesdtsddssxcdssdTest() {

//String s= driver.findElement(By.xpath("//a[@id='bus-link']")).getTagName();
//        System.out.println(s);


    List<WebElement> list=driver.findElements(By.tagName("img"));
        System.out.println(list.size());


//        for(int i=0;i<=list.size();i++) {
//
//            System.out.println(list.get(i).getText());
//           // list.get(i).getText()
//        }

    }


*/


    @Test
    public void tesdtdssxcdssdTest() {

        System.out.println(driver.findElements(By.xpath("input")).size());

          }

    @Test
    public void tesdtsTest() {
        String s=
      driver.findElement(By.xpath("//div//a[text()='Buses From Top Cities']")).getText();
        System.out.println(s);


        String needhelp=
        driver.findElement(By.xpath("//span[text()='Need Help?']")).getText();
        Assert.assertEquals(needhelp, "Need Help?");

        String tagname=
        driver.findElement(By.xpath("//div//a[text()='Mumbai to Ahmedabad Bus']")).getTagName();
        System.out.println(tagname);

    }

    @Test
    public void tesdtsdssxcdssdTest() {
                driver.findElement(By.xpath("//span[text()='Login/SignUp']")).click();
                boolean b11=
        driver.findElement(By.xpath("//h4[text()='Login to AbhiBus']")).isDisplayed();
                Assert.assertTrue(b11);
    }
    @Test
    public void tesdtsdssxacdssdTest() {


      boolean b=  driver.getTitle().contains("Book Bus Tickets Online at Lowest Fare, Upto ₹500 off On Bus Booking | AbhiBus");
        System.out.println(b);


    }
    @Test
    public void beeceptorTest() throws Exception {

        driver.get("https://beeceptor.com/docs/sample-api-for-testing/#sample-blog-post-api");
Thread.sleep(6000);

        driver.findElement(By.xpath("//a[text()='Beeceptor Feature Documentation']")).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://beeceptor.com/docs/beeceptor-features/"));
        driver.findElement(By.xpath("//a[text()='Sign In']")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//button[contains(text(), 'Login with Password')]")).isDisplayed());
        //driver.findElement(By.xpath("//button[contains(text(), 'Login with Password')]")).isDisplayed();
        //a[text()='Sign In']

        System.out.println(driver.findElements(By.xpath("//a")).size());

List<WebElement>list=
        driver.findElements(By.xpath("//a"));
        int size=list.size();
        System.out.println(size);


for(int i=0;i<=list.size()-1;i++)
{

  String s=  list.get(i).getAttribute("href");
  broke(s);

}
    }

    public static void broke(String s) throws Exception
    {
        URL url=new URL(s);
        HttpURLConnection hip=(HttpURLConnection)url.openConnection();
        hip.connect();
        hip.setConnectTimeout(3000);
        int code=hip.getResponseCode();
        if(code!=200)
        {
            System.out.println("broken");
        }

    }



}
