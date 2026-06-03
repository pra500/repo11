package ppppp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Bs {

    WebDriver driver;

    Bs(WebDriver driver)
    {
        this.driver=driver;

    }

    By idddd= By.id("username");


    public void enterid()
    {
        driver.findElement(idddd).sendKeys("admin");
    }



}
