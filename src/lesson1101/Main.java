package lesson1101;

import java.util.Arrays;

/**
 * JavaAdvanced
 * 30.07.20 19: 31
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, -1,-2, 2, 1, 4, 1, 2, 1, -7, 1, -1, -7};
        //System.out.println(wordCounter(array));
        Word[] words = getWords(array);
        System.out.println(Arrays.toString(words));
    }

    public static Word[] getWords(int[] array) {
        Word[] wortsArray = new Word[wordCounter(array)];
        int wordSum = 0;
        int j = 0; // количество элеметов массива wortsArray
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                if (wordSum > 0) {
                    wortsArray[j] = new Word(wordSum);
                    wordSum = 0;
                    j++;
                }
            } else {
                wordSum += array[i];
            }
        }
        if (wordSum > 0) {
            wortsArray[j] = new Word(wordSum);
        }

        return wortsArray;
    }

    public static int wordCounter(int[] array) {
        int wortCounter = 0;
        int wordLength = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                if (wordLength > 0) {
                    if (wordLength > 0)
                        wortCounter++;
                    wordLength = 0; // обнулить
                }
            } else {
                wordLength++; // длина без разрыва отрицательного
            }
        }
        if (wordLength > 0) {
            wortCounter++;
        }
        return wortCounter;
    }
}
