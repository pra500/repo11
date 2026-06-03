package pac1;

import java.util.*;


public class Naa {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("dsfs");
        sb.append("dsfsff");
        sb.append("dsfs4fff");
        sb.append("dsfs4fff555");

        String s1 =
                sb.toString();

        System.out.println(s1);


        Map<String, String> m1 = new TreeMap<String, String>();
        m1.put("name", "tom");
        m1.put("city", "meerut");
        m1.put("address", "btm");

        for (Map.Entry<String, String> aaa : m1.entrySet()) {
            System.out.println(aaa.getKey() + " " + aaa.getValue());
        }

        System.out.println(m1.size());

    }
}
