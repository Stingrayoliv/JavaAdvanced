package homeworkAll.homeworkHotel;

import static homeworkAll.homeworkHotel.Date.*;
import static homeworkAll.homeworkHotel.DateInterval.*;

/**
 * JavaAdvanced
 * 31.07.20 19: 46
 */
public class Main {
    public static void main(String[] args) {
        Booking b1 = new Booking(
                new StandardRoom("1", 2),
                new Person("Jack"),
                new DateInterval(new Date(01, 01, 2017), new Date(10, 02, 2020))
        );
        Booking b2 = new Booking(
                new SuiteRoom("3", 2),
                new Person("Nick"),
                new DateInterval(new Date(11, 8, 2020), new Date(13, 8, 2020))
        );
        System.out.println(b1);
        System.out.println(b2);


        //System.out.println("number of days in year: "+numbersDaysInYear(2019)); // для тестов (всего дней в году)
        //System.out.println(checkYear(2019)); // для проверки года на leap year

        //возвращает количество дней сначала года до даты
        //System.out.println("number of days from New Year: " + findNumberOfDaysFromNewYear(01, 01, 2017));// для тестирования
        //System.out.println("number of days from New Year: " + findNumberOfDaysFromNewYear(10, 02, 2020));// для тестирования


    }

}
