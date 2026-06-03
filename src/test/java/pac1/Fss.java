package pac1;

import java.util.*;


public class Fss {

    public static void main(String[] args) {

            String ss = "dv";
        System.out.println(ss.length());

        StringBuilder sb = new StringBuilder();
        sb.append("se");
        sb.append("dsv");
        sb.append("dsvdf");
        sb.append(" ");
        sb.append("dsvsdv");
        String sss =
                sb.toString();
        System.out.println(sss);


        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(9, 4);
        map.put(29, 34);
        map.put(99, 64);

        for (Map.Entry<Integer, Integer> mm : map.entrySet()) {
            System.out.println(mm.getValue() + " " + mm.getKey());

        }

        Set<String> settt = new TreeSet<String>();
        settt.add("sdv");
        settt.add("rdddv");
        settt.add("mswwdv");

        System.out.println(settt.size());


        String s1 = "silent";
        String s2 = "lisent";
        char[] arr = s1.toCharArray();
        char[] arr1 = s1.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr1);

        if (Arrays.equals(arr, arr1))
            System.out.println("ana");
        else
            System.out.println("not ana");



        List<String> list = new LinkedList<String>();
        list.add("dmmxdd");
        list.add("dvfdvdd");
        list.add("ddvdfbdfdd");


        for (String s : list) {
            System.out.println(s);
        }

        System.out.println(list.size());

        for (int i = 0; i <= list.size() - 1; i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.size());
        //  list.size()

        String[] arr11={"f","dsb", "fdbrr3tn35n"};
        for(String s:arr11)
        {
            System.out.println(s);
        }







    }
}
