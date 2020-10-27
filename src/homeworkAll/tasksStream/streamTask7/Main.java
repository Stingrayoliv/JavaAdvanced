package homeworkAll.tasksStream.streamTask7;

public class Main {
    public static void main(String[] args) {
        //7. Написать функцию, которая проверяет, является ли заданная строка целым числом.
        // Подсказка - Character.isDigit() и Stream.allMatch().
        String a = "c";
        String b = "5";
        //  method String.chars() returns a stream of ints (IntStream)
        boolean res1 = a.chars().allMatch(Character::isDigit);
        boolean res2 = b.chars().allMatch(Character::isDigit);
        System.out.println();
        System.out.println("Task 7: " + res1);
        System.out.println("Task 7: " + res2);
    }
}
