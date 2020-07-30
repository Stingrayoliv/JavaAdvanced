package lesson10;
import java.util.Arrays;

/**
 * JavaAdvanced
 * 28.07.20 19: 08
 */
public class Main {
    public static void main(String[] args) {
        String[] data = {"Ivanov Ivan Ivanovich", "Nikolaev Nikolay", "Petrova"};
        System.out.println(Arrays.toString(showDataPerson(data)));
    }

    public static Person[] showDataPerson(String[] array) {
        Person[] persons = null;

        if (array != null) {
            persons = new Person[array.length];
            for (int i = 0; i < array.length; i++) {
                String[] names = array[i].split(" ");
                switch (names.length) {
                    case 1:
                        persons[i] = new Person(names[0]);
                        break;
                    case 2:
                        persons[i] = new Person(names[0], names[1]);
                        break;
                    case 3:
                        persons[i] = new Person(names[0], names[1], names[2]);
                }
            }
        }
        return persons;
    }


}

