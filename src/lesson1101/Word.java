package lesson1101;

/**
 * JavaAdvanced
 * 30.07.20 19: 33
 */
public class Word {
    private int sum;

    public Word(int sum) {
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public String toString() {
        return "Word{" +
                "sum=" + sum +
                '}';
    }
}
