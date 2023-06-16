package staticClassesEnumsExceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Type;

public class Main {
    private static final Logger Logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

//        double result = calculator.calc(5, 2, calculator.Type.SUMMARY);
//        System.out.println("result is: " + result);
        double result = calculator.calc(2,3, null);
        Logger.info("result "+result);


//        try {
//            result = calculator.calc(3, 12, null);
//            System.out.println("result is: " + result);
//        }
//        catch (Exception err){
//            System.out.println("Something bad happened");
//        }

        result = calculator.calc(2, 45, calculator.Type.SUBTRUCTION);
        //System.out.println("result is: " + result);
        Logger.info("result "+result);

        result = calculator.calc(8, 7, calculator.Type.DIVISION);
        //System.out.println("result is: " + result);
        Logger.info("result "+result);

    }
}
