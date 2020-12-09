package moduleSecond.tasks.lesson3;

public class taskWithRecursion {
    public static void main(String[] args) {
        String text = "Hello";
        String str = "ell";
        String str2 = "kjh";
        System.out.println(checkSubstringInString(text, str));
        System.out.println(checkSubstringInString(text, str2));
    }


    public static boolean checkSubstringInString(String text, String str) {
        if (str.length() == 0) {
            return true;
        }
        if (text.length() < str.length()) {
            return false;
        }
        if (text.charAt(text.length() - 1) == str.charAt(str.length() - 1)) {
            return checkSubstringInString(text.substring(0, text.length() - 1), str.substring(0, str.length() - 1));
        } else {
            return checkSubstringInString(text.substring(0, text.length() - 1), str);
        }
    }
}
