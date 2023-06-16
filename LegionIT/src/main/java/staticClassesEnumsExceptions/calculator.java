package staticClassesEnumsExceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class calculator {

//    public static final int MULTIPLICATION = 1;
//    public static final int SUMMARY = 2;
//    public static final int DIVISION = 3;
//    public static final int SUBTRUCTION = 4;

    private static final Logger Logger = LogManager.getLogger(calculator.class);

    public enum Type {
        MULTIPLICATION,
        SUMMARY,
        DIVISION,
        SUBTRUCTION
    }

    public static double calc(double a, double b, Type type) {
//        if (type == MULTIPLICATION){
//            return a * b;
//        }
//        return 0;
        Logger.info("Running method calculate");
        double result = 0;
        try {
            switch (type) {

                case MULTIPLICATION:
                    result = a * b;
                    break;

                case SUMMARY:
                    result = a + b;
                    break;

                case DIVISION:
                    result = a / b;
                    break;

                case SUBTRUCTION:
                    result = a - b;
                    break;

                default:
                    result = -1;
            }
        } catch (Exception err) {
            //System.out.println("Something bad happened");
            Logger.error("Something bad happened",err);
            throw err;
        }

//        finally {
//            System.out.println("Finally block");
//        }
        return result;

    }


}

