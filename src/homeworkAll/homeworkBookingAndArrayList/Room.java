package Hotel;

/**
 * JavaAdvanced
 * 31.07.20 19: 15
 */
public abstract class Room {
    private String number;
    private int capacity;
    private final double basePrice = 100.0;

    public Room(String number, int capacity) {
        this.number = number;
        this.capacity = capacity;
    }

    public String getNumber() {
        return number;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getBasePrice() {
        return basePrice;
    }

    @Override
    public String toString() {
        return "Room №" + number;
    }

    public abstract double getPrice();
}
