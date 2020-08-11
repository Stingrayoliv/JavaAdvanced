package lesson15;
import java.util.Arrays;
import java.util.Comparator;
/**
 * JavaAdvanced
 * 05.08.20 19: 29
 */
public class Main {
    public static void main(String[] args) {
        String[] names = {"Jack", "Nick", "John", "Anna"}; // строки сравниваем через compareTo +сортировка
//        System.out.println("Jack".compareTo("John"));
//        System.out.println(names[0].compareTo(names[0]));
//        Arrays.sort(names);
//        System.out.println(Arrays.toString(names));

        Person[] people = {new Person("Jack", 67),
                new Person("Nick 12", 25),
                new Person("John 123", 80),
                new Person("Anna 1456", 18),
                new Person("Nick 1", 18),
                new Person("Anna 100", 23),
        };
        //System.out.println(people[0].compareTo(people[1]));

//        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
        System.out.println("--------------");

        //Comparator // эмулятор поведения пользователя (кнопка 1, или 2)
        Comparator<Person> typeOfSorting;
        int key = 3;
        switch (key) {
            case 1://sort by age
                System.out.println("sort by age: ");
                typeOfSorting = new PersonComparatorByAge();
                Arrays.sort(people, typeOfSorting);
                break;
            case 2://sort be name
                System.out.println("sort by name: ");
                typeOfSorting = new PersonComparatorByAge();
                Arrays.sort(people, typeOfSorting);
                break;
            case 3://sort by name length
                System.out.println("sort by name length: ");// по длине фамилии
                typeOfSorting = new PersonComparatorByNameLength();
                Arrays.sort(people, typeOfSorting);
                break;
            case 4:
                Arrays.sort(people, ((o1, o2) -> o1.getAge() - o2.getAge()));//синтаксичесий сахар, сокращающий метод compare
                break;
            default:
                System.out.println("sort by default: ");
                Arrays.sort(people);

        }
//        System.out.println("sort by age: ");
//        Arrays.sort(people, new PersonComparatorByAge());
//        System.out.println(Arrays.toString(people));
//        System.out.println("--------------");
//        System.out.println("sort by name: ");
//        Arrays.sort(people, new PersonComparatorByName());
        System.out.println(Arrays.toString(people));
    }
}
