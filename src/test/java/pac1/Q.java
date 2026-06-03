package pac1;

import java.util.*;


public class Q {

    public static void main(String[] args) {

        String[] arr={"fd", "csds", "dsvdsvwev"};


        System.out.println("before sorting");
List<String>list=Arrays.asList(arr);

System.out.println(list.size());


        for(String s:list)
        {
            System.out.println(s);
        }
        System.out.println("after sorting");


        Collections.sort(list);

     for(String s:list)
     {
         System.out.println(s);
     }


    }
}
