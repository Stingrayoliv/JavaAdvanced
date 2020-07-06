package lesson02;
import lesson02.entity.Employee;
import lesson02.entity.Programmer;

/**
 * JavaAdvanced
 * 03.07.20 11: 28
 */
public class EmployeeArray {
    private Employee[] employees;

    public EmployeeArray(Employee[] employees) {
        this.employees = employees;
    }

    public void payAll() {
        System.out.println("//----//----//----//----//----//----//");
        for (Employee employee : employees) {
            employee.pay();
        }
    }

    public void workAll() {
        for (Employee employee : employees) {
            employee.work();
        }
        System.out.println("//----//----//----//----//----//----//");
    }

    public void PrintAll() {
        PrintAll(this.employees);
    }

    public static void PrintAll(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("//----//----//----//----//----//----//");
    }

    //вариант CodeReviewAll() с кастованием
    public void CodeReviewAll() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
            System.out.print("  ");
            if (isProgrammer(employee)) {
                ((Programmer) employee).codeReview();
            }
        }
    }

    private boolean isProgrammer(Employee employee) {
        if (employee instanceof Programmer) { // является ли employee object класса Programmer
            return true;
        }
        return false;
    }
}
