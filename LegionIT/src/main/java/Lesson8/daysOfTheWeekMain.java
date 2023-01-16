package Lesson8;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import staticClassesEnumsExceptions.Main;


public class daysOfTheWeekMain {
    private static final Logger Logger = LogManager.getLogger(daysOfTheWeekMain.class);
    public static void main(String[] args) {
        daysOfTheWeek days = new daysOfTheWeek();
        String day = days.getDay(1);
        //System.out.println(day);
        Logger.info("The day is: "+day);

//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int number = Integer.parseInt(scanner.next());
//        String day = days.getDay(number);
//        Logger.info(day);
    }

}
