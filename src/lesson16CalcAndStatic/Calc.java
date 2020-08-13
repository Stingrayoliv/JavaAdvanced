package lesson16CalcAndStatic;

/**
 * JavaAdvanced
 * 11.08.20 19: 49
 * калькулятор/ делали на уроке
 */
public class Calc {
    private int a;
    private int b;

    public Calc(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public static int add(int a, int b){// из статического контекста мы не можем обратиться к нестатическому
        return a+b;
    }

    public int add(){
        return a+b;
    }

    public static void main(String[] args) {
        Calc calc = new Calc(10, 20);
        System.out.println(calc.add());

        System.out.println(Calc.add(20, 30));
    }

}
