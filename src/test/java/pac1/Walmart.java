package pac1;
import java.util.*;


public class Walmart
{

    public static void main(String[] args) {


        String[] att={"h", "f"};

        for(String s:att)
        {
            System.out.println(s  + " ");

        }

        System.out.println("---------");



        //need to do again
        Map<String, Integer> unsortedMap = new HashMap<String, Integer>();
        unsortedMap.put("df", 1);
        unsortedMap.put("wwdf", 19);
        unsortedMap.put("dwwf", 6);
        unsortedMap.put("dwwwwf", 3);
        for(Map.Entry<String, Integer>mm:unsortedMap.entrySet())
        {
            System.out.println(mm.getKey() + " " + mm.getValue());
        }

        System.out.println("000000000000000000000");

        Map<String, Integer> map111 = new TreeMap<String, Integer>(unsortedMap);
        for(Map.Entry<String, Integer>mm:map111.entrySet())
        {
            System.out.println(mm.getKey() + " " + mm.getValue());
        }

        




    }
}





