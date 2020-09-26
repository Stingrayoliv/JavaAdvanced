package lesson20200925WeekDay;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JavaAdvanced
 * 25.09.20 19 30
 */


class DemoTest {
    @Test
    public void testWeekDayWorkingNotVacation(){
        boolean weekday = true;
        boolean vacation = false;

        boolean expected = Demo.sleepIn(weekday, vacation);
        assertFalse(expected);

    }
    @Test
    public void testWeekDayWeekendVacation(){
        boolean weekday = false;
        boolean vacation = true;
        boolean expected = Demo.sleepIn(weekday, vacation);
        assertTrue(expected);
    }

    @Test
    public void testWeekDayWorkingVacation(){
        boolean weekday = true;
        boolean vacation = true;
        boolean expected = Demo.sleepIn(weekday, vacation);
        assertTrue(expected);
    }

    @Test
    public void testWeekDayWeekendNotVacation(){
        boolean weekday = false;
        boolean vacation = false;
        boolean expected = Demo.sleepIn(weekday, vacation);
        assertTrue(expected);
    }

}