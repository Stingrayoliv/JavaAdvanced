package homeworkAll.homeworkPersonAndAddress;

import java.util.function.Function;

/**
 * JavaAdvanced
 * 30.08.20 21: 48
 */
public class OperatorStringWithNameAndEmailType implements Function<Person, String> {
    @Override
    public String apply(Person person) {
        String result = "";
        if (person.getName() != "" || person.getName() != null) {// проверить имя на null или пустой стринг,
            // фамилия проверяется в методе test
            result = person.getName() + " " + person.getSurname() + " " + person.fingEmailType();
        } else {
            result = person.getSurname() + " " + person.fingEmailType();
        }

        return result;
    }
}
