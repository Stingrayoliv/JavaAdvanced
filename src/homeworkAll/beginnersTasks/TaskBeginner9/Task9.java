package homeworkAll.beginnersTasks.TaskBeginner9;

public class Task9 {
    //Даны две строки, вернуть их конкатенацию, но без первого символа в каждой. Строкиненулевой длины.
    public static String nonStart(String a, String b){
        return a.substring(1)+b.substring(1);
    }
}
