package pac1;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Tgg {

    public static void main(String[] args) {


        String[] arr={"wef", "sdfwer", "gwgwwr"};

        System.out.println(arr.length);


        for(String s:arr)
        {
            System.out.println(s + "aaaaaaa");

        }

        int[]  ar={9, 0, 7};
        for(int i:ar)
        {
            System.out.println(i);
        }

        System.out.println(ar.length);


        Queue<Integer>sss=new PriorityQueue<Integer>();
        sss.add(6);
        sss.add(26);
        sss.add(23);

        if(sss.size()==3)
        {
            System.out.println("correct");
        }

    }
}

