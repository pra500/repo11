package baseeeeeeeeee;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class G {

    WebDriver driver;

    public G(WebDriver driver) {

        this.driver = driver;
    }


    By idddd = By.id("password");


    public void enterpwd() {

        driver.findElement(idddd).sendKeys("sdvvere@dfdf88");
    }


}
