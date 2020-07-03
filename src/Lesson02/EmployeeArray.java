package Lesson02;

/**
 * JavaAdvanced
 * 03.07.20 11: 28
 */
public class EmployeeArray {
    private Employee[] employees;

    public EmployeeArray(Employee[] employees) {
        this.employees = employees;
    }

    public static void PrintAll(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("//----//----//----//----//----//----//");
    }

    public static void workAll(Employee[] employees) {
        for (Employee employee : employees) {
            employee.work();
        }
        System.out.println("//----//----//----//----//----//----//");
    }

    public static void payAll(Employee[] employees) {
        for (Employee employee : employees) {
            employee.pay();
        }
        System.out.println("//----//----//----//----//----//----//");
    }

    public static void CodeReviewAll(Employee[] employees) {
        Programmer[] programmers = DBMock.getProgrammers(employees);
        for (Programmer programmer : programmers) {
            System.out.println(programmer.getName());
            System.out.print("  ");
            programmer.codeReview();
        }
    }
}
