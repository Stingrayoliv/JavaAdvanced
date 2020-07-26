package lesson07;

/**
 * JavaAdvanced
 * 09.07.20 19: 51
 */
public class Main {
    public static void main(String[] args) {
        User[] users = {
                new User("Name1", "Login1", "pass1"),
                new User("Name2", "Login2", "pass2"),
                new User("Name3", "Login3", "pass3"),
                new User("Name4", "Login4", "pass4"),
                new User("Name5", "Login5", "pass5"),
                new User("Name4", "Login4", "pass4"),
        };
        UserArray userArray = new UserArray(users);
        System.out.println(userArray.findDublUsers());

        userArray.helloUser("Login2", "pass2");
    }


}
