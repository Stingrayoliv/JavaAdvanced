package tasksWithArray;

import java.util.Arrays;

/**
 * JavaAdvanced
 * 03.08.20 21: 05
 */
public class Parser {
    private Word[] words;

    public Parser(int[] array) {
        this.words = parseIntArray(array);

    }

    private Word[] parseIntArray(int[] array) {
        if (array != null) {
            Word[] tempWord = new Word[countWordInArray(array)];
            int curArrayIndex = array.length - 1; // длина слова (количество элементов в слове)
            int curTempWordsIndex = tempWord.length - 1;

            while (curTempWordsIndex >= 0) {
                boolean isCorrect = true;
                int expectedLen = array[curArrayIndex--];// означает curArrayIndex--, что берем элемент с таким индексом
                // и потом уменьшаем
                int[] securedWord = new int[expectedLen];
                int expectedSum = array[curArrayIndex--]; //берешь индекс и уменьшаешь
                if (array[curArrayIndex--] > 0) {
                    isCorrect = false;
                    return null;
                }
                int realSum = 0;
                for (int i = expectedLen - 1; i >= 0; i--) {
                    securedWord[i] = array[curArrayIndex--];
                    realSum += securedWord[i];
                }
                if (realSum != expectedSum) {
                    isCorrect = false;
                }
                if (isCorrect) {
                    tempWord[curTempWordsIndex--] = new Word(securedWord, realSum);
                } else {
                    tempWord[curArrayIndex--] = null;
                    System.out.println("error in array");
                }
            }
            return tempWord;

        }
        return null;
    }

    private int countWordInArray(int[] array) { // считаем отрицательные числа, чтобы понять кол-во слов и размер массива
        // Word[]
        int res = 0;
        for (int i : array) {
            if (i < 0) {
                res++;
            }
        }
        return res;
    }

    @Override
    public String toString() {
        if (words != null)
            return Arrays.toString(words);
        else {
            return ("error in array");
        }
    }
}
