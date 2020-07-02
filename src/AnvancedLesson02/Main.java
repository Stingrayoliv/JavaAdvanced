package AnvancedLesson02;
/**
 * JavaAdvanced
 * 30.06.20 20: 07
 * перегрузка метода
 */
public class Main {
    public static void main(String[] args) {
        String[] bonusList = {"Jack", "Anna", "Nick"}; // люди, которые получат бонус

        Employee[] employees = DBMock.getEmployees();

        for (Employee employee : employees) {
            if (isBonus(bonusList, employee.getName())) {
                employee.pay(550);
            } else {
                employee.pay();
            }
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
}

