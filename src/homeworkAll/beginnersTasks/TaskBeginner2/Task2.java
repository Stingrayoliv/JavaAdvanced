package homeworkAll.beginnersTasks.TaskBeginner2;

public class Task2 {
    //Дана строки, вернуть новую строку, где последние 3 символа в верхнем регистре(заглавные).
    // Если строка длины меньше 3, перевести это в заглавные.
    //endUp("Hello") → "HeLLO"endUp("hi there") → "hi thERE"endUp("hi") → "HI"

    public static String endUp(String str) {
        return (str.length() < 3) ? str.toUpperCase() : str.substring(0, str.length() - 3) +
                str.substring(str.length() - 3, str.length()).toUpperCase();
    }
}
