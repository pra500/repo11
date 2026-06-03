package baseeeeeeeeee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Pageeee {
    WebDriver driver;


    public Pageeee(WebDriver driver) {

        this.driver = driver;
    }

    By usernnnn = By.id("username");


    public void get() {

        driver.findElement(usernnnn).sendKeys("dfvfd@1234");



    }


}
