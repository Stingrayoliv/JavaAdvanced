package moduleSecond.tasks.lesson3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class taskWithRecursionTest {
    @Test
    public void checkSubstringInString_return_True() {
        String text = "Hello";
        String str = "ell";
        assertTrue(taskWithRecursion.checkSubstringInString(text, str));
    }

    @Test
    public void checkSubstringInString_returnTrue() {
        String text = "Hello";
        String str = "eo";
        assertTrue(taskWithRecursion.checkSubstringInString(text, str));

    }

    @Test
    public void checkSubstringInString_StringText_equals_Substring_returnTrue() {
        String text = "Hello";
        String str = "Hello";
        assertTrue(taskWithRecursion.checkSubstringInString(text, str));

    }

    @Test
    public void checkSubstringInString_StringText_less_Substring_returnFalse() {
        String text = "Hel";
        String str = "Hello";
        assertFalse(taskWithRecursion.checkSubstringInString(text, str));

    }

    @Test
    public void checkSubstringInString_StringTextIsNull_less_Substring_returnFalse() {
        String text = " ";
        String str = "Hello";
        assertFalse(taskWithRecursion.checkSubstringInString(text, str));

    }

    @Test
    public void checkSubstringInString_StringText_SubstringIsNull_returnFalse() {
        String text = "Hello";
        String str = " ";
        assertFalse(taskWithRecursion.checkSubstringInString(text, str));
    }
}
