package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class Yatra1Test {

    WebDriver driver;

    @BeforeClass
    public void setup() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        options.addArguments("no-sandbox");
        options.addArguments("start-maximized");
        options.addArguments("headless");
        options.addArguments("disable-dev-shm-usage");
        options.addArguments("disable-autofille");
        options.addArguments("window-size=1920, 1080");


        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.get("https://www.opencart.com/");
    }

    @AfterClass
    public void teardown() {
        driver.quit();

    }


    @Test(priority = 0)
    public void geTest() {

        Assert.assertEquals(driver.getTitle(), "www.yatra.com");

    }

    @Test(priority = 0)
    public void gessTest() {
        int size =
                driver.findElements(By.tagName("input")).size();
        System.out.println(size);
    }

    @Test(priority = 0)
    public void gdeTest() throws Exception {

        driver.navigate().to("https://www.testmuai.com/lp/automation-testing/?utm_source=google&utm_medium=cpc&utm_campaign=TestMu_Search_Generic_RLSA_Automation_Testing_India_2026&utm_term=automation%20testing%20tools&utm_id=23704984264&utm_content=AutomationTesting-Phrase&gad_source=1&gad_campaignid=23704984264&gbraid=0AAAABDNwvM5Oqc0zDFlk63hY4HqKly4t9&gclid=Cj0KCQjw8PDPBhCeARIsAOJwmWWmCeb8Cd0cIL8klvXKUAvGa2X_UCrCi6Ilu14KleoBIKIiMN2CJNEaAgJSEALw_wcB");
        Thread.sleep(4000);

        WebElement wb =
                driver.findElement(By.xpath("//a[text()='Get Started Free']"));

        System.out.println(wb.getText());


        boolean b = wb.isDisplayed();
        Assert.assertTrue(b);

        String color = wb.getCssValue("color");
        System.out.println(color);

        String gtt =
                wb.getAriaRole();
        Assert.assertEquals("link", gtt);

        boolean b1 =
                driver.findElement(By.xpath("//a[text()='Get Started Free']")).isDisplayed();
        Assert.assertTrue(b1);

        //    driver.findElement(By.xpath("//a[text()='Get Started Free']"))
        // https://www.testmuai.com/lp/automation-testing/?utm_source=google&utm_medium=cpc&utm_campaign=TestMu_Search_Generic_RLSA_Automation_Testing_India_2026&utm_term=automation%20testing%20tools&utm_id=23704984264&utm_content=AutomationTesting-Phrase&gad_source=1&gad_campaignid=23704984264&gbraid=0AAAABDNwvM5Oqc0zDFlk63hY4HqKly4t9&gclid=Cj0KCQjw8PDPBhCeARIsAOJwmWWmCeb8Cd0cIL8klvXKUAvGa2X_UCrCi6Ilu14KleoBIKIiMN2CJNEaAgJSEALw_wcB

    }

    @Test(priority = 0)
    public void urlTest() {
        System.out.println(driver.getCurrentUrl());

    }

    @Test(priority = 0)
    public void titleTest() {
        System.out.println(driver.getTitle());

    }

    @Test(priority = 0)
    public void currentwindowidTest() {
        System.out.println(driver.getWindowHandle());

    }

    @Test(priority = 0)
    public void brokenlinksTest() throws Exception {

        List<WebElement> list =
                driver.findElements(By.tagName("a"));

        System.out.println(list.size());


        for (int i = 0; i <= list.size() - 1; i++) {
            String element = list.get(i).getAttribute("href");
            broo(element);
        }

    }

    @Test(priority = 0)
    public void brokenimagesTest() throws Exception {
//
//        System.out.println(driver.findElements(By.tagName("div")).size());
//
//      if(driver.findElements(By.xpath("//a[text()='Demo']")).size()==2)
//          System.out.println("correct");
//
//      else
//          System.out.println("incorrect");
    }


    public void broo(String element) throws Exception {

        URL url;
        HttpURLConnection con;
        try {
            url = new URL(element);
            con = (HttpURLConnection) url.openConnection();
            con.setConnectTimeout(3000);
            int code = con.getResponseCode();
            if (code == 400) {
                System.out.println(con.getResponseMessage() + " " + "broken");
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }


    @Test(priority = 0)
    public void brokenidmagesTest() throws Exception {

        driver.get("https://practice.expandtesting.com/dropdown");
        Thread.sleep(4000);

        WebElement dropdown =
                driver.findElement(By.xpath("//select[@id='country']"));
        Select sel = new Select(dropdown);

        System.out.println(sel.getOptions().size());

        //sel.selectByValue("Aruba");

        sel.selectByVisibleText("Aruba");

        //sel.selectByValue("Bhutan");

        sel.selectByVisibleText("Bhutan");

    }


    @Test(priority = 0)
    public void geeeTest() {

        //  Assert.assertEquals(driver.getTitle(), "www.yatra.com");

    }

    @Test(priority = 1)
    public void geeeeeTest() {

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.opencart.com/");
    }

//    @Test(priority = 2)
//    public void geeeTest() {
//
//        Assert.assertEquals(driver.getTitle(
//
//    }
//
//
//    @Test(priority = 3)
//    public void geeeTest() {
//
//        Assert.assertEquals(driver.getTitle(), "www.yatra.com");
//
//
// }


    @Test(priority = 0)
    public void geddeeTest() {
        System.out.println(driver.getWindowHandle());

        //driver.getWindowHandle()


    }
}
