package lesson07;

/**
 * JavaAdvanced
 * 09.07.20 20: 29
 */
public class UserArray {
    User[] users;

    public UserArray(User[] users) {
        this.users = users;
    }

    // 3. Написать метод, который определяет, есть ли в массиве одинаковые пользователи.
    public boolean findDublUsers() { // метод static, чтобы вызвать из Main
        for (int i = 0; i < users.length; i++) {
            for (int j = i + 1; j < users.length; j++) {
                if (users[i].equals(users[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    public void helloUser(String login, String pass) {
        for (int i = 0; i < users.length; i++) {
            String uLogin = users[i].getLogin();
            String uPass = users[i].getName();
            if (uLogin.equals(login) && uPass.equals(pass)) {
                System.out.println("hello " + users[i].getName());
                return;
            }
        }
        System.out.println("no user with this pass and login");
    }
}
