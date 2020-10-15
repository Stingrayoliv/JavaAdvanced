package homeworkAll.wordTransformer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JavaAdvanced
 * 15.10.20
 */

class TransformerWordTest {
    @Test
    public void transform_wordsLength3_wordsWithUpperCase(){
        assertEquals("ABC defG IKL", TransformerWord.transform("abc defG ikl"));
    }
    @Test
    public void transform_StringIsEmpty_StringIsEmpty(){
        assertEquals("", TransformerWord.transform(""));
    }

    @Test
    public void transform_StringIsNull_StringIsEmpty(){
        assertEquals("", TransformerWord.transform1(null));
    }

    @Test
    public void transform1_wordsLength3_wordsWithUpperCase(){
        assertEquals("ooooi defG ikl", TransformerWord.transform1("OOOOI defG ikl"));
    }
    @Test
    public void transform1_StringIsEmpty_StringIsEmpty(){
        assertEquals("", TransformerWord.transform1(""));
    }

    @Test
    public void transform1_StringIsNull_StringIsEmpty(){
        assertEquals("", TransformerWord.transform1(null));
    }

    @Test
    public void transform2_wordsLength3_wordsWithUpperCase(){
        assertEquals("OO00IO DEFG IKL0", TransformerWord.transform2("OO00IO defG ikl0"));
    }
    @Test
    public void transform2_StringIsEmpty_StringIsEmpty(){
        assertEquals("", TransformerWord.transform2(""));
    }

    @Test
    public void transform2_StringIsNull_StringIsEmpty(){
        assertEquals("", TransformerWord.transform2(null));
    }

    @Test
    public void transform3_wordsLength3_wordsWithUpperCase(){
        assertEquals("Ojhjhj oooo Oklk", TransformerWord.transform3("Ojhjhj OOOO Oklk"));
    }
    @Test
    public void transform3_StringIsEmpty_StringIsEmpty(){
        assertEquals("", TransformerWord.transform3(""));
    }

    @Test
    public void transform3_StringIsNull_StringIsEmpty(){
        assertEquals("", TransformerWord.transform3(null));
    }
}
