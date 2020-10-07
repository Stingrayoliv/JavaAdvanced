package moduleSecond.lesson20200925WeekDay;

import java.sql.SQLOutput;

/**
 * JavaAdvanced
 * 01.10.20 19 55
 */


public class ConsoleOutput implements GameOutput{
    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
