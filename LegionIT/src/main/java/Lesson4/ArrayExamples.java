package Lesson4;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayExamples {
    public void stringsArray(){
        String[] buttons = {"OK","Cancel","Login", "Sign up"};
        int lenght = buttons.length;
        System.out.println(buttons[0]);
        System.out.println("The length is: "+lenght);
    }
    public void integersArray(){
        int[] ids = {32,12,5,8};
        for (int numbers:ids)
        {
            System.out.println(numbers);
        }

    }
    public void arrayListForExample()
    {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("zalupa");
        arr.add("krivaya");
        arr.add("chudaya");
        arr.add("molodaya");
        arr.add("durnaya");
        for(String words:arr)
        {
            System.out.println(words);
        }
        System.out.println("The size of the list: "+ arr.size());
        arr.remove("molodaya");
        for (String words:arr)
        {
            System.out.println(words);
        }
        System.out.println();
        for (int i=0; i<=arr.size()-1;i++)
        {
            System.out.println(arr.get(i));
        }

    }
//    public String stringArrayWithSize()
//    {
//        String [] arr = new String[5];
//        arr [0] = "a";
//        arr [1] = "b";
//        arr [2] = "c";
//        arr [3] = "d";
//        arr [4] = "e";
//        int length = arr.length;
//        return arr[2];
//        //return length;
//    }
    public void arraySort()
    {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(100);
        arr.add(2);
        arr.add(45);
        arr.add(4);
        arr.add(18);
        Collections.sort(arr);
        for (Integer i:arr)
        {
            System.out.println(i);
        }
    }
    public void hashMap()
    {
        HashMap<String,String>hashmap=new HashMap<>();
        hashmap.put("Andrey","Ottawa");
        hashmap.put("ALEX","Toronto");
        hashmap.put("Avi","Jerusalem");

        System.out.println(hashmap);
        System.out.println(hashmap.get("Andrey"));
        System.out.println(hashmap.remove("Avi"));
        System.out.println(hashmap.size());
    }
    public void hashSetExample()
    {
        HashSet<String> hash = new HashSet<>();
        hash.add("Andrey");
        hash.add("Moshe");
        hash.add("Moshe");
        hash.add("Avi");
        hash.add("Avi");
        System.out.println(hash.size());
        List<String> aaa =new ArrayList<String>(hash);
        Collections.sort(aaa);
        System.out.println(aaa);
    }
}
