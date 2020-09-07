package lesson08;

/**
 * JavaAdvanced
 * 10.07.20 20: 58
 */
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "lesson20200832TaskListPersonAndEmail.Main.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //variant 1
    int stcompareTo(Person p) { //int потому что может быть 3 варианта: 0 равны, если возрасты не равны(this.getAge()): положительное;
        //p.getAge() - отрицательное
        return this.getAge() - p.getAge();
    }

    // variant 2 (не привязан к классу, можно реализовать в любом классе)
    static int compare(Person p1, Person p2) {
        return p1.getAge() - p2.getAge();
    }
}
