package moduleSecond.lesson08102020Lamda;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Demo {
    public static void main(String[] args) {
        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        };
        DemoInterface demo = new DemoImpl();
        System.out.println(demo.transform(5));

        String someString = DemoInterface.SOME_STRING; // просто пример с глобальной переменной

        DemoInterface dia = new DemoInterface() {
            @Override
            public String getString(int i) {
                return null;
            }
        };

//        DemoInterface di=(a)->{ // лямда выражение полный пример
//            return String.valueOf(a);
//        };

        DemoInterface di = (a) -> String.valueOf(a);
        Function<String, Integer> f1 = (s) -> s.length();
        Integer hello = f1.apply("hello");
        System.out.println(hello);
        //5->25
        Function<Integer, Integer> f2 = (a) -> a * a;

        //"abc" ->false
        //"aabb" -> true
        Predicate<String> f3 = (s) -> s.length() % 2 == 0;
        System.out.println(f3.test("aaa"));

        Consumer<String> f4 = (s) -> System.out.println(s);

        Supplier<Integer> f5 = () -> (int) (Math.random());
        // метод референс

        Function<Integer, Integer> ff1 = (a) -> a * a;
        doSomeMath(ff1, 10);

        Function<Integer, Integer> ff2 = (a) -> a * 10;
        doSomeMath(ff2, 24);

        Function<Integer, Integer> ff3 = (a) -> a % 2 == 0 ? 1 : -1;
        doSomeMath(ff3, 24);

        Function<String, String> getString = Demo::getString;//1 вариант ссылки на метод
        Function<String, String> getStringL = (s) -> s;// 2 вариант ссылки на метод

    }

    public static String transformString(Function<String, String> f, String s) {
        return f.apply(s);
    }

    public static int doSomeMath(Function<Integer, Integer> f, int a) {
        System.out.println(a);
        return f.apply(a);
    }

    public static String getString(String input) {
        return input;
    }
}
