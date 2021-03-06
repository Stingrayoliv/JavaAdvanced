package homeworkAll.homework05.parseArray;

/**
 * JavaAdvanced
 * 07.07.20 13: 38
 */
public class Main {
    public static void main(String[] args) {
        int[] temperature = {15, 25, 7, 2, 12, 27, 5, -3, 7, 23, 8, -5, 11, 28, 14, 1};

//        Year[] years = new Year[temperature.length / 4]; // array objects
//        int index = 0; // index for array objects
//        do {
//            for (int i = 0; i <= temperature.length - 1; i += 4) {
//                years[index] = new Year(temperature[i], temperature[i + 1], temperature[i + 2], temperature[i + 3]);
//                index++;
//            }
//        } while (index > temperature.length / 4);

// variant 2 (без do ...while - он тут лишний / [temperature.length / 4] гарантирует условие выхода)
        Year[] years = new Year[temperature.length / 4]; // array objects
        int index = 0; // index for array objects
        for (int i = 0; i < temperature.length - 3; i += 4) { // -3
            years[index] = new Year(temperature[i], temperature[i + 1], temperature[i + 2], temperature[i + 3]);
            index++;
        }

        for (Year year : years) {
            System.out.println(year.toString());
        }
    }
}

