//package moduleSecond.lesson20200925WeekDay;
//
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.when;
//
//
//import static org.junit.jupiter.api.Assertions.*;
//
///**
// * JavaAdvanced
// * 01.10.20 19 32
// */
//
//
//class GameTest {
//    KeybordInput input = Mockito.mock(KeybordInput.class);
//    ConsoleOutput output = Mockito.mock(ConsoleOutput.class);
//
//    @Test
//    public void testImput(){
//        //1. mock programming
//
//        when(input.getNextNumber()).thenReturn(2);
//        doNothing().when(output.print(anyString));
//
//        ArgumentCaptor<String> stringCaptor = ArgumentCaptor.forClass(String.class);
//
//        //2. execute method
//        GuessNumber testGame = new GuessNumber(input, output);
//        testGame.game();
//
//        //3.verify mock
//        Mockito.verify(input, times(1)).getNextNumber().getNextNumber;
//        Mockito.verify(input, times(3)).print(stringCaptor.capture());
//
//        String actual = stringCaptor.getValue();
//        String expected = "Congratulation, you won";
//        assertEquals(expected, actual);
//
//    }
//
//}