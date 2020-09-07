package lesson20200901TaskPalindrome;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JavaAdvanced
 * 01.09.20 21: 21
 */
class FunctionToStringTest {
    @Test
    public void apply_nullList_EmptyList() {
        FunctionToString function = new FunctionToString();
        List<String> str1 = new ArrayList<>();
        assertEquals(function.apply(null, new PredicatePalindrome()), str1);
    }

    @Test
    public void apply_palindromList() {
        List<String> listIn = new ArrayList<>();
        listIn.add("poiuyuiop");
        listIn.add("qwewq");
        listIn.add("bnbnbnb");
        listIn.add("nmnmnmnn");

        List<String> strOut = new ArrayList<>(); // список только из палиндромов
        listIn.add("poiuyuiop");
        listIn.add("qwewq");
        listIn.add("asdfdsa");
        listIn.add("oiuio");

        FunctionToString function = new FunctionToString();
        assertEquals(strOut, function.apply(listIn, new PredicatePalindrome()));
    }

    @Test
    public void apply_noPalindromList_emptyList() {
        List<String> str1 = new ArrayList<>();// список без палиндромов
        str1.add("bbnbnbsdp");
        str1.add("kjkjkjkj");

        List<String> strPal = new ArrayList<>(); // список только из палиндромов

        FunctionToString function = new FunctionToString();
        assertEquals(strPal, function.apply(str1, new PredicatePalindrome()));
    }

}