package Lesson02;

/**
 * JavaAdvanced
 * 03.07.20 11: 28
 */
public class EmployeeArray {
    private Employee[] employees = {
            new CPrgrammer("Jack0", 2000.0),
            new JavaProgrammer("Jack6", 4000.0),
            new Tester("Anna", 3000.0),
            new Tester("Alex", 1800.0),
            new CPrgrammer("Jack1", 2010.0),
            new CPrgrammer("Jack2", 2020.0),
            new JavaProgrammer("Jack3", 2030.0),
            new JavaProgrammer("Jack4", 2040.0),
            new JavaProgrammer("Jack5", 2050.0),
            new Manager("Misha", 2050.0, 3000.0),
            new Manager("Maria", 2050.0, 4000.0),
    };


        public static void PrintAll(Employee[]employees) {
            for (Employee employee : employees) {
                System.out.println(employee);
                System.out.println("//----//----//----//----//----//----//");
            }
        }

        public static void workAll (Employee[]employees) {
            for (Employee employee : employees) {
                employee.work();
            }
        }

}

