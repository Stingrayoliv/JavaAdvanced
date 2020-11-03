package moduleSecond.lesson27102020;

import moduleSecond.lesson27102020.ReturnValue.ReturnValue;

import java.io.Serializable;

public class Demo {
    public static void main(String[] args){
        try {
            String value = transform("abcdeff");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Everything went fine");

        // 2 вариант
//        ReturnValue abcd = transform("abcde");
//        if (!abcd.getStatus().equals("OK")){
//            System.out.println("something went wrong");
//        }else{
//            System.out.println(abcd.getValue());
//        }
    }
    //length =5 -> toUpperCase
    //length !=5 ->throw Exception
    public static String transform(String input) throws Exception{
        // второй вариант
//        if (input.length()==5){
//            return new ReturnValue("OK", input.toUpperCase());
//        }else{
//            return new ReturnValue("FAIL", null);
//        }
        if (input.length()==5){
            return input.toUpperCase();
        }else{
            throw new Exception("Input length is invalid "+input.length());
        }
    }
}
