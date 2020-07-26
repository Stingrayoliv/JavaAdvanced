package homeworkAll.homework08;

/**
 * JavaAdvanced
 * 26.07.20 17: 17
 */
public class Room {
    private int number;
    private Type type;
    private String bedPreference;

    public Room(int number, Type type, String bedPreference) {
        this.number = number;
        this.type = type;
        this.bedPreference = bedPreference;
    }

    public int getNumber() {
        return number;
    }

    public Type getType() {
        return type;
    }

    public String getBedPreference() {
        return bedPreference;
    }

    @Override
    public String toString() {
        return "Room" + "number=" + number + ", type=" + type + ", bedPreference='" + bedPreference;
    }
}

