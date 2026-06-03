package pac1;

import org.openqa.selenium.interactions.SourceType;
import pacccc.StoreeeePage;

import java.util.*;

public class Tg {

    public static void main(String[] args)
    {

//
//        try {
//            String[] aa = {"f", "dv",
//                    "fdv"};
//            System.out.println(aa[9]);
//
//        }
//        catch (Exception e) {e.printStackTrace();}
//
//
//finally {
//            System.out.println("correct");
//        }


/*
        StringBuilder s=new StringBuilder("amit");
        String s1=s.reverse().toString();
        System.out.println(s1);    //tima


       // Object[] arr = new Object[]


                int[] arr={9, 7, 0, 88};

                for(int i:arr)
                {
                    System.out.println(i);
                }

        System.out.println(arr[0]);


        System.out.println(arr.length);


            Map<String, String> mao=new HashMap<String, String>();
            mao.put("ddd","ssss");
            mao.put("ddsdd","ssses");
            mao.put("d3dd","sssrs");
        System.out.println(mao.size());


        System.out.println("******************");

        String[] arddd={"dv", "dbtr", "thtyhtjj"};
        System.out.println(arddd.length);
        System.out.println(arddd[0]);




String str="madam";
String str1="";

for(int i=str.length()-1;i>=0;i--)
{

    str1=str1+str.charAt(i);
}

if(str1.equals(str))
{
    System.out.println("palin");
}
else
    System.out.println("not palin");



       String[] attt={"df", "svv", "svvbbeb"};
        System.out.println(attt.length);


        Map<String, String>map1=new HashMap<String, String>();
        map1.put("user1","test1");
        map1.put("user2","test2");
        map1.put("user3","test3");

       for(Map.Entry<String, String> mm:map1.entrySet())
        {
            System.out.println(mm.getKey()+ " " + mm.getValue());
        }



       List<Integer> list=new ArrayList<Integer>();
       list.add(3);
       list.add(2);
       list.add(9);
       list.add(15);

        System.out.println(list.size());
int aa=
        list.get(1);
        System.out.println(aa);


        for(int i:list)
        {
            System.out.println(i);
        }


        System.out.println("---------");

        Collections.sort(list);


        for(int i:list)
        {
            System.out.println(i);
        }


        int[] araa={4, 8, 9, 18, 0, 12, 14};

        for(int i=0;i<= araa.length-1;i++)
        {
            System.out.println(araa[i]);

            if(araa[i]==18)
            {
                System.out.println("awesome");
                break;

            }
        }




        String[] arrw={"ff", "dcw", "sfvfer"};

        Arrays.sort(arrw);


        for(String se1:arrw)
        {

            System.out.println(se1);

        }

        System.out.println("---------");

      String[] arrr1={"aa", "dvf", "kll"};
        for(String wwws:arrr1)
        {
            System.out.println(wwws);
        }


        Set<String>set1=new HashSet<String>();
        set1.add("df");
        set1.add("ssdwf");

        System.out.println(set1.size());

        set1.add("fbg");

        System.out.println(set1);




        String[] a1={"x", "s"};
        String[] a11={"z", "l"};

        Arrays.sort(a1);
        Arrays.sort(a11);



        for(String i:a1)
        {
            System.out.println(i);
        }
        System.out.println("----");


        for(String i:a11)
        {
            System.out.println(i);
        }


                int p=19;
             String pp=Integer.toString(p);
        System.out.println(pp);

        List<String>list1=new ArrayList<String>();
        list1.add("dfv");
        list1.add("dfwwv");
        list1.add("dddfv");

        System.out.println(list1.size());
//list1.size()


        String[] ar={"dsc", "v", "sdgereg"};
        System.out.println(ar.length);
       // ar.length


        //String a211="vrrgw";

//       int y= Integer.parseInt(a211);
//        System.out.println(y);

*/







        int[] a6={9, 0, 5, 2};
        int temp;
        for(int i=0;i<a6.length-1;i++)
        {
            for(int j=0;j<a6.length-i-1;j++)
            {
                if(a6[j]>a6[j+1])
                {
                    temp=a6[j];
                    a6[j]=a6[j+1];
                    a6[j+1]=temp;


                }
            }
        }


        for(int i:a6)
        {
            System.out.println(i);
        }



        //queue:
        //add() - for adding
        //size() - for getting size of the queue



        Queue<String> qq=new PriorityQueue<String>();
        qq.add("sdd");
        qq.add("adfv");
        qq.add("uiuiu");

        for(String s:qq){
            System.out.println(s);
        }

        System.out.println(qq.size());

        qq.remove("sdd");


for(String s:qq){
    System.out.println(s);
}



//wap to count vowels and consonants:


        String str = "Hello World";
        int vow=0, con=0;

       char[] arr=str.toLowerCase().toCharArray();

       for(char c:arr)
       {
           if(c=='a' || c=='e' ||  c=='i' || c=='o' || c=='u')
           {
               vow++;

           }
           else {
               con++;
           }
       }


        System.out.println("total vowels: " + vow);
        System.out.println("total conso: " + con);

//
//        total vowels: 3
//        total conso: 8
//




        System.out.println("-----------");

        String st="helloprHJItiou";
        int vo=0, co=0;
        char[] arr1=st.toLowerCase().toCharArray();


        for(int i=0;i<=arr1.length-1;i++)
        {
            if(arr1[i]=='a' || arr1[i]=='e' || arr1[i]=='i' || arr1[i]=='o' || arr1[i]=='u')
            {
                  vo++;
            }
            else
            {
                co++;
            }
        }


        System.out.println("vowels: " + vo);
        System.out.println("consona: " + co);


//
//        vowels: 6
//        consona: 8


        System.out.println("--------------");

        String strss="hhlrtyy";

        System.out.println(strss.charAt(0));

        System.out.println(strss.charAt(2));

        int[] sss={8, 9, 0, 6};

        for(int s:sss)
        {
            System.out.println(s);


        }
        System.out.println(sss.length);

List<String>list=new ArrayList<String>();
list.add("fg");
list.add("xdddg");
list.add("eeeeg");
list.add("aeewwg");

Collections.sort(list);

        System.out.println(list);












    }

}
