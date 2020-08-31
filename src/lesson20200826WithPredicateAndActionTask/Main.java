package lesson20200826WithPredicateAndActionTask;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * JavaAdvanced
 * 26.08.20 20: 51
 */
public class Main {
    public static void main(String[] args) {

    }
// Задача: дан лист из стрингов, проверить длину каждого элемента (стринг) на четность. У четных выводить только четные
    //символы, а у нечетных наоборот. Решение только через интерфейсы Predicate и UnaryOperator

    public static List<String> listHandler(List<String> list, Predicate<String> predicate,
                                           UnaryOperator<String>operator) {
        List<String> resList=new ArrayList<>(); // создаем новый лист и его возвращаем
        for (String s: list) {
            if(predicate.test(s)){
                resList.add(operator.apply(s));
            }
        }
        return resList;
    }
}
