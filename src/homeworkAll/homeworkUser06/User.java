package homeworkAll.homeworkUser06;
import java.util.Arrays;

/**
 * JavaAdvanced
 * 08.07.20 17: 42
 */
public class User {
    private String name;
    private String login;
    private char[] password;

    public User(String name, String login, char[] password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public char[] getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (login != null ? !login.equals(user.login) : user.login != null) return false;
        return Arrays.equals(password, user.password);
    }
}
