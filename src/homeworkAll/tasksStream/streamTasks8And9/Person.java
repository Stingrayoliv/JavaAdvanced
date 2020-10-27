package homeworkAll.tasksStream.streamTasks8And9;

import java.util.List;

public class Person {
    private String name;
    private List<String> banAccounts;

    public Person(String name, List<String> banAccounts) {
        this.name = name;
        this.banAccounts = banAccounts;
    }

    public String getName() {
        return name;
    }

    public List<String> getBanAccounts() {
        return banAccounts;
    }
}
