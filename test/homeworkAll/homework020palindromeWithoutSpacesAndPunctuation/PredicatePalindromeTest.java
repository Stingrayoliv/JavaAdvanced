package homeworkAll.homework020palindromeWithoutSpacesAndPunctuation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PredicatePalindromeTest {
    @Test
    public void apply_nullList_emptyList() {
        FunctionToString function = new FunctionToString();
        List<String> expectedList = new ArrayList<>();
        assertEquals(new ArrayList<>(),
                new FunctionToString().apply(null,new PredicatePalindrome()));
    }

    @Test
    public void apply_stringListWithPalindrome_palindromeList(){
        List<String> listIn = Arrays.asList(
                "qwertytrewq","qaasasq","12344321", "edfrtg"
        );

        List<String> expectedList = Arrays.asList(
                "qwertytrewq","12344321"
        );
        FunctionToString function = new FunctionToString();
        assertEquals(expectedList,function.apply(listIn, new PredicatePalindrome()));
    }

    @Test
    public void apply_noPalindromeList_emptyList(){
        List<String> listIn = Arrays.asList(
                "qqwertytrewq","qaasasq","123q44321", "edfrtg"
        );
        List<String> expectedList = new ArrayList<>();
        FunctionToString function = new FunctionToString();
        assertEquals(expectedList,function.apply(listIn, new PredicatePalindrome()));
    }
}