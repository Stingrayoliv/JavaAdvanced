package homeworkAll.beginnersTasks.TaskBeginner10;

public class Task10 {
    // Дана строка четной длины. Вернуть строку из двух центральных символов, напримерстрока "string" превратиться
    // в "ri". Длина входной строки минимум 2.middleTwo("string") → "ri"middleTwo("code") → "od"middleTwo("Practice") → "ct"
    public static String middleTwo(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
    }
}
