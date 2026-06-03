package pac1;

import java.util.*;

public class Hyy {

    public static void main(String[] args) {

        Set<Integer> set11=new HashSet<Integer>();
        set11.add(23);
        set11.add(5);
        set11.add(4);
        set11.add(14);

        List<Integer> list11=new ArrayList<Integer>(set11);
        Collections.sort(list11);

        for(Integer i:list11) {

            System.out.println(i);
        }
        System.out.println(list11.size());


        LinkedList<String> ll=new LinkedList<String>();
        ll.add("df");
        ll.add("dfwe");
    }
}
