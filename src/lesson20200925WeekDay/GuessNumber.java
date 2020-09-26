package lesson20200925WeekDay;
import java.util.Scanner;

/**
 * JavaAdvanced
 * 25.09.20 20 13
 */
// Угадай число игра

public class GuessNumber {
    static int secretNumber = 2;
    static int attempts = 3;
    static Scanner scanner = new Scanner(System.in);

    private NumberInput numberInput;
    public GuessNumber(NumberInput numberInput){ // это конструктор
        //inversion of control - это pattern
        this.numberInput=numberInput;
    }

    public void game() {
        System.out.println("Try to guess a secret number: ");
        int number = numberInput.getNextNumber();
        boolean correctGuess = false;
        while (attempts > 1 && !correctGuess) {
            if (secretNumber == number) {
                correctGuess = true;
            } else {
                System.out.println("Wrong number, try again!");
                number = numberInput.getNextNumber();
            }
            attempts--;
        }
        if (correctGuess) {
            System.out.println("Congratulation, you won!");
        } else {
            System.out.println("You failed!");
        }
    }

    public static void main(String[] args) {
//       NumberInput input = new KeybordInput();
//       GuessNumber number = new GuessNumber(input);
//       number.game();
       NumberInput mockedInput = new InputMock();
       GuessNumber testGame = new GuessNumber(mockedInput);
       testGame.game();
    }
}
