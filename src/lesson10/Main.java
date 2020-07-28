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
        Person[] persons = new Person[array.length];
        for (int i = 0; i < array.length - 2; i++) {
            String[] rez = array[i].split(" ");
            persons[i] = new Person(rez[0], rez[1], rez[2]);
            persons[i + 1] = new Person(rez[0], rez[1]);
            persons[i + 2] = new Person(rez[0]);
        }

        return persons;
    }
}
