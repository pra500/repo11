package pac1;

import javax.swing.event.TreeExpansionEvent;
import java.util.*;

public class Stringdsd {

    public static void main(String[] args) {
        Set<String>set1=new TreeSet<String>();
        set1.add("dsv");
        set1.add("adsv");
        set1.add("xdsv");

        System.out.println(set1.size());

        set1.add("fdv");
        System.out.println(set1.size());

        for(String s:set1)
        {
            System.out.println(s);
        }

        Iterator<String>itr=set1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
            //itr.next()
        }



        String s="dfgv";
        System.out.println(s);


        int[] arr={0, 8, 9};
        for(int i:arr)
        {
            System.out.println(i);
        }



        char[] ff={'d', 'r', 'f'};

        for(char c:ff)
        {
            System.out.println(c);
        }




        }
    }

