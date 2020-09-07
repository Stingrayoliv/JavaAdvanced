import java.util.Arrays;

/**
 * JavaAdvanced
 * 03.09.20 18: 09
 */
public class NewString {
    public static void main(String[] args) {
        String s = "jhjhjhjhjhjh  @kjkj kj/";
//        String result = s.replaceAll("\\p{Punct}|\\s", "");
//        System.out.println(result);


        System.out.println(Arrays.toString(s.split(" ")));
    }
}

