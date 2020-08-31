package homeworkAll.homeworkPersonAndAddress;

import java.util.function.Function;

/**
 * JavaAdvanced
 * 30.08.20 21: 48
 */
public class OperatorShowEmail implements Function<Person, String> {
    @Override
    public String apply(Person person) {
        String result = person.getName()+" "+person.getSurname()+" "+person.fingEmailType();
        return result;
    }
}
