package pac1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class T6 {

    WebDriver driver;

    @Test
    public void egTest() throws Exception {
        String filepath = "C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\h.properties";
        FileInputStream fip = new FileInputStream(filepath);
        Properties prop = new Properties();
        prop.load(fip);
        String url = prop.getProperty("url");


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
        driver.get(url);
        System.out.println(driver.getTitle());


    }


}
