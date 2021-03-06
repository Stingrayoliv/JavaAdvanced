package homeworkAll.homeworkPersonAndAddressCheck;

/**
 * JavaAdvanced
 * 05.09.20 22: 41
 */
public class Email {
    private String email;
    private String name;
    private String surname;

    public Email(String email, String name, String surname) {
        this.email = email;
        this.name = name;
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return email;
    }
}
