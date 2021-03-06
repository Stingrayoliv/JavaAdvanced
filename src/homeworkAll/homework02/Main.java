package homeworkAll.homework02;

/**
 * JavaAdvanced
 * 01.07.20 18: 08
 */
public class Main {
    public static void main(String[] args) {
        CProgrammer p1 = new CProgrammer("Roman", "Rodmanod", 676, 3000, false);
        JavaProgrammer p2 = new JavaProgrammer("Juli", "Oscar", 556, 3000.0,
                false);
        JavaScriptProgrammer p3 = new JavaScriptProgrammer("Anna", "Loran", 678, 5567.0,
                false);
        Manager manager1 = new Manager("Sofie", "Norman", 1234, 987.0, true,
                100);

        Employee[] workers = new Employee[]{
                p1,
                p2,
                p3,
                manager1,
                new Manager("Andrey", "Rod", 453, 4537.0, true, 100)
        };


        System.out.println("//----//----//----//----//----//----//----//----//");
        for (Employee employee : workers) {
            if (employee.getBonusStatus() == true) {
                employee.pay(100);
            } else {
                employee.pay();
            }
        }

        System.out.println("//----//----//----//----//----//----//----//----//");
        for (Employee employee : workers) {
            employee.work();
        }
    }
}
