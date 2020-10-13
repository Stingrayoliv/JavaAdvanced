package moduleSecond.lesson08102020Lamda;
@FunctionalInterface
public interface DemoInterface {
    String SOME_STRING="Hello"; //  можно инициализировать только так (глобальная переменная подразумевает
    //public static

    String getString(int i); // абстрактный класс, входной параметр int i
    //String tranfsform(int i);

    default String transform(int i){
        return "Hello World";
    }
}
