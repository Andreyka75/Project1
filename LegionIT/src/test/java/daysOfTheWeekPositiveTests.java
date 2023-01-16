
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import Lesson8.*;


import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;


public class daysOfTheWeekPositiveTests {

    @BeforeAll
    public static void classSetup() {
        System.out.println("Positive tests");
    }

    @ParameterizedTest
    @MethodSource("numberToDay")
    public void dayOfWeek(int number, String expectedResult) {

        String actualResult = daysOfTheWeek.getDay(number);
        assertEquals(expectedResult, actualResult);

    }

    static Stream<Arguments> numberToDay() {
        return Stream.of(
                Arguments.of(1, "Sunday"),
                Arguments.of(2, "Monday"),
                Arguments.of(3, "Tuesday"),
                Arguments.of(4, "Wednesday"),
                Arguments.of(5, "Thursday"),
                Arguments.of(6, "Friday"),
                Arguments.of(7, "Saturday")

        );
    }
    @ParameterizedTest
    @CsvSource ({"1,Sunday","7,Saturday"})
    public void csvSourceTest(int a, String expectedResult){
        String actualResult = daysOfTheWeek.getDay(a);
        assertEquals(expectedResult,actualResult);
    }
}
