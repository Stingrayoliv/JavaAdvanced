package lesson08;

/**
 * JavaAdvanced
 * 10.07.20 20: 58
 */
public class Main2 {
    public static void main(String[] args) {
        Person p1 = new Person("Ivan", 20);
        Person p2 = new Person("Jack", 21);

        System.out.println(p1.stcompareTo(p2));
        //вариант 2
        System.out.println(PersonComparatorAge.compare(p2,p1));
    }


}
