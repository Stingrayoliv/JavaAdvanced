package lesson20200915TaskBraces;

import java.util.Stack;
import java.util.function.Predicate;

// задача про скобки
//Given a String with different braces, check if the order of braces is correct. Every next brace can be an opening
// brace or should close a previous opening brace.

public class BracketsChecker implements Predicate<String> {
    private char[][] brackets = {
            {'(', ')'},
            {'[', ']'},
            {'{', '}'},
    };

    @Override
    public boolean test(String s) { // проверка, чтобы были все скобки закрывались
        if (s == null) return false;
        Stack<Character> stack = new Stack<>();
        for (char ch : s.trim().toCharArray()) { //тут trim() убирает пробелы по бокам строки
            if (isOpenBracket(ch)) { // тут отдельный метод на открывающиеся скобки; например:  if(ch == '[' || ch == '(' || ch == '{' )
                stack.push(ch);
            } else {
                char oppositeChar = getOpenBracket(ch); // это метод вернет или закрывающуеся скобку, или пробел
                // a в getCloseBracket(ch) передаем закрывающиеся скобку } -> {  )-> ( ] -> [ ->' '
                if ((oppositeChar != ' ') &&
                        ((stack.size() == 0) || (!stack.pop().equals(oppositeChar)))) { // и должно еще одно из этих условий выполниться
                    return false;
                }

            }
        }
        return (stack.size() == 0); // на конец stack должен быть нулевым
    }

    private char getOpenBracket(char ch) {
        for (char[] bracket : brackets) {
            if (ch == bracket[1]) {
                return bracket[0];
            }
        }
        return ' ';
    }


    private boolean isOpenBracket(char ch) {
        for (char[] bracket : brackets) {
            if (ch == bracket[0]) {
                return true;
            }
        }
        return false;
    }
}

