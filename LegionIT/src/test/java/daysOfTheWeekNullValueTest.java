import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import Lesson8.*;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class daysOfTheWeekNullValueTest {
    @Test
    @DisplayName("Null pointer Exception test")
    public void errorTest(){

        assertThrows(NullPointerException.class, ()-> {
            daysOfTheWeek.getDay(null);});

    }
}
