package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.Properties;

public class e {

    public static WebDriver driver;

    public static void main(String[] args) throws Exception {


/*
        String filepath = "C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\w111.properties";
        FileInputStream fip = new FileInputStream(filepath);
        Properties prop = new Properties();
        prop.load(fip);

        prop.getProperty("u");
        prop.getProperty("p");
        prop.getProperty("date");

        System.out.println(prop.getProperty("u"));
        System.out.println(prop.getProperty("p"));
        System.out.println(prop.getProperty("date"));


        FileOutputStream fop=new FileOutputStream(filepath);

        prop.setProperty("username", "user@1234");
        prop.setProperty("password", "user@123488888");
        prop.store(fop, "rger");
        fop.close();

*/


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.opencart.com/");

//        boolean b=
//        driver.getCurrentUrl().contains("http");
//        Assert.assertTrue(b);
//
//
//
//
//       if(driver.getTitle().equalsIgnoreCase("OpenCart - Open Source Shopping Cart Solution"))
//           System.out.println("correct");
//       else {
//           System.out.println("not correct");
//       }



//int size=
//        driver.findElements(By.xpath("//li//a[text()='Marketplace']")).size();
//        System.out.println(size);

       // driver.findElements(By.xpath( //li//a[text()='Blog']




        /*
Point p=
        driver.findElement(By.xpath("(//div//a[text()='Login'])[2]")).getLocation();
        System.out.println(p.getX());
        System.out.println(p.getY());

        System.out.println(driver.findElement(By.xpath("(//div//a[text()='Get Started'])[1]")).getText());

      //  driver.findElements(By.xpath("(//div//a[text()='Get Started'])[1]")).size();

        System.out.println(driver.findElement(By.xpath("//div//h1[text()='The best open-source and FREE eCommerce platform']")).getText());
//driver.findElement(By.xpath("//div//h1[text()='The best open-source and FREE eCommerce platform']")).getText();



       driver.quit();

         */

//
//
//        String filepath = "C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\h1.properties";
//        FileOutputStream fip=new FileOutputStream(filepath);
//        Properties prop = new Properties();
//        prop.setProperty("reg", "efergrgrgwg");
//        prop.store(fip, "mg");
//


        String filepath1="C:\\Users\\pragt\\IdeaProjects\\ssd\\src\\test\\resources\\h4.properties";
        FileOutputStream fop=new FileOutputStream(filepath1);
        Properties prop=new Properties();
        prop.setProperty("name", "parag");
        prop.setProperty("age", "38");
        prop.setProperty("date", "15/4/2022");
prop.store(fop, "dsf");

  }
}


