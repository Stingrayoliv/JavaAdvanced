//package moduleSecond.lesson06102020.Anagram;


//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//
//import java.util.Arrays;
//import java.util.List;
//
//import static org.junit.Assert.assertEquals;
//
//class AnagramTest {
//    List<String> VOC = Arrays.asList("anna", "ivan", "naan", "vani", "piotr", "navi", "annna");
//    private Anagram anagram;
//    @BeforeAll
//    public void setUP(){
//        anagram = new Anagram(VOC);
//    }
//
//    @Test
//    public void testAnagram(){
//        String word = "anna";
//        List<String> actual = anagram.getAnagram(word);
//        List<String> expected = Arrays.asList("anna","naan");
//        assertEquals(expected, actual);//
//    }
//
//}