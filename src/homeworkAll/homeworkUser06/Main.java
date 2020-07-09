package homeworkAll.homeworkUser06;

/**
 * JavaAdvanced
 * 08.07.20 17: 50
 */
public class Main {
    public static void main(String[] args) {
        User user1 = new User("Sofie", "sm18061978", new char[]{'L', 'o', 'n', 4, 5, 'o', 'n', 1});
        User user2 = new User("Elena", "sm06021970", new char[]{'s', 't', 'M', 3, 1, 'u', 'f', 3});
        User user3 = new User("Oskar", "sm01061967", new char[]{'I', 's', 'q', 'm', 'h', 1, 0, 1});
        User user4 = new User("Daniel", "sm03061988", new char[]{'a', 'S', 'd', 'f', 'l', '-', 4, 1});
        User user5 = new User("Filip", "sm27031969", new char[]{1, 6, 'T', 'R', 5, 'o', 6, 1, 'E'});
        User user6 = new User("Alex", "sm20061973", new char[]{7, 8, 'L', 'O', 'p', 9, 'n', 1});

        User[] users = new User[]{
                user1, user2, user3, user4, user5, user6,
                new User("Andrey", "sm09091967", new char[]{'k', 'R', 'd', 'U', 5, 9, '-', 'e'}),
                new User("David", "sm03091989", new char[]{'I', 'R', 'q', 'a', 'i', 't', 3, 4}),
                new User("David", "sm03091989", new char[]{'I', 'R', 'q', 'a', 'i', 't', 3, 4})
        };

        System.out.println("//----//----//----Show duplicate element in array----//----//----//");
        System.out.println(findDuplicateElement(users));
        System.out.println("//----//----//----//----//----//----//");
        System.out.println("index of an element in an array of objects: " + findIndexInArray(users, user5));
        System.out.println("index of an element in an array of objects: " +
                findIndexInArray(users, new User("David", "sm03091989",
                        new char[]{'I', 'R', 'q', 'a', 'i', 't', 3, 4}))); //
        System.out.println("//----//----//----Greeting----//----//----//");
        makeGreeting(users, user4.getLogin(), user4.getPassword()); // true + greeting
        makeGreeting(users, "sm03091988", new char[]{'I', 'R', 'q', 'k', 'i', 't', 3, 4}); //false +сообщение
        // о неверном пароле, или логине
    }

    // 3. Написать метод, который определяет, есть ли в массиве одинаковые пользователи.
    public static boolean findDuplicateElement(User[] users) {
        //int count = 0;
        for (int i = 0; i < users.length; i++) {
            for (int j = i + 1; j < users.length; j++) {
                // got the duplicate element
                if (users[i].equals(users[j]) && i != j) {
                    return true;
                }
            }
        }
        return false;
    }

    // 4 Написать метод, который ищет заданного пользователя, т.е. принимает пользователя, а
    //возвращает его индекс в массиве.
    public static int findIndexInArray(User[] users, User user) {
        int index = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(user)) {
                index = i;
                break;
            }
        }
        return index;
    }

    // 5 Написать метод, который определит, в качестве параметров принимает логин и пароль, и
    //выводит приветствие соответствующему пользователю
    public static void makeGreeting(User[] users, String login, char[] password) {
        User authorisedUser = null;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getLogin().equals(login) && users[i].getPassword().equals(password)) {
                authorisedUser = users[i];
                break;
            }
        }
        if (authorisedUser instanceof User) {
            System.out.println("Good day, " + authorisedUser.getName() + "!" + " You are authorized.");
        } else {
            System.out.println("Your username or password is incorrect. Try again!");
        }
    }
}
