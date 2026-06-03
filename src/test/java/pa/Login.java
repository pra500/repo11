package pa;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends Base
{

    @Test
    public void logiXVFnTest()
    {

        driver.get("https://www.cleartrip.com/");
        System.out.println( driver.getPageSource().toUpperCase());

        System.out.println(  driver.findElement(By.xpath("//h1[text()='Recent searches']")).isDisplayed());






    }
}
