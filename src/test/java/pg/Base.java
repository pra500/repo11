package pg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Base {

    protected WebDriver driver;

    @BeforeMethod
    public void be()
    {

        driver = new ChromeDriver();

    }

    @AfterMethod
    public void af()
    {
        driver.quit();

    }




}
