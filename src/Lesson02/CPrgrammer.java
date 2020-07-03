package Lesson02;

/**
 * JavaAdvanced
 * 02.07.20 20: 05
 */
public class CPrgrammer extends Programmer {
    public CPrgrammer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void codeReview() {
        System.out.println("The C code is good");
    }

    //Object ->Employee ->Programmer ->CProgrammer
}
