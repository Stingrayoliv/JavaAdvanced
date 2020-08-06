package lesson15;

/**
 * JavaAdvanced
 * 05.08.20 19: 55
 */
public class Person implements Comparable<Person> {//для сортировки добавляем implements Comparable<Person> +метод compareTo
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
// метод сравнения двух строк по имени
//    public int compareTo(Person person){
//        return this.name.compareTo(person.name);
//    }

    //    public int compareTo(Person person) {// вариант сравнения по возрасту (по инту)
//        if (this.age > person.age) {
//            return 1;
//        }
//        if (this.age < person.age) {
//            return -1;
//        } else {
//            return 0;
//        }
//    }
//    public int compareTo(Person person) {//второй вариант сравнения по возрасту (по инту)
//        return this.age - person.age;
//    }

    public int compareTo(Person person) {// если имена совпадают, то сортируем по возрасту. если не совпали - то по имени
        int nameComparing = this.name.compareTo(person.name);
        return  (nameComparing==0)?this.age-person.age:nameComparing;
    }
//    public int compareTo(Person person) {// // если имена совпадают, то сортируем по возрасту. если не совпали - то по имени
    // вариант более длинной записи
//        if (this.name.compareTo(person.name)==0) {
//            return this.age - person.age;
//        } else {
//            return this.name.compareTo(person.name);
//        }
//    }



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
