package homeworkAll.homework10Bank;

/**
 * JavaAdvanced
 * 30.07.20 13: 15
 */
public class Corporate {
    private String name;

    public Corporate(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Corporate{" +
                "name='" + name + '\'' +
                '}';
    }
}
