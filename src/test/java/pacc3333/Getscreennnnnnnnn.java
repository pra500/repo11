package pacc3333;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Getscreennnnnnnnn {

    public static void getscn(WebDriver driver) throws IOException {

        TakesScreenshot ts = (TakesScreenshot) driver;
        File s = ts.getScreenshotAs(OutputType.FILE);
        File d = new File(System.getProperty("user.dir" + "/s" + "img1" + ".png"));

        FileUtils.copyFile(s, d);
    }
}



        //.dir +





