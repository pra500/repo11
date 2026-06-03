package paccc;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class Login {

    WebDriver driver;

    @Test
    public void loginTest()
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("incognito");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-autofilled");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://vinothqaacademy.com/drop-down/");
        //Assert.assertTrue(driver.getTitle().contains("Test Login | Practice Test Automation"));
        WebElement wb=
        driver.findElement(By.xpath("//select[@id='simpleDropdown']"));
        Select sel=new Select(wb);
        sel.selectByVisibleText("Mumbai");

       boolean b= driver.findElement(By.xpath("//img[@class='img-responsive logo_transparent_static visible']")).isDisplayed();
        Assert.assertTrue(b);

        boolean b1=
        driver.findElement(By.cssSelector("label[for='simpleDropdown']")).isDisplayed();
        Assert.assertTrue(b1);

    }
    @Test
    public void alertTest() throws InterruptedException {
        driver = new ChromeDriver(  );
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        //driver.get("https://vinothqaacademy.com/drop-down/");
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        Thread.sleep(5000);

        driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
        Alert alt=driver.switchTo().alert();
     String text=alt.getText();
     Assert.assertTrue(text.contains("Hello , share this practice page and share your knowledge"));
        alt.accept();


        driver.findElement(By.xpath("//button[@id='openwindow']")).click();
        Set<String> set1=driver.getWindowHandles();
        Iterator<String>itr=set1.iterator();

      String parent=  itr.next();
      String child=  itr.next();

      driver.switchTo().window(child);
      boolean b=driver.findElement(By.xpath("//div[@class='ParkWebLayout_parkWebLander__rQVL1']")).isDisplayed();
        System.out.println(b);

        driver.close();
        driver.switchTo().window(parent);

        WebElement frame=
        driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
        driver.switchTo().frame(frame);

       boolean b11= driver.findElement(By.xpath("(//a[contains(text(), 'JOIN NOW')])[1]")).isDisplayed();
       Assert.assertTrue(b11);

        driver.switchTo().defaultContent();

        boolean b12= driver.findElement(By.xpath("//legend[contains(text(), 'Radio Button Example')]")).isDisplayed();
        Assert.assertTrue(b12);

//
//
//        8. Practice waits
//        9. Practice broken XPath fixing
//        10. Create reusable methods
//        11. Create BaseTest class
//        12. Create Page Object Model


        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(9));
     boolean ele=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Home']"))).isDisplayed();
Assert.assertTrue(ele);



        Wait<WebDriver> wait1 = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        boolean b111=
        wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Practice Page']"))).isDisplayed();
        Assert.assertTrue(b111);


    }



}

