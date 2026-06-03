package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class H5 {

    WebDriver driver;

    H5(WebDriver driver) {
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

