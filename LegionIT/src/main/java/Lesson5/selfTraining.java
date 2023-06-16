package Lesson5;

import java.util.ArrayList;
import java.util.List;

public class selfTraining {
    //    public boolean has22()
//    {
//        boolean has22=false;
//        int []arr={5,2,2,1,1};
//        for(int i=0;i<arr.length-1;i++)
//        {
//            if(arr[i]==2&&arr[i+1]==2)
//            {
//                has22=true;
//            }
//
//        }
//        return has22;
//
//    }
    public boolean lucky13() {
        boolean lucky = true;
        int[] arr = {5, 4, 3, 5, 2, 111, 4, 4, 1};
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == 1 || arr[i] == 3) {
                lucky = false;
            }
        }
        return lucky;
    }

    public int maxTriple()
    {

        int[] arr = {};
        int maxNum = 0;
        if (arr.length != 0)
        {


            for (int i = 0; i <= arr.length - 1; i++)
            {
                if (arr[i] > maxNum)
                {
                    maxNum = arr[i];
                }
            }

        }
        return maxNum;
    }
    public boolean arrayFront9()
    {
        boolean front=false;
        int[]arr={0,1,6,3,9,0,12};
        int end=arr.length;
        if(end>4)
        {
            end=4;
        }

        for(int i=0;i<end;i++)
        {
            if(arr[i]==9)
            {
                front=true;
            }
        }
        return front;

    }
    public void square()
    {
        ArrayList<Integer>arr=new ArrayList<Integer>();
        arr.add(23);
        arr.add(3);
        arr.add(6);



        for (int i=0;i<=arr.size()-1;i++)
        {
            int pro=arr.get(i);
            pro=pro*pro;
            System.out.println(pro);
        }


    }
}
