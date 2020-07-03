package Lesson02;

/**
 * JavaAdvanced
 * 30.06.20 20: 07
 * перегрузка метода
 */
public class Main {
    public static void main(String[] args) {
        //  способы записи
        Programmer prog = new Programmer("Uww", 1000.0);
        prog = new Programmer("wer", 1000);
        Employee emp2 = new Programmer("wer", 1000);


        String[] bonusList = {"Jack", "Anna", "Nick"}; // люди, которые получат бонус

        Employee[] employees = DBMock.getEmployees();
        Programmer[] programmers = DBMock.getProgrammers();

        for (Employee employee : employees) {
            payForEmployee(employee);
//            if (isBonus(bonusList, employee.getName())) {
//                employee.pay(550);
//            } else {
//                employee.pay();
//            }
        }

        System.out.println("-------------------------");
        for (Programmer programmer : programmers) {
            System.out.println(programmer.getName());
            System.out.print("  ");
            programmer.codeReview();

        }

        for (Employee employee : employees) {
            employee.work();
        }
    }

    public static boolean isBonus(String[] bonusList, String name) {
        for (String str : bonusList) {
            if (str.equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static void payForEmployee(Employee employee) {
        employee.pay();

    }
}

