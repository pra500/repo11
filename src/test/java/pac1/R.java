package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.*;


public class R {

    public static WebDriver driver;

    public static void main(String[] args) {

        driver = new ChromeDriver();
       // driver.navigate().to("https://transform.tools/json-to-json-schema");
        long s1=     System.currentTimeMillis();
        System.out.println(s1);


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
        driver.navigate().to("https://transform.tools/json-to-json-schema");
   long s=     System.currentTimeMillis();
        System.out.println(s);


//
//        ArrayList<String> fruits = new ArrayList<>();
//
//        fruits.add("apple");
//
//        fruits.add("banana");
//
//        fruits.add("grape");
//
//
//        for(String s: fruits)
//        {
//            System.out.println(s);
//        }
//
//
//        System.out.println("---------");
//
//        fruits.set(2, "orange");
//
//
//        for(String s: fruits)
//        {
//            System.out.println(s);
//        }
//
//        System.out.println("---------");
//
//
//        StringBuilder snb=new StringBuilder("cff");
//        snb.append("vdf");
//        snb.append(" ");
//        snb.append(" ");
//        snb.append(" ");
//
//        String vb=snb.toString();
//
//        System.out.println(vb);
//
//        System.out.println();
//
//        String[] arr={"fdbb", "sdfbrt", "fbgbn"};
//        System.out.println(arr.length);
//
//        System.out.println(arr[1]);
//
//
//        System.out.println("----------");
//        ArrayList<String> fruits1 = new ArrayList<String>();
//        fruits1.add("f");
//        fruits1.add("fdd");
//        fruits1.add("eef");
//        System.out.println(fruits1.size());
//
//        System.out.println("-----------");
//
//        List<String>litsss=new ArrayList<String>();
//        litsss.add("sdv");
//        litsss.add("ddsdv");
//        litsss.add("desdv");
//        litsss.add("desdv");
//        litsss.add("desdv");
//        litsss.add("desdv");
//
//        System.out.println(litsss.size());
//
//        System.out.println(litsss.size());
    }
    }

