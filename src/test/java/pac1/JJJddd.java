    package pac1;

    import org.apache.logging.log4j.core.util.JsonUtils;
    import org.openqa.selenium.By;
    import org.openqa.selenium.Keys;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.testng.Assert;

    import java.time.Duration;

    public class JJJddd {


        public static WebDriver driver;

        public static void main(String[] args) {

            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));

            //    driver.get("https://www.opencart.com/");
            //  driver.get("https://www.google.com/");

            driver.get("https://practicetestautomation.com/practice-test-login/");


    //
    //        String st =
    //                driver.findElement(By.xpath("//img[@title='OpenCart - Open Source Shopping Cart Solution']")).getText();
    //        System.out.println(st);
    //
    //
    //        String s1t =
    //                driver.findElement(By.xpath("//a[text()='Features']")).getText();
    //        System.out.println(s1t);
    //
    //
    //        String stt =
    //                driver.findElement(By.xpath("//a[text()='Marketplace']")).getText();
    //        System.out.println(stt);

            driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("selenium testing", Keys.ENTER);
            boolean b =
                    driver.findElement(By.xpath("//a/h3[text()='Selenium']")).isDisplayed();
            System.out.println(b);


        }


    }
