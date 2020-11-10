package moduleSecond.lessonDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Set;

public class DateTasks {
    public static void main(String[] args) {
        //LocalDate, LocalTime, LocalDateTime - классы нового API

        //January 1 st, 2020 -> LocalDate

        LocalDate date = LocalDate.now();
        System.out.println(date);
        //дата 5 недель назад
        LocalDate dateFiveWeeksAgo = date.minusWeeks(5);

        //один еще из способов отнять дни
        LocalDate minus = date.minus(5, ChronoUnit.DAYS);
        System.out.println(minus.isBefore(LocalDate.now()));

        //DateTimeFormatter (все шаблоны вывода есть в документации)
        // 1. задача рапарсить строчку "22-10-22"
        LocalDate parse = LocalDate.parse("22-10-2020", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println(parse);
        // 2. из объекта с помощью форматора получить строку
        String dateString = parse.format(DateTimeFormatter.ofPattern("MMMM dd, yyyy", Locale.GERMAN));
        System.out.println(dateString);

        // метод between (разница во времени)
        long between = ChronoUnit.DAYS.between(minus, LocalDate.now());
        System.out.println(between);
        //
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for (String zoneId: availableZoneIds) {
            System.out.println(zoneId);
        }
        LocalDateTime turkey = LocalDateTime.now(ZoneId.of("Europe/Moscow"));
        System.out.println(turkey);
    }
}
