package pac1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class H1 {

    public static void main(String[] args) {

        Integer[] arr={9, 0, 6};
        System.out.println(arr.length);

        //ger> list1=new ArrayList<Integer>(arr);

List<Integer>list=
        Arrays.asList(arr);
        System.out.println(list.size());

        System.out.println(list.get(1));

list.add(54);
        System.out.println(list.size());
//list.size()


        for(Integer ii:list)
        {
            System.out.println(ii);
        }
        for(int i=0;i<=list.size()-1;i++)
        {
            System.out.println(i);
           // list.get(i);
        }

        try
        {
            int i=10;
            int c=i/10;
            System.out.println(c);

        } catch (Exception e) {
             e.printStackTrace();

        }
        finally {
            System.out.println("final");
        }
    }
}
