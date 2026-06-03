package pac1;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class T1 {

    public static void main(String[] args) {

        String[] arr={"sdf", "dergb", "fgwtbhtbt"};

        Arrays.sort(arr);

        for(String s:arr)
        {
            System.out.println(s);
        }
        System.out.println(arr.length);


        System.out.println("--------");
        String[] ar1r={"sdf", "dergb", "fgwtbhtbt"};

        Arrays.sort(ar1r);

        for(String s:ar1r)
        {
            System.out.println(s);
        }
        System.out.println(ar1r.length);


        String str="India is a strong country";
        String[] arrr=str.split("i");
        for(String s:arrr)
        {
            System.out.println(s);
        }


        Map<String, String> map=new TreeMap<String, String>();
        map.put("sd", "ab");
        map.put("sds", "abss");
        map.put("sdqq", "aeeeeb");

        System.out.println(map.size());



    }
}
