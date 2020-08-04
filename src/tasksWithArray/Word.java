package tasksWithArray;

import java.util.Arrays;

/**
 * JavaAdvanced
 * 03.08.20 20: 58
 */
public class Word {
    private int[] secureWord;
    private int sum;

    public Word(int[] secureWord, int sum) {
        this.secureWord = secureWord;
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Word{" +
                "secureWord=" + Arrays.toString(secureWord) +
                ", sum=" + sum +
                '}';
    }
}
