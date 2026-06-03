package pac22;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginddffTest extends BassTest
{



@Test
public void geeTest()
{
    driver.get("https://beeceptor.com/docs/sample-api-for-testing/");

    String s=
driver.getPageSource();
    System.out.println(s);



    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(12));
   boolean b= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[starts-with(@class, 'button button--secondary button--outline collapseSidebarButton_PEFL')]"))).isDisplayed();
    System.out.println(b);



    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Create an Endpoint']"))).click();

    String title=

    driver.getTitle();

    Assert.assertEquals(title, "Beeceptor - Rest & SOAP API Mock Server");
String text=
    driver.findElement(By.xpath("//h1[contains(text(), 'Unfinished APIs')]")).getText();
    System.out.println(text);

    driver.findElement(By.xpath("//input[starts-with(@id, 'channel')]")).sendKeys("java project");
}














}
