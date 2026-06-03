package pg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends Base {


    @Test
    public void geTest() {

        driver.get("https://demowebshop.tricentis.com/onepagecheckout");
        System.out.println(driver.getTitle().contains("Demo"));

        By search = By.xpath("//input[@id='small-searchterms']");
        visisble(search);

        // driver.getTitle().contains("Demo");
    }


    public void visisble(By locator) {


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

        driver.findElement(locator).sendKeys("shoes", Keys.
                ENTER);


        String title =
                driver.getTitle();
        Assert.assertEquals(title, "Demo Web Shssop. Search");

        driver.quit();


    }
}
