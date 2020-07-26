package lesson07;

import java.util.Objects;

/**
 * JavaAdvanced
 * 09.07.20 19: 47
 */
public class User {
    private String name;
    private String login;
    private String pass;

    public User(String name, String login, String pass) {
        this.name = name;
        this.login = login;
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // проверка равенства адресов
        if (o == null || getClass() != o.getClass()) return false; //если object из разных классов, то false
        User user = (User) o;
        return name.equals(user.name) && // часть переписанная equals (переписывать не обязательно)
                login.equals(user.login) &&
                Objects.equals(pass, user.pass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, login, pass);
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }
}
