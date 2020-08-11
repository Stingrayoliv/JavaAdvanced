package calculator;

/**
 * JavaAdvanced
 * 11.08.20 13: 56
 */
public class Сalculator {
    private int number1;
    private int number2;

    public Сalculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public static int add(int a1, int a2) {
        return a1 + a2;
    }

    private int add() {
        return add(this.number1, this.number2);
    }

    public static int divide(int number1, int number2) {
        if (number2 == 0) {
            System.out.println("The number cannot be divided by 0");
        }
        return number1 / number2;
    }

    private int divide() {
        return divide(this.number1, this.number2);
    }


}
