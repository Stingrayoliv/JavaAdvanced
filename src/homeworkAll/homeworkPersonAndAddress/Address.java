package homeworkAll.homeworkPersonAndAddress;

/**
 * JavaAdvanced
 * 30.08.20 20: 23
 */
public class Address {
    private String type;
    private String name;

    public Address(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
