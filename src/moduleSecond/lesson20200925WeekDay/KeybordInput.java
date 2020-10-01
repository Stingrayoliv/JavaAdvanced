package moduleSecond.lesson20200925WeekDay;

import java.util.Scanner;

/**
 * JavaAdvanced
 * 25.09.20 20 57
 */

public class KeybordInput implements NumberInput {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public int getNextNumber() {
        return scanner.nextInt();
    }
}
