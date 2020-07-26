package lesson08;

/**
 * JavaAdvanced
 * 10.07.20 20: 32
 * Задача Факториал
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println("factorial 3: "+findFactorial(3));
        //5! = 1*2*3*4*5;
    }

    private static int findFactorial(int number) {
        if (number > 1) {
            return number*findFactorial(number-1);
        } else {
            return 1;
        }
    }
}
