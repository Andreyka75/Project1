package Lesson5;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class M5ArraysAndHashesAssignment
{
    public String getDay(int day)
    {
        boolean dayOfTheWeek=true;
        String[]daysOfWeek = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        if(day<1||day>7)
        {
            dayOfTheWeek=false;
            return "Error value";
        }
        else
        {
            return daysOfWeek[day-1];
        }
    }
    public String getToyById(int id)
    {
        HashMap<Integer, String> hash = new HashMap<>();
        hash.put(12,"Batmobile");
        hash.put(45,"Light Saber");
        hash.put(6,"Wonder Woman");
        hash.put(201,"Hello Kitty Bag");
        hash.put(56,"Junior QA Analyst Doll");
        if(id!=12&&id!=45&&id!=6&&id!=201&&id!=56)
        {
            return "No such toy";
        }
        else
        {
            return hash.get(id);
        }
    }
    public void ArrayListOfStrings()
    {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Andrey");
        arrayList.add("Andrey");
        arrayList.add("Andrey");
        arrayList.add("Moisha");
        arrayList.add("Serjozha");
        arrayList.add("Grigory");

        ArrayList<String>list= new ArrayList<String>(arrayList);
        Collections.sort(list);
        //The array is sorted but with duplicated names

//        ArrayList<String>list= new ArrayList<String>();
//        for (int i=0;i<=arrayList.size()-1;i++)
//        {
//            if(!list.contains(arrayList.get(i)))
//            {
//                list.add(arrayList.get(i));
//            }
//
//        }
//        for(String name:arrayList)
//        {
//            if(!list.contains(name))
//            {
//                list.add(name);
//            }
//        }
       System.out.println(list);


    }


    }

