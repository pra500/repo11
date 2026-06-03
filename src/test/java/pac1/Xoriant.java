package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class Xoriant {

    WebDriver driver;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
       // driver.get("https://www.xoriant.com/");
        driver.get("https://tech.walmart.com/content/walmart-global-tech/en_us.html");

    //    driver.findElement(By.xpath("//button[text()='Accept all cookies']")).click();
    //    driver.findElement(By.xpath("//span[@class='close-flash']")).click();

    }

@AfterClass
    public void teardown() {
        driver.quit();

    }

    /*

    @Test
    public void menuTest() {
        Assert.assertTrue(driver.getTitle().contains("Digital Engineering and Enterprise Solution Company | Xoriant"));


    }


    @Test
    public void bacddfvscestTest() {
        int size=
     driver.findElements(By.xpath("//a")).size();
        System.out.println(size
            );


    }



//new scenario:
    @Test
    public void badcddfvscestTest() throws Exception{


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        //driver.manage().deleteAllCookies();


        String f="C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\h7.properties";
        FileInputStream fip=new FileInputStream(f);
        Properties prop=new Properties();
        prop.load(fip);

        String url=prop.getProperty("url");
        String username=prop.getProperty("urer");
        String password=prop.getProperty("pwd");



        driver.get(url);
        driver.findElement(By.id(username)).sendKeys(username);
        driver.findElement(By.id(password)).sendKeys(password);
        driver.findElement(By.xpath("//button[@id='submit-login']")).click();

    }
*/


    @Test(priority = 0)
    public void ghhTest(){
        System.out.println(driver.getCurrentUrl());
      //  driver.getCurrentUrl()
    }

    @Test(priority = 1)
    public void ghsdhTest(){
        System.out.println(driver.getWindowHandle());
        //  driver.getCurrentUrl()
    }
    @Test(priority = 2)
    public void geehhTest(){
        System.out.println(driver.getTitle());
        //  driver.getCurrentUrl()
    }
    @Test(priority = 3)
    public void geeddhhTest(){
        System.out.println(driver.findElements(By.xpath("//a")).size());
        //  driver.getCurrentUrl()
    }
    @Test(priority = 4)
    public void geedddhhTest(){
        System.out.println(driver.findElements(By.xpath("//img")).size());
        //  driver.getCurrentUrl()
    }
    @Test(priority = 5)
    public void geeddddhhTest(){
        System.out.println(driver.findElements(By.xpath("//div")).size());
        //  driver.getCurrentUrl()
    }
    @Test(priority = 6)
    public void geeddcddhhTest(){
        System.out.println(driver.findElements(By.xpath("//table")).size());
        //  driver.getCurrentUrl()
    }  @Test(priority = 7)
    public void geewwdddhhTest(){
        System.out.println(driver.findElements(By.xpath("//input")).size());
        //  driver.getCurrentUrl()
    }
    @Test(priority = 8)
    public void geedddwwhhTest(){
        System.out.println(driver.findElements(By.xpath("//button")).size());
        //  driver.getCurrentUrl()
    }
    @Test(priority = 9)
    public void geeddddwwhhTest(){
        System.out.println(driver.findElements(By.xpath("//meta")).size());
        //  driver.getCurrentUrl()
    }
    @Test(priority = 10)
    public void geedddsewwwwwhhTest(){
        System.out.println(driver.findElements(By.xpath("//script")).size());
        //  driver.getCurrentUrl()
    }
    @Test(priority = 11)
    public void linllllllTest(){
        System.out.println(driver.findElements(By.xpath("//link")).size());
        //  driver.getCurrentUrl()
    }
    @Test(priority = 12)
    public void linllllddllTest(){
        System.out.println(driver.findElements(By.xpath("//iframe")).size());
        //  driver.getCurrentUrl()
    }
    @Test(priority = 13)
    public void linlllslllTest(){
        System.out.println(driver.findElements(By.xpath("//p")).size());
        //  driver.getCurrentUrl()
    }
    @Test(priority = 14)
    public void linTest(){
        System.out.println(driver.findElements(By.xpath("(//a[normalize-space()='Careers'])[1]")).size());
    }

    @Test(priority = 15)
    public void liddnTest() {
        driver.findElement(By.xpath("(//a[normalize-space()='Careers'])[1]")).click();
    }
    @Test(priority = 16)
    public void liddddnTest() {
      boolean b= driver.findElement(By.xpath("//a[normalize-space()='Careers'])[1]")).isDisplayed();
        System.out.println(b);
    }



}