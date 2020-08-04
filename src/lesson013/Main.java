package lesson013;

/**
 * JavaAdvanced
 * 04.08.20 20: 41
 */
public class Main {
    public static void main(String[] args) {
        Canon5400 p1 = new Canon5400();
        Canon5400 p2 = new Canon5400();
        Xerox8211 p3 = new Xerox8211();

        //p3.print("hello interface");
        printString("hello interface", p3);
    }

    public static void printString(String s, Printer p){
        p.print(s);
    }
}
