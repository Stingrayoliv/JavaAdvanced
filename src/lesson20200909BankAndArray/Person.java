package lesson20200909BankAndArray;

public class Person extends Owner {
    private String firstName="";// чтобы не было null можно тут инициализировать
    private String secondName="";// чтобы не было null можно тут инициализировать

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }


    @Override // этот метод из
    public String getName() {
        return getFirstName()+((getFirstName().isEmpty()) ? "": " ") + getSecondName();
        // через тернатрыный оператор. Если фамили пустой стринг, но не ставить пробел межу именем и
        // фамилией
    }

    @Override
    public String toString() {
        return getName(); // отсылка к getName()
    }
}
