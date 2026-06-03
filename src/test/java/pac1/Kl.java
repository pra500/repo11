package pac1;

import java.util.HashMap;
import java.util.Map;

public class Kl {
    public static void main(String[] args) {


        String str="fvrt";
        char[] arr=
        str.toCharArray();

        for(char c:arr)
        {
            System.out.println(c);
        }

        Map<String, String> mm=new HashMap<>();
        mm.put("csv","dsv");
        mm.put("cxssv","dsev");
        mm.put("cseev","ds22v");
       for(Map.Entry<String, String>m:
        mm.entrySet())
       {
           System.out.println(m.getKey() + " " + m.getValue());

       }

        System.out.println(mm.size());
     //   mm.size()

        mm.put("csessev","ds22wwv");
        System.out.println(mm);


    }


}
