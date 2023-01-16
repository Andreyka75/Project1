package Lesson8;

import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class daysOfTheWeek {
    private static final Logger Logger = LogManager.getLogger(daysOfTheWeek.class);

    public static String getDay(Integer dayNumber) {
        ArrayList<String> daysList = new ArrayList<>();
        daysList.add("Sunday");
        daysList.add("Monday");
        daysList.add("Tuesday");
        daysList.add("Wednesday");
        daysList.add("Thursday");
        daysList.add("Friday");
        daysList.add("Saturday");

        Logger.info("Trying to find the correct day");

        if (dayNumber == null) {
            Logger.info("The NULL value excepted");
            throw new NullPointerException();

        }
        else if (dayNumber < 1) {
            return "The number should be equal or larger than 1";
        } else if (dayNumber > 7) {
            return "The number should be equal or smaller than 7";
        } else {
            return daysList.get(dayNumber - 1);
        }
    }

}
