package homeworkAll.lambdaExpressions;

import moduleSecond.lesson08102020Lamda.Demo;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * JavaAdvanced
 * 10.10.20 13 38
 */
public class tasksReferences {
    public static void main(String[] args) {
        //1.Print a given string
        Consumer<String> consumer = System.out::print;
        System.out.print("Task1: ");
        consumer.accept("jhjhjh");

        //2. Given a string, return a lower case string
        Function<String, String> f2 = String::toLowerCase;
        System.out.println("\nTask2: " + f2.apply("EEEEhEEE"));

        //3 Given a number, return a square root from the number
        Function<Integer, Double> f3 = Math::sqrt;
        System.out.printf("%.2f", f3.apply(24));

        //4 Implement solution 7 from above as a method reference (Given a string, return a string, which consists of
        // a first half of its character, if length is even, returns an empty string otherwise: "abcde" -> "ab", "abcde" -> "".
        Function<String, String> f4 = tasksReferences::getNewString;
        System.out.println("\nTask4: " + f4.apply("absd"));

        //5 Given a class Employee with name and salary. Return an employee salary using 1. Supplier, 2. Function
        Employee employee1 = new Employee("Lora", 5600.50);
        Supplier<Double> supplier1 = employee1::getSalary;
        System.out.println("Task 5 (Supplier): " + supplier1.get());
        Function<Employee, Double> f5 = Employee::getSalary;
        System.out.println("Task 5 (Function): " + f5.apply(employee1));
    }

    public static String getNewString(String s) {
        return (s.length() % 2 == 0) ? s.substring(0, s.length() / 2) : "";
    }
}
