package calculator;

import org.junit.Assert;
import org.junit.Test;

import static calculator.Сalculator.*;

/**
 * JavaAdvanced
 * 11.08.20 14: 24
 */
public class CalculatorTest {
    @Test
    public void isAddFalseTest1() {
        int number1 = 4;
        int number2 = Сalculator.add(1, 2);
        Assert.assertEquals("error in add", number1, number2);
    }

    @Test
    public void isAddTrueTest1() {
        int number1 = 4;
        int number2 = Сalculator.add(0, 4);
        System.out.println(number2);
        Assert.assertEquals("true in add", number1, number2);
    }

    @Test
    public void isDivideTrueTest1() {
        int number1 = 2;
        int number2 = Сalculator.divide(4, 2);
        Assert.assertEquals("true in divide", number1, number2);
    }

    @Test
    public void isDivideFalseTest1() {
        int number1 = 4;
        int number2 = Сalculator.divide(0, 2);
        Assert.assertEquals("error in divide", number1, number2);
    }
}
