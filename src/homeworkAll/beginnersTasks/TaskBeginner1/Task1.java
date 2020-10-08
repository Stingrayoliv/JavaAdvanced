package homeworkAll.beginnersTasks.TaskBeginner1;

public class Task1 {
    //Дано целое число n, вернуть абсолютную разницу между n и 21, но вернутьудвоенную разницу, если n больше 21.
    // Например:
    //diff21(19) →2
    // diff21(10) →11
    // diff21(21) →0
    // diff21(25) → 8
    public static int diff21(int n) {
        return (n > 21) ? (n - 21) * 2 : Math.abs(n - 21);
    }
}
