package paccc;

import java.util.*;

public class T11 {

    public static void main(String[] args) {

        System.out.println("----------");

        String sr="rggtr";
      char[] arr1=  sr.toCharArray();

      for(char s:arr1)
      {
          System.out.println(s);
      }

        System.out.println("**********");

      StringBuilder sb=new StringBuilder();
      sb.append("f");
      sb.append("f33");
      sb.append("fee");
      sb.append(" ");
      sb.append("kdbgv");
      sb.append("jv");
      sb.append("sdfbvb");

      System.out.println(sb.toString());

      StringBuffer sb1=new StringBuffer("r");
      StringBuffer sb2=new StringBuffer("nbbn");
      StringBuffer sb3=new StringBuffer("uyyu");

        sb1.append("bbfbnng");
        System.out.println(sb1.toString());
//
//
//
//        Practice ArrayList
//        Practice HashMap
//        Practice HashSet
//        Practice Exception Handling
//        Create custom exception
//        Parse JSON response

        List<Integer> list=new ArrayList<Integer>();
        list.add(2);
        list.add(32);
        list.add(22);

        for(int i:list)
        {
            System.out.println(i);
        }


        System.out.println("-----------");


        Map<Integer, Integer> map=new HashMap<Integer, Integer>();
        map.put(1, 5);
        map.put(21, 15);
        map.put(31, 65);

      boolean b=  map.containsKey(1);
        System.out.println(b);

      Set<Integer> set1=  map.keySet();

        System.out.println("only keys");
      for(int i:set1)
      {
          System.out.println(i);
      }


    Set<Integer>set11=new HashSet<Integer>();
      set11.add(3);
        set11.add(23);
        set11.add(22);

        for(int i:set11)

        {

            System.out.println(i);
        }


        int i=12;

        try
        {
            int c=i/0;


        } catch (Exception e) {
            e.printStackTrace();
        }

        finally {
            System.out.println("my final");
        }





    }
}
