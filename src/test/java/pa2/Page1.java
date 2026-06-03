package pa2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page1 {

    WebDriver driver;

    public Page1(WebDriver driver) {
        this.driver = driver;
    }

    By idname = By.id("username");
    By pwdname = By.id("password");
    By submitbtn = By.id("submit");


    public void enterdetails() {
        driver.findElement(idname).sendKeys("test");
        driver.findElement(pwdname).sendKeys("test");
        driver.findElement(submitbtn).click();

    }
}


