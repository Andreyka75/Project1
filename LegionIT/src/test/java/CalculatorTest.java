import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import staticClassesEnumsExceptions.calculator;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {
    @BeforeAll
    public static void classSetup(){
        System.out.println("Before all method");
    }
    @AfterAll
    public static void classTearDown(){
        System.out.println("After all method");
    }
    @BeforeEach
    public void beforeTest(){
        System.out.println("Before each method");
    }
    @AfterEach
    public void afterTest(){
        System.out.println("After each method");
    }
    @Test
    public void summaryTest(){
        double a=5;
        double b=9;
        double expectedResult=11;
        double actualResult= calculator.calc(a,b, calculator.Type.SUMMARY);

        assertEquals(expectedResult,actualResult,"summary result is incorrect");


    }
    @Test
    public void divisionTest(){
        double a=10;
        double b=2;
        double expectedResult=5;
        double actualResult= calculator.calc(a,b, calculator.Type.DIVISION);

        assertNotNull(actualResult,"null was returned");
        //assertNull(actualResult);
        assertTrue(expectedResult==actualResult);
        assertTrue(actualResult>0);
        assertFalse(actualResult==0);
        assertEquals(expectedResult,actualResult,"division result is incorrect");
    }
    @Test
    @DisplayName("Nullpointer Exception test")
    public void errorTest(){
        double a=10;
        double b=2;
        double expectedResult=5;
        assertThrows(NullPointerException.class, ()-> {calculator.calc(a,b, null);});

    }
    @ParameterizedTest
    @ValueSource(ints = {-10, 0, 27, 3435, -5768483})
    public void summaryParamsTest(int a){
        double b = 10;
        double expectedResult = b + a;

        double actualResult = calculator.calc(a,b, calculator.Type.SUMMARY);
        assertEquals(expectedResult,actualResult,"summary result is incorrect");

    }

    @ParameterizedTest
    @EnumSource(calculator.Type.class)
    public void calculationTypesTest(calculator.Type type){
        double a=25;
        double b=6;

        double actualResult = calculator.calc(a,b, type);
        assertNotNull(actualResult);
        assertTrue(actualResult>0);
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void MethodSourceTest(double a,double b, double expectedResult, calculator.Type type){
        double actualResult = calculator.calc(a,b,type);
        assertEquals(expectedResult,actualResult);
    }
    static Stream<Arguments> dataProvider(){
        return Stream.of(
                Arguments.of(2,2,4,calculator.Type.SUMMARY),
                Arguments.of(4,2,2,calculator.Type.DIVISION),
                Arguments.of(2,2,4,calculator.Type.MULTIPLICATION),
                Arguments.of(5,3,2,calculator.Type.SUBTRUCTION)

        );
    }
    @ParameterizedTest
    @CsvSource ({"2,2,4,SUMMARY","4,2,2,DIVISION"})
    public void csvSourceTest(double a,double b, double expectedResult, calculator.Type type){
        double actualResult = calculator.calc(a,b,type);
        assertEquals(expectedResult,actualResult);
    }




}
