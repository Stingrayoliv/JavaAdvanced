package moduleSecond.tasks;

/**
 * text - the string to reverse
 */

public class Solution {
    public String reverse(String text) {
        StringBuilder builder=new StringBuilder(text);
        builder.reverse();
        return builder.toString();
    }
}
