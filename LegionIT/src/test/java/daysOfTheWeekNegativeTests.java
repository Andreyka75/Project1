import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import Lesson8.*;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class daysOfTheWeekNegativeTests {
    private static final Logger Logger = LogManager.getLogger(daysOfTheWeekNegativeTests.class);
    @BeforeAll
    public static void classSetup() {
        Logger.info("Negative tests");
    }
    @BeforeEach
    public void start() {
        Logger.info("Test start");
    }
    @AfterEach
    public void finish() {
        Logger.info("Test finished");
    }
    @ParameterizedTest
    @ValueSource(ints = {0,-10, -2, -27, -3435})
    public void negativeNumsTest(int a){
        String expectedResult = "The number should be equal or larger than 1";

        String actualResult = daysOfTheWeek.getDay(a);
        assertEquals(expectedResult,actualResult,"The number should be bigger than 0");
        Logger.info("expected result is: "+expectedResult);
        Logger.info("actual result is: "+actualResult);

    }
    @ParameterizedTest
    @MethodSource("dataProvider")
    public void WrongPositiveNumbers(int a,String expectedResult, String actualResult){

        assertEquals(expectedResult,actualResult,"The number should be between 0 to 8");
    }
    static Stream<Arguments> dataProvider(){
        return Stream.of(
                Arguments.of(8,"The number should be equal or smaller than 7",daysOfTheWeek.getDay(8)),
                Arguments.of(12,"The number should be equal or smaller than 7",daysOfTheWeek.getDay(12)),
                Arguments.of(34,"The number should be equal or smaller than 7",daysOfTheWeek.getDay(34)),
                Arguments.of(9,"The number should be equal or smaller than 7",daysOfTheWeek.getDay(9))

        );
    }

}
