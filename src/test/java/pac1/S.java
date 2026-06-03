package pac1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.*;


public class S {

    public static WebDriver driver;

    public static void main(String[] args) {

        String str = "Selenium";
        String str1 = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            str1 = str1 + str.charAt(i);
        }

        System.out.println("reverse string is " + str1);


        List<Integer> list = new ArrayList<Integer>();

        list.add(12);
        list.add(2);
        list.add(8);
        Collections.sort(list);

        for (int i : list) {
            System.out.println(i);
        }

        //StaleElementReferenceException

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().deleteAllCookies();
        driver.get("https://www.geeksforgeeks.org/");

        WebElement wb=
        driver.findElement(By.xpath("//div[text()='Practice']"));

        driver.navigate().refresh();

        System.out.println();
        wb.getText();


       // wb.getClass()

    }



}